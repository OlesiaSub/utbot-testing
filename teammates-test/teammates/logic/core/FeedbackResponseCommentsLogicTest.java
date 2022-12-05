package teammates.logic.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.CourseRoster;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.storage.api.FeedbackResponseCommentsDb;
import teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes.UpdateOptions;
import teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes;
import teammates.storage.api.CoursesDb;

import java.time.Instant;
import java.util.List;
import java.util.Set;

import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public final class FeedbackResponseCommentsLogicTest {
    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseComment

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateFeedbackResponseComment(teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#updateFeedbackResponseComment(UpdateOptions)}
     * @utbot.invokes {@link FeedbackResponseCommentsDb#updateFeedbackResponseComment(UpdateOptions)}
     * @utbot.throwsException {@link NullPointerException} in: return frcDb.updateFeedbackResponseComment(updateOptions);
     */
    @Test
    @DisplayName("updateFeedbackResponseComment: return frcDb.updateFeedbackResponseComment(updateOptions) : True -> ThrowNullPointerException")
    public void testUpdateFeedbackResponseComment_FeedbackResponseCommentsDbUpdateFeedbackResponseComment() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseComment] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseComment(FeedbackResponseCommentsLogic.java:178) */
        feedbackResponseCommentsLogic.updateFeedbackResponseComment(null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method updateFeedbackResponseComment(teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes.UpdateOptions)

    @Test
    public void testUpdateFeedbackResponseComment1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes$UpdateOptions"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseComment] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.FeedbackResponseCommentsDb.load(FeedbackResponseCommentsDb.java:390)
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentEntity(FeedbackResponseCommentsDb.java:273)
            teammates.storage.api.FeedbackResponseCommentsDb.updateFeedbackResponseComment(FeedbackResponseCommentsDb.java:152)
            teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseComment(FeedbackResponseCommentsLogic.java:178) */
        feedbackResponseCommentsLogic.updateFeedbackResponseComment(updateOptions);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.inst

    ///region OTHER: SUCCESSFUL EXECUTIONS for method inst()

    @Test
    public void testInst1() throws Exception {
        FeedbackResponseCommentsLogic actual = FeedbackResponseCommentsLogic.inst();

        FeedbackResponseCommentsLogic expected = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(expected, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        setField(expected, "teammates.logic.core.FeedbackResponseCommentsLogic", "coursesLogic", null);
        setField(expected, "teammates.logic.core.FeedbackResponseCommentsLogic", "frLogic", null);
        setField(expected, "teammates.logic.core.FeedbackResponseCommentsLogic", "fsLogic", null);
        setField(expected, "teammates.logic.core.FeedbackResponseCommentsLogic", "instructorsLogic", null);
        setField(expected, "teammates.logic.core.FeedbackResponseCommentsLogic", "studentsLogic", null);
        FeedbackResponseCommentsDb expectedFrcDb = ((FeedbackResponseCommentsDb) getFieldValue(expected, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb"));
        FeedbackResponseCommentsDb actualFrcDb = ((FeedbackResponseCommentsDb) getFieldValue(actual, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb"));

        CoursesLogic actualCoursesLogic = ((CoursesLogic) getFieldValue(actual, "teammates.logic.core.FeedbackResponseCommentsLogic", "coursesLogic"));
        assertNull(actualCoursesLogic);

        FeedbackResponsesLogic actualFrLogic = ((FeedbackResponsesLogic) getFieldValue(actual, "teammates.logic.core.FeedbackResponseCommentsLogic", "frLogic"));
        assertNull(actualFrLogic);

        FeedbackSessionsLogic actualFsLogic = ((FeedbackSessionsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackResponseCommentsLogic", "fsLogic"));
        assertNull(actualFsLogic);

        InstructorsLogic actualInstructorsLogic = ((InstructorsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackResponseCommentsLogic", "instructorsLogic"));
        assertNull(actualInstructorsLogic);

        StudentsLogic actualStudentsLogic = ((StudentsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackResponseCommentsLogic", "studentsLogic"));
        assertNull(actualStudentsLogic);

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.createFeedbackResponseComment

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFeedbackResponseComment(teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#createFeedbackResponseComment(FeedbackResponseCommentAttributes)}
     * @utbot.invokes {@link FeedbackResponseCommentAttributes#getCourseId()}
     * @utbot.throwsException {@link NullPointerException} in: verifyIsCoursePresent(frComment.getCourseId());
     */
    @Test
    @DisplayName("createFeedbackResponseComment: verifyIsCoursePresent(frComment.getCourseId()) : True -> ThrowNullPointerException")
    public void testCreateFeedbackResponseComment_FeedbackResponseCommentAttributesGetCourseId() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.createFeedbackResponseComment] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.createFeedbackResponseComment(FeedbackResponseCommentsLogic.java:65) */
        feedbackResponseCommentsLogic.createFeedbackResponseComment(null);
    }

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#createFeedbackResponseComment(FeedbackResponseCommentAttributes)}
     * @utbot.invokes {@link FeedbackResponseCommentAttributes#getCourseId()}
     * @utbot.invokes teammates.logic.core.FeedbackResponseCommentsLogic#verifyIsCoursePresent(java.lang.String)
     * @utbot.throwsException {@link NullPointerException} in: verifyIsCoursePresent(frComment.getCourseId());
     */
    @Test
    @DisplayName("createFeedbackResponseComment: verifyIsCoursePresent(frComment.getCourseId()) : True -> ThrowNullPointerException")
    public void testCreateFeedbackResponseComment_FeedbackResponseCommentsLogicVerifyIsCoursePresent() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "coursesLogic", null);
        FeedbackResponseCommentAttributes frComment = ((FeedbackResponseCommentAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes"));
        setField(frComment, "teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes", "courseId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.createFeedbackResponseComment] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.verifyIsCoursePresent(FeedbackResponseCommentsLogic.java:366)
            teammates.logic.core.FeedbackResponseCommentsLogic.createFeedbackResponseComment(FeedbackResponseCommentsLogic.java:65) */
        feedbackResponseCommentsLogic.createFeedbackResponseComment(frComment);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createFeedbackResponseComment(teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes)

    @Test
    public void testCreateFeedbackResponseComment1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        CoursesDb coursesDb = ((CoursesDb) createInstance("teammates.storage.api.CoursesDb"));
        setField(coursesLogic, "teammates.logic.core.CoursesLogic", "coursesDb", coursesDb);
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "coursesLogic", coursesLogic);
        FeedbackResponseCommentAttributes frComment = ((FeedbackResponseCommentAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes"));
        setField(frComment, "teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes", "courseId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.createFeedbackResponseComment] produces [java.lang.AssertionError]
            teammates.storage.api.CoursesDb.getCourse(CoursesDb.java:39)
            teammates.logic.core.CoursesLogic.isCoursePresent(CoursesLogic.java:140)
            teammates.logic.core.FeedbackResponseCommentsLogic.verifyIsCoursePresent(FeedbackResponseCommentsLogic.java:366)
            teammates.logic.core.FeedbackResponseCommentsLogic.createFeedbackResponseComment(FeedbackResponseCommentsLogic.java:65) */
        feedbackResponseCommentsLogic.createFeedbackResponseComment(frComment);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseComment

    ///region

    @Test
    public void testGetFeedbackResponseComment1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseComment] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseComment(FeedbackResponseCommentsLogic.java:77) */
        feedbackResponseCommentsLogic.getFeedbackResponseComment(0L);
    }

    @Test
    public void testGetFeedbackResponseComment2() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseComment] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseComment(FeedbackResponseCommentsLogic.java:77) */
        feedbackResponseCommentsLogic.getFeedbackResponseComment(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseComment

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFeedbackResponseComment(java.lang.String, java.lang.String, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#getFeedbackResponseComment(String, String, Instant)}
     * @utbot.invokes {@link FeedbackResponseCommentsDb#getFeedbackResponseComment(String, String, Instant)}
     * @utbot.throwsException {@link NullPointerException} in: return frcDb.getFeedbackResponseComment(responseId, giverEmail, creationDate);
     */
    @Test
    @DisplayName("getFeedbackResponseComment: return frcDb.getFeedbackResponseComment(responseId, giverEmail, creationDate) : True -> ThrowNullPointerException")
    public void testGetFeedbackResponseComment_FeedbackResponseCommentsDbGetFeedbackResponseComment() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseComment] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseComment(FeedbackResponseCommentsLogic.java:87) */
        feedbackResponseCommentsLogic.getFeedbackResponseComment(null, null, null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackResponseComment(java.lang.String, java.lang.String, java.time.Instant)

    @Test
    public void testGetFeedbackResponseComment3() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        String responseId = "";
        Instant creationDate = ((Instant) createInstance("java.time.Instant"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseComment] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseComment(FeedbackResponseCommentsDb.java:59)
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseComment(FeedbackResponseCommentsLogic.java:87) */
        feedbackResponseCommentsLogic.getFeedbackResponseComment(responseId, null, creationDate);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponseCommentForResponse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#getFeedbackResponseCommentForResponse(String)}
     */
    @Test
    @DisplayName("getFeedbackResponseCommentForResponse: feedbackResponseId = blank string -> throw NullPointerException")
    public void testGetFeedbackResponseCommentForResponseThrowsNPEWithBlankString() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponse(FeedbackResponseCommentsLogic.java:94) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentForResponse("   ");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getFeedbackResponseCommentForResponse(java.lang.String)

    @Test
    public void testGetFeedbackResponseCommentForResponse1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        String feedbackResponseId = "";
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponse] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.FeedbackResponseCommentsDb.load(FeedbackResponseCommentsDb.java:390)
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentsForResponseQuery(FeedbackResponseCommentsDb.java:305)
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentEntitiesForResponse(FeedbackResponseCommentsDb.java:318)
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentsForResponse(FeedbackResponseCommentsDb.java:81)
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponse(FeedbackResponseCommentsLogic.java:94) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentForResponse(feedbackResponseId);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponseFromParticipant

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponseCommentForResponseFromParticipant(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#getFeedbackResponseCommentForResponseFromParticipant(String)}
     */
    @Test
    @DisplayName("getFeedbackResponseCommentForResponseFromParticipant: feedbackResponseId = blank string -> throw NullPointerException")
    public void testGetFeedbackResponseCommentForResponseFromParticipantThrowsNPEWithBlankString() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponseFromParticipant] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponseFromParticipant(FeedbackResponseCommentsLogic.java:106) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentForResponseFromParticipant("   ");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getFeedbackResponseCommentForResponseFromParticipant(java.lang.String)

    @Test
    public void testGetFeedbackResponseCommentForResponseFromParticipant1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        String feedbackResponseId = "";
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponseFromParticipant] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.FeedbackResponseCommentsDb.load(FeedbackResponseCommentsDb.java:390)
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentEntitiesForResponseFromParticipant(FeedbackResponseCommentsDb.java:310)
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentForResponseFromParticipant(FeedbackResponseCommentsDb.java:94)
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponseFromParticipant(FeedbackResponseCommentsLogic.java:106) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentForResponseFromParticipant(feedbackResponseId);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForSessionInSection

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFeedbackResponseCommentForSessionInSection(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#getFeedbackResponseCommentForSessionInSection(String, String, String)}
     * @utbot.executesCondition {@code (section == null): True}
     * @utbot.invokes {@link FeedbackResponseCommentsDb#getFeedbackResponseCommentsForSession(String, String)}
     * @utbot.throwsException {@link NullPointerException} in: return frcDb.getFeedbackResponseCommentsForSession(courseId, feedbackSessionName);
     */
    @Test
    @DisplayName("getFeedbackResponseCommentForSessionInSection: return frcDb.getFeedbackResponseCommentsForSession(courseId, feedbackSessionName) : True -> ThrowNullPointerException")
    public void testGetFeedbackResponseCommentForSessionInSection_SectionEqualsNull() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForSessionInSection] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForSessionInSection(FeedbackResponseCommentsLogic.java:120) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentForSessionInSection(null, null, null);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponseCommentForSessionInSection(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#getFeedbackResponseCommentForSessionInSection(String, String, String)}
     */
    @Test
    @DisplayName("getFeedbackResponseCommentForSessionInSection: courseId has special characters, feedbackSessionName = blank string, section != empty string -> throw NullPointerException")
    public void testGetFeedbackResponseCommentForSessionInSectionThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForSessionInSection] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForSessionInSection(FeedbackResponseCommentsLogic.java:122) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentForSessionInSection("\n\t\r", "   ", "string");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackResponseCommentForSessionInSection(java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testGetFeedbackResponseCommentForSessionInSection1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForSessionInSection] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentsForSession(FeedbackResponseCommentsDb.java:102)
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForSessionInSection(FeedbackResponseCommentsLogic.java:120) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentForSessionInSection(null, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForQuestionInSection

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFeedbackResponseCommentForQuestionInSection(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#getFeedbackResponseCommentForQuestionInSection(String, String)}
     * @utbot.executesCondition {@code (section == null): True}
     * @utbot.invokes {@link FeedbackResponseCommentsDb#getFeedbackResponseCommentsForQuestion(String)}
     * @utbot.throwsException {@link NullPointerException} in: return frcDb.getFeedbackResponseCommentsForQuestion(questionId);
     */
    @Test
    @DisplayName("getFeedbackResponseCommentForQuestionInSection: return frcDb.getFeedbackResponseCommentsForQuestion(questionId) : True -> ThrowNullPointerException")
    public void testGetFeedbackResponseCommentForQuestionInSection_SectionEqualsNull() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForQuestionInSection] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForQuestionInSection(FeedbackResponseCommentsLogic.java:135) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentForQuestionInSection(null, null);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponseCommentForQuestionInSection(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#getFeedbackResponseCommentForQuestionInSection(String, String)}
     */
    @Test
    @DisplayName("getFeedbackResponseCommentForQuestionInSection: questionId has special characters, section = blank string -> throw NullPointerException")
    public void testGetFeedbackResponseCommentForQuestionInSectionThrowsNPEWithBlankStrings() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForQuestionInSection] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForQuestionInSection(FeedbackResponseCommentsLogic.java:137) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentForQuestionInSection("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackResponseCommentForQuestionInSection(java.lang.String, java.lang.String)

    @Test
    public void testGetFeedbackResponseCommentForQuestionInSection1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        String section = "";
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForQuestionInSection] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentsForQuestionInSection(FeedbackResponseCommentsDb.java:134)
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForQuestionInSection(FeedbackResponseCommentsLogic.java:137) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentForQuestionInSection(null, section);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseCommentsEmails

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method updateFeedbackResponseCommentsEmails(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#updateFeedbackResponseCommentsEmails(String, String, String)}
     */
    @Test
    @DisplayName("updateFeedbackResponseCommentsEmails: courseId has special characters, oldEmail = blank string, updatedEmail != empty string -> throw NullPointerException")
    public void testUpdateFeedbackResponseCommentsEmailsThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseCommentsEmails] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseCommentsEmails(FeedbackResponseCommentsLogic.java:144) */
        feedbackResponseCommentsLogic.updateFeedbackResponseCommentsEmails("\n\t\r", "   ", "string");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateFeedbackResponseCommentsEmails(java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testUpdateFeedbackResponseCommentsEmails1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        String courseId = "";
        String updatedEmail = "";
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseCommentsEmails] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponseCommentsDb.updateGiverEmailOfFeedbackResponseComments(FeedbackResponseCommentsDb.java:201)
            teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseCommentsEmails(FeedbackResponseCommentsLogic.java:144) */
        feedbackResponseCommentsLogic.updateFeedbackResponseCommentsEmails(courseId, null, updatedEmail);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseCommentsForResponse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method updateFeedbackResponseCommentsForResponse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#updateFeedbackResponseCommentsForResponse(String)}
     */
    @Test
    @DisplayName("updateFeedbackResponseCommentsForResponse: feedbackResponseId = blank string -> throw NullPointerException")
    public void testUpdateFeedbackResponseCommentsForResponseThrowsNPEWithBlankString() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseCommentsForResponse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponse(FeedbackResponseCommentsLogic.java:94)
            teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseCommentsForResponse(FeedbackResponseCommentsLogic.java:155) */
        feedbackResponseCommentsLogic.updateFeedbackResponseCommentsForResponse("   ");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method updateFeedbackResponseCommentsForResponse(java.lang.String)

    @Test
    public void testUpdateFeedbackResponseCommentsForResponse1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        String feedbackResponseId = "";
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseCommentsForResponse] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.FeedbackResponseCommentsDb.load(FeedbackResponseCommentsDb.java:390)
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentsForResponseQuery(FeedbackResponseCommentsDb.java:305)
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentEntitiesForResponse(FeedbackResponseCommentsDb.java:318)
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentsForResponse(FeedbackResponseCommentsDb.java:81)
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentForResponse(FeedbackResponseCommentsLogic.java:94)
            teammates.logic.core.FeedbackResponseCommentsLogic.updateFeedbackResponseCommentsForResponse(FeedbackResponseCommentsLogic.java:155) */
        feedbackResponseCommentsLogic.updateFeedbackResponseCommentsForResponse(feedbackResponseId);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentsForGiver

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponseCommentsForGiver(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#getFeedbackResponseCommentsForGiver(String, String)}
     */
    @Test
    @DisplayName("getFeedbackResponseCommentsForGiver: courseId has special characters, giverEmail = blank string -> throw NullPointerException")
    public void testGetFeedbackResponseCommentsForGiverThrowsNPEWithBlankStrings() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentsForGiver] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentsForGiver(FeedbackResponseCommentsLogic.java:186) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentsForGiver("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackResponseCommentsForGiver(java.lang.String, java.lang.String)

    @Test
    public void testGetFeedbackResponseCommentsForGiver1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        String courseId = "";
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentsForGiver] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponseCommentsDb.getFeedbackResponseCommentForGiver(FeedbackResponseCommentsDb.java:70)
            teammates.logic.core.FeedbackResponseCommentsLogic.getFeedbackResponseCommentsForGiver(FeedbackResponseCommentsLogic.java:186) */
        feedbackResponseCommentsLogic.getFeedbackResponseCommentsForGiver(courseId, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.deleteFeedbackResponseComment

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteFeedbackResponseComment(long)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#deleteFeedbackResponseComment(long)}
     */
    @Test
    @DisplayName("deleteFeedbackResponseComment: commentId > 0L -> throw NullPointerException")
    public void testDeleteFeedbackResponseCommentThrowsNPE() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.deleteFeedbackResponseComment] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.deleteFeedbackResponseComment(FeedbackResponseCommentsLogic.java:193) */
        feedbackResponseCommentsLogic.deleteFeedbackResponseComment(1L);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method deleteFeedbackResponseComment(long)

    @Test
    public void testDeleteFeedbackResponseComment1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.deleteFeedbackResponseComment] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.Key.newKeyFactory(Key.java:157)
            com.googlecode.objectify.Key.<init>(Key.java:135)
            com.googlecode.objectify.Key.<init>(Key.java:95)
            com.googlecode.objectify.Key.create(Key.java:35)
            teammates.storage.api.FeedbackResponseCommentsDb.deleteFeedbackResponseComment(FeedbackResponseCommentsDb.java:246)
            teammates.logic.core.FeedbackResponseCommentsLogic.deleteFeedbackResponseComment(FeedbackResponseCommentsLogic.java:193) */
        feedbackResponseCommentsLogic.deleteFeedbackResponseComment(0L);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.deleteFeedbackResponseComments

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteFeedbackResponseComments(teammates.common.datatransfer.AttributesDeletionQuery)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#deleteFeedbackResponseComments(AttributesDeletionQuery)}
     * @utbot.invokes {@link FeedbackResponseCommentsDb#deleteFeedbackResponseComments(AttributesDeletionQuery)}
     * @utbot.throwsException {@link NullPointerException} in: frcDb.deleteFeedbackResponseComments(query);
     */
    @Test
    @DisplayName("deleteFeedbackResponseComments: frcDb.deleteFeedbackResponseComments(query) : True -> ThrowNullPointerException")
    public void testDeleteFeedbackResponseComments_FeedbackResponseCommentsDbDeleteFeedbackResponseComments() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.deleteFeedbackResponseComments] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.deleteFeedbackResponseComments(FeedbackResponseCommentsLogic.java:200) */
        feedbackResponseCommentsLogic.deleteFeedbackResponseComments(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteFeedbackResponseComments(teammates.common.datatransfer.AttributesDeletionQuery)

    @Test
    public void testDeleteFeedbackResponseComments1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
        setField(feedbackResponseCommentsLogic, "teammates.logic.core.FeedbackResponseCommentsLogic", "frcDb", feedbackResponseCommentsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.deleteFeedbackResponseComments] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponseCommentsDb.deleteFeedbackResponseComments(FeedbackResponseCommentsDb.java:253)
            teammates.logic.core.FeedbackResponseCommentsLogic.deleteFeedbackResponseComments(FeedbackResponseCommentsLogic.java:200) */
        feedbackResponseCommentsLogic.deleteFeedbackResponseComments(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.isNameVisibleToUser

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNameVisibleToUser(teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes, teammates.common.datatransfer.attributes.FeedbackResponseAttributes, java.lang.String, teammates.common.datatransfer.CourseRoster)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#isNameVisibleToUser(FeedbackResponseCommentAttributes, FeedbackResponseAttributes, String, CourseRoster)}
     * @utbot.executesCondition {@code (showNameTo == null): True}
     * @utbot.invokes {@link FeedbackResponseCommentAttributes#getShowGiverNameTo()}
     */
    @Test
    @DisplayName("isNameVisibleToUser: FeedbackResponseCommentAttributesGetShowGiverNameTo -> return true")
    public void testIsNameVisibleToUser_ShowNameToEqualsNull() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseCommentAttributes comment = ((FeedbackResponseCommentAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes"));
        setField(comment, "teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes", "showGiverNameTo", null);

        boolean actual = feedbackResponseCommentsLogic.isNameVisibleToUser(comment, null, null, null);

        assertTrue(actual);

        List finalCommentShowGiverNameTo = ((List) getFieldValue(comment, "teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes", "showGiverNameTo"));

        assertNull(finalCommentShowGiverNameTo);
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNameVisibleToUser(teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes, teammates.common.datatransfer.attributes.FeedbackResponseAttributes, java.lang.String, teammates.common.datatransfer.CourseRoster)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#isNameVisibleToUser(FeedbackResponseCommentAttributes, FeedbackResponseAttributes, String, CourseRoster)}
     * @utbot.invokes {@link FeedbackResponseCommentAttributes#getShowGiverNameTo()}
     * @utbot.throwsException {@link NullPointerException} in: List<FeedbackParticipantType> showNameTo = comment.getShowGiverNameTo();
     */
    @Test
    @DisplayName("isNameVisibleToUser: showNameTo = comment.getShowGiverNameTo() : True -> ThrowNullPointerException")
    public void testIsNameVisibleToUser_FeedbackResponseCommentAttributesGetShowGiverNameTo() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.isNameVisibleToUser] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.isNameVisibleToUser(FeedbackResponseCommentsLogic.java:208) */
        feedbackResponseCommentsLogic.isNameVisibleToUser(null, null, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponseCommentsLogic.isResponseCommentVisibleForUser

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isResponseCommentVisibleForUser(java.lang.String, boolean, teammates.common.datatransfer.attributes.StudentAttributes, java.util.Set, teammates.common.datatransfer.attributes.FeedbackResponseAttributes, teammates.common.datatransfer.attributes.FeedbackQuestionAttributes, teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#isResponseCommentVisibleForUser(String, boolean, StudentAttributes, Set, FeedbackResponseAttributes, FeedbackQuestionAttributes, FeedbackResponseCommentAttributes)}
     * @utbot.executesCondition {@code (response == null): False}
     * @utbot.executesCondition {@code (relatedQuestion == null): True}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("isResponseCommentVisibleForUser: response == null : True -> return false")
    public void testIsResponseCommentVisibleForUser_RelatedQuestionEqualsNull() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseAttributes response = ((FeedbackResponseAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseAttributes"));

        boolean actual = feedbackResponseCommentsLogic.isResponseCommentVisibleForUser(null, false, null, null, response, null, null);

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link FeedbackResponseCommentsLogic}
     * @utbot.methodUnderTest {@link FeedbackResponseCommentsLogic#isResponseCommentVisibleForUser(String, boolean, StudentAttributes, Set, FeedbackResponseAttributes, FeedbackQuestionAttributes, FeedbackResponseCommentAttributes)}
     * @utbot.executesCondition {@code (response == null): True}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("isResponseCommentVisibleForUser: response == null : False -> return false")
    public void testIsResponseCommentVisibleForUser_ResponseEqualsNull() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));

        boolean actual = feedbackResponseCommentsLogic.isResponseCommentVisibleForUser(null, false, null, null, null, null, null);

        assertFalse(actual);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method isResponseCommentVisibleForUser(java.lang.String, boolean, teammates.common.datatransfer.attributes.StudentAttributes, java.util.Set, teammates.common.datatransfer.attributes.FeedbackResponseAttributes, teammates.common.datatransfer.attributes.FeedbackQuestionAttributes, teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes)

    @Test
    public void testIsResponseCommentVisibleForUser1() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseAttributes response = ((FeedbackResponseAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseAttributes"));
        FeedbackQuestionAttributes relatedQuestion = ((FeedbackQuestionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackQuestionAttributes"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.isResponseCommentVisibleForUser] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponseCommentsLogic.isResponseCommentVisibleForUser(FeedbackResponseCommentsLogic.java:287) */
        feedbackResponseCommentsLogic.isResponseCommentVisibleForUser(null, false, null, null, response, relatedQuestion, null);
    }

    @Test
    public void testIsResponseCommentVisibleForUser2() throws Exception {
        FeedbackResponseCommentsLogic feedbackResponseCommentsLogic = ((FeedbackResponseCommentsLogic) createInstance("teammates.logic.core.FeedbackResponseCommentsLogic"));
        FeedbackResponseAttributes response = ((FeedbackResponseAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseAttributes"));
        FeedbackQuestionAttributes relatedQuestion = ((FeedbackQuestionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackQuestionAttributes"));
        FeedbackResponseCommentAttributes relatedComment = ((FeedbackResponseCommentAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponseCommentsLogic.isResponseCommentVisibleForUser] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes.isVisibleTo(FeedbackResponseCommentAttributes.java:109)
            teammates.logic.core.FeedbackResponseCommentsLogic.isResponseCommentVisibleForUser(FeedbackResponseCommentsLogic.java:289) */
        feedbackResponseCommentsLogic.isResponseCommentVisibleForUser(null, false, null, null, response, relatedQuestion, relatedComment);
    }
    ///endregion

    ///endregion
}
