package teammates.logic.external;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertTrue;

public final class EmptyRecaptchaServiceTest {
    ///region Test suites for executable teammates.logic.external.EmptyRecaptchaService.isVerificationSuccessful

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isVerificationSuccessful(java.lang.String)

    /**
     * @utbot.classUnderTest {@link EmptyRecaptchaService}
     * @utbot.methodUnderTest {@link EmptyRecaptchaService#isVerificationSuccessful(String)}
     */
    @Test
    @DisplayName("isVerificationSuccessful: captchaResponse = blank string -> return true")
    public void testIsVerificationSuccessfulReturnsTrueWithBlankString() {
        EmptyRecaptchaService emptyRecaptchaService = new EmptyRecaptchaService();

        boolean actual = emptyRecaptchaService.isVerificationSuccessful("   ");

        assertTrue(actual);
    }
    ///endregion

    ///endregion
}
