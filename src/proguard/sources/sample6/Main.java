package src.proguard.sources.sample6;

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
        boolean b1 = new Random().nextBoolean();
        boolean b2 = new Random().nextBoolean();
        boolean b3 = new Random().nextBoolean();
        boolean b4 = new Random().nextBoolean();
        boolean b5 = new Random().nextBoolean();
        boolean b6 = new Random().nextBoolean();
        String s = taintedString();
        if (b1 || b2) {
            System.out.println("1");
            if (b3) {
                if (b4 && b3) {
                    System.out.println("2");
                } else {
                    System.out.println("3");
                }
            } else if (b5) {
                System.out.println("4");
            } else {
                System.out.println("5");
            }
        } else if (b6) {
            if (b5 || b4) {
                System.out.println("6");
            } else if (b3) {
                System.out.println("7");
            }
        } else {
            System.out.println("8");
        }
        Files.createFile(Path.of(s));
    }
}
