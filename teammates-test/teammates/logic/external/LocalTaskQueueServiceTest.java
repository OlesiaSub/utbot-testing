package teammates.logic.external;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.util.TaskWrapper;

import static org.mockito.Mockito.mock;

public final class LocalTaskQueueServiceTest {
    ///region Test suites for executable teammates.logic.external.LocalTaskQueueService.addDeferredTask

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method addDeferredTask(teammates.common.util.TaskWrapper, long)

    /**
     * @utbot.classUnderTest {@link LocalTaskQueueService}
     * @utbot.methodUnderTest {@link LocalTaskQueueService#addDeferredTask(TaskWrapper, long)}
     */
    @Test
    @DisplayName("addDeferredTask: task = TaskWrapper(String, String, Map, Object), countdownTime = Long.MAX_VALUE")
    @Disabled(value = "Disabled due to sandbox")
    public void testAddDeferredTaskWithCornerCase() {
        LocalTaskQueueService localTaskQueueService = new LocalTaskQueueService();
        TaskWrapper taskMock = mock(TaskWrapper.class);

        /* This test fails because method [teammates.logic.external.LocalTaskQueueService.addDeferredTask] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///region Errors report for addDeferredTask

    public void testAddDeferredTask_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 499 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
