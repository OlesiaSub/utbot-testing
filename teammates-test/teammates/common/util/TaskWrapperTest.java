package teammates.common.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Map;

import static java.util.Collections.emptyMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class TaskWrapperTest {
    ///region Test suites for executable teammates.common.util.TaskWrapper.getQueueName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getQueueName()

    /**
     * @utbot.classUnderTest {@link TaskWrapper}
     * @utbot.methodUnderTest {@link TaskWrapper#getQueueName()}
     */
    @Test
    @DisplayName("getQueueName: arg_0 = TaskWrapper(String, String, Map, Object)")
    public void testGetQueueName() {
        Map map = emptyMap();
        Object object = new Object();
        TaskWrapper taskWrapper = new TaskWrapper("", "syiug", map, object);

        String actual = taskWrapper.getQueueName();

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.TaskWrapper.getWorkerUrl

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getWorkerUrl()

    /**
     * @utbot.classUnderTest {@link TaskWrapper}
     * @utbot.methodUnderTest {@link TaskWrapper#getWorkerUrl()}
     */
    @Test
    @DisplayName("getWorkerUrl: arg_0 = TaskWrapper(String, String, Map, Object)")
    public void testGetWorkerUrl() {
        Map map = emptyMap();
        Object object = new Object();
        TaskWrapper taskWrapper = new TaskWrapper("", "syiug", map, object);

        String actual = taskWrapper.getWorkerUrl();

        String expected = "syiug";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.TaskWrapper.getParamMap

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getParamMap()

    /**
     * @utbot.classUnderTest {@link TaskWrapper}
     * @utbot.methodUnderTest {@link TaskWrapper#getParamMap()}
     */
    @Test
    @DisplayName("getParamMap: arg_0 = TaskWrapper(String, String, Map, Object)")
    public void testGetParamMap() {
        Map map = emptyMap();
        Object object = new Object();
        TaskWrapper taskWrapper = new TaskWrapper("", "syiug", map, object);

        Object actual = taskWrapper.getParamMap();

        // java.util.Map is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(map, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.TaskWrapper.getRequestBody

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRequestBody()

    /**
     * @utbot.classUnderTest {@link TaskWrapper}
     * @utbot.methodUnderTest {@link TaskWrapper#getRequestBody()}
     */
    @Test
    @DisplayName("getRequestBody: arg_0 = TaskWrapper(String, String, Map, Object)")
    public void testGetRequestBody() {
        Map map = emptyMap();
        Object object = new Object();
        TaskWrapper taskWrapper = new TaskWrapper("", "syiug", map, object);

        Object actual = taskWrapper.getRequestBody();

    }
    ///endregion

    ///endregion
}
