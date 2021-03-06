package analisador_semantico.syntaxtree;

import analisador_semantico.syntaxtree.*;
import analisador_semantico.visitors.*;
import traducao_intermediario.visitor.*;
import traducao_intermediario.Translate.*;

public abstract class Type {
    public abstract void accept(Visitor v);

    public abstract Type accept(TypeVisitor v);

    public abstract String toString();

    public abstract Exp accept(VisitorIR v);
}