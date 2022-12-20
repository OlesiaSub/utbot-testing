package src.utbot.results.s3;

import utbot.sources.s3.Class_0;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public final class Class_0Test {
    ///region Test suites for executable dec_16.Class_0.class_0_method_0

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method class_0_method_0()

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_0()}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.returnsFrom {@code return true;}
     */
    @Test
    @DisplayName("class_0_method_0: class_0_field_0 : True -> return true")
    public void testClass_0_method_0_Class_0_field_0() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_4 = true;

            boolean actual = Class_0.class_0_method_0();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_4 = prevClass_0_field_4;
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable dec_16.Class_0.class_0_method_1

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method class_0_method_1()

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_1()}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     */
    @Test
    @DisplayName("class_0_method_1: -> class_0_field_1 : False")
    public void testClass_0_method_1_NotClass_0_field_1() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;

            boolean actual = Class_0.class_0_method_1();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_1()}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_5): False}
     * @utbot.executesCondition {@code (class_0_field_2): True}
     */
    @Test
    @DisplayName("class_0_method_1: class_0_field_1 : True -> class_0_field_5 : False")
    public void testClass_0_method_1_NotClass_0_field_5() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = false;

            boolean actual = Class_0.class_0_method_1();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_1()}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     * @utbot.executesCondition {@code (class_0_field_5): True}
     * @utbot.executesCondition {@code (class_0_field_1): True}
     */
    @Test
    @DisplayName("class_0_method_1: class_0_field_5 : True -> class_0_field_1 : True")
    public void testClass_0_method_1_Class_0_field_1() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = true;

            boolean actual = Class_0.class_0_method_1();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable dec_16.Class_0.class_0_method_2

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method class_0_method_2()

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_2()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.returnsFrom {@code return true;}
     */
    @Test
    @DisplayName("class_0_method_2: class_0_method_0 -> return true")
    public void testClass_0_method_2_class_0_method_0() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = false;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;

            boolean actual = Class_0.class_0_method_2();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_2()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.returnsFrom {@code return true;}
     */
    @Test
    @DisplayName("class_0_method_2: class_0_method_0 -> return true")
    public void testClass_0_method_2_class_0_method_0_1() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;

            boolean actual = Class_0.class_0_method_2();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_2()}
     * @utbot.executesCondition {@code (null): False}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.returnsFrom {@code return true;}
     */
    @Test
    @DisplayName("class_0_method_2: class_0_method_0 -> return true")
    public void testClass_0_method_2_class_0_method_0_2() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = false;

            boolean actual = Class_0.class_0_method_2();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_2()}
     * @utbot.executesCondition {@code (null): True}
     * @utbot.executesCondition {@code (null): True}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.returnsFrom {@code return true;}
     */
    @Test
    @DisplayName("class_0_method_2: class_0_method_0 -> return true")
    public void testClass_0_method_2_class_0_method_0_3() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = true;

            boolean actual = Class_0.class_0_method_2();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable dec_16.Class_0.class_0_method_3

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method class_0_method_3()

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_3()}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("class_0_method_3: class_0_field_8 : False -> return false")
    public void testClass_0_method_3_NotClass_0_field_8() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = false;

            boolean actual = Class_0.class_0_method_3();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_3()}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     */
    @Test
    @DisplayName("class_0_method_3: -> class_0_field_8 : True")
    public void testClass_0_method_3_Class_0_field_8() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = false;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = false;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_3();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_3()}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     */
    @Test
    @DisplayName("class_0_method_3: -> class_0_field_8 : True")
    public void testClass_0_method_3_Class_0_field_8_1() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = false;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = true;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_3();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_3()}
     * @utbot.executesCondition {@code (class_0_field_8): True}
     */
    @Test
    @DisplayName("class_0_method_3: -> class_0_field_8 : True")
    public void testClass_0_method_3_Class_0_field_8_2() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = false;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_3();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_3()}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("class_0_method_3: class_0_field_8 : False -> return false")
    public void testClass_0_method_3_NotClass_0_field_8_1() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = false;
            Class_0.class_0_field_8 = false;

            boolean actual = Class_0.class_0_method_3();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_3()}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("class_0_method_3: class_0_field_8 : False -> return false")
    public void testClass_0_method_3_NotClass_0_field_8_2() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = true;
            Class_0.class_0_field_8 = false;

            boolean actual = Class_0.class_0_method_3();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable dec_16.Class_0.class_0_method_4

    ///region OTHER: SUCCESSFUL EXECUTIONS for method class_0_method_4()

    @Test
    public void testClass_0_method_41() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        int prevI = Class_0.i;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = false;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = true;
            Class_0.class_0_field_8 = false;
            Class_0.i = -2137609703;

            boolean actual = Class_0.class_0_method_4();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.i = prevI;
        }
    }

    @Test
    public void testClass_0_method_42() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        int prevI = Class_0.i;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = false;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = false;
            Class_0.class_0_field_8 = true;
            Class_0.i = 9873945;

            boolean actual = Class_0.class_0_method_4();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.i = prevI;
        }
    }

    @Test
    public void testClass_0_method_43() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = false;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_4();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_44() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = true;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_4();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_45() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        int prevI = Class_0.i;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = false;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = true;
            Class_0.class_0_field_8 = true;
            Class_0.i = 9873945;

            boolean actual = Class_0.class_0_method_4();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.i = prevI;
        }
    }

    @Test
    public void testClass_0_method_46() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = false;
            Class_0.class_0_field_6 = true;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_4();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_47() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = false;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_4();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_48() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        int prevI = Class_0.i;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = false;
            Class_0.class_0_field_8 = false;
            Class_0.i = 9873945;

            boolean actual = Class_0.class_0_method_4();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.i = prevI;
        }
    }

    @Test
    public void testClass_0_method_49() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = true;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_4();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_410() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        int prevI = Class_0.i;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = true;
            Class_0.class_0_field_8 = false;
            Class_0.i = 9873945;

            boolean actual = Class_0.class_0_method_4();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.i = prevI;
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable dec_16.Class_0.class_0_method_5

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method class_0_method_5()

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#class_0_method_5()}
     * @utbot.executesCondition {@code (class_0_field_1): False}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (class_0_field_8): False}
     * @utbot.executesCondition {@code (null): False}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.executesCondition {@code (class_0_field_4): True}
     * @utbot.executesCondition {@code (class_0_field_0): True}
     * @utbot.invokes {@link Class_0#<clinit>()}
     * @utbot.invokes {@link Class_0#class_0_method_1()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.invokes {@link Class_0#class_0_method_0()}
     * @utbot.returnsFrom {@code return true;}
     */
    @Test
    @DisplayName("class_0_method_5: class_0_field_0 : True -> return true")
    public void testClass_0_method_5_Class_0_field_0() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_8 = false;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method class_0_method_5()

    @Test
    public void testClass_0_method_51() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = true;
            Class_0.class_0_field_8 = false;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_52() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = true;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_53() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = true;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_54() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        int prevI = Class_0.i;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = true;
            Class_0.class_0_field_8 = false;
            Class_0.i = 9873945;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.i = prevI;
        }
    }

    @Test
    public void testClass_0_method_55() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = false;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_56() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        int prevI = Class_0.i;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = false;
            Class_0.class_0_field_8 = false;
            Class_0.i = 9873945;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_8 = prevClass_0_field_8;
            Class_0.i = prevI;
        }
    }

    @Test
    public void testClass_0_method_57() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_5 = Class_0.class_0_field_5;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = true;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_5 = false;
            Class_0.class_0_field_6 = true;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_5 = prevClass_0_field_5;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_58() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = false;
            Class_0.class_0_field_3 = false;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = true;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_59() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = false;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = false;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_510() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = true;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }

    @Test
    public void testClass_0_method_511() {
        boolean prevClass_0_field_0 = Class_0.class_0_field_0;
        boolean prevClass_0_field_1 = Class_0.class_0_field_1;
        boolean prevClass_0_field_2 = Class_0.class_0_field_2;
        boolean prevClass_0_field_3 = Class_0.class_0_field_3;
        boolean prevClass_0_field_4 = Class_0.class_0_field_4;
        boolean prevClass_0_field_6 = Class_0.class_0_field_6;
        boolean prevClass_0_field_8 = Class_0.class_0_field_8;
        try {
            Class_0.class_0_field_0 = true;
            Class_0.class_0_field_1 = false;
            Class_0.class_0_field_2 = true;
            Class_0.class_0_field_3 = true;
            Class_0.class_0_field_4 = true;
            Class_0.class_0_field_6 = false;
            Class_0.class_0_field_8 = true;

            boolean actual = Class_0.class_0_method_5();

            assertTrue(actual);
        } finally {
            Class_0.class_0_field_0 = prevClass_0_field_0;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_2 = prevClass_0_field_2;
            Class_0.class_0_field_3 = prevClass_0_field_3;
            Class_0.class_0_field_4 = prevClass_0_field_4;
            Class_0.class_0_field_6 = prevClass_0_field_6;
            Class_0.class_0_field_8 = prevClass_0_field_8;
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable dec_16.Class_0.taintedString

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method taintedString(long)

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#taintedString(long)}
     * @utbot.executesCondition {@code (i > 9873944): True}
     * @utbot.returnsFrom {@code if (i > 9873944)
     * return "s1";
     * else
     * return "s2";}
     */
    @Test
    @DisplayName("taintedString: i > 9873944 : True -> i > 9873944")
    public void testTaintedString_IGreaterThan9873944() {
        String actual = Class_0.taintedString(9882137L);

        String expected = "s1";
        assertEquals(expected, actual);
    }
    ///endregion

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method taintedString(long)

    /**
     * @utbot.classUnderTest {@link Class_0}
     * @utbot.methodUnderTest {@link Class_0#taintedString(long)}
     */
    @Test
    @DisplayName("taintedString: arg_0 = 0L")
    public void testTaintedStringWithCornerCase() {
        String actual = Class_0.taintedString(0L);

        String expected = "s2";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
