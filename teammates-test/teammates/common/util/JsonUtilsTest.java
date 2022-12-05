package teammates.common.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import com.google.gson.JsonNull;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class JsonUtilsTest {
    ///region Test suites for executable teammates.common.util.JsonUtils.toJson

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toJson(java.lang.Object)

    /**
     * @utbot.classUnderTest {@link JsonUtils}
     * @utbot.methodUnderTest {@link JsonUtils#toJson(Object)}
     */
    @Test
    @DisplayName("toJson: arg_0 = Object()")
    public void testToJson() {
        Object src = new Object();

        String actual = JsonUtils.toJson(src);

        String expected = "{}";
        assertEquals(expected, actual);
    }
    ///endregion

    ///region Errors report for toJson

    public void testToJson_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field UPPER_CASE_WITH_UNDERSCORES is not declared in class com.google.gson.FieldNamingPolicy

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.JsonUtils.toCompactJson

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toCompactJson(java.lang.Object)

    /**
     * @utbot.classUnderTest {@link JsonUtils}
     * @utbot.methodUnderTest {@link JsonUtils#toCompactJson(Object)}
     */
    @Test
    @DisplayName("toCompactJson: arg_0 = Object()")
    public void testToCompactJson() {
        Object src = new Object();

        String actual = JsonUtils.toCompactJson(src);

        String expected = "{}";
        assertEquals(expected, actual);
    }
    ///endregion

    ///region Errors report for toCompactJson

    public void testToCompactJson_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field UPPER_CASE_WITH_UNDERSCORES is not declared in class com.google.gson.FieldNamingPolicy

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.JsonUtils.parse

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method parse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link JsonUtils}
     * @utbot.methodUnderTest {@link JsonUtils#parse(String)}
     */
    @Test
    @DisplayName("parse: arg_0 = blank string")
    public void testParseWithBlankString() {
        JsonNull actual = ((JsonNull) JsonUtils.parse("   "));

        JsonNull expected = new JsonNull();
        // com.google.gson.JsonNull has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
