package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static java.util.Collections.emptyMap;

public final class FeedbackSessionTest {
    ///region Test suites for executable teammates.storage.entity.FeedbackSession.generateId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method generateId(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#generateId(String, String)}
     */
    @Test
    @DisplayName("generateId: arg_0 has special characters, courseId = blank string")
    public void testGenerateIdWithBlankStrings() {
        String actual = FeedbackSession.generateId("\n\t\r", "   ");

        String expected = "\n\t\r%   ";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getFeedbackSessionName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFeedbackSessionName()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getFeedbackSessionName()}
     * @utbot.returnsFrom {@code return feedbackSessionName;}
     */
    @Test
    @DisplayName("getFeedbackSessionName: -> return feedbackSessionName")
    public void testGetFeedbackSessionName_ReturnFeedbackSessionName() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "feedbackSessionName", null);

        String actual = feedbackSession.getFeedbackSessionName();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setFeedbackSessionName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFeedbackSessionName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setFeedbackSessionName(String)}
     */
    @Test
    @DisplayName("setFeedbackSessionName: feedbackSessionName = blank string")
    public void testSetFeedbackSessionNameWithBlankString() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setFeedbackSessionName("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getCourseId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCourseId()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getCourseId()}
     * @utbot.returnsFrom {@code return courseId;}
     */
    @Test
    @DisplayName("getCourseId: -> return courseId")
    public void testGetCourseId_ReturnCourseId() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "courseId", null);

        String actual = feedbackSession.getCourseId();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setCourseId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setCourseId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setCourseId(String)}
     */
    @Test
    @DisplayName("setCourseId: courseId = blank string")
    public void testSetCourseIdWithBlankString() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setCourseId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getCreatorEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatorEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getCreatorEmail()}
     * @utbot.returnsFrom {@code return creatorEmail;}
     */
    @Test
    @DisplayName("getCreatorEmail: -> return creatorEmail")
    public void testGetCreatorEmail_ReturnCreatorEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "creatorEmail", null);

        String actual = feedbackSession.getCreatorEmail();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setCreatorEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setCreatorEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setCreatorEmail(String)}
     */
    @Test
    @DisplayName("setCreatorEmail: creatorId = blank string")
    public void testSetCreatorEmailWithBlankString() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setCreatorEmail("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getInstructions

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstructions()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getInstructions()}
     * @utbot.returnsFrom {@code return instructions;}
     */
    @Test
    @DisplayName("getInstructions: -> return instructions")
    public void testGetInstructions_ReturnInstructions() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        String string = "";
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "instructions", string);

        String actual = feedbackSession.getInstructions();

        assertEquals(string, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setInstructions

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setInstructions(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setInstructions(String)}
     */
    @Test
    @DisplayName("setInstructions: instructions = blank string")
    public void testSetInstructionsWithBlankString() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setInstructions("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getCreatedTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatedTime()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getCreatedTime()}
     * @utbot.returnsFrom {@code return createdTime;}
     */
    @Test
    @DisplayName("getCreatedTime: -> return createdTime")
    public void testGetCreatedTime_ReturnCreatedTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "createdTime", instantMock);

        Instant actual = feedbackSession.getCreatedTime();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setCreatedTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedTime(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setCreatedTime(Instant)}
     */
    @Test
    @DisplayName("setCreatedTime: ")
    public void testSetCreatedTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "createdTime", instantMock);

        feedbackSession.setCreatedTime(null);

        Instant finalFeedbackSessionCreatedTime = ((Instant) getFieldValue(feedbackSession, "teammates.storage.entity.FeedbackSession", "createdTime"));

        assertNull(finalFeedbackSessionCreatedTime);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getDeletedTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeletedTime()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getDeletedTime()}
     * @utbot.returnsFrom {@code return deletedTime;}
     */
    @Test
    @DisplayName("getDeletedTime: -> return deletedTime")
    public void testGetDeletedTime_ReturnDeletedTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "deletedTime", instantMock);

        Instant actual = feedbackSession.getDeletedTime();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setDeletedTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDeletedTime(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setDeletedTime(Instant)}
     */
    @Test
    @DisplayName("setDeletedTime: ")
    public void testSetDeletedTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "deletedTime", instantMock);

        feedbackSession.setDeletedTime(null);

        Instant finalFeedbackSessionDeletedTime = ((Instant) getFieldValue(feedbackSession, "teammates.storage.entity.FeedbackSession", "deletedTime"));

        assertNull(finalFeedbackSessionDeletedTime);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getStartTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStartTime()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getStartTime()}
     * @utbot.returnsFrom {@code return startTime;}
     */
    @Test
    @DisplayName("getStartTime: -> return startTime")
    public void testGetStartTime_ReturnStartTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "startTime", instantMock);

        Instant actual = feedbackSession.getStartTime();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setStartTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setStartTime(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setStartTime(Instant)}
     */
    @Test
    @DisplayName("setStartTime: ")
    public void testSetStartTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "startTime", instantMock);

        feedbackSession.setStartTime(null);

        Instant finalFeedbackSessionStartTime = ((Instant) getFieldValue(feedbackSession, "teammates.storage.entity.FeedbackSession", "startTime"));

        assertNull(finalFeedbackSessionStartTime);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getEndTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEndTime()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getEndTime()}
     * @utbot.returnsFrom {@code return endTime;}
     */
    @Test
    @DisplayName("getEndTime: -> return endTime")
    public void testGetEndTime_ReturnEndTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "endTime", instantMock);

        Instant actual = feedbackSession.getEndTime();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setEndTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEndTime(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setEndTime(Instant)}
     */
    @Test
    @DisplayName("setEndTime: ")
    public void testSetEndTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "endTime", instantMock);

        feedbackSession.setEndTime(null);

        Instant finalFeedbackSessionEndTime = ((Instant) getFieldValue(feedbackSession, "teammates.storage.entity.FeedbackSession", "endTime"));

        assertNull(finalFeedbackSessionEndTime);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getSessionVisibleFromTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSessionVisibleFromTime()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getSessionVisibleFromTime()}
     * @utbot.returnsFrom {@code return sessionVisibleFromTime;}
     */
    @Test
    @DisplayName("getSessionVisibleFromTime: -> return sessionVisibleFromTime")
    public void testGetSessionVisibleFromTime_ReturnSessionVisibleFromTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "sessionVisibleFromTime", instantMock);

        Instant actual = feedbackSession.getSessionVisibleFromTime();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setSessionVisibleFromTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSessionVisibleFromTime(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setSessionVisibleFromTime(Instant)}
     */
    @Test
    @DisplayName("setSessionVisibleFromTime: ")
    public void testSetSessionVisibleFromTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "sessionVisibleFromTime", instantMock);

        feedbackSession.setSessionVisibleFromTime(null);

        Instant finalFeedbackSessionSessionVisibleFromTime = ((Instant) getFieldValue(feedbackSession, "teammates.storage.entity.FeedbackSession", "sessionVisibleFromTime"));

        assertNull(finalFeedbackSessionSessionVisibleFromTime);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getResultsVisibleFromTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getResultsVisibleFromTime()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getResultsVisibleFromTime()}
     * @utbot.returnsFrom {@code return resultsVisibleFromTime;}
     */
    @Test
    @DisplayName("getResultsVisibleFromTime: -> return resultsVisibleFromTime")
    public void testGetResultsVisibleFromTime_ReturnResultsVisibleFromTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "resultsVisibleFromTime", instantMock);

        Instant actual = feedbackSession.getResultsVisibleFromTime();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setResultsVisibleFromTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setResultsVisibleFromTime(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setResultsVisibleFromTime(Instant)}
     */
    @Test
    @DisplayName("setResultsVisibleFromTime: ")
    public void testSetResultsVisibleFromTime() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Instant instantMock = mock(Instant.class);
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "resultsVisibleFromTime", instantMock);

        feedbackSession.setResultsVisibleFromTime(null);

        Instant finalFeedbackSessionResultsVisibleFromTime = ((Instant) getFieldValue(feedbackSession, "teammates.storage.entity.FeedbackSession", "resultsVisibleFromTime"));

        assertNull(finalFeedbackSessionResultsVisibleFromTime);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getTimeZone

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZone()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getTimeZone()}
     * @utbot.returnsFrom {@code return timeZone;}
     */
    @Test
    @DisplayName("getTimeZone: -> return timeZone")
    public void testGetTimeZone_ReturnTimeZone() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "timeZone", null);

        String actual = feedbackSession.getTimeZone();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setTimeZone

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setTimeZone(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setTimeZone(String)}
     */
    @Test
    @DisplayName("setTimeZone: timeZone = blank string")
    public void testSetTimeZoneWithBlankString() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setTimeZone("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getGracePeriod

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGracePeriod()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getGracePeriod()}
     * @utbot.returnsFrom {@code return gracePeriod;}
     */
    @Test
    @DisplayName("getGracePeriod: -> return gracePeriod")
    public void testGetGracePeriod_ReturnGracePeriod() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "gracePeriod", -255L);

        long actual = feedbackSession.getGracePeriod();

        assertEquals(-255L, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setGracePeriod

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setGracePeriod(long)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setGracePeriod(long)}
     */
    @Test
    @DisplayName("setGracePeriod: gracePeriod > 0L")
    public void testSetGracePeriod() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setGracePeriod(1L);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.isSentOpeningSoonEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSentOpeningSoonEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#isSentOpeningSoonEmail()}
     * @utbot.returnsFrom {@code return sentOpeningSoonEmail;}
     */
    @Test
    @DisplayName("isSentOpeningSoonEmail: -> return sentOpeningSoonEmail")
    public void testIsSentOpeningSoonEmail_ReturnSentOpeningSoonEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "sentOpeningSoonEmail", false);

        boolean actual = feedbackSession.isSentOpeningSoonEmail();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setSentOpeningSoonEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSentOpeningSoonEmail(boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setSentOpeningSoonEmail(boolean)}
     */
    @Test
    @DisplayName("setSentOpeningSoonEmail: sentOpeningSoonEmail = false")
    public void testSetSentOpeningSoonEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setSentOpeningSoonEmail(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.isSentOpenEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSentOpenEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#isSentOpenEmail()}
     * @utbot.returnsFrom {@code return sentOpenEmail;}
     */
    @Test
    @DisplayName("isSentOpenEmail: -> return sentOpenEmail")
    public void testIsSentOpenEmail_ReturnSentOpenEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "sentOpenEmail", false);

        boolean actual = feedbackSession.isSentOpenEmail();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setSentOpenEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSentOpenEmail(boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setSentOpenEmail(boolean)}
     */
    @Test
    @DisplayName("setSentOpenEmail: sentOpenEmail = false")
    public void testSetSentOpenEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setSentOpenEmail(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.isSentClosingEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSentClosingEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#isSentClosingEmail()}
     * @utbot.returnsFrom {@code return sentClosingEmail;}
     */
    @Test
    @DisplayName("isSentClosingEmail: -> return sentClosingEmail")
    public void testIsSentClosingEmail_ReturnSentClosingEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "sentClosingEmail", false);

        boolean actual = feedbackSession.isSentClosingEmail();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setSentClosingEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSentClosingEmail(boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setSentClosingEmail(boolean)}
     */
    @Test
    @DisplayName("setSentClosingEmail: sentClosingEmail = false")
    public void testSetSentClosingEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setSentClosingEmail(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.isSentClosedEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSentClosedEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#isSentClosedEmail()}
     * @utbot.returnsFrom {@code return sentClosedEmail;}
     */
    @Test
    @DisplayName("isSentClosedEmail: -> return sentClosedEmail")
    public void testIsSentClosedEmail_ReturnSentClosedEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "sentClosedEmail", false);

        boolean actual = feedbackSession.isSentClosedEmail();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setSentClosedEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSentClosedEmail(boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setSentClosedEmail(boolean)}
     */
    @Test
    @DisplayName("setSentClosedEmail: sentClosedEmail = false")
    public void testSetSentClosedEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setSentClosedEmail(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.isSentPublishedEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSentPublishedEmail()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#isSentPublishedEmail()}
     * @utbot.returnsFrom {@code return sentPublishedEmail;}
     */
    @Test
    @DisplayName("isSentPublishedEmail: -> return sentPublishedEmail")
    public void testIsSentPublishedEmail_ReturnSentPublishedEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "sentPublishedEmail", false);

        boolean actual = feedbackSession.isSentPublishedEmail();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setSentPublishedEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSentPublishedEmail(boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setSentPublishedEmail(boolean)}
     */
    @Test
    @DisplayName("setSentPublishedEmail: sentPublishedEmail = false")
    public void testSetSentPublishedEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setSentPublishedEmail(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.isOpeningEmailEnabled

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isOpeningEmailEnabled()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#isOpeningEmailEnabled()}
     * @utbot.returnsFrom {@code return isOpeningEmailEnabled;}
     */
    @Test
    @DisplayName("isOpeningEmailEnabled: -> return isOpeningEmailEnabled")
    public void testIsOpeningEmailEnabled_ReturnIsOpeningEmailEnabled() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "isOpeningEmailEnabled", false);

        boolean actual = feedbackSession.isOpeningEmailEnabled();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setIsOpeningEmailEnabled

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setIsOpeningEmailEnabled(boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setIsOpeningEmailEnabled(boolean)}
     */
    @Test
    @DisplayName("setIsOpeningEmailEnabled: isOpeningEmailEnabled = false")
    public void testSetIsOpeningEmailEnabled() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setIsOpeningEmailEnabled(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.isClosingEmailEnabled

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isClosingEmailEnabled()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#isClosingEmailEnabled()}
     * @utbot.returnsFrom {@code return isClosingEmailEnabled;}
     */
    @Test
    @DisplayName("isClosingEmailEnabled: -> return isClosingEmailEnabled")
    public void testIsClosingEmailEnabled_ReturnIsClosingEmailEnabled() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "isClosingEmailEnabled", false);

        boolean actual = feedbackSession.isClosingEmailEnabled();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setSendClosingEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSendClosingEmail(boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setSendClosingEmail(boolean)}
     */
    @Test
    @DisplayName("setSendClosingEmail: isClosingEmailEnabled = false")
    public void testSetSendClosingEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setSendClosingEmail(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.isPublishedEmailEnabled

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPublishedEmailEnabled()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#isPublishedEmailEnabled()}
     * @utbot.returnsFrom {@code return isPublishedEmailEnabled;}
     */
    @Test
    @DisplayName("isPublishedEmailEnabled: -> return isPublishedEmailEnabled")
    public void testIsPublishedEmailEnabled_ReturnIsPublishedEmailEnabled() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "isPublishedEmailEnabled", false);

        boolean actual = feedbackSession.isPublishedEmailEnabled();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setSendPublishedEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSendPublishedEmail(boolean)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setSendPublishedEmail(boolean)}
     */
    @Test
    @DisplayName("setSendPublishedEmail: isPublishedEmailEnabled = false")
    public void testSetSendPublishedEmail() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));

        feedbackSession.setSendPublishedEmail(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getStudentDeadlines

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStudentDeadlines()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getStudentDeadlines()}
     * @utbot.returnsFrom {@code return studentDeadlines;}
     */
    @Test
    @DisplayName("getStudentDeadlines: -> return studentDeadlines")
    public void testGetStudentDeadlines_ReturnStudentDeadlines() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "studentDeadlines", linkedHashMap);

        LinkedHashMap actual = ((LinkedHashMap) feedbackSession.getStudentDeadlines());

        assertTrue(deepEquals(linkedHashMap, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setStudentDeadlines

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setStudentDeadlines(java.util.Map)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setStudentDeadlines(Map)}
     */
    @Test
    @DisplayName("setStudentDeadlines: studentDeadlines = empty collection")
    public void testSetStudentDeadlines() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Map studentDeadlines = emptyMap();

        feedbackSession.setStudentDeadlines(studentDeadlines);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.getInstructorDeadlines

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstructorDeadlines()

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#getInstructorDeadlines()}
     * @utbot.returnsFrom {@code return instructorDeadlines;}
     */
    @Test
    @DisplayName("getInstructorDeadlines: -> return instructorDeadlines")
    public void testGetInstructorDeadlines_ReturnInstructorDeadlines() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        setField(feedbackSession, "teammates.storage.entity.FeedbackSession", "instructorDeadlines", linkedHashMap);

        LinkedHashMap actual = ((LinkedHashMap) feedbackSession.getInstructorDeadlines());

        assertTrue(deepEquals(linkedHashMap, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.FeedbackSession.setInstructorDeadlines

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setInstructorDeadlines(java.util.Map)

    /**
     * @utbot.classUnderTest {@link FeedbackSession}
     * @utbot.methodUnderTest {@link FeedbackSession#setInstructorDeadlines(Map)}
     */
    @Test
    @DisplayName("setInstructorDeadlines: instructorDeadlines = empty collection")
    public void testSetInstructorDeadlines() throws Exception {
        FeedbackSession feedbackSession = ((FeedbackSession) createInstance("teammates.storage.entity.FeedbackSession"));
        Map instructorDeadlines = emptyMap();

        feedbackSession.setInstructorDeadlines(instructorDeadlines);
    }
    ///endregion

    ///endregion
}
