package src.utbot.sources.sample5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        do_1();
    }

    public static String taintedString(long i) {
        if (i > 9873944) return "s1";
        else return "s2";
    }

    public static void do_1() {
        do_2();
    }

    public static void do_2() {
        try {
            Files.createFile(do_3());
        } catch (Exception ignored) {}
    }

    public static Path do_3() {
        return do_4();
    }

    public static Path do_4() {
        return Path.of(do_5());
    }

    public static String do_5() {
        return do_6();
    }

    public static String do_6() {
        return do_7();
    }

    public static String do_7() {
        return do_8();
    }

    public static String do_8() {
        return do_9();
    }

    public static String do_9() {
        return do_10();
    }

    public static String do_10() {
        return do_11(new Random().nextLong());
    }

    public static String do_11(long l) {
        return do_12(l);
    }

    public static String do_12(long l) {
        return do_13(l);
    }

    public static String do_13(long i) {
        return taintedString(i);
    }
}
