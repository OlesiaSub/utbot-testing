package teammates.logic.external;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.MockedConstruction;
import teammates.common.util.EmailWrapper;
import teammates.common.util.EmailType;
import teammates.common.util.EmailSendingStatus;

import java.util.concurrent.atomic.AtomicInteger;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mockConstruction;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.UtUtils.createInstance;

public final class EmptyEmailServiceTest {
    ///region Test suites for executable teammates.logic.external.EmptyEmailService.parseToEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parseToEmail(teammates.common.util.EmailWrapper)

    /**
     * @utbot.classUnderTest {@link EmptyEmailService}
     * @utbot.methodUnderTest {@link EmptyEmailService#parseToEmail(EmailWrapper)}
     */
    @Test
    @DisplayName("parseToEmail: wrapper = EmailWrapper()")
    public void testParseToEmail() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        EmptyEmailService emptyEmailService = new EmptyEmailService();
        EmailWrapper wrapperMock = mock(EmailWrapper.class);
        EmailType emailType = EmailType.INSTRUCTOR_COURSE_JOIN;
        (when(wrapperMock.getType())).thenReturn(emailType);
        (when(wrapperMock.getSenderName())).thenReturn("noimn");
        (when(wrapperMock.getSenderEmail())).thenReturn("syiug");
        (when(wrapperMock.getReplyTo())).thenReturn("");
        (when(wrapperMock.getRecipient())).thenReturn("");
        (when(wrapperMock.getBcc())).thenReturn("oesjb");
        (when(wrapperMock.getSubject())).thenReturn("hlcoj");
        (when(wrapperMock.getContent())).thenReturn("hlcoj");
        (when(wrapperMock.getIsCopy())).thenReturn(false);

        EmailWrapper actual = emptyEmailService.parseToEmail(wrapperMock);

        EmailType actualType = ((EmailType) getFieldValue(actual, "teammates.common.util.EmailWrapper", "type"));
        assertNull(actualType);

        String actualSenderName = ((String) getFieldValue(actual, "teammates.common.util.EmailWrapper", "senderName"));
        assertNull(actualSenderName);

        assertTrue(deepEquals(wrapperMock, actual));
        assertTrue(deepEquals(wrapperMock, actual));
        assertTrue(deepEquals(wrapperMock, actual));
        assertTrue(deepEquals(wrapperMock, actual));
        assertTrue(deepEquals(wrapperMock, actual));
        assertTrue(deepEquals(wrapperMock, actual));
        boolean actualIsCopy = ((Boolean) getFieldValue(actual, "teammates.common.util.EmailWrapper", "isCopy"));
        assertFalse(actualIsCopy);

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.external.EmptyEmailService.sendEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sendEmail(teammates.common.util.EmailWrapper)

    /**
     * @utbot.classUnderTest {@link EmptyEmailService}
     * @utbot.methodUnderTest {@link EmptyEmailService#sendEmail(EmailWrapper)}
     * @utbot.returnsFrom {@code return new EmailSendingStatus(HttpStatus.SC_OK, null);}
     */
    @Test
    @DisplayName("sendEmail: -> return new EmailSendingStatus(HttpStatus.SC_OK, null)")
    public void testSendEmail_Return() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(EmailSendingStatus.class, (EmailSendingStatus EmailSendingStatusMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            EmptyEmailService emptyEmailService = new EmptyEmailService();

            EmailSendingStatus actual = emptyEmailService.sendEmail(null);

            EmailSendingStatus expectedMock = mock(EmailSendingStatus.class);
            setField(expectedMock, "teammates.common.util.EmailSendingStatus", "statusCode", 0);
            setField(expectedMock, "teammates.common.util.EmailSendingStatus", "message", null);
            setField(expectedMock, "teammates.common.util.EmailSendingStatus", "isSuccess", false);
            int expectedMockStatusCode = ((Integer) getFieldValue(expectedMock, "teammates.common.util.EmailSendingStatus", "statusCode"));
            int actualStatusCode = ((Integer) getFieldValue(actual, "teammates.common.util.EmailSendingStatus", "statusCode"));
            assertEquals(expectedMockStatusCode, actualStatusCode);

            String actualMessage = ((String) getFieldValue(actual, "teammates.common.util.EmailSendingStatus", "message"));
            assertNull(actualMessage);

            boolean actualIsSuccess = ((Boolean) getFieldValue(actual, "teammates.common.util.EmailSendingStatus", "isSuccess"));
            assertFalse(actualIsSuccess);

        } finally {
            mockedConstruction.close();
        }
    }
    ///endregion

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sendEmail(teammates.common.util.EmailWrapper)

    /**
     * @utbot.classUnderTest {@link EmptyEmailService}
     * @utbot.methodUnderTest {@link EmptyEmailService#sendEmail(EmailWrapper)}
     */
    @Test
    @DisplayName("sendEmail: wrapper = EmailWrapper()")
    public void testSendEmail() throws Exception {
        EmptyEmailService emptyEmailService = new EmptyEmailService();
        EmailWrapper wrapperMock = mock(EmailWrapper.class);
        EmailType emailType = EmailType.INSTRUCTOR_COURSE_JOIN;
        (when(wrapperMock.getType())).thenReturn(emailType);
        (when(wrapperMock.getSenderName())).thenReturn("noimn");
        (when(wrapperMock.getSenderEmail())).thenReturn("syiug");
        (when(wrapperMock.getReplyTo())).thenReturn("");
        (when(wrapperMock.getRecipient())).thenReturn("");
        (when(wrapperMock.getBcc())).thenReturn("oesjb");
        (when(wrapperMock.getSubject())).thenReturn("hlcoj");
        (when(wrapperMock.getContent())).thenReturn("hlcoj");
        (when(wrapperMock.getIsCopy())).thenReturn(false);

        EmailSendingStatus actual = emptyEmailService.sendEmail(wrapperMock);

        EmailSendingStatus expected = ((EmailSendingStatus) createInstance("teammates.common.util.EmailSendingStatus"));
        setField(expected, "teammates.common.util.EmailSendingStatus", "statusCode", 200);
        setField(expected, "teammates.common.util.EmailSendingStatus", "message", null);
        setField(expected, "teammates.common.util.EmailSendingStatus", "isSuccess", true);
        int expectedStatusCode = ((Integer) getFieldValue(expected, "teammates.common.util.EmailSendingStatus", "statusCode"));
        int actualStatusCode = ((Integer) getFieldValue(actual, "teammates.common.util.EmailSendingStatus", "statusCode"));
        assertEquals(expectedStatusCode, actualStatusCode);

        String actualMessage = ((String) getFieldValue(actual, "teammates.common.util.EmailSendingStatus", "message"));
        assertNull(actualMessage);

        boolean actualIsSuccess = ((Boolean) getFieldValue(actual, "teammates.common.util.EmailSendingStatus", "isSuccess"));
        assertTrue(actualIsSuccess);

    }
    ///endregion

    ///endregion
}
