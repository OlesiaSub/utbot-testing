package teammates.common.util;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public final class SanitizationHelperTest {
    ///region Test suites for executable teammates.common.util.SanitizationHelper.sanitizeGoogleId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sanitizeGoogleId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeGoogleId(String)}
     * @utbot.executesCondition {@code (rawGoogleId == null): True}
     * @utbot.returnsFrom {@code return null;}
     */
    @Test
    @DisplayName("sanitizeGoogleId: rawGoogleId == null : True -> return null")
    public void testSanitizeGoogleId_RawGoogleIdEqualsNull() {
        String actual = SanitizationHelper.sanitizeGoogleId(null);

        assertNull(actual);
    }
    ///endregion

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sanitizeGoogleId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeGoogleId(String)}
     */
    @Test
    @DisplayName("sanitizeGoogleId: arg_0 = blank string")
    public void testSanitizeGoogleIdWithBlankString() {
        String actual = SanitizationHelper.sanitizeGoogleId("   ");

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.SanitizationHelper.sanitizeEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sanitizeEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeEmail(String)}
     */
    @Test
    @DisplayName("sanitizeEmail: arg_0 = blank string -> throw NoClassDefFoundError")
    public void testSanitizeEmailThrowsNCDFEWithBlankString() {
        assertThrows(NoClassDefFoundError.class, () -> SanitizationHelper.sanitizeEmail("   "));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.SanitizationHelper.sanitizeName

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sanitizeName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeName(String)}
     */
    @Test
    @DisplayName("sanitizeName: arg_0 = blank string -> throw NoClassDefFoundError")
    public void testSanitizeNameThrowsNCDFEWithBlankString() {
        assertThrows(NoClassDefFoundError.class, () -> SanitizationHelper.sanitizeName("   "));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.SanitizationHelper.sanitizeTitle

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sanitizeTitle(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeTitle(String)}
     */
    @Test
    @DisplayName("sanitizeTitle: arg_0 = blank string -> throw NoClassDefFoundError")
    public void testSanitizeTitleThrowsNCDFEWithBlankString() {
        assertThrows(NoClassDefFoundError.class, () -> SanitizationHelper.sanitizeTitle("   "));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.SanitizationHelper.sanitizeTextField

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sanitizeTextField(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeTextField(String)}
     */
    @Test
    @DisplayName("sanitizeTextField: arg_0 = blank string -> throw NoClassDefFoundError")
    public void testSanitizeTextFieldThrowsNCDFEWithBlankString() {
        assertThrows(NoClassDefFoundError.class, () -> SanitizationHelper.sanitizeTextField("   "));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.SanitizationHelper.sanitizeForRichText

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sanitizeForRichText(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeForRichText(String)}
     * @utbot.executesCondition {@code (content == null): True}
     * @utbot.returnsFrom {@code return null;}
     */
    @Test
    @DisplayName("sanitizeForRichText: content == null : True -> return null")
    public void testSanitizeForRichText_ContentEqualsNull() {
        String actual = SanitizationHelper.sanitizeForRichText(null);

        assertNull(actual);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method sanitizeForRichText(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeForRichText(String)}
     */
    @Test
    @DisplayName("sanitizeForRichText: arg_0 = blank string")
    @Disabled(value = "Disabled due to sandbox")
    public void testSanitizeForRichTextWithBlankString() {
        assertThrows(ExceptionInInitializerError.class, () -> SanitizationHelper.sanitizeForRichText("   "));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.SanitizationHelper.sanitizeForHtml

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sanitizeForHtml(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeForHtml(String)}
     * @utbot.executesCondition {@code (unsanitizedString == null): True}
     * @utbot.returnsFrom {@code return null;}
     */
    @Test
    @DisplayName("sanitizeForHtml: unsanitizedString == null : True -> return null")
    public void testSanitizeForHtml_UnsanitizedStringEqualsNull() {
        String actual = SanitizationHelper.sanitizeForHtml(null);

        assertNull(actual);
    }
    ///endregion

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sanitizeForHtml(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeForHtml(String)}
     */
    @Test
    @DisplayName("sanitizeForHtml: arg_0 = string")
    public void testSanitizeForHtmlWithNonEmptyString() {
        String actual = SanitizationHelper.sanitizeForHtml("<");

        String expected = "&lt;";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.SanitizationHelper.sanitizeForUri

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sanitizeForUri(java.lang.String)

    /**
     * @utbot.classUnderTest {@link SanitizationHelper}
     * @utbot.methodUnderTest {@link SanitizationHelper#sanitizeForUri(String)}
     */
    @Test
    @DisplayName("sanitizeForUri: arg_0 = string")
    public void testSanitizeForUriWithNonEmptyString() {
        String actual = SanitizationHelper.sanitizeForUri("%20");

        String expected = "%2520";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
