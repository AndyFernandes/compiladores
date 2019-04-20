package visitor;

import syntaxtree.*;

public interface Visitor {
  public void visit(AndExpression n);
  public void visit(ArrayAssignStatement n);
  public void visit(ArrayType n);
  public void visit(AssignStatement n);
  public void visit(BigExpression n);
  public void visit(BlockExpression n);
  public void visit(BlockStatement n);
  public void visit(BooleanType n);
  public void visit(Class n);
  public void visit(ClassDeclaration n);
  public void visit(ClassDeclarationExtends n);
  public void visit(Expression n);
  public void visit(FalseExpression n);
  public void visit(Formal n);
  public void visit(Goal n);
  public void visit(Identifier n);
  public void visit(IdentifierExpression n);
  public void visit(IdentifierType n);
  public void visit(IfStatement n);
  public void visit(IntegerLiteralExpression n);
  public void visit(IntegerType n);
  public void visit(LengthExpression n);
  public void visit(LessExpression n);
  public void visit(ListExpression n);
  public void visit(Main n);
  public void visit(MainClass n);
  public void visit(MethodDeclaration n);
  public void visit(MethodDefinition n);
  public void visit(MinusExpression n);
  public void visit(MultExpression n);
  public void visit(NewIdentifierExpression n);
  public void visit(NewIntegerExpression n);
  public void visit(NotExpression n);
  public void visit(PlusExpression n);
  public void visit(PrintStatement n);
  public void visit(Program n);
  public void visit(Statement n);
  public void visit(ThisExpression n);
  public void visit(TrueExpression n);
  public void visit(Type n);
  public void visit(VarDeclaration n);
  public void visit(VarDefinition n);
  public void visit(WhileStatement n);
}