package teammates.common.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class AppUrlTest {
    ///region Test suites for executable teammates.common.util.AppUrl.withUserId

    ///region

    @Test
    public void testWithUserId1() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);

        AppUrl actual = appUrl.withUserId(null);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithUserId2() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String userId = "";

        AppUrl actual = appUrl.withUserId(userId);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithUserId3() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String userId = "\u0000";
        
        /* This test fails because method [teammates.common.util.AppUrl.withUserId] produces [java.lang.NullPointerException]
            teammates.common.util.Url.addParamToUrl(Url.java:68)
            teammates.common.util.Url.withParam(Url.java:48)
            teammates.common.util.AppUrl.withUserId(AppUrl.java:14) */
        appUrl.withUserId(userId);
    }
    ///endregion

    ///region Errors report for withUserId

    public void testWithUserId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.AppUrl.withRegistrationKey

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withRegistrationKey(java.lang.String)

    /**
     * @utbot.classUnderTest {@link AppUrl}
     * @utbot.methodUnderTest {@link AppUrl#withRegistrationKey(String)}
     * @utbot.invokes {@link AppUrl#withParam(String, String)}
     * @utbot.returnsFrom {@code return withParam(Const.ParamsNames.REGKEY, key);}
     */
    @Test
    @DisplayName("withRegistrationKey: AppUrlWithParam -> return withParam(Const.ParamsNames.REGKEY, key)")
    public void testWithRegistrationKey_AppUrlWithParam() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);

        AppUrl actual = appUrl.withRegistrationKey(null);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }
    ///endregion

    ///region Errors report for withRegistrationKey

    public void testWithRegistrationKey_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.AppUrl.withIsCreatingAccount

    ///region

    @Test
    public void testWithIsCreatingAccount1() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);

        AppUrl actual = appUrl.withIsCreatingAccount(null);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithIsCreatingAccount2() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String isCreatingAccount = "";

        AppUrl actual = appUrl.withIsCreatingAccount(isCreatingAccount);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithIsCreatingAccount3() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String isCreatingAccount = "\u0000";
        
        /* This test fails because method [teammates.common.util.AppUrl.withIsCreatingAccount] produces [java.lang.NullPointerException]
            teammates.common.util.Url.addParamToUrl(Url.java:68)
            teammates.common.util.Url.withParam(Url.java:48)
            teammates.common.util.AppUrl.withIsCreatingAccount(AppUrl.java:22) */
        appUrl.withIsCreatingAccount(isCreatingAccount);
    }
    ///endregion

    ///region Errors report for withIsCreatingAccount

    public void testWithIsCreatingAccount_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.AppUrl.withCourseId

    ///region

    @Test
    public void testWithCourseId1() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);

        AppUrl actual = appUrl.withCourseId(null);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithCourseId2() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String courseId = "";

        AppUrl actual = appUrl.withCourseId(courseId);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithCourseId3() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String courseId = "\u0000";
        
        /* This test fails because method [teammates.common.util.AppUrl.withCourseId] produces [java.lang.NullPointerException]
            teammates.common.util.Url.addParamToUrl(Url.java:68)
            teammates.common.util.Url.withParam(Url.java:48)
            teammates.common.util.AppUrl.withCourseId(AppUrl.java:26) */
        appUrl.withCourseId(courseId);
    }
    ///endregion

    ///region Errors report for withCourseId

    public void testWithCourseId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.AppUrl.withSessionName

    ///region

    @Test
    public void testWithSessionName1() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);

        AppUrl actual = appUrl.withSessionName(null);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithSessionName2() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String feedbackSessionName = "";

        AppUrl actual = appUrl.withSessionName(feedbackSessionName);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }
    ///endregion

    ///region Errors report for withSessionName

    public void testWithSessionName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.AppUrl.withStudentEmail

    ///region

    @Test
    public void testWithStudentEmail1() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);

        AppUrl actual = appUrl.withStudentEmail(null);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithStudentEmail2() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String email = "";

        AppUrl actual = appUrl.withStudentEmail(email);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithStudentEmail3() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String email = "\u0000";
        
        /* This test fails because method [teammates.common.util.AppUrl.withStudentEmail] produces [java.lang.NullPointerException]
            teammates.common.util.Url.addParamToUrl(Url.java:68)
            teammates.common.util.Url.withParam(Url.java:48)
            teammates.common.util.AppUrl.withStudentEmail(AppUrl.java:34) */
        appUrl.withStudentEmail(email);
    }
    ///endregion

    ///region Errors report for withStudentEmail

    public void testWithStudentEmail_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.AppUrl.withEntityType

    ///region

    @Test
    public void testWithEntityType1() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);

        AppUrl actual = appUrl.withEntityType(null);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithEntityType2() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String entityType = "";

        AppUrl actual = appUrl.withEntityType(entityType);

        String actualBaseUrl = ((String) getFieldValue(actual, "teammates.common.util.Url", "baseUrl"));
        assertNull(actualBaseUrl);

        assertTrue(deepEquals(appUrl, actual));
        assertTrue(deepEquals(appUrl, actual));
    }

    @Test
    public void testWithEntityType3() throws Exception {
        AppUrl appUrl = ((AppUrl) createInstance("teammates.common.util.AppUrl"));
        setField(appUrl, "teammates.common.util.Url", "query", null);
        String entityType = "\u0000";
        
        /* This test fails because method [teammates.common.util.AppUrl.withEntityType] produces [java.lang.NullPointerException]
            teammates.common.util.Url.addParamToUrl(Url.java:68)
            teammates.common.util.Url.withParam(Url.java:48)
            teammates.common.util.AppUrl.withEntityType(AppUrl.java:38) */
        appUrl.withEntityType(entityType);
    }
    ///endregion

    ///region Errors report for withEntityType

    public void testWithEntityType_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
