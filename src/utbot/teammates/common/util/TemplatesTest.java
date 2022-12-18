package teammates.common.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNull;

public final class TemplatesTest {
    ///region Test suites for executable teammates.common.util.Templates.populateTemplate

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method populateTemplate(java.lang.String, java.lang.String[])

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray() {
        String[] keyValuePairs = {"noimn", "oesjb", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray1() {
        String[] keyValuePairs = {"", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray() {
        String[] keyValuePairs = {"noimn", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray1() {
        String[] keyValuePairs = {"hlcoj", "syiug", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray2() {
        String[] keyValuePairs = {"", "syiug", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray3() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "hlcoj", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray() {
        String[] keyValuePairs = {"oxhrh", "noimn", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray4() {
        String[] keyValuePairs = {"syiug", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray2() {
        String[] keyValuePairs = {"", "The number of elements in keyValuePairs passed in must be even", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray5() {
        String[] keyValuePairs = {"uhauh", "jkmqh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray6() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray1() {
        String[] keyValuePairs = {"hlcoj", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray3() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray7() {
        String[] keyValuePairs = {"syiug", "noimn", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray2() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray8() {
        String[] keyValuePairs = {"nbwca", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray4() {
        String[] keyValuePairs = {"tyvjm", "jkmqh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray3() {
        String[] keyValuePairs = {"oxhrh", "The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray9() {
        String[] keyValuePairs = {"syiug", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray5() {
        String[] keyValuePairs = {"oxhrh", "noimn", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray6() {
        String[] keyValuePairs = {"jkmqh", "uhauh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray4() {
        String[] keyValuePairs = {"noimn", "oxhrh", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray10() {
        String[] keyValuePairs = {"noimn", "syiug", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray7() {
        String[] keyValuePairs = {"uhauh", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray8() {
        String[] keyValuePairs = {"noimn", "oxhrh", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray11() {
        String[] keyValuePairs = {"oxhrh", "noimn", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray12() {
        String[] keyValuePairs = {"tyvjm", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray9() {
        String[] keyValuePairs = {"syiug", "noimn", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray13() {
        String[] keyValuePairs = {"noimn", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray14() {
        String[] keyValuePairs = {"oxhrh", "syiug", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray5() {
        String[] keyValuePairs = {"noimn", "syiug", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray10() {
        String[] keyValuePairs = {"oxhrh", "noimn", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray11() {
        String[] keyValuePairs = {"syiug", "syiug", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray15() {
        String[] keyValuePairs = {"hlcoj", "noimn", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray12() {
        String[] keyValuePairs = {"hlcoj", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray13() {
        String[] keyValuePairs = {"", "syiug", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray14() {
        String[] keyValuePairs = {"hlcoj", "hlcoj", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray15() {
        String[] keyValuePairs = {"oxhrh", "The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray6() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "hlcoj", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray16() {
        String[] keyValuePairs = {"", "syiug", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray16() {
        String[] keyValuePairs = {"hlcoj", "oxhrh", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray17() {
        String[] keyValuePairs = {"oxhrh", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray17() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray18() {
        String[] keyValuePairs = {"oesjb", "", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray18() {
        String[] keyValuePairs = {"hlcoj", "syiug", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray19() {
        String[] keyValuePairs = {"oesjb", "oxhrh", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray7() {
        String[] keyValuePairs = {"", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray20() {
        String[] keyValuePairs = {"oesjb", "syiug", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray19() {
        String[] keyValuePairs = {"noimn", "oesjb", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray21() {
        String[] keyValuePairs = {"jkmqh", "uhauh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray22() {
        String[] keyValuePairs = {"oesjb", "oxhrh", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray8() {
        String[] keyValuePairs = {"syiug", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray20() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray23() {
        String[] keyValuePairs = {"oesjb", "syiug", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray9() {
        String[] keyValuePairs = {"nbwca", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray24() {
        String[] keyValuePairs = {"qylov", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray21() {
        String[] keyValuePairs = {"uhauh", "jkmqh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray10() {
        String[] keyValuePairs = {"", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray25() {
        String[] keyValuePairs = {"syiug", "oxhrh", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[1] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray11() {
        String[] keyValuePairs = {"ujwtk"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray22() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray12() {
        String[] keyValuePairs = {"syiug", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray26() {
        String[] keyValuePairs = {"hlcoj", "The number of elements in keyValuePairs passed in must be even", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[1] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray23() {
        String[] keyValuePairs = {"siuty"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray24() {
        String[] keyValuePairs = {"syiug", "oxhrh", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray25() {
        String[] keyValuePairs = {"tyvjm", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray27() {
        String[] keyValuePairs = {"jkmqh", "nbwca"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray26() {
        String[] keyValuePairs = {"oxhrh", "The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray28() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "hlcoj", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray29() {
        String[] keyValuePairs = {"syiug", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray13() {
        String[] keyValuePairs = {"oxhrh", "hlcoj", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray27() {
        String[] keyValuePairs = {"oxhrh", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray28() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray30() {
        String[] keyValuePairs = {"noimn", "noimn", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray29() {
        String[] keyValuePairs = {"oesjb", "syiug", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray30() {
        String[] keyValuePairs = {"oesjb", "", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[1] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray31() {
        String[] keyValuePairs = {"ujwtk"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray31() {
        String[] keyValuePairs = {"hlcoj", "noimn", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray14() {
        String[] keyValuePairs = {"hlcoj", "", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray32() {
        String[] keyValuePairs = {"noimn", "oxhrh", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray32() {
        String[] keyValuePairs = {"", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray33() {
        String[] keyValuePairs = {"oesjb", "The number of elements in keyValuePairs passed in must be even", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray33() {
        String[] keyValuePairs = {"oesjb", "oxhrh", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray34() {
        String[] keyValuePairs = {"hlcoj", "The number of elements in keyValuePairs passed in must be even", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray34() {
        String[] keyValuePairs = {"noimn", "syiug", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray35() {
        String[] keyValuePairs = {"syiug", "noimn", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray15() {
        String[] keyValuePairs = {"noimn", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray36() {
        String[] keyValuePairs = {"", "oxhrh", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray35() {
        String[] keyValuePairs = {"oxhrh", "noimn", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray37() {
        String[] keyValuePairs = {"nbwca", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray38() {
        String[] keyValuePairs = {"syiug", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray16() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "oesjb", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray36() {
        String[] keyValuePairs = {"hlcoj", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray39() {
        String[] keyValuePairs = {"", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray17() {
        String[] keyValuePairs = {"", "qylov"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray40() {
        String[] keyValuePairs = {"", "oesjb", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray37() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray18() {
        String[] keyValuePairs = {"oesjb", "", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray41() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "syiug", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray19() {
        String[] keyValuePairs = {"uhauh", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray38() {
        String[] keyValuePairs = {"qylov", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray20() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "oxhrh", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray42() {
        String[] keyValuePairs = {"oesjb", "hlcoj", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray39() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray40() {
        String[] keyValuePairs = {"hlcoj", "oesjb", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray43() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "hlcoj", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[1] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray44() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray41() {
        String[] keyValuePairs = {"noimn", "oesjb", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray45() {
        String[] keyValuePairs = {"oesjb", "noimn", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray46() {
        String[] keyValuePairs = {"oesjb", "The number of elements in keyValuePairs passed in must be even", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray21() {
        String[] keyValuePairs = {"syiug", "oesjb", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray42() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "hlcoj", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray43() {
        String[] keyValuePairs = {"syiug", "hlcoj", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray47() {
        String[] keyValuePairs = {"oxhrh", "oesjb", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray44() {
        String[] keyValuePairs = {"oesjb", "", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray45() {
        String[] keyValuePairs = {"", "", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray46() {
        String[] keyValuePairs = {"syiug", "oxhrh", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray47() {
        String[] keyValuePairs = {"oxhrh", "hlcoj", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray22() {
        String[] keyValuePairs = {"", "oxhrh", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray48() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "syiug", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray48() {
        String[] keyValuePairs = {"syiug", "oxhrh", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray49() {
        String[] keyValuePairs = {"oesjb", "hlcoj", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray49() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "oesjb", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray50() {
        String[] keyValuePairs = {"noimn", "noimn", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray50() {
        String[] keyValuePairs = {"oxhrh", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray51() {
        String[] keyValuePairs = {"hlcoj", "hlcoj", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray23() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "syiug", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray52() {
        String[] keyValuePairs = {"hlcoj", "The number of elements in keyValuePairs passed in must be even", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray51() {
        String[] keyValuePairs = {"syiug", "", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray53() {
        String[] keyValuePairs = {"qylov", "jkmqh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray54() {
        String[] keyValuePairs = {"hlcoj", "hlcoj", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray24() {
        String[] keyValuePairs = {"noimn", "syiug", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray52() {
        String[] keyValuePairs = {"", "oxhrh", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray55() {
        String[] keyValuePairs = {"hlcoj", "oxhrh", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray25() {
        String[] keyValuePairs = {"tyvjm", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray56() {
        String[] keyValuePairs = {"uhauh", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray53() {
        String[] keyValuePairs = {"nbwca", "nbwca"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray26() {
        String[] keyValuePairs = {"", "oesjb", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray57() {
        String[] keyValuePairs = {"oesjb", "noimn", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray54() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "oesjb", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray55() {
        String[] keyValuePairs = {"", "uhauh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray27() {
        String[] keyValuePairs = {"syiug", "hlcoj", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray58() {
        String[] keyValuePairs = {"syiug", "The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray56() {
        String[] keyValuePairs = {"jkmqh", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray57() {
        String[] keyValuePairs = {"noimn", "noimn", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray59() {
        String[] keyValuePairs = {"", "noimn", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[1] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray60() {
        String[] keyValuePairs = {"siuty"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray58() {
        String[] keyValuePairs = {"syiug", "The number of elements in keyValuePairs passed in must be even", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray61() {
        String[] keyValuePairs = {"oxhrh", "oxhrh", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray62() {
        String[] keyValuePairs = {"oesjb", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray28() {
        String[] keyValuePairs = {"oesjb", "oesjb", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray59() {
        String[] keyValuePairs = {"", "noimn", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray60() {
        String[] keyValuePairs = {"oxhrh", "", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray63() {
        String[] keyValuePairs = {"hlcoj", "", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray61() {
        String[] keyValuePairs = {"syiug", "oesjb", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray62() {
        String[] keyValuePairs = {"oesjb", "hlcoj", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray63() {
        String[] keyValuePairs = {"oxhrh", "The number of elements in keyValuePairs passed in must be even", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray64() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "syiug", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray29() {
        String[] keyValuePairs = {"oxhrh", "noimn", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray65() {
        String[] keyValuePairs = {"hlcoj", "noimn", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray64() {
        String[] keyValuePairs = {"oxhrh", "The number of elements in keyValuePairs passed in must be even", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray65() {
        String[] keyValuePairs = {"", "oxhrh", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray66() {
        String[] keyValuePairs = {"", "syiug", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray67() {
        String[] keyValuePairs = {"syiug", "syiug", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray66() {
        String[] keyValuePairs = {"noimn", "The number of elements in keyValuePairs passed in must be even", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray67() {
        String[] keyValuePairs = {"noimn", "The number of elements in keyValuePairs passed in must be even", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray30() {
        String[] keyValuePairs = {"hlcoj", "syiug", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray68() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "oxhrh", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray68() {
        String[] keyValuePairs = {"oesjb", "syiug", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray69() {
        String[] keyValuePairs = {"jkmqh", "jkmqh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray70() {
        String[] keyValuePairs = {"noimn", "oxhrh", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray31() {
        String[] keyValuePairs = {"syiug", "The number of elements in keyValuePairs passed in must be even", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray69() {
        String[] keyValuePairs = {"oxhrh", "syiug", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray71() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "oxhrh", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray32() {
        String[] keyValuePairs = {"nbwca", "uhauh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray72() {
        String[] keyValuePairs = {"qylov", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray70() {
        String[] keyValuePairs = {"uhauh", "nbwca"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray33() {
        String[] keyValuePairs = {"oesjb", "oxhrh", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray73() {
        String[] keyValuePairs = {"oxhrh", "oxhrh", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray71() {
        String[] keyValuePairs = {"hlcoj", "syiug", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray72() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "uhauh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray34() {
        String[] keyValuePairs = {"hlcoj", "The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray74() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[1] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray73() {
        String[] keyValuePairs = {"lyviq"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray74() {
        String[] keyValuePairs = {"syiug", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[1] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray75() {
        String[] keyValuePairs = {"ujwtk"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray75() {
        String[] keyValuePairs = {"uhauh", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray76() {
        String[] keyValuePairs = {"oesjb", "syiug", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray76() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray77() {
        String[] keyValuePairs = {"noimn", "oxhrh", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray35() {
        String[] keyValuePairs = {"hlcoj", "The number of elements in keyValuePairs passed in must be even", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray77() {
        String[] keyValuePairs = {"", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray78() {
        String[] keyValuePairs = {"noimn", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray78() {
        String[] keyValuePairs = {"oesjb", "", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray79() {
        String[] keyValuePairs = {"syiug", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray80() {
        String[] keyValuePairs = {"hlcoj", "syiug", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray81() {
        String[] keyValuePairs = {"oxhrh", "noimn", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray82() {
        String[] keyValuePairs = {"", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray36() {
        String[] keyValuePairs = {"oesjb", "oxhrh", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray83() {
        String[] keyValuePairs = {"oxhrh", "syiug", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray79() {
        String[] keyValuePairs = {"oxhrh", "noimn", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray80() {
        String[] keyValuePairs = {"noimn", "noimn", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray84() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "hlcoj", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray85() {
        String[] keyValuePairs = {"noimn", "syiug", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray81() {
        String[] keyValuePairs = {"oesjb", "", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray82() {
        String[] keyValuePairs = {"hlcoj", "", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray37() {
        String[] keyValuePairs = {"oxhrh", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray83() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "oesjb", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray86() {
        String[] keyValuePairs = {"hlcoj", "oxhrh", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray84() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray85() {
        String[] keyValuePairs = {"hlcoj", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray38() {
        String[] keyValuePairs = {"oesjb", "syiug", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray87() {
        String[] keyValuePairs = {"oesjb", "oxhrh", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray86() {
        String[] keyValuePairs = {"oxhrh", "The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray39() {
        String[] keyValuePairs = {"qylov", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray87() {
        String[] keyValuePairs = {"", "qylov"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray88() {
        String[] keyValuePairs = {"jkmqh", "uhauh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray40() {
        String[] keyValuePairs = {"hlcoj", "noimn", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray88() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "oxhrh", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray41() {
        String[] keyValuePairs = {"tyvjm", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray89() {
        String[] keyValuePairs = {"nbwca", "tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray42() {
        String[] keyValuePairs = {"syiug", "oxhrh", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray89() {
        String[] keyValuePairs = {"oxhrh", "hlcoj", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[1] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray90() {
        String[] keyValuePairs = {"hswlo"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray91() {
        String[] keyValuePairs = {"noimn", "hlcoj", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray92() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "nbwca"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray90() {
        String[] keyValuePairs = {"qylov", "jkmqh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray93() {
        String[] keyValuePairs = {"syiug", "noimn", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray91() {
        String[] keyValuePairs = {"syiug", "The number of elements in keyValuePairs passed in must be even", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray92() {
        String[] keyValuePairs = {"oxhrh", "oesjb", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray43() {
        String[] keyValuePairs = {"syiug", "oxhrh", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray94() {
        String[] keyValuePairs = {"oxhrh", "noimn", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray95() {
        String[] keyValuePairs = {"syiug", "oesjb", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray93() {
        String[] keyValuePairs = {"hlcoj", "hlcoj", "syiug"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray96() {
        String[] keyValuePairs = {"hlcoj", "oesjb", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray97() {
        String[] keyValuePairs = {"", "hlcoj", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[2] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray94() {
        String[] keyValuePairs = {"jkmqh", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray98() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "oesjb", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray44() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "syiug", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 has special characters, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray99() {
        String[] keyValuePairs = {"", "", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("\n\t\r", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray95() {
        String[] keyValuePairs = {"hlcoj", "oxhrh", ""};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray96() {
        String[] keyValuePairs = {"oxhrh", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray100() {
        String[] keyValuePairs = {"The number of elements in keyValuePairs passed in must be even", "oxhrh", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = blank string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithBlankStringAndNonEmptyObjectArray101() {
        String[] keyValuePairs = {"oesjb", "The number of elements in keyValuePairs passed in must be even", "The number of elements in keyValuePairs passed in must be even"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("   ", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 != empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray97() {
        String[] keyValuePairs = {"hlcoj", "noimn", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("string", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray98() {
        String[] keyValuePairs = {"oesjb", "The number of elements in keyValuePairs passed in must be even", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = empty string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithEmptyStringAndNonEmptyObjectArray45() {
        String[] keyValuePairs = {"", "", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("", keyValuePairs));
    }

    /**
     * @utbot.classUnderTest {@link Templates}
     * @utbot.methodUnderTest {@link Templates#populateTemplate(String, String[])}
     */
    @Test
    @DisplayName("populateTemplate: arg_0 = string, keyValuePairs = String[3] -> throw NoClassDefFoundError")
    public void testPopulateTemplateThrowsNCDFEWithNonEmptyStringAndNonEmptyObjectArray99() {
        String[] keyValuePairs = {"oesjb", "noimn", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate("The number of elements in keyValuePairs passed in must be even", keyValuePairs));
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method populateTemplate(java.lang.String, java.lang.String[])

    @Test
    public void testPopulateTemplate1() {
        String template = "";
        String[] keyValuePairs = {};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, keyValuePairs));
    }

    @Test
    public void testPopulateTemplate2() {
        String template = "";

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, null));
    }

    @Test
    public void testPopulateTemplate3() {
        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(null, null));
    }

    @Test
    public void testPopulateTemplate4() {
        String template = "";

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, null));
    }

    @Test
    public void testPopulateTemplate5() {
        String template = "";

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, null));
    }

    @Test
    public void testPopulateTemplate6() {
        String template = "";

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, null));
    }

    @Test
    public void testPopulateTemplate7() {
        String template = "";

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, null));
    }

    @Test
    public void testPopulateTemplate8() {
        String template = "";

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, null));
    }

    @Test
    public void testPopulateTemplate9() {
        String template = "";
        String[] keyValuePairs = {};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, keyValuePairs));
    }

    @Test
    public void testPopulateTemplate10() {
        String[] keyValuePairs = new String[18];

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(null, keyValuePairs));

        String finalKeyValuePairs0 = keyValuePairs[0];
        String finalKeyValuePairs1 = keyValuePairs[1];
        String finalKeyValuePairs2 = keyValuePairs[2];
        String finalKeyValuePairs3 = keyValuePairs[3];
        String finalKeyValuePairs4 = keyValuePairs[4];
        String finalKeyValuePairs5 = keyValuePairs[5];
        String finalKeyValuePairs6 = keyValuePairs[6];
        String finalKeyValuePairs7 = keyValuePairs[7];
        String finalKeyValuePairs8 = keyValuePairs[8];
        String finalKeyValuePairs9 = keyValuePairs[9];
        String finalKeyValuePairs10 = keyValuePairs[10];
        String finalKeyValuePairs11 = keyValuePairs[11];
        String finalKeyValuePairs12 = keyValuePairs[12];
        String finalKeyValuePairs13 = keyValuePairs[13];
        String finalKeyValuePairs14 = keyValuePairs[14];
        String finalKeyValuePairs15 = keyValuePairs[15];
        String finalKeyValuePairs16 = keyValuePairs[16];
        String finalKeyValuePairs17 = keyValuePairs[17];

        assertNull(finalKeyValuePairs0);

        assertNull(finalKeyValuePairs1);

        assertNull(finalKeyValuePairs2);

        assertNull(finalKeyValuePairs3);

        assertNull(finalKeyValuePairs4);

        assertNull(finalKeyValuePairs5);

        assertNull(finalKeyValuePairs6);

        assertNull(finalKeyValuePairs7);

        assertNull(finalKeyValuePairs8);

        assertNull(finalKeyValuePairs9);

        assertNull(finalKeyValuePairs10);

        assertNull(finalKeyValuePairs11);

        assertNull(finalKeyValuePairs12);

        assertNull(finalKeyValuePairs13);

        assertNull(finalKeyValuePairs14);

        assertNull(finalKeyValuePairs15);

        assertNull(finalKeyValuePairs16);

        assertNull(finalKeyValuePairs17);
    }

    @Test
    public void testPopulateTemplate11() {
        String template = "";
        String[] keyValuePairs = {};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, keyValuePairs));
    }

    @Test
    public void testPopulateTemplate12() {
        String template = "";

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, null));
    }

    @Test
    public void testPopulateTemplate13() {
        String[] keyValuePairs = new String[18];

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(null, keyValuePairs));

        String finalKeyValuePairs0 = keyValuePairs[0];
        String finalKeyValuePairs1 = keyValuePairs[1];
        String finalKeyValuePairs2 = keyValuePairs[2];
        String finalKeyValuePairs3 = keyValuePairs[3];
        String finalKeyValuePairs4 = keyValuePairs[4];
        String finalKeyValuePairs5 = keyValuePairs[5];
        String finalKeyValuePairs6 = keyValuePairs[6];
        String finalKeyValuePairs7 = keyValuePairs[7];
        String finalKeyValuePairs8 = keyValuePairs[8];
        String finalKeyValuePairs9 = keyValuePairs[9];
        String finalKeyValuePairs10 = keyValuePairs[10];
        String finalKeyValuePairs11 = keyValuePairs[11];
        String finalKeyValuePairs12 = keyValuePairs[12];
        String finalKeyValuePairs13 = keyValuePairs[13];
        String finalKeyValuePairs14 = keyValuePairs[14];
        String finalKeyValuePairs15 = keyValuePairs[15];
        String finalKeyValuePairs16 = keyValuePairs[16];
        String finalKeyValuePairs17 = keyValuePairs[17];

        assertNull(finalKeyValuePairs0);

        assertNull(finalKeyValuePairs1);

        assertNull(finalKeyValuePairs2);

        assertNull(finalKeyValuePairs3);

        assertNull(finalKeyValuePairs4);

        assertNull(finalKeyValuePairs5);

        assertNull(finalKeyValuePairs6);

        assertNull(finalKeyValuePairs7);

        assertNull(finalKeyValuePairs8);

        assertNull(finalKeyValuePairs9);

        assertNull(finalKeyValuePairs10);

        assertNull(finalKeyValuePairs11);

        assertNull(finalKeyValuePairs12);

        assertNull(finalKeyValuePairs13);

        assertNull(finalKeyValuePairs14);

        assertNull(finalKeyValuePairs15);

        assertNull(finalKeyValuePairs16);

        assertNull(finalKeyValuePairs17);
    }

    @Test
    public void testPopulateTemplate14() {
        String template = "";

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, null));
    }

    @Test
    public void testPopulateTemplate15() {
        String template = "";
        String[] keyValuePairs = {};

        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(template, keyValuePairs));
    }

    @Test
    public void testPopulateTemplate16() {
        assertThrows(NoClassDefFoundError.class, () -> Templates.populateTemplate(null, null));
    }
    ///endregion

    ///region Errors report for populateTemplate

    public void testPopulateTemplate_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
