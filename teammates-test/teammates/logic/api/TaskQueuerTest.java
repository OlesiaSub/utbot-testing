package teammates.logic.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public final class TaskQueuerTest {
    ///region Test suites for executable teammates.logic.api.TaskQueuer.scheduleStudentForSearchIndexing

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method scheduleStudentForSearchIndexing(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link TaskQueuer}
     * @utbot.methodUnderTest {@link TaskQueuer#scheduleStudentForSearchIndexing(String, String)}
     */
    @Test
    @DisplayName("scheduleStudentForSearchIndexing: courseId != empty string, email != empty string")
    @Disabled(value = "Disabled due to sandbox")
    public void testScheduleStudentForSearchIndexingWithNonEmptyStrings() {
        TaskQueuer taskQueuer = new TaskQueuer();

        /* This test fails because method [teammates.logic.api.TaskQueuer.scheduleStudentForSearchIndexing] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///endregion
}
