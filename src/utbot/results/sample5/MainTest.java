package src.utbot.results.s5;

import jdk.internal.misc.VM;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.when;
import static org.utbot.runtime.utils.UtUtils.*;

public final class MainTest {
    ///region Test suites for executable mlem.Main.do_1

    ///region OTHER: SUCCESSFUL EXECUTIONS for method do_1()

    @Test
    public void testDo_11() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        MockedConstruction mockedConstruction = null;
        try {
            Class vMClazz = Class.forName("jdk.internal.misc.VM");
            int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
            try {
                setStaticField(vMClazz, "initLevel", 0);
                AtomicInteger mockClassCounter = new AtomicInteger();
                mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                    switch (mockClassCounter.get()) {
                        case 0:
                            (when(RandomMock.nextLong())).thenReturn(9873945L);
                            break;
                    }
                    mockClassCounter.getAndIncrement();
                });
                /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
                because execution encountered flaky methods
                To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

                Main.do_1();
            } finally {
                setStaticField(VM.class, "initLevel", prevInitLevel);
            }
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testDo_12() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        MockedConstruction mockedConstruction = null;
        try {
            Class vMClazz = Class.forName("jdk.internal.misc.VM");
            int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
            try {
                setStaticField(vMClazz, "initLevel", 0);
                AtomicInteger mockClassCounter = new AtomicInteger();
                mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                    switch (mockClassCounter.get()) {
                        case 0:
                            (when(RandomMock.nextLong())).thenReturn(-9223372036844901863L);
                            break;
                    }
                    mockClassCounter.getAndIncrement();
                });
                /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
                because execution encountered flaky methods
                To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

                Main.do_1();
            } finally {
                setStaticField(VM.class, "initLevel", prevInitLevel);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_10

    ///region

    @Test
    public void testDo_101() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873944L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_10();

            String expected = "s2";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testDo_102() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873945L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_10();

            String expected = "s1";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_11

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method do_11(long)

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_11(long)}
     */
    @Test
    @DisplayName("do_11: arg_0 > 0L")
    public void testDo_111() {
        String actual = Main.do_11(1L);

        String expected = "s2";
        assertEquals(expected, actual);
    }

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_11(long)}
     */
    @Test
    @DisplayName("do_11: arg_0 = 18014398509481985 (mutated from 1)")
    public void testDo_112() {
        String actual = Main.do_11(18014398509481985L);

        String expected = "s1";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_12

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method do_12(long)

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_12(long)}
     */
    @Test
    @DisplayName("do_12: arg_0 > 0L")
    public void testDo_121() {
        String actual = Main.do_12(1L);

        String expected = "s2";
        assertEquals(expected, actual);
    }

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_12(long)}
     */
    @Test
    @DisplayName("do_12: arg_0 = 18014398509481985 (mutated from 1)")
    public void testDo_122() {
        String actual = Main.do_12(18014398509481985L);

        String expected = "s1";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_13

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method do_13(long)

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_13(long)}
     */
    @Test
    @DisplayName("do_13: arg_0 > 0L")
    public void testDo_13() {
        String actual = Main.do_13(1L);

        String expected = "s2";
        assertEquals(expected, actual);
    }

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_13(long)}
     */
    @Test
    @DisplayName("do_13: arg_0 = 18014398509481985 (mutated from 1)")
    public void testDo_131() {
        String actual = Main.do_13(18014398509481985L);

        String expected = "s1";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_2

    ///region OTHER: SUCCESSFUL EXECUTIONS for method do_2()

    @Test
    public void testDo_21() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        MockedConstruction mockedConstruction = null;
        try {
            Class vMClazz = Class.forName("jdk.internal.misc.VM");
            int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
            try {
                setStaticField(vMClazz, "initLevel", 0);
                AtomicInteger mockClassCounter = new AtomicInteger();
                mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                    switch (mockClassCounter.get()) {
                        case 0:
                            (when(RandomMock.nextLong())).thenReturn(-9223372036844901863L);
                            break;
                    }
                    mockClassCounter.getAndIncrement();
                });
                /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
                because execution encountered flaky methods
                To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

                Main.do_2();
            } finally {
                setStaticField(VM.class, "initLevel", prevInitLevel);
            }
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testDo_22() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        MockedConstruction mockedConstruction = null;
        try {
            Class vMClazz = Class.forName("jdk.internal.misc.VM");
            int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
            try {
                setStaticField(vMClazz, "initLevel", 0);
                AtomicInteger mockClassCounter = new AtomicInteger();
                mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                    switch (mockClassCounter.get()) {
                        case 0:
                            (when(RandomMock.nextLong())).thenReturn(9873945L);
                            break;
                    }
                    mockClassCounter.getAndIncrement();
                });
                /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
                because execution encountered flaky methods
                To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

                Main.do_2();
            } finally {
                setStaticField(VM.class, "initLevel", prevInitLevel);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_3

    ///region OTHER: SUCCESSFUL EXECUTIONS for method do_3()

    @Test
    public void testDo_31() throws Exception {
        MockedConstruction mockedConstruction = null;
        try {
            Class vMClazz = Class.forName("jdk.internal.misc.VM");
            int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
            try {
                setStaticField(vMClazz, "initLevel", 0);
                AtomicInteger mockClassCounter = new AtomicInteger();
                mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                    switch (mockClassCounter.get()) {
                        case 0:
                            (when(RandomMock.nextLong())).thenReturn(-9223372036844901863L);
                            break;
                    }
                    mockClassCounter.getAndIncrement();
                });
                /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
                because execution encountered flaky methods
                To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

                Object actual = Main.do_3();

                Object expected = createInstance("sun.nio.fs.WindowsPath");
            } finally {
                setStaticField(VM.class, "initLevel", prevInitLevel);
            }
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testDo_32() throws Exception {
        MockedConstruction mockedConstruction = null;
        try {
            Class vMClazz = Class.forName("jdk.internal.misc.VM");
            int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
            try {
                setStaticField(vMClazz, "initLevel", 0);
                AtomicInteger mockClassCounter = new AtomicInteger();
                mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                    switch (mockClassCounter.get()) {
                        case 0:
                            (when(RandomMock.nextLong())).thenReturn(9873945L);
                            break;
                    }
                    mockClassCounter.getAndIncrement();
                });
                /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
                because execution encountered flaky methods
                To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

                Object actual = Main.do_3();

                Object expected = createInstance("sun.nio.fs.WindowsPath");
            } finally {
                setStaticField(VM.class, "initLevel", prevInitLevel);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_4

    ///region OTHER: SUCCESSFUL EXECUTIONS for method do_4()

    @Test
    public void testDo_41() throws Exception {
        MockedConstruction mockedConstruction = null;
        try {
            Class vMClazz = Class.forName("jdk.internal.misc.VM");
            int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
            try {
                setStaticField(vMClazz, "initLevel", 0);
                AtomicInteger mockClassCounter = new AtomicInteger();
                mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                    switch (mockClassCounter.get()) {
                        case 0:
                            (when(RandomMock.nextLong())).thenReturn(9873945L);
                            break;
                    }
                    mockClassCounter.getAndIncrement();
                });
                /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
                because execution encountered flaky methods
                To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

                Object actual = Main.do_4();

                Object expected = createInstance("sun.nio.fs.WindowsPath");
            } finally {
                setStaticField(VM.class, "initLevel", prevInitLevel);
            }
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testDo_42() throws Exception {
        MockedConstruction mockedConstruction = null;
        try {
            Class vMClazz = Class.forName("jdk.internal.misc.VM");
            int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
            try {
                setStaticField(vMClazz, "initLevel", 0);
                AtomicInteger mockClassCounter = new AtomicInteger();
                mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                    switch (mockClassCounter.get()) {
                        case 0:
                            (when(RandomMock.nextLong())).thenReturn(-9223372036844901863L);
                            break;
                    }
                    mockClassCounter.getAndIncrement();
                });
                /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
                because execution encountered flaky methods
                To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

                Object actual = Main.do_4();

                Object expected = createInstance("sun.nio.fs.WindowsPath");
            } finally {
                setStaticField(VM.class, "initLevel", prevInitLevel);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_5

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method do_5()

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_5()}
     * @utbot.invokes {@link Main#do_7()}
     * @utbot.returnsFrom {@code return do_6();}
     */
    @Test
    @DisplayName("do_5: do_7 -> return do_8()")
    public void testDo_5_do_7() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873944L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_5();

            String expected = "s2";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_5()}
     * @utbot.invokes {@link Main#do_7()}
     * @utbot.returnsFrom {@code return do_6();}
     */
    @Test
    @DisplayName("do_5: do_7 -> return do_8()")
    public void testDo_5_do_7_1() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873945L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_5();

            String expected = "s1";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_6

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method do_6()

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_6()}
     * @utbot.invokes {@link Main#do_8()}
     * @utbot.returnsFrom {@code return do_7();}
     */
    @Test
    @DisplayName("do_6: do_8 -> return do_9()")
    public void testDo_6_do_8() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873945L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_6();

            String expected = "s1";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_6()}
     * @utbot.invokes {@link Main#do_8()}
     * @utbot.returnsFrom {@code return do_7();}
     */
    @Test
    @DisplayName("do_6: do_8 -> return do_9()")
    public void testDo_6_do_8_1() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873944L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_6();

            String expected = "s2";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_7

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method do_7()

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_7()}
     * @utbot.invokes {@link Main#do_9()}
     * @utbot.returnsFrom {@code return do_8();}
     */
    @Test
    @DisplayName("do_7: do_9 -> return do_10()")
    public void testDo_7_do_9() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873945L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_7();

            String expected = "s1";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#do_7()}
     * @utbot.invokes {@link Main#do_9()}
     * @utbot.returnsFrom {@code return do_8();}
     */
    @Test
    @DisplayName("do_7: do_9 -> return do_10()")
    public void testDo_7_do_9_1() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873944L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_7();

            String expected = "s2";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_8

    ///region

    @Test
    public void testDo_81() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873945L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_8();

            String expected = "s1";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testDo_82() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873944L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_8();

            String expected = "s2";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.do_9

    ///region

    @Test
    public void testDo_91() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873945L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_9();

            String expected = "s1";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testDo_92() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        (when(RandomMock.nextLong())).thenReturn(9873944L);
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
            because execution encountered flaky methods
            To change this behaviour edit [Settings -> UtBot -> Force static mocking] */

            String actual = Main.do_9();

            String expected = "s2";
            assertEquals(expected, actual);
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.main

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method main(java.lang.String[])

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3]")
    public void testMainWithNonEmptyObjectArray() {
        String[] args = {"hlcoj", "noimn", ""};

        Main.main(args);
    }

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3]")
    public void testMainWithNonEmptyObjectArray1() {
        String[] args = {"hlcoj", "syiug", "oesjb"};

        Main.main(args);
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method main(java.lang.String[])

    @Test
    public void testMain1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        MockedConstruction mockedConstruction = null;
        try {
            Class vMClazz = Class.forName("jdk.internal.misc.VM");
            int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
            try {
                setStaticField(vMClazz, "initLevel", 2);
                AtomicInteger mockClassCounter = new AtomicInteger();
                mockedConstruction = mockConstruction(Random.class, (Random RandomMock, MockedConstruction.Context context) -> {
                    switch (mockClassCounter.get()) {
                        case 0:
                            (when(RandomMock.nextLong())).thenReturn(9873945L);
                            break;
                    }
                    mockClassCounter.getAndIncrement();
                });
                /* WARNING!!! Automatically used "Mockito static mocking" framework for mocking statics
                because execution encountered flaky methods
                To change this behaviour edit [Settings -> UtBot -> Force static mocking] */
                String[] args = new String[17];

                Main.main(args);

                String finalArgs0 = args[0];
                String finalArgs1 = args[1];
                String finalArgs2 = args[2];
                String finalArgs3 = args[3];
                String finalArgs4 = args[4];
                String finalArgs5 = args[5];
                String finalArgs6 = args[6];
                String finalArgs7 = args[7];
                String finalArgs8 = args[8];
                String finalArgs9 = args[9];
                String finalArgs10 = args[10];
                String finalArgs11 = args[11];
                String finalArgs12 = args[12];
                String finalArgs13 = args[13];
                String finalArgs14 = args[14];
                String finalArgs15 = args[15];
                String finalArgs16 = args[16];

                assertNull(finalArgs0);

                assertNull(finalArgs1);

                assertNull(finalArgs2);

                assertNull(finalArgs3);

                assertNull(finalArgs4);

                assertNull(finalArgs5);

                assertNull(finalArgs6);

                assertNull(finalArgs7);

                assertNull(finalArgs8);

                assertNull(finalArgs9);

                assertNull(finalArgs10);

                assertNull(finalArgs11);

                assertNull(finalArgs12);

                assertNull(finalArgs13);

                assertNull(finalArgs14);

                assertNull(finalArgs15);

                assertNull(finalArgs16);
            } finally {
                setStaticField(VM.class, "initLevel", prevInitLevel);
            }
        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable mlem.Main.taintedString

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method taintedString(long)

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#taintedString(long)}
     */
    @Test
    @DisplayName("taintedString: arg_0 = 0L")
    public void testTaintedStringWithCornerCase() {
        String actual = Main.taintedString(0L);

        String expected = "s2";
        assertEquals(expected, actual);
    }

    /**
     * @utbot.classUnderTest {@link Main}
     * @utbot.methodUnderTest {@link Main#taintedString(long)}
     */
    @Test
    @DisplayName("taintedString: arg_0 = 18014398509481984 (mutated from 0)")
    public void testTaintedString() {
        String actual = Main.taintedString(18014398509481984L);

        String expected = "s1";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
