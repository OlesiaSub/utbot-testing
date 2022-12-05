package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.MockedStatic;
import teammates.common.datatransfer.questions.FeedbackQuestionType;
import teammates.common.datatransfer.FeedbackParticipantType;

import java.util.List;
import java.time.Instant;

import com.googlecode.objectify.Key;

import java.util.ArrayList;

import static java.util.Collections.emptyList;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class FeedbackQuestionTest {
    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getCreatedAt

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCreatedAt()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getCreatedAt()}
     */
    @Test
    @DisplayName("getCreatedAt: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetCreatedAt() throws Exception {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        Instant actual = feedbackQuestion.getCreatedAt();

        Instant expected = ((Instant) createInstance("java.time.Instant"));
        // java.time.Instant has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getUpdatedAt

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getUpdatedAt()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getUpdatedAt()}
     */
    @Test
    @DisplayName("getUpdatedAt: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetUpdatedAt() throws Exception {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        Instant actual = feedbackQuestion.getUpdatedAt();

        Instant expected = ((Instant) createInstance("java.time.Instant"));
        // java.time.Instant has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setCreatedAt(Instant)}
     * @utbot.invokes {@link FeedbackQuestion#setLastUpdate(Instant)}
     */
    @Test
    @DisplayName("setCreatedAt: -> FeedbackQuestionSetLastUpdate")
    public void testSetCreatedAt_FeedbackQuestionSetLastUpdate() throws Exception {
        FeedbackQuestion feedbackQuestion = ((FeedbackQuestion) createInstance("teammates.storage.entity.FeedbackQuestion"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackQuestion, "teammates.storage.entity.FeedbackQuestion", "createdAt", instantMock);
        setField(feedbackQuestion, "teammates.storage.entity.FeedbackQuestion", "updatedAt", instantMock);

        feedbackQuestion.setCreatedAt(null);

        Instant finalFeedbackQuestionCreatedAt = ((Instant) getFieldValue(feedbackQuestion, "teammates.storage.entity.FeedbackQuestion", "createdAt"));

        assertNull(finalFeedbackQuestionCreatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setLastUpdate

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLastUpdate(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setLastUpdate(Instant)}
     */
    @Test
    @DisplayName("setLastUpdate: ")
    public void testSetLastUpdate() throws Exception {
        FeedbackQuestion feedbackQuestion = ((FeedbackQuestion) createInstance("teammates.storage.entity.FeedbackQuestion"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackQuestion, "teammates.storage.entity.FeedbackQuestion", "updatedAt", instantMock);

        feedbackQuestion.setLastUpdate(null);

        Instant finalFeedbackQuestionUpdatedAt = ((Instant) getFieldValue(feedbackQuestion, "teammates.storage.entity.FeedbackQuestion", "updatedAt"));

        assertNull(finalFeedbackQuestionUpdatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getId

    ///region

    @Test
    public void testGetId1() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.RECEIVER_TEAM_MEMBERS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("KIBAA$", "", "KIBAA$", "oesjb", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1362024251, list, list, list);
        
        /* This test fails because method [teammates.storage.entity.FeedbackQuestion.getId] produces [java.lang.NullPointerException]
            teammates.storage.entity.FeedbackQuestion.getId(FeedbackQuestion.java:124) */
        feedbackQuestion.getId();
    }

    @Test
    public void testGetId2() throws Exception {
        MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Key.class);
            Key keyMock = mock(Key.class);
            (when(keyMock.toLegacyUrlSafe())).thenReturn(((String) null));
            (mockedStatic.when(() -> Key.create(any(Class.class), anyLong()))).thenReturn(keyMock);
            FeedbackQuestion feedbackQuestion = ((FeedbackQuestion) createInstance("teammates.storage.entity.FeedbackQuestion"));
            Long long1 = -255L;
            setField(feedbackQuestion, "teammates.storage.entity.FeedbackQuestion", "feedbackQuestionId", long1);
            
            /* This test fails because method [teammates.storage.entity.FeedbackQuestion.getId] produces [java.lang.NullPointerException]
                teammates.storage.entity.FeedbackQuestion.getId(FeedbackQuestion.java:132) */
            feedbackQuestion.getId();
        } finally {
            mockedStatic.close();
        }
    }

    @Test
    public void testGetId3() throws Exception {
        MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Key.class);
            (mockedStatic.when(() -> Key.create(any(Class.class), anyLong()))).thenReturn(((Key) null));
            FeedbackQuestion feedbackQuestion = ((FeedbackQuestion) createInstance("teammates.storage.entity.FeedbackQuestion"));
            Long long1 = -255L;
            setField(feedbackQuestion, "teammates.storage.entity.FeedbackQuestion", "feedbackQuestionId", long1);
            
            /* This test fails because method [teammates.storage.entity.FeedbackQuestion.getId] produces [java.lang.NullPointerException]
                teammates.storage.entity.FeedbackQuestion.getId(FeedbackQuestion.java:124) */
            feedbackQuestion.getId();
        } finally {
            mockedStatic.close();
        }
    }

    @Test
    public void testGetId4() throws Exception {
        MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Key.class);
            Key keyMock = mock(Key.class);
            String string = "";
            (when(keyMock.toLegacyUrlSafe())).thenReturn(string);
            (mockedStatic.when(() -> Key.create(any(Class.class), anyLong()))).thenReturn(keyMock);
            FeedbackQuestion feedbackQuestion = ((FeedbackQuestion) createInstance("teammates.storage.entity.FeedbackQuestion"));
            Long long1 = -255L;
            setField(feedbackQuestion, "teammates.storage.entity.FeedbackQuestion", "feedbackQuestionId", long1);
            
            /* This test fails because method [teammates.storage.entity.FeedbackQuestion.getId] produces [java.lang.StringIndexOutOfBoundsException: begin 0, end -4, length 0]
                java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
                java.base/java.lang.String.substring(String.java:1874)
                teammates.storage.entity.FeedbackQuestion.getId(FeedbackQuestion.java:133) */
            feedbackQuestion.getId();
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setFeedbackQuestionId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFeedbackQuestionId(java.lang.Long)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setFeedbackQuestionId(Long)}
     */
    @Test
    @DisplayName("setFeedbackQuestionId: feedbackQuestionId = 0L")
    public void testSetFeedbackQuestionIdWithCornerCase() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        feedbackQuestion.setFeedbackQuestionId(0L);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getFeedbackSessionName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFeedbackSessionName()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getFeedbackSessionName()}
     */
    @Test
    @DisplayName("getFeedbackSessionName: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetFeedbackSessionName() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        String actual = feedbackQuestion.getFeedbackSessionName();

        String expected = "hlcoj";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setFeedbackSessionName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFeedbackSessionName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setFeedbackSessionName(String)}
     */
    @Test
    @DisplayName("setFeedbackSessionName: feedbackSessionName = blank string")
    public void testSetFeedbackSessionNameWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        feedbackQuestion.setFeedbackSessionName("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getCourseId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCourseId()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getCourseId()}
     */
    @Test
    @DisplayName("getCourseId: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetCourseId() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        String actual = feedbackQuestion.getCourseId();

        String expected = "oesjb";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setCourseId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setCourseId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setCourseId(String)}
     */
    @Test
    @DisplayName("setCourseId: courseId = blank string")
    public void testSetCourseIdWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        feedbackQuestion.setCourseId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getQuestionText

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getQuestionText()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getQuestionText()}
     */
    @Test
    @DisplayName("getQuestionText: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetQuestionText() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        String actual = feedbackQuestion.getQuestionText();

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setQuestionText

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setQuestionText(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setQuestionText(String)}
     */
    @Test
    @DisplayName("setQuestionText: questionText = blank string")
    public void testSetQuestionTextWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        feedbackQuestion.setQuestionText("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getQuestionDescription

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getQuestionDescription()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getQuestionDescription()}
     */
    @Test
    @DisplayName("getQuestionDescription: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetQuestionDescription() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        String actual = feedbackQuestion.getQuestionDescription();

        String expected = "noimn";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setQuestionDescription

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setQuestionDescription(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setQuestionDescription(String)}
     */
    @Test
    @DisplayName("setQuestionDescription: questionDescription = blank string")
    public void testSetQuestionDescriptionWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        feedbackQuestion.setQuestionDescription("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getQuestionType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getQuestionType()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getQuestionType()}
     */
    @Test
    @DisplayName("getQuestionType: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetQuestionType() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        FeedbackQuestionType actual = feedbackQuestion.getQuestionType();

        assertEquals(feedbackQuestionType, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setQuestionType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setQuestionType(teammates.common.datatransfer.questions.FeedbackQuestionType)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setQuestionType(FeedbackQuestionType)}
     */
    @Test
    @DisplayName("setQuestionType: questionType = CONSTSUM_OPTIONS")
    public void testSetQuestionType() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);
        FeedbackQuestionType questionType = FeedbackQuestionType.CONSTSUM_OPTIONS;

        feedbackQuestion.setQuestionType(questionType);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getQuestionNumber

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getQuestionNumber()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getQuestionNumber()}
     */
    @Test
    @DisplayName("getQuestionNumber: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List) -> return 687108745")
    public void testGetQuestionNumber() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        int actual = feedbackQuestion.getQuestionNumber();

        assertEquals(687108745, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setQuestionNumber

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setQuestionNumber(int)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setQuestionNumber(int)}
     */
    @Test
    @DisplayName("setQuestionNumber: questionNumber > 0")
    public void testSetQuestionNumber() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        feedbackQuestion.setQuestionNumber(1);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getGiverType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getGiverType()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getGiverType()}
     */
    @Test
    @DisplayName("getGiverType: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetGiverType() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        FeedbackParticipantType actual = feedbackQuestion.getGiverType();

        assertEquals(feedbackParticipantType, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setGiverType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setGiverType(teammates.common.datatransfer.FeedbackParticipantType)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setGiverType(FeedbackParticipantType)}
     */
    @Test
    @DisplayName("setGiverType: giverType = TEAMS_IN_SAME_SECTION")
    public void testSetGiverType() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);
        FeedbackParticipantType giverType = FeedbackParticipantType.TEAMS_IN_SAME_SECTION;

        feedbackQuestion.setGiverType(giverType);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getRecipientType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRecipientType()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getRecipientType()}
     */
    @Test
    @DisplayName("getRecipientType: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetRecipientType() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        FeedbackParticipantType actual = feedbackQuestion.getRecipientType();

        assertEquals(feedbackParticipantType1, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setRecipientType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setRecipientType(teammates.common.datatransfer.FeedbackParticipantType)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setRecipientType(FeedbackParticipantType)}
     */
    @Test
    @DisplayName("setRecipientType: recipientType = TEAMS_IN_SAME_SECTION")
    public void testSetRecipientType() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);
        FeedbackParticipantType recipientType = FeedbackParticipantType.TEAMS_IN_SAME_SECTION;

        feedbackQuestion.setRecipientType(recipientType);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getNumberOfEntitiesToGiveFeedbackTo

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getNumberOfEntitiesToGiveFeedbackTo()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getNumberOfEntitiesToGiveFeedbackTo()}
     */
    @Test
    @DisplayName("getNumberOfEntitiesToGiveFeedbackTo: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List) -> return 1338840503")
    public void testGetNumberOfEntitiesToGiveFeedbackTo() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        int actual = feedbackQuestion.getNumberOfEntitiesToGiveFeedbackTo();

        assertEquals(1338840503, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setNumberOfEntitiesToGiveFeedbackTo

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setNumberOfEntitiesToGiveFeedbackTo(int)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setNumberOfEntitiesToGiveFeedbackTo(int)}
     */
    @Test
    @DisplayName("setNumberOfEntitiesToGiveFeedbackTo: numberOfEntitiesToGiveFeedbackTo > 0")
    public void testSetNumberOfEntitiesToGiveFeedbackTo() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        feedbackQuestion.setNumberOfEntitiesToGiveFeedbackTo(1);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getShowResponsesTo

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getShowResponsesTo()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getShowResponsesTo()}
     */
    @Test
    @DisplayName("getShowResponsesTo: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetShowResponsesTo() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        Object actual = feedbackQuestion.getShowResponsesTo();

        // java.util.List is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(list, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setShowResponsesTo

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setShowResponsesTo(java.util.List)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setShowResponsesTo(List)}
     */
    @Test
    @DisplayName("setShowResponsesTo: showResponsesTo = test collection")
    public void testSetShowResponsesTo() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);
        ArrayList showResponsesTo = new ArrayList();
        FeedbackParticipantType feedbackParticipantType2 = FeedbackParticipantType.STUDENTS_IN_SAME_SECTION;
        showResponsesTo.add(feedbackParticipantType2);
        FeedbackParticipantType feedbackParticipantType3 = FeedbackParticipantType.OWN_TEAM_MEMBERS;
        showResponsesTo.add(feedbackParticipantType3);
        FeedbackParticipantType feedbackParticipantType4 = FeedbackParticipantType.STUDENTS;
        showResponsesTo.add(feedbackParticipantType4);

        feedbackQuestion.setShowResponsesTo(showResponsesTo);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getShowGiverNameTo

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getShowGiverNameTo()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getShowGiverNameTo()}
     */
    @Test
    @DisplayName("getShowGiverNameTo: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetShowGiverNameTo() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        Object actual = feedbackQuestion.getShowGiverNameTo();

        // java.util.List is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(list, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setShowGiverNameTo

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setShowGiverNameTo(java.util.List)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setShowGiverNameTo(List)}
     */
    @Test
    @DisplayName("setShowGiverNameTo: showGiverNameTo = test collection")
    public void testSetShowGiverNameTo() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);
        ArrayList showGiverNameTo = new ArrayList();
        FeedbackParticipantType feedbackParticipantType2 = FeedbackParticipantType.STUDENTS_IN_SAME_SECTION;
        showGiverNameTo.add(feedbackParticipantType2);
        FeedbackParticipantType feedbackParticipantType3 = FeedbackParticipantType.OWN_TEAM_MEMBERS;
        showGiverNameTo.add(feedbackParticipantType3);
        FeedbackParticipantType feedbackParticipantType4 = FeedbackParticipantType.STUDENTS;
        showGiverNameTo.add(feedbackParticipantType4);

        feedbackQuestion.setShowGiverNameTo(showGiverNameTo);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.getShowRecipientNameTo

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getShowRecipientNameTo()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#getShowRecipientNameTo()}
     */
    @Test
    @DisplayName("getShowRecipientNameTo: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testGetShowRecipientNameTo() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        Object actual = feedbackQuestion.getShowRecipientNameTo();

        // java.util.List is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(list, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.setShowRecipientNameTo

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setShowRecipientNameTo(java.util.List)

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#setShowRecipientNameTo(List)}
     */
    @Test
    @DisplayName("setShowRecipientNameTo: showRecipientNameTo = test collection")
    public void testSetShowRecipientNameTo() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.RANK_OPTIONS;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.STUDENTS_EXCLUDING_SELF;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.NONE;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("noimn", "oxhrh", "oesjb", "syiug", -2055646569, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);
        ArrayList showRecipientNameTo = new ArrayList();
        FeedbackParticipantType feedbackParticipantType2 = FeedbackParticipantType.STUDENTS_IN_SAME_SECTION;
        showRecipientNameTo.add(feedbackParticipantType2);
        FeedbackParticipantType feedbackParticipantType3 = FeedbackParticipantType.OWN_TEAM_MEMBERS;
        showRecipientNameTo.add(feedbackParticipantType3);
        FeedbackParticipantType feedbackParticipantType4 = FeedbackParticipantType.STUDENTS;
        showRecipientNameTo.add(feedbackParticipantType4);

        feedbackQuestion.setShowRecipientNameTo(showRecipientNameTo);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackQuestion.updateLastUpdateTimestamp

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method updateLastUpdateTimestamp()

    /**
     * @utbot.classUnderTest {@link FeedbackQuestion}
     * @utbot.methodUnderTest {@link FeedbackQuestion#updateLastUpdateTimestamp()}
     */
    @Test
    @DisplayName("updateLastUpdateTimestamp: arg_0 = FeedbackQuestion(String, String, String, String, int, FeedbackQuestionType, FeedbackParticipantType, FeedbackParticipantType, int, List, List, List)")
    public void testUpdateLastUpdateTimestamp() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONTRIB;
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        List list = emptyList();
        FeedbackQuestion feedbackQuestion = new FeedbackQuestion("hlcoj", "oesjb", "", "noimn", 687108745, feedbackQuestionType, feedbackParticipantType, feedbackParticipantType1, 1338840503, list, list, list);

        feedbackQuestion.updateLastUpdateTimestamp();
    }
    ///endregion

    ///endregion
}
