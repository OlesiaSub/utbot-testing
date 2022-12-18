package teammates.logic.external;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.util.EmailWrapper;
import teammates.common.util.EmailType;
import teammates.common.exception.EmailSendingException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class MailjetServiceTest {
    ///region Test suites for executable teammates.logic.external.MailjetService.parseToEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method parseToEmail(teammates.common.util.EmailWrapper)

    /**
     * @utbot.classUnderTest {@link MailjetService}
     * @utbot.methodUnderTest {@link MailjetService#parseToEmail(EmailWrapper)}
     */
    @Test
    @DisplayName("parseToEmail: wrapper = EmailWrapper() -> throw IllegalStateException")
    public void testParseToEmailThrowsISE() {
        MailjetService mailjetService = new MailjetService();
        EmailWrapper wrapperMock = mock(EmailWrapper.class);
        EmailType emailType = EmailType.FEEDBACK_OPENING_SOON;
        (when(wrapperMock.getType())).thenReturn(emailType);
        (when(wrapperMock.getSenderName())).thenReturn("Reply-To");
        (when(wrapperMock.getSenderEmail())).thenReturn("oxhrh");
        (when(wrapperMock.getReplyTo())).thenReturn("oesjb");
        (when(wrapperMock.getRecipient())).thenReturn("hlcoj");
        (when(wrapperMock.getBcc())).thenReturn("syiug");
        (when(wrapperMock.getSubject())).thenReturn("Reply-To");
        (when(wrapperMock.getContent())).thenReturn("Reply-To");
        (when(wrapperMock.getIsCopy())).thenReturn(true);
        
        /* This test fails because method [teammates.logic.external.MailjetService.parseToEmail] produces [java.lang.IllegalStateException: Could not invoke public java.lang.String teammates.common.util.EmailWrapper.getSenderName() on teammates.common.util.EmailWrapper@5d98758e with arguments []]
            org.mockito.internal.util.reflection.InstrumentationMemberAccessor.invoke(InstrumentationMemberAccessor.java:252)
            org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
            org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
            org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
            org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
            org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
            org.utbot.framework.concrete.MockValueConstructor$generateMockitoAnswer$1.answer(MockValueConstructor.kt:223)
            org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
            org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
            org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
            org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
            org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
            teammates.common.util.EmailWrapper.getSenderName(EmailWrapper.java:32)
            teammates.logic.external.MailjetService.parseToEmail(MailjetService.java:37) */
        mailjetService.parseToEmail(wrapperMock);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.external.MailjetService.sendEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sendEmail(teammates.common.util.EmailWrapper)

    /**
     * @utbot.classUnderTest {@link MailjetService}
     * @utbot.methodUnderTest {@link MailjetService#sendEmail(EmailWrapper)}
     */
    @Test
    @DisplayName("sendEmail: wrapper = EmailWrapper() -> throw IllegalStateException")
    public void testSendEmailThrowsISE() throws EmailSendingException {
        MailjetService mailjetService = new MailjetService();
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
        
        /* This test fails because method [teammates.logic.external.MailjetService.sendEmail] produces [java.lang.IllegalStateException: Could not invoke public java.lang.String teammates.common.util.EmailWrapper.getSenderName() on teammates.common.util.EmailWrapper@5c006453 with arguments []]
            org.mockito.internal.util.reflection.InstrumentationMemberAccessor.invoke(InstrumentationMemberAccessor.java:252)
            org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
            org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
            org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
            org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
            org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
            org.utbot.framework.concrete.MockValueConstructor$generateMockitoAnswer$1.answer(MockValueConstructor.kt:223)
            org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
            org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
            org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
            org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
            org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
            teammates.common.util.EmailWrapper.getSenderName(EmailWrapper.java:32)
            teammates.logic.external.MailjetService.parseToEmail(MailjetService.java:37)
            teammates.logic.external.MailjetService.sendEmail(MailjetService.java:55) */
        mailjetService.sendEmail(wrapperMock);
    }
    ///endregion

    ///endregion
}
