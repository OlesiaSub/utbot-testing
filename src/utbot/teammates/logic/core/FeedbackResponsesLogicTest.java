package teammates.logic.core;

import com.googlecode.objectify.ObjectifyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.CourseRoster;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseAttributes.UpdateOptions;
import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.storage.api.FeedbackResponsesDb;
import teammates.common.datatransfer.FeedbackResultFetchType;
import teammates.common.datatransfer.FeedbackParticipantType;
import teammates.common.datatransfer.attributes.FeedbackQuestionAttributes;
import teammates.storage.api.StudentsDb;
import com.googlecode.objectify.ObjectifyFactory;

import java.time.Instant;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;

public final class FeedbackResponsesLogicTest {
    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponseCascade

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateFeedbackResponseCascade(teammates.common.datatransfer.attributes.FeedbackResponseAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#updateFeedbackResponseCascade(UpdateOptions)}
     * @utbot.invokes {@link UpdateOptions#getFeedbackResponseId()}
     * @utbot.throwsException {@link NullPointerException} in: FeedbackResponseAttributes oldResponse = frDb.getFeedbackResponse(updateOptions.getFeedbackResponseId());
     */
    @Test
    @DisplayName("updateFeedbackResponseCascade: oldResponse = frDb.getFeedbackResponse(updateOptions.getFeedbackResponseId()) : True -> ThrowNullPointerException")
    public void testUpdateFeedbackResponseCascade_FeedbackResponseAttributesGetFeedbackResponseId() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponseCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponseCascade(FeedbackResponsesLogic.java:698) */
        feedbackResponsesLogic.updateFeedbackResponseCascade(null);
    }

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#updateFeedbackResponseCascade(UpdateOptions)}
     * @utbot.invokes {@link UpdateOptions#getFeedbackResponseId()}
     * @utbot.throwsException {@link NullPointerException} in: FeedbackResponseAttributes oldResponse = frDb.getFeedbackResponse(updateOptions.getFeedbackResponseId());
     */
    @Test
    @DisplayName("updateFeedbackResponseCascade: oldResponse = frDb.getFeedbackResponse(updateOptions.getFeedbackResponseId()) : True -> ThrowNullPointerException")
    public void testUpdateFeedbackResponseCascade_FeedbackResponseAttributesGetFeedbackResponseId_1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", null);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseAttributes$UpdateOptions"));
        setField(updateOptions, "teammates.common.datatransfer.attributes.FeedbackResponseAttributes$UpdateOptions", "feedbackResponseId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponseCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponseCascade(FeedbackResponsesLogic.java:698) */
        feedbackResponsesLogic.updateFeedbackResponseCascade(updateOptions);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateFeedbackResponseCascade(teammates.common.datatransfer.attributes.FeedbackResponseAttributes.UpdateOptions)

    @Test
    public void testUpdateFeedbackResponseCascade1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseAttributes$UpdateOptions"));
        setField(updateOptions, "teammates.common.datatransfer.attributes.FeedbackResponseAttributes$UpdateOptions", "feedbackResponseId", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponseCascade] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.getFeedbackResponse(FeedbackResponsesDb.java:73)
            teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponseCascade(FeedbackResponsesLogic.java:698) */
        feedbackResponsesLogic.updateFeedbackResponseCascade(updateOptions);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.inst

    ///region OTHER: SUCCESSFUL EXECUTIONS for method inst()

    @Test
    public void testInst1() throws Exception {
        FeedbackResponsesLogic actual = FeedbackResponsesLogic.inst();

        FeedbackResponsesLogic expected = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(expected, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        setField(expected, "teammates.logic.core.FeedbackResponsesLogic", "fqLogic", null);
        setField(expected, "teammates.logic.core.FeedbackResponsesLogic", "frcLogic", null);
        setField(expected, "teammates.logic.core.FeedbackResponsesLogic", "instructorsLogic", null);
        setField(expected, "teammates.logic.core.FeedbackResponsesLogic", "studentsLogic", null);
        FeedbackResponsesDb expectedFrDb = ((FeedbackResponsesDb) getFieldValue(expected, "teammates.logic.core.FeedbackResponsesLogic", "frDb"));
        FeedbackResponsesDb actualFrDb = ((FeedbackResponsesDb) getFieldValue(actual, "teammates.logic.core.FeedbackResponsesLogic", "frDb"));

        FeedbackQuestionsLogic actualFqLogic = ((FeedbackQuestionsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackResponsesLogic", "fqLogic"));
        assertNull(actualFqLogic);

        FeedbackResponseCommentsLogic actualFrcLogic = ((FeedbackResponseCommentsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackResponsesLogic", "frcLogic"));
        assertNull(actualFrcLogic);

        InstructorsLogic actualInstructorsLogic = ((InstructorsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackResponsesLogic", "instructorsLogic"));
        assertNull(actualInstructorsLogic);

        StudentsLogic actualStudentsLogic = ((StudentsLogic) getFieldValue(actual, "teammates.logic.core.FeedbackResponsesLogic", "studentsLogic"));
        assertNull(actualStudentsLogic);

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getGiverSetThatAnswerFeedbackSession

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getGiverSetThatAnswerFeedbackSession(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getGiverSetThatAnswerFeedbackSession(String, String)}
     */
    @Test
    @DisplayName("getGiverSetThatAnswerFeedbackSession: courseId has special characters, feedbackSessionName = blank string -> throw NullPointerException")
    public void testGetGiverSetThatAnswerFeedbackSessionThrowsNPEWithBlankStrings() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getGiverSetThatAnswerFeedbackSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getGiverSetThatAnswerFeedbackSession(FeedbackResponsesLogic.java:69) */
        feedbackResponsesLogic.getGiverSetThatAnswerFeedbackSession("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getGiverSetThatAnswerFeedbackSession(java.lang.String, java.lang.String)

    @Test
    public void testGetGiverSetThatAnswerFeedbackSession1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getGiverSetThatAnswerFeedbackSession] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.getGiverSetThatAnswerFeedbackSession(FeedbackResponsesDb.java:47)
            teammates.logic.core.FeedbackResponsesLogic.getGiverSetThatAnswerFeedbackSession(FeedbackResponsesLogic.java:69) */
        feedbackResponsesLogic.getGiverSetThatAnswerFeedbackSession(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.createFeedbackResponse

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFeedbackResponse(teammates.common.datatransfer.attributes.FeedbackResponseAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#createFeedbackResponse(FeedbackResponseAttributes)}
     * @utbot.invokes {@link FeedbackResponsesDb#createEntity(EntityAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: return frDb.createEntity(fra);
     */
    @Test
    @DisplayName("createFeedbackResponse: return frDb.createEntity(fra) : True -> ThrowNullPointerException")
    public void testCreateFeedbackResponse_FeedbackResponsesDbCreateEntity() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.createFeedbackResponse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.createFeedbackResponse(FeedbackResponsesLogic.java:81) */
        feedbackResponsesLogic.createFeedbackResponse(null);
    }
    ///endregion

    ///region Errors report for createFeedbackResponse

    public void testCreateFeedbackResponse_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getFeedbackResponse(String)}
     */
    @Test
    @DisplayName("getFeedbackResponse: feedbackResponseId = blank string -> throw NullPointerException")
    public void testGetFeedbackResponseThrowsNPEWithBlankString() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponse(FeedbackResponsesLogic.java:89) */
        feedbackResponsesLogic.getFeedbackResponse("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackResponse(java.lang.String)

    @Test
    public void testGetFeedbackResponse1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponse] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.getFeedbackResponse(FeedbackResponsesDb.java:73)
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponse(FeedbackResponsesLogic.java:89) */
        feedbackResponsesLogic.getFeedbackResponse(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponse(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getFeedbackResponse(String, String, String)}
     */
    @Test
    @DisplayName("getFeedbackResponse: feedbackQuestionId has special characters, giverEmail = blank string, recipient != empty string -> throw NullPointerException")
    public void testGetFeedbackResponseThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponse(FeedbackResponsesLogic.java:97) */
        feedbackResponsesLogic.getFeedbackResponse("\n\t\r", "   ", "string");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForSession

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponsesForSession(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getFeedbackResponsesForSession(String, String)}
     */
    @Test
    @DisplayName("getFeedbackResponsesForSession: feedbackSessionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testGetFeedbackResponsesForSessionThrowsNPEWithBlankStrings() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForSession(FeedbackResponsesLogic.java:105) */
        feedbackResponsesLogic.getFeedbackResponsesForSession("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForSessionInSection

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponsesForSessionInSection(java.lang.String, java.lang.String, java.lang.String, teammates.common.datatransfer.FeedbackResultFetchType)

    @Test
    public void testGetFeedbackResponsesForSessionInSectionByFuzzer() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResultFetchType fetchType = FeedbackResultFetchType.RECEIVER;
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForSessionInSection] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForSessionInSection(FeedbackResponsesLogic.java:123) */
        feedbackResponsesLogic.getFeedbackResponsesForSessionInSection("   ", "string", "", fetchType);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponsesForQuestion(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getFeedbackResponsesForQuestion(String)}
     */
    @Test
    @DisplayName("getFeedbackResponsesForQuestion: feedbackQuestionId = blank string -> throw NullPointerException")
    public void testGetFeedbackResponsesForQuestionThrowsNPEWithBlankString() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestion] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestion(FeedbackResponsesLogic.java:130) */
        feedbackResponsesLogic.getFeedbackResponsesForQuestion("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackResponsesForQuestion(java.lang.String)

    @Test
    public void testGetFeedbackResponsesForQuestion1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestion] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.getFeedbackResponsesForQuestion(FeedbackResponsesDb.java:111)
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestion(FeedbackResponsesLogic.java:130) */
        feedbackResponsesLogic.getFeedbackResponsesForQuestion(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.areThereResponsesForQuestion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method areThereResponsesForQuestion(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#areThereResponsesForQuestion(String)}
     */
    @Test
    @DisplayName("areThereResponsesForQuestion: feedbackQuestionId = blank string -> throw NullPointerException")
    public void testAreThereResponsesForQuestionThrowsNPEWithBlankString() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.areThereResponsesForQuestion] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.areThereResponsesForQuestion(FeedbackResponsesLogic.java:137) */
        feedbackResponsesLogic.areThereResponsesForQuestion("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method areThereResponsesForQuestion(java.lang.String)

    @Test
    public void testAreThereResponsesForQuestion1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.areThereResponsesForQuestion] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.areThereResponsesForQuestion(FeedbackResponsesDb.java:120)
            teammates.logic.core.FeedbackResponsesLogic.areThereResponsesForQuestion(FeedbackResponsesLogic.java:137) */
        feedbackResponsesLogic.areThereResponsesForQuestion(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestionInSection

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponsesForQuestionInSection(java.lang.String, java.lang.String, teammates.common.datatransfer.FeedbackResultFetchType)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getFeedbackResponsesForQuestionInSection(String, String, FeedbackResultFetchType)}
     */
    @Test
    @DisplayName("getFeedbackResponsesForQuestionInSection: feedbackQuestionId = blank string, section has special characters, fetchType = GIVER -> throw NullPointerException")
    public void testGetFeedbackResponsesForQuestionInSectionThrowsNPEWithBlankStrings() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResultFetchType fetchType = FeedbackResultFetchType.GIVER;
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestionInSection] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestionInSection(FeedbackResponsesLogic.java:152) */
        feedbackResponsesLogic.getFeedbackResponsesForQuestionInSection("   ", "\n\t\r", fetchType);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getFeedbackResponsesForQuestionInSection(java.lang.String, java.lang.String, teammates.common.datatransfer.FeedbackResultFetchType)

    @Test
    public void testGetFeedbackResponsesForQuestionInSection1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResultFetchType fetchType = FeedbackResultFetchType.BOTH;
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestionInSection] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestion(FeedbackResponsesLogic.java:130)
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForQuestionInSection(FeedbackResponsesLogic.java:150) */
        feedbackResponsesLogic.getFeedbackResponsesForQuestionInSection(null, null, fetchType);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForQuestion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponsesFromGiverForQuestion(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getFeedbackResponsesFromGiverForQuestion(String, String)}
     */
    @Test
    @DisplayName("getFeedbackResponsesFromGiverForQuestion: feedbackQuestionId has special characters, userEmail = blank string -> throw NullPointerException")
    public void testGetFeedbackResponsesFromGiverForQuestionThrowsNPEWithBlankStrings() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForQuestion] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForQuestion(FeedbackResponsesLogic.java:160) */
        feedbackResponsesLogic.getFeedbackResponsesFromGiverForQuestion("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackResponsesFromGiverForQuestion(java.lang.String, java.lang.String)

    @Test
    public void testGetFeedbackResponsesFromGiverForQuestion1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForQuestion] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.getFeedbackResponsesFromGiverForQuestion(FeedbackResponsesDb.java:160)
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForQuestion(FeedbackResponsesLogic.java:160) */
        feedbackResponsesLogic.getFeedbackResponsesFromGiverForQuestion(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.hasGiverRespondedForSession

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method hasGiverRespondedForSession(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#hasGiverRespondedForSession(String, String, String)}
     */
    @Test
    @DisplayName("hasGiverRespondedForSession: giverIdentifier has special characters, feedbackSessionName = blank string, courseId != empty string -> throw NullPointerException")
    public void testHasGiverRespondedForSessionThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.hasGiverRespondedForSession] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.hasGiverRespondedForSession(FeedbackResponsesLogic.java:176) */
        feedbackResponsesLogic.hasGiverRespondedForSession("\n\t\r", "   ", "string");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasGiverRespondedForSession(java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testHasGiverRespondedForSession1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.hasGiverRespondedForSession] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.hasResponsesFromGiverInSession(FeedbackResponsesDb.java:182)
            teammates.logic.core.FeedbackResponsesLogic.hasGiverRespondedForSession(FeedbackResponsesLogic.java:176) */
        feedbackResponsesLogic.hasGiverRespondedForSession(null, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForReceiverForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponsesForReceiverForCourse(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getFeedbackResponsesForReceiverForCourse(String, String)}
     */
    @Test
    @DisplayName("getFeedbackResponsesForReceiverForCourse: courseId has special characters, userEmail = blank string -> throw NullPointerException")
    public void testGetFeedbackResponsesForReceiverForCourseThrowsNPEWithBlankStrings() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForReceiverForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForReceiverForCourse(FeedbackResponsesLogic.java:184) */
        feedbackResponsesLogic.getFeedbackResponsesForReceiverForCourse("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackResponsesForReceiverForCourse(java.lang.String, java.lang.String)

    @Test
    public void testGetFeedbackResponsesForReceiverForCourse1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForReceiverForCourse] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.getFeedbackResponsesForReceiverForCourse(FeedbackResponsesDb.java:201)
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesForReceiverForCourse(FeedbackResponsesLogic.java:184) */
        feedbackResponsesLogic.getFeedbackResponsesForReceiverForCourse(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getFeedbackResponsesFromGiverForCourse(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getFeedbackResponsesFromGiverForCourse(String, String)}
     */
    @Test
    @DisplayName("getFeedbackResponsesFromGiverForCourse: courseId has special characters, userEmail = blank string -> throw NullPointerException")
    public void testGetFeedbackResponsesFromGiverForCourseThrowsNPEWithBlankStrings() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesLogic.java:192) */
        feedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getFeedbackResponsesFromGiverForCourse(java.lang.String, java.lang.String)

    @Test
    public void testGetFeedbackResponsesFromGiverForCourse1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesDb.java:212)
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesLogic.java:192) */
        feedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromStudentOrTeamForQuestion

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFeedbackResponsesFromStudentOrTeamForQuestion(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes, teammates.common.datatransfer.attributes.StudentAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getFeedbackResponsesFromStudentOrTeamForQuestion(FeedbackQuestionAttributes, StudentAttributes)}
     * @utbot.invokes {@link FeedbackQuestionAttributes#getGiverType()}
     * @utbot.throwsException {@link NullPointerException} in: question.getGiverType() == FeedbackParticipantType.TEAMS
     */
    @Test
    @DisplayName("getFeedbackResponsesFromStudentOrTeamForQuestion: question.getGiverType() == FeedbackParticipantType.TEAMS -> ThrowNullPointerException")
    public void testGetFeedbackResponsesFromStudentOrTeamForQuestion_FeedbackQuestionAttributesGetGiverType() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromStudentOrTeamForQuestion] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromStudentOrTeamForQuestion(FeedbackResponsesLogic.java:201) */
        feedbackResponsesLogic.getFeedbackResponsesFromStudentOrTeamForQuestion(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.isNameVisibleToUser

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNameVisibleToUser(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes, teammates.common.datatransfer.attributes.FeedbackResponseAttributes, java.lang.String, boolean, boolean, teammates.common.datatransfer.CourseRoster)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#isNameVisibleToUser(FeedbackQuestionAttributes, FeedbackResponseAttributes, String, boolean, boolean, CourseRoster)}
     * @utbot.executesCondition {@code (question == null): True}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("isNameVisibleToUser: question == null : True -> return false")
    public void testIsNameVisibleToUser_QuestionEqualsNull() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));

        boolean actual = feedbackResponsesLogic.isNameVisibleToUser(null, null, null, false, false, null);

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToStudent

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isResponseOfFeedbackQuestionVisibleToStudent(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#isResponseOfFeedbackQuestionVisibleToStudent(FeedbackQuestionAttributes)}
     * @utbot.invokes {@link FeedbackQuestionAttributes#isResponseVisibleTo(FeedbackParticipantType)}
     * @utbot.throwsException {@link NullPointerException} in: question.isResponseVisibleTo(FeedbackParticipantType.STUDENTS)
     */
    @Test
    @DisplayName("isResponseOfFeedbackQuestionVisibleToStudent: question.isResponseVisibleTo(FeedbackParticipantType.STUDENTS) -> ThrowNullPointerException")
    public void testIsResponseOfFeedbackQuestionVisibleToStudent_FeedbackQuestionAttributesIsResponseVisibleTo() throws Exception {
        FeedbackParticipantType prevSTUDENTS = FeedbackParticipantType.STUDENTS;
        try {
            FeedbackParticipantType students = FeedbackParticipantType.STUDENTS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "STUDENTS", students);
            FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
            
            /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToStudent] produces [java.lang.NullPointerException]
                teammates.logic.core.FeedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToStudent(FeedbackResponsesLogic.java:302) */
            feedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToStudent(null);
        } finally {
            setStaticField(FeedbackParticipantType.class, "STUDENTS", prevSTUDENTS);
        }
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method isResponseOfFeedbackQuestionVisibleToStudent(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes)

    @Test
    public void testIsResponseOfFeedbackQuestionVisibleToStudent1() throws Exception {
        FeedbackParticipantType prevSTUDENTS = FeedbackParticipantType.STUDENTS;
        try {
            FeedbackParticipantType students = FeedbackParticipantType.STUDENTS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "STUDENTS", students);
            FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
            FeedbackQuestionAttributes question = ((FeedbackQuestionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackQuestionAttributes"));
            
            /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToStudent] produces [java.lang.NullPointerException]
                teammates.common.datatransfer.attributes.FeedbackQuestionAttributes.isResponseVisibleTo(FeedbackQuestionAttributes.java:171)
                teammates.logic.core.FeedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToStudent(FeedbackResponsesLogic.java:302) */
            feedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToStudent(question);
        } finally {
            setStaticField(FeedbackParticipantType.class, "STUDENTS", prevSTUDENTS);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToInstructor

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isResponseOfFeedbackQuestionVisibleToInstructor(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#isResponseOfFeedbackQuestionVisibleToInstructor(FeedbackQuestionAttributes)}
     * @utbot.invokes {@link FeedbackQuestionAttributes#isResponseVisibleTo(FeedbackParticipantType)}
     * @utbot.throwsException {@link NullPointerException} in: return question.isResponseVisibleTo(FeedbackParticipantType.INSTRUCTORS);
     */
    @Test
    @DisplayName("isResponseOfFeedbackQuestionVisibleToInstructor: return question.isResponseVisibleTo(FeedbackParticipantType.INSTRUCTORS) : True -> ThrowNullPointerException")
    public void testIsResponseOfFeedbackQuestionVisibleToInstructor_FeedbackQuestionAttributesIsResponseVisibleTo() throws Exception {
        FeedbackParticipantType prevINSTRUCTORS = FeedbackParticipantType.INSTRUCTORS;
        try {
            FeedbackParticipantType instructors = FeedbackParticipantType.INSTRUCTORS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "INSTRUCTORS", instructors);
            FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
            
            /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToInstructor] produces [java.lang.NullPointerException]
                teammates.logic.core.FeedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToInstructor(FeedbackResponsesLogic.java:329) */
            feedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToInstructor(null);
        } finally {
            setStaticField(FeedbackParticipantType.class, "INSTRUCTORS", prevINSTRUCTORS);
        }
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method isResponseOfFeedbackQuestionVisibleToInstructor(teammates.common.datatransfer.attributes.FeedbackQuestionAttributes)

    @Test
    public void testIsResponseOfFeedbackQuestionVisibleToInstructor1() throws Exception {
        FeedbackParticipantType prevINSTRUCTORS = FeedbackParticipantType.INSTRUCTORS;
        try {
            FeedbackParticipantType instructors = FeedbackParticipantType.INSTRUCTORS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "INSTRUCTORS", instructors);
            FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
            FeedbackQuestionAttributes question = ((FeedbackQuestionAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackQuestionAttributes"));
            setField(question, "teammates.common.datatransfer.attributes.FeedbackQuestionAttributes", "showResponsesTo", null);
            
            /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToInstructor] produces [java.lang.NullPointerException]
                teammates.common.datatransfer.attributes.FeedbackQuestionAttributes.isResponseVisibleTo(FeedbackQuestionAttributes.java:171)
                teammates.logic.core.FeedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToInstructor(FeedbackResponsesLogic.java:329) */
            feedbackResponsesLogic.isResponseOfFeedbackQuestionVisibleToInstructor(question);
        } finally {
            setStaticField(FeedbackParticipantType.class, "INSTRUCTORS", prevINSTRUCTORS);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getSessionResultsForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getSessionResultsForCourse(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, teammates.common.datatransfer.FeedbackResultFetchType)

    @Test
    public void testGetSessionResultsForCourseByFuzzer() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResultFetchType fetchType = FeedbackResultFetchType.BOTH;
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getSessionResultsForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getSessionResultsForCourse(FeedbackResponsesLogic.java:459) */
        feedbackResponsesLogic.getSessionResultsForCourse("string", "", "\n\t\r", "   ", "string", fetchType);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getSessionResultsForUser

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getSessionResultsForUser(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String)

    @Test
    public void testGetSessionResultsForUserByFuzzer() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getSessionResultsForUser] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getSessionResultsForUser(FeedbackResponsesLogic.java:497) */
        feedbackResponsesLogic.getSessionResultsForUser("string", "\n\t\r", "   ", true, "\n\t\r");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSessionResultsForUser(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String)

    @Test
    public void testGetSessionResultsForUser1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        StudentsDb studentsDb = ((StudentsDb) createInstance("teammates.storage.api.StudentsDb"));
        setField(studentsLogic, "teammates.logic.core.StudentsLogic", "studentsDb", studentsDb);
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "studentsLogic", studentsLogic);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getSessionResultsForUser] produces [java.lang.AssertionError]
            teammates.storage.api.StudentsDb.getStudentsForCourse(StudentsDb.java:201)
            teammates.logic.core.StudentsLogic.getStudentsForCourse(StudentsLogic.java:118)
            teammates.logic.core.FeedbackResponsesLogic.getSessionResultsForUser(FeedbackResponsesLogic.java:497) */
        feedbackResponsesLogic.getSessionResultsForUser(null, null, null, false, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.hasResponsesForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method hasResponsesForCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#hasResponsesForCourse(String)}
     */
    @Test
    @DisplayName("hasResponsesForCourse: courseId = blank string -> throw NullPointerException")
    public void testHasResponsesForCourseThrowsNPEWithBlankString() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.hasResponsesForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.hasResponsesForCourse(FeedbackResponsesLogic.java:677) */
        feedbackResponsesLogic.hasResponsesForCourse("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasResponsesForCourse(java.lang.String)

    @Test
    public void testHasResponsesForCourse1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.hasResponsesForCourse] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.hasFeedbackResponseEntitiesForCourse(FeedbackResponsesDb.java:320)
            teammates.logic.core.FeedbackResponsesLogic.hasResponsesForCourse(FeedbackResponsesLogic.java:677) */
        feedbackResponsesLogic.hasResponsesForCourse(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingTeam

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method updateFeedbackResponsesForChangingTeam(java.lang.String, java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testUpdateFeedbackResponsesForChangingTeamByFuzzer() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingTeam] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesLogic.java:192)
            teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingTeam(FeedbackResponsesLogic.java:741) */
        feedbackResponsesLogic.updateFeedbackResponsesForChangingTeam("", "", "string", "\n\t\r");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateFeedbackResponsesForChangingTeam(java.lang.String, java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testUpdateFeedbackResponsesForChangingTeam1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingTeam] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesDb.java:212)
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesLogic.java:192)
            teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingTeam(FeedbackResponsesLogic.java:741) */
        feedbackResponsesLogic.updateFeedbackResponsesForChangingTeam(null, null, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingSection

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method updateFeedbackResponsesForChangingSection(java.lang.String, java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testUpdateFeedbackResponsesForChangingSectionByFuzzer() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingSection] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesLogic.java:192)
            teammates.logic.core.FeedbackResponsesLogic.updateSectionOfResponsesFromUser(FeedbackResponsesLogic.java:797)
            teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingSection(FeedbackResponsesLogic.java:772) */
        feedbackResponsesLogic.updateFeedbackResponsesForChangingSection("", "", "string", "\n\t\r");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateFeedbackResponsesForChangingSection(java.lang.String, java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testUpdateFeedbackResponsesForChangingSection1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingSection] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesDb.java:212)
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesLogic.java:192)
            teammates.logic.core.FeedbackResponsesLogic.updateSectionOfResponsesFromUser(FeedbackResponsesLogic.java:797)
            teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingSection(FeedbackResponsesLogic.java:772) */
        feedbackResponsesLogic.updateFeedbackResponsesForChangingSection(null, null, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method updateFeedbackResponsesForChangingEmail(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#updateFeedbackResponsesForChangingEmail(String, String, String)}
     */
    @Test
    @DisplayName("updateFeedbackResponsesForChangingEmail: courseId = blank string, oldEmail != empty string, newEmail has special characters -> throw NullPointerException")
    public void testUpdateFeedbackResponsesForChangingEmailThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesLogic.java:192)
            teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingEmail(FeedbackResponsesLogic.java:825) */
        feedbackResponsesLogic.updateFeedbackResponsesForChangingEmail("   ", "string", "\n\t\r");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateFeedbackResponsesForChangingEmail(java.lang.String, java.lang.String, java.lang.String)

    @Test
    public void testUpdateFeedbackResponsesForChangingEmail1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingEmail] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesDb.java:212)
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesLogic.java:192)
            teammates.logic.core.FeedbackResponsesLogic.updateFeedbackResponsesForChangingEmail(FeedbackResponsesLogic.java:825) */
        feedbackResponsesLogic.updateFeedbackResponsesForChangingEmail(null, null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponses

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteFeedbackResponses(teammates.common.datatransfer.AttributesDeletionQuery)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#deleteFeedbackResponses(AttributesDeletionQuery)}
     * @utbot.invokes {@link FeedbackResponsesDb#deleteFeedbackResponses(AttributesDeletionQuery)}
     * @utbot.throwsException {@link NullPointerException} in: frDb.deleteFeedbackResponses(query);
     */
    @Test
    @DisplayName("deleteFeedbackResponses: frDb.deleteFeedbackResponses(query) : True -> ThrowNullPointerException")
    public void testDeleteFeedbackResponses_FeedbackResponsesDbDeleteFeedbackResponses() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponses] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponses(FeedbackResponsesLogic.java:858) */
        feedbackResponsesLogic.deleteFeedbackResponses(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteFeedbackResponses(teammates.common.datatransfer.AttributesDeletionQuery)

    @Test
    public void testDeleteFeedbackResponses1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponses] produces [java.lang.AssertionError]
            teammates.storage.api.FeedbackResponsesDb.deleteFeedbackResponses(FeedbackResponsesDb.java:300)
            teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponses(FeedbackResponsesLogic.java:858) */
        feedbackResponsesLogic.deleteFeedbackResponses(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponseCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteFeedbackResponseCascade(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#deleteFeedbackResponseCascade(String)}
     */
    @Test
    @DisplayName("deleteFeedbackResponseCascade: responseId = blank string -> throw NullPointerException")
    public void testDeleteFeedbackResponseCascadeThrowsNPEWithBlankString() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponseCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponseCascade(FeedbackResponsesLogic.java:865) */
        feedbackResponsesLogic.deleteFeedbackResponseCascade("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteFeedbackResponseCascade(java.lang.String)

    @Test
    public void testDeleteFeedbackResponseCascade1() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frcLogic", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponseCascade] produces [java.lang.AssertionError]
            teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId(AttributesDeletionQuery.java:121)
            teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponseCascade(FeedbackResponsesLogic.java:867) */
        feedbackResponsesLogic.deleteFeedbackResponseCascade(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponsesForQuestionCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteFeedbackResponsesForQuestionCascade(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#deleteFeedbackResponsesForQuestionCascade(String)}
     */
    @Test
    @DisplayName("deleteFeedbackResponsesForQuestionCascade: feedbackQuestionId = blank string -> throw NullPointerException")
    public void testDeleteFeedbackResponsesForQuestionCascadeThrowsNPEWithBlankString() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponsesForQuestionCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponses(FeedbackResponsesLogic.java:858)
            teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponsesForQuestionCascade(FeedbackResponsesLogic.java:880) */
        feedbackResponsesLogic.deleteFeedbackResponsesForQuestionCascade("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponsesInvolvedEntityOfCourseCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteFeedbackResponsesInvolvedEntityOfCourseCascade(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#deleteFeedbackResponsesInvolvedEntityOfCourseCascade(String, String)}
     */
    @Test
    @DisplayName("deleteFeedbackResponsesInvolvedEntityOfCourseCascade: courseId has special characters, entityEmail = blank string -> throw NullPointerException")
    public void testDeleteFeedbackResponsesInvolvedEntityOfCourseCascadeThrowsNPEWithBlankStrings() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponsesInvolvedEntityOfCourseCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getFeedbackResponsesFromGiverForCourse(FeedbackResponsesLogic.java:192)
            teammates.logic.core.FeedbackResponsesLogic.deleteFeedbackResponsesInvolvedEntityOfCourseCascade(FeedbackResponsesLogic.java:893) */
        feedbackResponsesLogic.deleteFeedbackResponsesInvolvedEntityOfCourseCascade("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.FeedbackResponsesLogic.getNumFeedbackResponsesByTimeRange

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumFeedbackResponsesByTimeRange(java.time.Instant, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackResponsesLogic}
     * @utbot.methodUnderTest {@link FeedbackResponsesLogic#getNumFeedbackResponsesByTimeRange(Instant, Instant)}
     * @utbot.invokes {@link FeedbackResponsesDb#getNumFeedbackResponsesByTimeRange(Instant, Instant)}
     * @utbot.throwsException {@link NullPointerException} in: return frDb.getNumFeedbackResponsesByTimeRange(startTime, endTime);
     */
    @Test
    @DisplayName("getNumFeedbackResponsesByTimeRange: return frDb.getNumFeedbackResponsesByTimeRange(startTime, endTime) : True -> ThrowNullPointerException")
    public void testGetNumFeedbackResponsesByTimeRange_FeedbackResponsesDbGetNumFeedbackResponsesByTimeRange() throws Exception {
        FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
        setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", null);
        
        /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getNumFeedbackResponsesByTimeRange] produces [java.lang.NullPointerException]
            teammates.logic.core.FeedbackResponsesLogic.getNumFeedbackResponsesByTimeRange(FeedbackResponsesLogic.java:1011) */
        feedbackResponsesLogic.getNumFeedbackResponsesByTimeRange(null, null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getNumFeedbackResponsesByTimeRange(java.time.Instant, java.time.Instant)

    @Test
    public void testGetNumFeedbackResponsesByTimeRange1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            setStaticField(objectifyServiceClazz, "factory", factory);
            FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
            FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
            setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
            
            /* This test fails because method [teammates.logic.core.FeedbackResponsesLogic.getNumFeedbackResponsesByTimeRange] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.FeedbackResponsesDb.load(FeedbackResponsesDb.java:414)
                teammates.storage.api.FeedbackResponsesDb.getNumFeedbackResponsesByTimeRange(FeedbackResponsesDb.java:439)
                teammates.logic.core.FeedbackResponsesLogic.getNumFeedbackResponsesByTimeRange(FeedbackResponsesLogic.java:1011) */
            feedbackResponsesLogic.getNumFeedbackResponsesByTimeRange(null, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion
}
