package syntaxtree;
//import visitor.*;
//package syntaxtree;

public class BigExpression extends Expression {
	public Expression e1;
	public Identifier id1;
	public ExpList el;

	public BigExpression(Expression e1, Identifier id1, ExpList el){
		this.e1 = e1;
		this.id1 = id1;
		this.el = el; 
	}

    /*public void accept(Visitor v) {
        v.visit(this);
    }

    public Type accept(TypeVisitor v) {
        return v.visit(this);
    }*/
}