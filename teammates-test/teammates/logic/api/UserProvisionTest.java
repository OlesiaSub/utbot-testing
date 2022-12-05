package teammates.logic.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public final class UserProvisionTest {
    ///region Test suites for executable teammates.logic.api.UserProvision.getAdminOnlyUser

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getAdminOnlyUser(java.lang.String)

    /**
     * @utbot.classUnderTest {@link UserProvision}
     * @utbot.methodUnderTest {@link UserProvision#getAdminOnlyUser(String)}
     */
    @Test
    @DisplayName("getAdminOnlyUser: userId = blank string")
    @Disabled(value = "Disabled due to sandbox")
    public void testGetAdminOnlyUserWithBlankString() {
        UserProvision userProvision = new UserProvision();

        /* This test fails because method [teammates.logic.api.UserProvision.getAdminOnlyUser] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///region Errors report for getAdminOnlyUser

    public void testGetAdminOnlyUser_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
