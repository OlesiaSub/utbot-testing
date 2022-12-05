package teammates.common.datatransfer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.util.StringHelper;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;

public final class UserInfoCookieTest {
    ///region Test suites for executable teammates.common.datatransfer.UserInfoCookie.fromCookie

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fromCookie(java.lang.String)

    /**
     * @utbot.classUnderTest {@link UserInfoCookie}
     * @utbot.methodUnderTest {@link UserInfoCookie#fromCookie(String)}
     * @utbot.executesCondition {@code (cookie == null): True}
     */
    @Test
    @DisplayName("fromCookie: cookie == null : True -> return null")
    public void testFromCookie_CookieEqualsNull() {
        UserInfoCookie actual = UserInfoCookie.fromCookie(null);

        assertNull(actual);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method fromCookie(java.lang.String)

    /**
     * @utbot.classUnderTest {@link UserInfoCookie}
     * @utbot.methodUnderTest {@link UserInfoCookie#fromCookie(String)}
     */
    @Test
    @DisplayName("fromCookie: arg_0 = blank string -> throw NoClassDefFoundError")
    public void testFromCookieThrowsNCDFEWithBlankString() {
        assertThrows(NoClassDefFoundError.class, () -> UserInfoCookie.fromCookie("   "));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfoCookie.getUserId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUserId()

    /**
     * @utbot.classUnderTest {@link UserInfoCookie}
     * @utbot.methodUnderTest {@link UserInfoCookie#getUserId()}
     * @utbot.returnsFrom {@code return userId;}
     */
    @Test
    @DisplayName("getUserId: -> return userId")
    public void testGetUserId_ReturnUserId() throws Exception {
        UserInfoCookie userInfoCookie = ((UserInfoCookie) createInstance("teammates.common.datatransfer.UserInfoCookie"));
        setField(userInfoCookie, "teammates.common.datatransfer.UserInfoCookie", "userId", null);

        String actual = userInfoCookie.getUserId();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getUserId

    public void testGetUserId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfoCookie.setUserId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUserId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link UserInfoCookie}
     * @utbot.methodUnderTest {@link UserInfoCookie#setUserId(String)}
     */
    @Test
    @DisplayName("setUserId: ")
    public void testSetUserId() throws Exception {
        UserInfoCookie userInfoCookie = ((UserInfoCookie) createInstance("teammates.common.datatransfer.UserInfoCookie"));
        setField(userInfoCookie, "teammates.common.datatransfer.UserInfoCookie", "userId", null);

        userInfoCookie.setUserId(null);
    }
    ///endregion

    ///region Errors report for setUserId

    public void testSetUserId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfoCookie.getVerificationCode

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVerificationCode()

    /**
     * @utbot.classUnderTest {@link UserInfoCookie}
     * @utbot.methodUnderTest {@link UserInfoCookie#getVerificationCode()}
     * @utbot.returnsFrom {@code return verificationCode;}
     */
    @Test
    @DisplayName("getVerificationCode: -> return verificationCode")
    public void testGetVerificationCode_ReturnVerificationCode() throws Exception {
        UserInfoCookie userInfoCookie = ((UserInfoCookie) createInstance("teammates.common.datatransfer.UserInfoCookie"));
        setField(userInfoCookie, "teammates.common.datatransfer.UserInfoCookie", "verificationCode", null);

        String actual = userInfoCookie.getVerificationCode();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getVerificationCode

    public void testGetVerificationCode_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfoCookie.setVerificationCode

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setVerificationCode(java.lang.String)

    /**
     * @utbot.classUnderTest {@link UserInfoCookie}
     * @utbot.methodUnderTest {@link UserInfoCookie#setVerificationCode(String)}
     */
    @Test
    @DisplayName("setVerificationCode: ")
    public void testSetVerificationCode() throws Exception {
        UserInfoCookie userInfoCookie = ((UserInfoCookie) createInstance("teammates.common.datatransfer.UserInfoCookie"));
        setField(userInfoCookie, "teammates.common.datatransfer.UserInfoCookie", "verificationCode", null);

        userInfoCookie.setVerificationCode(null);
    }
    ///endregion

    ///region Errors report for setVerificationCode

    public void testSetVerificationCode_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfoCookie.getExpiryTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getExpiryTime()

    /**
     * @utbot.classUnderTest {@link UserInfoCookie}
     * @utbot.methodUnderTest {@link UserInfoCookie#getExpiryTime()}
     * @utbot.returnsFrom {@code return expiryTime;}
     */
    @Test
    @DisplayName("getExpiryTime: -> return expiryTime")
    public void testGetExpiryTime_ReturnExpiryTime() throws Exception {
        UserInfoCookie userInfoCookie = ((UserInfoCookie) createInstance("teammates.common.datatransfer.UserInfoCookie"));
        setField(userInfoCookie, "teammates.common.datatransfer.UserInfoCookie", "expiryTime", -255L);

        long actual = userInfoCookie.getExpiryTime();

        assertEquals(-255L, actual);
    }
    ///endregion

    ///region Errors report for getExpiryTime

    public void testGetExpiryTime_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfoCookie.setExpiryTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setExpiryTime(long)

    /**
     * @utbot.classUnderTest {@link UserInfoCookie}
     * @utbot.methodUnderTest {@link UserInfoCookie#setExpiryTime(long)}
     */
    @Test
    @DisplayName("setExpiryTime: ")
    public void testSetExpiryTime() throws Exception {
        UserInfoCookie userInfoCookie = ((UserInfoCookie) createInstance("teammates.common.datatransfer.UserInfoCookie"));
        setField(userInfoCookie, "teammates.common.datatransfer.UserInfoCookie", "expiryTime", 1L);

        userInfoCookie.setExpiryTime(-255L);

        long finalUserInfoCookieExpiryTime = ((Long) getFieldValue(userInfoCookie, "teammates.common.datatransfer.UserInfoCookie", "expiryTime"));

        assertEquals(-255L, finalUserInfoCookieExpiryTime);
    }
    ///endregion

    ///region Errors report for setExpiryTime

    public void testSetExpiryTime_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.UserInfoCookie.isValid

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isValid()

    /**
     * @utbot.classUnderTest {@link UserInfoCookie}
     * @utbot.methodUnderTest {@link UserInfoCookie#isValid()}
     * @utbot.invokes {@link StringHelper#isCorrectSignature(String, String)}
     * @utbot.returnsFrom {@code return StringHelper.isCorrectSignature(userId, verificationCode) && Instant.now().isBefore(Instant.ofEpochMilli(expiryTime));}
     * @utbot.throwsException {@link NoClassDefFoundError} in: return StringHelper.isCorrectSignature(userId, verificationCode) && Instant.now().isBefore(Instant.ofEpochMilli(expiryTime));
     */
    @Test
    @DisplayName("isValid: return StringHelper.isCorrectSignature(userId, verificationCode) && Instant.now().isBefore(Instant.ofEpochMilli(expiryTime)) -> ThrowNoClassDefFoundError")
    public void testIsValid_StringHelperIsCorrectSignatureAndInstantNowIsBefore() throws Exception {
        UserInfoCookie userInfoCookie = ((UserInfoCookie) createInstance("teammates.common.datatransfer.UserInfoCookie"));
        String string = "";
        setField(userInfoCookie, "teammates.common.datatransfer.UserInfoCookie", "userId", string);
        setField(userInfoCookie, "teammates.common.datatransfer.UserInfoCookie", "verificationCode", null);

        assertThrows(NoClassDefFoundError.class, () -> userInfoCookie.isValid());
    }
    ///endregion

    ///region Errors report for isValid

    public void testIsValid_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
