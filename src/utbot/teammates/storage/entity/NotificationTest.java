package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Instant;

import teammates.common.datatransfer.NotificationStyle;
import teammates.common.datatransfer.NotificationTargetUser;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class NotificationTest {
    ///region Test suites for executable teammates.storage.entity.Notification.getNotificationId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNotificationId()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#getNotificationId()}
     * @utbot.returnsFrom {@code return notificationId;}
     */
    @Test
    @DisplayName("getNotificationId: -> return notificationId")
    public void testGetNotificationId_ReturnNotificationId() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        String string = "";
        setField(notification, "teammates.storage.entity.Notification", "notificationId", string);

        String actual = notification.getNotificationId();

        assertEquals(string, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.getStartTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStartTime()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#getStartTime()}
     * @utbot.returnsFrom {@code return startTime;}
     */
    @Test
    @DisplayName("getStartTime: -> return startTime")
    public void testGetStartTime_ReturnStartTime() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        Instant instantMock = mock(Instant.class);
        setField(notification, "teammates.storage.entity.Notification", "startTime", instantMock);

        Instant actual = notification.getStartTime();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.setStartTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setStartTime(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#setStartTime(Instant)}
     */
    @Test
    @DisplayName("setStartTime: ")
    public void testSetStartTime() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        Instant instantMock = mock(Instant.class);
        setField(notification, "teammates.storage.entity.Notification", "startTime", instantMock);

        notification.setStartTime(null);

        Instant finalNotificationStartTime = ((Instant) getFieldValue(notification, "teammates.storage.entity.Notification", "startTime"));

        assertNull(finalNotificationStartTime);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.getEndTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEndTime()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#getEndTime()}
     * @utbot.returnsFrom {@code return endTime;}
     */
    @Test
    @DisplayName("getEndTime: -> return endTime")
    public void testGetEndTime_ReturnEndTime() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        Instant instantMock = mock(Instant.class);
        setField(notification, "teammates.storage.entity.Notification", "endTime", instantMock);

        Instant actual = notification.getEndTime();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.setEndTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEndTime(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#setEndTime(Instant)}
     */
    @Test
    @DisplayName("setEndTime: ")
    public void testSetEndTime() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        Instant instantMock = mock(Instant.class);
        setField(notification, "teammates.storage.entity.Notification", "endTime", instantMock);

        notification.setEndTime(null);

        Instant finalNotificationEndTime = ((Instant) getFieldValue(notification, "teammates.storage.entity.Notification", "endTime"));

        assertNull(finalNotificationEndTime);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.getStyle

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStyle()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#getStyle()}
     * @utbot.returnsFrom {@code return style;}
     */
    @Test
    @DisplayName("getStyle: -> return style")
    public void testGetStyle_ReturnStyle() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        setField(notification, "teammates.storage.entity.Notification", "style", null);

        NotificationStyle actual = notification.getStyle();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.setStyle

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setStyle(teammates.common.datatransfer.NotificationStyle)

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#setStyle(NotificationStyle)}
     */
    @Test
    @DisplayName("setStyle: style = SUCCESS")
    public void testSetStyle() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        NotificationStyle style = NotificationStyle.SUCCESS;

        notification.setStyle(style);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.getTargetUser

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTargetUser()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#getTargetUser()}
     * @utbot.returnsFrom {@code return targetUser;}
     */
    @Test
    @DisplayName("getTargetUser: -> return targetUser")
    public void testGetTargetUser_ReturnTargetUser() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        setField(notification, "teammates.storage.entity.Notification", "targetUser", null);

        NotificationTargetUser actual = notification.getTargetUser();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.setTargetUser

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setTargetUser(teammates.common.datatransfer.NotificationTargetUser)

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#setTargetUser(NotificationTargetUser)}
     */
    @Test
    @DisplayName("setTargetUser: targetUser = INSTRUCTOR")
    public void testSetTargetUser() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        NotificationTargetUser targetUser = NotificationTargetUser.INSTRUCTOR;

        notification.setTargetUser(targetUser);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.getTitle

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTitle()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#getTitle()}
     * @utbot.returnsFrom {@code return title;}
     */
    @Test
    @DisplayName("getTitle: -> return title")
    public void testGetTitle_ReturnTitle() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        setField(notification, "teammates.storage.entity.Notification", "title", null);

        String actual = notification.getTitle();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.setTitle

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setTitle(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#setTitle(String)}
     */
    @Test
    @DisplayName("setTitle: title = blank string")
    public void testSetTitleWithBlankString() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));

        notification.setTitle("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.getMessage

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMessage()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#getMessage()}
     * @utbot.returnsFrom {@code return message;}
     */
    @Test
    @DisplayName("getMessage: -> return message")
    public void testGetMessage_ReturnMessage() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        setField(notification, "teammates.storage.entity.Notification", "message", null);

        String actual = notification.getMessage();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.setMessage

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setMessage(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#setMessage(String)}
     */
    @Test
    @DisplayName("setMessage: message = blank string")
    public void testSetMessageWithBlankString() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));

        notification.setMessage("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.isShown

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isShown()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#isShown()}
     * @utbot.returnsFrom {@code return shown;}
     */
    @Test
    @DisplayName("isShown: -> return shown")
    public void testIsShown_ReturnShown() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        setField(notification, "teammates.storage.entity.Notification", "shown", false);

        boolean actual = notification.isShown();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.setShown

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setShown()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#setShown()}
     */
    @Test
    @DisplayName("setShown: ")
    public void testSetShown() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        setField(notification, "teammates.storage.entity.Notification", "shown", false);

        notification.setShown();

        boolean finalNotificationShown = ((Boolean) getFieldValue(notification, "teammates.storage.entity.Notification", "shown"));

        assertTrue(finalNotificationShown);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.getCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatedAt()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#getCreatedAt()}
     * @utbot.returnsFrom {@code return createdAt;}
     */
    @Test
    @DisplayName("getCreatedAt: -> return createdAt")
    public void testGetCreatedAt_ReturnCreatedAt() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        Instant instantMock = mock(Instant.class);
        setField(notification, "teammates.storage.entity.Notification", "createdAt", instantMock);

        Instant actual = notification.getCreatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.setCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#setCreatedAt(Instant)}
     */
    @Test
    @DisplayName("setCreatedAt: ")
    public void testSetCreatedAt() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        Instant instantMock = mock(Instant.class);
        setField(notification, "teammates.storage.entity.Notification", "createdAt", instantMock);

        notification.setCreatedAt(null);

        Instant finalNotificationCreatedAt = ((Instant) getFieldValue(notification, "teammates.storage.entity.Notification", "createdAt"));

        assertNull(finalNotificationCreatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.getUpdatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUpdatedAt()

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#getUpdatedAt()}
     * @utbot.returnsFrom {@code return updatedAt;}
     */
    @Test
    @DisplayName("getUpdatedAt: -> return updatedAt")
    public void testGetUpdatedAt_ReturnUpdatedAt() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        Instant instantMock = mock(Instant.class);
        setField(notification, "teammates.storage.entity.Notification", "updatedAt", instantMock);

        Instant actual = notification.getUpdatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Notification.setUpdatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUpdatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link Notification}
     * @utbot.methodUnderTest {@link Notification#setUpdatedAt(Instant)}
     */
    @Test
    @DisplayName("setUpdatedAt: ")
    public void testSetUpdatedAt() throws Exception {
        Notification notification = ((Notification) createInstance("teammates.storage.entity.Notification"));
        Instant instantMock = mock(Instant.class);
        setField(notification, "teammates.storage.entity.Notification", "updatedAt", instantMock);

        notification.setUpdatedAt(null);

        Instant finalNotificationUpdatedAt = ((Instant) getFieldValue(notification, "teammates.storage.entity.Notification", "updatedAt"));

        assertNull(finalNotificationUpdatedAt);
    }
    ///endregion

    ///endregion
}
