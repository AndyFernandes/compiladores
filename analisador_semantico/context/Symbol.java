package context;

public class Symbol {
    private String name;
    private static Map<String, Symbol> dict = new HashMap<String,Symbol>();
    
    private Symbol(String n) {
        name=n; 
    }

    public String toString() {return name;}

    public static Symbol symbol(String n) {
        String u = n.intern();
        Symbol s = null;
        if (!dict.containsKey(u)) {
            s = new Symbol(u);
            dict.put(u,s);
        }
        return s;
    }
}