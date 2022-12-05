package teammates.logic.external;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public final class LocalFileStorageServiceTest {
    ///region Test suites for executable teammates.logic.external.LocalFileStorageService.getContent

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getContent(java.lang.String)

    /**
     * @utbot.classUnderTest {@link LocalFileStorageService}
     * @utbot.methodUnderTest {@link LocalFileStorageService#getContent(String)}
     */
    @Test
    @DisplayName("getContent: fileKey = empty string")
    @Disabled(value = "Disabled due to sandbox")
    public void testGetContentWithEmptyString() {
        LocalFileStorageService localFileStorageService = new LocalFileStorageService();

        /* This test fails because method [teammates.logic.external.LocalFileStorageService.getContent] produces [java.security.AccessControlException: access denied ("java.util.PropertyPermission" "user.dir" "read")] */
    }
    ///endregion

    ///region Errors report for getContent

    public void testGetContent_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed

        // 2 occurrences of:
        // Concrete execution failed

    }
    ///endregion

    ///endregion
}
