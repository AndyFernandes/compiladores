package analisador_semantico.syntaxtree;

import analisador_semantico.syntaxtree.*;
import analisador_semantico.visitors.*;
import traducao_intermediario.Translate.*;
import traducao_intermediario.visitor.*;

public class AndExpression extends Expression {
    public Expression e1, e2;

    public AndExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }

    public Exp accept(VisitorIR v) {
        return v.visit(this);
    }
}