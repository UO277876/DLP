// Generated from java-escape by ANTLR 4.11.1
package parser;

import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import errorhandler.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, TRASH=38, 
		COMMENT_BLOCK=39, COMMENT=40, INT_CONSTANT=41, REAL_CONSTANT=42, CHAR_CONSTANT=43, 
		ID=44;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_type = 2, RULE_simple_types = 3, 
		RULE_recordFields = 4, RULE_varDefinition = 5, RULE_funcDefinition = 6, 
		RULE_mainDefinition = 7, RULE_parameters = 8, RULE_returnType = 9, RULE_statement = 10, 
		RULE_funcParameters = 11, RULE_block = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "type", "simple_types", "recordFields", "varDefinition", 
			"funcDefinition", "mainDefinition", "parameters", "returnType", "statement", 
			"funcParameters", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'struct'", "'{'", "'}'", "'int'", "'double'", "'char'", "','", "':'", 
			"';'", "'def'", "'main'", "'print'", "'input'", "'='", "'if'", "'else'", 
			"'while'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TRASH", "COMMENT_BLOCK", "COMMENT", "INT_CONSTANT", "REAL_CONSTANT", 
			"CHAR_CONSTANT", "ID"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> definitions = new ArrayList<Definition>();
		public VarDefinitionContext varDefinition;
		public FuncDefinitionContext funcDefinition;
		public MainDefinitionContext mainDefinition;
		public MainDefinitionContext mainDefinition() {
			return getRuleContext(MainDefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<FuncDefinitionContext> funcDefinition() {
			return getRuleContexts(FuncDefinitionContext.class);
		}
		public FuncDefinitionContext funcDefinition(int i) {
			return getRuleContext(FuncDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(32);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(26);
						((ProgramContext)_localctx).varDefinition = varDefinition();
						_localctx.definitions.addAll(((ProgramContext)_localctx).varDefinition.ast);
						}
						break;
					case T__28:
						{
						setState(29);
						((ProgramContext)_localctx).funcDefinition = funcDefinition();
						_localctx.definitions.add(((ProgramContext)_localctx).funcDefinition.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(37);
			((ProgramContext)_localctx).mainDefinition = mainDefinition();
			_localctx.definitions.add(((ProgramContext)_localctx).mainDefinition.ast);
			 ((ProgramContext)_localctx).ast =  new Program(_localctx.definitions, _localctx.definitions.get(_localctx.definitions.size()-1).getLine(),
			                _localctx.definitions.get(_localctx.definitions.size()-1).getColumn());
			setState(40);
			match(EOF);
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
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext expr1;
		public ExpressionContext expr;
		public ExpressionContext left;
		public Token ID;
		public FuncParametersContext funcParameters;
		public ExpressionContext expression;
		public TypeContext type;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token OP;
		public ExpressionContext right;
		public ExpressionContext expr2;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public FuncParametersContext funcParameters() {
			return getRuleContext(FuncParametersContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(43);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(44);
				match(T__0);
				setState(45);
				((ExpressionContext)_localctx).funcParameters = funcParameters();
				setState(46);
				match(T__1);

				                 ((ExpressionContext)_localctx).ast =  new FunctionInvocation(
				                    new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1),
				                    ((ExpressionContext)_localctx).funcParameters.ast,((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1);
				             
				}
				break;
			case 2:
				{
				setState(49);
				match(T__0);
				setState(50);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(51);
				match(T__1);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 3:
				{
				setState(54);
				match(T__0);
				setState(55);
				((ExpressionContext)_localctx).type = type();
				setState(56);
				match(T__1);
				setState(57);
				((ExpressionContext)_localctx).expression = expression(11);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).type.ast,((ExpressionContext)_localctx).expression.ast,
				                                               ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				}
				break;
			case 4:
				{
				setState(60);
				match(T__5);
				setState(61);
				((ExpressionContext)_localctx).expression = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).expression.ast,
				                                            ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				}
				break;
			case 5:
				{
				setState(64);
				match(T__6);
				setState(65);
				((ExpressionContext)_localctx).expression = expression(9);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).expression.ast,
				                               ((ExpressionContext)_localctx).expression.ast.getLine(),((ExpressionContext)_localctx).expression.ast.getColumn());
				}
				break;
			case 6:
				{
				setState(68);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)),
				                                    ((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 7:
				{
				setState(70);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)),
				                                    ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 8:
				{
				setState(72);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)),
				                                    ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1); 
				}
				break;
			case 9:
				{
				setState(74);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1 ); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(79);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(9);
						((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),
						                           ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn());
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(84);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__10) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(8);
						((ExpressionContext)_localctx).ast =  new Arithmetic((((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),
						                           ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn());
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(89);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(7);
						((ExpressionContext)_localctx).ast =  new Comparator((((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),
						                           ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn());
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(94);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(95);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(6);
						((ExpressionContext)_localctx).ast =  new Logical((((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).right.ast, ((ExpressionContext)_localctx).left.ast,
						                              ((ExpressionContext)_localctx).left.ast.getLine(), ((ExpressionContext)_localctx).left.ast.getColumn());
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(99);
						match(T__2);
						setState(100);
						((ExpressionContext)_localctx).expr2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(101);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).expr1.ast,((ExpressionContext)_localctx).expr2.ast,
						                                                                ((ExpressionContext)_localctx).expr1.ast.getLine(),((ExpressionContext)_localctx).expr1.ast.getColumn());
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(105);
						match(T__4);
						setState(106);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new StructAccess((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).expr.ast,
						                                                                  ((ExpressionContext)_localctx).expr.ast.getLine(), ((ExpressionContext)_localctx).expr.ast.getColumn());
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public List<RecordField> rfs = new ArrayList<RecordField>();
		public Simple_typesContext simple_types;
		public Token INT_CONSTANT;
		public TypeContext type;
		public RecordFieldsContext fields;
		public Simple_typesContext simple_types() {
			return getRuleContext(Simple_typesContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordFieldsContext recordFields() {
			return getRuleContext(RecordFieldsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((TypeContext)_localctx).simple_types = simple_types();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_types.ast;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__2);
				setState(117);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(118);
				match(T__3);
				setState(119);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),
				                                                        ((TypeContext)_localctx).type.ast);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(T__19);
				setState(123);
				match(T__20);
				setState(124);
				((TypeContext)_localctx).fields = recordFields();
				setState(125);
				match(T__21);
				((TypeContext)_localctx).ast =  new RecordType(((TypeContext)_localctx).fields.ast);
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
	public static class Simple_typesContext extends ParserRuleContext {
		public Type ast;
		public Simple_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_types; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitSimple_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typesContext simple_types() throws RecognitionException {
		Simple_typesContext _localctx = new Simple_typesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_types);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__22);
				((Simple_typesContext)_localctx).ast =  new IntType();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__23);
				((Simple_typesContext)_localctx).ast =  new DoubleType();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__24);
				((Simple_typesContext)_localctx).ast =  new CharType();
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
	public static class RecordFieldsContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<>();
		public List<String> ids = new ArrayList<String>();
		public Token ID1;
		public Token ID2;
		public TypeContext type;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public RecordFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordFields; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitRecordFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordFieldsContext recordFields() throws RecognitionException {
		RecordFieldsContext _localctx = new RecordFieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_recordFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(138);
				((RecordFieldsContext)_localctx).ID1 = match(ID);
				_localctx.ids.add((((RecordFieldsContext)_localctx).ID1!=null?((RecordFieldsContext)_localctx).ID1.getText():null));
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(140);
					match(T__25);
					setState(141);
					((RecordFieldsContext)_localctx).ID2 = match(ID);
					_localctx.ids.add((((RecordFieldsContext)_localctx).ID2!=null?((RecordFieldsContext)_localctx).ID2.getText():null));
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__26);
				setState(149);
				((RecordFieldsContext)_localctx).type = type();
				for(String id: _localctx.ids) {
				                    RecordField rf = new RecordField(id,((RecordFieldsContext)_localctx).type.ast,((RecordFieldsContext)_localctx).ID1.getLine(),((RecordFieldsContext)_localctx).ID1.getCharPositionInLine()+1);
				                    if(_localctx.ast.contains(rf)){
				                        new ErrorType("Variable in struct with name " + (((RecordFieldsContext)_localctx).ID1!=null?((RecordFieldsContext)_localctx).ID1.getText():null) + " is already defined",
				                                                                              ((RecordFieldsContext)_localctx).ID1.getLine(),((RecordFieldsContext)_localctx).ID1.getCharPositionInLine()+1);
				                    } else {
				                        _localctx.ast.add(rf);
				                    }
				                  }
				                
				setState(151);
				match(T__27);
				}
				}
				setState(157);
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
	public static class VarDefinitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public List<String> ids = new ArrayList<String>();
		public Token ID1;
		public Token ID2;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			((VarDefinitionContext)_localctx).ID1 = match(ID);
			_localctx.ids.add((((VarDefinitionContext)_localctx).ID1!=null?((VarDefinitionContext)_localctx).ID1.getText():null));
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(160);
				match(T__25);
				setState(161);
				((VarDefinitionContext)_localctx).ID2 = match(ID);
				 if(_localctx.ids.contains((((VarDefinitionContext)_localctx).ID2!=null?((VarDefinitionContext)_localctx).ID2.getText():null))){
				                        new ErrorType("Variable with name " + (((VarDefinitionContext)_localctx).ID2!=null?((VarDefinitionContext)_localctx).ID2.getText():null) + " is already defined.",
				                            ((VarDefinitionContext)_localctx).ID2.getLine(),((VarDefinitionContext)_localctx).ID2.getCharPositionInLine()+1);
				                     } else {
				                            _localctx.ids.add((((VarDefinitionContext)_localctx).ID2!=null?((VarDefinitionContext)_localctx).ID2.getText():null));}
				                     
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(T__26);
			setState(169);
			((VarDefinitionContext)_localctx).type = type();

			            for(String id: _localctx.ids){
			                _localctx.ast.add(
			                   new VarDefinition(((VarDefinitionContext)_localctx).type.ast,id,((VarDefinitionContext)_localctx).ID1.getLine(),((VarDefinitionContext)_localctx).ID1.getCharPositionInLine()+1));
			            }
			       
			setState(171);
			match(T__27);
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
	public static class FuncDefinitionContext extends ParserRuleContext {
		public Definition ast;
		public List<Statement> statements = new ArrayList<Statement>();
		public List<Definition> definitions = new ArrayList<Definition>();
		public List<VarDefinition> varDefinitions = new ArrayList<VarDefinition>();
		public Token ID;
		public ParametersContext parameters;
		public ReturnTypeContext returnType;
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__28);
			setState(174);
			((FuncDefinitionContext)_localctx).ID = match(ID);
			setState(175);
			match(T__0);
			setState(176);
			((FuncDefinitionContext)_localctx).parameters = parameters();
			setState(177);
			match(T__1);
			setState(178);
			match(T__26);
			setState(179);
			((FuncDefinitionContext)_localctx).returnType = returnType();
			setState(180);
			match(T__20);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					((FuncDefinitionContext)_localctx).varDefinition = varDefinition();
					_localctx.varDefinitions.addAll(((FuncDefinitionContext)_localctx).varDefinition.ast);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 33215129583810L) != 0) {
				{
				{
				setState(189);
				((FuncDefinitionContext)_localctx).statement = statement();
				_localctx.statements.add(((FuncDefinitionContext)_localctx).statement.ast);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(T__21);
			 ((FuncDefinitionContext)_localctx).ast =  new FuncDefinition(
			            new FunctionType(((FuncDefinitionContext)_localctx).returnType.ast, ((FuncDefinitionContext)_localctx).parameters.ast),
			                (((FuncDefinitionContext)_localctx).ID!=null?((FuncDefinitionContext)_localctx).ID.getText():null),
			                _localctx.varDefinitions,
			                _localctx.statements,
			                ((FuncDefinitionContext)_localctx).ID.getLine(),
			                ((FuncDefinitionContext)_localctx).ID.getCharPositionInLine()+1);
			       
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
	public static class MainDefinitionContext extends ParserRuleContext {
		public Definition ast;
		public List<Statement> statements = new ArrayList<Statement>();
		public List<Definition> definitions = new ArrayList<Definition>();
		public List<VarDefinition> varDefinitions = new ArrayList<VarDefinition>();
		public Token MAIN;
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMainDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDefinitionContext mainDefinition() throws RecognitionException {
		MainDefinitionContext _localctx = new MainDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mainDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__28);
			setState(201);
			((MainDefinitionContext)_localctx).MAIN = match(T__29);
			setState(202);
			match(T__0);
			setState(203);
			match(T__1);
			setState(204);
			match(T__26);
			setState(205);
			match(T__20);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					((MainDefinitionContext)_localctx).varDefinition = varDefinition();
					_localctx.varDefinitions.addAll(((MainDefinitionContext)_localctx).varDefinition.ast);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 33215129583810L) != 0) {
				{
				{
				setState(214);
				((MainDefinitionContext)_localctx).statement = statement();
				_localctx.statements.add(((MainDefinitionContext)_localctx).statement.ast);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(T__21);
			 ((MainDefinitionContext)_localctx).ast =  new FuncDefinition(
			            new FunctionType(new VoidType(), new ArrayList<VarDefinition>()),
			                (((MainDefinitionContext)_localctx).MAIN!=null?((MainDefinitionContext)_localctx).MAIN.getText():null),
			                _localctx.varDefinitions,
			                _localctx.statements,
			                ((MainDefinitionContext)_localctx).MAIN.getLine(),
			                ((MainDefinitionContext)_localctx).MAIN.getCharPositionInLine()+1);
			       
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
	public static class ParametersContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Token ID1;
		public Simple_typesContext type1;
		public Token ID2;
		public Simple_typesContext type2;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<Simple_typesContext> simple_types() {
			return getRuleContexts(Simple_typesContext.class);
		}
		public Simple_typesContext simple_types(int i) {
			return getRuleContext(Simple_typesContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(225);
				((ParametersContext)_localctx).ID1 = match(ID);
				setState(226);
				match(T__26);
				setState(227);
				((ParametersContext)_localctx).type1 = simple_types();
				_localctx.ast.add(new VarDefinition(((ParametersContext)_localctx).type1.ast, (((ParametersContext)_localctx).ID1!=null?((ParametersContext)_localctx).ID1.getText():null),
				                                ((ParametersContext)_localctx).ID1.getLine(),((ParametersContext)_localctx).ID1.getCharPositionInLine()+1));
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(229);
					match(T__25);
					setState(230);
					((ParametersContext)_localctx).ID2 = match(ID);
					setState(231);
					match(T__26);
					setState(232);
					((ParametersContext)_localctx).type2 = simple_types();
					_localctx.ast.add(new VarDefinition(((ParametersContext)_localctx).type2.ast, (((ParametersContext)_localctx).ID2!=null?((ParametersContext)_localctx).ID2.getText():null),
					                                                 ((ParametersContext)_localctx).ID2.getLine(),((ParametersContext)_localctx).ID2.getCharPositionInLine()+1));
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ReturnTypeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typesContext simple_types;
		public Simple_typesContext simple_types() {
			return getRuleContext(Simple_typesContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnType);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				((ReturnTypeContext)_localctx).simple_types = simple_types();
				 ((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).simple_types.ast; 
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				((ReturnTypeContext)_localctx).ast =  new VoidType();
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
	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public List<Expression> exprs = new ArrayList<Expression>();
		public List<Statement> if_statements = new ArrayList<Statement>();
		public List<Statement> else_statements = new ArrayList<Statement>();
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext cond;
		public BlockContext bl1;
		public BlockContext bl2;
		public ExpressionContext expression;
		public Token ID;
		public FuncParametersContext funcParameters;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public FuncParametersContext funcParameters() {
			return getRuleContext(FuncParametersContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__30);
				setState(249);
				((StatementContext)_localctx).expr1 = expression(0);
				_localctx.exprs.add(((StatementContext)_localctx).expr1.ast);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(251);
					match(T__25);
					setState(252);
					((StatementContext)_localctx).expr2 = expression(0);
					_localctx.exprs.add(((StatementContext)_localctx).expr2.ast);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(T__27);

				            List<Expression> aux = new ArrayList<Expression>();
				            for(Expression expr : _localctx.exprs){
				                aux.add(expr);
				            }
				            ((StatementContext)_localctx).ast =  new Print(aux,((StatementContext)_localctx).expr1.ast.getLine(),((StatementContext)_localctx).expr1.ast.getColumn());
				       
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(T__31);
				setState(264);
				((StatementContext)_localctx).expr1 = expression(0);
				_localctx.exprs.add(((StatementContext)_localctx).expr1.ast);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(266);
					match(T__25);
					setState(267);
					((StatementContext)_localctx).expr2 = expression(0);
					_localctx.exprs.add(((StatementContext)_localctx).expr2.ast);
					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(275);
				match(T__27);

				             List<Expression> aux = new ArrayList<Expression>();
				             for(Expression expr : _localctx.exprs){
				                 aux.add(expr);
				             }
				             ((StatementContext)_localctx).ast =  new Input(aux,((StatementContext)_localctx).expr1.ast.getLine(),((StatementContext)_localctx).expr1.ast.getColumn());
				         
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				((StatementContext)_localctx).left = expression(0);
				setState(279);
				match(T__32);
				setState(280);
				((StatementContext)_localctx).right = expression(0);
				setState(281);
				match(T__27);
				((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).right.ast,((StatementContext)_localctx).left.ast,((StatementContext)_localctx).left.ast.getLine(),
				                                                        ((StatementContext)_localctx).left.ast.getColumn());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(T__33);
				setState(285);
				((StatementContext)_localctx).cond = expression(0);
				setState(286);
				match(T__26);
				setState(287);
				((StatementContext)_localctx).bl1 = block();
				_localctx.if_statements.addAll(((StatementContext)_localctx).bl1.ast);
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(289);
					match(T__34);
					setState(290);
					match(T__26);
					setState(291);
					((StatementContext)_localctx).bl2 = block();
					_localctx.else_statements.addAll(((StatementContext)_localctx).bl2.ast);
					}
					break;
				}
				 ((StatementContext)_localctx).ast =  new Conditional(((StatementContext)_localctx).cond.ast, _localctx.if_statements, _localctx.else_statements,
				            ((StatementContext)_localctx).cond.ast.getLine(), ((StatementContext)_localctx).cond.ast.getColumn());
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				match(T__35);
				setState(299);
				((StatementContext)_localctx).cond = expression(0);
				setState(300);
				match(T__26);
				setState(301);
				((StatementContext)_localctx).bl1 = block();
				 ((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).cond.ast, ((StatementContext)_localctx).bl1.ast, ((StatementContext)_localctx).cond.ast.getLine(), ((StatementContext)_localctx).cond.ast.getColumn());
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(304);
				match(T__36);
				setState(305);
				((StatementContext)_localctx).expression = expression(0);
				setState(306);
				match(T__27);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).expression.ast,((StatementContext)_localctx).expression.ast.getLine(),
				                                        ((StatementContext)_localctx).expression.ast.getColumn());
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				((StatementContext)_localctx).ID = match(ID);
				setState(310);
				match(T__0);
				setState(311);
				((StatementContext)_localctx).funcParameters = funcParameters();
				setState(312);
				match(T__1);
				setState(313);
				match(T__27);

				                    ((StatementContext)_localctx).ast =  new FunctionInvocation(
				                         new Variable((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null),((StatementContext)_localctx).ID.getLine(),((StatementContext)_localctx).ID.getCharPositionInLine()+1),
				                         ((StatementContext)_localctx).funcParameters.ast,((StatementContext)_localctx).ID.getLine(),((StatementContext)_localctx).ID.getCharPositionInLine()+1);
				                  
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncParametersContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext expr1;
		public ExpressionContext expr2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FuncParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParametersContext funcParameters() throws RecognitionException {
		FuncParametersContext _localctx = new FuncParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 32985348833474L) != 0) {
				{
				setState(318);
				((FuncParametersContext)_localctx).expr1 = expression(0);
				_localctx.ast.add(((FuncParametersContext)_localctx).expr1.ast);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(320);
					match(T__25);
					setState(321);
					((FuncParametersContext)_localctx).expr2 = expression(0);
					_localctx.ast.add(((FuncParametersContext)_localctx).expr2.ast);
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case T__30:
			case T__31:
			case T__33:
			case T__35:
			case T__36:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				((BlockContext)_localctx).statement = statement();
				_localctx.ast.add(((BlockContext)_localctx).statement.ast);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(T__20);
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(335);
					((BlockContext)_localctx).statement = statement();
					_localctx.ast.add(((BlockContext)_localctx).statement.ast);
					}
					}
					setState(340); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 33215129583810L) != 0 );
				setState(342);
				match(T__21);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u015b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001m\b\u0001"+
		"\n\u0001\f\u0001p\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0081\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0089\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0090\b\u0004\n\u0004\f\u0004\u0093"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u009a\b\u0004\n\u0004\f\u0004\u009d\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a4\b\u0005\n\u0005"+
		"\f\u0005\u00a7\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00b9\b\u0006\n\u0006\f\u0006\u00bc\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00c1\b\u0006\n\u0006\f\u0006\u00c4\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00d2\b\u0007\n\u0007\f\u0007\u00d5\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00da\b\u0007\n\u0007\f\u0007\u00dd\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ec\b\b\n\b\f\b\u00ef"+
		"\t\b\u0003\b\u00f1\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00f7\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0100"+
		"\b\n\n\n\f\n\u0103\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u010f\b\n\n\n\f\n\u0112\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0127\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u013d\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0145"+
		"\b\u000b\n\u000b\f\u000b\u0148\t\u000b\u0003\u000b\u014a\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0153\b\f\u000b"+
		"\f\f\f\u0154\u0001\f\u0001\f\u0003\f\u0159\b\f\u0001\f\u0000\u0001\u0002"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0004\u0001\u0000\b\n\u0002\u0000\u0006\u0006\u000b\u000b\u0001\u0000"+
		"\f\u0011\u0001\u0000\u0012\u0013\u0178\u0000\"\u0001\u0000\u0000\u0000"+
		"\u0002L\u0001\u0000\u0000\u0000\u0004\u0080\u0001\u0000\u0000\u0000\u0006"+
		"\u0088\u0001\u0000\u0000\u0000\b\u009b\u0001\u0000\u0000\u0000\n\u009e"+
		"\u0001\u0000\u0000\u0000\f\u00ad\u0001\u0000\u0000\u0000\u000e\u00c8\u0001"+
		"\u0000\u0000\u0000\u0010\u00f0\u0001\u0000\u0000\u0000\u0012\u00f6\u0001"+
		"\u0000\u0000\u0000\u0014\u013c\u0001\u0000\u0000\u0000\u0016\u0149\u0001"+
		"\u0000\u0000\u0000\u0018\u0158\u0001\u0000\u0000\u0000\u001a\u001b\u0003"+
		"\n\u0005\u0000\u001b\u001c\u0006\u0000\uffff\uffff\u0000\u001c!\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0003\f\u0006\u0000\u001e\u001f\u0006\u0000"+
		"\uffff\uffff\u0000\u001f!\u0001\u0000\u0000\u0000 \u001a\u0001\u0000\u0000"+
		"\u0000 \u001d\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000%&\u0003\u000e\u0007\u0000&\'\u0006\u0000\uffff"+
		"\uffff\u0000\'(\u0006\u0000\uffff\uffff\u0000()\u0005\u0000\u0000\u0001"+
		")\u0001\u0001\u0000\u0000\u0000*+\u0006\u0001\uffff\uffff\u0000+,\u0005"+
		",\u0000\u0000,-\u0005\u0001\u0000\u0000-.\u0003\u0016\u000b\u0000./\u0005"+
		"\u0002\u0000\u0000/0\u0006\u0001\uffff\uffff\u00000M\u0001\u0000\u0000"+
		"\u000012\u0005\u0001\u0000\u000023\u0003\u0002\u0001\u000034\u0005\u0002"+
		"\u0000\u000045\u0006\u0001\uffff\uffff\u00005M\u0001\u0000\u0000\u0000"+
		"67\u0005\u0001\u0000\u000078\u0003\u0004\u0002\u000089\u0005\u0002\u0000"+
		"\u00009:\u0003\u0002\u0001\u000b:;\u0006\u0001\uffff\uffff\u0000;M\u0001"+
		"\u0000\u0000\u0000<=\u0005\u0006\u0000\u0000=>\u0003\u0002\u0001\n>?\u0006"+
		"\u0001\uffff\uffff\u0000?M\u0001\u0000\u0000\u0000@A\u0005\u0007\u0000"+
		"\u0000AB\u0003\u0002\u0001\tBC\u0006\u0001\uffff\uffff\u0000CM\u0001\u0000"+
		"\u0000\u0000DE\u0005)\u0000\u0000EM\u0006\u0001\uffff\uffff\u0000FG\u0005"+
		"*\u0000\u0000GM\u0006\u0001\uffff\uffff\u0000HI\u0005+\u0000\u0000IM\u0006"+
		"\u0001\uffff\uffff\u0000JK\u0005,\u0000\u0000KM\u0006\u0001\uffff\uffff"+
		"\u0000L*\u0001\u0000\u0000\u0000L1\u0001\u0000\u0000\u0000L6\u0001\u0000"+
		"\u0000\u0000L<\u0001\u0000\u0000\u0000L@\u0001\u0000\u0000\u0000LD\u0001"+
		"\u0000\u0000\u0000LF\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000Mn\u0001\u0000\u0000\u0000NO\n\b\u0000\u0000"+
		"OP\u0007\u0000\u0000\u0000PQ\u0003\u0002\u0001\tQR\u0006\u0001\uffff\uffff"+
		"\u0000Rm\u0001\u0000\u0000\u0000ST\n\u0007\u0000\u0000TU\u0007\u0001\u0000"+
		"\u0000UV\u0003\u0002\u0001\bVW\u0006\u0001\uffff\uffff\u0000Wm\u0001\u0000"+
		"\u0000\u0000XY\n\u0006\u0000\u0000YZ\u0007\u0002\u0000\u0000Z[\u0003\u0002"+
		"\u0001\u0007[\\\u0006\u0001\uffff\uffff\u0000\\m\u0001\u0000\u0000\u0000"+
		"]^\n\u0005\u0000\u0000^_\u0007\u0003\u0000\u0000_`\u0003\u0002\u0001\u0006"+
		"`a\u0006\u0001\uffff\uffff\u0000am\u0001\u0000\u0000\u0000bc\n\r\u0000"+
		"\u0000cd\u0005\u0003\u0000\u0000de\u0003\u0002\u0001\u0000ef\u0005\u0004"+
		"\u0000\u0000fg\u0006\u0001\uffff\uffff\u0000gm\u0001\u0000\u0000\u0000"+
		"hi\n\f\u0000\u0000ij\u0005\u0005\u0000\u0000jk\u0005,\u0000\u0000km\u0006"+
		"\u0001\uffff\uffff\u0000lN\u0001\u0000\u0000\u0000lS\u0001\u0000\u0000"+
		"\u0000lX\u0001\u0000\u0000\u0000l]\u0001\u0000\u0000\u0000lb\u0001\u0000"+
		"\u0000\u0000lh\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0003\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qr\u0003\u0006\u0003\u0000rs\u0006\u0002"+
		"\uffff\uffff\u0000s\u0081\u0001\u0000\u0000\u0000tu\u0005\u0003\u0000"+
		"\u0000uv\u0005)\u0000\u0000vw\u0005\u0004\u0000\u0000wx\u0003\u0004\u0002"+
		"\u0000xy\u0006\u0002\uffff\uffff\u0000y\u0081\u0001\u0000\u0000\u0000"+
		"z{\u0005\u0014\u0000\u0000{|\u0005\u0015\u0000\u0000|}\u0003\b\u0004\u0000"+
		"}~\u0005\u0016\u0000\u0000~\u007f\u0006\u0002\uffff\uffff\u0000\u007f"+
		"\u0081\u0001\u0000\u0000\u0000\u0080q\u0001\u0000\u0000\u0000\u0080t\u0001"+
		"\u0000\u0000\u0000\u0080z\u0001\u0000\u0000\u0000\u0081\u0005\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u0017\u0000\u0000\u0083\u0089\u0006\u0003"+
		"\uffff\uffff\u0000\u0084\u0085\u0005\u0018\u0000\u0000\u0085\u0089\u0006"+
		"\u0003\uffff\uffff\u0000\u0086\u0087\u0005\u0019\u0000\u0000\u0087\u0089"+
		"\u0006\u0003\uffff\uffff\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0088"+
		"\u0084\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u0007\u0001\u0000\u0000\u0000\u008a\u008b\u0005,\u0000\u0000\u008b\u0091"+
		"\u0006\u0004\uffff\uffff\u0000\u008c\u008d\u0005\u001a\u0000\u0000\u008d"+
		"\u008e\u0005,\u0000\u0000\u008e\u0090\u0006\u0004\uffff\uffff\u0000\u008f"+
		"\u008c\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\u001b\u0000\u0000\u0095\u0096\u0003\u0004\u0002\u0000\u0096"+
		"\u0097\u0006\u0004\uffff\uffff\u0000\u0097\u0098\u0005\u001c\u0000\u0000"+
		"\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u008a\u0001\u0000\u0000\u0000"+
		"\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\t\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005,\u0000\u0000\u009f\u00a5"+
		"\u0006\u0005\uffff\uffff\u0000\u00a0\u00a1\u0005\u001a\u0000\u0000\u00a1"+
		"\u00a2\u0005,\u0000\u0000\u00a2\u00a4\u0006\u0005\uffff\uffff\u0000\u00a3"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\u001b\u0000\u0000\u00a9\u00aa\u0003\u0004\u0002\u0000\u00aa"+
		"\u00ab\u0006\u0005\uffff\uffff\u0000\u00ab\u00ac\u0005\u001c\u0000\u0000"+
		"\u00ac\u000b\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u001d\u0000\u0000"+
		"\u00ae\u00af\u0005,\u0000\u0000\u00af\u00b0\u0005\u0001\u0000\u0000\u00b0"+
		"\u00b1\u0003\u0010\b\u0000\u00b1\u00b2\u0005\u0002\u0000\u0000\u00b2\u00b3"+
		"\u0005\u001b\u0000\u0000\u00b3\u00b4\u0003\u0012\t\u0000\u00b4\u00ba\u0005"+
		"\u0015\u0000\u0000\u00b5\u00b6\u0003\n\u0005\u0000\u00b6\u00b7\u0006\u0006"+
		"\uffff\uffff\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00c2\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0003"+
		"\u0014\n\u0000\u00be\u00bf\u0006\u0006\uffff\uffff\u0000\u00bf\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005\u0016\u0000\u0000\u00c6\u00c7\u0006"+
		"\u0006\uffff\uffff\u0000\u00c7\r\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005"+
		"\u001d\u0000\u0000\u00c9\u00ca\u0005\u001e\u0000\u0000\u00ca\u00cb\u0005"+
		"\u0001\u0000\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc\u00cd\u0005"+
		"\u001b\u0000\u0000\u00cd\u00d3\u0005\u0015\u0000\u0000\u00ce\u00cf\u0003"+
		"\n\u0005\u0000\u00cf\u00d0\u0006\u0007\uffff\uffff\u0000\u00d0\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00db\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0003\u0014\n\u0000\u00d7\u00d8\u0006\u0007"+
		"\uffff\uffff\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001"+
		"\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\u0016\u0000\u0000\u00df\u00e0\u0006\u0007\uffff\uffff\u0000\u00e0\u000f"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005,\u0000\u0000\u00e2\u00e3\u0005"+
		"\u001b\u0000\u0000\u00e3\u00e4\u0003\u0006\u0003\u0000\u00e4\u00ed\u0006"+
		"\b\uffff\uffff\u0000\u00e5\u00e6\u0005\u001a\u0000\u0000\u00e6\u00e7\u0005"+
		",\u0000\u0000\u00e7\u00e8\u0005\u001b\u0000\u0000\u00e8\u00e9\u0003\u0006"+
		"\u0003\u0000\u00e9\u00ea\u0006\b\uffff\uffff\u0000\u00ea\u00ec\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f0\u00e1\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u0011\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003\u0006"+
		"\u0003\u0000\u00f3\u00f4\u0006\t\uffff\uffff\u0000\u00f4\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f7\u0006\t\uffff\uffff\u0000\u00f6\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u0013\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0005\u001f\u0000\u0000\u00f9\u00fa\u0003\u0002"+
		"\u0001\u0000\u00fa\u0101\u0006\n\uffff\uffff\u0000\u00fb\u00fc\u0005\u001a"+
		"\u0000\u0000\u00fc\u00fd\u0003\u0002\u0001\u0000\u00fd\u00fe\u0006\n\uffff"+
		"\uffff\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fb\u0001\u0000"+
		"\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u001c"+
		"\u0000\u0000\u0105\u0106\u0006\n\uffff\uffff\u0000\u0106\u013d\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005 \u0000\u0000\u0108\u0109\u0003\u0002\u0001"+
		"\u0000\u0109\u0110\u0006\n\uffff\uffff\u0000\u010a\u010b\u0005\u001a\u0000"+
		"\u0000\u010b\u010c\u0003\u0002\u0001\u0000\u010c\u010d\u0006\n\uffff\uffff"+
		"\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010a\u0001\u0000\u0000"+
		"\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u001c\u0000"+
		"\u0000\u0114\u0115\u0006\n\uffff\uffff\u0000\u0115\u013d\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0003\u0002\u0001\u0000\u0117\u0118\u0005!\u0000\u0000"+
		"\u0118\u0119\u0003\u0002\u0001\u0000\u0119\u011a\u0005\u001c\u0000\u0000"+
		"\u011a\u011b\u0006\n\uffff\uffff\u0000\u011b\u013d\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0005\"\u0000\u0000\u011d\u011e\u0003\u0002\u0001\u0000\u011e"+
		"\u011f\u0005\u001b\u0000\u0000\u011f\u0120\u0003\u0018\f\u0000\u0120\u0126"+
		"\u0006\n\uffff\uffff\u0000\u0121\u0122\u0005#\u0000\u0000\u0122\u0123"+
		"\u0005\u001b\u0000\u0000\u0123\u0124\u0003\u0018\f\u0000\u0124\u0125\u0006"+
		"\n\uffff\uffff\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0121\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0006\n\uffff\uffff\u0000\u0129\u013d\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0005$\u0000\u0000\u012b\u012c\u0003\u0002"+
		"\u0001\u0000\u012c\u012d\u0005\u001b\u0000\u0000\u012d\u012e\u0003\u0018"+
		"\f\u0000\u012e\u012f\u0006\n\uffff\uffff\u0000\u012f\u013d\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0005%\u0000\u0000\u0131\u0132\u0003\u0002\u0001"+
		"\u0000\u0132\u0133\u0005\u001c\u0000\u0000\u0133\u0134\u0006\n\uffff\uffff"+
		"\u0000\u0134\u013d\u0001\u0000\u0000\u0000\u0135\u0136\u0005,\u0000\u0000"+
		"\u0136\u0137\u0005\u0001\u0000\u0000\u0137\u0138\u0003\u0016\u000b\u0000"+
		"\u0138\u0139\u0005\u0002\u0000\u0000\u0139\u013a\u0005\u001c\u0000\u0000"+
		"\u013a\u013b\u0006\n\uffff\uffff\u0000\u013b\u013d\u0001\u0000\u0000\u0000"+
		"\u013c\u00f8\u0001\u0000\u0000\u0000\u013c\u0107\u0001\u0000\u0000\u0000"+
		"\u013c\u0116\u0001\u0000\u0000\u0000\u013c\u011c\u0001\u0000\u0000\u0000"+
		"\u013c\u012a\u0001\u0000\u0000\u0000\u013c\u0130\u0001\u0000\u0000\u0000"+
		"\u013c\u0135\u0001\u0000\u0000\u0000\u013d\u0015\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0003\u0002\u0001\u0000\u013f\u0146\u0006\u000b\uffff\uffff"+
		"\u0000\u0140\u0141\u0005\u001a\u0000\u0000\u0141\u0142\u0003\u0002\u0001"+
		"\u0000\u0142\u0143\u0006\u000b\uffff\uffff\u0000\u0143\u0145\u0001\u0000"+
		"\u0000\u0000\u0144\u0140\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000"+
		"\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000"+
		"\u0000\u0000\u0149\u013e\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u0017\u0001\u0000\u0000\u0000\u014b\u014c\u0003\u0014"+
		"\n\u0000\u014c\u014d\u0006\f\uffff\uffff\u0000\u014d\u0159\u0001\u0000"+
		"\u0000\u0000\u014e\u0152\u0005\u0015\u0000\u0000\u014f\u0150\u0003\u0014"+
		"\n\u0000\u0150\u0151\u0006\f\uffff\uffff\u0000\u0151\u0153\u0001\u0000"+
		"\u0000\u0000\u0152\u014f\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u0016"+
		"\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u014b\u0001\u0000"+
		"\u0000\u0000\u0158\u014e\u0001\u0000\u0000\u0000\u0159\u0019\u0001\u0000"+
		"\u0000\u0000\u0019 \"Lln\u0080\u0088\u0091\u009b\u00a5\u00ba\u00c2\u00d3"+
		"\u00db\u00ed\u00f0\u00f6\u0101\u0110\u0126\u013c\u0146\u0149\u0154\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}