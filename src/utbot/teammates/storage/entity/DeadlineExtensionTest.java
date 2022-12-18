package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Instant;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;

public final class DeadlineExtensionTest {
    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.getId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getId()

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#getId()}
     * @utbot.returnsFrom {@code return id;}
     */
    @Test
    @DisplayName("getId: -> return id")
    public void testGetId_ReturnId() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        String string = "";
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "id", string);

        String actual = deadlineExtension.getId();

        assertEquals(string, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.setId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#setId(String)}
     */
    @Test
    @DisplayName("setId: id = blank string")
    public void testSetIdWithBlankString() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));

        deadlineExtension.setId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.getCourseId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCourseId()

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#getCourseId()}
     * @utbot.returnsFrom {@code return courseId;}
     */
    @Test
    @DisplayName("getCourseId: -> return courseId")
    public void testGetCourseId_ReturnCourseId() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "courseId", null);

        String actual = deadlineExtension.getCourseId();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.setCourseId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setCourseId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#setCourseId(String)}
     */
    @Test
    @DisplayName("setCourseId: courseId = blank string")
    public void testSetCourseIdWithBlankString() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));

        deadlineExtension.setCourseId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.getFeedbackSessionName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFeedbackSessionName()

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#getFeedbackSessionName()}
     * @utbot.returnsFrom {@code return feedbackSessionName;}
     */
    @Test
    @DisplayName("getFeedbackSessionName: -> return feedbackSessionName")
    public void testGetFeedbackSessionName_ReturnFeedbackSessionName() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "feedbackSessionName", null);

        String actual = deadlineExtension.getFeedbackSessionName();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.setFeedbackSessionName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setFeedbackSessionName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#setFeedbackSessionName(String)}
     */
    @Test
    @DisplayName("setFeedbackSessionName: feedbackSessionName = blank string")
    public void testSetFeedbackSessionNameWithBlankString() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));

        deadlineExtension.setFeedbackSessionName("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.getUserEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUserEmail()

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#getUserEmail()}
     * @utbot.returnsFrom {@code return userEmail;}
     */
    @Test
    @DisplayName("getUserEmail: -> return userEmail")
    public void testGetUserEmail_ReturnUserEmail() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "userEmail", null);

        String actual = deadlineExtension.getUserEmail();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.setUserEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setUserEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#setUserEmail(String)}
     */
    @Test
    @DisplayName("setUserEmail: userEmail = blank string")
    public void testSetUserEmailWithBlankString() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));

        deadlineExtension.setUserEmail("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.getIsInstructor

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIsInstructor()

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#getIsInstructor()}
     * @utbot.returnsFrom {@code return isInstructor;}
     */
    @Test
    @DisplayName("getIsInstructor: -> return isInstructor")
    public void testGetIsInstructor_ReturnIsInstructor() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "isInstructor", false);

        boolean actual = deadlineExtension.getIsInstructor();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.setIsInstructor

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setIsInstructor(boolean)

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#setIsInstructor(boolean)}
     */
    @Test
    @DisplayName("setIsInstructor: isInstructor = false")
    public void testSetIsInstructor() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));

        deadlineExtension.setIsInstructor(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.getSentClosingEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSentClosingEmail()

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#getSentClosingEmail()}
     * @utbot.returnsFrom {@code return sentClosingEmail;}
     */
    @Test
    @DisplayName("getSentClosingEmail: -> return sentClosingEmail")
    public void testGetSentClosingEmail_ReturnSentClosingEmail() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "sentClosingEmail", false);

        boolean actual = deadlineExtension.getSentClosingEmail();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.setSentClosingEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setSentClosingEmail(boolean)

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#setSentClosingEmail(boolean)}
     */
    @Test
    @DisplayName("setSentClosingEmail: sentClosingEmail = false")
    public void testSetSentClosingEmail() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));

        deadlineExtension.setSentClosingEmail(false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.getEndTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEndTime()

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#getEndTime()}
     * @utbot.returnsFrom {@code return endTime;}
     */
    @Test
    @DisplayName("getEndTime: -> return endTime")
    public void testGetEndTime_ReturnEndTime() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        Instant instantMock = mock(Instant.class);
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "endTime", instantMock);

        Instant actual = deadlineExtension.getEndTime();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.setEndTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEndTime(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#setEndTime(Instant)}
     */
    @Test
    @DisplayName("setEndTime: ")
    public void testSetEndTime() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        Instant instantMock = mock(Instant.class);
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "endTime", instantMock);

        deadlineExtension.setEndTime(null);

        Instant finalDeadlineExtensionEndTime = ((Instant) getFieldValue(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "endTime"));

        assertNull(finalDeadlineExtensionEndTime);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.getCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatedAt()

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#getCreatedAt()}
     * @utbot.returnsFrom {@code return createdAt;}
     */
    @Test
    @DisplayName("getCreatedAt: -> return createdAt")
    public void testGetCreatedAt_ReturnCreatedAt() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        Instant instantMock = mock(Instant.class);
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "createdAt", instantMock);

        Instant actual = deadlineExtension.getCreatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.setCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#setCreatedAt(Instant)}
     */
    @Test
    @DisplayName("setCreatedAt: ")
    public void testSetCreatedAt() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        Instant instantMock = mock(Instant.class);
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "createdAt", instantMock);

        deadlineExtension.setCreatedAt(null);

        Instant finalDeadlineExtensionCreatedAt = ((Instant) getFieldValue(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "createdAt"));

        assertNull(finalDeadlineExtensionCreatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.getUpdatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUpdatedAt()

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#getUpdatedAt()}
     * @utbot.returnsFrom {@code return updatedAt;}
     */
    @Test
    @DisplayName("getUpdatedAt: -> return updatedAt")
    public void testGetUpdatedAt_ReturnUpdatedAt() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        Instant instantMock = mock(Instant.class);
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "updatedAt", instantMock);

        Instant actual = deadlineExtension.getUpdatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.setUpdatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUpdatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link DeadlineExtension}
     * @utbot.methodUnderTest {@link DeadlineExtension#setUpdatedAt(Instant)}
     */
    @Test
    @DisplayName("setUpdatedAt: ")
    public void testSetUpdatedAt() throws Exception {
        DeadlineExtension deadlineExtension = ((DeadlineExtension) createInstance("teammates.storage.entity.DeadlineExtension"));
        Instant instantMock = mock(Instant.class);
        setField(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "updatedAt", instantMock);

        deadlineExtension.setUpdatedAt(null);

        Instant finalDeadlineExtensionUpdatedAt = ((Instant) getFieldValue(deadlineExtension, "teammates.storage.entity.DeadlineExtension", "updatedAt"));

        assertNull(finalDeadlineExtensionUpdatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.DeadlineExtension.generateId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method generateId(java.lang.String, java.lang.String, java.lang.String, boolean)

    @Test
    public void testGenerateIdByFuzzer() {
        String actual = DeadlineExtension.generateId("string", "", "string", true);

        String expected = "string%%string%true";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
