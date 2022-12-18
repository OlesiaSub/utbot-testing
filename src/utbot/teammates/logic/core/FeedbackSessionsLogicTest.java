package teammates.logic.core;

import com.googlecode.objectify.ObjectifyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes.UpdateOptions;
import teammates.common.datatransfer.attributes.FeedbackSessionAttributes;
import teammates.storage.api.FeedbackSessionsDb;
import com.googlecode.objectify.ObjectifyFactory;

import java.time.Instant;
import java.util.List;
import java.util.ArrayList;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static java.util.Collections.emptyList;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class FeedbackSessionsLogicTest {
    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSession

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateFeedbackSession(teammates.common.datatransfer.attributes.FeedbackSessionAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#updateFeedbackSession(UpdateOptions)}
     * @utbot.invokes {@link UpdateOptions#getCourseId()}
     * @utbot.throwsException {@link NullPointerException} in: fsDb.getFeedbackSession(updateOptions.getCourseId(), updateOptions.getFeedbackSessionName())
     */
    @Test
    @DisplayName("updateFeedbackSession: fsDb.getFeedbackSession(updateOptions.getCourseId(), updateOptions.getFeedbackSessionName()) : True -> ThrowNullPointerException")
    public void testUpdateFeedbackSession_FeedbackSessionAttributesGetCourseId() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSession(FeedbackSessionsLogic.java:271) */
        feedbackSessionsLogic.updateFeedbackSession(null);
    }

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#updateFeedbackSession(UpdateOptions)}
     * @utbot.invokes {@link UpdateOptions#getCourseId()}
     * @utbot.invokes {@link UpdateOptions#getFeedbackSessionName()}
     * @utbot.throwsException {@link NullPointerException} in: fsDb.getFeedbackSession(updateOptions.getCourseId(), updateOptions.getFeedbackSessionName())
     */
    @Test
    @DisplayName("updateFeedbackSession: fsDb.getFeedbackSession(updateOptions.getCourseId(), updateOptions.getFeedbackSessionName()) : True -> ThrowNullPointerException")
    public void testUpdateFeedbackSession_FeedbackSessionAttributesGetFeedbackSessionName() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.FeedbackSessionAttributes$UpdateOptions"));
        setField(updateOptions, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes$UpdateOptions", "courseId", null);
        setField(updateOptions, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes$UpdateOptions", "feedbackSessionName", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSession(FeedbackSessionsLogic.java:271) */
        feedbackSessionsLogic.updateFeedbackSession(updateOptions);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.inst

    ///region OTHER: SUCCESSFUL EXECUTIONS for method inst()

    @Test
    public void testInst1() throws Exception {
        FeedbackSessionsLogic actual = FeedbackSessionsLogic.inst();

        FeedbackSessionsLogic expected = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
        setField(expected, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
        setField(expected, "teammates.logic.core.FeedbackSessionsLogic", "coursesLogic", null);
        setField(expected, "teammates.logic.core.FeedbackSessionsLogic", "fqLogic", null);
        setField(expected, "teammates.logic.core.FeedbackSessionsLogic", "frLogic", null);
        setField(expected, "teammates.logic.core.FeedbackSessionsLogic", "frcLogic", null);
        setField(expected, "teammates.logic.core.FeedbackSessionsLogic", "instructorsLogic", null);
        setField(expected, "teammates.logic.core.FeedbackSessionsLogic", "studentsLogic", null);
        setField(expected, "teammates.logic.core.FeedbackSessionsLogic", "deLogic", null);
        FeedbackSessionsDb expectedFsDb = ((FeedbackSessionsDb) getFieldValue(expected, "teammates.logic.core.FeedbackSessionsLogic", "fsDb"));
        FeedbackSessionsDb actualFsDb = ((FeedbackSessionsDb) getFieldValue(actual, "teammates.logic.core.FeedbackSessionsLogic", "fsDb"));

        CoursesLogic actualCoursesLogic = ((CoursesLogic) getFieldValue(actual, "teammates.logic.core.FeedbackSessionsLogic", "coursesLogic"));
        assertNull(actualCoursesLogic);

        FeedbackQuestionsLogic actualFqLogic = ((FeedbackQuestionsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackSessionsLogic", "fqLogic"));
        assertNull(actualFqLogic);

        FeedbackResponsesLogic actualFrLogic = ((FeedbackResponsesLogic) getFieldValue(actual, "teammates.logic.core.FeedbackSessionsLogic", "frLogic"));
        assertNull(actualFrLogic);

        FeedbackResponseCommentsLogic actualFrcLogic = ((FeedbackResponseCommentsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackSessionsLogic", "frcLogic"));
        assertNull(actualFrcLogic);

        InstructorsLogic actualInstructorsLogic = ((InstructorsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackSessionsLogic", "instructorsLogic"));
        assertNull(actualInstructorsLogic);

        StudentsLogic actualStudentsLogic = ((StudentsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackSessionsLogic", "studentsLogic"));
        assertNull(actualStudentsLogic);

        DeadlineExtensionsLogic actualDeLogic = ((DeadlineExtensionsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackSessionsLogic", "deLogic"));
        assertNull(actualDeLogic);

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.createFeedbackSession

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFeedbackSession(teammates.common.datatransfer.attributes.FeedbackSessionAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#createFeedbackSession(FeedbackSessionAttributes)}
     * @utbot.invokes {@link FeedbackSessionsDb#createEntity(EntityAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: return fsDb.createEntity(fsa);
     */
    @Test
    @DisplayName("createFeedbackSession: return fsDb.createEntity(fsa) : True -> ThrowNullPointerException")
    public void testCreateFeedbackSession_FeedbackSessionsDbCreateEntity() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.createFeedbackSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.createFeedbackSession(FeedbackSessionsLogic.java:82) */
        feedbackSessionsLogic.createFeedbackSession(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getAllOngoingSessions

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllOngoingSessions(java.time.Instant, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#getAllOngoingSessions(Instant, Instant)}
     * @utbot.invokes {@link FeedbackSessionsDb#getAllOngoingSessions(Instant, Instant)}
     * @utbot.throwsException {@link NullPointerException} in: return fsDb.getAllOngoingSessions(rangeStart, rangeEnd);
     */
    @Test
    @DisplayName("getAllOngoingSessions: return fsDb.getAllOngoingSessions(rangeStart, rangeEnd) : True -> ThrowNullPointerException")
    public void testGetAllOngoingSessions_FeedbackSessionsDbGetAllOngoingSessions() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getAllOngoingSessions] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getAllOngoingSessions(FeedbackSessionsLogic.java:89) */
        feedbackSessionsLogic.getAllOngoingSessions(null, null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getAllOngoingSessions(java.time.Instant, java.time.Instant)

    @Test
    public void testGetAllOngoingSessions1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            setStaticField(objectifyServiceClazz, "factory", factory);
            FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
            FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
            setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
            
            /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getAllOngoingSessions] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.FeedbackSessionsDb.load(FeedbackSessionsDb.java:398)
                teammates.storage.api.FeedbackSessionsDb.getAllOngoingSessions(FeedbackSessionsDb.java:49)
                teammates.logic.core.FeedbackSessionsLogic.getAllOngoingSessions(FeedbackSessionsLogic.java:89) */
            feedbackSessionsLogic.getAllOngoingSessions(null, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getFeedbackSession

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackSession(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#getFeedbackSession(String, String)}
     */
    @Test
    @DisplayName("getFeedbackSession: feedbackSessionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testGetFeedbackSessionThrowsNPEWithBlankStrings() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSession(FeedbackSessionsLogic.java:98) */
        feedbackSessionsLogic.getFeedbackSession("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionFromRecycleBin

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackSessionFromRecycleBin(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#getFeedbackSessionFromRecycleBin(String, String)}
     */
    @Test
    @DisplayName("getFeedbackSessionFromRecycleBin: feedbackSessionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testGetFeedbackSessionFromRecycleBinThrowsNPEWithBlankStrings() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionFromRecycleBin] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionFromRecycleBin(FeedbackSessionsLogic.java:107) */
        feedbackSessionsLogic.getFeedbackSessionFromRecycleBin("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackSessionsForCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#getFeedbackSessionsForCourse(String)}
     */
    @Test
    @DisplayName("getFeedbackSessionsForCourse: courseId = blank string -> throw NullPointerException")
    public void testGetFeedbackSessionsForCourseThrowsNPEWithBlankString() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourse(FeedbackSessionsLogic.java:114) */
        feedbackSessionsLogic.getFeedbackSessionsForCourse("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackSessionsForCourse(java.lang.String)

    @Test
    public void testGetFeedbackSessionsForCourse1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourse] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionsForCourse(FeedbackSessionsDb.java:118)
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourse(FeedbackSessionsLogic.java:114) */
        feedbackSessionsLogic.getFeedbackSessionsForCourse(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourseStartingAfter

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFeedbackSessionsForCourseStartingAfter(java.lang.String, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#getFeedbackSessionsForCourseStartingAfter(String, Instant)}
     * @utbot.invokes {@link FeedbackSessionsDb#getFeedbackSessionsForCourseStartingAfter(String, Instant)}
     * @utbot.throwsException {@link NullPointerException} in: return fsDb.getFeedbackSessionsForCourseStartingAfter(courseId, after);
     */
    @Test
    @DisplayName("getFeedbackSessionsForCourseStartingAfter: return fsDb.getFeedbackSessionsForCourseStartingAfter(courseId, after) : True -> ThrowNullPointerException")
    public void testGetFeedbackSessionsForCourseStartingAfter_FeedbackSessionsDbGetFeedbackSessionsForCourseStartingAfter() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourseStartingAfter] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourseStartingAfter(FeedbackSessionsLogic.java:121) */
        feedbackSessionsLogic.getFeedbackSessionsForCourseStartingAfter(null, null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getFeedbackSessionsForCourseStartingAfter(java.lang.String, java.time.Instant)

    @Test
    public void testGetFeedbackSessionsForCourseStartingAfter1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            setStaticField(objectifyServiceClazz, "factory", null);
            FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
            FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
            setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
            
            /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourseStartingAfter] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.FeedbackSessionsDb.load(FeedbackSessionsDb.java:398)
                teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionEntitiesForCourseStartingAfter(FeedbackSessionsDb.java:348)
                teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionsForCourseStartingAfter(FeedbackSessionsDb.java:129)
                teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourseStartingAfter(FeedbackSessionsLogic.java:121) */
            feedbackSessionsLogic.getFeedbackSessionsForCourseStartingAfter(null, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testGetFeedbackSessionsForCourseStartingAfter2() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            setStaticField(objectifyServiceClazz, "factory", factory);
            FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
            FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
            setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
            
            /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourseStartingAfter] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.FeedbackSessionsDb.load(FeedbackSessionsDb.java:398)
                teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionEntitiesForCourseStartingAfter(FeedbackSessionsDb.java:348)
                teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionsForCourseStartingAfter(FeedbackSessionsDb.java:129)
                teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsForCourseStartingAfter(FeedbackSessionsLogic.java:121) */
            feedbackSessionsLogic.getFeedbackSessionsForCourseStartingAfter(null, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsListForInstructor

    ///region

    @Test
    public void testGetFeedbackSessionsListForInstructor1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        List instructorList = emptyList();

        ArrayList actual = ((ArrayList) feedbackSessionsLogic.getFeedbackSessionsListForInstructor(instructorList));

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }

    @Test
    public void testGetFeedbackSessionsListForInstructor2() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsListForInstructor] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsListForInstructor(FeedbackSessionsLogic.java:130) */
        feedbackSessionsLogic.getFeedbackSessionsListForInstructor(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getSoftDeletedFeedbackSessionsListForInstructors

    ///region

    @Test
    public void testGetSoftDeletedFeedbackSessionsListForInstructors1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        List instructorList = emptyList();

        ArrayList actual = ((ArrayList) feedbackSessionsLogic.getSoftDeletedFeedbackSessionsListForInstructors(instructorList));

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }

    @Test
    public void testGetSoftDeletedFeedbackSessionsListForInstructors2() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getSoftDeletedFeedbackSessionsListForInstructors] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getSoftDeletedFeedbackSessionsListForInstructors(FeedbackSessionsLogic.java:151) */
        feedbackSessionsLogic.getSoftDeletedFeedbackSessionsListForInstructors(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent()

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent()}
     * @utbot.invokes {@link FeedbackSessionsDb#getFeedbackSessionsPossiblyNeedingPublishedEmail()}
     * @utbot.throwsException {@link NullPointerException} in: List<FeedbackSessionAttributes> sessions = fsDb.getFeedbackSessionsPossiblyNeedingPublishedEmail();
     */
    @Test
    @DisplayName("getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent: sessions = fsDb.getFeedbackSessionsPossiblyNeedingPublishedEmail() : True -> ThrowNullPointerException")
    public void testGetFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent_FeedbackSessionsDbGetFeedbackSessionsPossiblyNeedingPublishedEmail() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent(FeedbackSessionsLogic.java:172) */
        feedbackSessionsLogic.getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent();
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent()

    @Test
    public void testGetFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            setStaticField(objectifyServiceClazz, "factory", factory);
            FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
            FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
            setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
            
            /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.FeedbackSessionsDb.load(FeedbackSessionsDb.java:398)
                teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionEntitiesPossiblyNeedingPublishedEmail(FeedbackSessionsDb.java:385)
                teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionsPossiblyNeedingPublishedEmail(FeedbackSessionsDb.java:190)
                teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent(FeedbackSessionsLogic.java:172) */
            feedbackSessionsLogic.getFeedbackSessionsWhichNeedAutomatedPublishedEmailsToBeSent();
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFeedbackSessionsWhichNeedOpenEmailsToBeSent()

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#getFeedbackSessionsWhichNeedOpenEmailsToBeSent()}
     * @utbot.invokes {@link FeedbackSessionsDb#getFeedbackSessionsPossiblyNeedingOpenEmail()}
     * @utbot.throwsException {@link NullPointerException} in: List<FeedbackSessionAttributes> sessions = fsDb.getFeedbackSessionsPossiblyNeedingOpenEmail();
     */
    @Test
    @DisplayName("getFeedbackSessionsWhichNeedOpenEmailsToBeSent: sessions = fsDb.getFeedbackSessionsPossiblyNeedingOpenEmail() : True -> ThrowNullPointerException")
    public void testGetFeedbackSessionsWhichNeedOpenEmailsToBeSent_FeedbackSessionsDbGetFeedbackSessionsPossiblyNeedingOpenEmail() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent(FeedbackSessionsLogic.java:194) */
        feedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent();
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getFeedbackSessionsWhichNeedOpenEmailsToBeSent()

    @Test
    public void testGetFeedbackSessionsWhichNeedOpenEmailsToBeSent1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            setStaticField(objectifyServiceClazz, "factory", null);
            FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
            FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
            setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
            
            /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.FeedbackSessionsDb.load(FeedbackSessionsDb.java:398)
                teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionEntitiesPossiblyNeedingOpenEmail(FeedbackSessionsDb.java:362)
                teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionsPossiblyNeedingOpenEmail(FeedbackSessionsDb.java:150)
                teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent(FeedbackSessionsLogic.java:194) */
            feedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent();
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testGetFeedbackSessionsWhichNeedOpenEmailsToBeSent2() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            setStaticField(objectifyServiceClazz, "factory", factory);
            FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
            FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
            setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
            
            /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.FeedbackSessionsDb.load(FeedbackSessionsDb.java:398)
                teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionEntitiesPossiblyNeedingOpenEmail(FeedbackSessionsDb.java:362)
                teammates.storage.api.FeedbackSessionsDb.getFeedbackSessionsPossiblyNeedingOpenEmail(FeedbackSessionsDb.java:150)
                teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent(FeedbackSessionsLogic.java:194) */
            feedbackSessionsLogic.getFeedbackSessionsWhichNeedOpenEmailsToBeSent();
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.isCreatorOfSession

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method isCreatorOfSession(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#isCreatorOfSession(String, String, String)}
     */
    @Test
    @DisplayName("isCreatorOfSession: feedbackSessionName has special characters, courseId = blank string, userEmail != empty string -> throw NullPointerException")
    public void testIsCreatorOfSessionThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isCreatorOfSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSession(FeedbackSessionsLogic.java:98)
            teammates.logic.core.FeedbackSessionsLogic.isCreatorOfSession(FeedbackSessionsLogic.java:213) */
        feedbackSessionsLogic.isCreatorOfSession("\n\t\r", "   ", "string");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isCreatorOfSession(java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testIsCreatorOfSession1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isCreatorOfSession] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackSessionsDb.getFeedbackSession(FeedbackSessionsDb.java:81)
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSession(FeedbackSessionsLogic.java:98)
            teammates.logic.core.FeedbackSessionsLogic.isCreatorOfSession(FeedbackSessionsLogic.java:213) */
        feedbackSessionsLogic.isCreatorOfSession(null, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByStudent

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isFeedbackSessionAttemptedByStudent(teammates.common.datatransfer.attributes.FeedbackSessionAttributes, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#isFeedbackSessionAttemptedByStudent(FeedbackSessionAttributes, String, String)}
     * @utbot.invokes {@link FeedbackSessionAttributes#getFeedbackSessionName()}
     * @utbot.throwsException {@link NullPointerException} in: String feedbackSessionName = fsa.getFeedbackSessionName();
     */
    @Test
    @DisplayName("isFeedbackSessionAttemptedByStudent: feedbackSessionName = fsa.getFeedbackSessionName() : True -> ThrowNullPointerException")
    public void testIsFeedbackSessionAttemptedByStudent_FeedbackSessionAttributesGetFeedbackSessionName() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByStudent] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByStudent(FeedbackSessionsLogic.java:229) */
        feedbackSessionsLogic.isFeedbackSessionAttemptedByStudent(null, null, null);
    }

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#isFeedbackSessionAttemptedByStudent(FeedbackSessionAttributes, String, String)}
     * @utbot.invokes {@link FeedbackSessionAttributes#getFeedbackSessionName()}
     * @utbot.invokes {@link FeedbackSessionAttributes#getCourseId()}
     * @utbot.invokes {@link FeedbackQuestionsLogic#sessionHasQuestions(String, String)}
     * @utbot.throwsException {@link NullPointerException} in: !fqLogic.sessionHasQuestions(feedbackSessionName, courseId)
     */
    @Test
    @DisplayName("isFeedbackSessionAttemptedByStudent: !fqLogic.sessionHasQuestions(feedbackSessionName, courseId) -> ThrowNullPointerException")
    public void testIsFeedbackSessionAttemptedByStudent_FeedbackQuestionsLogicSessionHasQuestions() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fqLogic", null);
        FeedbackSessionAttributes fsa = ((FeedbackSessionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackSessionAttributes"));
        setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "feedbackSessionName", null);
        setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "courseId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByStudent] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByStudent(FeedbackSessionsLogic.java:232) */
        feedbackSessionsLogic.isFeedbackSessionAttemptedByStudent(fsa, null, null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method isFeedbackSessionAttemptedByStudent(teammates.common.datatransfer.attributes.FeedbackSessionAttributes, java.lang.String, java.lang.String)

    @Test
    public void testIsFeedbackSessionAttemptedByStudent1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackQuestionsLogic feedbackQuestionsLogic = ((FeedbackQuestionsLogic) createInstance("teammates.logic.core.FeedbackQuestionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fqLogic", feedbackQuestionsLogic);
        FeedbackSessionAttributes fsa = ((FeedbackSessionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackSessionAttributes"));
        setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "feedbackSessionName", null);
        setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "courseId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByStudent] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackQuestionsLogic.sessionHasQuestions(FeedbackQuestionsLogic.java:253)
            teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByStudent(FeedbackSessionsLogic.java:232) */
        feedbackSessionsLogic.isFeedbackSessionAttemptedByStudent(fsa, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isFeedbackSessionAttemptedByInstructor(teammates.common.datatransfer.attributes.FeedbackSessionAttributes, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#isFeedbackSessionAttemptedByInstructor(FeedbackSessionAttributes, String)}
     * @utbot.invokes {@link FeedbackSessionAttributes#getFeedbackSessionName()}
     * @utbot.throwsException {@link NullPointerException} in: frLogic.hasGiverRespondedForSession(userEmail, fsa.getFeedbackSessionName(), fsa.getCourseId())
     */
    @Test
    @DisplayName("isFeedbackSessionAttemptedByInstructor: frLogic.hasGiverRespondedForSession(userEmail, fsa.getFeedbackSessionName(), fsa.getCourseId()) -> ThrowNullPointerException")
    public void testIsFeedbackSessionAttemptedByInstructor_FeedbackSessionAttributesGetFeedbackSessionName() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "frLogic", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor(FeedbackSessionsLogic.java:251) */
        feedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor(null, null);
    }

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#isFeedbackSessionAttemptedByInstructor(FeedbackSessionAttributes, String)}
     * @utbot.invokes {@link FeedbackSessionAttributes#getFeedbackSessionName()}
     * @utbot.invokes {@link FeedbackSessionAttributes#getCourseId()}
     * @utbot.throwsException {@link NullPointerException} in: frLogic.hasGiverRespondedForSession(userEmail, fsa.getFeedbackSessionName(), fsa.getCourseId())
     */
    @Test
    @DisplayName("isFeedbackSessionAttemptedByInstructor: frLogic.hasGiverRespondedForSession(userEmail, fsa.getFeedbackSessionName(), fsa.getCourseId()) -> ThrowNullPointerException")
    public void testIsFeedbackSessionAttemptedByInstructor_FeedbackSessionAttributesGetCourseId() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "frLogic", null);
        FeedbackSessionAttributes fsa = ((FeedbackSessionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackSessionAttributes"));
        setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "feedbackSessionName", null);
        setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "courseId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor(FeedbackSessionsLogic.java:251) */
        feedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor(fsa, null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method isFeedbackSessionAttemptedByInstructor(teammates.common.datatransfer.attributes.FeedbackSessionAttributes, java.lang.String)

    @Test
    public void testIsFeedbackSessionAttemptedByInstructor1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "frLogic", feedbackResponsesLogic);
        FeedbackSessionAttributes fsa = ((FeedbackSessionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackSessionAttributes"));
        setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "feedbackSessionName", null);
        setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "courseId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.hasGiverRespondedForSession(FeedbackResponsesLogic.java:176)
            teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor(FeedbackSessionsLogic.java:251) */
        feedbackSessionsLogic.isFeedbackSessionAttemptedByInstructor(fsa, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsInstructorDeadlinesWithNewEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method updateFeedbackSessionsInstructorDeadlinesWithNewEmail(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#updateFeedbackSessionsInstructorDeadlinesWithNewEmail(String, String, String)}
     */
    @Test
    @DisplayName("updateFeedbackSessionsInstructorDeadlinesWithNewEmail: courseId has special characters, oldEmailAddress = blank string, newEmailAddress != empty string -> throw NullPointerException")
    public void testUpdateFeedbackSessionsInstructorDeadlinesWithNewEmailThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsInstructorDeadlinesWithNewEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsDeadlinesForUser(FeedbackSessionsLogic.java:626)
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsDeadlinesWithNewEmail(FeedbackSessionsLogic.java:615)
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsInstructorDeadlinesWithNewEmail(FeedbackSessionsLogic.java:321) */
        feedbackSessionsLogic.updateFeedbackSessionsInstructorDeadlinesWithNewEmail("\n\t\r", "   ", "string");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method updateFeedbackSessionsInstructorDeadlinesWithNewEmail(java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testUpdateFeedbackSessionsInstructorDeadlinesWithNewEmail1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsInstructorDeadlinesWithNewEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsDeadlinesWithNewEmail(FeedbackSessionsLogic.java:612)
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsInstructorDeadlinesWithNewEmail(FeedbackSessionsLogic.java:321) */
        feedbackSessionsLogic.updateFeedbackSessionsInstructorDeadlinesWithNewEmail(null, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsStudentDeadlinesWithNewEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method updateFeedbackSessionsStudentDeadlinesWithNewEmail(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#updateFeedbackSessionsStudentDeadlinesWithNewEmail(String, String, String)}
     */
    @Test
    @DisplayName("updateFeedbackSessionsStudentDeadlinesWithNewEmail: courseId has special characters, oldEmailAddress = blank string, newEmailAddress != empty string -> throw NullPointerException")
    public void testUpdateFeedbackSessionsStudentDeadlinesWithNewEmailThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsStudentDeadlinesWithNewEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsDeadlinesForUser(FeedbackSessionsLogic.java:626)
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsDeadlinesWithNewEmail(FeedbackSessionsLogic.java:615)
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsStudentDeadlinesWithNewEmail(FeedbackSessionsLogic.java:329) */
        feedbackSessionsLogic.updateFeedbackSessionsStudentDeadlinesWithNewEmail("\n\t\r", "   ", "string");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method updateFeedbackSessionsStudentDeadlinesWithNewEmail(java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testUpdateFeedbackSessionsStudentDeadlinesWithNewEmail1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsStudentDeadlinesWithNewEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsDeadlinesWithNewEmail(FeedbackSessionsLogic.java:612)
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsStudentDeadlinesWithNewEmail(FeedbackSessionsLogic.java:329) */
        feedbackSessionsLogic.updateFeedbackSessionsStudentDeadlinesWithNewEmail(null, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionsDeadlinesForInstructor

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteFeedbackSessionsDeadlinesForInstructor(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#deleteFeedbackSessionsDeadlinesForInstructor(String, String)}
     */
    @Test
    @DisplayName("deleteFeedbackSessionsDeadlinesForInstructor: courseId has special characters, emailAddress = blank string -> throw NullPointerException")
    public void testDeleteFeedbackSessionsDeadlinesForInstructorThrowsNPEWithBlankStrings() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionsDeadlinesForInstructor] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsDeadlinesForUser(FeedbackSessionsLogic.java:626)
            teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionsDeadlinesForUser(FeedbackSessionsLogic.java:620)
            teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionsDeadlinesForInstructor(FeedbackSessionsLogic.java:336) */
        feedbackSessionsLogic.deleteFeedbackSessionsDeadlinesForInstructor("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionsDeadlinesForStudent

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteFeedbackSessionsDeadlinesForStudent(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#deleteFeedbackSessionsDeadlinesForStudent(String, String)}
     */
    @Test
    @DisplayName("deleteFeedbackSessionsDeadlinesForStudent: courseId has special characters, emailAddress = blank string -> throw NullPointerException")
    public void testDeleteFeedbackSessionsDeadlinesForStudentThrowsNPEWithBlankStrings() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionsDeadlinesForStudent] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsDeadlinesForUser(FeedbackSessionsLogic.java:626)
            teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionsDeadlinesForUser(FeedbackSessionsLogic.java:620)
            teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionsDeadlinesForStudent(FeedbackSessionsLogic.java:343) */
        feedbackSessionsLogic.deleteFeedbackSessionsDeadlinesForStudent("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsTimeZoneForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method updateFeedbackSessionsTimeZoneForCourse(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#updateFeedbackSessionsTimeZoneForCourse(String, String)}
     */
    @Test
    @DisplayName("updateFeedbackSessionsTimeZoneForCourse: courseId has special characters, courseTimeZone = blank string -> throw NullPointerException")
    public void testUpdateFeedbackSessionsTimeZoneForCourseThrowsNPEWithBlankStrings() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsTimeZoneForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.updateFeedbackSessionsTimeZoneForCourse(FeedbackSessionsLogic.java:353) */
        feedbackSessionsLogic.updateFeedbackSessionsTimeZoneForCourse("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.publishFeedbackSession

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method publishFeedbackSession(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#publishFeedbackSession(String, String)}
     */
    @Test
    @DisplayName("publishFeedbackSession: feedbackSessionName = blank string, courseId = empty string -> throw NullPointerException")
    public void testPublishFeedbackSessionThrowsNPEWithBlankStringAndEmptyString() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.publishFeedbackSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSession(FeedbackSessionsLogic.java:98)
            teammates.logic.core.FeedbackSessionsLogic.publishFeedbackSession(FeedbackSessionsLogic.java:376) */
        feedbackSessionsLogic.publishFeedbackSession("   ", "");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method publishFeedbackSession(java.lang.String, java.lang.String)

    @Test
    public void testPublishFeedbackSession1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.publishFeedbackSession] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackSessionsDb.getFeedbackSession(FeedbackSessionsDb.java:81)
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSession(FeedbackSessionsLogic.java:98)
            teammates.logic.core.FeedbackSessionsLogic.publishFeedbackSession(FeedbackSessionsLogic.java:376) */
        feedbackSessionsLogic.publishFeedbackSession(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.unpublishFeedbackSession

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method unpublishFeedbackSession(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#unpublishFeedbackSession(String, String)}
     */
    @Test
    @DisplayName("unpublishFeedbackSession: feedbackSessionName = blank string, courseId = empty string -> throw NullPointerException")
    public void testUnpublishFeedbackSessionThrowsNPEWithBlankStringAndEmptyString() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.unpublishFeedbackSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSession(FeedbackSessionsLogic.java:98)
            teammates.logic.core.FeedbackSessionsLogic.unpublishFeedbackSession(FeedbackSessionsLogic.java:402) */
        feedbackSessionsLogic.unpublishFeedbackSession("   ", "");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unpublishFeedbackSession(java.lang.String, java.lang.String)

    @Test
    public void testUnpublishFeedbackSession1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.unpublishFeedbackSession] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackSessionsDb.getFeedbackSession(FeedbackSessionsDb.java:81)
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSession(FeedbackSessionsLogic.java:98)
            teammates.logic.core.FeedbackSessionsLogic.unpublishFeedbackSession(FeedbackSessionsLogic.java:402) */
        feedbackSessionsLogic.unpublishFeedbackSession(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsOpeningWithinTimeLimit

    ///region

    @Test
    public void testGetFeedbackSessionsOpeningWithinTimeLimit1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsOpeningWithinTimeLimit] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsOpeningWithinTimeLimit(FeedbackSessionsLogic.java:424) */
        feedbackSessionsLogic.getFeedbackSessionsOpeningWithinTimeLimit();
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsClosingWithinTimeLimit

    ///region

    @Test
    public void testGetFeedbackSessionsClosingWithinTimeLimit1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsClosingWithinTimeLimit] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsClosingWithinTimeLimit(FeedbackSessionsLogic.java:445) */
        feedbackSessionsLogic.getFeedbackSessionsClosingWithinTimeLimit();
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsClosedWithinThePastHour

    ///region

    @Test
    public void testGetFeedbackSessionsClosedWithinThePastHour1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsClosedWithinThePastHour] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getFeedbackSessionsClosedWithinThePastHour(FeedbackSessionsLogic.java:465) */
        feedbackSessionsLogic.getFeedbackSessionsClosedWithinThePastHour();
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteFeedbackSessionCascade(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#deleteFeedbackSessionCascade(String, String)}
     */
    @Test
    @DisplayName("deleteFeedbackSessionCascade: feedbackSessionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testDeleteFeedbackSessionCascadeThrowsNPEWithBlankStrings() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionCascade(FeedbackSessionsLogic.java:488) */
        feedbackSessionsLogic.deleteFeedbackSessionCascade("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteFeedbackSessionCascade(java.lang.String, java.lang.String)

    @Test
    public void testDeleteFeedbackSessionCascade1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionCascade] produces [java.lang.AssertionError]
            teammates.common.datatransfer.AttributesDeletionQuery$Builder.withCourseId(AttributesDeletionQuery.java:88)
            teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessionCascade(FeedbackSessionsLogic.java:485) */
        feedbackSessionsLogic.deleteFeedbackSessionCascade(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessions

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteFeedbackSessions(teammates.common.datatransfer.AttributesDeletionQuery)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#deleteFeedbackSessions(AttributesDeletionQuery)}
     * @utbot.invokes {@link FeedbackSessionsDb#deleteFeedbackSessions(AttributesDeletionQuery)}
     * @utbot.throwsException {@link NullPointerException} in: fsDb.deleteFeedbackSessions(query);
     */
    @Test
    @DisplayName("deleteFeedbackSessions: fsDb.deleteFeedbackSessions(query) : True -> ThrowNullPointerException")
    public void testDeleteFeedbackSessions_FeedbackSessionsDbDeleteFeedbackSessions() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessions] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessions(FeedbackSessionsLogic.java:500) */
        feedbackSessionsLogic.deleteFeedbackSessions(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteFeedbackSessions(teammates.common.datatransfer.AttributesDeletionQuery)

    @Test
    public void testDeleteFeedbackSessions1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessions] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackSessionsDb.deleteFeedbackSessions(FeedbackSessionsDb.java:333)
            teammates.logic.core.FeedbackSessionsLogic.deleteFeedbackSessions(FeedbackSessionsLogic.java:500) */
        feedbackSessionsLogic.deleteFeedbackSessions(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.moveFeedbackSessionToRecycleBin

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method moveFeedbackSessionToRecycleBin(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#moveFeedbackSessionToRecycleBin(String, String)}
     */
    @Test
    @DisplayName("moveFeedbackSessionToRecycleBin: feedbackSessionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testMoveFeedbackSessionToRecycleBinThrowsNPEWithBlankStrings() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.moveFeedbackSessionToRecycleBin] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.moveFeedbackSessionToRecycleBin(FeedbackSessionsLogic.java:510) */
        feedbackSessionsLogic.moveFeedbackSessionToRecycleBin("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method moveFeedbackSessionToRecycleBin(java.lang.String, java.lang.String)

    @Test
    public void testMoveFeedbackSessionToRecycleBin1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.moveFeedbackSessionToRecycleBin] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackSessionsDb.softDeleteFeedbackSession(FeedbackSessionsDb.java:286)
            teammates.logic.core.FeedbackSessionsLogic.moveFeedbackSessionToRecycleBin(FeedbackSessionsLogic.java:510) */
        feedbackSessionsLogic.moveFeedbackSessionToRecycleBin(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.restoreFeedbackSessionFromRecycleBin

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method restoreFeedbackSessionFromRecycleBin(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#restoreFeedbackSessionFromRecycleBin(String, String)}
     */
    @Test
    @DisplayName("restoreFeedbackSessionFromRecycleBin: feedbackSessionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testRestoreFeedbackSessionFromRecycleBinThrowsNPEWithBlankStrings() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.restoreFeedbackSessionFromRecycleBin] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.restoreFeedbackSessionFromRecycleBin(FeedbackSessionsLogic.java:518) */
        feedbackSessionsLogic.restoreFeedbackSessionFromRecycleBin("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method restoreFeedbackSessionFromRecycleBin(java.lang.String, java.lang.String)

    @Test
    public void testRestoreFeedbackSessionFromRecycleBin1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fsDb", feedbackSessionsDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.restoreFeedbackSessionFromRecycleBin] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackSessionsDb.restoreDeletedFeedbackSession(FeedbackSessionsDb.java:306)
            teammates.logic.core.FeedbackSessionsLogic.restoreFeedbackSessionFromRecycleBin(FeedbackSessionsLogic.java:518) */
        feedbackSessionsLogic.restoreFeedbackSessionFromRecycleBin(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getExpectedTotalSubmission

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getExpectedTotalSubmission(teammates.common.datatransfer.attributes.FeedbackSessionAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#getExpectedTotalSubmission(FeedbackSessionAttributes)}
     * @utbot.invokes {@link FeedbackQuestionsLogic#hasFeedbackQuestionsForStudents(FeedbackSessionAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: fqLogic.hasFeedbackQuestionsForStudents(fsa)
     */
    @Test
    @DisplayName("getExpectedTotalSubmission: fqLogic.hasFeedbackQuestionsForStudents(fsa) -> ThrowNullPointerException")
    public void testGetExpectedTotalSubmission_FeedbackQuestionsLogicHasFeedbackQuestionsForStudents() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "fqLogic", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getExpectedTotalSubmission] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getExpectedTotalSubmission(FeedbackSessionsLogic.java:527) */
        feedbackSessionsLogic.getExpectedTotalSubmission(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.getActualTotalSubmission

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getActualTotalSubmission(teammates.common.datatransfer.attributes.FeedbackSessionAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#getActualTotalSubmission(FeedbackSessionAttributes)}
     * @utbot.invokes {@link FeedbackSessionAttributes#getCourseId()}
     * @utbot.throwsException {@link NullPointerException} in: return frLogic.getGiverSetThatAnswerFeedbackSession(fsa.getCourseId(), fsa.getFeedbackSessionName()).size();
     */
    @Test
    @DisplayName("getActualTotalSubmission: return frLogic.getGiverSetThatAnswerFeedbackSession(fsa.getCourseId(), fsa.getFeedbackSessionName()).size() : True -> ThrowNullPointerException")
    public void testGetActualTotalSubmission_FeedbackSessionAttributesGetCourseId() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "frLogic", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getActualTotalSubmission] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getActualTotalSubmission(FeedbackSessionsLogic.java:559) */
        feedbackSessionsLogic.getActualTotalSubmission(null);
    }

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#getActualTotalSubmission(FeedbackSessionAttributes)}
     * @utbot.invokes {@link FeedbackSessionAttributes#getCourseId()}
     * @utbot.invokes {@link FeedbackSessionAttributes#getFeedbackSessionName()}
     * @utbot.throwsException {@link NullPointerException} in: return frLogic.getGiverSetThatAnswerFeedbackSession(fsa.getCourseId(), fsa.getFeedbackSessionName()).size();
     */
    @Test
    @DisplayName("getActualTotalSubmission: return frLogic.getGiverSetThatAnswerFeedbackSession(fsa.getCourseId(), fsa.getFeedbackSessionName()).size() : True -> ThrowNullPointerException")
    public void testGetActualTotalSubmission_FeedbackSessionAttributesGetFeedbackSessionName() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        setField(feedbackSessionsLogic, "teammates.logic.core.FeedbackSessionsLogic", "frLogic", null);
        FeedbackSessionAttributes fsa = ((FeedbackSessionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackSessionAttributes"));
        setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "feedbackSessionName", null);
        setField(fsa, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "courseId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.getActualTotalSubmission] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.getActualTotalSubmission(FeedbackSessionsLogic.java:559) */
        feedbackSessionsLogic.getActualTotalSubmission(fsa);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionViewableToUserType

    ///region OTHER: ERROR SUITE for method isFeedbackSessionViewableToUserType(teammates.common.datatransfer.attributes.FeedbackSessionAttributes, boolean)

    @Test
    public void testIsFeedbackSessionViewableToUserType1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackSessionAttributes session = ((FeedbackSessionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackSessionAttributes"));
        setField(session, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "sessionVisibleFromTime", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionViewableToUserType] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.attributes.FeedbackSessionAttributes.isVisible(FeedbackSessionAttributes.java:361)
            teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionForUserTypeToAnswer(FeedbackSessionsLogic.java:601)
            teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionViewableToUserType(FeedbackSessionsLogic.java:577) */
        feedbackSessionsLogic.isFeedbackSessionViewableToUserType(session, false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionForUserTypeToAnswer

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isFeedbackSessionForUserTypeToAnswer(teammates.common.datatransfer.attributes.FeedbackSessionAttributes, boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackSessionsLogic}
     * @utbot.methodUnderTest {@link FeedbackSessionsLogic#isFeedbackSessionForUserTypeToAnswer(FeedbackSessionAttributes, boolean)}
     * @utbot.invokes {@link FeedbackSessionAttributes#isVisible()}
     * @utbot.throwsException {@link NullPointerException} in: !session.isVisible()
     */
    @Test
    @DisplayName("isFeedbackSessionForUserTypeToAnswer: !session.isVisible() -> ThrowNullPointerException")
    public void testIsFeedbackSessionForUserTypeToAnswer_FeedbackSessionAttributesIsVisible() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionForUserTypeToAnswer] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionForUserTypeToAnswer(FeedbackSessionsLogic.java:601) */
        feedbackSessionsLogic.isFeedbackSessionForUserTypeToAnswer(null, false);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method isFeedbackSessionForUserTypeToAnswer(teammates.common.datatransfer.attributes.FeedbackSessionAttributes, boolean)

    @Test
    public void testIsFeedbackSessionForUserTypeToAnswer1() throws Exception {
        FeedbackSessionsLogic feedbackSessionsLogic = ((FeedbackSessionsLogic) createInstance("teammates.logic.core.FeedbackSessionsLogic"));
        FeedbackSessionAttributes session = ((FeedbackSessionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackSessionAttributes"));
        setField(session, "teammates.common.datatransfer.attributes.FeedbackSessionAttributes", "sessionVisibleFromTime", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionForUserTypeToAnswer] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.attributes.FeedbackSessionAttributes.isVisible(FeedbackSessionAttributes.java:361)
            teammates.logic.core.FeedbackSessionsLogic.isFeedbackSessionForUserTypeToAnswer(FeedbackSessionsLogic.java:601) */
        feedbackSessionsLogic.isFeedbackSessionForUserTypeToAnswer(session, false);
    }
    ///endregion

    ///endregion
}
