package teammates.common.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public final class EmailSendingStatusTest {
    ///region Test suites for executable teammates.common.util.EmailSendingStatus.getStatusCode

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getStatusCode()

    /**
     * @utbot.classUnderTest {@link EmailSendingStatus}
     * @utbot.methodUnderTest {@link EmailSendingStatus#getStatusCode()}
     */
    @Test
    @DisplayName("getStatusCode: arg_0 = EmailSendingStatus(int, String) -> return 0")
    public void testGetStatusCodeReturnsZero() {
        EmailSendingStatus emailSendingStatus = new EmailSendingStatus(0, "oesjb");

        int actual = emailSendingStatus.getStatusCode();

        assertEquals(0, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.EmailSendingStatus.getMessage

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getMessage()

    /**
     * @utbot.classUnderTest {@link EmailSendingStatus}
     * @utbot.methodUnderTest {@link EmailSendingStatus#getMessage()}
     */
    @Test
    @DisplayName("getMessage: arg_0 = EmailSendingStatus(int, String)")
    public void testGetMessage() {
        EmailSendingStatus emailSendingStatus = new EmailSendingStatus(0, "oesjb");

        String actual = emailSendingStatus.getMessage();

        String expected = "oesjb";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.EmailSendingStatus.isSuccess

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isSuccess()

    /**
     * @utbot.classUnderTest {@link EmailSendingStatus}
     * @utbot.methodUnderTest {@link EmailSendingStatus#isSuccess()}
     */
    @Test
    @DisplayName("isSuccess: arg_0 = EmailSendingStatus(int, String) -> return false")
    public void testIsSuccessReturnsFalse() {
        EmailSendingStatus emailSendingStatus = new EmailSendingStatus(0, "oesjb");

        boolean actual = emailSendingStatus.isSuccess();

        assertFalse(actual);
    }
    ///endregion

    ///endregion
}
