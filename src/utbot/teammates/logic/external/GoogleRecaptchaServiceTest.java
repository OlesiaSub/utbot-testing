package teammates.logic.external;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public final class GoogleRecaptchaServiceTest {
    ///region Test suites for executable teammates.logic.external.GoogleRecaptchaService.getApiResponse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getApiResponse(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link GoogleRecaptchaService}
     * @utbot.methodUnderTest {@link GoogleRecaptchaService#getApiResponse(String, String)}
     */
    @Test
    @DisplayName("getApiResponse: captchaResponse = string, secretKey != empty string")
    @Disabled(value = "Disabled due to sandbox")
    public void testGetApiResponseWithNonEmptyStrings() {
        GoogleRecaptchaService googleRecaptchaService = new GoogleRecaptchaService("hlcoj");

        /* This test fails because method [teammates.logic.external.GoogleRecaptchaService.getApiResponse] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///region Errors report for getApiResponse

    public void testGetApiResponse_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 48 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
