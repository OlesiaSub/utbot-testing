package src.utbot.results.s4;

import utbot.sources.s4.Class_0;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class Class_0Test {
    ///region Test suites for executable manual.Class_0.class_0_method_0

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method class_0_method_0()

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_60 : False -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_60() {
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        try {
            Class_0.class_0_field_60 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_60 = prevClass_0_field_60;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): False}
     * @utbot.executesCondition {@code (class_0_field_73): True}
     * @utbot.returnsFrom {@code return "GenNYKb0c";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_62 : False -> return \"GenNYKb0c\"")
    public void testClass_0_method_0_NotClass_0_field_62() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = false;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "GenNYKb0c";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.returnsFrom {@code return "xx9kKki";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_81 : False -> return \"xx9kKki\"")
    public void testClass_0_method_0_NotClass_0_field_81() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_81 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "xx9kKki";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_50): True}
     * @utbot.executesCondition {@code (class_0_field_73): True}
     * @utbot.returnsFrom {@code return "GenNYKb0c";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_13 : True -> return \"GenNYKb0c\"")
    public void testClass_0_method_0_Class_0_field_50() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_50 = Class_0.class_0_field_50;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_50 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "GenNYKb0c";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_50 = prevClass_0_field_50;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_97 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_97() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): False}
     * @utbot.executesCondition {@code (class_0_field_18): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_92): False}
     * @utbot.returnsFrom {@code return "GvIG";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_92 : False -> return \"GvIG\"")
    public void testClass_0_method_0_NotClass_0_field_92() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_18 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "GvIG";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): False}
     * @utbot.executesCondition {@code (class_0_field_85): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_85 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_85() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_85 = false;
            Class_0.class_0_field_86 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_27): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_27 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_27() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_27 = Class_0.class_0_field_27;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_27 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_86 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_27 = prevClass_0_field_27;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_27): True}
     * @utbot.executesCondition {@code (if (class_0_field_59) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_75): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_75 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_75() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_27 = Class_0.class_0_field_27;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_27 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_86 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_27 = prevClass_0_field_27;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_27): True}
     * @utbot.executesCondition {@code (if (class_0_field_59) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_75): True}
     * @utbot.executesCondition {@code (class_0_field_0): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_0 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_0() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_27 = Class_0.class_0_field_27;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_0 = false;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_27 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_86 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_27 = prevClass_0_field_27;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_27): True}
     * @utbot.executesCondition {@code (if (class_0_field_59) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_75): True}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_40): True}
     * @utbot.returnsFrom {@code return "1ePpbICXF";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_40 : True -> return \"1ePpbICXF\"")
    public void testClass_0_method_0_Class_0_field_40() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_27 = Class_0.class_0_field_27;
        boolean prevClass_0_field_40 = Class_0.class_0_field_40;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_27 = true;
            Class_0.class_0_field_40 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_86 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "1ePpbICXF";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_27 = prevClass_0_field_27;
            Class_0.class_0_field_40 = prevClass_0_field_40;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_27): True}
     * @utbot.executesCondition {@code (if (class_0_field_59) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_75): True}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_40): False}
     * @utbot.executesCondition {@code (if (class_0_field_45) {
     * }): True}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_40 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_Class_0_field_45() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_27 = Class_0.class_0_field_27;
        boolean prevClass_0_field_40 = Class_0.class_0_field_40;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_27 = true;
            Class_0.class_0_field_40 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_86 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_27 = prevClass_0_field_27;
            Class_0.class_0_field_40 = prevClass_0_field_40;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): False}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_21): False}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_92): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_7): True}
     * @utbot.executesCondition {@code (class_0_field_29): False}
     * @utbot.returnsFrom {@code return "qryq";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_29 : False -> return \"qryq\"")
    public void testClass_0_method_0_NotClass_0_field_29() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_29 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "qryq";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): False}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_21): False}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_92): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_7): False}
     * @utbot.executesCondition {@code (class_0_field_75): False}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_90): False}
     * @utbot.executesCondition {@code (class_0_field_19): False}
     * @utbot.returnsFrom {@code return "AKaCVaUV";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_7 : False -> return \"AKaCVaUV\"")
    public void testClass_0_method_0_NotClass_0_field_75_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_7 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = false;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AKaCVaUV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_62): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): False}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_21): False}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_92): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_7): True}
     * @utbot.executesCondition {@code (class_0_field_29): True}
     * @utbot.executesCondition {@code (if (class_0_field_95) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_47): False}
     * @utbot.returnsFrom {@code return "qryq";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_29 : True -> return \"qryq\"")
    public void testClass_0_method_0_NotClass_0_field_47() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_29 = true;
            Class_0.class_0_field_47 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "qryq";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): False}
     * @utbot.executesCondition {@code (class_0_field_36): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_59 : False -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_59() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = false;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_102): False}
     * @utbot.returnsFrom {@code return "rr3hdpM";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_102 : False -> return \"rr3hdpM\"")
    public void testClass_0_method_0_NotClass_0_field_102() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_102 = Class_0.class_0_field_102;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_102 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "rr3hdpM";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_102 = prevClass_0_field_102;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_102): True}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.returnsFrom {@code return "rr3hdpM";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_102 : True -> return \"rr3hdpM\"")
    public void testClass_0_method_0_Class_0_field_98() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_102 = Class_0.class_0_field_102;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_102 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "rr3hdpM";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_102 = prevClass_0_field_102;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): False}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.returnsFrom {@code return "Uf6roD";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_61 : False -> return \"Uf6roD\"")
    public void testClass_0_method_0_NotClass_0_field_61() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = false;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "Uf6roD";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_67): True}
     * @utbot.returnsFrom {@code return "78iS5y6j";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_67 : True -> return \"78iS5y6j\"")
    public void testClass_0_method_0_Class_0_field_67() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_67 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "78iS5y6j";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_2 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_2() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.returnsFrom {@code return "AexMTop";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_84 : True -> return \"AexMTop\"")
    public void testClass_0_method_0_Class_0_field_84() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AexMTop";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): False}
     * @utbot.executesCondition {@code (class_0_field_18): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_85): False}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.returnsFrom {@code return "Uf6roD";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_85 : False -> return \"Uf6roD\"")
    public void testClass_0_method_0_NotClass_0_field_85_1() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_18 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_85 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "Uf6roD";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_67): False}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.returnsFrom {@code return "M2x4w";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_67 : False -> return \"M2x4w\"")
    public void testClass_0_method_0_Class_0_field_70() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_67 = false;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "M2x4w";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): False}
     * @utbot.executesCondition {@code (class_0_field_18): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_40): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.returnsFrom {@code return "Uf6roD";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_85 : True -> return \"Uf6roD\"")
    public void testClass_0_method_0_Class_0_field_40_1() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_40 = Class_0.class_0_field_40;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_18 = true;
            Class_0.class_0_field_40 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "Uf6roD";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_40 = prevClass_0_field_40;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): False}
     * @utbot.executesCondition {@code (class_0_field_18): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_92): True}
     * @utbot.executesCondition {@code (class_0_field_87): True}
     * @utbot.executesCondition {@code (class_0_field_28): True}
     * @utbot.executesCondition {@code (class_0_field_20): True}
     * @utbot.returnsFrom {@code return "G02zKOWmJLS";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_20 : True -> return \"G02zKOWmJLS\"")
    public void testClass_0_method_0_Class_0_field_20() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_20 = Class_0.class_0_field_20;
        boolean prevClass_0_field_28 = Class_0.class_0_field_28;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_87 = Class_0.class_0_field_87;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_18 = true;
            Class_0.class_0_field_20 = true;
            Class_0.class_0_field_28 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_87 = true;
            Class_0.class_0_field_92 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "G02zKOWmJLS";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_20 = prevClass_0_field_20;
            Class_0.class_0_field_28 = prevClass_0_field_28;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_87 = prevClass_0_field_87;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): False}
     * @utbot.executesCondition {@code (class_0_field_18): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_92): True}
     * @utbot.executesCondition {@code (class_0_field_87): True}
     * @utbot.executesCondition {@code (class_0_field_28): False}
     * @utbot.returnsFrom {@code return "GvIG";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_28 : False -> return \"GvIG\"")
    public void testClass_0_method_0_NotClass_0_field_28() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_28 = Class_0.class_0_field_28;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_87 = Class_0.class_0_field_87;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_18 = true;
            Class_0.class_0_field_28 = false;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_87 = true;
            Class_0.class_0_field_92 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "GvIG";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_28 = prevClass_0_field_28;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_87 = prevClass_0_field_87;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_25): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.returnsFrom {@code return "xx9kKki";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_63 : False -> return \"xx9kKki\"")
    public void testClass_0_method_0_NotClass_0_field_63() {
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_25 = Class_0.class_0_field_25;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        try {
            Class_0.class_0_field_8 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_25 = false;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_100 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "xx9kKki";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_25 = prevClass_0_field_25;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_100 = prevClass_0_field_100;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): False}
     * @utbot.executesCondition {@code (class_0_field_48): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_65 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_65() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_48 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_21): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.returnsFrom {@code return "kU8gYFxoYyIuYS";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_21 : True -> return \"kU8gYFxoYyIuYS\"")
    public void testClass_0_method_0_Class_0_field_83() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "kU8gYFxoYyIuYS";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): False}
     * @utbot.returnsFrom {@code return "AfXql";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_83 : False -> return \"AfXql\"")
    public void testClass_0_method_0_NotClass_0_field_83() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = false;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AfXql";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_82): True}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.returnsFrom {@code return "kQUhKQdQ";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_96 : True -> return \"kQUhKQdQ\"")
    public void testClass_0_method_0_Class_0_field_96() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "kQUhKQdQ";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_15): False}
     * @utbot.returnsFrom {@code return "8nEFVC5Rk";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_15 : False -> return \"8nEFVC5Rk\"")
    public void testClass_0_method_0_NotClass_0_field_15() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_15 = Class_0.class_0_field_15;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_15 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "8nEFVC5Rk";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_15 = prevClass_0_field_15;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_21): False}
     * @utbot.executesCondition {@code (class_0_field_19): False}
     * @utbot.returnsFrom {@code return "AKaCVaUV";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_21 : False -> return \"AKaCVaUV\"")
    public void testClass_0_method_0_NotClass_0_field_21() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AKaCVaUV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_67): True}
     * @utbot.returnsFrom {@code return "OCnnqf";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_67 : True -> return \"OCnnqf\"")
    public void testClass_0_method_0_Class_0_field_67_1() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_67 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "OCnnqf";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): False}
     * @utbot.executesCondition {@code (class_0_field_18): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_92): True}
     * @utbot.executesCondition {@code (class_0_field_87): True}
     * @utbot.executesCondition {@code (class_0_field_28): True}
     * @utbot.executesCondition {@code (class_0_field_20): False}
     * @utbot.executesCondition {@code (class_0_field_3): False}
     * @utbot.returnsFrom {@code return "GvIG";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_3 : False -> return \"GvIG\"")
    public void testClass_0_method_0_NotClass_0_field_3() {
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_20 = Class_0.class_0_field_20;
        boolean prevClass_0_field_28 = Class_0.class_0_field_28;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_87 = Class_0.class_0_field_87;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_18 = true;
            Class_0.class_0_field_20 = false;
            Class_0.class_0_field_28 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_87 = true;
            Class_0.class_0_field_92 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "GvIG";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_20 = prevClass_0_field_20;
            Class_0.class_0_field_28 = prevClass_0_field_28;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_87 = prevClass_0_field_87;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_15): True}
     * @utbot.executesCondition {@code (if (class_0_field_91) {
     * }): True}
     * @utbot.returnsFrom {@code return "8nEFVC5Rk";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_15 : True -> return \"8nEFVC5Rk\"")
    public void testClass_0_method_0_Class_0_field_91() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_15 = Class_0.class_0_field_15;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_15 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "8nEFVC5Rk";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_15 = prevClass_0_field_15;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): False}
     * @utbot.executesCondition {@code (class_0_field_98): False}
     * @utbot.executesCondition {@code (class_0_field_48): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_98 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_98() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_48 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_82): False}
     * @utbot.executesCondition {@code (class_0_field_17): True}
     * @utbot.executesCondition {@code (class_0_field_32): False}
     * @utbot.returnsFrom {@code return "a1ERTJDHi1g6f";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_82 : False -> return \"a1ERTJDHi1g6f\"")
    public void testClass_0_method_0_NotClass_0_field_32() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_17 = Class_0.class_0_field_17;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_17 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_32 = false;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = false;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "a1ERTJDHi1g6f";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_17 = prevClass_0_field_17;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_49): False}
     * @utbot.executesCondition {@code (class_0_field_29): True}
     * @utbot.returnsFrom {@code return "C7o";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_49 : False -> return \"C7o\"")
    public void testClass_0_method_0_NotClass_0_field_49() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_29 = true;
            Class_0.class_0_field_49 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "C7o";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_82): True}
     * @utbot.executesCondition {@code (class_0_field_96): False}
     * @utbot.executesCondition {@code (class_0_field_17): False}
     * @utbot.returnsFrom {@code return "a1ERTJDHi1g6f";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_17 : False -> return \"a1ERTJDHi1g6f\"")
    public void testClass_0_method_0_NotClass_0_field_17() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_17 = Class_0.class_0_field_17;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_17 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "a1ERTJDHi1g6f";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_17 = prevClass_0_field_17;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): False}
     * @utbot.executesCondition {@code (class_0_field_36): False}
     * @utbot.returnsFrom {@code return "AfXql";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_36 : False -> return \"AfXql\"")
    public void testClass_0_method_0_NotClass_0_field_36() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AfXql";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): False}
     * @utbot.executesCondition {@code (class_0_field_18): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_92): True}
     * @utbot.executesCondition {@code (class_0_field_87): True}
     * @utbot.executesCondition {@code (class_0_field_28): True}
     * @utbot.executesCondition {@code (class_0_field_20): False}
     * @utbot.executesCondition {@code (class_0_field_3): True}
     * @utbot.executesCondition {@code (class_0_field_88): True}
     * @utbot.returnsFrom {@code return "GvIG";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_3 : True -> return \"GvIG\"")
    public void testClass_0_method_0_Class_0_field_88() {
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_20 = Class_0.class_0_field_20;
        boolean prevClass_0_field_28 = Class_0.class_0_field_28;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_87 = Class_0.class_0_field_87;
        boolean prevClass_0_field_88 = Class_0.class_0_field_88;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_18 = true;
            Class_0.class_0_field_20 = false;
            Class_0.class_0_field_28 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_87 = true;
            Class_0.class_0_field_88 = true;
            Class_0.class_0_field_92 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "GvIG";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_20 = prevClass_0_field_20;
            Class_0.class_0_field_28 = prevClass_0_field_28;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_87 = prevClass_0_field_87;
            Class_0.class_0_field_88 = prevClass_0_field_88;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_82): True}
     * @utbot.executesCondition {@code (class_0_field_96): False}
     * @utbot.executesCondition {@code (class_0_field_17): True}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_88): False}
     * @utbot.executesCondition {@code (class_0_field_66): False}
     * @utbot.returnsFrom {@code return "a1ERTJDHi1g6f";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_66 : False -> return \"a1ERTJDHi1g6f\"")
    public void testClass_0_method_0_NotClass_0_field_66() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_17 = Class_0.class_0_field_17;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_88 = Class_0.class_0_field_88;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_17 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_66 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_88 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "a1ERTJDHi1g6f";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_17 = prevClass_0_field_17;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_88 = prevClass_0_field_88;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.returnsFrom {@code return "kBLhR";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_54 : True -> return \"kBLhR\"")
    public void testClass_0_method_0_Class_0_field_54() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "kBLhR";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (if (class_0_field_12) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_0): False}
     * @utbot.returnsFrom {@code return "aYy0IKt";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_0 : False -> return \"aYy0IKt\"")
    public void testClass_0_method_0_NotClass_0_field_0_1() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_12 = Class_0.class_0_field_12;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_0 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_12 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "aYy0IKt";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_12 = prevClass_0_field_12;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_67): False}
     * @utbot.executesCondition {@code (class_0_field_21): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_102): True}
     * @utbot.returnsFrom {@code return "ZJ2MnV";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_102 : True -> return \"ZJ2MnV\"")
    public void testClass_0_method_0_Class_0_field_102() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        boolean prevClass_0_field_102 = Class_0.class_0_field_102;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_44 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_67 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;
            Class_0.class_0_field_102 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "ZJ2MnV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
            Class_0.class_0_field_102 = prevClass_0_field_102;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): False}
     * @utbot.executesCondition {@code (class_0_field_97): False}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_29): False}
     * @utbot.returnsFrom {@code return "v2UGH6ImzgU";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_29 : False -> return \"v2UGH6ImzgU\"")
    public void testClass_0_method_0_NotClass_0_field_29_1() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_29 = false;
            Class_0.class_0_field_38 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_102): False}
     * @utbot.executesCondition {@code (class_0_field_48): False}
     * @utbot.returnsFrom {@code return "k34kvtftXfgIV";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_48 : False -> return \"k34kvtftXfgIV\"")
    public void testClass_0_method_0_NotClass_0_field_48() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_102 = Class_0.class_0_field_102;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_48 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_102 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "k34kvtftXfgIV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_102 = prevClass_0_field_102;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_82): True}
     * @utbot.executesCondition {@code (class_0_field_96): False}
     * @utbot.executesCondition {@code (class_0_field_17): True}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_88): False}
     * @utbot.executesCondition {@code (class_0_field_66): True}
     * @utbot.executesCondition {@code (class_0_field_3): True}
     * @utbot.returnsFrom {@code return "1lmN";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_3 : True -> return \"1lmN\"")
    public void testClass_0_method_0_Class_0_field_3() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_17 = Class_0.class_0_field_17;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_88 = Class_0.class_0_field_88;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_17 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_88 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "1lmN";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_17 = prevClass_0_field_17;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_88 = prevClass_0_field_88;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_82): True}
     * @utbot.executesCondition {@code (class_0_field_96): False}
     * @utbot.executesCondition {@code (class_0_field_17): True}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_88): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_64): False}
     * @utbot.executesCondition {@code (class_0_field_66): True}
     * @utbot.executesCondition {@code (class_0_field_3): False}
     * @utbot.returnsFrom {@code return "a1ERTJDHi1g6f";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_64 : False -> return \"a1ERTJDHi1g6f\"")
    public void testClass_0_method_0_NotClass_0_field_3_1() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_17 = Class_0.class_0_field_17;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_64 = Class_0.class_0_field_64;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_88 = Class_0.class_0_field_88;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_17 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_64 = false;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_88 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "a1ERTJDHi1g6f";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_17 = prevClass_0_field_17;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_64 = prevClass_0_field_64;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_88 = prevClass_0_field_88;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_102): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.returnsFrom {@code return "n71AcvOTRcTol";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_48 : True -> return \"n71AcvOTRcTol\"")
    public void testClass_0_method_0_Class_0_field_48() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_102 = Class_0.class_0_field_102;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_102 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "n71AcvOTRcTol";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_102 = prevClass_0_field_102;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.executesCondition {@code (class_0_field_85): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_39): False}
     * @utbot.returnsFrom {@code return "AfXql";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_39 : False -> return \"AfXql\"")
    public void testClass_0_method_0_NotClass_0_field_39() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_39 = false;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_85 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AfXql";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_67): False}
     * @utbot.executesCondition {@code (class_0_field_21): True}
     * @utbot.executesCondition {@code (class_0_field_47): False}
     * @utbot.executesCondition {@code (class_0_field_40): True}
     * @utbot.executesCondition {@code (class_0_field_45): True}
     * @utbot.returnsFrom {@code return "gRoJaEB4fI";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_45 : True -> return \"gRoJaEB4fI\"")
    public void testClass_0_method_0_Class_0_field_45_1() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_40 = Class_0.class_0_field_40;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_40 = true;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_47 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_67 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "gRoJaEB4fI";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_40 = prevClass_0_field_40;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_49): False}
     * @utbot.executesCondition {@code (class_0_field_67): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.returnsFrom {@code return "Laj4Y4K";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_67 : True -> return \"Laj4Y4K\"")
    public void testClass_0_method_0_Class_0_field_81() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_49 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_67 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "Laj4Y4K";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_67): False}
     * @utbot.executesCondition {@code (class_0_field_21): True}
     * @utbot.executesCondition {@code (class_0_field_47): False}
     * @utbot.executesCondition {@code (class_0_field_40): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_51): True}
     * @utbot.returnsFrom {@code return "aJHJwM";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_51 : True -> return \"aJHJwM\"")
    public void testClass_0_method_0_Class_0_field_51() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_40 = Class_0.class_0_field_40;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_51 = Class_0.class_0_field_51;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_40 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_51 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_67 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "aJHJwM";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_40 = prevClass_0_field_40;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_51 = prevClass_0_field_51;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_67): False}
     * @utbot.executesCondition {@code (class_0_field_21): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_102): False}
     * @utbot.executesCondition {@code (class_0_field_40): False}
     * @utbot.executesCondition {@code (class_0_field_29): True}
     * @utbot.returnsFrom {@code return "C7o";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_102 : False -> return \"C7o\"")
    public void testClass_0_method_0_NotClass_0_field_40() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_40 = Class_0.class_0_field_40;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        boolean prevClass_0_field_102 = Class_0.class_0_field_102;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_29 = true;
            Class_0.class_0_field_40 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_67 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;
            Class_0.class_0_field_102 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "C7o";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_40 = prevClass_0_field_40;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
            Class_0.class_0_field_102 = prevClass_0_field_102;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_67): False}
     * @utbot.executesCondition {@code (class_0_field_21): True}
     * @utbot.executesCondition {@code (class_0_field_47): False}
     * @utbot.executesCondition {@code (class_0_field_40): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_51): False}
     * @utbot.executesCondition {@code (class_0_field_29): True}
     * @utbot.returnsFrom {@code return "C7o";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_51 : False -> return \"C7o\"")
    public void testClass_0_method_0_NotClass_0_field_51() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_40 = Class_0.class_0_field_40;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_51 = Class_0.class_0_field_51;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_29 = true;
            Class_0.class_0_field_40 = true;
            Class_0.class_0_field_44 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_51 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_67 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "C7o";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_40 = prevClass_0_field_40;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_51 = prevClass_0_field_51;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): False}
     * @utbot.executesCondition {@code (class_0_field_97): False}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_29): True}
     * @utbot.executesCondition {@code (class_0_field_75): False}
     * @utbot.returnsFrom {@code return "v2UGH6ImzgU";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_75 : False -> return \"v2UGH6ImzgU\"")
    public void testClass_0_method_0_NotClass_0_field_75_2() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_29 = true;
            Class_0.class_0_field_38 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = false;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.executesCondition {@code (class_0_field_85): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_39): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_15): True}
     * @utbot.returnsFrom {@code return "5wryeacV";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_15 : True -> return \"5wryeacV\"")
    public void testClass_0_method_0_Class_0_field_15() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_15 = Class_0.class_0_field_15;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_15 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_39 = true;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_85 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "5wryeacV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_15 = prevClass_0_field_15;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_99): False}
     * @utbot.executesCondition {@code (class_0_field_0): False}
     * @utbot.returnsFrom {@code return "v2UGH6ImzgU";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_60 : True -> return \"v2UGH6ImzgU\"")
    public void testClass_0_method_0_NotClass_0_field_0_2() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_0 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_38 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_99 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (if (class_0_field_12) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_75): True}
     * @utbot.executesCondition {@code (class_0_field_18): False}
     * @utbot.executesCondition {@code (class_0_field_98): False}
     * @utbot.executesCondition {@code (if (class_0_field_31) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_15): False}
     * @utbot.returnsFrom {@code return "aYy0IKt";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_98 : False -> return \"aYy0IKt\"")
    public void testClass_0_method_0_NotClass_0_field_98_1() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_12 = Class_0.class_0_field_12;
        boolean prevClass_0_field_15 = Class_0.class_0_field_15;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_12 = true;
            Class_0.class_0_field_15 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_18 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "aYy0IKt";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_12 = prevClass_0_field_12;
            Class_0.class_0_field_15 = prevClass_0_field_15;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_82): True}
     * @utbot.executesCondition {@code (class_0_field_96): False}
     * @utbot.executesCondition {@code (class_0_field_17): True}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_88): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_64): True}
     * @utbot.executesCondition {@code (class_0_field_77): False}
     * @utbot.returnsFrom {@code return "tDKFdJog6t";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_77 : False -> return \"tDKFdJog6t\"")
    public void testClass_0_method_0_NotClass_0_field_77() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_17 = Class_0.class_0_field_17;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_64 = Class_0.class_0_field_64;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_77 = Class_0.class_0_field_77;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_88 = Class_0.class_0_field_88;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_17 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_64 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_77 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_88 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "tDKFdJog6t";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_17 = prevClass_0_field_17;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_64 = prevClass_0_field_64;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_77 = prevClass_0_field_77;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_88 = prevClass_0_field_88;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_39): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_15): False}
     * @utbot.returnsFrom {@code return "IMUPdMGK1XDJ";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_15 : False -> return \"IMUPdMGK1XDJ\"")
    public void testClass_0_method_0_NotClass_0_field_15_1() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_15 = Class_0.class_0_field_15;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_15 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_39 = true;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "IMUPdMGK1XDJ";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_15 = prevClass_0_field_15;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_39): True}
     * @utbot.executesCondition {@code (class_0_field_41): False}
     * @utbot.executesCondition {@code (class_0_field_47): False}
     * @utbot.returnsFrom {@code return "AfXql";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_41 : False -> return \"AfXql\"")
    public void testClass_0_method_0_NotClass_0_field_47_1() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_39 = true;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_47 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AfXql";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_102): True}
     * @utbot.executesCondition {@code (class_0_field_39): True}
     * @utbot.executesCondition {@code (class_0_field_19): False}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.returnsFrom {@code return "oun";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_19 : False -> return \"oun\"")
    public void testClass_0_method_0_NotClass_0_field_19() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_102 = Class_0.class_0_field_102;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_39 = true;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_102 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "oun";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_102 = prevClass_0_field_102;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): False}
     * @utbot.executesCondition {@code (class_0_field_97): False}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_29): True}
     * @utbot.executesCondition {@code (class_0_field_75): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.returnsFrom {@code return "v2UGH6ImzgU";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_75 : True -> return \"v2UGH6ImzgU\"")
    public void testClass_0_method_0_NotClass_0_field_76() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_29 = true;
            Class_0.class_0_field_38 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_82): True}
     * @utbot.executesCondition {@code (class_0_field_96): False}
     * @utbot.executesCondition {@code (class_0_field_17): True}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_88): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_64): True}
     * @utbot.executesCondition {@code (class_0_field_77): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.returnsFrom {@code return "TU8X";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_77 : True -> return \"TU8X\"")
    public void testClass_0_method_0_Class_0_field_81_1() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_17 = Class_0.class_0_field_17;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_64 = Class_0.class_0_field_64;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_77 = Class_0.class_0_field_77;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_88 = Class_0.class_0_field_88;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_17 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_64 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_77 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_88 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "TU8X";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_17 = prevClass_0_field_17;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_64 = prevClass_0_field_64;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_77 = prevClass_0_field_77;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_88 = prevClass_0_field_88;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_102): True}
     * @utbot.executesCondition {@code (class_0_field_39): True}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_61): False}
     * @utbot.returnsFrom {@code return "B3XZ";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_19 : True -> return \"B3XZ\"")
    public void testClass_0_method_0_NotClass_0_field_61_1() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_102 = Class_0.class_0_field_102;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_39 = true;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = false;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_102 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "B3XZ";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_102 = prevClass_0_field_102;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (if (class_0_field_12) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_90): False}
     * @utbot.executesCondition {@code (class_0_field_15): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.returnsFrom {@code return "sEfXo";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_90 : False -> return \"sEfXo\"")
    public void testClass_0_method_0_Class_0_field_98_1() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_12 = Class_0.class_0_field_12;
        boolean prevClass_0_field_15 = Class_0.class_0_field_15;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_12 = true;
            Class_0.class_0_field_15 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "sEfXo";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_12 = prevClass_0_field_12;
            Class_0.class_0_field_15 = prevClass_0_field_15;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (if (class_0_field_12) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_75): False}
     * @utbot.executesCondition {@code (if (class_0_field_31) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_15): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_97): False}
     * @utbot.executesCondition {@code (class_0_field_98): False}
     * @utbot.returnsFrom {@code return "aYy0IKt";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_75 : False -> return \"aYy0IKt\"")
    public void testClass_0_method_0_NotClass_0_field_98_2() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_12 = Class_0.class_0_field_12;
        boolean prevClass_0_field_15 = Class_0.class_0_field_15;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_12 = true;
            Class_0.class_0_field_15 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = false;
            Class_0.class_0_field_98 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "aYy0IKt";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_12 = prevClass_0_field_12;
            Class_0.class_0_field_15 = prevClass_0_field_15;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_49): False}
     * @utbot.executesCondition {@code (class_0_field_67): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): True}
     * @utbot.executesCondition {@code (if (class_0_field_97) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_43): True}
     * @utbot.returnsFrom {@code return "N4Zx5n3wa";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_67 : False -> return \"N4Zx5n3wa\"")
    public void testClass_0_method_0_Class_0_field_43() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_38 = true;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_49 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_67 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "N4Zx5n3wa";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_99): True}
     * @utbot.executesCondition {@code (class_0_field_30): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.executesCondition {@code (class_0_field_103): False}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.returnsFrom {@code return "kLlXhIQc";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_30 : True -> return \"kLlXhIQc\"")
    public void testClass_0_method_0_NotClass_0_field_103() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_30 = Class_0.class_0_field_30;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_30 = true;
            Class_0.class_0_field_38 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_99 = true;
            Class_0.class_0_field_103 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "kLlXhIQc";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_30 = prevClass_0_field_30;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_99 = prevClass_0_field_99;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (if (class_0_field_12) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_75): True}
     * @utbot.executesCondition {@code (class_0_field_18): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_19): False}
     * @utbot.executesCondition {@code (class_0_field_92): True}
     * @utbot.executesCondition {@code (if (class_0_field_15) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.returnsFrom {@code return "J4r8BbfitYLM";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_92 : True -> return \"J4r8BbfitYLM\"")
    public void testClass_0_method_0_Class_0_field_74() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_12 = Class_0.class_0_field_12;
        boolean prevClass_0_field_15 = Class_0.class_0_field_15;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_12 = true;
            Class_0.class_0_field_15 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_18 = false;
            Class_0.class_0_field_19 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_92 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "J4r8BbfitYLM";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_12 = prevClass_0_field_12;
            Class_0.class_0_field_15 = prevClass_0_field_15;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (if (class_0_field_12) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_75): True}
     * @utbot.executesCondition {@code (class_0_field_18): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_20): False}
     * @utbot.returnsFrom {@code return "cVi";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_19 : True -> return \"cVi\"")
    public void testClass_0_method_0_NotClass_0_field_20() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_12 = Class_0.class_0_field_12;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_20 = Class_0.class_0_field_20;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_12 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_18 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_20 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "cVi";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_12 = prevClass_0_field_12;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_20 = prevClass_0_field_20;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_99): True}
     * @utbot.executesCondition {@code (class_0_field_30): False}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_6): False}
     * @utbot.executesCondition {@code (class_0_field_96): False}
     * @utbot.returnsFrom {@code return "VsVzOOOtI";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_6 : False -> return \"VsVzOOOtI\"")
    public void testClass_0_method_0_NotClass_0_field_96() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_30 = Class_0.class_0_field_30;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_30 = false;
            Class_0.class_0_field_38 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = false;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_99 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "VsVzOOOtI";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_30 = prevClass_0_field_30;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_91): True}
     * @utbot.executesCondition {@code (class_0_field_44): True}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.executesCondition {@code (class_0_field_66): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.executesCondition {@code (class_0_field_85): True}
     * @utbot.executesCondition {@code (class_0_field_102): True}
     * @utbot.executesCondition {@code (class_0_field_39): False}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.returnsFrom {@code return "oun";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_39 : False -> return \"oun\"")
    public void testClass_0_method_0_NotClass_0_field_39_1() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_102 = Class_0.class_0_field_102;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_39 = false;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_102 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "oun";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_102 = prevClass_0_field_102;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_41): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (if (class_0_field_12) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_75): True}
     * @utbot.executesCondition {@code (class_0_field_18): False}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_19): False}
     * @utbot.executesCondition {@code (class_0_field_92): False}
     * @utbot.executesCondition {@code (if (class_0_field_31) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_15): False}
     * @utbot.returnsFrom {@code return "aYy0IKt";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_92 : False -> return \"aYy0IKt\"")
    public void testClass_0_method_0_NotClass_0_field_92_1() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_12 = Class_0.class_0_field_12;
        boolean prevClass_0_field_15 = Class_0.class_0_field_15;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_12 = true;
            Class_0.class_0_field_15 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_18 = false;
            Class_0.class_0_field_19 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "aYy0IKt";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_12 = prevClass_0_field_12;
            Class_0.class_0_field_15 = prevClass_0_field_15;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_99): True}
     * @utbot.executesCondition {@code (class_0_field_30): False}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_6): True}
     * @utbot.executesCondition {@code (class_0_field_17): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (if (class_0_field_13) {
     * }): True}
     * @utbot.returnsFrom {@code return "VsVzOOOtI";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_6 : True -> return \"VsVzOOOtI\"")
    public void testClass_0_method_0_Class_0_field_13() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_17 = Class_0.class_0_field_17;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_30 = Class_0.class_0_field_30;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_17 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_30 = false;
            Class_0.class_0_field_38 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_99 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "VsVzOOOtI";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_17 = prevClass_0_field_17;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_30 = prevClass_0_field_30;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): False}
     * @utbot.executesCondition {@code (class_0_field_36): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_53 : False -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_53() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_53 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_90): False}
     * @utbot.executesCondition {@code (class_0_field_36): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_90 : False -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_90() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_8 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): False}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.returnsFrom {@code return "Uf6roD";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_100 : False -> return \"Uf6roD\"")
    public void testClass_0_method_0_NotClass_0_field_100() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_100 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "Uf6roD";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_100 = prevClass_0_field_100;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_73): True}
     * @utbot.returnsFrom {@code return "3ebQ";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_73 : True -> return \"3ebQ\"")
    public void testClass_0_method_0_Class_0_field_73() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_8 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "3ebQ";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): False}
     * @utbot.executesCondition {@code (class_0_field_42): False}
     * @utbot.executesCondition {@code (class_0_field_55): False}
     * @utbot.executesCondition {@code (class_0_field_36): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_70 : False -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_55() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_42 = false;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_55 = false;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_70 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_79 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_79() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_19): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_10): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_19 : False -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_10() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_8 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = false;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): False}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.returnsFrom {@code return "Uf6roD";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_96 : False -> return \"Uf6roD\"")
    public void testClass_0_method_0_NotClass_0_field_96_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = false;
            Class_0.class_0_field_100 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "Uf6roD";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_100): False}
     * @utbot.executesCondition {@code (class_0_field_25): False}
     * @utbot.executesCondition {@code (class_0_field_36): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_60 : True -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_36_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_25 = Class_0.class_0_field_25;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_8 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_25 = false;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_100 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_25 = prevClass_0_field_25;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_100 = prevClass_0_field_100;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_100): False}
     * @utbot.executesCondition {@code (class_0_field_25): True}
     * @utbot.executesCondition {@code (class_0_field_21): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.returnsFrom {@code return "xx9kKki";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_21 : False -> return \"xx9kKki\"")
    public void testClass_0_method_0_NotClass_0_field_21_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_25 = Class_0.class_0_field_25;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_8 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_25 = true;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_100 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "xx9kKki";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_25 = prevClass_0_field_25;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_100 = prevClass_0_field_100;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): False}
     * @utbot.executesCondition {@code (class_0_field_18): False}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.returnsFrom {@code return "Uf6roD";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_18 : False -> return \"Uf6roD\"")
    public void testClass_0_method_0_NotClass_0_field_18() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_18 = false;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "Uf6roD";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_24): False}
     * @utbot.executesCondition {@code (class_0_field_25): True}
     * @utbot.executesCondition {@code (class_0_field_21): True}
     * @utbot.executesCondition {@code (class_0_field_33): True}
     * @utbot.returnsFrom {@code return "Np10pww";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_24 : False -> return \"Np10pww\"")
    public void testClass_0_method_0_NotClass_0_field_24() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_24 = Class_0.class_0_field_24;
        boolean prevClass_0_field_25 = Class_0.class_0_field_25;
        boolean prevClass_0_field_33 = Class_0.class_0_field_33;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_8 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_24 = false;
            Class_0.class_0_field_25 = true;
            Class_0.class_0_field_33 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_100 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "Np10pww";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_24 = prevClass_0_field_24;
            Class_0.class_0_field_25 = prevClass_0_field_25;
            Class_0.class_0_field_33 = prevClass_0_field_33;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_100 = prevClass_0_field_100;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_100): False}
     * @utbot.executesCondition {@code (class_0_field_25): True}
     * @utbot.executesCondition {@code (class_0_field_21): True}
     * @utbot.executesCondition {@code (class_0_field_33): False}
     * @utbot.executesCondition {@code (class_0_field_36): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_33 : False -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_33() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_25 = Class_0.class_0_field_25;
        boolean prevClass_0_field_33 = Class_0.class_0_field_33;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_8 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_25 = true;
            Class_0.class_0_field_33 = false;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_100 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_25 = prevClass_0_field_25;
            Class_0.class_0_field_33 = prevClass_0_field_33;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_100 = prevClass_0_field_100;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.executesCondition {@code (class_0_field_61): True}
     * @utbot.executesCondition {@code (class_0_field_103): False}
     * @utbot.executesCondition {@code (class_0_field_18): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_92): True}
     * @utbot.executesCondition {@code (class_0_field_87): False}
     * @utbot.returnsFrom {@code return "GvIG";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_87 : False -> return \"GvIG\"")
    public void testClass_0_method_0_NotClass_0_field_87() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_87 = Class_0.class_0_field_87;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_18 = true;
            Class_0.class_0_field_52 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_87 = false;
            Class_0.class_0_field_92 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_103 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "GvIG";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_87 = prevClass_0_field_87;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_24): True}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (if (class_0_field_88) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (if (class_0_field_7) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_25): True}
     * @utbot.executesCondition {@code (class_0_field_21): True}
     * @utbot.executesCondition {@code (class_0_field_33): True}
     * @utbot.returnsFrom {@code return "Np10pww";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_98 : True -> return \"Np10pww\"")
    public void testClass_0_method_0_NotClass_0_field_73() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_24 = Class_0.class_0_field_24;
        boolean prevClass_0_field_25 = Class_0.class_0_field_25;
        boolean prevClass_0_field_33 = Class_0.class_0_field_33;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_88 = Class_0.class_0_field_88;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_24 = true;
            Class_0.class_0_field_25 = true;
            Class_0.class_0_field_33 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_88 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;
            Class_0.class_0_field_100 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "Np10pww";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_24 = prevClass_0_field_24;
            Class_0.class_0_field_25 = prevClass_0_field_25;
            Class_0.class_0_field_33 = prevClass_0_field_33;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_88 = prevClass_0_field_88;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
            Class_0.class_0_field_100 = prevClass_0_field_100;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_83): False}
     * @utbot.returnsFrom {@code return "a1ERTJDHi1g6f";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_83 : False -> return \"a1ERTJDHi1g6f\"")
    public void testClass_0_method_0_NotClass_0_field_83_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = false;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "a1ERTJDHi1g6f";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_90): False}
     * @utbot.executesCondition {@code (class_0_field_19): False}
     * @utbot.returnsFrom {@code return "AKaCVaUV";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_60 : True -> return \"AKaCVaUV\"")
    public void testClass_0_method_0_NotClass_0_field_19_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_19 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AKaCVaUV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_90): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_101): False}
     * @utbot.returnsFrom {@code return "AKaCVaUV";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_101 : False -> return \"AKaCVaUV\"")
    public void testClass_0_method_0_NotClass_0_field_101() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_101 = Class_0.class_0_field_101;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_101 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "AKaCVaUV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_101 = prevClass_0_field_101;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_90): True}
     * @utbot.executesCondition {@code (class_0_field_73): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_100): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_24): True}
     * @utbot.executesCondition {@code (class_0_field_98): False}
     * @utbot.executesCondition {@code (if (class_0_field_7) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_25): True}
     * @utbot.executesCondition {@code (class_0_field_21): True}
     * @utbot.executesCondition {@code (class_0_field_33): True}
     * @utbot.returnsFrom {@code return "Np10pww";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_98 : False -> return \"Np10pww\"")
    public void testClass_0_method_0_NotClass_0_field_98_3() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_24 = Class_0.class_0_field_24;
        boolean prevClass_0_field_25 = Class_0.class_0_field_25;
        boolean prevClass_0_field_33 = Class_0.class_0_field_33;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = false;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_24 = true;
            Class_0.class_0_field_25 = true;
            Class_0.class_0_field_33 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = false;
            Class_0.class_0_field_100 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "Np10pww";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_24 = prevClass_0_field_24;
            Class_0.class_0_field_25 = prevClass_0_field_25;
            Class_0.class_0_field_33 = prevClass_0_field_33;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
            Class_0.class_0_field_100 = prevClass_0_field_100;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_90): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_101): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_3): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.returnsFrom {@code return "LFB";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_3 : True -> return \"LFB\"")
    public void testClass_0_method_0_Class_0_field_48_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_101 = Class_0.class_0_field_101;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_101 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "LFB";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_101 = prevClass_0_field_101;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): False}
     * @utbot.executesCondition {@code (if (class_0_field_59) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_31 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_31() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = false;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_89): False}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_38): False}
     * @utbot.returnsFrom {@code return "vZ3";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_38 : False -> return \"vZ3\"")
    public void testClass_0_method_0_NotClass_0_field_38() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_38 = false;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_89 = false;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "vZ3";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_41): False}
     * @utbot.executesCondition {@code (class_0_field_39): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_68): False}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.returnsFrom {@code return "lNfxalVq";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_68 : False -> return \"lNfxalVq\"")
    public void testClass_0_method_0_Class_0_field_54_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_68 = Class_0.class_0_field_68;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_39 = true;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_68 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "lNfxalVq";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_68 = prevClass_0_field_68;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_90): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_101): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_31): False}
     * @utbot.returnsFrom {@code return "K3qtXM9H2vxcy";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_31 : False -> return \"K3qtXM9H2vxcy\"")
    public void testClass_0_method_0_NotClass_0_field_31_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_101 = Class_0.class_0_field_101;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_31 = false;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_101 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "K3qtXM9H2vxcy";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_101 = prevClass_0_field_101;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_41): False}
     * @utbot.executesCondition {@code (class_0_field_39): False}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_99): False}
     * @utbot.executesCondition {@code (class_0_field_71): False}
     * @utbot.returnsFrom {@code return "v2UGH6ImzgU";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_39 : False -> return \"v2UGH6ImzgU\"")
    public void testClass_0_method_0_NotClass_0_field_71() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = false;
            Class_0.class_0_field_39 = false;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_99 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_7): False}
     * @utbot.executesCondition {@code (class_0_field_36): False}
     * @utbot.executesCondition {@code (class_0_field_32): False}
     * @utbot.returnsFrom {@code return "vZ3";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_36 : False -> return \"vZ3\"")
    public void testClass_0_method_0_NotClass_0_field_32_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_7 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_32 = false;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "vZ3";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): False}
     * @utbot.executesCondition {@code (if (class_0_field_59) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): False}
     * @utbot.returnsFrom {@code return "EjHK1";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_94 : False -> return \"EjHK1\"")
    public void testClass_0_method_0_NotClass_0_field_94() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_94 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_7): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.returnsFrom {@code return "wxshjJvXs";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_36 : True -> return \"wxshjJvXs\"")
    public void testClass_0_method_0_Class_0_field_36() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_7 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "wxshjJvXs";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_7): True}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_34): False}
     * @utbot.executesCondition {@code (class_0_field_5): False}
     * @utbot.returnsFrom {@code return "HJ1DCYvFgn";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_34 : False -> return \"HJ1DCYvFgn\"")
    public void testClass_0_method_0_NotClass_0_field_5() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_34 = Class_0.class_0_field_34;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_5 = false;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_34 = false;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "HJ1DCYvFgn";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_34 = prevClass_0_field_34;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_7): True}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_34): True}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_5): True}
     * @utbot.executesCondition {@code (class_0_field_83): True}
     * @utbot.returnsFrom {@code return "GqfVa2dF0Jk";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_83 : True -> return \"GqfVa2dF0Jk\"")
    public void testClass_0_method_0_Class_0_field_83_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_34 = Class_0.class_0_field_34;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_5 = true;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_34 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "GqfVa2dF0Jk";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_34 = prevClass_0_field_34;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_7): True}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_34): True}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_5): True}
     * @utbot.executesCondition {@code (class_0_field_83): False}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.returnsFrom {@code return "HJ1DCYvFgn";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_83 : False -> return \"HJ1DCYvFgn\"")
    public void testClass_0_method_0_NotClass_0_field_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_34 = Class_0.class_0_field_34;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_5 = true;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_34 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = false;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "HJ1DCYvFgn";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_34 = prevClass_0_field_34;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_7): True}
     * @utbot.executesCondition {@code (class_0_field_32): False}
     * @utbot.returnsFrom {@code return "HJ1DCYvFgn";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_32 : False -> return \"HJ1DCYvFgn\"")
    public void testClass_0_method_0_NotClass_0_field_32_2() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_32 = false;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "HJ1DCYvFgn";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_89): False}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_38): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_6): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.returnsFrom {@code return "QWSl";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_6 : False -> return \"QWSl\"")
    public void testClass_0_method_0_NotClass_0_field_6() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_6 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_38 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_89 = false;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "QWSl";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_90): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_101): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_50): False}
     * @utbot.executesCondition {@code (class_0_field_96): False}
     * @utbot.returnsFrom {@code return "dQeth91JuU";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_96 : False -> return \"dQeth91JuU\"")
    public void testClass_0_method_0_NotClass_0_field_96_2() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_50 = Class_0.class_0_field_50;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_101 = Class_0.class_0_field_101;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_50 = false;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = false;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_101 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "dQeth91JuU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_50 = prevClass_0_field_50;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_101 = prevClass_0_field_101;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_90): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_101): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_50): False}
     * @utbot.executesCondition {@code (class_0_field_96): True}
     * @utbot.returnsFrom {@code return "AhSd";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_96 : True -> return \"AhSd\"")
    public void testClass_0_method_0_Class_0_field_96_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_50 = Class_0.class_0_field_50;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_101 = Class_0.class_0_field_101;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_50 = false;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_101 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AhSd";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_50 = prevClass_0_field_50;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_101 = prevClass_0_field_101;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_41): False}
     * @utbot.executesCondition {@code (class_0_field_39): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_68): True}
     * @utbot.executesCondition {@code (class_0_field_82): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_46): False}
     * @utbot.returnsFrom {@code return "uH2WxxLUqDqfBc";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_46 : False -> return \"uH2WxxLUqDqfBc\"")
    public void testClass_0_method_0_NotClass_0_field_46() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_46 = Class_0.class_0_field_46;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_68 = Class_0.class_0_field_68;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_39 = true;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_46 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_68 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "uH2WxxLUqDqfBc";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_46 = prevClass_0_field_46;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_68 = prevClass_0_field_68;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): True}
     * @utbot.executesCondition {@code (if (class_0_field_97) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_11): True}
     * @utbot.executesCondition {@code (class_0_field_51): True}
     * @utbot.returnsFrom {@code return "zbbaosqpAKf3Ob";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_11 : True -> return \"zbbaosqpAKf3Ob\"")
    public void testClass_0_method_0_Class_0_field_51_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_11 = Class_0.class_0_field_11;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_51 = Class_0.class_0_field_51;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_11 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = false;
            Class_0.class_0_field_38 = true;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_51 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "zbbaosqpAKf3Ob";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_11 = prevClass_0_field_11;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_51 = prevClass_0_field_51;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_84): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_89): False}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_38): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_6): True}
     * @utbot.executesCondition {@code (class_0_field_14): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.returnsFrom {@code return "QWSl";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_6 : True -> return \"QWSl\"")
    public void testClass_0_method_0_NotClass_0_field_14() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_14 = Class_0.class_0_field_14;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_6 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_14 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_38 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_89 = false;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "QWSl";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_14 = prevClass_0_field_14;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): True}
     * @utbot.executesCondition {@code (class_0_field_76): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_13): False}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_10): False}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_48): True}
     * @utbot.executesCondition {@code (class_0_field_65): True}
     * @utbot.executesCondition {@code (class_0_field_42): True}
     * @utbot.executesCondition {@code (class_0_field_94): True}
     * @utbot.executesCondition {@code (class_0_field_70): True}
     * @utbot.executesCondition {@code (class_0_field_31): True}
     * @utbot.executesCondition {@code (class_0_field_89): False}
     * @utbot.executesCondition {@code (class_0_field_32): True}
     * @utbot.executesCondition {@code (class_0_field_38): True}
     * @utbot.executesCondition {@code (class_0_field_10): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.returnsFrom {@code return "QWSl";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_10 : False -> return \"QWSl\"")
    public void testClass_0_method_0_NotClass_0_field_10_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_32 = true;
            Class_0.class_0_field_38 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = false;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "QWSl";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): True}
     * @utbot.executesCondition {@code (if (class_0_field_97) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_98): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_99): False}
     * @utbot.executesCondition {@code (class_0_field_0): False}
     * @utbot.returnsFrom {@code return "v2UGH6ImzgU";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_98 : False -> return \"v2UGH6ImzgU\"")
    public void testClass_0_method_0_NotClass_0_field_98_4() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_0 = false;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = false;
            Class_0.class_0_field_38 = true;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_98 = false;
            Class_0.class_0_field_99 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_98 = prevClass_0_field_98;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): True}
     * @utbot.executesCondition {@code (class_0_field_49): True}
     * @utbot.executesCondition {@code (class_0_field_89): True}
     * @utbot.executesCondition {@code (class_0_field_41): False}
     * @utbot.executesCondition {@code (class_0_field_39): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_68): True}
     * @utbot.executesCondition {@code (class_0_field_82): True}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_46): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.returnsFrom {@code return "0imSlhNn763E";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_46 : True -> return \"0imSlhNn763E\"")
    public void testClass_0_method_0_Class_0_field_81_2() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_46 = Class_0.class_0_field_46;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_68 = Class_0.class_0_field_68;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_39 = true;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_46 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_68 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "0imSlhNn763E";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_46 = prevClass_0_field_46;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_68 = prevClass_0_field_68;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): True}
     * @utbot.executesCondition {@code (if (class_0_field_97) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_11): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_99): True}
     * @utbot.executesCondition {@code (class_0_field_30): False}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.returnsFrom {@code return "kLlXhIQc";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_11 : False -> return \"kLlXhIQc\"")
    public void testClass_0_method_0_NotClass_0_field_11() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_11 = Class_0.class_0_field_11;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_30 = Class_0.class_0_field_30;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_11 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = false;
            Class_0.class_0_field_30 = false;
            Class_0.class_0_field_38 = true;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_98 = true;
            Class_0.class_0_field_99 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "kLlXhIQc";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_11 = prevClass_0_field_11;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_30 = prevClass_0_field_30;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_98 = prevClass_0_field_98;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): True}
     * @utbot.executesCondition {@code (class_0_field_52): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): True}
     * @utbot.executesCondition {@code (class_0_field_23): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_86): True}
     * @utbot.executesCondition {@code (class_0_field_4): False}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_90): False}
     * @utbot.executesCondition {@code (class_0_field_19): True}
     * @utbot.executesCondition {@code (class_0_field_101): True}
     * @utbot.executesCondition {@code (class_0_field_13): True}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_3): False}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_7): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_3): False}
     * @utbot.executesCondition {@code (if (class_0_field_45) {
     * }): True}
     * @utbot.executesCondition {@code (if (class_0_field_100) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_36): False}
     * @utbot.returnsFrom {@code return "AKaCVaUV";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_3 : False -> return \"AKaCVaUV\"")
    public void testClass_0_method_0_NotClass_0_field_36_2() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_100 = Class_0.class_0_field_100;
        boolean prevClass_0_field_101 = Class_0.class_0_field_101;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_100 = true;
            Class_0.class_0_field_101 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AKaCVaUV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_100 = prevClass_0_field_100;
            Class_0.class_0_field_101 = prevClass_0_field_101;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_60): True}
     * @utbot.executesCondition {@code (class_0_field_95): True}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): True}
     * @utbot.executesCondition {@code (class_0_field_16): False}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_59): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     * @utbot.executesCondition {@code (class_0_field_74): True}
     * @utbot.executesCondition {@code (class_0_field_79): True}
     * @utbot.executesCondition {@code (class_0_field_22): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_54): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_55): True}
     * @utbot.executesCondition {@code (class_0_field_78): True}
     * @utbot.executesCondition {@code (class_0_field_45): False}
     * @utbot.executesCondition {@code (class_0_field_71): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_93): True}
     * @utbot.executesCondition {@code (class_0_field_47): True}
     * @utbot.executesCondition {@code (class_0_field_53): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_38): True}
     * @utbot.executesCondition {@code (if (class_0_field_97) {
     * }): True}
     * @utbot.executesCondition {@code (class_0_field_98): True}
     * @utbot.executesCondition {@code (class_0_field_43): False}
     * @utbot.executesCondition {@code (class_0_field_86): False}
     * @utbot.executesCondition {@code (class_0_field_97): True}
     * @utbot.executesCondition {@code (class_0_field_99): False}
     * @utbot.executesCondition {@code (class_0_field_0): False}
     * @utbot.returnsFrom {@code return "v2UGH6ImzgU";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_86 : False -> return \"v2UGH6ImzgU\"")
    public void testClass_0_method_0_NotClass_0_field_86() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_0 = false;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = false;
            Class_0.class_0_field_38 = true;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = false;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_98 = true;
            Class_0.class_0_field_99 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_98 = prevClass_0_field_98;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method class_0_method_0()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (class_0_field_60): True},
    ///     {@code (class_0_field_95): False}
    /// </pre>

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_36): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_36 : False -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_36_3() {
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_95 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_10): True}
     * @utbot.returnsFrom {@code return "xx9kKki";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_10 : True -> return \"xx9kKki\"")
    public void testClass_0_method_0_Class_0_field_10() {
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_95 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "xx9kKki";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_36): True}
     * @utbot.executesCondition {@code (class_0_field_10): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_10 : False -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_10_2() {
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_95 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method class_0_method_0()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (class_0_field_60): True},
    ///     {@code (class_0_field_95): True},
    ///     {@code (class_0_field_36): False}
    /// return from: {@code return "NYhj2so7AqfueK";}
    /// </pre>

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_63 : False -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_9() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_9 = false;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_63): False}
     * @utbot.executesCondition {@code (class_0_field_9): True}
     * @utbot.executesCondition {@code (class_0_field_81): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_9 : True -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_81_1() {
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_81 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_63): True}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_9): False}
     * @utbot.returnsFrom {@code return "NYhj2so7AqfueK";}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_63 : True -> return \"NYhj2so7AqfueK\"")
    public void testClass_0_method_0_NotClass_0_field_1_1() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_9 = false;
            Class_0.class_0_field_36 = false;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "NYhj2so7AqfueK";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method class_0_method_0()

    @Test
    public void testClass_0_method_01() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_48 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "jxrZ";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_02() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = false;
            Class_0.class_0_field_49 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_67 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_03() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_04() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_42 = false;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_05() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "rNgTCe3k8q12";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_06() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "0imSlhNn763E";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_07() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_11 = Class_0.class_0_field_11;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_11 = false;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_29 = true;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "qryq";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_11 = prevClass_0_field_11;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    @Test
    public void testClass_0_method_08() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_93 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_99 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    @Test
    public void testClass_0_method_09() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = false;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_010() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_7 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_39 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "Mh0GPG0L";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    @Test
    public void testClass_0_method_011() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_101 = Class_0.class_0_field_101;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_101 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "AKaCVaUV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_101 = prevClass_0_field_101;
        }
    }

    @Test
    public void testClass_0_method_012() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_94 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_013() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_68 = Class_0.class_0_field_68;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_67 = false;
            Class_0.class_0_field_68 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_99 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_68 = prevClass_0_field_68;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    @Test
    public void testClass_0_method_014() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_73 = Class_0.class_0_field_73;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_7 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = false;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_73 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AKaCVaUV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_73 = prevClass_0_field_73;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    @Test
    public void testClass_0_method_015() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_7 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_29 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "qryq";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    @Test
    public void testClass_0_method_016() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_12 = Class_0.class_0_field_12;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_18 = Class_0.class_0_field_18;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_12 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_18 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = false;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "cVi";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_12 = prevClass_0_field_12;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_18 = prevClass_0_field_18;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    @Test
    public void testClass_0_method_017() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_30 = Class_0.class_0_field_30;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_30 = true;
            Class_0.class_0_field_38 = true;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_98 = false;
            Class_0.class_0_field_99 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "ZtVKBdGFtE";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_30 = prevClass_0_field_30;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_98 = prevClass_0_field_98;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    @Test
    public void testClass_0_method_018() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_29 = false;
            Class_0.class_0_field_44 = false;
            Class_0.class_0_field_48 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_67 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "jxrZ";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    @Test
    public void testClass_0_method_019() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_67 = Class_0.class_0_field_67;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = false;
            Class_0.class_0_field_49 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_67 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_67 = prevClass_0_field_67;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_020() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_94 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_021() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_70 = Class_0.class_0_field_70;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_94 = Class_0.class_0_field_94;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_31 = false;
            Class_0.class_0_field_42 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_70 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_94 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_70 = prevClass_0_field_70;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_94 = prevClass_0_field_94;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_022() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_34 = Class_0.class_0_field_34;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_34 = false;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_39 = true;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AfXql";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_34 = prevClass_0_field_34;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_023() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_42 = Class_0.class_0_field_42;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_42 = false;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "rNgTCe3k8q12";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_42 = prevClass_0_field_42;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_024() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_7 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = false;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AKaCVaUV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    @Test
    public void testClass_0_method_025() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_101 = Class_0.class_0_field_101;
        try {
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_21 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = false;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_101 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "K3qtXM9H2vxcy";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_101 = prevClass_0_field_101;
        }
    }

    @Test
    public void testClass_0_method_026() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_66 = Class_0.class_0_field_66;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_85 = Class_0.class_0_field_85;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_102 = Class_0.class_0_field_102;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_39 = true;
            Class_0.class_0_field_44 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = false;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_66 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_85 = true;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_102 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "B3XZ";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_66 = prevClass_0_field_66;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_85 = prevClass_0_field_85;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_102 = prevClass_0_field_102;
        }
    }

    @Test
    public void testClass_0_method_027() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = false;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "0imSlhNn763E";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_028() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_7 = Class_0.class_0_field_7;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_21 = Class_0.class_0_field_21;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_61 = Class_0.class_0_field_61;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_75 = Class_0.class_0_field_75;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_92 = Class_0.class_0_field_92;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_0 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_7 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_21 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_39 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_61 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_75 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_92 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AKaCVaUV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_7 = prevClass_0_field_7;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_21 = prevClass_0_field_21;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_61 = prevClass_0_field_61;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_75 = prevClass_0_field_75;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_92 = prevClass_0_field_92;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    @Test
    public void testClass_0_method_029() {
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_65 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_86 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    @Test
    public void testClass_0_method_030() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_12 = Class_0.class_0_field_12;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_30 = Class_0.class_0_field_30;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_62 = Class_0.class_0_field_62;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        boolean prevClass_0_field_103 = Class_0.class_0_field_103;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_12 = false;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_30 = true;
            Class_0.class_0_field_38 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_62 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_99 = true;
            Class_0.class_0_field_103 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "NWTJmkL";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_12 = prevClass_0_field_12;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_30 = prevClass_0_field_30;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_62 = prevClass_0_field_62;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_99 = prevClass_0_field_99;
            Class_0.class_0_field_103 = prevClass_0_field_103;
        }
    }

    @Test
    public void testClass_0_method_031() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_68 = Class_0.class_0_field_68;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_68 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_99 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_68 = prevClass_0_field_68;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    @Test
    public void testClass_0_method_032() {
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_39 = Class_0.class_0_field_39;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_39 = false;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_99 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_39 = prevClass_0_field_39;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    @Test
    public void testClass_0_method_033() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_44 = Class_0.class_0_field_44;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_44 = false;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_44 = prevClass_0_field_44;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    @Test
    public void testClass_0_method_034() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_48 = false;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_78 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "rNgTCe3k8q12";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_035() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = false;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "AKaCVaUV";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    @Test
    public void testClass_0_method_036() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_19 = Class_0.class_0_field_19;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_31 = Class_0.class_0_field_31;
        boolean prevClass_0_field_36 = Class_0.class_0_field_36;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_101 = Class_0.class_0_field_101;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_19 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_31 = true;
            Class_0.class_0_field_36 = true;
            Class_0.class_0_field_48 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_101 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "w9LSvz500hx";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_19 = prevClass_0_field_19;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_31 = prevClass_0_field_31;
            Class_0.class_0_field_36 = prevClass_0_field_36;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_101 = prevClass_0_field_101;
        }
    }

    @Test
    public void testClass_0_method_037() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_038() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_47 = false;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = false;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_039() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_29 = Class_0.class_0_field_29;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_91 = Class_0.class_0_field_91;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_13 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_29 = false;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_49 = false;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_84 = false;
            Class_0.class_0_field_91 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_98 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_29 = prevClass_0_field_29;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_91 = prevClass_0_field_91;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_98 = prevClass_0_field_98;
        }
    }

    @Test
    public void testClass_0_method_040() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_68 = Class_0.class_0_field_68;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = false;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_68 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_99 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "v2UGH6ImzgU";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_68 = prevClass_0_field_68;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }

    @Test
    public void testClass_0_method_041() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_12 = Class_0.class_0_field_12;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_90 = Class_0.class_0_field_90;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_12 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = false;
            Class_0.class_0_field_41 = true;
            Class_0.class_0_field_43 = true;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = false;
            Class_0.class_0_field_90 = false;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "aYy0IKt";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_12 = prevClass_0_field_12;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_90 = prevClass_0_field_90;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_042() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_65 = Class_0.class_0_field_65;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = false;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = false;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_65 = false;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = false;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "EjHK1";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_65 = prevClass_0_field_65;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
        }
    }

    @Test
    public void testClass_0_method_043() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_10 = Class_0.class_0_field_10;
        boolean prevClass_0_field_13 = Class_0.class_0_field_13;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_17 = Class_0.class_0_field_17;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_32 = Class_0.class_0_field_32;
        boolean prevClass_0_field_48 = Class_0.class_0_field_48;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_82 = Class_0.class_0_field_82;
        boolean prevClass_0_field_83 = Class_0.class_0_field_83;
        boolean prevClass_0_field_84 = Class_0.class_0_field_84;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_96 = Class_0.class_0_field_96;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_10 = true;
            Class_0.class_0_field_13 = false;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_17 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_32 = false;
            Class_0.class_0_field_48 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_82 = true;
            Class_0.class_0_field_83 = true;
            Class_0.class_0_field_84 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_96 = false;

            String actual = Class_0.class_0_method_0();

            String expected = "a1ERTJDHi1g6f";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_10 = prevClass_0_field_10;
            Class_0.class_0_field_13 = prevClass_0_field_13;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_17 = prevClass_0_field_17;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_32 = prevClass_0_field_32;
            Class_0.class_0_field_48 = prevClass_0_field_48;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_82 = prevClass_0_field_82;
            Class_0.class_0_field_83 = prevClass_0_field_83;
            Class_0.class_0_field_84 = prevClass_0_field_84;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_96 = prevClass_0_field_96;
        }
    }

    @Test
    public void testClass_0_method_044() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_23 = Class_0.class_0_field_23;
        boolean prevClass_0_field_41 = Class_0.class_0_field_41;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_49 = Class_0.class_0_field_49;
        boolean prevClass_0_field_52 = Class_0.class_0_field_52;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_76 = Class_0.class_0_field_76;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_89 = Class_0.class_0_field_89;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_16 = true;
            Class_0.class_0_field_22 = true;
            Class_0.class_0_field_23 = true;
            Class_0.class_0_field_41 = false;
            Class_0.class_0_field_45 = true;
            Class_0.class_0_field_49 = true;
            Class_0.class_0_field_52 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_76 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_89 = true;
            Class_0.class_0_field_95 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "lNfxalVq";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_23 = prevClass_0_field_23;
            Class_0.class_0_field_41 = prevClass_0_field_41;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_49 = prevClass_0_field_49;
            Class_0.class_0_field_52 = prevClass_0_field_52;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_76 = prevClass_0_field_76;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_89 = prevClass_0_field_89;
            Class_0.class_0_field_95 = prevClass_0_field_95;
        }
    }

    @Test
    public void testClass_0_method_045() {
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        boolean prevClass_0_field_9 = Class_0.class_0_field_9;
        boolean prevClass_0_field_11 = Class_0.class_0_field_11;
        boolean prevClass_0_field_16 = Class_0.class_0_field_16;
        boolean prevClass_0_field_22 = Class_0.class_0_field_22;
        boolean prevClass_0_field_30 = Class_0.class_0_field_30;
        boolean prevClass_0_field_38 = Class_0.class_0_field_38;
        boolean prevClass_0_field_43 = Class_0.class_0_field_43;
        boolean prevClass_0_field_45 = Class_0.class_0_field_45;
        boolean prevClass_0_field_47 = Class_0.class_0_field_47;
        boolean prevClass_0_field_51 = Class_0.class_0_field_51;
        boolean prevClass_0_field_53 = Class_0.class_0_field_53;
        boolean prevClass_0_field_54 = Class_0.class_0_field_54;
        boolean prevClass_0_field_55 = Class_0.class_0_field_55;
        boolean prevClass_0_field_59 = Class_0.class_0_field_59;
        boolean prevClass_0_field_60 = Class_0.class_0_field_60;
        boolean prevClass_0_field_63 = Class_0.class_0_field_63;
        boolean prevClass_0_field_71 = Class_0.class_0_field_71;
        boolean prevClass_0_field_74 = Class_0.class_0_field_74;
        boolean prevClass_0_field_78 = Class_0.class_0_field_78;
        boolean prevClass_0_field_79 = Class_0.class_0_field_79;
        boolean prevClass_0_field_81 = Class_0.class_0_field_81;
        boolean prevClass_0_field_86 = Class_0.class_0_field_86;
        boolean prevClass_0_field_93 = Class_0.class_0_field_93;
        boolean prevClass_0_field_95 = Class_0.class_0_field_95;
        boolean prevClass_0_field_97 = Class_0.class_0_field_97;
        boolean prevClass_0_field_98 = Class_0.class_0_field_98;
        boolean prevClass_0_field_99 = Class_0.class_0_field_99;
        try {
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = true;
            Class_0.class_0_field_9 = true;
            Class_0.class_0_field_11 = true;
            Class_0.class_0_field_16 = false;
            Class_0.class_0_field_22 = false;
            Class_0.class_0_field_30 = false;
            Class_0.class_0_field_38 = true;
            Class_0.class_0_field_43 = false;
            Class_0.class_0_field_45 = false;
            Class_0.class_0_field_47 = true;
            Class_0.class_0_field_51 = false;
            Class_0.class_0_field_53 = true;
            Class_0.class_0_field_54 = true;
            Class_0.class_0_field_55 = true;
            Class_0.class_0_field_59 = true;
            Class_0.class_0_field_60 = true;
            Class_0.class_0_field_63 = true;
            Class_0.class_0_field_71 = true;
            Class_0.class_0_field_74 = true;
            Class_0.class_0_field_78 = true;
            Class_0.class_0_field_79 = true;
            Class_0.class_0_field_81 = true;
            Class_0.class_0_field_86 = true;
            Class_0.class_0_field_93 = true;
            Class_0.class_0_field_95 = true;
            Class_0.class_0_field_97 = true;
            Class_0.class_0_field_98 = true;
            Class_0.class_0_field_99 = true;

            String actual = Class_0.class_0_method_0();

            String expected = "kLlXhIQc";
            assertEquals(expected, actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.class_0_field_9 = prevClass_0_field_9;
            Class_0.class_0_field_11 = prevClass_0_field_11;
            Class_0.class_0_field_16 = prevClass_0_field_16;
            Class_0.class_0_field_22 = prevClass_0_field_22;
            Class_0.class_0_field_30 = prevClass_0_field_30;
            Class_0.class_0_field_38 = prevClass_0_field_38;
            Class_0.class_0_field_43 = prevClass_0_field_43;
            Class_0.class_0_field_45 = prevClass_0_field_45;
            Class_0.class_0_field_47 = prevClass_0_field_47;
            Class_0.class_0_field_51 = prevClass_0_field_51;
            Class_0.class_0_field_53 = prevClass_0_field_53;
            Class_0.class_0_field_54 = prevClass_0_field_54;
            Class_0.class_0_field_55 = prevClass_0_field_55;
            Class_0.class_0_field_59 = prevClass_0_field_59;
            Class_0.class_0_field_60 = prevClass_0_field_60;
            Class_0.class_0_field_63 = prevClass_0_field_63;
            Class_0.class_0_field_71 = prevClass_0_field_71;
            Class_0.class_0_field_74 = prevClass_0_field_74;
            Class_0.class_0_field_78 = prevClass_0_field_78;
            Class_0.class_0_field_79 = prevClass_0_field_79;
            Class_0.class_0_field_81 = prevClass_0_field_81;
            Class_0.class_0_field_86 = prevClass_0_field_86;
            Class_0.class_0_field_93 = prevClass_0_field_93;
            Class_0.class_0_field_95 = prevClass_0_field_95;
            Class_0.class_0_field_97 = prevClass_0_field_97;
            Class_0.class_0_field_98 = prevClass_0_field_98;
            Class_0.class_0_field_99 = prevClass_0_field_99;
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable manual.Class_0.class_0_method_1

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method class_0_method_1()

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_1()}
     * @utbot.returnsFrom {@code return "cDi";}
     */
    @Test
    @DisplayName("class_0_method_1: -> return \"cDi\"")
    public void testClass_0_method_1_ReturnCDi() {
        String actual = Class_0.class_0_method_1();

        String expected = "cDi";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
