// Generated from C:/Users/Ahmed/Desktop/CompilersSemesterProject/COOL PROJECT/grammar\Parse.g4 by ANTLR 4.7.2

	import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Parse extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, CASE_ARROW=2, LPAREN=3, RPAREN=4, COMMA=5, ADD=6, MINUS=7, 
		MULTIPLY=8, DIVISION=9, TILDE=10, LESS_THAN=11, LESS_EQUAL=12, EQUAL=13, 
		LBRACE=14, RBRACE=15, DOT=16, ASSIGNMENT=17, ATSYM=18, COLON=19, CASE=20, 
		ESAC=21, IF=22, FI=23, WHILE=24, THEN=25, ELSE=26, LOOP=27, POOL=28, CLASS=29, 
		IN=30, INHERITS=31, OF=32, LET=33, NEW=34, ISVOID=35, NOT=36, BOOL_CONST=37, 
		INT=38, TYPEID=39, OBJECTID=40, STRING=41, WS=42, INVALID=43;
	public static final int
		RULE_program = 0, RULE_programBlocks = 1, RULE_classDefine = 2, RULE_feature = 3, 
		RULE_formal = 4, RULE_expression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programBlocks", "classDefine", "feature", "formal", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'=>'", "'('", "')'", "','", "'+'", "'-'", "'*'", "'/'", 
			"'~'", "'<'", "'<='", "'='", "'{'", "'}'", "'.'", "'<-'", "'@'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "CASE_ARROW", "LPAREN", "RPAREN", "COMMA", "ADD", 
			"MINUS", "MULTIPLY", "DIVISION", "TILDE", "LESS_THAN", "LESS_EQUAL", 
			"EQUAL", "LBRACE", "RBRACE", "DOT", "ASSIGNMENT", "ATSYM", "COLON", "CASE", 
			"ESAC", "IF", "FI", "WHILE", "THEN", "ELSE", "LOOP", "POOL", "CLASS", 
			"IN", "INHERITS", "OF", "LET", "NEW", "ISVOID", "NOT", "BOOL_CONST", 
			"INT", "TYPEID", "OBJECTID", "STRING", "WS", "INVALID"
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
	public String getGrammarFileName() { return "Parse.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parse(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public AST.program value;
		public ProgramBlocksContext pb;
		public TerminalNode EOF() { return getToken(Parse.EOF, 0); }
		public ProgramBlocksContext programBlocks() {
			return getRuleContext(ProgramBlocksContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((ProgramContext)_localctx).pb = programBlocks();
			setState(13);
			match(EOF);

					((ProgramContext)_localctx).value =  new AST.program(((ProgramContext)_localctx).pb.value);
				
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

	public static class ProgramBlocksContext extends ParserRuleContext {
		public ArrayList<AST.class_> value;
		public ProgramBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlocks; }
	 
		public ProgramBlocksContext() { }
		public void copyFrom(ProgramBlocksContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ClassesContext extends ProgramBlocksContext {
		public ClassDefineContext c;
		public List<TerminalNode> SEMICOLON() { return getTokens(Parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parse.SEMICOLON, i);
		}
		public List<ClassDefineContext> classDefine() {
			return getRuleContexts(ClassDefineContext.class);
		}
		public ClassDefineContext classDefine(int i) {
			return getRuleContext(ClassDefineContext.class,i);
		}
		public ClassesContext(ProgramBlocksContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitClasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitClasses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBlocksContext programBlocks() throws RecognitionException {
		ProgramBlocksContext _localctx = new ProgramBlocksContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlocks);

		    	((ProgramBlocksContext)_localctx).value =  new ArrayList<AST.class_>();
		    
		int _la;
		try {
			_localctx = new ClassesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				((ClassesContext)_localctx).c = classDefine();
				setState(17);
				match(SEMICOLON);
				_localctx.value.add(((ClassesContext)_localctx).c.value); System.out.println("list " + ((ClassesContext)_localctx).c.value.getString(" "));
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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

	public static class ClassDefineContext extends ParserRuleContext {
		public AST.class_ value;
		public TerminalNode CLASS() { return getToken(Parse.CLASS, 0); }
		public List<TerminalNode> TYPEID() { return getTokens(Parse.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(Parse.TYPEID, i);
		}
		public TerminalNode LBRACE() { return getToken(Parse.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parse.RBRACE, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parse.SEMICOLON, i);
		}
		public TerminalNode INHERITS() { return getToken(Parse.INHERITS, 0); }
		public ClassDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterClassDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitClassDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitClassDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDefine);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(CLASS);
				setState(25);
				match(TYPEID);
				setState(26);
				match(LBRACE);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OBJECTID) {
					{
					{
					setState(27);
					feature();
					setState(28);
					match(SEMICOLON);
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(35);
				match(RBRACE);

				        ((ClassDefineContext)_localctx).value =  new AST.class_();
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(CLASS);
				setState(38);
				match(TYPEID);
				setState(39);
				match(INHERITS);
				setState(40);
				match(TYPEID);
				setState(41);
				match(LBRACE);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OBJECTID) {
					{
					{
					setState(42);
					feature();
					setState(43);
					match(SEMICOLON);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(50);
				match(RBRACE);

				        ((ClassDefineContext)_localctx).value =  new AST.class_();
				    
				}
				break;
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodContext extends FeatureContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(Parse.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parse.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(Parse.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public TerminalNode LBRACE() { return getToken(Parse.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parse.RBRACE, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parse.COMMA, i);
		}
		public MethodContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PropertyContext extends FeatureContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(Parse.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(Parse.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_feature);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(OBJECTID);
				setState(55);
				match(LPAREN);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OBJECTID) {
					{
					{
					setState(56);
					formal();
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(57);
						match(COMMA);
						setState(58);
						formal();
						}
						}
						setState(63);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(RPAREN);
				setState(70);
				match(COLON);
				setState(71);
				match(TYPEID);
				setState(72);
				match(LBRACE);
				setState(73);
				expression(0);
				setState(74);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new PropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(OBJECTID);
				setState(77);
				match(COLON);
				setState(78);
				match(TYPEID);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(79);
					match(ASSIGNMENT);
					setState(80);
					expression(0);
					}
				}

				}
				break;
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

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(Parse.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(OBJECTID);
			setState(86);
			match(COLON);
			setState(87);
			match(TYPEID);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(Parse.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetInContext extends ExpressionContext {
		public TerminalNode LET() { return getToken(Parse.LET, 0); }
		public List<TerminalNode> OBJECTID() { return getTokens(Parse.OBJECTID); }
		public TerminalNode OBJECTID(int i) {
			return getToken(Parse.OBJECTID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parse.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parse.COLON, i);
		}
		public List<TerminalNode> TYPEID() { return getTokens(Parse.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(Parse.TYPEID, i);
		}
		public TerminalNode IN() { return getToken(Parse.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ASSIGNMENT() { return getTokens(Parse.ASSIGNMENT); }
		public TerminalNode ASSIGNMENT(int i) {
			return getToken(Parse.ASSIGNMENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parse.COMMA, i);
		}
		public LetInContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterLetIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitLetIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitLetIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(Parse.NEW, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public NewContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(Parse.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parse.RPAREN, 0); }
		public ParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(Parse.MINUS, 0); }
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueOrFlaseContext extends ExpressionContext {
		public TerminalNode BOOL_CONST() { return getToken(Parse.BOOL_CONST, 0); }
		public TrueOrFlaseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterTrueOrFlase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitTrueOrFlase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitTrueOrFlase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(Parse.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidContext extends ExpressionContext {
		public TerminalNode ISVOID() { return getToken(Parse.ISVOID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IsvoidContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExpressionContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(Parse.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExpressionContext {
		public TerminalNode WHILE() { return getToken(Parse.WHILE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(Parse.LOOP, 0); }
		public TerminalNode POOL() { return getToken(Parse.POOL, 0); }
		public WhileContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(Parse.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(Parse.DIVISION, 0); }
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(Parse.EQUAL, 0); }
		public EqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(Parse.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegativeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNotContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(Parse.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(Parse.LESS_THAN, 0); }
		public LessThanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExpressionContext {
		public TerminalNode LBRACE() { return getToken(Parse.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parse.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parse.SEMICOLON, i);
		}
		public BlockContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpressionContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(Parse.LESS_EQUAL, 0); }
		public LessEqualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitLessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(Parse.MULTIPLY, 0); }
		public MultiplyContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ExpressionContext {
		public TerminalNode IF() { return getToken(Parse.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(Parse.THEN, 0); }
		public TerminalNode ELSE() { return getToken(Parse.ELSE, 0); }
		public TerminalNode FI() { return getToken(Parse.FI, 0); }
		public IfContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends ExpressionContext {
		public TerminalNode CASE() { return getToken(Parse.CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OF() { return getToken(Parse.OF, 0); }
		public TerminalNode ESAC() { return getToken(Parse.ESAC, 0); }
		public List<TerminalNode> OBJECTID() { return getTokens(Parse.OBJECTID); }
		public TerminalNode OBJECTID(int i) {
			return getToken(Parse.OBJECTID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parse.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parse.COLON, i);
		}
		public List<TerminalNode> TYPEID() { return getTokens(Parse.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(Parse.TYPEID, i);
		}
		public List<TerminalNode> CASE_ARROW() { return getTokens(Parse.CASE_ARROW); }
		public TerminalNode CASE_ARROW(int i) {
			return getToken(Parse.CASE_ARROW, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parse.SEMICOLON, i);
		}
		public CaseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OwnMethodCallContext extends ExpressionContext {
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(Parse.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parse.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parse.COMMA, i);
		}
		public OwnMethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterOwnMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitOwnMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitOwnMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(Parse.DOT, 0); }
		public TerminalNode OBJECTID() { return getToken(Parse.OBJECTID, 0); }
		public TerminalNode LPAREN() { return getToken(Parse.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parse.RPAREN, 0); }
		public TerminalNode ATSYM() { return getToken(Parse.ATSYM, 0); }
		public TerminalNode TYPEID() { return getToken(Parse.TYPEID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parse.COMMA, i);
		}
		public MethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParseListener ) ((ParseListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParseVisitor ) return ((ParseVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new OwnMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90);
				match(OBJECTID);
				setState(91);
				match(LPAREN);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << LBRACE) | (1L << CASE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << BOOL_CONST) | (1L << INT) | (1L << OBJECTID) | (1L << STRING))) != 0)) {
					{
					{
					setState(92);
					expression(0);
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(93);
						match(COMMA);
						setState(94);
						expression(0);
						}
						}
						setState(99);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(IF);
				setState(107);
				expression(0);
				setState(108);
				match(THEN);
				setState(109);
				expression(0);
				setState(110);
				match(ELSE);
				setState(111);
				expression(0);
				setState(112);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(WHILE);
				setState(115);
				expression(0);
				setState(116);
				match(LOOP);
				setState(117);
				expression(0);
				setState(118);
				match(POOL);
				}
				break;
			case 4:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(LBRACE);
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(121);
					expression(0);
					setState(122);
					match(SEMICOLON);
					}
					}
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << LBRACE) | (1L << CASE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << BOOL_CONST) | (1L << INT) | (1L << OBJECTID) | (1L << STRING))) != 0) );
				setState(128);
				match(RBRACE);
				}
				break;
			case 5:
				{
				_localctx = new LetInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(LET);
				setState(131);
				match(OBJECTID);
				setState(132);
				match(COLON);
				setState(133);
				match(TYPEID);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(134);
					match(ASSIGNMENT);
					setState(135);
					expression(0);
					}
				}

				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(138);
					match(COMMA);
					setState(139);
					match(OBJECTID);
					setState(140);
					match(COLON);
					setState(141);
					match(TYPEID);
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGNMENT) {
						{
						setState(142);
						match(ASSIGNMENT);
						setState(143);
						expression(0);
						}
					}

					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(IN);
				setState(152);
				expression(19);
				}
				break;
			case 6:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(CASE);
				setState(154);
				expression(0);
				setState(155);
				match(OF);
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					match(OBJECTID);
					setState(157);
					match(COLON);
					setState(158);
					match(TYPEID);
					setState(159);
					match(CASE_ARROW);
					setState(160);
					expression(0);
					setState(161);
					match(SEMICOLON);
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECTID );
				setState(167);
				match(ESAC);
				}
				break;
			case 7:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(NEW);
				setState(170);
				match(TYPEID);
				}
				break;
			case 8:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(MINUS);
				setState(172);
				expression(16);
				}
				break;
			case 9:
				{
				_localctx = new IsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(ISVOID);
				setState(174);
				expression(15);
				}
				break;
			case 10:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(NOT);
				setState(176);
				expression(7);
				}
				break;
			case 11:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(LPAREN);
				setState(178);
				expression(0);
				setState(179);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(OBJECTID);
				}
				break;
			case 13:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(INT);
				}
				break;
			case 14:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(STRING);
				}
				break;
			case 15:
				{
				_localctx = new TrueOrFlaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(BOOL_CONST);
				}
				break;
			case 16:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(OBJECTID);
				setState(186);
				match(ASSIGNMENT);
				setState(187);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(191);
						match(MULTIPLY);
						setState(192);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(194);
						match(DIVISION);
						setState(195);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(197);
						match(ADD);
						setState(198);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(200);
						match(MINUS);
						setState(201);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(203);
						match(LESS_THAN);
						setState(204);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new LessEqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(206);
						match(LESS_EQUAL);
						setState(207);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new EqualContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(209);
						match(EQUAL);
						setState(210);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new MethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ATSYM) {
							{
							setState(212);
							match(ATSYM);
							setState(213);
							match(TYPEID);
							}
						}

						setState(216);
						match(DOT);
						setState(217);
						match(OBJECTID);
						setState(218);
						match(LPAREN);
						setState(229);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << MINUS) | (1L << LBRACE) | (1L << CASE) | (1L << IF) | (1L << WHILE) | (1L << LET) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << BOOL_CONST) | (1L << INT) | (1L << OBJECTID) | (1L << STRING))) != 0)) {
							{
							{
							setState(219);
							expression(0);
							setState(224);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(220);
								match(COMMA);
								setState(221);
								expression(0);
								}
								}
								setState(226);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
							}
							setState(231);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(232);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\6\3\27\n\3\r\3\16\3\30\3\4\3\4\3\4\3\4\3\4\3\4\7\4!\n\4\f\4\16\4$\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4"+
		"\3\4\3\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\7\5C\n"+
		"\5\f\5\16\5F\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"T\n\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7b\n\7\f\7\16"+
		"\7e\13\7\7\7g\n\7\f\7\16\7j\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\177\n\7\r\7\16\7\u0080\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008b\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0093\n\7\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\6\7\u00a6\n\7\r\7\16\7\u00a7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00bf\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d9\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u00e1\n\7\f\7\16\7\u00e4\13\7\7\7\u00e6\n\7\f\7\16\7\u00e9\13"+
		"\7\3\7\7\7\u00ec\n\7\f\7\16\7\u00ef\13\7\3\7\2\3\f\b\2\4\6\b\n\f\2\2\2"+
		"\u0113\2\16\3\2\2\2\4\26\3\2\2\2\6\66\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\f"+
		"\u00be\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\21\b\2\1\2\21\3\3\2\2\2"+
		"\22\23\5\6\4\2\23\24\7\3\2\2\24\25\b\3\1\2\25\27\3\2\2\2\26\22\3\2\2\2"+
		"\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32\33\7\37\2\2"+
		"\33\34\7)\2\2\34\"\7\20\2\2\35\36\5\b\5\2\36\37\7\3\2\2\37!\3\2\2\2 \35"+
		"\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\21\2"+
		"\2&\67\b\4\1\2\'(\7\37\2\2()\7)\2\2)*\7!\2\2*+\7)\2\2+\61\7\20\2\2,-\5"+
		"\b\5\2-.\7\3\2\2.\60\3\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\21\2\2\65\67\b\4\1\2\66\32"+
		"\3\2\2\2\66\'\3\2\2\2\67\7\3\2\2\289\7*\2\29D\7\5\2\2:?\5\n\6\2;<\7\7"+
		"\2\2<>\5\n\6\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?\3\2"+
		"\2\2B:\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\6"+
		"\2\2HI\7\25\2\2IJ\7)\2\2JK\7\20\2\2KL\5\f\7\2LM\7\21\2\2MV\3\2\2\2NO\7"+
		"*\2\2OP\7\25\2\2PS\7)\2\2QR\7\23\2\2RT\5\f\7\2SQ\3\2\2\2ST\3\2\2\2TV\3"+
		"\2\2\2U8\3\2\2\2UN\3\2\2\2V\t\3\2\2\2WX\7*\2\2XY\7\25\2\2YZ\7)\2\2Z\13"+
		"\3\2\2\2[\\\b\7\1\2\\]\7*\2\2]h\7\5\2\2^c\5\f\7\2_`\7\7\2\2`b\5\f\7\2"+
		"a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2f^\3\2\2\2"+
		"gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2k\u00bf\7\6\2\2lm\7"+
		"\30\2\2mn\5\f\7\2no\7\33\2\2op\5\f\7\2pq\7\34\2\2qr\5\f\7\2rs\7\31\2\2"+
		"s\u00bf\3\2\2\2tu\7\32\2\2uv\5\f\7\2vw\7\35\2\2wx\5\f\7\2xy\7\36\2\2y"+
		"\u00bf\3\2\2\2z~\7\20\2\2{|\5\f\7\2|}\7\3\2\2}\177\3\2\2\2~{\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2"+
		"\u0082\u0083\7\21\2\2\u0083\u00bf\3\2\2\2\u0084\u0085\7#\2\2\u0085\u0086"+
		"\7*\2\2\u0086\u0087\7\25\2\2\u0087\u008a\7)\2\2\u0088\u0089\7\23\2\2\u0089"+
		"\u008b\5\f\7\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0096\3\2"+
		"\2\2\u008c\u008d\7\7\2\2\u008d\u008e\7*\2\2\u008e\u008f\7\25\2\2\u008f"+
		"\u0092\7)\2\2\u0090\u0091\7\23\2\2\u0091\u0093\5\f\7\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008c\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7 \2\2\u009a\u00bf\5\f\7\25\u009b"+
		"\u009c\7\26\2\2\u009c\u009d\5\f\7\2\u009d\u00a5\7\"\2\2\u009e\u009f\7"+
		"*\2\2\u009f\u00a0\7\25\2\2\u00a0\u00a1\7)\2\2\u00a1\u00a2\7\4\2\2\u00a2"+
		"\u00a3\5\f\7\2\u00a3\u00a4\7\3\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009e\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7\27\2\2\u00aa\u00bf\3\2\2\2\u00ab\u00ac\7"+
		"$\2\2\u00ac\u00bf\7)\2\2\u00ad\u00ae\7\t\2\2\u00ae\u00bf\5\f\7\22\u00af"+
		"\u00b0\7%\2\2\u00b0\u00bf\5\f\7\21\u00b1\u00b2\7&\2\2\u00b2\u00bf\5\f"+
		"\7\t\u00b3\u00b4\7\5\2\2\u00b4\u00b5\5\f\7\2\u00b5\u00b6\7\6\2\2\u00b6"+
		"\u00bf\3\2\2\2\u00b7\u00bf\7*\2\2\u00b8\u00bf\7(\2\2\u00b9\u00bf\7+\2"+
		"\2\u00ba\u00bf\7\'\2\2\u00bb\u00bc\7*\2\2\u00bc\u00bd\7\23\2\2\u00bd\u00bf"+
		"\5\f\7\3\u00be[\3\2\2\2\u00bel\3\2\2\2\u00bet\3\2\2\2\u00bez\3\2\2\2\u00be"+
		"\u0084\3\2\2\2\u00be\u009b\3\2\2\2\u00be\u00ab\3\2\2\2\u00be\u00ad\3\2"+
		"\2\2\u00be\u00af\3\2\2\2\u00be\u00b1\3\2\2\2\u00be\u00b3\3\2\2\2\u00be"+
		"\u00b7\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00ba\3\2"+
		"\2\2\u00be\u00bb\3\2\2\2\u00bf\u00ed\3\2\2\2\u00c0\u00c1\f\20\2\2\u00c1"+
		"\u00c2\7\n\2\2\u00c2\u00ec\5\f\7\21\u00c3\u00c4\f\17\2\2\u00c4\u00c5\7"+
		"\13\2\2\u00c5\u00ec\5\f\7\20\u00c6\u00c7\f\16\2\2\u00c7\u00c8\7\b\2\2"+
		"\u00c8\u00ec\5\f\7\17\u00c9\u00ca\f\r\2\2\u00ca\u00cb\7\t\2\2\u00cb\u00ec"+
		"\5\f\7\16\u00cc\u00cd\f\f\2\2\u00cd\u00ce\7\r\2\2\u00ce\u00ec\5\f\7\r"+
		"\u00cf\u00d0\f\13\2\2\u00d0\u00d1\7\16\2\2\u00d1\u00ec\5\f\7\f\u00d2\u00d3"+
		"\f\n\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00ec\5\f\7\13\u00d5\u00d8\f\32\2"+
		"\2\u00d6\u00d7\7\24\2\2\u00d7\u00d9\7)\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\22\2\2\u00db\u00dc\7*\2\2\u00dc"+
		"\u00e7\7\5\2\2\u00dd\u00e2\5\f\7\2\u00de\u00df\7\7\2\2\u00df\u00e1\5\f"+
		"\7\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00dd\3\2"+
		"\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\7\6\2\2\u00eb\u00c0\3\2"+
		"\2\2\u00eb\u00c3\3\2\2\2\u00eb\u00c6\3\2\2\2\u00eb\u00c9\3\2\2\2\u00eb"+
		"\u00cc\3\2\2\2\u00eb\u00cf\3\2\2\2\u00eb\u00d2\3\2\2\2\u00eb\u00d5\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\r\3\2\2\2\u00ef\u00ed\3\2\2\2\27\30\"\61\66?DSUch\u0080\u008a\u0092\u0096"+
		"\u00a7\u00be\u00d8\u00e2\u00e7\u00eb\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}