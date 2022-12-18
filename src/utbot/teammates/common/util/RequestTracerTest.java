package teammates.common.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class RequestTracerTest {
    ///region Test suites for executable teammates.common.util.RequestTracer.getTraceId

    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTraceId()

    @Test
    public void testGetTraceId1() throws Exception {
        Class requestTracerClazz = Class.forName("teammates.common.util.RequestTracer");
        ThreadLocal prevTHREAD_LOCAL = ((ThreadLocal) getStaticFieldValue(requestTracerClazz, "THREAD_LOCAL"));
        try {
            ThreadLocal threadLocal = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(threadLocal, "java.lang.ThreadLocal", "threadLocalHashCode", 38);
            setStaticField(requestTracerClazz, "THREAD_LOCAL", threadLocal);

            String actual = RequestTracer.getTraceId();

            assertNull(actual);
        } finally {
            setStaticField(RequestTracer.class, "THREAD_LOCAL", prevTHREAD_LOCAL);
        }
    }

    @Test
    public void testGetTraceId2() {
        String actual = RequestTracer.getTraceId();

        String expected = "\n\t\r";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.RequestTracer.getSpanId

    ///region

    @Test
    public void testGetSpanId1() throws Exception {
        Class requestTracerClazz = Class.forName("teammates.common.util.RequestTracer");
        ThreadLocal prevTHREAD_LOCAL = ((ThreadLocal) getStaticFieldValue(requestTracerClazz, "THREAD_LOCAL"));
        try {
            ThreadLocal threadLocal = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(threadLocal, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(requestTracerClazz, "THREAD_LOCAL", threadLocal);

            String actual = RequestTracer.getSpanId();

            assertNull(actual);
        } finally {
            setStaticField(RequestTracer.class, "THREAD_LOCAL", prevTHREAD_LOCAL);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.RequestTracer.getTimeElapsedMillis

    ///region

    @Test
    public void testGetTimeElapsedMillis1() throws Exception {
        Class requestTracerClazz = Class.forName("teammates.common.util.RequestTracer");
        ThreadLocal prevTHREAD_LOCAL = ((ThreadLocal) getStaticFieldValue(requestTracerClazz, "THREAD_LOCAL"));
        try {
            ThreadLocal threadLocal = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(threadLocal, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(requestTracerClazz, "THREAD_LOCAL", threadLocal);

            long actual = RequestTracer.getTimeElapsedMillis();

            assertEquals(-1L, actual);
        } finally {
            setStaticField(RequestTracer.class, "THREAD_LOCAL", prevTHREAD_LOCAL);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.RequestTracer.init

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method init(java.lang.String, java.lang.String, int)

    /**
     * @utbot.classUnderTest {@link RequestTracer}
     * @utbot.methodUnderTest {@link RequestTracer#init(String, String, int)}
     */
    @Test
    @DisplayName("init: arg_0 has special characters, spanId = empty string, timeoutInSeconds > 0")
    public void testInitWithBlankStringAndEmptyString() {
        RequestTracer.init("\n\t\r", "", 1);
    }
    ///endregion

    ///endregion
}
