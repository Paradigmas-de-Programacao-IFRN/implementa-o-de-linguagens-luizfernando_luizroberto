// Generated from ./src/plp/enquanto/parser/Enquanto.g4 by ANTLR 4.13.1
package plp.enquanto.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EnquantoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, BOOLEANO=41, INT=42, ID=43, TEXTO=44, Comentario=45, 
		Espaco=46;
	public static final int
		RULE_programa = 0, RULE_seqComando = 1, RULE_comando = 2, RULE_senaose = 3, 
		RULE_senao = 4, RULE_listaIDs = 5, RULE_listaExps = 6, RULE_caso = 7, 
		RULE_defaultCase = 8, RULE_expressao = 9, RULE_booleano = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seqComando", "comando", "senaose", "senao", "listaIDs", 
			"listaExps", "caso", "defaultCase", "expressao", "booleano"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'skip'", "'se'", "'entao'", "'senao'", "'enquanto'", 
			"'faca'", "'para'", "'de'", "'ate'", "'repita'", "'vezes'", "'exiba'", 
			"'escreva'", "'escolha'", "'{'", "'}'", "'senaose'", "','", "':'", "'_'", 
			"'^'", "'*'", "'/'", "'+'", "'-'", "'leia'", "'('", "')'", "'='", "'<='", 
			"'<'", "'>'", "'>='", "'<>'", "'nao'", "'e'", "'ou'", "'xor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "BOOLEANO", "INT", "ID", "TEXTO", "Comentario", 
			"Espaco"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Enquanto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnquantoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			seqComando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeqComandoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeqComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqComando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSeqComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSeqComando(this);
		}
	}

	public final SeqComandoContext seqComando() throws RecognitionException {
		SeqComandoContext _localctx = new SeqComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seqComando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				comando();
				setState(25);
				match(T__0);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093272728L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ComandoContext {
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
		}
		public ListaExpsContext listaExps() {
			return getRuleContext(ListaExpsContext.class,0);
		}
		public AtribuicaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitAtribuicao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeContext extends ComandoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSe(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExibaContext extends ComandoContext {
		public TerminalNode TEXTO() { return getToken(EnquantoParser.TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExibaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExiba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExiba(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscolhaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public List<CasoContext> caso() {
			return getRuleContexts(CasoContext.class);
		}
		public CasoContext caso(int i) {
			return getRuleContext(CasoContext.class,i);
		}
		public EscolhaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscolha(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ComandoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public EnquantoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEnquanto(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ParaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPara(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepitaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public RepitaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterRepita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitRepita(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ComandoContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public BlocoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBloco(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscrevaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public EscrevaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscreva(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComandoContext {
		public SkipContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSkip(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				listaIDs();
				setState(32);
				match(T__1);
				setState(33);
				listaExps();
				}
				break;
			case T__2:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new SeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(T__3);
				setState(37);
				booleano(0);
				setState(38);
				match(T__4);
				setState(39);
				comando();
				setState(40);
				match(T__5);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093272728L) != 0)) {
					{
					setState(41);
					comando();
					}
				}

				}
				break;
			case T__6:
				_localctx = new EnquantoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__6);
				setState(45);
				booleano(0);
				setState(46);
				match(T__7);
				setState(47);
				comando();
				}
				break;
			case T__8:
				_localctx = new ParaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(T__8);
				setState(50);
				match(ID);
				setState(51);
				match(T__9);
				setState(52);
				expressao(0);
				setState(53);
				match(T__10);
				setState(54);
				expressao(0);
				setState(55);
				match(T__7);
				setState(56);
				comando();
				}
				break;
			case T__11:
				_localctx = new RepitaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				match(T__11);
				setState(59);
				expressao(0);
				setState(60);
				match(T__12);
				setState(61);
				comando();
				}
				break;
			case T__13:
				_localctx = new ExibaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				match(T__13);
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXTO:
					{
					setState(64);
					match(TEXTO);
					}
					break;
				case T__27:
				case T__28:
				case INT:
				case ID:
					{
					setState(65);
					expressao(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__14:
				_localctx = new EscrevaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				match(T__14);
				setState(69);
				expressao(0);
				}
				break;
			case T__15:
				_localctx = new EscolhaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				match(T__15);
				setState(71);
				expressao(0);
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72);
					caso();
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT );
				setState(77);
				defaultCase();
				}
				break;
			case T__16:
				_localctx = new BlocoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				match(T__16);
				setState(80);
				seqComando();
				setState(81);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SenaoseContext extends ParserRuleContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public SenaoseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senaose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSenaose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSenaose(this);
		}
	}

	public final SenaoseContext senaose() throws RecognitionException {
		SenaoseContext _localctx = new SenaoseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_senaose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__18);
			setState(86);
			booleano(0);
			setState(87);
			match(T__4);
			setState(88);
			comando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SenaoContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__5);
			setState(91);
			comando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIDsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EnquantoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EnquantoParser.ID, i);
		}
		public ListaIDsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIDs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterListaIDs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitListaIDs(this);
		}
	}

	public final ListaIDsContext listaIDs() throws RecognitionException {
		ListaIDsContext _localctx = new ListaIDsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listaIDs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(94);
				match(T__19);
				setState(95);
				match(ID);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaExpsContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ListaExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterListaExps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitListaExps(this);
		}
	}

	public final ListaExpsContext listaExps() throws RecognitionException {
		ListaExpsContext _localctx = new ListaExpsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listaExps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			expressao(0);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(102);
				match(T__19);
				setState(103);
				expressao(0);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(EnquantoParser.INT, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitCaso(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(INT);
			setState(110);
			match(T__20);
			setState(111);
			comando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultCaseContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterDefaultCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitDefaultCase(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defaultCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__21);
			setState(114);
			match(T__20);
			setState(115);
			comando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeiaContext extends ExpressaoContext {
		public LeiaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitLeia(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InteiroContext extends ExpressaoContext {
		public TerminalNode INT() { return getToken(EnquantoParser.INT, 0); }
		public InteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitInteiro(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpBinContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpBinContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpBin(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public IdContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParContext extends ExpressaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpParContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExpPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExpPar(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new InteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(118);
				match(INT);
				}
				break;
			case T__27:
				{
				_localctx = new LeiaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(T__27);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(ID);
				}
				break;
			case T__28:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(T__28);
				setState(122);
				expressao(0);
				setState(123);
				match(T__29);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(127);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(128);
						match(T__22);
						setState(129);
						expressao(10);
						}
						break;
					case 2:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(130);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(131);
						match(T__23);
						setState(132);
						expressao(9);
						}
						break;
					case 3:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(133);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(134);
						match(T__24);
						setState(135);
						expressao(8);
						}
						break;
					case 4:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(136);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(137);
						match(T__25);
						setState(138);
						expressao(7);
						}
						break;
					case 5:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(139);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(140);
						match(T__26);
						setState(141);
						expressao(6);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoContext extends ParserRuleContext {
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	 
		public BooleanoContext() { }
		public void copyFrom(BooleanoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends BooleanoContext {
		public TerminalNode BOOLEANO() { return getToken(EnquantoParser.BOOLEANO, 0); }
		public BoolContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBool(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ELogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public ELogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterELogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitELogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorLogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public XorLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterXorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitXorLogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NaoLogicoContext extends BooleanoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public NaoLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterNaoLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitNaoLogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpRelContext extends BooleanoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpRelContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpRel(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolParContext extends BooleanoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BoolParContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBoolPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBoolPar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OuLogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public OuLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOuLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOuLogico(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		return booleano(0);
	}

	private BooleanoContext booleano(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanoContext _localctx = new BooleanoContext(_ctx, _parentState);
		BooleanoContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_booleano, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(148);
				match(BOOLEANO);
				}
				break;
			case 2:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				expressao(0);
				setState(150);
				match(T__30);
				setState(151);
				expressao(0);
				}
				break;
			case 3:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				expressao(0);
				setState(154);
				match(T__31);
				setState(155);
				expressao(0);
				}
				break;
			case 4:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				expressao(0);
				setState(158);
				match(T__32);
				setState(159);
				expressao(0);
				}
				break;
			case 5:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				expressao(0);
				setState(162);
				match(T__33);
				setState(163);
				expressao(0);
				}
				break;
			case 6:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				expressao(0);
				setState(166);
				match(T__34);
				setState(167);
				expressao(0);
				}
				break;
			case 7:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				expressao(0);
				setState(170);
				match(T__35);
				setState(171);
				expressao(0);
				}
				break;
			case 8:
				{
				_localctx = new NaoLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(T__36);
				setState(174);
				booleano(5);
				}
				break;
			case 9:
				{
				_localctx = new BoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(T__28);
				setState(176);
				booleano(0);
				setState(177);
				match(T__29);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ELogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						match(T__37);
						setState(183);
						booleano(5);
						}
						break;
					case 2:
						{
						_localctx = new OuLogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(185);
						match(T__38);
						setState(186);
						booleano(4);
						}
						break;
					case 3:
						{
						_localctx = new XorLogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						match(T__39);
						setState(189);
						booleano(3);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 10:
			return booleano_sempred((BooleanoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean booleano_sempred(BooleanoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001c\b\u0001\u000b\u0001\f"+
		"\u0001\u001d\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002+\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002C\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002J\b\u0002\u000b\u0002\f\u0002K\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002T\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005a\b\u0005\n\u0005\f\u0005d\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006i\b\u0006\n\u0006\f\u0006l\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t~\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u008f\b\t\n"+
		"\t\f\t\u0092\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b4"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00bf\b\n\n\n\f\n\u00c2\t\n\u0001\n\u0000\u0002\u0012\u0014"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000"+
		"\u00da\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000"+
		"\u0000\u0004S\u0001\u0000\u0000\u0000\u0006U\u0001\u0000\u0000\u0000\b"+
		"Z\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000"+
		"\u0000\u000em\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012"+
		"}\u0001\u0000\u0000\u0000\u0014\u00b3\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0003\u0002\u0001\u0000\u0017\u0001\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0003\u0004\u0002\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a\u001c"+
		"\u0001\u0000\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0001\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0003"+
		"\n\u0005\u0000 !\u0005\u0002\u0000\u0000!\"\u0003\f\u0006\u0000\"T\u0001"+
		"\u0000\u0000\u0000#T\u0005\u0003\u0000\u0000$%\u0005\u0004\u0000\u0000"+
		"%&\u0003\u0014\n\u0000&\'\u0005\u0005\u0000\u0000\'(\u0003\u0004\u0002"+
		"\u0000(*\u0005\u0006\u0000\u0000)+\u0003\u0004\u0002\u0000*)\u0001\u0000"+
		"\u0000\u0000*+\u0001\u0000\u0000\u0000+T\u0001\u0000\u0000\u0000,-\u0005"+
		"\u0007\u0000\u0000-.\u0003\u0014\n\u0000./\u0005\b\u0000\u0000/0\u0003"+
		"\u0004\u0002\u00000T\u0001\u0000\u0000\u000012\u0005\t\u0000\u000023\u0005"+
		"+\u0000\u000034\u0005\n\u0000\u000045\u0003\u0012\t\u000056\u0005\u000b"+
		"\u0000\u000067\u0003\u0012\t\u000078\u0005\b\u0000\u000089\u0003\u0004"+
		"\u0002\u00009T\u0001\u0000\u0000\u0000:;\u0005\f\u0000\u0000;<\u0003\u0012"+
		"\t\u0000<=\u0005\r\u0000\u0000=>\u0003\u0004\u0002\u0000>T\u0001\u0000"+
		"\u0000\u0000?B\u0005\u000e\u0000\u0000@C\u0005,\u0000\u0000AC\u0003\u0012"+
		"\t\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CT\u0001\u0000"+
		"\u0000\u0000DE\u0005\u000f\u0000\u0000ET\u0003\u0012\t\u0000FG\u0005\u0010"+
		"\u0000\u0000GI\u0003\u0012\t\u0000HJ\u0003\u000e\u0007\u0000IH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0003\u0010\b\u0000NT\u0001"+
		"\u0000\u0000\u0000OP\u0005\u0011\u0000\u0000PQ\u0003\u0002\u0001\u0000"+
		"QR\u0005\u0012\u0000\u0000RT\u0001\u0000\u0000\u0000S\u001f\u0001\u0000"+
		"\u0000\u0000S#\u0001\u0000\u0000\u0000S$\u0001\u0000\u0000\u0000S,\u0001"+
		"\u0000\u0000\u0000S1\u0001\u0000\u0000\u0000S:\u0001\u0000\u0000\u0000"+
		"S?\u0001\u0000\u0000\u0000SD\u0001\u0000\u0000\u0000SF\u0001\u0000\u0000"+
		"\u0000SO\u0001\u0000\u0000\u0000T\u0005\u0001\u0000\u0000\u0000UV\u0005"+
		"\u0013\u0000\u0000VW\u0003\u0014\n\u0000WX\u0005\u0005\u0000\u0000XY\u0003"+
		"\u0004\u0002\u0000Y\u0007\u0001\u0000\u0000\u0000Z[\u0005\u0006\u0000"+
		"\u0000[\\\u0003\u0004\u0002\u0000\\\t\u0001\u0000\u0000\u0000]b\u0005"+
		"+\u0000\u0000^_\u0005\u0014\u0000\u0000_a\u0005+\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000c\u000b\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000ej\u0003\u0012\t\u0000fg\u0005\u0014\u0000\u0000gi\u0003\u0012\t"+
		"\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000k\r\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000mn\u0005*\u0000\u0000no\u0005\u0015\u0000\u0000op\u0003"+
		"\u0004\u0002\u0000p\u000f\u0001\u0000\u0000\u0000qr\u0005\u0016\u0000"+
		"\u0000rs\u0005\u0015\u0000\u0000st\u0003\u0004\u0002\u0000t\u0011\u0001"+
		"\u0000\u0000\u0000uv\u0006\t\uffff\uffff\u0000v~\u0005*\u0000\u0000w~"+
		"\u0005\u001c\u0000\u0000x~\u0005+\u0000\u0000yz\u0005\u001d\u0000\u0000"+
		"z{\u0003\u0012\t\u0000{|\u0005\u001e\u0000\u0000|~\u0001\u0000\u0000\u0000"+
		"}u\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000"+
		"\u0000}y\u0001\u0000\u0000\u0000~\u0090\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\n\t\u0000\u0000\u0080\u0081\u0005\u0017\u0000\u0000\u0081\u008f"+
		"\u0003\u0012\t\n\u0082\u0083\n\b\u0000\u0000\u0083\u0084\u0005\u0018\u0000"+
		"\u0000\u0084\u008f\u0003\u0012\t\t\u0085\u0086\n\u0007\u0000\u0000\u0086"+
		"\u0087\u0005\u0019\u0000\u0000\u0087\u008f\u0003\u0012\t\b\u0088\u0089"+
		"\n\u0006\u0000\u0000\u0089\u008a\u0005\u001a\u0000\u0000\u008a\u008f\u0003"+
		"\u0012\t\u0007\u008b\u008c\n\u0005\u0000\u0000\u008c\u008d\u0005\u001b"+
		"\u0000\u0000\u008d\u008f\u0003\u0012\t\u0006\u008e\u007f\u0001\u0000\u0000"+
		"\u0000\u008e\u0082\u0001\u0000\u0000\u0000\u008e\u0085\u0001\u0000\u0000"+
		"\u0000\u008e\u0088\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0013\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0006\n\uffff\uffff"+
		"\u0000\u0094\u00b4\u0005)\u0000\u0000\u0095\u0096\u0003\u0012\t\u0000"+
		"\u0096\u0097\u0005\u001f\u0000\u0000\u0097\u0098\u0003\u0012\t\u0000\u0098"+
		"\u00b4\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0012\t\u0000\u009a\u009b"+
		"\u0005 \u0000\u0000\u009b\u009c\u0003\u0012\t\u0000\u009c\u00b4\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0003\u0012\t\u0000\u009e\u009f\u0005!"+
		"\u0000\u0000\u009f\u00a0\u0003\u0012\t\u0000\u00a0\u00b4\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0003\u0012\t\u0000\u00a2\u00a3\u0005\"\u0000\u0000"+
		"\u00a3\u00a4\u0003\u0012\t\u0000\u00a4\u00b4\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0003\u0012\t\u0000\u00a6\u00a7\u0005#\u0000\u0000\u00a7\u00a8"+
		"\u0003\u0012\t\u0000\u00a8\u00b4\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003"+
		"\u0012\t\u0000\u00aa\u00ab\u0005$\u0000\u0000\u00ab\u00ac\u0003\u0012"+
		"\t\u0000\u00ac\u00b4\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005%\u0000"+
		"\u0000\u00ae\u00b4\u0003\u0014\n\u0005\u00af\u00b0\u0005\u001d\u0000\u0000"+
		"\u00b0\u00b1\u0003\u0014\n\u0000\u00b1\u00b2\u0005\u001e\u0000\u0000\u00b2"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b3\u0093\u0001\u0000\u0000\u0000\u00b3"+
		"\u0095\u0001\u0000\u0000\u0000\u00b3\u0099\u0001\u0000\u0000\u0000\u00b3"+
		"\u009d\u0001\u0000\u0000\u0000\u00b3\u00a1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00a5\u0001\u0000\u0000\u0000\u00b3\u00a9\u0001\u0000\u0000\u0000\u00b3"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b3\u00af\u0001\u0000\u0000\u0000\u00b4"+
		"\u00c0\u0001\u0000\u0000\u0000\u00b5\u00b6\n\u0004\u0000\u0000\u00b6\u00b7"+
		"\u0005&\u0000\u0000\u00b7\u00bf\u0003\u0014\n\u0005\u00b8\u00b9\n\u0003"+
		"\u0000\u0000\u00b9\u00ba\u0005\'\u0000\u0000\u00ba\u00bf\u0003\u0014\n"+
		"\u0004\u00bb\u00bc\n\u0002\u0000\u0000\u00bc\u00bd\u0005(\u0000\u0000"+
		"\u00bd\u00bf\u0003\u0014\n\u0003\u00be\u00b5\u0001\u0000\u0000\u0000\u00be"+
		"\u00b8\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u0015\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\r\u001d*BKSbj}\u008e\u0090\u00b3\u00be"+
		"\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}