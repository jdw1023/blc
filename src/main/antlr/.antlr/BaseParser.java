// Generated from /home/jd/Projects/CISC471/blc/src/main/antlr/Base.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, LBRACKET=5, RBRACKET=6, DOT=7, 
		COMMA=8, COLON=9, SEMICOLON=10, CONJ=11, DISJ=12, EQUAL=13, EQUAL_EQUAL=14, 
		BANG_EQUAL=15, BANG=16, PLUS=17, MINUS=18, STAR=19, SLASH=20, PERCENT=21, 
		ARROW=22, FUN=23, IF=24, ELSE=25, STRUCT=26, WHILE=27, RETURN=28, VAR=29, 
		LESS=30, LESS_EQUAL=31, GREATER=32, GREATER_EQUAL=33, TRUE=34, FALSE=35, 
		UNIT=36, IDENTIFIER=37, INT_LITERAL=38, STRING_LITERAL=39, DelimitedComment=40, 
		LineComment=41, WS=42;
	public static final int
		RULE_compilatonUnit = 0, RULE_declaration = 1, RULE_parameter = 2, RULE_field = 3, 
		RULE_stmt = 4, RULE_block = 5, RULE_expr = 6, RULE_typeExpression = 7, 
		RULE_reference = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilatonUnit", "declaration", "parameter", "field", "stmt", "block", 
			"expr", "typeExpression", "reference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "','", "':'", 
			"';'", "'&&'", "'||'", "'='", "'=='", "'!='", "'!'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'->'", "'fun'", "'if'", "'else'", "'struct'", "'while'", 
			"'return'", "'var'", "'<'", "'<='", "'>'", "'>='", "'true'", "'false'", 
			"'unit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
			"DOT", "COMMA", "COLON", "SEMICOLON", "CONJ", "DISJ", "EQUAL", "EQUAL_EQUAL", 
			"BANG_EQUAL", "BANG", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "ARROW", 
			"FUN", "IF", "ELSE", "STRUCT", "WHILE", "RETURN", "VAR", "LESS", "LESS_EQUAL", 
			"GREATER", "GREATER_EQUAL", "TRUE", "FALSE", "UNIT", "IDENTIFIER", "INT_LITERAL", 
			"STRING_LITERAL", "DelimitedComment", "LineComment", "WS"
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
	public String getGrammarFileName() { return "Base.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilatonUnitContext extends ParserRuleContext {
		public DeclarationContext declaration;
		public List<DeclarationContext> declarations = new ArrayList<DeclarationContext>();
		public TerminalNode EOF() { return getToken(BaseParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public CompilatonUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilatonUnit; }
	}

	public final CompilatonUnitContext compilatonUnit() throws RecognitionException {
		CompilatonUnitContext _localctx = new CompilatonUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilatonUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET) | (1L << BANG) | (1L << MINUS) | (1L << FUN) | (1L << IF) | (1L << STRUCT) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << TRUE) | (1L << FALSE) | (1L << UNIT) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
				{
				{
				setState(18);
				((CompilatonUnitContext)_localctx).declaration = declaration();
				((CompilatonUnitContext)_localctx).declarations.add(((CompilatonUnitContext)_localctx).declaration);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructDeclarationContext extends DeclarationContext {
		public Token name;
		public FieldContext field;
		public List<FieldContext> fields = new ArrayList<FieldContext>();
		public TerminalNode STRUCT() { return getToken(BaseParser.STRUCT, 0); }
		public TerminalNode LBRACKET() { return getToken(BaseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BaseParser.RBRACKET, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BaseParser.IDENTIFIER, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BaseParser.COMMA, i);
		}
		public StructDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class StatementAsDeclarationContext extends DeclarationContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StatementAsDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionDeclarationContext extends DeclarationContext {
		public Token name;
		public ParameterContext parameter;
		public List<ParameterContext> parameters = new ArrayList<ParameterContext>();
		public TypeExpressionContext returnType;
		public BlockContext body;
		public TerminalNode FUN() { return getToken(BaseParser.FUN, 0); }
		public TerminalNode LPAREN() { return getToken(BaseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BaseParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(BaseParser.ARROW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BaseParser.IDENTIFIER, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BaseParser.COMMA, i);
		}
		public FunctionDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class VariableDeclarationContext extends DeclarationContext {
		public Token name;
		public TypeExpressionContext type;
		public ExprContext initializer;
		public TerminalNode VAR() { return getToken(BaseParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(BaseParser.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(BaseParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(BaseParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BaseParser.IDENTIFIER, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			int _alt;
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUN:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(FUN);
				setState(27);
				((FunctionDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(28);
				match(LPAREN);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(29);
					((FunctionDeclarationContext)_localctx).parameter = parameter();
					((FunctionDeclarationContext)_localctx).parameters.add(((FunctionDeclarationContext)_localctx).parameter);
					setState(34);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(30);
							match(COMMA);
							setState(31);
							((FunctionDeclarationContext)_localctx).parameter = parameter();
							((FunctionDeclarationContext)_localctx).parameters.add(((FunctionDeclarationContext)_localctx).parameter);
							}
							} 
						}
						setState(36);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(37);
						match(COMMA);
						}
					}

					}
				}

				setState(42);
				match(RPAREN);
				setState(43);
				match(ARROW);
				setState(44);
				((FunctionDeclarationContext)_localctx).returnType = typeExpression();
				setState(45);
				((FunctionDeclarationContext)_localctx).body = block();
				}
				break;
			case STRUCT:
				_localctx = new StructDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(STRUCT);
				setState(48);
				((StructDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(49);
				match(LBRACKET);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(50);
					((StructDeclarationContext)_localctx).field = field();
					((StructDeclarationContext)_localctx).fields.add(((StructDeclarationContext)_localctx).field);
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(51);
							match(COMMA);
							setState(52);
							((StructDeclarationContext)_localctx).field = field();
							((StructDeclarationContext)_localctx).fields.add(((StructDeclarationContext)_localctx).field);
							}
							} 
						}
						setState(57);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(58);
						match(COMMA);
						}
					}

					}
				}

				setState(63);
				match(RBRACKET);
				}
				break;
			case VAR:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(VAR);
				setState(65);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(66);
				match(COLON);
				setState(67);
				((VariableDeclarationContext)_localctx).type = typeExpression();
				setState(68);
				match(EQUAL);
				setState(69);
				((VariableDeclarationContext)_localctx).initializer = expr(0);
				setState(70);
				match(SEMICOLON);
				}
				break;
			case LPAREN:
			case LBRACE:
			case LBRACKET:
			case BANG:
			case MINUS:
			case IF:
			case WHILE:
			case RETURN:
			case TRUE:
			case FALSE:
			case UNIT:
			case IDENTIFIER:
			case INT_LITERAL:
			case STRING_LITERAL:
				_localctx = new StatementAsDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				stmt();
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

	public static class ParameterContext extends ParserRuleContext {
		public Token name;
		public TypeExpressionContext type;
		public TerminalNode COLON() { return getToken(BaseParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BaseParser.IDENTIFIER, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((ParameterContext)_localctx).name = match(IDENTIFIER);
			setState(76);
			match(COLON);
			setState(77);
			((ParameterContext)_localctx).type = typeExpression();
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

	public static class FieldContext extends ParserRuleContext {
		public Token name;
		public TypeExpressionContext type;
		public TerminalNode COLON() { return getToken(BaseParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BaseParser.IDENTIFIER, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((FieldContext)_localctx).name = match(IDENTIFIER);
			setState(80);
			match(COLON);
			setState(81);
			((FieldContext)_localctx).type = typeExpression();
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStmtContext extends StmtContext {
		public ExprContext condition;
		public StmtContext body;
		public TerminalNode WHILE() { return getToken(BaseParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(BaseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BaseParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class IfStmtContext extends StmtContext {
		public ExprContext condition;
		public StmtContext thenStatement;
		public StmtContext elseStatement;
		public TerminalNode IF() { return getToken(BaseParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(BaseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BaseParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BaseParser.ELSE, 0); }
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class BlockAsStatementContext extends StmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockAsStatementContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ExpressionStmtContext extends StmtContext {
		public ExprContext expression;
		public TerminalNode SEMICOLON() { return getToken(BaseParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStmtContext extends StmtContext {
		public ExprContext expression;
		public TerminalNode RETURN() { return getToken(BaseParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(BaseParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				_localctx = new BlockAsStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				block();
				}
				break;
			case LPAREN:
			case LBRACE:
			case BANG:
			case MINUS:
			case TRUE:
			case FALSE:
			case UNIT:
			case IDENTIFIER:
			case INT_LITERAL:
			case STRING_LITERAL:
				_localctx = new ExpressionStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((ExpressionStmtContext)_localctx).expression = expr(0);
				setState(85);
				match(SEMICOLON);
				}
				break;
			case IF:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(IF);
				setState(88);
				match(LPAREN);
				setState(89);
				((IfStmtContext)_localctx).condition = expr(0);
				setState(90);
				match(RPAREN);
				setState(91);
				((IfStmtContext)_localctx).thenStatement = stmt();
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(92);
					match(ELSE);
					setState(93);
					((IfStmtContext)_localctx).elseStatement = stmt();
					}
					break;
				}
				}
				break;
			case RETURN:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(RETURN);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << UNIT) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(97);
					((ReturnStmtContext)_localctx).expression = expr(0);
					}
				}

				setState(100);
				match(SEMICOLON);
				}
				break;
			case WHILE:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				match(WHILE);
				setState(102);
				match(LPAREN);
				setState(103);
				((WhileStmtContext)_localctx).condition = expr(0);
				setState(104);
				match(RPAREN);
				setState(105);
				((WhileStmtContext)_localctx).body = stmt();
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

	public static class BlockContext extends ParserRuleContext {
		public DeclarationContext declaration;
		public List<DeclarationContext> declarations = new ArrayList<DeclarationContext>();
		public TerminalNode LBRACKET() { return getToken(BaseParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(BaseParser.RBRACKET, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LBRACKET);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACKET) | (1L << BANG) | (1L << MINUS) | (1L << FUN) | (1L << IF) | (1L << STRUCT) | (1L << WHILE) | (1L << RETURN) | (1L << VAR) | (1L << TRUE) | (1L << FALSE) | (1L << UNIT) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
				{
				{
				setState(110);
				((BlockContext)_localctx).declaration = declaration();
				((BlockContext)_localctx).declarations.add(((BlockContext)_localctx).declaration);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(RBRACKET);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLiteralContext extends ExprContext {
		public ExprContext expr;
		public List<ExprContext> elements = new ArrayList<ExprContext>();
		public TerminalNode LBRACE() { return getToken(BaseParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BaseParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BaseParser.COMMA, i);
		}
		public ArrayLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentContext extends ExprContext {
		public ExprContext lvalue;
		public ExprContext expression;
		public TerminalNode EQUAL() { return getToken(BaseParser.EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FieldSelectContext extends ExprContext {
		public ExprContext expression;
		public Token name;
		public TerminalNode DOT() { return getToken(BaseParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(BaseParser.IDENTIFIER, 0); }
		public FieldSelectContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntLiteralContext extends ExprContext {
		public Token value;
		public TerminalNode INT_LITERAL() { return getToken(BaseParser.INT_LITERAL, 0); }
		public IntLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ReferenceAsExpressionContext extends ExprContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferenceAsExpressionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IndexContext extends ExprContext {
		public ExprContext expression;
		public ExprContext index;
		public TerminalNode LBRACE() { return getToken(BaseParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BaseParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IndexContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnitLiteralContext extends ExprContext {
		public TerminalNode UNIT() { return getToken(BaseParser.UNIT, 0); }
		public UnitLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CallContext extends ExprContext {
		public ExprContext callee;
		public ExprContext expr;
		public List<ExprContext> arguments = new ArrayList<ExprContext>();
		public TerminalNode LPAREN() { return getToken(BaseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BaseParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BaseParser.COMMA, i);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryPrefixContext extends ExprContext {
		public Token operator;
		public ExprContext operand;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BANG() { return getToken(BaseParser.BANG, 0); }
		public TerminalNode MINUS() { return getToken(BaseParser.MINUS, 0); }
		public UnaryPrefixContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class StringLiteralContext extends ExprContext {
		public Token value;
		public TerminalNode STRING_LITERAL() { return getToken(BaseParser.STRING_LITERAL, 0); }
		public StringLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedContext extends ExprContext {
		public ExprContext expression;
		public TerminalNode LPAREN() { return getToken(BaseParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BaseParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesizedContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public Token operator;
		public TerminalNode DISJ() { return getToken(BaseParser.DISJ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CONJ() { return getToken(BaseParser.CONJ, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(BaseParser.EQUAL_EQUAL, 0); }
		public TerminalNode BANG_EQUAL() { return getToken(BaseParser.BANG_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(BaseParser.GREATER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(BaseParser.GREATER_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(BaseParser.LESS, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(BaseParser.LESS_EQUAL, 0); }
		public TerminalNode PLUS() { return getToken(BaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BaseParser.MINUS, 0); }
		public TerminalNode PERCENT() { return getToken(BaseParser.PERCENT, 0); }
		public TerminalNode STAR() { return getToken(BaseParser.STAR, 0); }
		public BinaryContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanLiteralContext extends ExprContext {
		public Token value;
		public TerminalNode TRUE() { return getToken(BaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BaseParser.FALSE, 0); }
		public BooleanLiteralContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BANG:
			case MINUS:
				{
				_localctx = new UnaryPrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				((UnaryPrefixContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==MINUS) ) {
					((UnaryPrefixContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(120);
				((UnaryPrefixContext)_localctx).operand = expr(11);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenthesizedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(LPAREN);
				setState(122);
				((ParenthesizedContext)_localctx).expression = expr(0);
				setState(123);
				match(RPAREN);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				((BooleanLiteralContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BooleanLiteralContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case INT_LITERAL:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				((IntLiteralContext)_localctx).value = match(INT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				((StringLiteralContext)_localctx).value = match(STRING_LITERAL);
				}
				break;
			case UNIT:
				{
				_localctx = new UnitLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(UNIT);
				}
				break;
			case LBRACE:
				{
				_localctx = new ArrayLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(LBRACE);
				setState(130);
				((ArrayLiteralContext)_localctx).expr = expr(0);
				((ArrayLiteralContext)_localctx).elements.add(((ArrayLiteralContext)_localctx).expr);
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(131);
						match(COMMA);
						setState(132);
						((ArrayLiteralContext)_localctx).expr = expr(0);
						((ArrayLiteralContext)_localctx).elements.add(((ArrayLiteralContext)_localctx).expr);
						}
						} 
					}
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(138);
					match(COMMA);
					}
				}

				setState(141);
				match(RBRACE);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new ReferenceAsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				reference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AssignmentContext(new ExprContext(_parentctx, _parentState));
						((AssignmentContext)_localctx).lvalue = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(147);
						match(EQUAL);
						setState(148);
						((AssignmentContext)_localctx).expression = expr(18);
						}
						break;
					case 2:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						((BinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(150);
						match(DISJ);
						setState(151);
						((BinaryContext)_localctx).right = expr(18);
						}
						break;
					case 3:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						((BinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(153);
						match(CONJ);
						setState(154);
						((BinaryContext)_localctx).right = expr(17);
						}
						break;
					case 4:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						((BinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(156);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL_EQUAL || _la==BANG_EQUAL) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						((BinaryContext)_localctx).right = expr(16);
						}
						break;
					case 5:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						((BinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(159);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER) | (1L << GREATER_EQUAL))) != 0)) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						((BinaryContext)_localctx).right = expr(15);
						}
						break;
					case 6:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						((BinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(162);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						((BinaryContext)_localctx).right = expr(14);
						}
						break;
					case 7:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						((BinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(165);
						((BinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==STAR || _la==PERCENT) ) {
							((BinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(166);
						((BinaryContext)_localctx).right = expr(13);
						}
						break;
					case 8:
						{
						_localctx = new CallContext(new ExprContext(_parentctx, _parentState));
						((CallContext)_localctx).callee = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(168);
						match(LPAREN);
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << MINUS) | (1L << TRUE) | (1L << FALSE) | (1L << UNIT) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
							{
							setState(169);
							((CallContext)_localctx).expr = expr(0);
							((CallContext)_localctx).arguments.add(((CallContext)_localctx).expr);
							setState(174);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(170);
									match(COMMA);
									setState(171);
									((CallContext)_localctx).expr = expr(0);
									((CallContext)_localctx).arguments.add(((CallContext)_localctx).expr);
									}
									} 
								}
								setState(176);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
							}
							setState(178);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COMMA) {
								{
								setState(177);
								match(COMMA);
								}
							}

							}
						}

						setState(182);
						match(RPAREN);
						}
						break;
					case 9:
						{
						_localctx = new IndexContext(new ExprContext(_parentctx, _parentState));
						((IndexContext)_localctx).expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(184);
						match(LBRACE);
						setState(185);
						((IndexContext)_localctx).index = expr(0);
						setState(186);
						match(RBRACE);
						}
						break;
					case 10:
						{
						_localctx = new FieldSelectContext(new ExprContext(_parentctx, _parentState));
						((FieldSelectContext)_localctx).expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(189);
						match(DOT);
						setState(190);
						((FieldSelectContext)_localctx).name = match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class TypeExpressionContext extends ParserRuleContext {
		public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpression; }
	 
		public TypeExpressionContext() { }
		public void copyFrom(TypeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeContext extends TypeExpressionContext {
		public TypeExpressionContext elementType;
		public TerminalNode LBRACE() { return getToken(BaseParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BaseParser.RBRACE, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public ArrayTypeContext(TypeExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ReferenceAsTypeContext extends TypeExpressionContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferenceAsTypeContext(TypeExpressionContext ctx) { copyFrom(ctx); }
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeExpression);
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ReferenceAsTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				reference();
				}
				break;
			case LBRACE:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(LBRACE);
				setState(198);
				((ArrayTypeContext)_localctx).elementType = typeExpression();
				setState(199);
				match(RBRACE);
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

	public static class ReferenceContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(BaseParser.IDENTIFIER, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			((ReferenceContext)_localctx).name = match(IDENTIFIER);
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
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3"+
		"\16\3&\13\3\3\3\5\3)\n\3\5\3+\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\5\3>\n\3\5\3@\n\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\6\3\6\5\6e\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\7\7r\n\7\f\7\16\7u\13\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0088"+
		"\n\b\f\b\16\b\u008b\13\b\3\b\5\b\u008e\n\b\3\b\3\b\3\b\5\b\u0093\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00af\n\b\f\b\16\b\u00b2\13\b\3\b"+
		"\5\b\u00b5\n\b\5\b\u00b7\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c2"+
		"\n\b\f\b\16\b\u00c5\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u00cc\n\t\3\n\3\n\3\n"+
		"\2\3\16\13\2\4\6\b\n\f\16\20\22\2\b\4\2\22\22\24\24\3\2$%\3\2\20\21\3"+
		"\2 #\3\2\23\24\4\2\25\25\27\27\2\u00ee\2\27\3\2\2\2\4K\3\2\2\2\6M\3\2"+
		"\2\2\bQ\3\2\2\2\nm\3\2\2\2\fo\3\2\2\2\16\u0092\3\2\2\2\20\u00cb\3\2\2"+
		"\2\22\u00cd\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3"+
		"\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33\3\3"+
		"\2\2\2\34\35\7\31\2\2\35\36\7\'\2\2\36*\7\3\2\2\37$\5\6\4\2 !\7\n\2\2"+
		"!#\5\6\4\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%(\3\2\2\2&$\3\2\2"+
		"\2\')\7\n\2\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*\37\3\2\2\2*+\3\2\2\2+,\3"+
		"\2\2\2,-\7\4\2\2-.\7\30\2\2./\5\20\t\2/\60\5\f\7\2\60L\3\2\2\2\61\62\7"+
		"\34\2\2\62\63\7\'\2\2\63?\7\7\2\2\649\5\b\5\2\65\66\7\n\2\2\668\5\b\5"+
		"\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<"+
		">\7\n\2\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?\64\3\2\2\2?@\3\2\2\2@A\3\2\2"+
		"\2AL\7\b\2\2BC\7\37\2\2CD\7\'\2\2DE\7\13\2\2EF\5\20\t\2FG\7\17\2\2GH\5"+
		"\16\b\2HI\7\f\2\2IL\3\2\2\2JL\5\n\6\2K\34\3\2\2\2K\61\3\2\2\2KB\3\2\2"+
		"\2KJ\3\2\2\2L\5\3\2\2\2MN\7\'\2\2NO\7\13\2\2OP\5\20\t\2P\7\3\2\2\2QR\7"+
		"\'\2\2RS\7\13\2\2ST\5\20\t\2T\t\3\2\2\2Un\5\f\7\2VW\5\16\b\2WX\7\f\2\2"+
		"Xn\3\2\2\2YZ\7\32\2\2Z[\7\3\2\2[\\\5\16\b\2\\]\7\4\2\2]`\5\n\6\2^_\7\33"+
		"\2\2_a\5\n\6\2`^\3\2\2\2`a\3\2\2\2an\3\2\2\2bd\7\36\2\2ce\5\16\b\2dc\3"+
		"\2\2\2de\3\2\2\2ef\3\2\2\2fn\7\f\2\2gh\7\35\2\2hi\7\3\2\2ij\5\16\b\2j"+
		"k\7\4\2\2kl\5\n\6\2ln\3\2\2\2mU\3\2\2\2mV\3\2\2\2mY\3\2\2\2mb\3\2\2\2"+
		"mg\3\2\2\2n\13\3\2\2\2os\7\7\2\2pr\5\4\3\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2"+
		"\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\b\2\2w\r\3\2\2\2xy\b\b\1\2yz\t\2"+
		"\2\2z\u0093\5\16\b\r{|\7\3\2\2|}\5\16\b\2}~\7\4\2\2~\u0093\3\2\2\2\177"+
		"\u0093\t\3\2\2\u0080\u0093\7(\2\2\u0081\u0093\7)\2\2\u0082\u0093\7&\2"+
		"\2\u0083\u0084\7\5\2\2\u0084\u0089\5\16\b\2\u0085\u0086\7\n\2\2\u0086"+
		"\u0088\5\16\b\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008e\7\n\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0090\7\6\2\2\u0090\u0093\3\2\2\2\u0091\u0093\5\22\n\2\u0092"+
		"x\3\2\2\2\u0092{\3\2\2\2\u0092\177\3\2\2\2\u0092\u0080\3\2\2\2\u0092\u0081"+
		"\3\2\2\2\u0092\u0082\3\2\2\2\u0092\u0083\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u00c3\3\2\2\2\u0094\u0095\f\24\2\2\u0095\u0096\7\17\2\2\u0096\u00c2\5"+
		"\16\b\24\u0097\u0098\f\23\2\2\u0098\u0099\7\16\2\2\u0099\u00c2\5\16\b"+
		"\24\u009a\u009b\f\22\2\2\u009b\u009c\7\r\2\2\u009c\u00c2\5\16\b\23\u009d"+
		"\u009e\f\21\2\2\u009e\u009f\t\4\2\2\u009f\u00c2\5\16\b\22\u00a0\u00a1"+
		"\f\20\2\2\u00a1\u00a2\t\5\2\2\u00a2\u00c2\5\16\b\21\u00a3\u00a4\f\17\2"+
		"\2\u00a4\u00a5\t\6\2\2\u00a5\u00c2\5\16\b\20\u00a6\u00a7\f\16\2\2\u00a7"+
		"\u00a8\t\7\2\2\u00a8\u00c2\5\16\b\17\u00a9\u00aa\f\f\2\2\u00aa\u00b6\7"+
		"\3\2\2\u00ab\u00b0\5\16\b\2\u00ac\u00ad\7\n\2\2\u00ad\u00af\5\16\b\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\7\n\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00ab\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00c2\7\4\2\2\u00b9"+
		"\u00ba\f\13\2\2\u00ba\u00bb\7\5\2\2\u00bb\u00bc\5\16\b\2\u00bc\u00bd\7"+
		"\6\2\2\u00bd\u00c2\3\2\2\2\u00be\u00bf\f\n\2\2\u00bf\u00c0\7\t\2\2\u00c0"+
		"\u00c2\7\'\2\2\u00c1\u0094\3\2\2\2\u00c1\u0097\3\2\2\2\u00c1\u009a\3\2"+
		"\2\2\u00c1\u009d\3\2\2\2\u00c1\u00a0\3\2\2\2\u00c1\u00a3\3\2\2\2\u00c1"+
		"\u00a6\3\2\2\2\u00c1\u00a9\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00be\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\17\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cc\5\22\n\2\u00c7\u00c8\7\5\2"+
		"\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\7\6\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\21\3\2\2\2\u00cd\u00ce\7\'\2"+
		"\2\u00ce\23\3\2\2\2\27\27$(*9=?K`dms\u0089\u008d\u0092\u00b0\u00b4\u00b6"+
		"\u00c1\u00c3\u00cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}