package src.proguard.sources.sample5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
//        Class_0.class_0_method_4();
        util();
    }

    public static String taintedString() {
        return "tainted string";
    }

    public static void util() throws IOException {
        boolean b = new Random().nextBoolean();
        String s = taintedString();
        String v = "";
        if (b) {
            v = taintedString();
        }
        Files.createFile(Path.of(s));
    }
}
