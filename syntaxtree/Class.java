package syntaxtree;
import visitor.Visitor;
import visitor.TypeVisitor;

public class Class extends ClassDeclaration {

    public abstract void accept(Visitor v) {
        return v.visit(this);
    }

    public abstract Type accept(TypeVisitor v) {
        return v.visit(this);
    }
}