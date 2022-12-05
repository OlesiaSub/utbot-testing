package teammates.common.exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class EmailSendingExceptionTest {
    ///region Test suites for executable teammates.common.exception.EmailSendingException.getStatusCode

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStatusCode()

    /**
     * @utbot.classUnderTest {@link EmailSendingException}
     * @utbot.methodUnderTest {@link EmailSendingException#getStatusCode()}
     * @utbot.returnsFrom {@code return statusCode;}
     */
    @Test
    @DisplayName("getStatusCode: -> return statusCode")
    public void testGetStatusCode_ReturnStatusCode() throws Exception {
        EmailSendingException emailSendingException = ((EmailSendingException) createInstance("teammates.common.exception.EmailSendingException"));
        setField(emailSendingException, "teammates.common.exception.EmailSendingException", "statusCode", -255);

        int actual = emailSendingException.getStatusCode();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion
}
