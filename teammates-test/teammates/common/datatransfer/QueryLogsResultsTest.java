package teammates.common.datatransfer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public final class QueryLogsResultsTest {
    ///region Test suites for executable teammates.common.datatransfer.QueryLogsResults.getLogEntries

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getLogEntries()

    /**
     * @utbot.classUnderTest {@link QueryLogsResults}
     * @utbot.methodUnderTest {@link QueryLogsResults#getLogEntries()}
     */
    @Test
    @DisplayName("getLogEntries: arg_0 = QueryLogsResults(List, boolean)")
    public void testGetLogEntries() {
        List list = emptyList();
        QueryLogsResults queryLogsResults = new QueryLogsResults(list, false);

        Object actual = queryLogsResults.getLogEntries();

        // java.util.List is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(list, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.QueryLogsResults.getHasNextPage

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getHasNextPage()

    /**
     * @utbot.classUnderTest {@link QueryLogsResults}
     * @utbot.methodUnderTest {@link QueryLogsResults#getHasNextPage()}
     */
    @Test
    @DisplayName("getHasNextPage: arg_0 = QueryLogsResults(List, boolean) -> return false")
    public void testGetHasNextPageReturnsFalse() {
        List list = emptyList();
        QueryLogsResults queryLogsResults = new QueryLogsResults(list, false);

        boolean actual = queryLogsResults.getHasNextPage();

        assertFalse(actual);
    }
    ///endregion

    ///endregion
}
