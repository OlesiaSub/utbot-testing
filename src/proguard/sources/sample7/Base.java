package src.proguard.sources.sample7;

public class Base {
    public String taintedString() {
        return "tainted string";
    }
    public String maybeTaintedString() { return taintedString(); }
}
