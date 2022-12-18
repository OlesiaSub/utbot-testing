package teammates.common.util;

import org.junit.jupiter.api.Test;

import java.io.InputStream;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertNull;

public final class FileHelperTest {
    ///region Test suites for executable teammates.common.util.FileHelper.getResourceAsStream

    ///region

    @Test
    public void testGetResourceAsStream1() {
        InputStream actual = FileHelper.getResourceAsStream("   ");

        assertNull(actual);
    }

    @Test
    public void testGetResourceAsStream2() {
        /* This test fails because method [teammates.common.util.FileHelper.getResourceAsStream] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:221)
            java.base/java.lang.ClassLoader.getResourceAsStream(ClassLoader.java:1736)
            teammates.common.util.FileHelper.getResourceAsStream(FileHelper.java:21) */
        FileHelper.getResourceAsStream(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FileHelper.readResourceFile

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readResourceFile(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FileHelper}
     * @utbot.methodUnderTest {@link FileHelper#readResourceFile(String)}
     * @utbot.invokes {@link FileHelper#getResourceAsStream(String)}
     * @utbot.throwsException {@link NullPointerException} in: try (Scanner scanner = new Scanner(getResourceAsStream(file), Const.ENCODING)) {
     * return scanner.useDelimiter("\\Z").next();
     * }
     */
    @Test
    @DisplayName("readResourceFile: try (Scanner scanner = new Scanner(getResourceAsStream(file), Const.ENCODING)) { return scanner.useDelimiter(\"\\\\Z\").next() } -> ThrowNullPointerException")
    public void testReadResourceFile_FileHelperGetResourceAsStream() {
        /* This test fails because method [teammates.common.util.FileHelper.readResourceFile] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:221)
            java.base/java.lang.ClassLoader.getResourceAsStream(ClassLoader.java:1736)
            teammates.common.util.FileHelper.getResourceAsStream(FileHelper.java:21)
            teammates.common.util.FileHelper.readResourceFile(FileHelper.java:30) */
        FileHelper.readResourceFile(null);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method readResourceFile(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FileHelper}
     * @utbot.methodUnderTest {@link FileHelper#readResourceFile(String)}
     */
    @Test
    @DisplayName("readResourceFile: arg_0 = empty string -> throw NullPointerException")
    public void testReadResourceFileThrowsNPEWithEmptyString() {
        /* This test fails because method [teammates.common.util.FileHelper.readResourceFile] produces [java.lang.NullPointerException: source]
            java.base/java.util.Objects.requireNonNull(Objects.java:246)
            java.base/java.util.Scanner.<init>(Scanner.java:595)
            teammates.common.util.FileHelper.readResourceFile(FileHelper.java:30) */
        FileHelper.readResourceFile("");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method readResourceFile(java.lang.String)

    @Test
    public void testReadResourceFile1() {
        String file = "";
        
        /* This test fails because method [teammates.common.util.FileHelper.readResourceFile] produces [java.lang.NullPointerException: source]
            java.base/java.util.Objects.requireNonNull(Objects.java:246)
            java.base/java.util.Scanner.<init>(Scanner.java:595)
            teammates.common.util.FileHelper.readResourceFile(FileHelper.java:30) */
        FileHelper.readResourceFile(file);
    }
    ///endregion

    ///endregion
}
