package src.utbot.results.s1;

import org.junit.jupiter.api.Test;
import utbot.sources.s1.Class_0;
import utbot.sources.s1.Class_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public final class Class_2Test {
    ///region Test suites for executable meow.Class_2.class_2_method_0

    ///region

    @Test
    public void testClass_2_method_01() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_1 = Float.NaN;
            Long class_0_field_1 = 2141L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('S', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_02() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_1 = -1.0000001f;
            Long class_0_field_1 = 2178L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('S', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_03() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_1 = Float.POSITIVE_INFINITY;
            Class_2.class_2_field_4 = -1;
            Long class_0_field_1 = 2142L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('S', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_04() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_1 = 1.64926744E12f;
            Class_2.class_2_field_4 = 939;
            Long class_0_field_1 = 144115188075855872L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('a', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_05() {
        char prevClass_2_field_0 = Class_2.class_2_field_0;
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        float prevClass_2_field_2 = Class_2.class_2_field_2;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        boolean prevClass_2_field_6 = Class_2.class_2_field_6;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_0 = '\u0080';
            Class_2.class_2_field_1 = 3.6893822E19f;
            Class_2.class_2_field_2 = -5.4647274E-20f;
            Class_2.class_2_field_4 = 3;
            Class_2.class_2_field_5 = -1.0000305f;
            Class_2.class_2_field_6 = false;
            Long class_0_field_1 = 2142L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('1', actual);
        } finally {
            Class_2.class_2_field_0 = prevClass_2_field_0;
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_2 = prevClass_2_field_2;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_2.class_2_field_6 = prevClass_2_field_6;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_06() {
        char prevClass_2_field_0 = Class_2.class_2_field_0;
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        float prevClass_2_field_2 = Class_2.class_2_field_2;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        boolean prevClass_2_field_6 = Class_2.class_2_field_6;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_0 = 'H';
            Class_2.class_2_field_1 = 7.378701E19f;
            Class_2.class_2_field_2 = Float.NaN;
            Class_2.class_2_field_4 = 3;
            Class_2.class_2_field_5 = -2.940172E-39f;
            Class_2.class_2_field_6 = false;
            Long class_0_field_1 = 288230376151711838L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('v', actual);
        } finally {
            Class_2.class_2_field_0 = prevClass_2_field_0;
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_2 = prevClass_2_field_2;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_2.class_2_field_6 = prevClass_2_field_6;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_07() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        boolean prevClass_2_field_6 = Class_2.class_2_field_6;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_1 = 2.88476667E17f;
            Class_2.class_2_field_4 = 11;
            Class_2.class_2_field_5 = 3.231E-42f;
            Class_2.class_2_field_6 = true;
            Long class_0_field_1 = 2142L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('1', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_2.class_2_field_6 = prevClass_2_field_6;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_08() {
        char prevClass_2_field_0 = Class_2.class_2_field_0;
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        float prevClass_2_field_2 = Class_2.class_2_field_2;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        boolean prevClass_2_field_6 = Class_2.class_2_field_6;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_0 = '\u0000';
            Class_2.class_2_field_1 = Float.POSITIVE_INFINITY;
            Class_2.class_2_field_2 = 702.3135f;
            Class_2.class_2_field_4 = 11;
            Class_2.class_2_field_5 = -1.1E-44f;
            Class_2.class_2_field_6 = false;
            Long class_0_field_1 = 2142L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('U', actual);
        } finally {
            Class_2.class_2_field_0 = prevClass_2_field_0;
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_2 = prevClass_2_field_2;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_2.class_2_field_6 = prevClass_2_field_6;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_09() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        String prevClass_0_field_0 = Class_0.class_0_field_0;
        try {
            Class_2.class_2_field_1 = 2.767012E19f;
            Class_2.class_2_field_4 = 235;
            Class_2.class_2_field_5 = 1.794E-43f;
            Long class_0_field_1 = 2142L;
            Class_0.class_0_field_1 = class_0_field_1;
            String class_0_field_0 = "47J9z0hhMKO5X";
            Class_0.class_0_field_0 = class_0_field_0;

            char actual = Class_2.class_2_method_0();

            assertEquals('0', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_0 = prevClass_0_field_0;
        }
    }

    @Test
    public void testClass_2_method_010() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        String prevClass_0_field_0 = Class_0.class_0_field_0;
        try {
            Class_2.class_2_field_1 = 2.4211352E19f;
            Class_2.class_2_field_4 = 0;
            Class_2.class_2_field_5 = Float.POSITIVE_INFINITY;
            Long class_0_field_1 = 2142L;
            Class_0.class_0_field_1 = class_0_field_1;
            String class_0_field_0 = "47J9z0hhMKO5X";
            Class_0.class_0_field_0 = class_0_field_0;

            char actual = Class_2.class_2_method_0();

            assertEquals('a', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_0 = prevClass_0_field_0;
        }
    }

    @Test
    public void testClass_2_method_011() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_1 = 4.2949678E9f;
            Class_2.class_2_field_4 = 939;
            Long class_0_field_1 = -9223372036854773248L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('a', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_012() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        boolean prevClass_2_field_6 = Class_2.class_2_field_6;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_1 = Float.POSITIVE_INFINITY;
            Class_2.class_2_field_4 = 11;
            Class_2.class_2_field_5 = -2.938781E-39f;
            Class_2.class_2_field_6 = true;
            Long class_0_field_1 = -9223372036854773638L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('1', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_2.class_2_field_6 = prevClass_2_field_6;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_013() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_1 = 1.9599666E19f;
            Class_2.class_2_field_4 = 0;
            Class_2.class_2_field_5 = 16.000002f;
            Long class_0_field_1 = -9223372036854773666L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('a', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_014() {
        char prevClass_2_field_0 = Class_2.class_2_field_0;
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        float prevClass_2_field_2 = Class_2.class_2_field_2;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        boolean prevClass_2_field_6 = Class_2.class_2_field_6;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_0 = '\u0080';
            Class_2.class_2_field_1 = 9.230578E19f;
            Class_2.class_2_field_2 = 4.1221295E31f;
            Class_2.class_2_field_4 = 0;
            Class_2.class_2_field_5 = -1.1496E-41f;
            Class_2.class_2_field_6 = false;
            Long class_0_field_1 = 2141L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('U', actual);
        } finally {
            Class_2.class_2_field_0 = prevClass_2_field_0;
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_2 = prevClass_2_field_2;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_2.class_2_field_6 = prevClass_2_field_6;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_015() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_1 = 1.9024612E19f;
            Class_2.class_2_field_4 = 235;
            Class_2.class_2_field_5 = -2.0f;
            Long class_0_field_1 = -9223372036854773642L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('0', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_016() {
        char prevClass_2_field_0 = Class_2.class_2_field_0;
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        float prevClass_2_field_2 = Class_2.class_2_field_2;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        boolean prevClass_2_field_6 = Class_2.class_2_field_6;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_0 = 'H';
            Class_2.class_2_field_1 = Float.POSITIVE_INFINITY;
            Class_2.class_2_field_2 = Float.NaN;
            Class_2.class_2_field_4 = 3;
            Class_2.class_2_field_5 = -8.97E-43f;
            Class_2.class_2_field_6 = false;
            Long class_0_field_1 = 2141L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('v', actual);
        } finally {
            Class_2.class_2_field_0 = prevClass_2_field_0;
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_2 = prevClass_2_field_2;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_2.class_2_field_6 = prevClass_2_field_6;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_017() {
        char prevClass_2_field_0 = Class_2.class_2_field_0;
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        float prevClass_2_field_2 = Class_2.class_2_field_2;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        float prevClass_2_field_5 = Class_2.class_2_field_5;
        boolean prevClass_2_field_6 = Class_2.class_2_field_6;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_0 = '\u0080';
            Class_2.class_2_field_1 = 3.43597384E11f;
            Class_2.class_2_field_2 = -4.5977E-41f;
            Class_2.class_2_field_4 = 3;
            Class_2.class_2_field_5 = -2.015747f;
            Class_2.class_2_field_6 = false;
            Long class_0_field_1 = 2141L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('1', actual);
        } finally {
            Class_2.class_2_field_0 = prevClass_2_field_0;
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_2 = prevClass_2_field_2;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_2.class_2_field_5 = prevClass_2_field_5;
            Class_2.class_2_field_6 = prevClass_2_field_6;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_018() {
        float prevClass_2_field_1 = Class_2.class_2_field_1;
        int prevClass_2_field_4 = Class_2.class_2_field_4;
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Class_2.class_2_field_1 = Float.POSITIVE_INFINITY;
            Class_2.class_2_field_4 = Integer.MIN_VALUE;
            Long class_0_field_1 = -9223372036854773666L;
            Class_0.class_0_field_1 = class_0_field_1;

            char actual = Class_2.class_2_method_0();

            assertEquals('S', actual);
        } finally {
            Class_2.class_2_field_1 = prevClass_2_field_1;
            Class_2.class_2_field_4 = prevClass_2_field_4;
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable meow.Class_2.class_2_method_1

    ///region

    @Test
    public void testClass_2_method_11() {
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        try {
            Long class_0_field_1 = 2141L;
            Class_0.class_0_field_1 = class_0_field_1;

            boolean actual = Class_2.class_2_method_1();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
        }
    }

    @Test
    public void testClass_2_method_12() {
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        String prevClass_0_field_0 = Class_0.class_0_field_0;
        try {
            Long class_0_field_1 = 2176L;
            Class_0.class_0_field_1 = class_0_field_1;
            String class_0_field_0 = "47J9z0hhMKO5X";
            Class_0.class_0_field_0 = class_0_field_0;

            boolean actual = Class_2.class_2_method_1();

            assertFalse(actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_0 = prevClass_0_field_0;
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable meow.Class_2.class_2_method_2

    ///region

    @Test
    public void testClass_2_method_21() {
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        String prevClass_0_field_0 = Class_0.class_0_field_0;
        try {
            Long class_0_field_1 = 2141L;
            Class_0.class_0_field_1 = class_0_field_1;
            String class_0_field_0 = "47J9z0hhMKO5X";
            Class_0.class_0_field_0 = class_0_field_0;

            char actual = Class_2.class_2_method_2();

            assertEquals('7', actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_0 = prevClass_0_field_0;
        }
    }

    @Test
    public void testClass_2_method_22() {
        Long prevClass_0_field_1 = Class_0.class_0_field_1;
        String prevClass_0_field_0 = Class_0.class_0_field_0;
        try {
            Long class_0_field_1 = 2142L;
            Class_0.class_0_field_1 = class_0_field_1;
            String class_0_field_0 = "47J9z0hhMKO5X";
            Class_0.class_0_field_0 = class_0_field_0;

            char actual = Class_2.class_2_method_2();

            assertEquals('7', actual);
        } finally {
            Class_0.class_0_field_1 = prevClass_0_field_1;
            Class_0.class_0_field_0 = prevClass_0_field_0;
        }
    }
    ///endregion

    ///endregion
}
