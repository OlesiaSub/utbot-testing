package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.questions.FeedbackQuestionType;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.mockito.Mockito.mock;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;

public final class FeedbackResponseTest {
    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.generateId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method generateId(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#generateId(String, String, String)}
     */
    @Test
    @DisplayName("generateId: arg_0 has special characters, giver = blank string, receiver != empty string")
    public void testGenerateIdWithBlankStringsAndNonEmptyString() {
        String actual = FeedbackResponse.generateId("\n\t\r", "   ", "string");

        String expected = "\n\t\r%   %string";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getId()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getId()}
     */
    @Test
    @DisplayName("getId: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetId() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        String actual = feedbackResponse.getId();

        String expected = "oxhrh%syiug%hlcoj";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getFeedbackSessionName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFeedbackSessionName()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getFeedbackSessionName()}
     */
    @Test
    @DisplayName("getFeedbackSessionName: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetFeedbackSessionName() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        String actual = feedbackResponse.getFeedbackSessionName();

        String expected = "oesjb";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setFeedbackSessionName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFeedbackSessionName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setFeedbackSessionName(String)}
     */
    @Test
    @DisplayName("setFeedbackSessionName: feedbackSessionName = blank string")
    public void testSetFeedbackSessionNameWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("noimn", "syiug", "oesjb", feedbackQuestionType, "syiug", "syiug", "noimn", "noimn", "oesjb");

        feedbackResponse.setFeedbackSessionName("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getCourseId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCourseId()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getCourseId()}
     */
    @Test
    @DisplayName("getCourseId: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetCourseId() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        String actual = feedbackResponse.getCourseId();

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setCourseId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setCourseId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setCourseId(String)}
     */
    @Test
    @DisplayName("setCourseId: courseId = blank string")
    public void testSetCourseIdWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("noimn", "syiug", "oesjb", feedbackQuestionType, "syiug", "syiug", "noimn", "noimn", "oesjb");

        feedbackResponse.setCourseId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getFeedbackQuestionId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFeedbackQuestionId()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getFeedbackQuestionId()}
     */
    @Test
    @DisplayName("getFeedbackQuestionId: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetFeedbackQuestionId() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        String actual = feedbackResponse.getFeedbackQuestionId();

        String expected = "oxhrh";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setFeedbackQuestionId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFeedbackQuestionId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setFeedbackQuestionId(String)}
     */
    @Test
    @DisplayName("setFeedbackQuestionId: feedbackQuestionId = blank string")
    public void testSetFeedbackQuestionIdWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("noimn", "syiug", "oesjb", feedbackQuestionType, "syiug", "syiug", "noimn", "noimn", "oesjb");

        feedbackResponse.setFeedbackQuestionId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getFeedbackQuestionType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getFeedbackQuestionType()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getFeedbackQuestionType()}
     */
    @Test
    @DisplayName("getFeedbackQuestionType: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetFeedbackQuestionType() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        FeedbackQuestionType actual = feedbackResponse.getFeedbackQuestionType();

        assertEquals(feedbackQuestionType, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setFeedbackQuestionType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFeedbackQuestionType(teammates.common.datatransfer.questions.FeedbackQuestionType)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setFeedbackQuestionType(FeedbackQuestionType)}
     */
    @Test
    @DisplayName("setFeedbackQuestionType: feedbackQuestionType = CONSTSUM_OPTIONS")
    public void testSetFeedbackQuestionType() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("noimn", "syiug", "oesjb", feedbackQuestionType, "syiug", "syiug", "noimn", "noimn", "oesjb");
        FeedbackQuestionType feedbackQuestionType1 = FeedbackQuestionType.CONSTSUM_OPTIONS;

        feedbackResponse.setFeedbackQuestionType(feedbackQuestionType1);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getGiverEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getGiverEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getGiverEmail()}
     */
    @Test
    @DisplayName("getGiverEmail: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetGiverEmail() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        String actual = feedbackResponse.getGiverEmail();

        String expected = "syiug";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setGiverEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setGiverEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setGiverEmail(String)}
     */
    @Test
    @DisplayName("setGiverEmail: giverEmail = blank string")
    public void testSetGiverEmailWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("noimn", "syiug", "oesjb", feedbackQuestionType, "syiug", "syiug", "noimn", "noimn", "oesjb");

        feedbackResponse.setGiverEmail("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getGiverSection

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getGiverSection()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getGiverSection()}
     */
    @Test
    @DisplayName("getGiverSection: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetGiverSection() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        String actual = feedbackResponse.getGiverSection();

        String expected = "hlcoj";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setGiverSection

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setGiverSection(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setGiverSection(String)}
     */
    @Test
    @DisplayName("setGiverSection: giverSection = blank string")
    public void testSetGiverSectionWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("noimn", "syiug", "oesjb", feedbackQuestionType, "syiug", "syiug", "noimn", "noimn", "oesjb");

        feedbackResponse.setGiverSection("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getRecipientEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRecipientEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getRecipientEmail()}
     */
    @Test
    @DisplayName("getRecipientEmail: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetRecipientEmail() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        String actual = feedbackResponse.getRecipientEmail();

        String expected = "hlcoj";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setRecipientEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setRecipientEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setRecipientEmail(String)}
     */
    @Test
    @DisplayName("setRecipientEmail: receiverEmail = blank string")
    public void testSetRecipientEmailWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("noimn", "syiug", "oesjb", feedbackQuestionType, "syiug", "syiug", "noimn", "noimn", "oesjb");

        feedbackResponse.setRecipientEmail("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getRecipientSection

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRecipientSection()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getRecipientSection()}
     */
    @Test
    @DisplayName("getRecipientSection: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetRecipientSection() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        String actual = feedbackResponse.getRecipientSection();

        String expected = "syiug";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setRecipientSection

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setRecipientSection(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setRecipientSection(String)}
     */
    @Test
    @DisplayName("setRecipientSection: recipientSection = blank string")
    public void testSetRecipientSectionWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("noimn", "syiug", "oesjb", feedbackQuestionType, "syiug", "syiug", "noimn", "noimn", "oesjb");

        feedbackResponse.setRecipientSection("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getAnswer

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getAnswer()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getAnswer()}
     */
    @Test
    @DisplayName("getAnswer: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetAnswer() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        String actual = feedbackResponse.getAnswer();

        String expected = "noimn";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setAnswer

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setAnswer(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setAnswer(String)}
     */
    @Test
    @DisplayName("setAnswer: answer = blank string")
    public void testSetAnswerWithBlankString() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("noimn", "syiug", "oesjb", feedbackQuestionType, "syiug", "syiug", "noimn", "noimn", "oesjb");

        feedbackResponse.setAnswer("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getCreatedAt

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCreatedAt()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getCreatedAt()}
     */
    @Test
    @DisplayName("getCreatedAt: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetCreatedAt() throws Exception {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        Instant actual = feedbackResponse.getCreatedAt();

        Instant expected = ((Instant) createInstance("java.time.Instant"));
        // java.time.Instant has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.getUpdatedAt

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getUpdatedAt()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#getUpdatedAt()}
     */
    @Test
    @DisplayName("getUpdatedAt: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testGetUpdatedAt() throws Exception {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        Instant actual = feedbackResponse.getUpdatedAt();

        Instant expected = ((Instant) createInstance("java.time.Instant"));
        // java.time.Instant has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setCreatedAt(Instant)}
     * @utbot.invokes {@link FeedbackResponse#setLastUpdate(Instant)}
     */
    @Test
    @DisplayName("setCreatedAt: -> FeedbackResponseSetLastUpdate")
    public void testSetCreatedAt_FeedbackResponseSetLastUpdate() throws Exception {
        FeedbackResponse feedbackResponse = ((FeedbackResponse) createInstance("teammates.storage.entity.FeedbackResponse"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackResponse, "teammates.storage.entity.FeedbackResponse", "createdAt", instantMock);
        setField(feedbackResponse, "teammates.storage.entity.FeedbackResponse", "updatedAt", instantMock);

        feedbackResponse.setCreatedAt(null);

        Instant finalFeedbackResponseCreatedAt = ((Instant) getFieldValue(feedbackResponse, "teammates.storage.entity.FeedbackResponse", "createdAt"));

        assertNull(finalFeedbackResponseCreatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.setLastUpdate

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLastUpdate(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#setLastUpdate(Instant)}
     */
    @Test
    @DisplayName("setLastUpdate: ")
    public void testSetLastUpdate() throws Exception {
        FeedbackResponse feedbackResponse = ((FeedbackResponse) createInstance("teammates.storage.entity.FeedbackResponse"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackResponse, "teammates.storage.entity.FeedbackResponse", "updatedAt", instantMock);

        feedbackResponse.setLastUpdate(null);

        Instant finalFeedbackResponseUpdatedAt = ((Instant) getFieldValue(feedbackResponse, "teammates.storage.entity.FeedbackResponse", "updatedAt"));

        assertNull(finalFeedbackResponseUpdatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackResponse.updateLastUpdateTimestamp

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method updateLastUpdateTimestamp()

    /**
     * @utbot.classUnderTest {@link FeedbackResponse}
     * @utbot.methodUnderTest {@link FeedbackResponse#updateLastUpdateTimestamp()}
     */
    @Test
    @DisplayName("updateLastUpdateTimestamp: arg_0 = FeedbackResponse(String, String, String, FeedbackQuestionType, String, String, String, String, String)")
    public void testUpdateLastUpdateTimestamp() {
        FeedbackQuestionType feedbackQuestionType = FeedbackQuestionType.CONSTSUM_RECIPIENTS;
        FeedbackResponse feedbackResponse = new FeedbackResponse("oesjb", "", "oxhrh", feedbackQuestionType, "syiug", "hlcoj", "hlcoj", "syiug", "noimn");

        feedbackResponse.updateLastUpdateTimestamp();
    }
    ///endregion

    ///endregion
}
