package src.proguard.sources.sample8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {

    private static String str;

    public static void main(String[] args) throws IOException {
        str = taintedString();
        util();
    }

    public static String taintedString() {
        return "tainted string";
    }

    public static void util() throws IOException {
        Files.createFile(Path.of(str));
    }
}
