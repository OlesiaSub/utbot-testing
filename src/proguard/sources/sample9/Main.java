package src.proguard.sources.sample9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;


public class Main {

    public static void main(String[] args) throws IOException {
        util();
    }

    public static void util() throws IOException {
        Base base = new Random().nextBoolean() ? new Derived() : new Derived2();
        String str = base.maybeTaintedString();
        Files.createFile(Path.of(str));
    }
}
