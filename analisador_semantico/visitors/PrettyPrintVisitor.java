package visitor;

import syntaxtree.*;

public class PrettyPrintVisitor implements Visitor {

  // MainClass m;
  // ClassDeclList cl;
  public void visit(Program n) {
    n.m.accept(this);
    for ( int i = 0; i < n.cl.size(); i++ ) {
        System.out.println();
        n.cl.elementAt(i).accept(this);
    }
  }
  
  // Identifier i1,i2;
  // Statement s;
  public void visit(Main n) {
    System.out.print("class ");
    n.i1.accept(this);
    System.out.println(" {");
    System.out.print("  public static void main (String [] ");
    n.i2.accept(this);
    System.out.println(") {");
    System.out.print("    ");
    n.s.accept(this);
    System.out.println("  }");
    System.out.println("}");
  }

  // Identifier i;
  // VarDeclList vl;
  // MethodDeclList ml;
  public void visit(Class n) {
    System.out.print("class ");
    n.i.accept(this);
    System.out.println(" { ");
    for ( int i = 0; i < n.vl.size(); i++ ) {
        System.out.print("  ");
        n.vl.elementAt(i).accept(this);
        if ( i+1 < n.vl.size() ) { System.out.println(); }
    }
    for ( int i = 0; i < n.ml.size(); i++ ) {
        System.out.println();
        n.ml.elementAt(i).accept(this);
    }
    System.out.println();
    System.out.println("}");
  }
 
  // Identifier i;
  // Identifier j;
  // VarDeclList vl;
  // MethodDeclList ml;
  public void visit(ClassDeclarationExtends n) {
    System.out.print("class ");
    n.i.accept(this);
    System.out.println(" extends ");
    n.j.accept(this);
    System.out.println(" { ");
    for ( int i = 0; i < n.vl.size(); i++ ) {
        System.out.print("  ");
        n.vl.elementAt(i).accept(this);
        if ( i+1 < n.vl.size() ) { System.out.println(); }
    }
    for ( int i = 0; i < n.ml.size(); i++ ) {
        System.out.println();
        n.ml.elementAt(i).accept(this);
    }
    System.out.println();
    System.out.println("}");
  }

  // Type t;
  // Identifier i;
  public void visit(VarDefinition n) {
    n.t.accept(this);
    System.out.print(" ");
    n.i.accept(this);
    System.out.print(";");
  }

  // Type t;
  // Identifier i;
  // FormalList fl;
  // VarDeclList vl;
  // StatementList sl;
  // Exp e;
  public void visit(MethodDefinition n) {
    System.out.print("  public ");
    n.t.accept(this);
    System.out.print(" ");
    n.i.accept(this);
    System.out.print(" (");
    for ( int i = 0; i < n.fl.size(); i++ ) {
        n.fl.elementAt(i).accept(this);
        if (i+1 < n.fl.size()) { System.out.print(", "); }
    }
    System.out.println(") { ");
    for ( int i = 0; i < n.vl.size(); i++ ) {
        System.out.print("    ");
        n.vl.elementAt(i).accept(this);
        System.out.println("");
    }
    for ( int i = 0; i < n.sl.size(); i++ ) {
        System.out.print("    ");
        n.sl.elementAt(i).accept(this);
        if ( i < n.sl.size() ) { System.out.println(""); }
    }
    System.out.print("    return ");
    n.e.accept(this);
    System.out.println(";");
    System.out.print("  }");
  }

  // Type t;
  // Identifier i;
  public void visit(Formal n) {
    n.t.accept(this);
    System.out.print(" ");
    n.i.accept(this);
  }

  public void visit(ArrayType n) {
    System.out.print("int []");
  }

  public void visit(BooleanType n) {
    System.out.print("boolean");
  }

  public void visit(IntegerType n) {
    System.out.print("int");
  }

  // String s;
  public void visit(IdentifierType n) {
    System.out.print(n.s);
  }

  // StatementList sl;
  public void visit(BlockStatement n) {
    System.out.println("{ ");
    for ( int i = 0; i < n.sl.size(); i++ ) {
        System.out.print("      ");
        n.sl.elementAt(i).accept(this);
        System.out.println();
    }
    System.out.print("    } ");
  }

  // Exp e;
  // Statement s1,s2;
  public void visit(IfStatement n) {
    System.out.print("if (");
    n.e.accept(this);
    System.out.println(") ");
    System.out.print("    ");
    n.s1.accept(this);
    System.out.println();
    System.out.print("    else ");
    n.s2.accept(this);
  }

  // Exp e;
  // Statement s;
  public void visit(WhileStatement n) {
    System.out.print("while (");
    n.e.accept(this);
    System.out.print(") ");
    n.s.accept(this);
  }

  // Exp e;
  public void visit(PrintStatement n) {
    System.out.print("System.out.println(");
    n.e.accept(this);
    System.out.print(");");
  }
  
  // Identifier i;
  // Exp e;
  public void visit(AssignStatement n) {
    n.i.accept(this);
    System.out.print(" = ");
    n.e.accept(this);
    System.out.print(";");
  }

  // Identifier i;
  // Exp e1,e2;
  public void visit(ArrayAssignStatement n) {
    n.i.accept(this);
    System.out.print("[");
    n.e1.accept(this);
    System.out.print("] = ");
    n.e2.accept(this);
    System.out.print(";");
  }

  // Exp e1,e2;
  public void visit(AndExpression n) {
    System.out.print("(");
    n.e1.accept(this);
    System.out.print(" && ");
    n.e2.accept(this);
    System.out.print(")");
  }

  // Exp e1,e2;
  public void visit(LessExpression n) {
    System.out.print("(");
    n.e1.accept(this);
    System.out.print(" < ");
    n.e2.accept(this);
    System.out.print(")");
  }

  // Exp e1,e2;
  public void visit(PlusExpression n) {
    System.out.print("(");
    n.e1.accept(this);
    System.out.print(" + ");
    n.e2.accept(this);
    System.out.print(")");
  }

  // Exp e1,e2;
  public void visit(MinusExpression n) {
    System.out.print("(");
    n.e1.accept(this);
    System.out.print(" - ");
    n.e2.accept(this);
    System.out.print(")");
  }

  // Exp e1,e2;
  public void visit(MultExpression n) {
    System.out.print("(");
    n.e1.accept(this);
    System.out.print(" * ");
    n.e2.accept(this);
    System.out.print(")");
  }

  // Exp e1,e2;
  public void visit(ListExpression n) {
    n.e1.accept(this);
    System.out.print("[");
    n.e2.accept(this);
    System.out.print("]");
  }

  // Exp e;
  public void visit(LengthExpression n) {
    n.e.accept(this);
    System.out.print(".length");
  }

  // Exp e;
  // Identifier i;
  // ExpList el;
  public void visit(BigExpression n) {
    n.e.accept(this);
    System.out.print(".");
    n.i.accept(this);
    System.out.print("(");
    for ( int i = 0; i < n.el.size(); i++ ) {
        n.el.elementAt(i).accept(this);
        if ( i+1 < n.el.size() ) { System.out.print(", "); }
    }
    System.out.print(")");
  }

  // int i;
  public void visit(IntegerLiteralExpression n) {
    System.out.print(n.i);
  }

  public void visit(TrueExpression n) {
    System.out.print("true");
  }

  public void visit(FalseExpression n) {
    System.out.print("false");
  }

  // String s;
  public void visit(IdentifierExpression n) {
    System.out.print(n.s);
  }

  public void visit(ThisExpression n) {
    System.out.print("this");
  }

  // Exp e;
  public void visit(NewIntegerExpression n) {
    System.out.print("new int [");
    n.e.accept(this);
    System.out.print("]");
  }

  // Identifier i;
  public void visit(NewIdentifierExpressiont n) {
    System.out.print("new ");
    System.out.print(n.i.s);
    System.out.print("()");
  }

  // Exp e;
  public void visit(NotExpression n) {
    System.out.print("!");
    n.e.accept(this);
  }

  //Não tinha no doc do minijava, mas acho que ta faatando
  public void visit(BlockExpression n) {
    System.out.print("(");
    n.e.accept(this);
    System.out.print(")");
  }

  // String s;
  public void visit(Identifier n) {
    System.out.print(n.s);
  }


}