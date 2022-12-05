package teammates.logic.external;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.util.EmailWrapper;
import teammates.common.util.EmailType;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class MailgunServiceTest {
    ///region Test suites for executable teammates.logic.external.MailgunService.sendEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sendEmail(teammates.common.util.EmailWrapper)

    /**
     * @utbot.classUnderTest {@link MailgunService}
     * @utbot.methodUnderTest {@link MailgunService#sendEmail(EmailWrapper)}
     */
    @Test
    @DisplayName("sendEmail: wrapper = EmailWrapper()")
    @Disabled(value = "Disabled due to sandbox")
    public void testSendEmail() {
        MailgunService mailgunService = new MailgunService();
        EmailWrapper wrapperMock = mock(EmailWrapper.class);
        EmailType emailType = EmailType.FEEDBACK_UNPUBLISHED;
        (when(wrapperMock.getType())).thenReturn(emailType);
        (when(wrapperMock.getSenderName())).thenReturn("Could not clean up resources after sending email");
        (when(wrapperMock.getSenderEmail())).thenReturn("syiug");
        (when(wrapperMock.getReplyTo())).thenReturn("oxhrh");
        (when(wrapperMock.getRecipient())).thenReturn("");
        (when(wrapperMock.getBcc())).thenReturn("syiug");
        (when(wrapperMock.getSubject())).thenReturn("oxhrh");
        (when(wrapperMock.getContent())).thenReturn("oesjb");
        (when(wrapperMock.getIsCopy())).thenReturn(false);

        /* This test fails because method [teammates.logic.external.MailgunService.sendEmail] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///region Errors report for sendEmail

    public void testSendEmail_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 609 occurrences of:
        // Default concrete execution failed

        // 8 occurrences of:
        // Concrete execution failed

    }
    ///endregion

    ///endregion
}
