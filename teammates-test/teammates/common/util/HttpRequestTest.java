package teammates.common.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public final class HttpRequestTest {
    ///region Test suites for executable teammates.common.util.HttpRequest.executeGetRequest

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method executeGetRequest(java.net.URI)

    /**
     * @utbot.classUnderTest {@link HttpRequest}
     * @utbot.methodUnderTest {@link HttpRequest#executeGetRequest(URI)}
     */
    @Test
    @DisplayName("executeGetRequest: arg_0 = URI(String, String, String)")
    @Timeout(value = 1000L, unit = TimeUnit.MILLISECONDS)
    public void testExecuteGetRequest() throws URISyntaxException, IOException {
        URI uri = new URI("tyvjm", "qylov", "uhauh");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        assertTimeoutPreemptively(Duration.ofMillis(1000L), () -> HttpRequest.executeGetRequest(uri));
    }
    ///endregion

    ///region Errors report for executeGetRequest

    public void testExecuteGetRequest_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
