package teammates.common.datatransfer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public final class UserInfoTest {
    ///region Test suites for executable teammates.common.datatransfer.UserInfo.getId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getId()

    /**
     * @utbot.classUnderTest {@link UserInfo}
     * @utbot.methodUnderTest {@link UserInfo#getId()}
     */
    @Test
    @DisplayName("getId: arg_0 = UserInfo(String)")
    public void testGetId() {
        UserInfo userInfo = new UserInfo("hlcoj");

        String actual = userInfo.getId();

        String expected = "hlcoj";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfo.getIsAdmin

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getIsAdmin()

    /**
     * @utbot.classUnderTest {@link UserInfo}
     * @utbot.methodUnderTest {@link UserInfo#getIsAdmin()}
     */
    @Test
    @DisplayName("getIsAdmin: arg_0 = UserInfo(String) -> return false")
    public void testGetIsAdminReturnsFalse() {
        UserInfo userInfo = new UserInfo("hlcoj");

        boolean actual = userInfo.getIsAdmin();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfo.getIsInstructor

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getIsInstructor()

    /**
     * @utbot.classUnderTest {@link UserInfo}
     * @utbot.methodUnderTest {@link UserInfo#getIsInstructor()}
     */
    @Test
    @DisplayName("getIsInstructor: arg_0 = UserInfo(String) -> return false")
    public void testGetIsInstructorReturnsFalse() {
        UserInfo userInfo = new UserInfo("hlcoj");

        boolean actual = userInfo.getIsInstructor();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfo.getIsStudent

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getIsStudent()

    /**
     * @utbot.classUnderTest {@link UserInfo}
     * @utbot.methodUnderTest {@link UserInfo#getIsStudent()}
     */
    @Test
    @DisplayName("getIsStudent: arg_0 = UserInfo(String) -> return false")
    public void testGetIsStudentReturnsFalse() {
        UserInfo userInfo = new UserInfo("hlcoj");

        boolean actual = userInfo.getIsStudent();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfo.getIsMaintainer

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getIsMaintainer()

    /**
     * @utbot.classUnderTest {@link UserInfo}
     * @utbot.methodUnderTest {@link UserInfo#getIsMaintainer()}
     */
    @Test
    @DisplayName("getIsMaintainer: arg_0 = UserInfo(String) -> return false")
    public void testGetIsMaintainerReturnsFalse() {
        UserInfo userInfo = new UserInfo("hlcoj");

        boolean actual = userInfo.getIsMaintainer();

        assertFalse(actual);
    }
    ///endregion

    ///endregion
}
