package teammates.logic.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.util.EmailWrapper;
import teammates.common.util.EmailType;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class EmailSenderTest {
    ///region Test suites for executable teammates.logic.api.EmailSender.sendEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sendEmail(teammates.common.util.EmailWrapper)

    /**
     * @utbot.classUnderTest {@link EmailSender}
     * @utbot.methodUnderTest {@link EmailSender#sendEmail(EmailWrapper)}
     */
    @Test
    @DisplayName("sendEmail: message = EmailWrapper()")
    @Disabled(value = "Disabled due to sandbox")
    public void testSendEmail() {
        EmailSender emailSender = new EmailSender();
        EmailWrapper messageMock = mock(EmailWrapper.class);
        EmailType emailType = EmailType.FEEDBACK_OPENING;
        (when(messageMock.getType())).thenReturn(emailType);
        (when(messageMock.getSenderName())).thenReturn("");
        (when(messageMock.getSenderEmail())).thenReturn("hlcoj");
        (when(messageMock.getReplyTo())).thenReturn("Not sending email to test account");
        (when(messageMock.getRecipient())).thenReturn("hlcoj");
        (when(messageMock.getBcc())).thenReturn("Not sending email to test account");
        (when(messageMock.getSubject())).thenReturn("Not sending email to test account");
        (when(messageMock.getContent())).thenReturn("noimn");
        (when(messageMock.getIsCopy())).thenReturn(false);

        /* This test fails because method [teammates.logic.api.EmailSender.sendEmail] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///region Errors report for sendEmail

    public void testSendEmail_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 86 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
