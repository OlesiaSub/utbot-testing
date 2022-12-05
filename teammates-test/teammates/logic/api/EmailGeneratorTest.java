package teammates.logic.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.MockedStatic;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.logic.core.CoursesLogic;
import teammates.logic.core.FeedbackSessionsLogic;
import teammates.logic.core.InstructorsLogic;
import teammates.logic.core.StudentsLogic;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.common.util.EmailType;

import java.util.List;

import teammates.common.datatransfer.attributes.CourseAttributes;

import java.util.LinkedHashMap;
import java.util.ArrayList;

import teammates.common.datatransfer.ErrorLogEntry;

import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.mockito.Mockito.mockStatic;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public final class EmailGeneratorTest {
    ///region Test suites for executable teammates.logic.api.EmailGenerator.inst

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inst()

    /**
     * @utbot.classUnderTest {@link EmailGenerator}
     * @utbot.methodUnderTest {@link EmailGenerator#inst()}
     * @utbot.returnsFrom {@code return instance;}
     */
    @Test
    @DisplayName("inst: -> return instance")
    public void testInst_ReturnInstance() throws Exception {
        MockedStatic mockedStatic = null;
        MockedStatic mockedStatic1 = null;
        MockedStatic mockedStatic2 = null;
        MockedStatic mockedStatic3 = null;
        try {
            Class emailGeneratorClazz = Class.forName("teammates.logic.api.EmailGenerator");
            EmailGenerator prevInstance = ((EmailGenerator) getStaticFieldValue(emailGeneratorClazz, "instance"));
            try {
                EmailGenerator instance = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
                setField(instance, "teammates.logic.api.EmailGenerator", "coursesLogic", null);
                setField(instance, "teammates.logic.api.EmailGenerator", "fsLogic", null);
                setField(instance, "teammates.logic.api.EmailGenerator", "instructorsLogic", null);
                setField(instance, "teammates.logic.api.EmailGenerator", "studentsLogic", null);
                setStaticField(emailGeneratorClazz, "instance", instance);
                mockedStatic = mockStatic(CoursesLogic.class);
                (mockedStatic.when(CoursesLogic::inst)).thenReturn(((CoursesLogic) null));
                mockedStatic1 = mockStatic(FeedbackSessionsLogic.class);
                (mockedStatic1.when(FeedbackSessionsLogic::inst)).thenReturn(((FeedbackSessionsLogic) null));
                mockedStatic2 = mockStatic(InstructorsLogic.class);
                (mockedStatic2.when(InstructorsLogic::inst)).thenReturn(((InstructorsLogic) null));
                mockedStatic3 = mockStatic(StudentsLogic.class);
                (mockedStatic3.when(StudentsLogic::inst)).thenReturn(((StudentsLogic) null));

                EmailGenerator actual = EmailGenerator.inst();

                CoursesLogic actualCoursesLogic = ((CoursesLogic) getFieldValue(actual, "teammates.logic.api.EmailGenerator", "coursesLogic"));
                assertNull(actualCoursesLogic);

                FeedbackSessionsLogic actualFsLogic = ((FeedbackSessionsLogic) getFieldValue(actual, "teammates.logic.api.EmailGenerator", "fsLogic"));
                assertNull(actualFsLogic);

                InstructorsLogic actualInstructorsLogic = ((InstructorsLogic) getFieldValue(actual, "teammates.logic.api.EmailGenerator", "instructorsLogic"));
                assertNull(actualInstructorsLogic);

                StudentsLogic actualStudentsLogic = ((StudentsLogic) getFieldValue(actual, "teammates.logic.api.EmailGenerator", "studentsLogic"));
                assertNull(actualStudentsLogic);

            } finally {
                setStaticField(EmailGenerator.class, "instance", prevInstance);
            }
        } finally {
            mockedStatic.close();
            mockedStatic1.close();
            mockedStatic2.close();
            mockedStatic3.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateFeedbackSessionReminderEmails

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method generateFeedbackSessionReminderEmails(teammates.common.datatransfer.attributes.FeedbackSessionAttributes, java.util.List, java.util.List, teammates.common.datatransfer.attributes.InstructorAttributes)

    /**
     * @utbot.classUnderTest {@link EmailGenerator}
     * @utbot.methodUnderTest {@link EmailGenerator#generateFeedbackSessionReminderEmails(FeedbackSessionAttributes, List, List, InstructorAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: CourseAttributes course = coursesLogic.getCourse(session.getCourseId());
     */
    @Test
    @DisplayName("generateFeedbackSessionReminderEmails: course = coursesLogic.getCourse(session.getCourseId()) : True -> ThrowNullPointerException")
    public void testGenerateFeedbackSessionReminderEmails_ThrowNullPointerException() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        setField(emailGenerator, "teammates.logic.api.EmailGenerator", "coursesLogic", null);
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateFeedbackSessionReminderEmails] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateFeedbackSessionReminderEmails(EmailGenerator.java:225) */
        emailGenerator.generateFeedbackSessionReminderEmails(null, null, null, null);
    }

    /**
     * @utbot.classUnderTest {@link EmailGenerator}
     * @utbot.methodUnderTest {@link EmailGenerator#generateFeedbackSessionReminderEmails(FeedbackSessionAttributes, List, List, InstructorAttributes)}
     * @utbot.invokes {@link CoursesLogic#getCourse(String)}
     * @utbot.throwsException {@link NullPointerException} in: CourseAttributes course = coursesLogic.getCourse(session.getCourseId());
     */
    @Test
    @DisplayName("generateFeedbackSessionReminderEmails: course = coursesLogic.getCourse(session.getCourseId()) : True -> ThrowNullPointerException")
    public void testGenerateFeedbackSessionReminderEmails_CoursesLogicGetCourse() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        setField(emailGenerator, "teammates.logic.api.EmailGenerator", "coursesLogic", null);
        FeedbackSessionAttributes sessionMock = mock(FeedbackSessionAttributes.class);
        (when(sessionMock.getCourseId())).thenReturn(((String) null));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateFeedbackSessionReminderEmails] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateFeedbackSessionReminderEmails(EmailGenerator.java:225) */
        emailGenerator.generateFeedbackSessionReminderEmails(sessionMock, null, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateFeedbackSessionSummaryOfCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method generateFeedbackSessionSummaryOfCourse(java.lang.String, java.lang.String, teammates.common.util.EmailType)

    /**
     * @utbot.classUnderTest {@link EmailGenerator}
     * @utbot.methodUnderTest {@link EmailGenerator#generateFeedbackSessionSummaryOfCourse(String, String, EmailType)}
     */
    @Test
    @DisplayName("generateFeedbackSessionSummaryOfCourse: courseId = string, userEmail = string, emailType = DEADLINE_EXTENSION_UPDATED -> throw AssertionError")
    public void testGenerateFeedbackSessionSummaryOfCourseThrowsAEWithNonEmptyStrings() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        EmailType emailType = EmailType.DEADLINE_EXTENSION_UPDATED;
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateFeedbackSessionSummaryOfCourse] produces [java.lang.AssertionError]
            teammates.logic.api.EmailGenerator.generateFeedbackSessionSummaryOfCourse(EmailGenerator.java:245) */
        emailGenerator.generateFeedbackSessionSummaryOfCourse("/web/sessions/submission", "instructor", emailType);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateSessionLinksRecoveryEmailForStudent

    ///region

    @Test
    public void testGenerateSessionLinksRecoveryEmailForStudent1() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateSessionLinksRecoveryEmailForStudent] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateSessionLinksRecoveryEmailForStudent(EmailGenerator.java:356) */
        emailGenerator.generateSessionLinksRecoveryEmailForStudent("   ");
    }

    @Test
    public void testGenerateSessionLinksRecoveryEmailForStudent2() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        StudentsLogic studentsLogicMock = mock(StudentsLogic.class);
        (when(studentsLogicMock.getAllStudentsForEmail(any()))).thenReturn(((List) null));
        setField(emailGenerator, "teammates.logic.api.EmailGenerator", "studentsLogic", studentsLogicMock);
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateSessionLinksRecoveryEmailForStudent] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateSessionLinksRecoveryEmailForStudent(EmailGenerator.java:358) */
        emailGenerator.generateSessionLinksRecoveryEmailForStudent(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateFeedbackSessionClosingWithExtensionEmails

    ///region

    @Test
    public void testGenerateFeedbackSessionClosingWithExtensionEmails1() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateFeedbackSessionClosingWithExtensionEmails] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateFeedbackSessionClosingWithExtensionEmails(EmailGenerator.java:496) */
        emailGenerator.generateFeedbackSessionClosingWithExtensionEmails(null, null);
    }

    @Test
    public void testGenerateFeedbackSessionClosingWithExtensionEmails2() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        setField(emailGenerator, "teammates.logic.api.EmailGenerator", "coursesLogic", null);
        FeedbackSessionAttributes sessionMock = mock(FeedbackSessionAttributes.class);
        (when(sessionMock.getCourseId())).thenReturn(((String) null));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateFeedbackSessionClosingWithExtensionEmails] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateFeedbackSessionClosingWithExtensionEmails(EmailGenerator.java:497) */
        emailGenerator.generateFeedbackSessionClosingWithExtensionEmails(sessionMock, null);
    }

    @Test
    public void testGenerateFeedbackSessionClosingWithExtensionEmails3() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        CoursesLogic coursesLogicMock = mock(CoursesLogic.class);
        (when(coursesLogicMock.getCourse(any()))).thenReturn(((CourseAttributes) null));
        setField(emailGenerator, "teammates.logic.api.EmailGenerator", "coursesLogic", coursesLogicMock);
        FeedbackSessionAttributes sessionMock = mock(FeedbackSessionAttributes.class);
        (when(sessionMock.getCourseId())).thenReturn(((String) null));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateFeedbackSessionClosingWithExtensionEmails] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateFeedbackSessionClosingWithExtensionEmails(EmailGenerator.java:499) */
        emailGenerator.generateFeedbackSessionClosingWithExtensionEmails(sessionMock, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateDeadlineGrantedEmails

    ///region

    @Test
    public void testGenerateDeadlineGrantedEmails1() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateDeadlineGrantedEmails] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateDeadlineGrantedEmails(EmailGenerator.java:612) */
        emailGenerator.generateDeadlineGrantedEmails(null, null, null, false);
    }

    @Test
    public void testGenerateDeadlineGrantedEmails2() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        LinkedHashMap createdDeadlines = new LinkedHashMap();

        ArrayList actual = ((ArrayList) emailGenerator.generateDeadlineGrantedEmails(null, null, createdDeadlines, false));

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateDeadlineUpdatedEmails

    ///region

    @Test
    public void testGenerateDeadlineUpdatedEmails1() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateDeadlineUpdatedEmails] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateDeadlineUpdatedEmails(EmailGenerator.java:626) */
        emailGenerator.generateDeadlineUpdatedEmails(null, null, null, null, false);
    }

    @Test
    public void testGenerateDeadlineUpdatedEmails2() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        LinkedHashMap updatedDeadlines = new LinkedHashMap();

        ArrayList actual = ((ArrayList) emailGenerator.generateDeadlineUpdatedEmails(null, null, updatedDeadlines, null, false));

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateDeadlineRevokedEmails

    ///region

    @Test
    public void testGenerateDeadlineRevokedEmails1() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateDeadlineRevokedEmails] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateDeadlineRevokedEmails(EmailGenerator.java:640) */
        emailGenerator.generateDeadlineRevokedEmails(null, null, null, false);
    }

    @Test
    public void testGenerateDeadlineRevokedEmails2() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        LinkedHashMap revokedDeadlines = new LinkedHashMap();

        ArrayList actual = ((ArrayList) emailGenerator.generateDeadlineRevokedEmails(null, null, revokedDeadlines, false));

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateNewInstructorAccountJoinEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method generateNewInstructorAccountJoinEmail(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link EmailGenerator}
     * @utbot.methodUnderTest {@link EmailGenerator#generateNewInstructorAccountJoinEmail(String, String, String)}
     */
    @Test
    @DisplayName("generateNewInstructorAccountJoinEmail: instructorEmail = empty string, instructorName != empty string, joinUrl has special characters -> throw ExceptionInInitializerError")
    public void testGenerateNewInstructorAccountJoinEmailThrowsEIIEWithEmptyStringAndNonEmptyStringAndBlankString() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));

        assertThrows(ExceptionInInitializerError.class, () -> emailGenerator.generateNewInstructorAccountJoinEmail("", "string", "\n\t\r"));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateStudentCourseJoinEmail

    ///region OTHER: ERROR SUITE for method generateStudentCourseJoinEmail(teammates.common.datatransfer.attributes.CourseAttributes, teammates.common.datatransfer.attributes.StudentAttributes)

    @Test
    public void testGenerateStudentCourseJoinEmail1() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateStudentCourseJoinEmail] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.fillUpStudentJoinFragment(EmailGenerator.java:960)
            teammates.logic.api.EmailGenerator.generateStudentCourseJoinEmail(EmailGenerator.java:862) */
        emailGenerator.generateStudentCourseJoinEmail(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateStudentCourseRejoinEmailAfterGoogleIdReset

    ///region OTHER: ERROR SUITE for method generateStudentCourseRejoinEmailAfterGoogleIdReset(teammates.common.datatransfer.attributes.CourseAttributes, teammates.common.datatransfer.attributes.StudentAttributes)

    @Test
    public void testGenerateStudentCourseRejoinEmailAfterGoogleIdReset1() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateStudentCourseRejoinEmailAfterGoogleIdReset] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.fillUpStudentRejoinAfterGoogleIdResetFragment(EmailGenerator.java:968)
            teammates.logic.api.EmailGenerator.generateStudentCourseRejoinEmailAfterGoogleIdReset(EmailGenerator.java:882) */
        emailGenerator.generateStudentCourseRejoinEmailAfterGoogleIdReset(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateInstructorCourseRejoinEmailAfterGoogleIdReset

    ///region OTHER: ERROR SUITE for method generateInstructorCourseRejoinEmailAfterGoogleIdReset(teammates.common.datatransfer.attributes.InstructorAttributes, teammates.common.datatransfer.attributes.CourseAttributes)

    @Test
    public void testGenerateInstructorCourseRejoinEmailAfterGoogleIdReset1() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateInstructorCourseRejoinEmailAfterGoogleIdReset] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.fillUpInstructorRejoinAfterGoogleIdResetFragment(EmailGenerator.java:987)
            teammates.logic.api.EmailGenerator.generateInstructorCourseRejoinEmailAfterGoogleIdReset(EmailGenerator.java:924) */
        emailGenerator.generateInstructorCourseRejoinEmailAfterGoogleIdReset(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.api.EmailGenerator.generateCompiledLogsEmail

    ///region

    @Test
    public void testGenerateCompiledLogsEmail1() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        ArrayList logs = new ArrayList();
        ErrorLogEntry errorLogEntryMock = mock(ErrorLogEntry.class);
        logs.add(errorLogEntryMock);
        ErrorLogEntry errorLogEntryMock1 = mock(ErrorLogEntry.class);
        logs.add(errorLogEntryMock1);
        ErrorLogEntry errorLogEntryMock2 = mock(ErrorLogEntry.class);
        logs.add(errorLogEntryMock2);
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateCompiledLogsEmail] produces [java.lang.IllegalStateException: Could not invoke public java.lang.String teammates.common.datatransfer.ErrorLogEntry.getMessage() on teammates.common.datatransfer.ErrorLogEntry@444a1846 with arguments []]
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
            teammates.common.datatransfer.ErrorLogEntry.getMessage(ErrorLogEntry.java:71)
            teammates.logic.api.EmailGenerator.generateCompiledLogsEmail(EmailGenerator.java:1007) */
        emailGenerator.generateCompiledLogsEmail(logs);
    }

    @Test
    public void testGenerateCompiledLogsEmail2() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        
        /* This test fails because method [teammates.logic.api.EmailGenerator.generateCompiledLogsEmail] produces [java.lang.NullPointerException]
            teammates.logic.api.EmailGenerator.generateCompiledLogsEmail(EmailGenerator.java:1006) */
        emailGenerator.generateCompiledLogsEmail(null);
    }

    @Test
    @Disabled(value = "Disabled due to sandbox")
    public void testGenerateCompiledLogsEmail3() throws Exception {
        EmailGenerator emailGenerator = ((EmailGenerator) createInstance("teammates.logic.api.EmailGenerator"));
        ArrayList logs = new ArrayList();

        assertThrows(ExceptionInInitializerError.class, () -> emailGenerator.generateCompiledLogsEmail(logs));
    }
    ///endregion

    ///endregion
}
