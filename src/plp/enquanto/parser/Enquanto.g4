grammar Enquanto;

programa : seqComando;     // sequência de comandos

seqComando: (comando ';')+ ;

comando
       : listaIDs ':=' listaExps                               # atribuicao
       | 'skip'                                                # skip
       | 'se' booleano 'entao' comando 'senao' comando?         # se
       | 'enquanto' booleano 'faca' comando                    # enquanto
       | 'para' ID 'de' expressao 'ate' expressao 'faca' comando  # para
       | 'repita' expressao 'vezes' comando                    # repita
       | 'exiba' (TEXTO | expressao)                           # exiba
       | 'escreva' expressao                                   # escreva
       | 'escolha' expressao caso+ defaultCase                 # escolha
       | '{' seqComando '}'                                    # bloco
       ;

senaose: 'senaose' booleano 'entao' comando ;
senao: 'senao' comando ;

listaIDs: ID (',' ID)* ;
listaExps: expressao (',' expressao)* ;

caso: INT ':' comando ;
defaultCase: '_' ':' comando ;

expressao
    : expressao '^' expressao           # opBin
    | expressao '*' expressao           # opBin
    | expressao '/' expressao           # opBin
    | expressao '+' expressao           # opBin
    | expressao '-' expressao           # opBin
    | INT                               # inteiro
    | 'leia'                            # leia
    | ID                                # id
    | '(' expressao ')'                 # expPar
    ;

booleano
    : BOOLEANO                         # bool
    | expressao '=' expressao          # opRel
    | expressao '<=' expressao         # opRel
    | expressao '<' expressao          # opRel
    | expressao '>' expressao          # opRel
    | expressao '>=' expressao         # opRel
    | expressao '<>' expressao         # opRel
    | 'nao' booleano                   # naoLogico
    | booleano 'e' booleano            # eLogico
    | booleano 'ou' booleano           # ouLogico
    | booleano 'xor' booleano          # xorLogico
    | '(' booleano ')'                 # boolPar
    ;


BOOLEANO: 'verdadeiro' | 'falso';
INT: ('0'..'9')+ ;
ID: ('a'..'z')+;
TEXTO: '"' .*? '"';

Comentario: '#' .*? '\n' -> skip;
Espaco: [ \t\n\r] -> skip;