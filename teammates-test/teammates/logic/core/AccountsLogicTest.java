package teammates.logic.core;

import com.googlecode.objectify.ObjectifyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.attributes.AccountAttributes;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.storage.api.AccountsDb;

import java.time.Instant;
import java.util.ArrayList;

import com.googlecode.objectify.ObjectifyFactory;

import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class AccountsLogicTest {
    ///region Test suites for executable teammates.logic.core.AccountsLogic.inst

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inst()

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#inst()}
     * @utbot.returnsFrom {@code return instance;}
     */
    @Test
    @DisplayName("inst: -> return instance")
    public void testInst_ReturnInstance() throws Exception {
        Class accountsDbClazz = Class.forName("teammates.storage.api.AccountsDb");
        AccountsDb prevInstance = ((AccountsDb) getStaticFieldValue(accountsDbClazz, "instance"));
        Class accountsLogicClazz = Class.forName("teammates.logic.core.AccountsLogic");
        AccountsLogic prevInstance1 = ((AccountsLogic) getStaticFieldValue(accountsLogicClazz, "instance"));
        try {
            AccountsDb instance = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
            setStaticField(accountsDbClazz, "instance", instance);
            AccountsLogic instance1 = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
            setField(instance1, "teammates.logic.core.AccountsLogic", "accountsDb", instance);
            setStaticField(accountsLogicClazz, "instance", instance1);

            AccountsLogic actual = AccountsLogic.inst();

            AccountsDb instance1AccountsDb = ((AccountsDb) getFieldValue(instance1, "teammates.logic.core.AccountsLogic", "accountsDb"));
            AccountsDb actualAccountsDb = ((AccountsDb) getFieldValue(actual, "teammates.logic.core.AccountsLogic", "accountsDb"));

            ProfilesLogic actualProfilesLogic = ((ProfilesLogic) getFieldValue(actual, "teammates.logic.core.AccountsLogic", "profilesLogic"));
            assertNull(actualProfilesLogic);

            CoursesLogic actualCoursesLogic = ((CoursesLogic) getFieldValue(actual, "teammates.logic.core.AccountsLogic", "coursesLogic"));
            assertNull(actualCoursesLogic);

            InstructorsLogic actualInstructorsLogic = ((InstructorsLogic) getFieldValue(actual, "teammates.logic.core.AccountsLogic", "instructorsLogic"));
            assertNull(actualInstructorsLogic);

            StudentsLogic actualStudentsLogic = ((StudentsLogic) getFieldValue(actual, "teammates.logic.core.AccountsLogic", "studentsLogic"));
            assertNull(actualStudentsLogic);

            NotificationsLogic actualNotificationsLogic = ((NotificationsLogic) getFieldValue(actual, "teammates.logic.core.AccountsLogic", "notificationsLogic"));
            assertNull(actualNotificationsLogic);

        } finally {
            setStaticField(AccountsDb.class, "instance", prevInstance);
            setStaticField(AccountsLogic.class, "instance", prevInstance1);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountsLogic.createAccount

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createAccount(teammates.common.datatransfer.attributes.AccountAttributes)

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#createAccount(AccountAttributes)}
     * @utbot.invokes {@link AccountsDb#createEntity(EntityAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: return accountsDb.createEntity(accountData);
     */
    @Test
    @DisplayName("createAccount: return accountsDb.createEntity(accountData) : True -> ThrowNullPointerException")
    public void testCreateAccount_AccountsDbCreateEntity() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", null);
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.createAccount] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountsLogic.createAccount(AccountsLogic.java:62) */
        accountsLogic.createAccount(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createAccount(teammates.common.datatransfer.attributes.AccountAttributes)

    @Test
    public void testCreateAccount1() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        AccountsDb accountsDb = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
        setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", accountsDb);
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.createAccount] produces [java.lang.AssertionError]
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:62)
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:57)
            teammates.storage.api.AccountsDb.createEntity(AccountsDb.java:23)
            teammates.logic.core.AccountsLogic.createAccount(AccountsLogic.java:62) */
        accountsLogic.createAccount(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountsLogic.getAccount

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getAccount(java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#getAccount(String)}
     * @utbot.invokes {@link AccountsDb#getAccount(String)}
     * @utbot.throwsException {@link AssertionError} in: return accountsDb.getAccount(googleId);
     */
    @Test
    @DisplayName("getAccount: return accountsDb.getAccount(googleId) : True -> ThrowAssertionError")
    public void testGetAccount_AccountsDbGetAccount() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        AccountsDb accountsDb = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
        setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", accountsDb);
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.getAccount] produces [java.lang.AssertionError]
            teammates.storage.api.AccountsDb.getAccount(AccountsDb.java:39)
            teammates.logic.core.AccountsLogic.getAccount(AccountsLogic.java:69) */
        accountsLogic.getAccount(null);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getAccount(java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#getAccount(String)}
     */
    @Test
    @DisplayName("getAccount: googleId = blank string -> throw NullPointerException")
    public void testGetAccountThrowsNPEWithBlankString() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.getAccount] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountsLogic.getAccount(AccountsLogic.java:69) */
        accountsLogic.getAccount("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountsLogic.getReadNotificationsId

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getReadNotificationsId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#getReadNotificationsId(String)}
     * @utbot.invokes {@link AccountsDb#getAccount(String)}
     * @utbot.throwsException {@link AssertionError} in: AccountAttributes a = accountsDb.getAccount(googleId);
     */
    @Test
    @DisplayName("getReadNotificationsId: a = accountsDb.getAccount(googleId) : True -> ThrowAssertionError")
    public void testGetReadNotificationsId_AccountsDbGetAccount() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        AccountsDb accountsDb = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
        setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", accountsDb);
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.getReadNotificationsId] produces [java.lang.AssertionError]
            teammates.storage.api.AccountsDb.getAccount(AccountsDb.java:39)
            teammates.logic.core.AccountsLogic.getReadNotificationsId(AccountsLogic.java:76) */
        accountsLogic.getReadNotificationsId(null);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getReadNotificationsId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#getReadNotificationsId(String)}
     */
    @Test
    @DisplayName("getReadNotificationsId: googleId = blank string -> throw NullPointerException")
    public void testGetReadNotificationsIdThrowsNPEWithBlankString() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.getReadNotificationsId] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountsLogic.getReadNotificationsId(AccountsLogic.java:76) */
        accountsLogic.getReadNotificationsId("   ");
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method getReadNotificationsId(java.lang.String)

    @Test
    public void testGetReadNotificationsId1() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        AccountsDb accountsDb = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
        setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", accountsDb);
        String googleId = "";

        ArrayList actual = ((ArrayList) accountsLogic.getReadNotificationsId(googleId));

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountsLogic.getAccountsForEmail

    ///region

    @Test
    public void testGetAccountsForEmail1() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.getAccountsForEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountsLogic.getAccountsForEmail(AccountsLogic.java:88) */
        accountsLogic.getAccountsForEmail("   ");
    }

    @Test
    public void testGetAccountsForEmail2() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            ThreadLocal anonymousThreadLocal = ((ThreadLocal) createInstance("com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary$1"));
            setField(factory, "com.googlecode.objectify.ObjectifyFactory", "stacks", anonymousThreadLocal);
            setStaticField(objectifyServiceClazz, "factory", factory);
            AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
            AccountsDb accountsDb = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
            setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", accountsDb);
            String email = "";
            
            /* This test fails because method [teammates.logic.core.AccountsLogic.getAccountsForEmail] produces [java.lang.ClassCastException: class java.lang.StringBuilder cannot be cast to class java.util.Deque (java.lang.StringBuilder and java.util.Deque are in module java.base of loader 'bootstrap')]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.AccountsDb.load(AccountsDb.java:111)
                teammates.storage.api.AccountsDb.getAccountsForEmail(AccountsDb.java:50)
                teammates.logic.core.AccountsLogic.getAccountsForEmail(AccountsLogic.java:88) */
            accountsLogic.getAccountsForEmail(email);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testGetAccountsForEmail3() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            setStaticField(objectifyServiceClazz, "factory", null);
            AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
            AccountsDb accountsDb = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
            setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", accountsDb);
            String email = "";
            
            /* This test fails because method [teammates.logic.core.AccountsLogic.getAccountsForEmail] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.AccountsDb.load(AccountsDb.java:111)
                teammates.storage.api.AccountsDb.getAccountsForEmail(AccountsDb.java:50)
                teammates.logic.core.AccountsLogic.getAccountsForEmail(AccountsLogic.java:88) */
            accountsLogic.getAccountsForEmail(email);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testGetAccountsForEmail4() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        AccountsDb accountsDb = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
        setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", accountsDb);
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.getAccountsForEmail] produces [java.lang.AssertionError]
            teammates.storage.api.AccountsDb.getAccountsForEmail(AccountsDb.java:48)
            teammates.logic.core.AccountsLogic.getAccountsForEmail(AccountsLogic.java:88) */
        accountsLogic.getAccountsForEmail(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountsLogic.joinCourseForStudent

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method joinCourseForStudent(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#joinCourseForStudent(String, String)}
     */
    @Test
    @DisplayName("joinCourseForStudent: registrationKey = blank string, googleId = empty string -> throw NullPointerException")
    public void testJoinCourseForStudentThrowsNPEWithBlankStringAndEmptyString() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.joinCourseForStudent] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountsLogic.validateStudentJoinRequest(AccountsLogic.java:206)
            teammates.logic.core.AccountsLogic.joinCourseForStudent(AccountsLogic.java:96) */
        accountsLogic.joinCourseForStudent("   ", "");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountsLogic.joinCourseForInstructor

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method joinCourseForInstructor(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#joinCourseForInstructor(String, String)}
     */
    @Test
    @DisplayName("joinCourseForInstructor: key = empty string, googleId = empty string -> throw NullPointerException")
    public void testJoinCourseForInstructorThrowsNPEWithEmptyStrings() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.joinCourseForInstructor] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountsLogic.validateInstructorJoinRequest(AccountsLogic.java:165)
            teammates.logic.core.AccountsLogic.joinCourseForInstructor(AccountsLogic.java:122) */
        accountsLogic.joinCourseForInstructor("", "");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountsLogic.deleteAccountCascade

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteAccountCascade(java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#deleteAccountCascade(String)}
     * @utbot.invokes {@link AccountsDb#getAccount(String)}
     * @utbot.throwsException {@link AssertionError} in: accountsDb.getAccount(googleId) == null
     */
    @Test
    @DisplayName("deleteAccountCascade: accountsDb.getAccount(googleId) == null -> ThrowAssertionError")
    public void testDeleteAccountCascade_AccountsDbGetAccount() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        AccountsDb accountsDb = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
        setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", accountsDb);
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.deleteAccountCascade] produces [java.lang.AssertionError]
            teammates.storage.api.AccountsDb.getAccount(AccountsDb.java:39)
            teammates.logic.core.AccountsLogic.deleteAccountCascade(AccountsLogic.java:245) */
        accountsLogic.deleteAccountCascade(null);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteAccountCascade(java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#deleteAccountCascade(String)}
     */
    @Test
    @DisplayName("deleteAccountCascade: googleId = blank string -> throw NullPointerException")
    public void testDeleteAccountCascadeThrowsNPEWithBlankString() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.deleteAccountCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountsLogic.deleteAccountCascade(AccountsLogic.java:245) */
        accountsLogic.deleteAccountCascade("   ");
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method deleteAccountCascade(java.lang.String)

    @Test
    public void testDeleteAccountCascade1() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        AccountsDb accountsDb = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
        setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", accountsDb);
        String googleId = "";

        accountsLogic.deleteAccountCascade(googleId);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountsLogic.updateReadNotifications

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateReadNotifications(java.lang.String, java.lang.String, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link AccountsLogic}
     * @utbot.methodUnderTest {@link AccountsLogic#updateReadNotifications(String, String, Instant)}
     * @utbot.invokes {@link AccountsDb#getAccount(String)}
     * @utbot.throwsException {@link NullPointerException} in: AccountAttributes a = accountsDb.getAccount(googleId);
     */
    @Test
    @DisplayName("updateReadNotifications: a = accountsDb.getAccount(googleId) : True -> ThrowNullPointerException")
    public void testUpdateReadNotifications_AccountsDbGetAccount() throws Exception {
        AccountsLogic accountsLogic = ((AccountsLogic) createInstance("teammates.logic.core.AccountsLogic"));
        setField(accountsLogic, "teammates.logic.core.AccountsLogic", "accountsDb", null);
        
        /* This test fails because method [teammates.logic.core.AccountsLogic.updateReadNotifications] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountsLogic.updateReadNotifications(AccountsLogic.java:292) */
        accountsLogic.updateReadNotifications(null, null, null);
    }
    ///endregion

    ///endregion
}
