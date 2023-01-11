package s1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {

    public static void main(String[] args) throws IOException {
        util();
    }

    public static void util() throws IOException {
        Base base = new Derived();
        String s = base.maybeTaintedString();
        Files.createFile(Path.of(s));
    }
}
