package traducao_intermediario.Tree;
import traducao_intermediario.Temp.*;

public class LABEL extends Stm { 
    public Label label;
    
    public LABEL(Label l) {label=l;}
    
    public ExpList kids() {return null;}
    
    public Stm build(ExpList kids) {
        return this;
    }
}
