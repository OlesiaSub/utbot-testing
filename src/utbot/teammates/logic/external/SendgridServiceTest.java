package teammates.logic.external;

import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import com.sendgrid.helpers.mail.objects.Personalization;
import org.jsoup.Jsoup;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;
import teammates.common.util.EmailWrapper;
import teammates.common.util.EmailType;
import org.jsoup.nodes.Document;
import com.sendgrid.helpers.mail.Mail;
import org.junit.jupiter.api.DisplayName;
import teammates.common.exception.EmailSendingException;

import java.util.concurrent.atomic.AtomicInteger;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class SendgridServiceTest {
    ///region Test suites for executable teammates.logic.external.SendgridService.parseToEmail

    ///region

    @Test
    public void testParseToEmail1() {
        SendgridService sendgridService = new SendgridService();
        EmailWrapper wrapperMock = mock(EmailWrapper.class);
        EmailType emailType = EmailType.FEEDBACK_CLOSING;
        (when(wrapperMock.getType())).thenReturn(emailType);
        (when(wrapperMock.getSenderName())).thenReturn("syiug");
        (when(wrapperMock.getSenderEmail())).thenReturn("text/html");
        (when(wrapperMock.getReplyTo())).thenReturn("syiug");
        (when(wrapperMock.getRecipient())).thenReturn("text/plain");
        (when(wrapperMock.getBcc())).thenReturn("oxhrh");
        (when(wrapperMock.getSubject())).thenReturn("hlcoj");
        (when(wrapperMock.getContent())).thenReturn("text/plain");
        (when(wrapperMock.getIsCopy())).thenReturn(false);
        
        /* This test fails because method [teammates.logic.external.SendgridService.parseToEmail] produces [java.lang.IllegalStateException: Could not invoke public java.lang.String teammates.common.util.EmailWrapper.getSenderName() on teammates.common.util.EmailWrapper@12ad3187 with arguments []]
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
            teammates.logic.external.SendgridService.parseToEmail(SendgridService.java:37) */
        sendgridService.parseToEmail(wrapperMock);
    }

    @Test
    public void testParseToEmail2() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Mail.class, (Mail MailMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            SendgridService sendgridService = new SendgridService();
            
            /* This test fails because method [teammates.logic.external.SendgridService.parseToEmail] produces [java.lang.NullPointerException]
                teammates.logic.external.SendgridService.parseToEmail(SendgridService.java:37) */
            sendgridService.parseToEmail(((EmailWrapper) null));
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testParseToEmail3() {
        MockedConstruction mockedConstruction = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Mail.class, (Mail MailMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            SendgridService sendgridService = new SendgridService();
            EmailWrapper wrapperMock = mock(EmailWrapper.class);
            String string = "";
            (when(wrapperMock.getSenderName())).thenReturn(string, ((String) null));
            
            /* This test fails because method [teammates.logic.external.SendgridService.parseToEmail] produces [java.lang.NullPointerException]
                teammates.logic.external.SendgridService.parseToEmail(SendgridService.java:37) */
            sendgridService.parseToEmail(wrapperMock);
        } finally {
            mockedConstruction.close();
        }
    }

    @Test
    public void testParseToEmail4() {
        MockedConstruction mockedConstruction = null;
        MockedConstruction mockedConstruction1 = null;
        MockedConstruction mockedConstruction2 = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Mail.class, (Mail MailMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            AtomicInteger mockClassCounter1 = new AtomicInteger();
            mockedConstruction1 = mockConstruction(Email.class, (Email EmailMock, MockedConstruction.Context context1) -> {
                switch (mockClassCounter1.get()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
                mockClassCounter1.getAndIncrement();
            });
            AtomicInteger mockClassCounter2 = new AtomicInteger();
            mockedConstruction2 = mockConstruction(Personalization.class, (Personalization PersonalizationMock, MockedConstruction.Context context2) -> {
                switch (mockClassCounter2.get()) {
                    case 0:
                        break;
                }
                mockClassCounter2.getAndIncrement();
            });
            SendgridService sendgridService = new SendgridService();
            EmailWrapper wrapperMock = mock(EmailWrapper.class);
            (when(wrapperMock.getSenderName())).thenReturn(((String) null));
            (when(wrapperMock.getSenderEmail())).thenReturn(((String) null));
            (when(wrapperMock.getReplyTo())).thenReturn(((String) null));
            (when(wrapperMock.getRecipient())).thenReturn(((String) null));
            String string = "";
            (when(wrapperMock.getBcc())).thenReturn(string, ((String) null));
            
            /* This test fails because method [teammates.logic.external.SendgridService.parseToEmail] produces [java.lang.NullPointerException]
                teammates.logic.external.SendgridService.parseToEmail(SendgridService.java:46) */
            sendgridService.parseToEmail(wrapperMock);
        } finally {
            mockedConstruction.close();
            mockedConstruction1.close();
            mockedConstruction2.close();
        }
    }

    @Test
    public void testParseToEmail5() {
        MockedConstruction mockedConstruction = null;
        MockedConstruction mockedConstruction1 = null;
        MockedConstruction mockedConstruction2 = null;
        MockedConstruction mockedConstruction3 = null;
        MockedStatic mockedStatic = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Mail.class, (Mail MailMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            AtomicInteger mockClassCounter1 = new AtomicInteger();
            mockedConstruction1 = mockConstruction(Email.class, (Email EmailMock, MockedConstruction.Context context1) -> {
                switch (mockClassCounter1.get()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
                mockClassCounter1.getAndIncrement();
            });
            AtomicInteger mockClassCounter2 = new AtomicInteger();
            mockedConstruction2 = mockConstruction(Personalization.class, (Personalization PersonalizationMock, MockedConstruction.Context context2) -> {
                switch (mockClassCounter2.get()) {
                    case 0:
                        break;
                }
                mockClassCounter2.getAndIncrement();
            });
            AtomicInteger mockClassCounter3 = new AtomicInteger();
            mockedConstruction3 = mockConstruction(Content.class, (Content ContentMock, MockedConstruction.Context context3) -> {
                switch (mockClassCounter3.get()) {
                    case 0:
                        break;
                }
                mockClassCounter3.getAndIncrement();
            });
            mockedStatic = mockStatic(Jsoup.class);
            (mockedStatic.when(() -> Jsoup.parse(any(String.class)))).thenReturn(((Document) null));
            SendgridService sendgridService = new SendgridService();
            EmailWrapper wrapperMock = mock(EmailWrapper.class);
            (when(wrapperMock.getSenderName())).thenReturn(((String) null));
            (when(wrapperMock.getSenderEmail())).thenReturn(((String) null));
            (when(wrapperMock.getReplyTo())).thenReturn(((String) null));
            (when(wrapperMock.getRecipient())).thenReturn(((String) null));
            (when(wrapperMock.getBcc())).thenReturn(((String) null));
            (when(wrapperMock.getSubject())).thenReturn(((String) null));
            (when(wrapperMock.getContent())).thenReturn(((String) null));
            
            /* This test fails because method [teammates.logic.external.SendgridService.parseToEmail] produces [java.lang.IllegalStateException: Could not invoke public java.lang.String java.lang.Object.toString() on com.sendgrid.helpers.mail.objects.Content@16371c8c with arguments []]
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
                java.base/java.lang.Object.toString(Object.java:246)
                java.base/java.lang.String.valueOf(String.java:2951)
                java.base/java.util.Arrays.toString(Arrays.java:5113)
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
                com.sendgrid.helpers.mail.Mail.addContent(Mail.java:263)
                teammates.logic.external.SendgridService.parseToEmail(SendgridService.java:51) */
            sendgridService.parseToEmail(wrapperMock);
        } finally {
            mockedConstruction.close();
            mockedConstruction1.close();
            mockedConstruction2.close();
            mockedConstruction3.close();
            mockedStatic.close();
        }
    }

    @Test
    public void testParseToEmail6() {
        MockedConstruction mockedConstruction = null;
        MockedConstruction mockedConstruction1 = null;
        MockedConstruction mockedConstruction2 = null;
        MockedConstruction mockedConstruction3 = null;
        MockedStatic mockedStatic = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Mail.class, (Mail MailMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            AtomicInteger mockClassCounter1 = new AtomicInteger();
            mockedConstruction1 = mockConstruction(Email.class, (Email EmailMock, MockedConstruction.Context context1) -> {
                switch (mockClassCounter1.get()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
                mockClassCounter1.getAndIncrement();
            });
            AtomicInteger mockClassCounter2 = new AtomicInteger();
            mockedConstruction2 = mockConstruction(Personalization.class, (Personalization PersonalizationMock, MockedConstruction.Context context2) -> {
                switch (mockClassCounter2.get()) {
                    case 0:
                        break;
                }
                mockClassCounter2.getAndIncrement();
            });
            AtomicInteger mockClassCounter3 = new AtomicInteger();
            mockedConstruction3 = mockConstruction(Content.class, (Content ContentMock, MockedConstruction.Context context3) -> {
                switch (mockClassCounter3.get()) {
                    case 0:
                        break;
                }
                mockClassCounter3.getAndIncrement();
            });
            mockedStatic = mockStatic(Jsoup.class);
            (mockedStatic.when(() -> Jsoup.parse(any(String.class)))).thenReturn(((Document) null));
            SendgridService sendgridService = new SendgridService();
            EmailWrapper wrapperMock = mock(EmailWrapper.class);
            (when(wrapperMock.getSenderName())).thenReturn(((String) null));
            (when(wrapperMock.getSenderEmail())).thenReturn(((String) null));
            (when(wrapperMock.getReplyTo())).thenReturn(((String) null));
            (when(wrapperMock.getRecipient())).thenReturn(((String) null));
            String string = "";
            (when(wrapperMock.getBcc())).thenReturn(string, string);
            (when(wrapperMock.getSubject())).thenReturn(((String) null));
            (when(wrapperMock.getContent())).thenReturn(((String) null));
            
            /* This test fails because method [teammates.logic.external.SendgridService.parseToEmail] produces [java.lang.IllegalStateException: Could not invoke public java.lang.String java.lang.Object.toString() on com.sendgrid.helpers.mail.objects.Content@3b65baa8 with arguments []]
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
                java.base/java.lang.Object.toString(Object.java:246)
                java.base/java.lang.String.valueOf(String.java:2951)
                java.base/java.util.Arrays.toString(Arrays.java:5113)
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
                com.sendgrid.helpers.mail.Mail.addContent(Mail.java:263)
                teammates.logic.external.SendgridService.parseToEmail(SendgridService.java:51) */
            sendgridService.parseToEmail(wrapperMock);
        } finally {
            mockedConstruction.close();
            mockedConstruction1.close();
            mockedConstruction2.close();
            mockedConstruction3.close();
            mockedStatic.close();
        }
    }

    @Test
    public void testParseToEmail7() {
        MockedConstruction mockedConstruction = null;
        MockedConstruction mockedConstruction1 = null;
        MockedConstruction mockedConstruction2 = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Mail.class, (Mail MailMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            AtomicInteger mockClassCounter1 = new AtomicInteger();
            mockedConstruction1 = mockConstruction(Email.class, (Email EmailMock, MockedConstruction.Context context1) -> {
                switch (mockClassCounter1.get()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
                mockClassCounter1.getAndIncrement();
            });
            AtomicInteger mockClassCounter2 = new AtomicInteger();
            mockedConstruction2 = mockConstruction(Personalization.class, (Personalization PersonalizationMock, MockedConstruction.Context context2) -> {
                switch (mockClassCounter2.get()) {
                    case 0:
                        break;
                }
                mockClassCounter2.getAndIncrement();
            });
            SendgridService sendgridService = new SendgridService();
            EmailWrapper wrapperMock = mock(EmailWrapper.class);
            String string = "";
            (when(wrapperMock.getSenderName())).thenReturn(string, string);
            (when(wrapperMock.getSenderEmail())).thenReturn(((String) null));
            (when(wrapperMock.getReplyTo())).thenReturn(((String) null));
            (when(wrapperMock.getRecipient())).thenReturn(((String) null));
            (when(wrapperMock.getBcc())).thenReturn(string, ((String) null));
            
            /* This test fails because method [teammates.logic.external.SendgridService.parseToEmail] produces [java.lang.NullPointerException]
                teammates.logic.external.SendgridService.parseToEmail(SendgridService.java:46) */
            sendgridService.parseToEmail(wrapperMock);
        } finally {
            mockedConstruction.close();
            mockedConstruction1.close();
            mockedConstruction2.close();
        }
    }

    @Test
    public void testParseToEmail8() {
        MockedConstruction mockedConstruction = null;
        MockedConstruction mockedConstruction1 = null;
        MockedConstruction mockedConstruction2 = null;
        MockedConstruction mockedConstruction3 = null;
        MockedStatic mockedStatic = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Mail.class, (Mail MailMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            AtomicInteger mockClassCounter1 = new AtomicInteger();
            mockedConstruction1 = mockConstruction(Email.class, (Email EmailMock, MockedConstruction.Context context1) -> {
                switch (mockClassCounter1.get()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                mockClassCounter1.getAndIncrement();
            });
            AtomicInteger mockClassCounter2 = new AtomicInteger();
            mockedConstruction2 = mockConstruction(Personalization.class, (Personalization PersonalizationMock, MockedConstruction.Context context2) -> {
                switch (mockClassCounter2.get()) {
                    case 0:
                        break;
                }
                mockClassCounter2.getAndIncrement();
            });
            AtomicInteger mockClassCounter3 = new AtomicInteger();
            mockedConstruction3 = mockConstruction(Content.class, (Content ContentMock, MockedConstruction.Context context3) -> {
                switch (mockClassCounter3.get()) {
                    case 0:
                        break;
                }
                mockClassCounter3.getAndIncrement();
            });
            mockedStatic = mockStatic(Jsoup.class);
            (mockedStatic.when(() -> Jsoup.parse(any(String.class)))).thenReturn(((Document) null));
            SendgridService sendgridService = new SendgridService();
            EmailWrapper wrapperMock = mock(EmailWrapper.class);
            (when(wrapperMock.getSenderName())).thenReturn(((String) null));
            (when(wrapperMock.getSenderEmail())).thenReturn(((String) null));
            (when(wrapperMock.getReplyTo())).thenReturn(((String) null));
            (when(wrapperMock.getRecipient())).thenReturn(((String) null));
            String string = "\u0000";
            (when(wrapperMock.getBcc())).thenReturn(string, string, ((String) null));
            (when(wrapperMock.getSubject())).thenReturn(((String) null));
            (when(wrapperMock.getContent())).thenReturn(((String) null));
            
            /* This test fails because method [teammates.logic.external.SendgridService.parseToEmail] produces [java.lang.IllegalStateException: Could not invoke public java.lang.String java.lang.Object.toString() on com.sendgrid.helpers.mail.objects.Content@66ef8df3 with arguments []]
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
                java.base/java.lang.Object.toString(Object.java:246)
                java.base/java.lang.String.valueOf(String.java:2951)
                java.base/java.util.Arrays.toString(Arrays.java:5113)
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
                com.sendgrid.helpers.mail.Mail.addContent(Mail.java:263)
                teammates.logic.external.SendgridService.parseToEmail(SendgridService.java:51) */
            sendgridService.parseToEmail(wrapperMock);
        } finally {
            mockedConstruction.close();
            mockedConstruction1.close();
            mockedConstruction2.close();
            mockedConstruction3.close();
            mockedStatic.close();
        }
    }

    @Test
    public void testParseToEmail9() {
        MockedConstruction mockedConstruction = null;
        MockedConstruction mockedConstruction1 = null;
        MockedConstruction mockedConstruction2 = null;
        MockedConstruction mockedConstruction3 = null;
        MockedStatic mockedStatic = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Mail.class, (Mail MailMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            AtomicInteger mockClassCounter1 = new AtomicInteger();
            mockedConstruction1 = mockConstruction(Email.class, (Email EmailMock, MockedConstruction.Context context1) -> {
                switch (mockClassCounter1.get()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
                mockClassCounter1.getAndIncrement();
            });
            AtomicInteger mockClassCounter2 = new AtomicInteger();
            mockedConstruction2 = mockConstruction(Personalization.class, (Personalization PersonalizationMock, MockedConstruction.Context context2) -> {
                switch (mockClassCounter2.get()) {
                    case 0:
                        break;
                }
                mockClassCounter2.getAndIncrement();
            });
            AtomicInteger mockClassCounter3 = new AtomicInteger();
            mockedConstruction3 = mockConstruction(Content.class, (Content ContentMock, MockedConstruction.Context context3) -> {
                switch (mockClassCounter3.get()) {
                    case 0:
                        break;
                }
                mockClassCounter3.getAndIncrement();
            });
            mockedStatic = mockStatic(Jsoup.class);
            (mockedStatic.when(() -> Jsoup.parse(any(String.class)))).thenReturn(((Document) null));
            SendgridService sendgridService = new SendgridService();
            EmailWrapper wrapperMock = mock(EmailWrapper.class);
            String string = "\u0000";
            (when(wrapperMock.getSenderName())).thenReturn(string, string, ((String) null));
            (when(wrapperMock.getSenderEmail())).thenReturn(((String) null));
            (when(wrapperMock.getReplyTo())).thenReturn(((String) null));
            (when(wrapperMock.getRecipient())).thenReturn(((String) null));
            (when(wrapperMock.getBcc())).thenReturn(((String) null));
            (when(wrapperMock.getSubject())).thenReturn(((String) null));
            (when(wrapperMock.getContent())).thenReturn(((String) null));
            
            /* This test fails because method [teammates.logic.external.SendgridService.parseToEmail] produces [java.lang.IllegalStateException: Could not invoke public java.lang.String java.lang.Object.toString() on com.sendgrid.helpers.mail.objects.Content@3d610100 with arguments []]
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
                java.base/java.lang.Object.toString(Object.java:246)
                java.base/java.lang.String.valueOf(String.java:2951)
                java.base/java.util.Arrays.toString(Arrays.java:5113)
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
                com.sendgrid.helpers.mail.Mail.addContent(Mail.java:263)
                teammates.logic.external.SendgridService.parseToEmail(SendgridService.java:51) */
            sendgridService.parseToEmail(wrapperMock);
        } finally {
            mockedConstruction.close();
            mockedConstruction1.close();
            mockedConstruction2.close();
            mockedConstruction3.close();
            mockedStatic.close();
        }
    }

    @Test
    public void testParseToEmail10() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        MockedConstruction mockedConstruction = null;
        MockedConstruction mockedConstruction1 = null;
        MockedConstruction mockedConstruction2 = null;
        MockedConstruction mockedConstruction3 = null;
        MockedStatic mockedStatic = null;
        try {
            AtomicInteger mockClassCounter = new AtomicInteger();
            mockedConstruction = mockConstruction(Mail.class, (Mail MailMock, MockedConstruction.Context context) -> {
                switch (mockClassCounter.get()) {
                    case 0:
                        break;
                }
                mockClassCounter.getAndIncrement();
            });
            AtomicInteger mockClassCounter1 = new AtomicInteger();
            mockedConstruction1 = mockConstruction(Email.class, (Email EmailMock, MockedConstruction.Context context1) -> {
                switch (mockClassCounter1.get()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
                mockClassCounter1.getAndIncrement();
            });
            AtomicInteger mockClassCounter2 = new AtomicInteger();
            mockedConstruction2 = mockConstruction(Personalization.class, (Personalization PersonalizationMock, MockedConstruction.Context context2) -> {
                switch (mockClassCounter2.get()) {
                    case 0:
                        break;
                }
                mockClassCounter2.getAndIncrement();
            });
            AtomicInteger mockClassCounter3 = new AtomicInteger();
            mockedConstruction3 = mockConstruction(Content.class, (Content ContentMock, MockedConstruction.Context context3) -> {
                switch (mockClassCounter3.get()) {
                    case 0:
                        break;
                    case 1:
                        break;
                }
                mockClassCounter3.getAndIncrement();
            });
            mockedStatic = mockStatic(Jsoup.class);
            Document documentMock = mock(Document.class);
            (when(documentMock.text())).thenReturn(((String) null));
            (mockedStatic.when(() -> Jsoup.parse(any(String.class)))).thenReturn(documentMock);
            SendgridService sendgridService = new SendgridService();
            EmailWrapper wrapperMock = mock(EmailWrapper.class);
            (when(wrapperMock.getSenderName())).thenReturn(((String) null));
            (when(wrapperMock.getSenderEmail())).thenReturn(((String) null));
            (when(wrapperMock.getReplyTo())).thenReturn(((String) null));
            (when(wrapperMock.getRecipient())).thenReturn(((String) null));
            (when(wrapperMock.getBcc())).thenReturn(((String) null));
            (when(wrapperMock.getSubject())).thenReturn(((String) null));
            (when(wrapperMock.getContent())).thenReturn(((String) null), ((String) null));

            Mail actual = sendgridService.parseToEmail(wrapperMock);

            Mail expectedMock = mock(Mail.class);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "from", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "subject", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "personalization", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "content", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "attachments", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "templateId", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "sections", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "headers", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "categories", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "customArgs", null);
            expectedMock.sendAt = 0L;
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "batchId", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "asm", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "ipPoolId", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "mailSettings", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "trackingSettings", null);
            setField(expectedMock, "com.sendgrid.helpers.mail.Mail", "replyTo", null);
            // com.sendgrid.helpers.mail.Mail has overridden equals method
            assertEquals(expectedMock, actual);
        } finally {
            mockedConstruction.close();
            mockedConstruction1.close();
            mockedConstruction2.close();
            mockedConstruction3.close();
            mockedStatic.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.external.SendgridService.sendEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sendEmail(teammates.common.util.EmailWrapper)

    /**
     * @utbot.classUnderTest {@link SendgridService}
     * @utbot.methodUnderTest {@link SendgridService#sendEmail(EmailWrapper)}
     */
    @Test
    @DisplayName("sendEmail: wrapper = EmailWrapper() -> throw IllegalStateException")
    public void testSendEmailThrowsISE() throws EmailSendingException {
        SendgridService sendgridService = new SendgridService();
        EmailWrapper wrapperMock = mock(EmailWrapper.class);
        EmailType emailType = EmailType.FEEDBACK_CLOSING;
        (when(wrapperMock.getType())).thenReturn(emailType);
        (when(wrapperMock.getSenderName())).thenReturn("noimn");
        (when(wrapperMock.getSenderEmail())).thenReturn("mail/send");
        (when(wrapperMock.getReplyTo())).thenReturn("");
        (when(wrapperMock.getRecipient())).thenReturn("syiug");
        (when(wrapperMock.getBcc())).thenReturn("oxhrh");
        (when(wrapperMock.getSubject())).thenReturn("hlcoj");
        (when(wrapperMock.getContent())).thenReturn("oesjb");
        (when(wrapperMock.getIsCopy())).thenReturn(false);
        
        /* This test fails because method [teammates.logic.external.SendgridService.sendEmail] produces [java.lang.IllegalStateException: Could not invoke public java.lang.String teammates.common.util.EmailWrapper.getSenderName() on teammates.common.util.EmailWrapper@2527069b with arguments []]
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
            teammates.logic.external.SendgridService.parseToEmail(SendgridService.java:37)
            teammates.logic.external.SendgridService.sendEmail(SendgridService.java:58) */
        sendgridService.sendEmail(wrapperMock);
    }
    ///endregion

    ///endregion
}
