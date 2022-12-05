package teammates.logic.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public final class LogicTest {
    ///region Test suites for executable teammates.logic.api.Logic.getDeadlineExtensionsPossiblyNeedingClosingEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getDeadlineExtensionsPossiblyNeedingClosingEmail()

    /**
     * @utbot.classUnderTest {@link Logic}
     * @utbot.methodUnderTest {@link Logic#getDeadlineExtensionsPossiblyNeedingClosingEmail()}
     */
    @Test
    @DisplayName("getDeadlineExtensionsPossiblyNeedingClosingEmail: arg_0 = Logic()")
    @Disabled(value = "Disabled due to sandbox")
    public void testGetDeadlineExtensionsPossiblyNeedingClosingEmail() {
        Logic logic = new Logic();

        /* This test fails because method [teammates.logic.api.Logic.getDeadlineExtensionsPossiblyNeedingClosingEmail] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///endregion
}
