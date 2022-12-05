package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.FeedbackParticipantType;

import java.util.ArrayList;
import java.util.List;
import java.time.Instant;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.mockito.Mockito.mock;

public final class FeedbackResponseCommentTest {
    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getFeedbackResponseCommentId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFeedbackResponseCommentId()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getFeedbackResponseCommentId()}
     * @utbot.returnsFrom {@code return feedbackResponseCommentId;}
     */
    @Test
    @DisplayName("getFeedbackResponseCommentId: -> return feedbackResponseCommentId")
    public void testGetFeedbackResponseCommentId_ReturnFeedbackResponseCommentId() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        Long long1 = 0L;
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "feedbackResponseCommentId", long1);

        Long actual = feedbackResponseComment.getFeedbackResponseCommentId();

        assertEquals(long1, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getCourseId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCourseId()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getCourseId()}
     * @utbot.returnsFrom {@code return courseId;}
     */
    @Test
    @DisplayName("getCourseId: -> return courseId")
    public void testGetCourseId_ReturnCourseId() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "courseId", null);

        String actual = feedbackResponseComment.getCourseId();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setCourseId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setCourseId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setCourseId(String)}
     */
    @Test
    @DisplayName("setCourseId: courseId = blank string")
    public void testSetCourseIdWithBlankString() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setCourseId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getFeedbackSessionName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFeedbackSessionName()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getFeedbackSessionName()}
     * @utbot.returnsFrom {@code return feedbackSessionName;}
     */
    @Test
    @DisplayName("getFeedbackSessionName: -> return feedbackSessionName")
    public void testGetFeedbackSessionName_ReturnFeedbackSessionName() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "feedbackSessionName", null);

        String actual = feedbackResponseComment.getFeedbackSessionName();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setFeedbackSessionName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFeedbackSessionName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setFeedbackSessionName(String)}
     */
    @Test
    @DisplayName("setFeedbackSessionName: feedbackSessionName = blank string")
    public void testSetFeedbackSessionNameWithBlankString() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setFeedbackSessionName("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getFeedbackQuestionId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFeedbackQuestionId()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getFeedbackQuestionId()}
     * @utbot.returnsFrom {@code return feedbackQuestionId;}
     */
    @Test
    @DisplayName("getFeedbackQuestionId: -> return feedbackQuestionId")
    public void testGetFeedbackQuestionId_ReturnFeedbackQuestionId() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "feedbackQuestionId", null);

        String actual = feedbackResponseComment.getFeedbackQuestionId();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setFeedbackQuestionId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFeedbackQuestionId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setFeedbackQuestionId(String)}
     */
    @Test
    @DisplayName("setFeedbackQuestionId: feedbackQuestionId = blank string")
    public void testSetFeedbackQuestionIdWithBlankString() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setFeedbackQuestionId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getIsVisibilityFollowingFeedbackQuestion

    ///region

    @Test
    public void testGetIsVisibilityFollowingFeedbackQuestion1() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "isVisibilityFollowingFeedbackQuestion", null);

        boolean actual = feedbackResponseComment.getIsVisibilityFollowingFeedbackQuestion();

        assertTrue(actual);
    }

    @Test
    public void testGetIsVisibilityFollowingFeedbackQuestion2() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        Boolean boolean1 = false;
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "isVisibilityFollowingFeedbackQuestion", boolean1);

        boolean actual = feedbackResponseComment.getIsVisibilityFollowingFeedbackQuestion();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setIsVisibilityFollowingFeedbackQuestion

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setIsVisibilityFollowingFeedbackQuestion(java.lang.Boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setIsVisibilityFollowingFeedbackQuestion(Boolean)}
     */
    @Test
    @DisplayName("setIsVisibilityFollowingFeedbackQuestion: isVisibilityFollowingFeedbackQuestion = false")
    public void testSetIsVisibilityFollowingFeedbackQuestion() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setIsVisibilityFollowingFeedbackQuestion(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getGiverEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGiverEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getGiverEmail()}
     * @utbot.returnsFrom {@code return giverEmail;}
     */
    @Test
    @DisplayName("getGiverEmail: -> return giverEmail")
    public void testGetGiverEmail_ReturnGiverEmail() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "giverEmail", null);

        String actual = feedbackResponseComment.getGiverEmail();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setGiverEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setGiverEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setGiverEmail(String)}
     */
    @Test
    @DisplayName("setGiverEmail: giverEmail = blank string")
    public void testSetGiverEmailWithBlankString() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setGiverEmail("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getCommentGiverType

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCommentGiverType()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getCommentGiverType()}
     * @utbot.returnsFrom {@code return commentGiverType;}
     */
    @Test
    @DisplayName("getCommentGiverType: -> return commentGiverType")
    public void testGetCommentGiverType_ReturnCommentGiverType() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "commentGiverType", null);

        FeedbackParticipantType actual = feedbackResponseComment.getCommentGiverType();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setCommentGiverType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setCommentGiverType(teammates.common.datatransfer.FeedbackParticipantType)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setCommentGiverType(FeedbackParticipantType)}
     */
    @Test
    @DisplayName("setCommentGiverType: commentGiverType = TEAMS_IN_SAME_SECTION")
    public void testSetCommentGiverType() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        FeedbackParticipantType commentGiverType = FeedbackParticipantType.TEAMS_IN_SAME_SECTION;

        feedbackResponseComment.setCommentGiverType(commentGiverType);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setShowCommentTo

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setShowCommentTo(java.util.List)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setShowCommentTo(List)}
     */
    @Test
    @DisplayName("setShowCommentTo: showCommentTo = test collection")
    public void testSetShowCommentTo() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        ArrayList showCommentTo = new ArrayList();
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_IN_SAME_SECTION;
        showCommentTo.add(feedbackParticipantType);
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS;
        showCommentTo.add(feedbackParticipantType1);
        FeedbackParticipantType feedbackParticipantType2 = FeedbackParticipantType.STUDENTS;
        showCommentTo.add(feedbackParticipantType2);

        feedbackResponseComment.setShowCommentTo(showCommentTo);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getShowCommentTo

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShowCommentTo()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getShowCommentTo()}
     * @utbot.returnsFrom {@code return showCommentTo;}
     */
    @Test
    @DisplayName("getShowCommentTo: -> return showCommentTo")
    public void testGetShowCommentTo_ReturnShowCommentTo() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "showCommentTo", null);

        List actual = feedbackResponseComment.getShowCommentTo();

        assertNull(actual);

        List finalFeedbackResponseCommentShowCommentTo = ((List) getFieldValue(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "showCommentTo"));

        assertNull(finalFeedbackResponseCommentShowCommentTo);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setShowGiverNameTo

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setShowGiverNameTo(java.util.List)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setShowGiverNameTo(List)}
     */
    @Test
    @DisplayName("setShowGiverNameTo: showGiverNameTo = test collection")
    public void testSetShowGiverNameTo() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        ArrayList showGiverNameTo = new ArrayList();
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_IN_SAME_SECTION;
        showGiverNameTo.add(feedbackParticipantType);
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS;
        showGiverNameTo.add(feedbackParticipantType1);
        FeedbackParticipantType feedbackParticipantType2 = FeedbackParticipantType.STUDENTS;
        showGiverNameTo.add(feedbackParticipantType2);

        feedbackResponseComment.setShowGiverNameTo(showGiverNameTo);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getShowGiverNameTo

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShowGiverNameTo()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getShowGiverNameTo()}
     * @utbot.returnsFrom {@code return showGiverNameTo;}
     */
    @Test
    @DisplayName("getShowGiverNameTo: -> return showGiverNameTo")
    public void testGetShowGiverNameTo_ReturnShowGiverNameTo() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "showGiverNameTo", null);

        List actual = feedbackResponseComment.getShowGiverNameTo();

        assertNull(actual);

        List finalFeedbackResponseCommentShowGiverNameTo = ((List) getFieldValue(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "showGiverNameTo"));

        assertNull(finalFeedbackResponseCommentShowGiverNameTo);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getFeedbackResponseId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFeedbackResponseId()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getFeedbackResponseId()}
     * @utbot.returnsFrom {@code return feedbackResponseId;}
     */
    @Test
    @DisplayName("getFeedbackResponseId: -> return feedbackResponseId")
    public void testGetFeedbackResponseId_ReturnFeedbackResponseId() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "feedbackResponseId", null);

        String actual = feedbackResponseComment.getFeedbackResponseId();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setFeedbackResponseId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFeedbackResponseId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setFeedbackResponseId(String)}
     */
    @Test
    @DisplayName("setFeedbackResponseId: feedbackResponseId = blank string")
    public void testSetFeedbackResponseIdWithBlankString() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setFeedbackResponseId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatedAt()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getCreatedAt()}
     * @utbot.returnsFrom {@code return createdAt;}
     */
    @Test
    @DisplayName("getCreatedAt: -> return createdAt")
    public void testGetCreatedAt_ReturnCreatedAt() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "createdAt", instantMock);

        Instant actual = feedbackResponseComment.getCreatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setCreatedAt(Instant)}
     */
    @Test
    @DisplayName("setCreatedAt: ")
    public void testSetCreatedAt() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "createdAt", instantMock);

        feedbackResponseComment.setCreatedAt(null);

        Instant finalFeedbackResponseCommentCreatedAt = ((Instant) getFieldValue(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "createdAt"));

        assertNull(finalFeedbackResponseCommentCreatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getCommentText

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCommentText()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getCommentText()}
     * @utbot.returnsFrom {@code return commentText;}
     */
    @Test
    @DisplayName("getCommentText: -> return commentText")
    public void testGetCommentText_ReturnCommentText() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        String string = "";
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "commentText", string);

        String actual = feedbackResponseComment.getCommentText();

        assertEquals(string, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setCommentText

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setCommentText(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setCommentText(String)}
     */
    @Test
    @DisplayName("setCommentText: commentText = blank string")
    public void testSetCommentTextWithBlankString() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setCommentText("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getGiverSection

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGiverSection()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getGiverSection()}
     * @utbot.returnsFrom {@code return giverSection;}
     */
    @Test
    @DisplayName("getGiverSection: -> return giverSection")
    public void testGetGiverSection_ReturnGiverSection() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "giverSection", null);

        String actual = feedbackResponseComment.getGiverSection();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setGiverSection

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setGiverSection(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setGiverSection(String)}
     */
    @Test
    @DisplayName("setGiverSection: giverSection = blank string")
    public void testSetGiverSectionWithBlankString() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setGiverSection("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getReceiverSection

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReceiverSection()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getReceiverSection()}
     * @utbot.returnsFrom {@code return receiverSection;}
     */
    @Test
    @DisplayName("getReceiverSection: -> return receiverSection")
    public void testGetReceiverSection_ReturnReceiverSection() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "receiverSection", null);

        String actual = feedbackResponseComment.getReceiverSection();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setReceiverSection

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setReceiverSection(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setReceiverSection(String)}
     */
    @Test
    @DisplayName("setReceiverSection: receiverSection = blank string")
    public void testSetReceiverSectionWithBlankString() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setReceiverSection("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setLastEditorEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setLastEditorEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setLastEditorEmail(String)}
     */
    @Test
    @DisplayName("setLastEditorEmail: lastEditorEmail = blank string")
    public void testSetLastEditorEmailWithBlankString() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setLastEditorEmail("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getLastEditorEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLastEditorEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getLastEditorEmail()}
     * @utbot.returnsFrom {@code return this.lastEditorEmail;}
     */
    @Test
    @DisplayName("getLastEditorEmail: -> return this.lastEditorEmail")
    public void testGetLastEditorEmail_ReturnThisLastEditorEmail() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "lastEditorEmail", null);

        String actual = feedbackResponseComment.getLastEditorEmail();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getLastEditedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLastEditedAt()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getLastEditedAt()}
     * @utbot.returnsFrom {@code return this.lastEditedAt;}
     */
    @Test
    @DisplayName("getLastEditedAt: -> return this.lastEditedAt")
    public void testGetLastEditedAt_ReturnThisLastEditedAt() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "lastEditedAt", instantMock);

        Instant actual = feedbackResponseComment.getLastEditedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setLastEditedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLastEditedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setLastEditedAt(Instant)}
     */
    @Test
    @DisplayName("setLastEditedAt: ")
    public void testSetLastEditedAt() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "lastEditedAt", instantMock);

        feedbackResponseComment.setLastEditedAt(null);

        Instant finalFeedbackResponseCommentLastEditedAt = ((Instant) getFieldValue(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "lastEditedAt"));

        assertNull(finalFeedbackResponseCommentLastEditedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.getIsCommentFromFeedbackParticipant

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIsCommentFromFeedbackParticipant()

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#getIsCommentFromFeedbackParticipant()}
     * @utbot.returnsFrom {@code return this.isCommentFromFeedbackParticipant;}
     */
    @Test
    @DisplayName("getIsCommentFromFeedbackParticipant: -> return this.isCommentFromFeedbackParticipant")
    public void testGetIsCommentFromFeedbackParticipant_ReturnThisIsCommentFromFeedbackParticipant() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));
        setField(feedbackResponseComment, "teammates.storage.entity.FeedbackResponseComment", "isCommentFromFeedbackParticipant", false);

        boolean actual = feedbackResponseComment.getIsCommentFromFeedbackParticipant();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponseComment.setIsCommentFromFeedbackParticipant

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setIsCommentFromFeedbackParticipant(boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackResponseComment}
     * @utbot.methodUnderTest {@link FeedbackResponseComment#setIsCommentFromFeedbackParticipant(boolean)}
     */
    @Test
    @DisplayName("setIsCommentFromFeedbackParticipant: isCommentFromFeedbackParticipant = false")
    public void testSetIsCommentFromFeedbackParticipant() throws Exception {
        FeedbackResponseComment feedbackResponseComment = ((FeedbackResponseComment) createInstance("teammates.storage.entity.FeedbackResponseComment"));

        feedbackResponseComment.setIsCommentFromFeedbackParticipant(false);
    }
    ///endregion

    ///endregion
}
