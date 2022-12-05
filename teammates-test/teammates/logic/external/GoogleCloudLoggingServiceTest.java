package teammates.logic.external;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class GoogleCloudLoggingServiceTest {
    ///region Test suites for executable teammates.logic.external.GoogleCloudLoggingService.getFeedbackSessionLogs

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackSessionLogs(java.lang.String, java.lang.String, long, long, java.lang.String)

    @Test
    @Disabled(value = "Disabled due to sandbox")
    public void testGetFeedbackSessionLogsByFuzzer() {
        GoogleCloudLoggingService googleCloudLoggingService = new GoogleCloudLoggingService();

        /* This test fails because method [teammates.logic.external.GoogleCloudLoggingService.getFeedbackSessionLogs] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///region Errors report for getFeedbackSessionLogs

    public void testGetFeedbackSessionLogs_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 137 occurrences of:
        // Default concrete execution failed

        // 4 occurrences of:
        // Concrete execution failed

    }
    ///endregion

    ///endregion
}
