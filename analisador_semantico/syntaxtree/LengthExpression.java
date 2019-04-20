package syntaxtree;
import visitor.*;

public class LengthExpression extends Expression {
	public Expression e1, e2;

	public LengthExpression(Expression e1, Expression e2){
		this.e1 = e1;
		this.e2 = e2;
	}

    public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }
}