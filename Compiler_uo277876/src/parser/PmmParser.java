// Generated from java-escape by ANTLR 4.11.1
package parser;

import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, TRASH=37, COMMENT_BLOCK=38, 
		COMMENT=39, INT_CONSTANT=40, REAL_CONSTANT=41, CHAR_CONSTANT=42, ID=43;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_type = 2, RULE_recordFields = 3, 
		RULE_varDefinition = 4, RULE_funcDefinition = 5, RULE_parameters = 6, 
		RULE_returnType = 7, RULE_statement = 8, RULE_block = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "type", "recordFields", "varDefinition", "funcDefinition", 
			"parameters", "returnType", "statement", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", 
			"'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", 
			"'||'", "'int'", "'double'", "'char'", "'struct'", "'{'", "'}'", "':'", 
			"';'", "'def'", "'print'", "'input'", "'='", "'if'", "'else'", "'while'", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "TRASH", "COMMENT_BLOCK", "COMMENT", "INT_CONSTANT", "REAL_CONSTANT", 
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(20);
					((ProgramContext)_localctx).varDefinition = varDefinition();
					_localctx.definitions.addAll(((ProgramContext)_localctx).varDefinition.ast);
					}
					break;
				case T__28:
					{
					setState(23);
					((ProgramContext)_localctx).funcDefinition = funcDefinition();
					_localctx.definitions.add(((ProgramContext)_localctx).funcDefinition.ast);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__28 || _la==ID );
			 ((ProgramContext)_localctx).ast =  new Program(_localctx.definitions, _localctx.definitions.get(_localctx.definitions.size()-1).getLine()
			            , _localctx.definitions.get(_localctx.definitions.size()-1).getColumn());
			setState(31);
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
		public List<Expression> params = new ArrayList<Expression>();
		public ExpressionContext expr1;
		public ExpressionContext expr;
		public ExpressionContext left;
		public Token ID;
		public ExpressionContext expression;
		public ExpressionContext expr2;
		public TypeContext type;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token OP;
		public ExpressionContext right;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(34);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(35);
				match(T__0);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674417026L) != 0) {
					{
					setState(36);
					((ExpressionContext)_localctx).expr1 = ((ExpressionContext)_localctx).expression = expression(0);
					_localctx.params.add(((ExpressionContext)_localctx).expr1.ast);
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(38);
						match(T__1);
						setState(39);
						((ExpressionContext)_localctx).expr2 = ((ExpressionContext)_localctx).expression = expression(0);
						_localctx.params.add(((ExpressionContext)_localctx).expr2.ast);
						}
						}
						setState(46);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(49);
				match(T__2);

				          List<Expression> aux = new ArrayList<Expression>();
				          for(Expression expr: _localctx.params){
				              aux.add(expr);
				          }
				          ((ExpressionContext)_localctx).ast =  new FunctionInvocation(
				                 new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1),
				                 aux,((ExpressionContext)_localctx).expr1.ast.getLine(), ((ExpressionContext)_localctx).expr1.ast.getColumn());
				        
				}
				break;
			case 2:
				{
				setState(51);
				match(T__0);
				setState(52);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(53);
				match(T__2);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 3:
				{
				setState(56);
				match(T__0);
				setState(57);
				((ExpressionContext)_localctx).type = type();
				setState(58);
				match(T__2);
				setState(59);
				((ExpressionContext)_localctx).expression = expression(11);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).type.ast,((ExpressionContext)_localctx).expression.ast,
				                                               ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				}
				break;
			case 4:
				{
				setState(62);
				match(T__6);
				setState(63);
				((ExpressionContext)_localctx).expression = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).expression.ast,
				                                            ((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn());
				}
				break;
			case 5:
				{
				setState(66);
				match(T__7);
				setState(67);
				((ExpressionContext)_localctx).expression = expression(9);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).expression.ast,
				                               ((ExpressionContext)_localctx).expression.ast.getLine(),((ExpressionContext)_localctx).expression.ast.getColumn());
				}
				break;
			case 6:
				{
				setState(70);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)),
				                                    ((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 7:
				{
				setState(72);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealLiteral(LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)),
				                                    ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1 ); 
				}
				break;
			case 8:
				{
				setState(74);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)),
				                                    ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1); 
				}
				break;
			case 9:
				{
				setState(76);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1 ); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(81);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
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
						setState(85);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(86);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__11) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
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
						setState(90);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(91);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
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
						setState(95);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(96);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(97);
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
						setState(100);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(101);
						match(T__3);
						setState(102);
						((ExpressionContext)_localctx).expr2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(103);
						match(T__4);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).expr1.ast,((ExpressionContext)_localctx).expr2.ast,
						                                                                ((ExpressionContext)_localctx).expr1.ast.getLine(),((ExpressionContext)_localctx).expr1.ast.getColumn());
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(107);
						match(T__5);
						setState(108);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new StructAccess((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).expr.ast,
						                                                                  ((ExpressionContext)_localctx).expr.ast.getLine(), ((ExpressionContext)_localctx).expr.ast.getColumn());
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public Token INT_CONSTANT;
		public TypeContext type;
		public RecordFieldsContext recordFields;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<RecordFieldsContext> recordFields() {
			return getRuleContexts(RecordFieldsContext.class);
		}
		public RecordFieldsContext recordFields(int i) {
			return getRuleContext(RecordFieldsContext.class,i);
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
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__20);
				((TypeContext)_localctx).ast =  new IntType();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__21);
				((TypeContext)_localctx).ast =  new DoubleType();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(T__22);
				((TypeContext)_localctx).ast =  new CharType();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T__3);
				setState(122);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(123);
				match(T__4);
				setState(124);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),
				                                                        ((TypeContext)_localctx).type.ast);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				match(T__23);
				setState(128);
				match(T__24);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(129);
					((TypeContext)_localctx).recordFields = recordFields();
					_localctx.rfs.addAll(((TypeContext)_localctx).recordFields.ast);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__25);
				((TypeContext)_localctx).ast =  new RecordType(_localctx.rfs);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 6, RULE_recordFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((RecordFieldsContext)_localctx).ID1 = match(ID);
			_localctx.ids.add((((RecordFieldsContext)_localctx).ID1!=null?((RecordFieldsContext)_localctx).ID1.getText():null));
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(143);
				match(T__1);
				setState(144);
				((RecordFieldsContext)_localctx).ID2 = match(ID);
				_localctx.ids.add((((RecordFieldsContext)_localctx).ID2!=null?((RecordFieldsContext)_localctx).ID2.getText():null));
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(T__26);
			setState(152);
			((RecordFieldsContext)_localctx).type = type();
			for(String id: _localctx.ids) {
			                    _localctx.ast.add(
			                        new RecordField(id,((RecordFieldsContext)_localctx).type.ast,((RecordFieldsContext)_localctx).ID1.getLine(),((RecordFieldsContext)_localctx).ID1.getCharPositionInLine()+1));
			                  }
			                
			setState(154);
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
	public static class VarDefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
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
		enterRule(_localctx, 8, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((VarDefinitionContext)_localctx).ID1 = match(ID);
			_localctx.ids.add((((VarDefinitionContext)_localctx).ID1!=null?((VarDefinitionContext)_localctx).ID1.getText():null));
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(158);
				match(T__1);
				setState(159);
				((VarDefinitionContext)_localctx).ID2 = match(ID);
				_localctx.ids.add((((VarDefinitionContext)_localctx).ID2!=null?((VarDefinitionContext)_localctx).ID2.getText():null));
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(T__26);
			setState(167);
			((VarDefinitionContext)_localctx).type = type();

			            for(String id: _localctx.ids){
			                _localctx.ast.add(
			                  new VarDefinition(((VarDefinitionContext)_localctx).type.ast,id,((VarDefinitionContext)_localctx).ID1.getLine(),((VarDefinitionContext)_localctx).ID1.getCharPositionInLine()+1));
			            }
			       
			setState(169);
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
		enterRule(_localctx, 10, RULE_funcDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__28);
			setState(172);
			((FuncDefinitionContext)_localctx).ID = match(ID);
			setState(173);
			match(T__0);
			setState(174);
			((FuncDefinitionContext)_localctx).parameters = parameters();
			setState(175);
			match(T__2);
			setState(176);
			match(T__26);
			setState(177);
			((FuncDefinitionContext)_localctx).returnType = returnType();
			setState(178);
			match(T__24);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					((FuncDefinitionContext)_localctx).varDefinition = varDefinition();
					_localctx.definitions.addAll(((FuncDefinitionContext)_localctx).varDefinition.ast);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16607564792194L) != 0) {
				{
				{
				setState(187);
				((FuncDefinitionContext)_localctx).statement = statement();
				_localctx.statements.add(((FuncDefinitionContext)_localctx).statement.ast);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__25);
			 ((FuncDefinitionContext)_localctx).ast =  new FuncDefinition(
			            new FunctionType(((FuncDefinitionContext)_localctx).returnType.ast, ((FuncDefinitionContext)_localctx).parameters.ast),
			                (((FuncDefinitionContext)_localctx).ID!=null?((FuncDefinitionContext)_localctx).ID.getText():null),
			                _localctx.definitions,
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
	public static class ParametersContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Token ID1;
		public TypeContext type1;
		public Token ID2;
		public TypeContext type2;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(198);
				((ParametersContext)_localctx).ID1 = match(ID);
				setState(199);
				match(T__26);
				setState(200);
				((ParametersContext)_localctx).type1 = type();
				_localctx.ast.add(new VarDefinition(((ParametersContext)_localctx).type1.ast, (((ParametersContext)_localctx).ID1!=null?((ParametersContext)_localctx).ID1.getText():null),
				                                ((ParametersContext)_localctx).ID1.getLine(),((ParametersContext)_localctx).ID1.getCharPositionInLine()+1));
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(202);
					match(T__1);
					setState(203);
					((ParametersContext)_localctx).ID2 = match(ID);
					setState(204);
					match(T__26);
					setState(205);
					((ParametersContext)_localctx).type2 = type();
					_localctx.ast.add(new VarDefinition(((ParametersContext)_localctx).type2.ast, (((ParametersContext)_localctx).ID2!=null?((ParametersContext)_localctx).ID2.getText():null),
					                                                 ((ParametersContext)_localctx).ID2.getLine(),((ParametersContext)_localctx).ID2.getCharPositionInLine()+1));
					}
					}
					setState(212);
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
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 14, RULE_returnType);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((ReturnTypeContext)_localctx).type = type();
				 ((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).type.ast; 
				}
				break;
			case T__24:
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__29);
				setState(222);
				((StatementContext)_localctx).expr1 = expression(0);
				_localctx.exprs.add(((StatementContext)_localctx).expr1.ast);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(224);
					match(T__1);
					setState(225);
					((StatementContext)_localctx).expr2 = expression(0);
					_localctx.exprs.add(((StatementContext)_localctx).expr2.ast);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
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
				setState(236);
				match(T__30);
				setState(237);
				((StatementContext)_localctx).expr1 = expression(0);
				_localctx.exprs.add(((StatementContext)_localctx).expr1.ast);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(239);
					match(T__1);
					setState(240);
					((StatementContext)_localctx).expr2 = expression(0);
					_localctx.exprs.add(((StatementContext)_localctx).expr2.ast);
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
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
				setState(251);
				((StatementContext)_localctx).left = expression(0);
				setState(252);
				match(T__31);
				setState(253);
				((StatementContext)_localctx).right = expression(0);
				setState(254);
				match(T__27);
				((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).right.ast,((StatementContext)_localctx).left.ast,((StatementContext)_localctx).left.ast.getLine(),
				                                                        ((StatementContext)_localctx).left.ast.getColumn());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(T__32);
				setState(258);
				((StatementContext)_localctx).cond = expression(0);
				setState(259);
				match(T__26);
				setState(260);
				((StatementContext)_localctx).bl1 = block();
				_localctx.if_statements.addAll(((StatementContext)_localctx).bl1.ast);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(262);
					match(T__33);
					setState(263);
					match(T__26);
					setState(264);
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
				setState(271);
				match(T__34);
				setState(272);
				((StatementContext)_localctx).cond = expression(0);
				setState(273);
				match(T__26);
				setState(274);
				((StatementContext)_localctx).bl1 = block();
				 ((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).cond.ast, ((StatementContext)_localctx).bl1.ast, ((StatementContext)_localctx).cond.ast.getLine(), ((StatementContext)_localctx).cond.ast.getColumn());
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				match(T__35);
				setState(278);
				((StatementContext)_localctx).expression = expression(0);
				setState(279);
				match(T__27);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).expression.ast,((StatementContext)_localctx).expression.ast.getLine(),
				                                        ((StatementContext)_localctx).expression.ast.getColumn());
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				match(ID);
				setState(283);
				match(T__0);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674417026L) != 0) {
					{
					setState(284);
					expression(0);
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(285);
						match(T__1);
						setState(286);
						expression(0);
						}
						}
						setState(291);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(294);
				match(T__2);
				setState(295);
				match(T__27);
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__6:
			case T__7:
			case T__29:
			case T__30:
			case T__32:
			case T__34:
			case T__35:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				((BlockContext)_localctx).statement = statement();
				_localctx.ast.add(((BlockContext)_localctx).statement.ast);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__24);
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(302);
					((BlockContext)_localctx).statement = statement();
					_localctx.ast.add(((BlockContext)_localctx).statement.ast);
					}
					}
					setState(307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 16607564792194L) != 0 );
				setState(309);
				match(T__25);
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
		"\u0004\u0001+\u013a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f\u0000"+
		"\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001+\b\u0001\n\u0001\f\u0001.\t\u0001\u0003\u00010\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"O\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001o\b\u0001\n\u0001\f\u0001r\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0085\b\u0002"+
		"\n\u0002\f\u0002\u0088\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008c"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u0093\b\u0003\n\u0003\f\u0003\u0096\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00a2\b\u0004\n\u0004\f\u0004\u00a5"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b7"+
		"\b\u0005\n\u0005\f\u0005\u00ba\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00bf\b\u0005\n\u0005\f\u0005\u00c2\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00d1\b\u0006\n\u0006\f\u0006\u00d4\t\u0006\u0003\u0006\u00d6\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00dc"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00e5\b\b\n\b\f\b\u00e8\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f4\b\b\n\b\f\b\u00f7"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u010c\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0120\b\b\n\b\f\b\u0123\t\b\u0003\b"+
		"\u0125\b\b\u0001\b\u0001\b\u0003\b\u0129\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0004\t\u0132\b\t\u000b\t\f\t\u0133\u0001\t"+
		"\u0001\t\u0003\t\u0138\b\t\u0001\t\u0000\u0001\u0002\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0004\u0001\u0000\t\u000b\u0002\u0000"+
		"\u0007\u0007\f\f\u0001\u0000\r\u0012\u0001\u0000\u0013\u0014\u015a\u0000"+
		"\u001a\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000\u0004\u008b"+
		"\u0001\u0000\u0000\u0000\u0006\u008d\u0001\u0000\u0000\u0000\b\u009c\u0001"+
		"\u0000\u0000\u0000\n\u00ab\u0001\u0000\u0000\u0000\f\u00d5\u0001\u0000"+
		"\u0000\u0000\u000e\u00db\u0001\u0000\u0000\u0000\u0010\u0128\u0001\u0000"+
		"\u0000\u0000\u0012\u0137\u0001\u0000\u0000\u0000\u0014\u0015\u0003\b\u0004"+
		"\u0000\u0015\u0016\u0006\u0000\uffff\uffff\u0000\u0016\u001b\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0003\n\u0005\u0000\u0018\u0019\u0006\u0000\uffff"+
		"\uffff\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0014\u0001\u0000"+
		"\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0006\u0000"+
		"\uffff\uffff\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000\u0000"+
		"\u0000!\"\u0006\u0001\uffff\uffff\u0000\"#\u0005+\u0000\u0000#/\u0005"+
		"\u0001\u0000\u0000$%\u0003\u0002\u0001\u0000%,\u0006\u0001\uffff\uffff"+
		"\u0000&\'\u0005\u0002\u0000\u0000\'(\u0003\u0002\u0001\u0000()\u0006\u0001"+
		"\uffff\uffff\u0000)+\u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/$\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005"+
		"\u0003\u0000\u00002O\u0006\u0001\uffff\uffff\u000034\u0005\u0001\u0000"+
		"\u000045\u0003\u0002\u0001\u000056\u0005\u0003\u0000\u000067\u0006\u0001"+
		"\uffff\uffff\u00007O\u0001\u0000\u0000\u000089\u0005\u0001\u0000\u0000"+
		"9:\u0003\u0004\u0002\u0000:;\u0005\u0003\u0000\u0000;<\u0003\u0002\u0001"+
		"\u000b<=\u0006\u0001\uffff\uffff\u0000=O\u0001\u0000\u0000\u0000>?\u0005"+
		"\u0007\u0000\u0000?@\u0003\u0002\u0001\n@A\u0006\u0001\uffff\uffff\u0000"+
		"AO\u0001\u0000\u0000\u0000BC\u0005\b\u0000\u0000CD\u0003\u0002\u0001\t"+
		"DE\u0006\u0001\uffff\uffff\u0000EO\u0001\u0000\u0000\u0000FG\u0005(\u0000"+
		"\u0000GO\u0006\u0001\uffff\uffff\u0000HI\u0005)\u0000\u0000IO\u0006\u0001"+
		"\uffff\uffff\u0000JK\u0005*\u0000\u0000KO\u0006\u0001\uffff\uffff\u0000"+
		"LM\u0005+\u0000\u0000MO\u0006\u0001\uffff\uffff\u0000N!\u0001\u0000\u0000"+
		"\u0000N3\u0001\u0000\u0000\u0000N8\u0001\u0000\u0000\u0000N>\u0001\u0000"+
		"\u0000\u0000NB\u0001\u0000\u0000\u0000NF\u0001\u0000\u0000\u0000NH\u0001"+
		"\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"Op\u0001\u0000\u0000\u0000PQ\n\b\u0000\u0000QR\u0007\u0000\u0000\u0000"+
		"RS\u0003\u0002\u0001\tST\u0006\u0001\uffff\uffff\u0000To\u0001\u0000\u0000"+
		"\u0000UV\n\u0007\u0000\u0000VW\u0007\u0001\u0000\u0000WX\u0003\u0002\u0001"+
		"\bXY\u0006\u0001\uffff\uffff\u0000Yo\u0001\u0000\u0000\u0000Z[\n\u0006"+
		"\u0000\u0000[\\\u0007\u0002\u0000\u0000\\]\u0003\u0002\u0001\u0007]^\u0006"+
		"\u0001\uffff\uffff\u0000^o\u0001\u0000\u0000\u0000_`\n\u0005\u0000\u0000"+
		"`a\u0007\u0003\u0000\u0000ab\u0003\u0002\u0001\u0006bc\u0006\u0001\uffff"+
		"\uffff\u0000co\u0001\u0000\u0000\u0000de\n\r\u0000\u0000ef\u0005\u0004"+
		"\u0000\u0000fg\u0003\u0002\u0001\u0000gh\u0005\u0005\u0000\u0000hi\u0006"+
		"\u0001\uffff\uffff\u0000io\u0001\u0000\u0000\u0000jk\n\f\u0000\u0000k"+
		"l\u0005\u0006\u0000\u0000lm\u0005+\u0000\u0000mo\u0006\u0001\uffff\uffff"+
		"\u0000nP\u0001\u0000\u0000\u0000nU\u0001\u0000\u0000\u0000nZ\u0001\u0000"+
		"\u0000\u0000n_\u0001\u0000\u0000\u0000nd\u0001\u0000\u0000\u0000nj\u0001"+
		"\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000q\u0003\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000st\u0005\u0015\u0000\u0000t\u008c\u0006\u0002\uffff\uffff"+
		"\u0000uv\u0005\u0016\u0000\u0000v\u008c\u0006\u0002\uffff\uffff\u0000"+
		"wx\u0005\u0017\u0000\u0000x\u008c\u0006\u0002\uffff\uffff\u0000yz\u0005"+
		"\u0004\u0000\u0000z{\u0005(\u0000\u0000{|\u0005\u0005\u0000\u0000|}\u0003"+
		"\u0004\u0002\u0000}~\u0006\u0002\uffff\uffff\u0000~\u008c\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u0018\u0000\u0000\u0080\u0086\u0005\u0019"+
		"\u0000\u0000\u0081\u0082\u0003\u0006\u0003\u0000\u0082\u0083\u0006\u0002"+
		"\uffff\uffff\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0081\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"\u001a\u0000\u0000\u008a\u008c\u0006\u0002\uffff\uffff\u0000\u008bs\u0001"+
		"\u0000\u0000\u0000\u008bu\u0001\u0000\u0000\u0000\u008bw\u0001\u0000\u0000"+
		"\u0000\u008by\u0001\u0000\u0000\u0000\u008b\u007f\u0001\u0000\u0000\u0000"+
		"\u008c\u0005\u0001\u0000\u0000\u0000\u008d\u008e\u0005+\u0000\u0000\u008e"+
		"\u0094\u0006\u0003\uffff\uffff\u0000\u008f\u0090\u0005\u0002\u0000\u0000"+
		"\u0090\u0091\u0005+\u0000\u0000\u0091\u0093\u0006\u0003\uffff\uffff\u0000"+
		"\u0092\u008f\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005\u001b\u0000\u0000\u0098\u0099\u0003\u0004\u0002\u0000"+
		"\u0099\u009a\u0006\u0003\uffff\uffff\u0000\u009a\u009b\u0005\u001c\u0000"+
		"\u0000\u009b\u0007\u0001\u0000\u0000\u0000\u009c\u009d\u0005+\u0000\u0000"+
		"\u009d\u00a3\u0006\u0004\uffff\uffff\u0000\u009e\u009f\u0005\u0002\u0000"+
		"\u0000\u009f\u00a0\u0005+\u0000\u0000\u00a0\u00a2\u0006\u0004\uffff\uffff"+
		"\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\u001b\u0000\u0000\u00a7\u00a8\u0003\u0004\u0002"+
		"\u0000\u00a8\u00a9\u0006\u0004\uffff\uffff\u0000\u00a9\u00aa\u0005\u001c"+
		"\u0000\u0000\u00aa\t\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u001d\u0000"+
		"\u0000\u00ac\u00ad\u0005+\u0000\u0000\u00ad\u00ae\u0005\u0001\u0000\u0000"+
		"\u00ae\u00af\u0003\f\u0006\u0000\u00af\u00b0\u0005\u0003\u0000\u0000\u00b0"+
		"\u00b1\u0005\u001b\u0000\u0000\u00b1\u00b2\u0003\u000e\u0007\u0000\u00b2"+
		"\u00b8\u0005\u0019\u0000\u0000\u00b3\u00b4\u0003\b\u0004\u0000\u00b4\u00b5"+
		"\u0006\u0005\uffff\uffff\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00c0\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0003\u0010\b\u0000\u00bc\u00bd\u0006\u0005\uffff\uffff\u0000\u00bd"+
		"\u00bf\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u001a\u0000\u0000\u00c4"+
		"\u00c5\u0006\u0005\uffff\uffff\u0000\u00c5\u000b\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005+\u0000\u0000\u00c7\u00c8\u0005\u001b\u0000\u0000\u00c8"+
		"\u00c9\u0003\u0004\u0002\u0000\u00c9\u00d2\u0006\u0006\uffff\uffff\u0000"+
		"\u00ca\u00cb\u0005\u0002\u0000\u0000\u00cb\u00cc\u0005+\u0000\u0000\u00cc"+
		"\u00cd\u0005\u001b\u0000\u0000\u00cd\u00ce\u0003\u0004\u0002\u0000\u00ce"+
		"\u00cf\u0006\u0006\uffff\uffff\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d5\u00c6\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\r\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003\u0004\u0002\u0000\u00d8"+
		"\u00d9\u0006\u0007\uffff\uffff\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00da\u00dc\u0006\u0007\uffff\uffff\u0000\u00db\u00d7\u0001\u0000\u0000"+
		"\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u000f\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005\u001e\u0000\u0000\u00de\u00df\u0003\u0002\u0001"+
		"\u0000\u00df\u00e6\u0006\b\uffff\uffff\u0000\u00e0\u00e1\u0005\u0002\u0000"+
		"\u0000\u00e1\u00e2\u0003\u0002\u0001\u0000\u00e2\u00e3\u0006\b\uffff\uffff"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001c\u0000"+
		"\u0000\u00ea\u00eb\u0006\b\uffff\uffff\u0000\u00eb\u0129\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0005\u001f\u0000\u0000\u00ed\u00ee\u0003\u0002\u0001"+
		"\u0000\u00ee\u00f5\u0006\b\uffff\uffff\u0000\u00ef\u00f0\u0005\u0002\u0000"+
		"\u0000\u00f0\u00f1\u0003\u0002\u0001\u0000\u00f1\u00f2\u0006\b\uffff\uffff"+
		"\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u001c\u0000"+
		"\u0000\u00f9\u00fa\u0006\b\uffff\uffff\u0000\u00fa\u0129\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0003\u0002\u0001\u0000\u00fc\u00fd\u0005 \u0000\u0000"+
		"\u00fd\u00fe\u0003\u0002\u0001\u0000\u00fe\u00ff\u0005\u001c\u0000\u0000"+
		"\u00ff\u0100\u0006\b\uffff\uffff\u0000\u0100\u0129\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0005!\u0000\u0000\u0102\u0103\u0003\u0002\u0001\u0000\u0103"+
		"\u0104\u0005\u001b\u0000\u0000\u0104\u0105\u0003\u0012\t\u0000\u0105\u010b"+
		"\u0006\b\uffff\uffff\u0000\u0106\u0107\u0005\"\u0000\u0000\u0107\u0108"+
		"\u0005\u001b\u0000\u0000\u0108\u0109\u0003\u0012\t\u0000\u0109\u010a\u0006"+
		"\b\uffff\uffff\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0106\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0006\b\uffff\uffff\u0000\u010e\u0129\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005#\u0000\u0000\u0110\u0111\u0003\u0002"+
		"\u0001\u0000\u0111\u0112\u0005\u001b\u0000\u0000\u0112\u0113\u0003\u0012"+
		"\t\u0000\u0113\u0114\u0006\b\uffff\uffff\u0000\u0114\u0129\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005$\u0000\u0000\u0116\u0117\u0003\u0002\u0001"+
		"\u0000\u0117\u0118\u0005\u001c\u0000\u0000\u0118\u0119\u0006\b\uffff\uffff"+
		"\u0000\u0119\u0129\u0001\u0000\u0000\u0000\u011a\u011b\u0005+\u0000\u0000"+
		"\u011b\u0124\u0005\u0001\u0000\u0000\u011c\u0121\u0003\u0002\u0001\u0000"+
		"\u011d\u011e\u0005\u0002\u0000\u0000\u011e\u0120\u0003\u0002\u0001\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000"+
		"\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000"+
		"\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u011c\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u0003\u0000\u0000"+
		"\u0127\u0129\u0005\u001c\u0000\u0000\u0128\u00dd\u0001\u0000\u0000\u0000"+
		"\u0128\u00ec\u0001\u0000\u0000\u0000\u0128\u00fb\u0001\u0000\u0000\u0000"+
		"\u0128\u0101\u0001\u0000\u0000\u0000\u0128\u010f\u0001\u0000\u0000\u0000"+
		"\u0128\u0115\u0001\u0000\u0000\u0000\u0128\u011a\u0001\u0000\u0000\u0000"+
		"\u0129\u0011\u0001\u0000\u0000\u0000\u012a\u012b\u0003\u0010\b\u0000\u012b"+
		"\u012c\u0006\t\uffff\uffff\u0000\u012c\u0138\u0001\u0000\u0000\u0000\u012d"+
		"\u0131\u0005\u0019\u0000\u0000\u012e\u012f\u0003\u0010\b\u0000\u012f\u0130"+
		"\u0006\t\uffff\uffff\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u012e"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u001a\u0000\u0000\u0136\u0138"+
		"\u0001\u0000\u0000\u0000\u0137\u012a\u0001\u0000\u0000\u0000\u0137\u012d"+
		"\u0001\u0000\u0000\u0000\u0138\u0013\u0001\u0000\u0000\u0000\u0018\u001a"+
		"\u001c,/Nnp\u0086\u008b\u0094\u00a3\u00b8\u00c0\u00d2\u00d5\u00db\u00e6"+
		"\u00f5\u010b\u0121\u0124\u0128\u0133\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}