package teammates.logic.core;

import com.googlecode.objectify.ObjectifyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.storage.api.NotificationsDb;
import com.googlecode.objectify.ObjectifyFactory;
import teammates.common.datatransfer.attributes.NotificationAttributes.UpdateOptions;
import teammates.common.datatransfer.attributes.NotificationAttributes;
import jdk.internal.misc.TerminatingThreadLocal;
import teammates.common.datatransfer.NotificationTargetUser;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;

public final class NotificationsLogicTest {
    ///region Test suites for executable teammates.logic.core.NotificationsLogic.updateNotification

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateNotification(teammates.common.datatransfer.attributes.NotificationAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#updateNotification(UpdateOptions)}
     * @utbot.invokes {@link NotificationsDb#updateNotification(UpdateOptions)}
     * @utbot.throwsException {@link NullPointerException} in: return notificationsDb.updateNotification(updateOptions);
     */
    @Test
    @DisplayName("updateNotification: return notificationsDb.updateNotification(updateOptions) : True -> ThrowNullPointerException")
    public void testUpdateNotification_NotificationsDbUpdateNotification() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", null);
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.updateNotification] produces [java.lang.NullPointerException]
            teammates.logic.core.NotificationsLogic.updateNotification(NotificationsLogic.java:79) */
        notificationsLogic.updateNotification(null);
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateNotification(teammates.common.datatransfer.attributes.NotificationAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#updateNotification(UpdateOptions)}
     * @utbot.invokes {@link NotificationsDb#updateNotification(UpdateOptions)}
     * @utbot.throwsException {@link AssertionError} in: return notificationsDb.updateNotification(updateOptions);
     */
    @Test
    @DisplayName("updateNotification: return notificationsDb.updateNotification(updateOptions) : True -> ThrowAssertionError")
    public void testUpdateNotification_NotificationsDbUpdateNotification_1() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.updateNotification] produces [java.lang.AssertionError]
            teammates.storage.api.NotificationsDb.updateNotification(NotificationsDb.java:94)
            teammates.logic.core.NotificationsLogic.updateNotification(NotificationsLogic.java:79) */
        notificationsLogic.updateNotification(null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method updateNotification(teammates.common.datatransfer.attributes.NotificationAttributes.UpdateOptions)

    @Test
    public void testUpdateNotification1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            ThreadLocal anonymousThreadLocal = ((ThreadLocal) createInstance("com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary$2"));
            setField(factory, "com.googlecode.objectify.ObjectifyFactory", "stacks", anonymousThreadLocal);
            setStaticField(objectifyServiceClazz, "factory", factory);
            NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
            NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
            setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
            UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.NotificationAttributes$UpdateOptions"));
            setField(updateOptions, "teammates.common.datatransfer.attributes.NotificationAttributes$UpdateOptions", "notificationId", null);
            
            /* This test fails because method [teammates.logic.core.NotificationsLogic.updateNotification] produces [java.lang.ClassCastException: class java.lang.StringBuffer cannot be cast to class java.util.Deque (java.lang.StringBuffer and java.util.Deque are in module java.base of loader 'bootstrap')]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.NotificationsDb.load(NotificationsDb.java:139)
                teammates.storage.api.NotificationsDb.getNotificationEntity(NotificationsDb.java:134)
                teammates.storage.api.NotificationsDb.updateNotification(NotificationsDb.java:96)
                teammates.logic.core.NotificationsLogic.updateNotification(NotificationsLogic.java:79) */
            notificationsLogic.updateNotification(updateOptions);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testUpdateNotification2() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            setStaticField(objectifyServiceClazz, "factory", null);
            NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
            NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
            setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
            UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.NotificationAttributes$UpdateOptions"));
            setField(updateOptions, "teammates.common.datatransfer.attributes.NotificationAttributes$UpdateOptions", "notificationId", null);
            
            /* This test fails because method [teammates.logic.core.NotificationsLogic.updateNotification] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.NotificationsDb.load(NotificationsDb.java:139)
                teammates.storage.api.NotificationsDb.getNotificationEntity(NotificationsDb.java:134)
                teammates.storage.api.NotificationsDb.updateNotification(NotificationsDb.java:96)
                teammates.logic.core.NotificationsLogic.updateNotification(NotificationsLogic.java:79) */
            notificationsLogic.updateNotification(updateOptions);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.NotificationsLogic.inst

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inst()

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#inst()}
     * @utbot.returnsFrom {@code return instance;}
     */
    @Test
    @DisplayName("inst: -> return instance")
    public void testInst_ReturnInstance() throws Exception {
        Class notificationsDbClazz = Class.forName("teammates.storage.api.NotificationsDb");
        NotificationsDb prevInstance = ((NotificationsDb) getStaticFieldValue(notificationsDbClazz, "instance"));
        Class notificationsLogicClazz = Class.forName("teammates.logic.core.NotificationsLogic");
        NotificationsLogic prevInstance1 = ((NotificationsLogic) getStaticFieldValue(notificationsLogicClazz, "instance"));
        try {
            NotificationsDb instance = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
            setStaticField(notificationsDbClazz, "instance", instance);
            NotificationsLogic instance1 = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
            setField(instance1, "teammates.logic.core.NotificationsLogic", "notificationsDb", instance);
            setStaticField(notificationsLogicClazz, "instance", instance1);

            NotificationsLogic actual = NotificationsLogic.inst();

            NotificationsDb instance1NotificationsDb = ((NotificationsDb) getFieldValue(instance1, "teammates.logic.core.NotificationsLogic", "notificationsDb"));
            NotificationsDb actualNotificationsDb = ((NotificationsDb) getFieldValue(actual, "teammates.logic.core.NotificationsLogic", "notificationsDb"));

        } finally {
            setStaticField(NotificationsDb.class, "instance", prevInstance);
            setStaticField(NotificationsLogic.class, "instance", prevInstance1);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.NotificationsLogic.initLogicDependencies

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initLogicDependencies()

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#initLogicDependencies()}
     */
    @Test
    @DisplayName("initLogicDependencies: ")
    public void testInitLogicDependencies() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));

        notificationsLogic.initLogicDependencies();
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.NotificationsLogic.getNotification

    ///region

    @Test
    public void testGetNotification1() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.getNotification] produces [java.lang.NullPointerException]
            teammates.logic.core.NotificationsLogic.getNotification(NotificationsLogic.java:39) */
        notificationsLogic.getNotification("   ");
    }

    @Test
    public void testGetNotification2() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            setStaticField(objectifyServiceClazz, "factory", factory);
            NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
            NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
            setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
            String notificationId = "\u0000";
            
            /* This test fails because method [teammates.logic.core.NotificationsLogic.getNotification] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.NotificationsDb.load(NotificationsDb.java:139)
                teammates.storage.api.NotificationsDb.getNotificationEntity(NotificationsDb.java:134)
                teammates.storage.api.NotificationsDb.getNotification(NotificationsDb.java:42)
                teammates.logic.core.NotificationsLogic.getNotification(NotificationsLogic.java:39) */
            notificationsLogic.getNotification(notificationId);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testGetNotification3() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.getNotification] produces [java.lang.AssertionError]
            teammates.storage.api.NotificationsDb.getNotification(NotificationsDb.java:40)
            teammates.logic.core.NotificationsLogic.getNotification(NotificationsLogic.java:39) */
        notificationsLogic.getNotification(null);
    }

    @Test
    public void testGetNotification4() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
        String notificationId = "";

        NotificationAttributes actual = notificationsLogic.getNotification(notificationId);

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.NotificationsLogic.getAllNotifications

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllNotifications()

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#getAllNotifications()}
     * @utbot.invokes {@link NotificationsDb#getAllNotifications()}
     * @utbot.throwsException {@link NullPointerException} in: return notificationsDb.getAllNotifications();
     */
    @Test
    @DisplayName("getAllNotifications: return notificationsDb.getAllNotifications() : True -> ThrowNullPointerException")
    public void testGetAllNotifications_NotificationsDbGetAllNotifications() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", null);
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.getAllNotifications] produces [java.lang.NullPointerException]
            teammates.logic.core.NotificationsLogic.getAllNotifications(NotificationsLogic.java:46) */
        notificationsLogic.getAllNotifications();
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getAllNotifications()

    @Test
    public void testGetAllNotifications1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            TerminatingThreadLocal anonymousTerminatingThreadLocal = ((TerminatingThreadLocal) createInstance("sun.nio.fs.NativeBuffers$1"));
            setField(anonymousTerminatingThreadLocal, "java.lang.ThreadLocal", "threadLocalHashCode", 58);
            setField(factory, "com.googlecode.objectify.ObjectifyFactory", "stacks", anonymousTerminatingThreadLocal);
            setStaticField(objectifyServiceClazz, "factory", factory);
            NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
            NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
            setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
            
            /* This test fails because method [teammates.logic.core.NotificationsLogic.getAllNotifications] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:409)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.NotificationsDb.load(NotificationsDb.java:139)
                teammates.storage.api.NotificationsDb.getAllNotifications(NotificationsDb.java:49)
                teammates.logic.core.NotificationsLogic.getAllNotifications(NotificationsLogic.java:46) */
            notificationsLogic.getAllNotifications();
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testGetAllNotifications2() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            setStaticField(objectifyServiceClazz, "factory", null);
            NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
            NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
            setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
            
            /* This test fails because method [teammates.logic.core.NotificationsLogic.getAllNotifications] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.NotificationsDb.load(NotificationsDb.java:139)
                teammates.storage.api.NotificationsDb.getAllNotifications(NotificationsDb.java:49)
                teammates.logic.core.NotificationsLogic.getAllNotifications(NotificationsLogic.java:46) */
            notificationsLogic.getAllNotifications();
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.NotificationsLogic.getActiveNotificationsByTargetUser

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getActiveNotificationsByTargetUser(teammates.common.datatransfer.NotificationTargetUser)

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#getActiveNotificationsByTargetUser(NotificationTargetUser)}
     * @utbot.invokes {@link NotificationsDb#getActiveNotificationsByTargetUser(NotificationTargetUser)}
     * @utbot.throwsException {@link AssertionError} in: return notificationsDb.getActiveNotificationsByTargetUser(targetUser);
     */
    @Test
    @DisplayName("getActiveNotificationsByTargetUser: return notificationsDb.getActiveNotificationsByTargetUser(targetUser) : True -> ThrowAssertionError")
    public void testGetActiveNotificationsByTargetUser_NotificationsDbGetActiveNotificationsByTargetUser() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.getActiveNotificationsByTargetUser] produces [java.lang.AssertionError]
            teammates.storage.api.NotificationsDb.getActiveNotificationsByTargetUser(NotificationsDb.java:61)
            teammates.logic.core.NotificationsLogic.getActiveNotificationsByTargetUser(NotificationsLogic.java:55) */
        notificationsLogic.getActiveNotificationsByTargetUser(null);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getActiveNotificationsByTargetUser(teammates.common.datatransfer.NotificationTargetUser)

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#getActiveNotificationsByTargetUser(NotificationTargetUser)}
     */
    @Test
    @DisplayName("getActiveNotificationsByTargetUser: targetUser = INSTRUCTOR -> throw NullPointerException")
    public void testGetActiveNotificationsByTargetUserThrowsNPE() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        NotificationTargetUser targetUser = NotificationTargetUser.INSTRUCTOR;
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.getActiveNotificationsByTargetUser] produces [java.lang.NullPointerException]
            teammates.logic.core.NotificationsLogic.getActiveNotificationsByTargetUser(NotificationsLogic.java:55) */
        notificationsLogic.getActiveNotificationsByTargetUser(targetUser);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getActiveNotificationsByTargetUser(teammates.common.datatransfer.NotificationTargetUser)

    @Test
    public void testGetActiveNotificationsByTargetUser1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            setStaticField(objectifyServiceClazz, "factory", factory);
            NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
            NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
            setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
            NotificationTargetUser targetUser = NotificationTargetUser.STUDENT;
            
            /* This test fails because method [teammates.logic.core.NotificationsLogic.getActiveNotificationsByTargetUser] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.NotificationsDb.load(NotificationsDb.java:139)
                teammates.storage.api.NotificationsDb.getActiveNotificationsByTargetUser(NotificationsDb.java:63)
                teammates.logic.core.NotificationsLogic.getActiveNotificationsByTargetUser(NotificationsLogic.java:55) */
            notificationsLogic.getActiveNotificationsByTargetUser(targetUser);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.NotificationsLogic.createNotification

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createNotification(teammates.common.datatransfer.attributes.NotificationAttributes)

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#createNotification(NotificationAttributes)}
     * @utbot.invokes {@link NotificationsDb#createEntity(EntityAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: return notificationsDb.createEntity(notification);
     */
    @Test
    @DisplayName("createNotification: return notificationsDb.createEntity(notification) : True -> ThrowNullPointerException")
    public void testCreateNotification_NotificationsDbCreateEntity() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", null);
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.createNotification] produces [java.lang.NullPointerException]
            teammates.logic.core.NotificationsLogic.createNotification(NotificationsLogic.java:67) */
        notificationsLogic.createNotification(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createNotification(teammates.common.datatransfer.attributes.NotificationAttributes)

    @Test
    public void testCreateNotification1() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.createNotification] produces [java.lang.AssertionError]
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:62)
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:57)
            teammates.storage.api.NotificationsDb.createEntity(NotificationsDb.java:24)
            teammates.logic.core.NotificationsLogic.createNotification(NotificationsLogic.java:67) */
        notificationsLogic.createNotification(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.NotificationsLogic.deleteNotification

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteNotification(java.lang.String)

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#deleteNotification(String)}
     * @utbot.invokes {@link NotificationsDb#deleteNotification(String)}
     * @utbot.throwsException {@link AssertionError} in: notificationsDb.deleteNotification(notificationId);
     */
    @Test
    @DisplayName("deleteNotification: notificationsDb.deleteNotification(notificationId) : True -> ThrowAssertionError")
    public void testDeleteNotification_NotificationsDbDeleteNotification() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.deleteNotification] produces [java.lang.AssertionError]
            teammates.storage.api.NotificationsDb.deleteNotification(NotificationsDb.java:120)
            teammates.logic.core.NotificationsLogic.deleteNotification(NotificationsLogic.java:88) */
        notificationsLogic.deleteNotification(null);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteNotification(java.lang.String)

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#deleteNotification(String)}
     */
    @Test
    @DisplayName("deleteNotification: notificationId = blank string -> throw NullPointerException")
    public void testDeleteNotificationThrowsNPEWithBlankString() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.deleteNotification] produces [java.lang.NullPointerException]
            teammates.logic.core.NotificationsLogic.deleteNotification(NotificationsLogic.java:88) */
        notificationsLogic.deleteNotification("   ");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method deleteNotification(java.lang.String)

    @Test
    public void testDeleteNotification1() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
        String notificationId = "";
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.deleteNotification] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.Key.newKeyFactory(Key.java:157)
            com.googlecode.objectify.Key.<init>(Key.java:143)
            com.googlecode.objectify.Key.<init>(Key.java:100)
            com.googlecode.objectify.Key.create(Key.java:40)
            teammates.storage.api.NotificationsDb.deleteNotification(NotificationsDb.java:122)
            teammates.logic.core.NotificationsLogic.deleteNotification(NotificationsLogic.java:88) */
        notificationsLogic.deleteNotification(notificationId);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.NotificationsLogic.doesNotificationExists

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method doesNotificationExists(java.lang.String)

    /**
     * @utbot.classUnderTest {@link NotificationsLogic}
     * @utbot.methodUnderTest {@link NotificationsLogic#doesNotificationExists(String)}
     */
    @Test
    @DisplayName("doesNotificationExists: notificationId = blank string -> throw NullPointerException")
    public void testDoesNotificationExistsThrowsNPEWithBlankString() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.doesNotificationExists] produces [java.lang.NullPointerException]
            teammates.logic.core.NotificationsLogic.doesNotificationExists(NotificationsLogic.java:95) */
        notificationsLogic.doesNotificationExists("   ");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method doesNotificationExists(java.lang.String)

    @Test
    public void testDoesNotificationExists1() throws Exception {
        NotificationsLogic notificationsLogic = ((NotificationsLogic) createInstance("teammates.logic.core.NotificationsLogic"));
        NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
        setField(notificationsLogic, "teammates.logic.core.NotificationsLogic", "notificationsDb", notificationsDb);
        
        /* This test fails because method [teammates.logic.core.NotificationsLogic.doesNotificationExists] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.Key.newKeyFactory(Key.java:157)
            com.googlecode.objectify.Key.<init>(Key.java:143)
            com.googlecode.objectify.Key.<init>(Key.java:100)
            com.googlecode.objectify.Key.create(Key.java:40)
            teammates.storage.api.NotificationsDb.doesNotificationExists(NotificationsDb.java:129)
            teammates.logic.core.NotificationsLogic.doesNotificationExists(NotificationsLogic.java:95) */
        notificationsLogic.doesNotificationExists(null);
    }
    ///endregion

    ///endregion
}
