package teammates.logic.core;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes.UpdateOptions;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.storage.api.FeedbackQuestionsDb;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;

import java.util.List;
import java.util.ArrayList;

import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.CourseRoster;
import teammates.common.datatransfer.questions.FeedbackQuestionType;
import teammates.common.datatransfer.questions.FeedbackConstantSumQuestionDetails;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static java.util.Collections.emptyList;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class FeedbackQuestionsLogicTest {
    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.updateFeedbackQuestionCascade

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateFeedbackQuestionCascade(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#updateFeedbackQuestionCascade(UpdateOptions)}
     * @utbot.invokes {@link UpdateOptions#getFeedbackQuestionId()}
     * @utbot.throwsException {@link NullPointerException} in: FeedbackQuestionAttributes oldQuestion = fqDb.getFeedbackQuestion(updateOptions.getFeedbackQuestionId());
     */
    @Test
    @DisplayName("updateFeedbackQuestionCascade: oldQuestion = fqDb.getFeedbackQuestion(updateOptions.getFeedbackQuestionId()) : True -> ThrowNullPointerException")
    public void testUpdateFeedbackQuestionCascade_FeedbackQuestionAttributesGetFeedbackQuestionId() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.updateFeedbackQuestionCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.updateFeedbackQuestionCascade(FeedbackQuestionsLogic.java:675) */
        feedbackQuestionsLogic.updateFeedbackQuestionCascade(null);
    }

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#updateFeedbackQuestionCascade(UpdateOptions)}
     * @utbot.invokes {@link UpdateOptions#getFeedbackQuestionId()}
     * @utbot.throwsException {@link NullPointerException} in: FeedbackQuestionAttributes oldQuestion = fqDb.getFeedbackQuestion(updateOptions.getFeedbackQuestionId());
     */
    @Test
    @DisplayName("updateFeedbackQuestionCascade: oldQuestion = fqDb.getFeedbackQuestion(updateOptions.getFeedbackQuestionId()) : True -> ThrowNullPointerException")
    public void testUpdateFeedbackQuestionCascade_FeedbackQuestionAttributesGetFeedbackQuestionId_1() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", null);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.FeedbackQuestionAttributes$UpdateOptions"));
        setField(updateOptions, "teammates.common.datatransfer.attributes.FeedbackQuestionAttributes$UpdateOptions", "feedbackQuestionId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.updateFeedbackQuestionCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.updateFeedbackQuestionCascade(FeedbackQuestionsLogic.java:675) */
        feedbackQuestionsLogic.updateFeedbackQuestionCascade(updateOptions);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateFeedbackQuestionCascade(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes.UpdateOptions)

    @Test
    public void testUpdateFeedbackQuestionCascade1() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.FeedbackQuestionAttributes$UpdateOptions"));
        setField(updateOptions, "teammates.common.datatransfer.attributes.FeedbackQuestionAttributes$UpdateOptions", "feedbackQuestionId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.updateFeedbackQuestionCascade] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackQuestionsDb.getFeedbackQuestion(FeedbackQuestionsDb.java:39)
            teammates.logic.core.FeedbackQuestionsLogic.updateFeedbackQuestionCascade(FeedbackQuestionsLogic.java:675) */
        feedbackQuestionsLogic.updateFeedbackQuestionCascade(updateOptions);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.inst

    ///region OTHER: SUCCESSFUL EXECUTIONS for method inst()

    @Test
    public void testInst1() throws Exception {
        FeedbackQuestionsLogic actual = FeedbackQuestionsLogic.inst();

        FeedbackQuestionsLogic expected = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
        setField(expected, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
        setField(expected, "teammates.logic.core.FeedbackQuestionsLogic", "coursesLogic", null);
        setField(expected, "teammates.logic.core.FeedbackQuestionsLogic", "frLogic", null);
        setField(expected, "teammates.logic.core.FeedbackQuestionsLogic", "fsLogic", null);
        setField(expected, "teammates.logic.core.FeedbackQuestionsLogic", "instructorsLogic", null);
        setField(expected, "teammates.logic.core.FeedbackQuestionsLogic", "studentsLogic", null);
        FeedbackQuestionsDb expectedFqDb = ((FeedbackQuestionsDb) getFieldValue(expected, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb"));
        FeedbackQuestionsDb actualFqDb = ((FeedbackQuestionsDb) getFieldValue(actual, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb"));

        CoursesLogic actualCoursesLogic = ((CoursesLogic) getFieldValue(actual, "teammates.logic.core.FeedbackQuestionsLogic", "coursesLogic"));
        assertNull(actualCoursesLogic);

        FeedbackResponsesLogic actualFrLogic = ((FeedbackResponsesLogic) getFieldValue(actual, "teammates.logic.core.FeedbackQuestionsLogic", "frLogic"));
        assertNull(actualFrLogic);

        FeedbackSessionsLogic actualFsLogic = ((FeedbackSessionsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackQuestionsLogic", "fsLogic"));
        assertNull(actualFsLogic);

        InstructorsLogic actualInstructorsLogic = ((InstructorsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackQuestionsLogic", "instructorsLogic"));
        assertNull(actualInstructorsLogic);

        StudentsLogic actualStudentsLogic = ((StudentsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackQuestionsLogic", "studentsLogic"));
        assertNull(actualStudentsLogic);

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.initLogicDependencies

    ///region OTHER: SECURITY for method initLogicDependencies()

    @Test
    @Disabled(value = "Disabled due to sandbox")
    public void testInitLogicDependencies1() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));

        assertThrows(ExceptionInInitializerError.class, () -> feedbackQuestionsLogic.initLogicDependencies());
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.createFeedbackQuestion

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFeedbackQuestion(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#createFeedbackQuestion(FeedbackQuestionAttributes)}
     * @utbot.invokes {@link FeedbackQuestionAttributes#getFeedbackSessionName()}
     * @utbot.throwsException {@link NullPointerException} in: getFeedbackQuestionsForSession(fqa.getFeedbackSessionName(), fqa.getCourseId())
     */
    @Test
    @DisplayName("createFeedbackQuestion: getFeedbackQuestionsForSession(fqa.getFeedbackSessionName(), fqa.getCourseId()) : True -> ThrowNullPointerException")
    public void testCreateFeedbackQuestion_FeedbackQuestionAttributesGetFeedbackSessionName() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.createFeedbackQuestion] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.createFeedbackQuestion(FeedbackQuestionsLogic.java:78) */
        feedbackQuestionsLogic.createFeedbackQuestion(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createFeedbackQuestion(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes)

    @Test
    public void testCreateFeedbackQuestion1() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
        FeedbackQuestionAttributes fqa = ((FeedbackQuestionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackQuestionAttributes"));
        setField(fqa, "teammates.common.datatransfer.attributes.FeedbackQuestionAttributes", "feedbackSessionName", null);
        setField(fqa, "teammates.common.datatransfer.attributes.FeedbackQuestionAttributes", "courseId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.createFeedbackQuestion] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackQuestionsDb.getFeedbackQuestionsForSession(FeedbackQuestionsDb.java:60)
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForSession(FeedbackQuestionsLogic.java:114)
            teammates.logic.core.FeedbackQuestionsLogic.createFeedbackQuestion(FeedbackQuestionsLogic.java:78) */
        feedbackQuestionsLogic.createFeedbackQuestion(fqa);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackQuestion(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#getFeedbackQuestion(String)}
     */
    @Test
    @DisplayName("getFeedbackQuestion: feedbackQuestionId = blank string -> throw NullPointerException")
    public void testGetFeedbackQuestionThrowsNPEWithBlankString() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestion] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestion(FeedbackQuestionsLogic.java:93) */
        feedbackQuestionsLogic.getFeedbackQuestion("   ");
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method getFeedbackQuestion(java.lang.String)

    @Test
    public void testGetFeedbackQuestion1() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
        String feedbackQuestionId = "";

        FeedbackQuestionAttributes actual = feedbackQuestionsLogic.getFeedbackQuestion(feedbackQuestionId);

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackQuestion(java.lang.String, java.lang.String, int)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#getFeedbackQuestion(String, String, int)}
     */
    @Test
    @DisplayName("getFeedbackQuestion: feedbackSessionName has special characters, courseId = empty string, questionNumber > 0 -> throw NullPointerException")
    public void testGetFeedbackQuestionThrowsNPEWithBlankStringAndEmptyString() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestion] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestion(FeedbackQuestionsLogic.java:103) */
        feedbackQuestionsLogic.getFeedbackQuestion("\n\t\r", "", 1);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackQuestion(java.lang.String, java.lang.String, int)

    @Test
    public void testGetFeedbackQuestion2() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
        String feedbackSessionName = "";
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestion] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackQuestionsDb.getFeedbackQuestion(FeedbackQuestionsDb.java:50)
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestion(FeedbackQuestionsLogic.java:103) */
        feedbackQuestionsLogic.getFeedbackQuestion(feedbackSessionName, null, 0);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForSession

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackQuestionsForSession(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#getFeedbackQuestionsForSession(String, String)}
     */
    @Test
    @DisplayName("getFeedbackQuestionsForSession: feedbackSessionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testGetFeedbackQuestionsForSessionThrowsNPEWithBlankStrings() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForSession(FeedbackQuestionsLogic.java:114) */
        feedbackQuestionsLogic.getFeedbackQuestionsForSession("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getFeedbackQuestionsForSession(java.lang.String, java.lang.String)

    @Test
    public void testGetFeedbackQuestionsForSession1() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
        String feedbackSessionName = "";
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForSession] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.FeedbackQuestionsDb.load(FeedbackQuestionsDb.java:230)
            teammates.storage.api.FeedbackQuestionsDb.getFeedbackQuestionEntitiesForSession(FeedbackQuestionsDb.java:202)
            teammates.storage.api.FeedbackQuestionsDb.getFeedbackQuestionsForSession(FeedbackQuestionsDb.java:63)
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForSession(FeedbackQuestionsLogic.java:114) */
        feedbackQuestionsLogic.getFeedbackQuestionsForSession(feedbackSessionName, feedbackSessionName);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackQuestionsForSession(java.lang.String, java.lang.String)

    @Test
    public void testGetFeedbackQuestionsForSession2() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
        String feedbackSessionName = "";
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForSession] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackQuestionsDb.getFeedbackQuestionsForSession(FeedbackQuestionsDb.java:61)
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForSession(FeedbackQuestionsLogic.java:114) */
        feedbackQuestionsLogic.getFeedbackQuestionsForSession(feedbackSessionName, null);
    }

    @Test
    public void testGetFeedbackQuestionsForSession3() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForSession] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackQuestionsDb.getFeedbackQuestionsForSession(FeedbackQuestionsDb.java:60)
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForSession(FeedbackQuestionsLogic.java:114) */
        feedbackQuestionsLogic.getFeedbackQuestionsForSession(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.hasFeedbackQuestionsForInstructors

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasFeedbackQuestionsForInstructors(teammates.common.datatransfer.attributes.FeedbackSessionAttributes, boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#hasFeedbackQuestionsForInstructors(FeedbackSessionAttributes, boolean)}
     * @utbot.invokes {@link FeedbackSessionAttributes#getFeedbackSessionName()}
     * @utbot.throwsException {@link NullPointerException} in: fsa.getFeedbackSessionName()
     */
    @Test
    @DisplayName("hasFeedbackQuestionsForInstructors: fsa.getFeedbackSessionName() : True -> ThrowNullPointerException")
    public void testHasFeedbackQuestionsForInstructors_FeedbackSessionAttributesGetFeedbackSessionName() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.hasFeedbackQuestionsForInstructors] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.hasFeedbackQuestionsForInstructors(FeedbackQuestionsLogic.java:149) */
        feedbackQuestionsLogic.hasFeedbackQuestionsForInstructors(null, false);
    }

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#hasFeedbackQuestionsForInstructors(FeedbackSessionAttributes, boolean)}
     * @utbot.invokes {@link FeedbackSessionAttributes#getFeedbackSessionName()}
     * @utbot.invokes {@link FeedbackSessionAttributes#getCourseId()}
     * @utbot.invokes {@link FeedbackQuestionsDb#hasFeedbackQuestionsForGiverType(String, String, FeedbackParticipantType)}
     * @utbot.throwsException {@link NullPointerException} in: boolean hasQuestions = fqDb.hasFeedbackQuestionsForGiverType(fsa.getFeedbackSessionName(), fsa.getCourseId(), FeedbackParticipantType.INSTRUCTORS);
     */
    @Test
    @DisplayName("hasFeedbackQuestionsForInstructors: hasQuestions = fqDb.hasFeedbackQuestionsForGiverType(fsa.getFeedbackSessionName(), fsa.getCourseId(), FeedbackParticipantType.INSTRUCTORS) : True -> ThrowNullPointerException")
    public void testHasFeedbackQuestionsForInstructors_FeedbackSessionAttributesGetCourseId() throws Exception {
        FeedbackParticipantType prevINSTRUCTORS = FeedbackParticipantType.INSTRUCTORS;
        try {
            FeedbackParticipantType instructors = FeedbackParticipantType.INSTRUCTORS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "INSTRUCTORS", instructors);
            FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
            setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", null);
            FeedbackSessionAttributes fsa = ((FeedbackSessionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackSessionAttributes"));
            setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "feedbackSessionName", null);
            setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "courseId", null);
            
            /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.hasFeedbackQuestionsForInstructors] produces [java.lang.NullPointerException]
                teammates.logic.core.FeedbackQuestionsLogic.hasFeedbackQuestionsForInstructors(FeedbackQuestionsLogic.java:148) */
            feedbackQuestionsLogic.hasFeedbackQuestionsForInstructors(fsa, false);
        } finally {
            setStaticField(FeedbackParticipantType.class, "INSTRUCTORS", prevINSTRUCTORS);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForInstructors

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackQuestionsForInstructors(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#getFeedbackQuestionsForInstructors(String, String, String)}
     */
    @Test
    @DisplayName("getFeedbackQuestionsForInstructors: feedbackSessionName has special characters, courseId = blank string, userEmail != empty string -> throw NullPointerException")
    public void testGetFeedbackQuestionsForInstructorsThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForInstructors] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForInstructors(FeedbackQuestionsLogic.java:170) */
        feedbackQuestionsLogic.getFeedbackQuestionsForInstructors("\n\t\r", "   ", "string");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForInstructors

    ///region

    @Test
    public void testGetFeedbackQuestionsForInstructors1() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        List allQuestions = emptyList();

        ArrayList actual = ((ArrayList) feedbackQuestionsLogic.getFeedbackQuestionsForInstructors(allQuestions, false));

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }

    @Test
    public void testGetFeedbackQuestionsForInstructors2() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForInstructors] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForInstructors(FeedbackQuestionsLogic.java:192) */
        feedbackQuestionsLogic.getFeedbackQuestionsForInstructors(null, false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.hasFeedbackQuestionsForStudents

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasFeedbackQuestionsForStudents(teammates.common.datatransfer.attributes.FeedbackSessionAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#hasFeedbackQuestionsForStudents(FeedbackSessionAttributes)}
     * @utbot.invokes {@link FeedbackSessionAttributes#getFeedbackSessionName()}
     * @utbot.throwsException {@link NullPointerException} in: fsa.getFeedbackSessionName()
     */
    @Test
    @DisplayName("hasFeedbackQuestionsForStudents: fsa.getFeedbackSessionName() : True -> ThrowNullPointerException")
    public void testHasFeedbackQuestionsForStudents_FeedbackSessionAttributesGetFeedbackSessionName() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.hasFeedbackQuestionsForStudents] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.hasFeedbackQuestionsForStudents(FeedbackQuestionsLogic.java:207) */
        feedbackQuestionsLogic.hasFeedbackQuestionsForStudents(null);
    }

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#hasFeedbackQuestionsForStudents(FeedbackSessionAttributes)}
     * @utbot.invokes {@link FeedbackSessionAttributes#getFeedbackSessionName()}
     * @utbot.invokes {@link FeedbackSessionAttributes#getCourseId()}
     * @utbot.invokes {@link FeedbackQuestionsDb#hasFeedbackQuestionsForGiverType(String, String, FeedbackParticipantType)}
     * @utbot.throwsException {@link NullPointerException} in: return fqDb.hasFeedbackQuestionsForGiverType(fsa.getFeedbackSessionName(), fsa.getCourseId(), FeedbackParticipantType.STUDENTS) || fqDb.hasFeedbackQuestionsForGiverType(fsa.getFeedbackSessionName(), fsa.getCourseId(), FeedbackParticipantType.TEAMS);
     */
    @Test
    @DisplayName("hasFeedbackQuestionsForStudents: return fqDb.hasFeedbackQuestionsForGiverType(fsa.getFeedbackSessionName(), fsa.getCourseId(), FeedbackParticipantType.STUDENTS) || fqDb.hasFeedbackQuestionsForGiverType(fsa.getFeedbackSessionName(), fsa.getCourseId(), FeedbackParticipantType.TEAMS) : True -> ThrowNullPointerException")
    public void testHasFeedbackQuestionsForStudents_FeedbackSessionAttributesGetCourseId() throws Exception {
        FeedbackParticipantType prevSTUDENTS = FeedbackParticipantType.STUDENTS;
        try {
            FeedbackParticipantType students = FeedbackParticipantType.STUDENTS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "STUDENTS", students);
            FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
            setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", null);
            FeedbackSessionAttributes fsa = ((FeedbackSessionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackSessionAttributes"));
            setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "feedbackSessionName", null);
            setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "courseId", null);
            
            /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.hasFeedbackQuestionsForStudents] produces [java.lang.NullPointerException]
                teammates.logic.core.FeedbackQuestionsLogic.hasFeedbackQuestionsForStudents(FeedbackQuestionsLogic.java:206) */
            feedbackQuestionsLogic.hasFeedbackQuestionsForStudents(fsa);
        } finally {
            setStaticField(FeedbackParticipantType.class, "STUDENTS", prevSTUDENTS);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForStudents

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackQuestionsForStudents(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#getFeedbackQuestionsForStudents(String, String)}
     */
    @Test
    @DisplayName("getFeedbackQuestionsForStudents: feedbackSessionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testGetFeedbackQuestionsForStudentsThrowsNPEWithBlankStrings() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForStudents] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForStudents(FeedbackQuestionsLogic.java:220) */
        feedbackQuestionsLogic.getFeedbackQuestionsForStudents("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackQuestionsForStudents(java.lang.String, java.lang.String)

    @Test
    public void testGetFeedbackQuestionsForStudents1() throws Exception {
        FeedbackParticipantType prevSTUDENTS = FeedbackParticipantType.STUDENTS;
        try {
            FeedbackParticipantType students = FeedbackParticipantType.STUDENTS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "STUDENTS", students);
            FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
            FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
            setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
            
            /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForStudents] produces [java.lang.AssertionError]
                teammates.storage.api.FeedbackQuestionsDb.getFeedbackQuestionsForGiverType(FeedbackQuestionsDb.java:71)
                teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForStudents(FeedbackQuestionsLogic.java:220) */
            feedbackQuestionsLogic.getFeedbackQuestionsForStudents(null, null);
        } finally {
            setStaticField(FeedbackParticipantType.class, "STUDENTS", prevSTUDENTS);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForStudents

    ///region

    @Test
    public void testGetFeedbackQuestionsForStudents2() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        List allQuestions = emptyList();

        ArrayList actual = ((ArrayList) feedbackQuestionsLogic.getFeedbackQuestionsForStudents(allQuestions));

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }

    @Test
    public void testGetFeedbackQuestionsForStudents3() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForStudents] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestionsForStudents(FeedbackQuestionsLogic.java:239) */
        feedbackQuestionsLogic.getFeedbackQuestionsForStudents(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.sessionHasQuestions

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sessionHasQuestions(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#sessionHasQuestions(String, String)}
     */
    @Test
    @DisplayName("sessionHasQuestions: feedbackSessionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testSessionHasQuestionsThrowsNPEWithBlankStrings() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.sessionHasQuestions] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.sessionHasQuestions(FeedbackQuestionsLogic.java:253) */
        feedbackQuestionsLogic.sessionHasQuestions("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sessionHasQuestions(java.lang.String, java.lang.String)

    @Test
    public void testSessionHasQuestions1() throws Exception {
        FeedbackParticipantType prevSTUDENTS = FeedbackParticipantType.STUDENTS;
        try {
            FeedbackParticipantType students = FeedbackParticipantType.STUDENTS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "STUDENTS", students);
            FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
            FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
            setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
            
            /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.sessionHasQuestions] produces [java.lang.AssertionError]
                teammates.storage.api.FeedbackQuestionsDb.hasFeedbackQuestionsForGiverType(FeedbackQuestionsDb.java:83)
                teammates.logic.core.FeedbackQuestionsLogic.sessionHasQuestions(FeedbackQuestionsLogic.java:253) */
            feedbackQuestionsLogic.sessionHasQuestions(null, null);
        } finally {
            setStaticField(FeedbackParticipantType.class, "STUDENTS", prevSTUDENTS);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.sessionHasQuestionsForGiverType

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sessionHasQuestionsForGiverType(java.lang.String, java.lang.String, teammates.common.datatransfer.FeedbackParticipantType)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#sessionHasQuestionsForGiverType(String, String, FeedbackParticipantType)}
     */
    @Test
    @DisplayName("sessionHasQuestionsForGiverType: feedbackSessionName has special characters, courseId != empty string, giverType = STUDENTS_IN_SAME_SECTION -> throw NullPointerException")
    public void testSessionHasQuestionsForGiverTypeThrowsNPEWithBlankStringAndNonEmptyString() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackParticipantType giverType = FeedbackParticipantType.STUDENTS_IN_SAME_SECTION;
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.sessionHasQuestionsForGiverType] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.sessionHasQuestionsForGiverType(FeedbackQuestionsLogic.java:262) */
        feedbackQuestionsLogic.sessionHasQuestionsForGiverType("\n\t\r", "string", giverType);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.getRecipientsOfQuestion

    ///region OTHER: ERROR SUITE for method getRecipientsOfQuestion(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes, teammates.common.datatransfer.attributes.InstructorAttributes, teammates.common.datatransfer.attributes.StudentAttributes, teammates.common.datatransfer.CourseRoster)

    @Test
    public void testGetRecipientsOfQuestion1() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionAttributes question = ((FeedbackQuestionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackQuestionAttributes"));
        StudentAttributes studentGiver = ((StudentAttributes) createInstance("teammates.common.datatransfer.attributes.StudentAttributes"));
        CourseRoster courseRoster = ((CourseRoster) createInstance("teammates.common.datatransfer.CourseRoster"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.getRecipientsOfQuestion] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getRecipientsOfQuestion(FeedbackQuestionsLogic.java:301) */
        feedbackQuestionsLogic.getRecipientsOfQuestion(question, null, studentGiver, courseRoster);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.buildCompleteGiverRecipientMap

    ///region

    @Test
    public void testBuildCompleteGiverRecipientMap1() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.buildCompleteGiverRecipientMap] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getPossibleGivers(FeedbackQuestionsLogic.java:503)
            teammates.logic.core.FeedbackQuestionsLogic.buildCompleteGiverRecipientMap(FeedbackQuestionsLogic.java:450) */
        feedbackQuestionsLogic.buildCompleteGiverRecipientMap(null, null);
    }

    @Test
    public void testBuildCompleteGiverRecipientMap2() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionAttributes relatedQuestion = ((FeedbackQuestionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackQuestionAttributes"));
        setField(relatedQuestion, "teammates.common.datatransfer.attributes.FeedbackQuestionAttributes", "giverType", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.buildCompleteGiverRecipientMap] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getPossibleGivers(FeedbackQuestionsLogic.java:506)
            teammates.logic.core.FeedbackQuestionsLogic.buildCompleteGiverRecipientMap(FeedbackQuestionsLogic.java:450) */
        feedbackQuestionsLogic.buildCompleteGiverRecipientMap(relatedQuestion, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.populateFieldsToGenerateInQuestion

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method populateFieldsToGenerateInQuestion(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#populateFieldsToGenerateInQuestion(FeedbackQuestionAttributes, String, String)}
     * @utbot.invokes {@link FeedbackQuestionAttributes#getQuestionType()}
     * @utbot.throwsException {@link NullPointerException} in: feedbackQuestionAttributes.getQuestionType() == FeedbackQuestionType.MCQ
     */
    @Test
    @DisplayName("populateFieldsToGenerateInQuestion: feedbackQuestionAttributes.getQuestionType() == FeedbackQuestionType.MCQ -> ThrowNullPointerException")
    public void testPopulateFieldsToGenerateInQuestion_FeedbackQuestionAttributesGetQuestionType() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.populateFieldsToGenerateInQuestion] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.populateFieldsToGenerateInQuestion(FeedbackQuestionsLogic.java:551) */
        feedbackQuestionsLogic.populateFieldsToGenerateInQuestion(null, null, null);
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method populateFieldsToGenerateInQuestion(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes, java.lang.String, java.lang.String)

    @Test
    public void testPopulateFieldsToGenerateInQuestion1() throws Exception {
        FeedbackQuestionType prevMCQ = FeedbackQuestionType.MCQ;
        try {
            FeedbackQuestionType mcq = FeedbackQuestionType.MCQ;
            Class feedbackQuestionTypeClazz = Class.forName("teammates.common.datatransfer.questions.FeedbackQuestionType");
            setStaticField(feedbackQuestionTypeClazz, "MCQ", mcq);
            FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
            FeedbackQuestionAttributes feedbackQuestionAttributes = ((FeedbackQuestionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackQuestionAttributes"));
            FeedbackConstantSumQuestionDetails feedbackConstantSumQuestionDetails = ((FeedbackConstantSumQuestionDetails) createInstance("teammates.common.datatransfer.questions.FeedbackConstantSumQuestionDetails"));
            setField(feedbackConstantSumQuestionDetails, "teammates.common.datatransfer.questions.FeedbackQuestionDetails", "questionType", null);
            setField(feedbackQuestionAttributes, "teammates.common.datatransfer.attributes.FeedbackQuestionAttributes", "questionDetails", feedbackConstantSumQuestionDetails);
            String emailOfEntityDoingQuestion = "";
            String teamOfEntityDoingQuestion = "";

            feedbackQuestionsLogic.populateFieldsToGenerateInQuestion(feedbackQuestionAttributes, emailOfEntityDoingQuestion, teamOfEntityDoingQuestion);
        } finally {
            setStaticField(FeedbackQuestionType.class, "MCQ", prevMCQ);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.deleteFeedbackQuestionCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteFeedbackQuestionCascade(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#deleteFeedbackQuestionCascade(String)}
     */
    @Test
    @DisplayName("deleteFeedbackQuestionCascade: feedbackQuestionId = blank string -> throw NullPointerException")
    public void testDeleteFeedbackQuestionCascadeThrowsNPEWithBlankString() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.deleteFeedbackQuestionCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.getFeedbackQuestion(FeedbackQuestionsLogic.java:93)
            teammates.logic.core.FeedbackQuestionsLogic.deleteFeedbackQuestionCascade(FeedbackQuestionsLogic.java:746) */
        feedbackQuestionsLogic.deleteFeedbackQuestionCascade("   ");
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method deleteFeedbackQuestionCascade(java.lang.String)

    @Test
    public void testDeleteFeedbackQuestionCascade1() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", feedbackQuestionsDb);
        String feedbackQuestionId = "";

        feedbackQuestionsLogic.deleteFeedbackQuestionCascade(feedbackQuestionId);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackQuestionsLogic.deleteFeedbackQuestions

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteFeedbackQuestions(teammates.common.datatransfer.AttributesDeletionQuery)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestionsLogic}
     * @utbot.methodUnderTest {@link FeedbackQuestionsLogic#deleteFeedbackQuestions(AttributesDeletionQuery)}
     * @utbot.invokes {@link FeedbackQuestionsDb#deleteFeedbackQuestions(AttributesDeletionQuery)}
     * @utbot.throwsException {@link NullPointerException} in: fqDb.deleteFeedbackQuestions(query);
     */
    @Test
    @DisplayName("deleteFeedbackQuestions: fqDb.deleteFeedbackQuestions(query) : True -> ThrowNullPointerException")
    public void testDeleteFeedbackQuestions_FeedbackQuestionsDbDeleteFeedbackQuestions() throws Exception {
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        setField(feedbackQuestionsLogic, "teammates.logic.core.FeedbackQuestionsLogic", "fqDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackQuestionsLogic.deleteFeedbackQuestions] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.deleteFeedbackQuestions(FeedbackQuestionsLogic.java:771) */
        feedbackQuestionsLogic.deleteFeedbackQuestions(null);
    }
    ///endregion

    ///endregion
}
