// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link squealParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface squealVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link squealParser#parse_prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_prog(squealParser.Parse_progContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(squealParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code create_state}
	 * labeled alternative in {@link squealParser#create_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_state(squealParser.Create_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insert_state}
	 * labeled alternative in {@link squealParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_state(squealParser.Insert_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read_state}
	 * labeled alternative in {@link squealParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_state(squealParser.Read_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code update_state}
	 * labeled alternative in {@link squealParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_state(squealParser.Update_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code delete_state}
	 * labeled alternative in {@link squealParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_state(squealParser.Delete_stateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code drop_state}
	 * labeled alternative in {@link squealParser#drop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_state(squealParser.Drop_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#read_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_expression(squealParser.Read_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#columndef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumndef(squealParser.ColumndefContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(squealParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(squealParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(squealParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(squealParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#and_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_condition(squealParser.And_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(squealParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(squealParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#summand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummand(squealParser.SummandContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(squealParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(squealParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(squealParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link squealParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(squealParser.AliasContext ctx);
}