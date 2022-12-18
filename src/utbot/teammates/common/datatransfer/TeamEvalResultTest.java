package teammates.common.datatransfer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public final class TeamEvalResultTest {
    ///region Test suites for executable teammates.common.datatransfer.TeamEvalResult.toString

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method toString()

    /**
     * @utbot.classUnderTest {@link TeamEvalResult}
     * @utbot.methodUnderTest {@link TeamEvalResult#toString()}
     */
    @Test
    @DisplayName("toString: arg_0 = TeamEvalResult(int[][])")
    @Disabled(value = "Disabled due to sandbox")
    public void testToString() {
        int[][] intArray = {};
        TeamEvalResult teamEvalResult = new TeamEvalResult(intArray);

        /* This test fails because method [teammates.common.datatransfer.TeamEvalResult.toString] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///region Errors report for toString

    public void testToString_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed

    }
    ///endregion

    ///endregion
}
