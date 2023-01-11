package src.proguard.sources.sample7;

public class Derived extends Base {
    public String maybeTaintedString() {
        return taintedString();
    }
}
