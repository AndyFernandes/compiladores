package traducao_intermediario.Tree;

public class EXP extends Stm {
  public Expr exp; 
  
  public EXP(Expr e) {
    exp=e;
  }
  
  public ExpList kids() {
    return new ExpList(exp,null);
  }
  
  public Stm build(ExpList kids) {
    return new EXP(kids.head);
  }
}
