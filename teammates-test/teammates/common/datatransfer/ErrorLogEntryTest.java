package teammates.common.datatransfer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.logs.GeneralLogEntry;
import teammates.common.datatransfer.logs.LogSeverity;

import java.util.Map;

import teammates.common.datatransfer.logs.SourceLocation;

import static java.util.Collections.emptyMap;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class ErrorLogEntryTest {
    ///region Test suites for executable teammates.common.datatransfer.ErrorLogEntry.fromLogEntry

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fromLogEntry(teammates.common.datatransfer.logs.GeneralLogEntry)

    /**
     * @utbot.classUnderTest {@link ErrorLogEntry}
     * @utbot.methodUnderTest {@link ErrorLogEntry#fromLogEntry(GeneralLogEntry)}
     * @utbot.invokes {@link GeneralLogEntry#getSeverity()}
     * @utbot.throwsException {@link NullPointerException} in: assert logEntry.getSeverity().getSeverityLevel() >= LogSeverity.ERROR.getSeverityLevel();
     */
    @Test
    @DisplayName("fromLogEntry: assert logEntry.getSeverity().getSeverityLevel() >= LogSeverity.ERROR.getSeverityLevel() -> ThrowNullPointerException")
    public void testFromLogEntry_GeneralLogEntryGetSeverity() {
        /* This test fails because method [teammates.common.datatransfer.ErrorLogEntry.fromLogEntry] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.ErrorLogEntry.fromLogEntry(ErrorLogEntry.java:29) */
        ErrorLogEntry.fromLogEntry(null);
    }

    /**
     * @utbot.classUnderTest {@link ErrorLogEntry}
     * @utbot.methodUnderTest {@link ErrorLogEntry#fromLogEntry(GeneralLogEntry)}
     * @utbot.throwsException {@link NullPointerException} in: assert logEntry.getSeverity().getSeverityLevel() >= LogSeverity.ERROR.getSeverityLevel();
     */
    @Test
    @DisplayName("fromLogEntry: assert logEntry.getSeverity().getSeverityLevel() >= LogSeverity.ERROR.getSeverityLevel() -> ThrowNullPointerException")
    public void testFromLogEntry_ThrowNullPointerException() {
        GeneralLogEntry logEntry = new GeneralLogEntry(null, null, null, null, null, 0L);
        
        /* This test fails because method [teammates.common.datatransfer.ErrorLogEntry.fromLogEntry] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.ErrorLogEntry.fromLogEntry(ErrorLogEntry.java:29) */
        ErrorLogEntry.fromLogEntry(logEntry);
    }
    ///endregion

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method fromLogEntry(teammates.common.datatransfer.logs.GeneralLogEntry)

    /**
     * @utbot.classUnderTest {@link ErrorLogEntry}
     * @utbot.methodUnderTest {@link ErrorLogEntry#fromLogEntry(GeneralLogEntry)}
     */
    @Test
    @DisplayName("fromLogEntry: arg_0 = GeneralLogEntry(LogSeverity, String, String, Map, SourceLocation, long)")
    public void testFromLogEntry() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        LogSeverity logSeverity = LogSeverity.ERROR;
        Map map = emptyMap();
        SourceLocation sourceLocation = new SourceLocation("jkmqh", 0L, "    at ");
        GeneralLogEntry logEntry = new GeneralLogEntry(logSeverity, "hlcoj", ": ", map, sourceLocation, 844788797467201248L);

        ErrorLogEntry actual = ErrorLogEntry.fromLogEntry(logEntry);

        String string = "ERROR";
        String string1 = "hlcoj";
        ErrorLogEntry expected = new ErrorLogEntry(null, string, string1);
        String actualMessage = ((String) getFieldValue(actual, "teammates.common.datatransfer.ErrorLogEntry", "message"));
        assertNull(actualMessage);

        String expectedSeverity = ((String) getFieldValue(expected, "teammates.common.datatransfer.ErrorLogEntry", "severity"));
        String actualSeverity = ((String) getFieldValue(actual, "teammates.common.datatransfer.ErrorLogEntry", "severity"));
        assertEquals(expectedSeverity, actualSeverity);

        String expectedTraceId = ((String) getFieldValue(expected, "teammates.common.datatransfer.ErrorLogEntry", "traceId"));
        String actualTraceId = ((String) getFieldValue(actual, "teammates.common.datatransfer.ErrorLogEntry", "traceId"));
        assertEquals(expectedTraceId, actualTraceId);

    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method fromLogEntry(teammates.common.datatransfer.logs.GeneralLogEntry)

    /**
     * @utbot.classUnderTest {@link ErrorLogEntry}
     * @utbot.methodUnderTest {@link ErrorLogEntry#fromLogEntry(GeneralLogEntry)}
     */
    @Test
    @DisplayName("fromLogEntry: arg_0 = GeneralLogEntry(LogSeverity, String, String, Map, SourceLocation, long) -> throw AssertionError")
    public void testFromLogEntryThrowsAE() {
        LogSeverity logSeverity = LogSeverity.WARNING;
        Map map = emptyMap();
        SourceLocation sourceLocation = new SourceLocation("qylov", -2016391176725239837L, "uhauh");
        GeneralLogEntry logEntry = new GeneralLogEntry(logSeverity, "oesjb", "noimn", map, sourceLocation, 844788797467201248L);
        
        /* This test fails because method [teammates.common.datatransfer.ErrorLogEntry.fromLogEntry] produces [java.lang.AssertionError]
            teammates.common.datatransfer.ErrorLogEntry.fromLogEntry(ErrorLogEntry.java:29) */
        ErrorLogEntry.fromLogEntry(logEntry);
    }
    ///endregion

    ///region Errors report for fromLogEntry

    public void testFromLogEntry_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field UPPER_CASE_WITH_UNDERSCORES is not declared in class com.google.gson.FieldNamingPolicy

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.ErrorLogEntry.getMessage

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getMessage()

    /**
     * @utbot.classUnderTest {@link ErrorLogEntry}
     * @utbot.methodUnderTest {@link ErrorLogEntry#getMessage()}
     */
    @Test
    @DisplayName("getMessage: arg_0 = ErrorLogEntry(String, String, String)")
    public void testGetMessage() {
        ErrorLogEntry errorLogEntry = new ErrorLogEntry("syiug", "", "");

        String actual = errorLogEntry.getMessage();

        String expected = "syiug";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.ErrorLogEntry.getSeverity

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getSeverity()

    /**
     * @utbot.classUnderTest {@link ErrorLogEntry}
     * @utbot.methodUnderTest {@link ErrorLogEntry#getSeverity()}
     */
    @Test
    @DisplayName("getSeverity: arg_0 = ErrorLogEntry(String, String, String)")
    public void testGetSeverity() {
        ErrorLogEntry errorLogEntry = new ErrorLogEntry("syiug", "", "");

        String actual = errorLogEntry.getSeverity();

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.ErrorLogEntry.getTraceId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getTraceId()

    /**
     * @utbot.classUnderTest {@link ErrorLogEntry}
     * @utbot.methodUnderTest {@link ErrorLogEntry#getTraceId()}
     */
    @Test
    @DisplayName("getTraceId: arg_0 = ErrorLogEntry(String, String, String)")
    public void testGetTraceId() {
        ErrorLogEntry errorLogEntry = new ErrorLogEntry("syiug", "", "");

        String actual = errorLogEntry.getTraceId();

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
