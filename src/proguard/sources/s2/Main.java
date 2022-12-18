package src.proguard.sources.s2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        doSmth( Integer.parseInt(args[0]));
    }

    public static String taintedString(long i) {
        if (i > 9873944) return "s1";
        else return "s2";
    }

    public static void doSmth(int i) {
        var r = new Random();
        boolean b1 = true;
        boolean b3 = r.nextBoolean();
        String s = taintedString(i);
        if (b1) {
            try {
                Files.createFile(Path.of(s));
            } catch (Exception ignored) {}
        } else if (b3) {
            try {
                Files.createFile(Path.of(s));
            } catch (Exception ignored) {}
        }
    }
}
