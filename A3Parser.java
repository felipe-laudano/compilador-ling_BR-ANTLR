// Generated from A3.g4 by ANTLR 4.13.0
 
    import java.util.*;
    import java.io.*;
    import java.util.Scanner;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class A3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, CHAR=3, STRING=4, SCANNER=5, LER=6, ESCREVER=7, SOMA=8, 
		SUB=9, DIV=10, MULT=11, INICIO=12, FIM=13, OPREL=14, COMENTARIO=15, OP_ATR=16, 
		WHILE=17, DO=18, PARA=19, SE=20, SENAO=21, AC=22, FC=23, AP=24, FP=25, 
		PV=26, ASPAS=27, ID=28, DG=29, VL=30, TX=31, CH=32, WS=33;
	public static final int
		RULE_start = 0, RULE_bloco = 1, RULE_declaracoes = 2, RULE_declararVar = 3, 
		RULE_atrbVar = 4, RULE_vlatrb = 5, RULE_tipo = 6, RULE_cond = 7, RULE_else = 8, 
		RULE_for = 9, RULE_comp = 10, RULE_pri = 11, RULE_seg = 12, RULE_dowhile = 13, 
		RULE_while = 14, RULE_calc = 15, RULE_membfim = 16, RULE_op = 17, RULE_aritm = 18, 
		RULE_geo = 19, RULE_cont_op = 20, RULE_op_aritm = 21, RULE_op_geo = 22, 
		RULE_ler = 23, RULE_escrever = 24, RULE_texto = 25, RULE_descrito = 26, 
		RULE_scan = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "bloco", "declaracoes", "declararVar", "atrbVar", "vlatrb", 
			"tipo", "cond", "else", "for", "comp", "pri", "seg", "dowhile", "while", 
			"calc", "membfim", "op", "aritm", "geo", "cont_op", "op_aritm", "op_geo", 
			"ler", "escrever", "texto", "descrito", "scan"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'normal'", "'quebrado'", "'letra'", "'ideia'", "'scan'", "'ler'", 
			"'escrever'", "'+'", "'-'", "'/'", "'*'", "'inicio'", "'fim'", null, 
			"'//'", "'='", "'enquanto'", "'faca'", "'para'", "'caso'", "'casonao'", 
			"'{'", "'}'", "'('", "')'", "';'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "CHAR", "STRING", "SCANNER", "LER", "ESCREVER", 
			"SOMA", "SUB", "DIV", "MULT", "INICIO", "FIM", "OPREL", "COMENTARIO", 
			"OP_ATR", "WHILE", "DO", "PARA", "SE", "SENAO", "AC", "FC", "AP", "FP", 
			"PV", "ASPAS", "ID", "DG", "VL", "TX", "CH", "WS"
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
	public String getGrammarFileName() { return "A3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	    ControleVariavel cv = new ControleVariavel();
	    Saida w = new Saida(cv);

	public A3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(A3Parser.INICIO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(A3Parser.FIM, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			w.limpaCodigo();
			w.importacao();
			setState(58);
			match(INICIO);
			w.printInicio();
			setState(60);
			bloco();
			setState(61);
			match(FIM);
			w.printFim();
			setState(63);
			match(PV);
			w.erros();
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
	public static class BlocoContext extends ParserRuleContext {
		public Token AC;
		public Token FC;
		public Token PV;
		public TerminalNode AC() { return getToken(A3Parser.AC, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode FC() { return getToken(A3Parser.FC, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			w.incEsco();
			setState(67);
			((BlocoContext)_localctx).AC = match(AC);
			w.bloco((((BlocoContext)_localctx).AC!=null?((BlocoContext)_localctx).AC.getText():null));
			setState(69);
			declaracoes();
			setState(70);
			((BlocoContext)_localctx).FC = match(FC);
			w.bloco((((BlocoContext)_localctx).FC!=null?((BlocoContext)_localctx).FC.getText():null));
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(72);
				((BlocoContext)_localctx).PV = match(PV);
				}
				break;
			}
			w.bloco((((BlocoContext)_localctx).PV!=null?((BlocoContext)_localctx).PV.getText():null));
			w.decEsco();
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
	public static class DeclaracoesContext extends ParserRuleContext {
		public List<DeclararVarContext> declararVar() {
			return getRuleContexts(DeclararVarContext.class);
		}
		public DeclararVarContext declararVar(int i) {
			return getRuleContext(DeclararVarContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<DowhileContext> dowhile() {
			return getRuleContexts(DowhileContext.class);
		}
		public DowhileContext dowhile(int i) {
			return getRuleContext(DowhileContext.class,i);
		}
		public List<AtrbVarContext> atrbVar() {
			return getRuleContexts(AtrbVarContext.class);
		}
		public AtrbVarContext atrbVar(int i) {
			return getRuleContext(AtrbVarContext.class,i);
		}
		public List<WhileContext> while_() {
			return getRuleContexts(WhileContext.class);
		}
		public WhileContext while_(int i) {
			return getRuleContext(WhileContext.class,i);
		}
		public List<ForContext> for_() {
			return getRuleContexts(ForContext.class);
		}
		public ForContext for_(int i) {
			return getRuleContext(ForContext.class,i);
		}
		public List<LerContext> ler() {
			return getRuleContexts(LerContext.class);
		}
		public LerContext ler(int i) {
			return getRuleContext(LerContext.class,i);
		}
		public List<EscreverContext> escrever() {
			return getRuleContexts(EscreverContext.class);
		}
		public EscreverContext escrever(int i) {
			return getRuleContext(EscreverContext.class,i);
		}
		public List<ScanContext> scan() {
			return getRuleContexts(ScanContext.class);
		}
		public ScanContext scan(int i) {
			return getRuleContext(ScanContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274596094L) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case FLOAT:
				case CHAR:
				case STRING:
					{
					setState(78);
					declararVar();
					}
					break;
				case AC:
					{
					setState(79);
					bloco();
					}
					break;
				case SE:
					{
					setState(80);
					cond();
					}
					break;
				case DO:
					{
					setState(81);
					dowhile();
					}
					break;
				case ID:
					{
					setState(82);
					atrbVar();
					}
					break;
				case WHILE:
					{
					setState(83);
					while_();
					}
					break;
				case PARA:
					{
					setState(84);
					for_();
					}
					break;
				case LER:
					{
					setState(85);
					ler();
					}
					break;
				case ESCREVER:
					{
					setState(86);
					escrever();
					}
					break;
				case SCANNER:
					{
					setState(87);
					scan();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
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
	public static class DeclararVarContext extends ParserRuleContext {
		public TipoContext tipo;
		public Token ID;
		public VlatrbContext vlatrb;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public TerminalNode OP_ATR() { return getToken(A3Parser.OP_ATR, 0); }
		public VlatrbContext vlatrb() {
			return getRuleContext(VlatrbContext.class,0);
		}
		public DeclararVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterDeclararVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitDeclararVar(this);
		}
	}

	public final DeclararVarContext declararVar() throws RecognitionException {
		DeclararVarContext _localctx = new DeclararVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declararVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((DeclararVarContext)_localctx).tipo = tipo();
			setState(94);
			((DeclararVarContext)_localctx).ID = match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ATR) {
				{
				setState(95);
				match(OP_ATR);
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7264534528L) != 0)) {
				{
				setState(98);
				((DeclararVarContext)_localctx).vlatrb = vlatrb();
				}
			}

			setState(101);
			match(PV);
			w.variavel((((DeclararVarContext)_localctx).ID!=null?((DeclararVarContext)_localctx).ID.getText():null), (((DeclararVarContext)_localctx).tipo!=null?_input.getText(((DeclararVarContext)_localctx).tipo.start,((DeclararVarContext)_localctx).tipo.stop):null), (((DeclararVarContext)_localctx).vlatrb!=null?_input.getText(((DeclararVarContext)_localctx).vlatrb.start,((DeclararVarContext)_localctx).vlatrb.stop):null));
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
	public static class AtrbVarContext extends ParserRuleContext {
		public Token ID;
		public VlatrbContext vlatrb;
		public Token PV;
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode OP_ATR() { return getToken(A3Parser.OP_ATR, 0); }
		public VlatrbContext vlatrb() {
			return getRuleContext(VlatrbContext.class,0);
		}
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public AtrbVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrbVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterAtrbVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitAtrbVar(this);
		}
	}

	public final AtrbVarContext atrbVar() throws RecognitionException {
		AtrbVarContext _localctx = new AtrbVarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atrbVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((AtrbVarContext)_localctx).ID = match(ID);
			setState(105);
			match(OP_ATR);
			setState(106);
			((AtrbVarContext)_localctx).vlatrb = vlatrb();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(107);
				((AtrbVarContext)_localctx).PV = match(PV);
				}
			}

			w.atrbVar((((AtrbVarContext)_localctx).ID!=null?((AtrbVarContext)_localctx).ID.getText():null), (((AtrbVarContext)_localctx).vlatrb!=null?_input.getText(((AtrbVarContext)_localctx).vlatrb.start,((AtrbVarContext)_localctx).vlatrb.stop):null), (((AtrbVarContext)_localctx).PV!=null?((AtrbVarContext)_localctx).PV.getText():null));
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
	public static class VlatrbContext extends ParserRuleContext {
		public TerminalNode CH() { return getToken(A3Parser.CH, 0); }
		public TerminalNode TX() { return getToken(A3Parser.TX, 0); }
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public VlatrbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vlatrb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterVlatrb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitVlatrb(this);
		}
	}

	public final VlatrbContext vlatrb() throws RecognitionException {
		VlatrbContext _localctx = new VlatrbContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vlatrb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(112);
				match(CH);
				}
				break;
			case 2:
				{
				setState(113);
				match(TX);
				}
				break;
			case 3:
				{
				setState(114);
				pri();
				}
				break;
			case 4:
				{
				setState(115);
				calc();
				}
				break;
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(A3Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(A3Parser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(A3Parser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(A3Parser.STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class CondContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(A3Parser.SE, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(SE);
			setState(121);
			match(AP);
			setState(122);
			comp();
			setState(123);
			match(FP);
			w.se();
			setState(125);
			bloco();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(126);
				else_();
				}
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
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(A3Parser.SENAO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(SENAO);
			w.senao();
			setState(131);
			bloco();
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
	public static class ForContext extends ParserRuleContext {
		public Token FP;
		public TerminalNode PARA() { return getToken(A3Parser.PARA, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public DeclararVarContext declararVar() {
			return getRuleContext(DeclararVarContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public AtrbVarContext atrbVar() {
			return getRuleContext(AtrbVarContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(PARA);
			setState(134);
			match(AP);
			w.para();
			setState(136);
			declararVar();
			setState(137);
			comp();
			setState(138);
			atrbVar();
			setState(139);
			((ForContext)_localctx).FP = match(FP);
			w.fechaCond((((ForContext)_localctx).FP!=null?((ForContext)_localctx).FP.getText():null));
			setState(141);
			bloco();
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
	public static class CompContext extends ParserRuleContext {
		public PriContext pri;
		public Token OPREL;
		public SegContext seg;
		public Token PV;
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public TerminalNode OPREL() { return getToken(A3Parser.OPREL, 0); }
		public SegContext seg() {
			return getRuleContext(SegContext.class,0);
		}
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((CompContext)_localctx).pri = pri();
			setState(144);
			((CompContext)_localctx).OPREL = match(OPREL);
			setState(145);
			((CompContext)_localctx).seg = seg();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(146);
				((CompContext)_localctx).PV = match(PV);
				}
			}

			w.comp((((CompContext)_localctx).pri!=null?_input.getText(((CompContext)_localctx).pri.start,((CompContext)_localctx).pri.stop):null), (((CompContext)_localctx).OPREL!=null?((CompContext)_localctx).OPREL.getText():null), (((CompContext)_localctx).seg!=null?_input.getText(((CompContext)_localctx).seg.start,((CompContext)_localctx).seg.stop):null), (((CompContext)_localctx).PV!=null?((CompContext)_localctx).PV.getText():null));
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
	public static class PriContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode DG() { return getToken(A3Parser.DG, 0); }
		public PriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterPri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitPri(this);
		}
	}

	public final PriContext pri() throws RecognitionException {
		PriContext _localctx = new PriContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==DG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class SegContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode DG() { return getToken(A3Parser.DG, 0); }
		public SegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterSeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitSeg(this);
		}
	}

	public final SegContext seg() throws RecognitionException {
		SegContext _localctx = new SegContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_seg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==DG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class DowhileContext extends ParserRuleContext {
		public Token PV;
		public TerminalNode DO() { return getToken(A3Parser.DO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(A3Parser.WHILE, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitDowhile(this);
		}
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(DO);
			w.faca();
			setState(157);
			bloco();
			setState(158);
			match(WHILE);
			setState(159);
			match(AP);
			setState(160);
			comp();
			setState(161);
			match(FP);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(162);
				((DowhileContext)_localctx).PV = match(PV);
				}
			}

			w.enquanto();
			w.fechaCond((((DowhileContext)_localctx).PV!=null?((DowhileContext)_localctx).PV.getText():null));
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
	public static class WhileContext extends ParserRuleContext {
		public Token PV;
		public TerminalNode WHILE() { return getToken(A3Parser.WHILE, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(WHILE);
			setState(169);
			match(AP);
			setState(170);
			comp();
			setState(171);
			match(FP);
			w.enquanto();
			setState(173);
			bloco();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PV) {
				{
				setState(174);
				((WhileContext)_localctx).PV = match(PV);
				}
			}

			w.fechaCond((((WhileContext)_localctx).PV!=null?((WhileContext)_localctx).PV.getText():null));
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
	public static class CalcContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public MembfimContext membfim() {
			return getRuleContext(MembfimContext.class,0);
		}
		public Cont_opContext cont_op() {
			return getRuleContext(Cont_opContext.class,0);
		}
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitCalc(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			op();
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(180);
				membfim();
				}
				break;
			case 2:
				{
				setState(181);
				cont_op();
				}
				break;
			case 3:
				{
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(182);
					match(PV);
					}
					break;
				}
				}
				break;
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
	public static class MembfimContext extends ParserRuleContext {
		public PriContext pri;
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public MembfimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membfim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterMembfim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitMembfim(this);
		}
	}

	public final MembfimContext membfim() throws RecognitionException {
		MembfimContext _localctx = new MembfimContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_membfim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(187);
				((MembfimContext)_localctx).pri = pri();
				}
				break;
			case 2:
				{
				setState(188);
				calc();
				}
				break;
			}
			w.coletaOp((((MembfimContext)_localctx).pri!=null?_input.getText(((MembfimContext)_localctx).pri.start,((MembfimContext)_localctx).pri.stop):null));
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
	public static class OpContext extends ParserRuleContext {
		public AritmContext aritm() {
			return getRuleContext(AritmContext.class,0);
		}
		public GeoContext geo() {
			return getRuleContext(GeoContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case DG:
				{
				setState(193);
				aritm();
				}
				break;
			case AP:
				{
				setState(194);
				geo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class AritmContext extends ParserRuleContext {
		public PriContext pri;
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public Op_aritmContext op_aritm() {
			return getRuleContext(Op_aritmContext.class,0);
		}
		public AritmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterAritm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitAritm(this);
		}
	}

	public final AritmContext aritm() throws RecognitionException {
		AritmContext _localctx = new AritmContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_aritm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			((AritmContext)_localctx).pri = pri();
			setState(198);
			op_aritm();
			w.coletaOp((((AritmContext)_localctx).pri!=null?_input.getText(((AritmContext)_localctx).pri.start,((AritmContext)_localctx).pri.stop):null));
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
	public static class GeoContext extends ParserRuleContext {
		public PriContext pri;
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public Op_geoContext op_geo() {
			return getRuleContext(Op_geoContext.class,0);
		}
		public MembfimContext membfim() {
			return getRuleContext(MembfimContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public GeoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterGeo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitGeo(this);
		}
	}

	public final GeoContext geo() throws RecognitionException {
		GeoContext _localctx = new GeoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_geo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(AP);
			setState(202);
			((GeoContext)_localctx).pri = pri();
			setState(203);
			op_geo();
			setState(204);
			membfim();
			setState(205);
			match(FP);
			w.coletaOp((((GeoContext)_localctx).pri!=null?_input.getText(((GeoContext)_localctx).pri.start,((GeoContext)_localctx).pri.stop):null));
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
	public static class Cont_opContext extends ParserRuleContext {
		public Op_aritmContext op_aritm() {
			return getRuleContext(Op_aritmContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public Cont_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterCont_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitCont_op(this);
		}
	}

	public final Cont_opContext cont_op() throws RecognitionException {
		Cont_opContext _localctx = new Cont_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cont_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			op_aritm();
			setState(209);
			calc();
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
	public static class Op_aritmContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(A3Parser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(A3Parser.SUB, 0); }
		public Op_aritmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_aritm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterOp_aritm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitOp_aritm(this);
		}
	}

	public final Op_aritmContext op_aritm() throws RecognitionException {
		Op_aritmContext _localctx = new Op_aritmContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_op_aritm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Op_geoContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(A3Parser.DIV, 0); }
		public TerminalNode MULT() { return getToken(A3Parser.MULT, 0); }
		public Op_geoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_geo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterOp_geo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitOp_geo(this);
		}
	}

	public final Op_geoContext op_geo() throws RecognitionException {
		Op_geoContext _localctx = new Op_geoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_op_geo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==DIV || _la==MULT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class LerContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode LER() { return getToken(A3Parser.LER, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public TerminalNode ID() { return getToken(A3Parser.ID, 0); }
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterLer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitLer(this);
		}
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LER);
			setState(216);
			match(AP);
			setState(217);
			((LerContext)_localctx).ID = match(ID);
			setState(218);
			match(FP);
			setState(219);
			match(PV);
			w.ler((((LerContext)_localctx).ID!=null?((LerContext)_localctx).ID.getText():null));
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
	public static class EscreverContext extends ParserRuleContext {
		public TextoContext texto;
		public TerminalNode ESCREVER() { return getToken(A3Parser.ESCREVER, 0); }
		public TerminalNode AP() { return getToken(A3Parser.AP, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode FP() { return getToken(A3Parser.FP, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public EscreverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterEscrever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitEscrever(this);
		}
	}

	public final EscreverContext escrever() throws RecognitionException {
		EscreverContext _localctx = new EscreverContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_escrever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ESCREVER);
			setState(223);
			match(AP);
			setState(224);
			((EscreverContext)_localctx).texto = texto();
			setState(225);
			match(FP);
			setState(226);
			match(PV);
			w.escreve((((EscreverContext)_localctx).texto!=null?_input.getText(((EscreverContext)_localctx).texto.start,((EscreverContext)_localctx).texto.stop):null));
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
	public static class TextoContext extends ParserRuleContext {
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public DescritoContext descrito() {
			return getRuleContext(DescritoContext.class,0);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case DG:
				{
				setState(229);
				pri();
				}
				break;
			case TX:
				{
				setState(230);
				descrito();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class DescritoContext extends ParserRuleContext {
		public TerminalNode TX() { return getToken(A3Parser.TX, 0); }
		public DescritoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descrito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterDescrito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitDescrito(this);
		}
	}

	public final DescritoContext descrito() throws RecognitionException {
		DescritoContext _localctx = new DescritoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_descrito);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(TX);
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
	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCANNER() { return getToken(A3Parser.SCANNER, 0); }
		public TerminalNode PV() { return getToken(A3Parser.PV, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof A3Listener ) ((A3Listener)listener).exitScan(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(SCANNER);
			setState(236);
			match(PV);
			w.scan();
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

	public static final String _serializedATN =
		"\u0004\u0001!\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"J\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002Y\b\u0002\n\u0002\f\u0002\\\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003a\b\u0003\u0001\u0003"+
		"\u0003\u0003d\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004m\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"u\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0080\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0094\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00a4\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b0\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00b8\b\u000f\u0003\u000f\u00ba\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00be\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00c4\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u00e8\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0246\u0000\u0004\u0001\u0000\u0001\u0004\u0001\u0000\u001c\u001d"+
		"\u0001\u0000\b\t\u0001\u0000\n\u000b\u00ee\u00008\u0001\u0000\u0000\u0000"+
		"\u0002B\u0001\u0000\u0000\u0000\u0004Z\u0001\u0000\u0000\u0000\u0006]"+
		"\u0001\u0000\u0000\u0000\bh\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000"+
		"\u0000\fv\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010"+
		"\u0081\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000\u0000\u0014"+
		"\u008f\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018"+
		"\u0099\u0001\u0000\u0000\u0000\u001a\u009b\u0001\u0000\u0000\u0000\u001c"+
		"\u00a8\u0001\u0000\u0000\u0000\u001e\u00b3\u0001\u0000\u0000\u0000 \u00bd"+
		"\u0001\u0000\u0000\u0000\"\u00c3\u0001\u0000\u0000\u0000$\u00c5\u0001"+
		"\u0000\u0000\u0000&\u00c9\u0001\u0000\u0000\u0000(\u00d0\u0001\u0000\u0000"+
		"\u0000*\u00d3\u0001\u0000\u0000\u0000,\u00d5\u0001\u0000\u0000\u0000."+
		"\u00d7\u0001\u0000\u0000\u00000\u00de\u0001\u0000\u0000\u00002\u00e7\u0001"+
		"\u0000\u0000\u00004\u00e9\u0001\u0000\u0000\u00006\u00eb\u0001\u0000\u0000"+
		"\u000089\u0006\u0000\uffff\uffff\u00009:\u0006\u0000\uffff\uffff\u0000"+
		":;\u0005\f\u0000\u0000;<\u0006\u0000\uffff\uffff\u0000<=\u0003\u0002\u0001"+
		"\u0000=>\u0005\r\u0000\u0000>?\u0006\u0000\uffff\uffff\u0000?@\u0005\u001a"+
		"\u0000\u0000@A\u0006\u0000\uffff\uffff\u0000A\u0001\u0001\u0000\u0000"+
		"\u0000BC\u0006\u0001\uffff\uffff\u0000CD\u0005\u0016\u0000\u0000DE\u0006"+
		"\u0001\uffff\uffff\u0000EF\u0003\u0004\u0002\u0000FG\u0005\u0017\u0000"+
		"\u0000GI\u0006\u0001\uffff\uffff\u0000HJ\u0005\u001a\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KL\u0006\u0001\uffff\uffff\u0000LM\u0006\u0001\uffff\uffff\u0000M\u0003"+
		"\u0001\u0000\u0000\u0000NY\u0003\u0006\u0003\u0000OY\u0003\u0002\u0001"+
		"\u0000PY\u0003\u000e\u0007\u0000QY\u0003\u001a\r\u0000RY\u0003\b\u0004"+
		"\u0000SY\u0003\u001c\u000e\u0000TY\u0003\u0012\t\u0000UY\u0003.\u0017"+
		"\u0000VY\u00030\u0018\u0000WY\u00036\u001b\u0000XN\u0001\u0000\u0000\u0000"+
		"XO\u0001\u0000\u0000\u0000XP\u0001\u0000\u0000\u0000XQ\u0001\u0000\u0000"+
		"\u0000XR\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000XT\u0001\u0000"+
		"\u0000\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001"+
		"\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[\u0005\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000]^\u0003\f\u0006\u0000^`\u0005\u001c\u0000\u0000_a\u0005\u0010"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001"+
		"\u0000\u0000\u0000bd\u0003\n\u0005\u0000cb\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005\u001a\u0000\u0000"+
		"fg\u0006\u0003\uffff\uffff\u0000g\u0007\u0001\u0000\u0000\u0000hi\u0005"+
		"\u001c\u0000\u0000ij\u0005\u0010\u0000\u0000jl\u0003\n\u0005\u0000km\u0005"+
		"\u001a\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0006\u0004\uffff\uffff\u0000o\t\u0001\u0000"+
		"\u0000\u0000pu\u0005 \u0000\u0000qu\u0005\u001f\u0000\u0000ru\u0003\u0016"+
		"\u000b\u0000su\u0003\u001e\u000f\u0000tp\u0001\u0000\u0000\u0000tq\u0001"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000"+
		"u\u000b\u0001\u0000\u0000\u0000vw\u0007\u0000\u0000\u0000w\r\u0001\u0000"+
		"\u0000\u0000xy\u0005\u0014\u0000\u0000yz\u0005\u0018\u0000\u0000z{\u0003"+
		"\u0014\n\u0000{|\u0005\u0019\u0000\u0000|}\u0006\u0007\uffff\uffff\u0000"+
		"}\u007f\u0003\u0002\u0001\u0000~\u0080\u0003\u0010\b\u0000\u007f~\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u000f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\u0015\u0000\u0000\u0082\u0083\u0006"+
		"\b\uffff\uffff\u0000\u0083\u0084\u0003\u0002\u0001\u0000\u0084\u0011\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u0013\u0000\u0000\u0086\u0087\u0005"+
		"\u0018\u0000\u0000\u0087\u0088\u0006\t\uffff\uffff\u0000\u0088\u0089\u0003"+
		"\u0006\u0003\u0000\u0089\u008a\u0003\u0014\n\u0000\u008a\u008b\u0003\b"+
		"\u0004\u0000\u008b\u008c\u0005\u0019\u0000\u0000\u008c\u008d\u0006\t\uffff"+
		"\uffff\u0000\u008d\u008e\u0003\u0002\u0001\u0000\u008e\u0013\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0003\u0016\u000b\u0000\u0090\u0091\u0005\u000e"+
		"\u0000\u0000\u0091\u0093\u0003\u0018\f\u0000\u0092\u0094\u0005\u001a\u0000"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\n\uffff\uffff"+
		"\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u0098\u0007\u0001\u0000"+
		"\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0001\u0000"+
		"\u0000\u009a\u0019\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0012\u0000"+
		"\u0000\u009c\u009d\u0006\r\uffff\uffff\u0000\u009d\u009e\u0003\u0002\u0001"+
		"\u0000\u009e\u009f\u0005\u0011\u0000\u0000\u009f\u00a0\u0005\u0018\u0000"+
		"\u0000\u00a0\u00a1\u0003\u0014\n\u0000\u00a1\u00a3\u0005\u0019\u0000\u0000"+
		"\u00a2\u00a4\u0005\u001a\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0006\r\uffff\uffff\u0000\u00a6\u00a7\u0006\r\uffff\uffff"+
		"\u0000\u00a7\u001b\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0011\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0018\u0000\u0000\u00aa\u00ab\u0003\u0014\n\u0000"+
		"\u00ab\u00ac\u0005\u0019\u0000\u0000\u00ac\u00ad\u0006\u000e\uffff\uffff"+
		"\u0000\u00ad\u00af\u0003\u0002\u0001\u0000\u00ae\u00b0\u0005\u001a\u0000"+
		"\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0006\u000e\uffff"+
		"\uffff\u0000\u00b2\u001d\u0001\u0000\u0000\u0000\u00b3\u00b9\u0003\"\u0011"+
		"\u0000\u00b4\u00ba\u0003 \u0010\u0000\u00b5\u00ba\u0003(\u0014\u0000\u00b6"+
		"\u00b8\u0005\u001a\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba\u001f\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0003\u0016\u000b\u0000\u00bc\u00be\u0003\u001e\u000f\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0006\u0010\uffff\uffff\u0000"+
		"\u00c0!\u0001\u0000\u0000\u0000\u00c1\u00c4\u0003$\u0012\u0000\u00c2\u00c4"+
		"\u0003&\u0013\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4#\u0001\u0000\u0000\u0000\u00c5\u00c6\u0003\u0016"+
		"\u000b\u0000\u00c6\u00c7\u0003*\u0015\u0000\u00c7\u00c8\u0006\u0012\uffff"+
		"\uffff\u0000\u00c8%\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0018\u0000"+
		"\u0000\u00ca\u00cb\u0003\u0016\u000b\u0000\u00cb\u00cc\u0003,\u0016\u0000"+
		"\u00cc\u00cd\u0003 \u0010\u0000\u00cd\u00ce\u0005\u0019\u0000\u0000\u00ce"+
		"\u00cf\u0006\u0013\uffff\uffff\u0000\u00cf\'\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0003*\u0015\u0000\u00d1\u00d2\u0003\u001e\u000f\u0000\u00d2)\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0007\u0002\u0000\u0000\u00d4+\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0007\u0003\u0000\u0000\u00d6-\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005\u0006\u0000\u0000\u00d8\u00d9\u0005\u0018\u0000"+
		"\u0000\u00d9\u00da\u0005\u001c\u0000\u0000\u00da\u00db\u0005\u0019\u0000"+
		"\u0000\u00db\u00dc\u0005\u001a\u0000\u0000\u00dc\u00dd\u0006\u0017\uffff"+
		"\uffff\u0000\u00dd/\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0007\u0000"+
		"\u0000\u00df\u00e0\u0005\u0018\u0000\u0000\u00e0\u00e1\u00032\u0019\u0000"+
		"\u00e1\u00e2\u0005\u0019\u0000\u0000\u00e2\u00e3\u0005\u001a\u0000\u0000"+
		"\u00e3\u00e4\u0006\u0018\uffff\uffff\u0000\u00e41\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e8\u0003\u0016\u000b\u0000\u00e6\u00e8\u00034\u001a\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"3\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001f\u0000\u0000\u00ea5\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005\u0005\u0000\u0000\u00ec\u00ed\u0005"+
		"\u001a\u0000\u0000\u00ed\u00ee\u0006\u001b\uffff\uffff\u0000\u00ee7\u0001"+
		"\u0000\u0000\u0000\u0010IXZ`clt\u007f\u0093\u00a3\u00af\u00b7\u00b9\u00bd"+
		"\u00c3\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}