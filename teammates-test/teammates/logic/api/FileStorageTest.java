package teammates.logic.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public final class FileStorageTest {
    ///region Test suites for executable teammates.logic.api.FileStorage.create

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method create(java.lang.String, byte[], java.lang.String)

    /**
     * @utbot.classUnderTest {@link FileStorage}
     * @utbot.methodUnderTest {@link FileStorage#create(String, byte[], String)}
     */
    @Test
    @DisplayName("create: fileKey = blank string, contentBytes = byte[3], contentType has special characters")
    @Disabled(value = "Disabled due to sandbox")
    public void testCreateWithBlankStringsAndNonEmptyPrimitiveArray() {
        FileStorage fileStorage = new FileStorage();
        byte[] contentBytes = {(byte) 64, (byte) -71, (byte) -104};

        /* This test fails because method [teammates.logic.api.FileStorage.create] produces [java.security.AccessControlException: access denied ("java.util.logging.LoggingPermission" "control")] */
    }
    ///endregion

    ///region Errors report for create

    public void testCreate_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 321 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
