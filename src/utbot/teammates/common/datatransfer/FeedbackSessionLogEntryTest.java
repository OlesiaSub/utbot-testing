package teammates.common.datatransfer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class FeedbackSessionLogEntryTest {
    ///region Test suites for executable teammates.common.datatransfer.FeedbackSessionLogEntry.getFeedbackSessionLogType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFeedbackSessionLogType()

    /**
     * @utbot.classUnderTest {@link FeedbackSessionLogEntry}
     * @utbot.methodUnderTest {@link FeedbackSessionLogEntry#getFeedbackSessionLogType()}
     */
    @Test
    @DisplayName("getFeedbackSessionLogType: arg_0 = FeedbackSessionLogEntry(String, String, String, long)")
    public void testGetFeedbackSessionLogType() {
        FeedbackSessionLogEntry feedbackSessionLogEntry = new FeedbackSessionLogEntry("oesjb", "noimn", "hlcoj", 5849849615929640784L);

        String actual = feedbackSessionLogEntry.getFeedbackSessionLogType();

        String expected = "hlcoj";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.FeedbackSessionLogEntry.getFeedbackSessionName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFeedbackSessionName()

    /**
     * @utbot.classUnderTest {@link FeedbackSessionLogEntry}
     * @utbot.methodUnderTest {@link FeedbackSessionLogEntry#getFeedbackSessionName()}
     */
    @Test
    @DisplayName("getFeedbackSessionName: arg_0 = FeedbackSessionLogEntry(String, String, String, long)")
    public void testGetFeedbackSessionName() {
        FeedbackSessionLogEntry feedbackSessionLogEntry = new FeedbackSessionLogEntry("oesjb", "noimn", "hlcoj", 5849849615929640784L);

        String actual = feedbackSessionLogEntry.getFeedbackSessionName();

        String expected = "noimn";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.FeedbackSessionLogEntry.getStudentEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getStudentEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackSessionLogEntry}
     * @utbot.methodUnderTest {@link FeedbackSessionLogEntry#getStudentEmail()}
     */
    @Test
    @DisplayName("getStudentEmail: arg_0 = FeedbackSessionLogEntry(String, String, String, long)")
    public void testGetStudentEmail() {
        FeedbackSessionLogEntry feedbackSessionLogEntry = new FeedbackSessionLogEntry("oesjb", "noimn", "hlcoj", 5849849615929640784L);

        String actual = feedbackSessionLogEntry.getStudentEmail();

        String expected = "oesjb";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.FeedbackSessionLogEntry.getTimestamp

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getTimestamp()

    /**
     * @utbot.classUnderTest {@link FeedbackSessionLogEntry}
     * @utbot.methodUnderTest {@link FeedbackSessionLogEntry#getTimestamp()}
     */
    @Test
    @DisplayName("getTimestamp: arg_0 = FeedbackSessionLogEntry(String, String, String, long) -> return 5849849615929640784")
    public void testGetTimestamp() {
        FeedbackSessionLogEntry feedbackSessionLogEntry = new FeedbackSessionLogEntry("oesjb", "noimn", "hlcoj", 5849849615929640784L);

        long actual = feedbackSessionLogEntry.getTimestamp();

        assertEquals(5849849615929640784L, actual);
    }
    ///endregion

    ///endregion
}
