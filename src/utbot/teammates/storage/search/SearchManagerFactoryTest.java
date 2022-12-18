package teammates.storage.search;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.junit.jupiter.api.Assertions.assertNull;

public final class SearchManagerFactoryTest {
    ///region Test suites for executable teammates.storage.search.SearchManagerFactory.getInstructorSearchManager

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstructorSearchManager()

    /**
     * @utbot.classUnderTest {@link SearchManagerFactory}
     * @utbot.methodUnderTest {@link SearchManagerFactory#getInstructorSearchManager()}
     * @utbot.returnsFrom {@code return instructorInstance;}
     */
    @Test
    @DisplayName("getInstructorSearchManager: -> return instructorInstance")
    public void testGetInstructorSearchManager_ReturnInstructorInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Class searchManagerFactoryClazz = Class.forName("teammates.storage.search.SearchManagerFactory");
        InstructorSearchManager prevInstructorInstance = ((InstructorSearchManager) getStaticFieldValue(searchManagerFactoryClazz, "instructorInstance"));
        try {
            setStaticField(searchManagerFactoryClazz, "instructorInstance", null);

            InstructorSearchManager actual = SearchManagerFactory.getInstructorSearchManager();

            assertNull(actual);
        } finally {
            setStaticField(SearchManagerFactory.class, "instructorInstance", prevInstructorInstance);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.search.SearchManagerFactory.getStudentSearchManager

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStudentSearchManager()

    /**
     * @utbot.classUnderTest {@link SearchManagerFactory}
     * @utbot.methodUnderTest {@link SearchManagerFactory#getStudentSearchManager()}
     * @utbot.returnsFrom {@code return studentInstance;}
     */
    @Test
    @DisplayName("getStudentSearchManager: -> return studentInstance")
    public void testGetStudentSearchManager_ReturnStudentInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Class searchManagerFactoryClazz = Class.forName("teammates.storage.search.SearchManagerFactory");
        StudentSearchManager prevStudentInstance = ((StudentSearchManager) getStaticFieldValue(searchManagerFactoryClazz, "studentInstance"));
        try {
            setStaticField(searchManagerFactoryClazz, "studentInstance", null);

            StudentSearchManager actual = SearchManagerFactory.getStudentSearchManager();

            assertNull(actual);
        } finally {
            setStaticField(SearchManagerFactory.class, "studentInstance", prevStudentInstance);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.search.SearchManagerFactory.getAccountRequestSearchManager

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAccountRequestSearchManager()

    /**
     * @utbot.classUnderTest {@link SearchManagerFactory}
     * @utbot.methodUnderTest {@link SearchManagerFactory#getAccountRequestSearchManager()}
     * @utbot.returnsFrom {@code return accountRequestInstance;}
     */
    @Test
    @DisplayName("getAccountRequestSearchManager: -> return accountRequestInstance")
    public void testGetAccountRequestSearchManager_ReturnAccountRequestInstance() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Class searchManagerFactoryClazz = Class.forName("teammates.storage.search.SearchManagerFactory");
        AccountRequestSearchManager prevAccountRequestInstance = ((AccountRequestSearchManager) getStaticFieldValue(searchManagerFactoryClazz, "accountRequestInstance"));
        try {
            setStaticField(searchManagerFactoryClazz, "accountRequestInstance", null);

            AccountRequestSearchManager actual = SearchManagerFactory.getAccountRequestSearchManager();

            assertNull(actual);
        } finally {
            setStaticField(SearchManagerFactory.class, "accountRequestInstance", prevAccountRequestInstance);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.search.SearchManagerFactory.registerAccountRequestSearchManager

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method registerAccountRequestSearchManager(teammates.storage.search.AccountRequestSearchManager)

    /**
     * @utbot.classUnderTest {@link SearchManagerFactory}
     * @utbot.methodUnderTest {@link SearchManagerFactory#registerAccountRequestSearchManager(AccountRequestSearchManager)}
     */
    @Test
    @DisplayName("registerAccountRequestSearchManager: arg_0 = AccountRequestSearchManager(String, boolean)")
    @Disabled(value = "Disabled due to sandbox")
    public void testRegisterAccountRequestSearchManager() {
        AccountRequestSearchManager accountRequestSearchManager = new AccountRequestSearchManager("", false);

        /* This test fails because method [teammates.storage.search.SearchManagerFactory.registerAccountRequestSearchManager] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///endregion
}
