package src.proguard.sources.sample9;

public class Derived extends Base {
    public String maybeTaintedString() {
        return taintedString();
    }
}
