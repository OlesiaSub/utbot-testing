package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import com.googlecode.objectify.Key;
import org.mockito.MockedStatic;

import java.time.Instant;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.mock;
import static com.googlecode.objectify.Key.create;
import static org.mockito.Mockito.when;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;

public final class StudentProfileTest {
    ///region Test suites for executable teammates.storage.entity.StudentProfile.getGoogleId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGoogleId()

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#getGoogleId()}
     * @utbot.returnsFrom {@code return this.googleId;}
     */
    @Test
    @DisplayName("getGoogleId: -> return this.googleId")
    public void testGetGoogleId_ReturnThisGoogleId() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        String string = "";
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "googleId", string);

        String actual = studentProfile.getGoogleId();

        assertEquals(string, actual);
    }
    ///endregion

    ///region Errors report for getGoogleId

    public void testGetGoogleId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.setGoogleId

    ///region

    @Test
    public void testSetGoogleId1() throws Exception {
        MockedStatic mockedStatic = null;
        try {
            mockedStatic = mockStatic(Key.class);
            (mockedStatic.when(() -> create(any(Class.class), any(String.class)))).thenReturn(((Key) null));
            StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
            Key keyMock = mock(Key.class);
            (when(keyMock.create(any(Class.class), any(String.class)))).thenReturn(((Key) null));
            setField(studentProfile, "teammates.storage.entity.StudentProfile", "account", keyMock);
            String string = "";
            setField(studentProfile, "teammates.storage.entity.StudentProfile", "googleId", string);

            studentProfile.setGoogleId(null);

            Key finalStudentProfileAccount = ((Key) getFieldValue(studentProfile, "teammates.storage.entity.StudentProfile", "account"));

            assertNull(finalStudentProfileAccount);
        } finally {
            mockedStatic.close();
        }
    }
    ///endregion

    ///region Errors report for setGoogleId

    public void testSetGoogleId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.getShortName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShortName()

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#getShortName()}
     * @utbot.returnsFrom {@code return this.shortName;}
     */
    @Test
    @DisplayName("getShortName: -> return this.shortName")
    public void testGetShortName_ReturnThisShortName() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "shortName", null);

        String actual = studentProfile.getShortName();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getShortName

    public void testGetShortName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.setShortName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setShortName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#setShortName(String)}
     */
    @Test
    @DisplayName("setShortName: ")
    public void testSetShortName() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "shortName", null);

        studentProfile.setShortName(null);
    }
    ///endregion

    ///region Errors report for setShortName

    public void testSetShortName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.getEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEmail()

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#getEmail()}
     * @utbot.returnsFrom {@code return this.email;}
     */
    @Test
    @DisplayName("getEmail: -> return this.email")
    public void testGetEmail_ReturnThisEmail() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "email", null);

        String actual = studentProfile.getEmail();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getEmail

    public void testGetEmail_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.setEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#setEmail(String)}
     */
    @Test
    @DisplayName("setEmail: ")
    public void testSetEmail() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "email", null);

        studentProfile.setEmail(null);
    }
    ///endregion

    ///region Errors report for setEmail

    public void testSetEmail_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.getInstitute

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstitute()

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#getInstitute()}
     * @utbot.returnsFrom {@code return this.institute;}
     */
    @Test
    @DisplayName("getInstitute: -> return this.institute")
    public void testGetInstitute_ReturnThisInstitute() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "institute", null);

        String actual = studentProfile.getInstitute();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getInstitute

    public void testGetInstitute_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.setInstitute

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setInstitute(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#setInstitute(String)}
     */
    @Test
    @DisplayName("setInstitute: ")
    public void testSetInstitute() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "institute", null);

        studentProfile.setInstitute(null);
    }
    ///endregion

    ///region Errors report for setInstitute

    public void testSetInstitute_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.getNationality

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNationality()

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#getNationality()}
     * @utbot.returnsFrom {@code return this.nationality;}
     */
    @Test
    @DisplayName("getNationality: -> return this.nationality")
    public void testGetNationality_ReturnThisNationality() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "nationality", null);

        String actual = studentProfile.getNationality();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getNationality

    public void testGetNationality_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.setNationality

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNationality(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#setNationality(String)}
     */
    @Test
    @DisplayName("setNationality: ")
    public void testSetNationality() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "nationality", null);

        studentProfile.setNationality(null);
    }
    ///endregion

    ///region Errors report for setNationality

    public void testSetNationality_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.getGender

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGender()

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#getGender()}
     * @utbot.returnsFrom {@code return this.gender;}
     */
    @Test
    @DisplayName("getGender: -> return this.gender")
    public void testGetGender_ReturnThisGender() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "gender", null);

        String actual = studentProfile.getGender();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getGender

    public void testGetGender_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.setGender

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setGender(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#setGender(String)}
     */
    @Test
    @DisplayName("setGender: ")
    public void testSetGender() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "gender", null);

        studentProfile.setGender(null);
    }
    ///endregion

    ///region Errors report for setGender

    public void testSetGender_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.getMoreInfo

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMoreInfo()

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#getMoreInfo()}
     * @utbot.returnsFrom {@code return moreInfo;}
     */
    @Test
    @DisplayName("getMoreInfo: -> return moreInfo")
    public void testGetMoreInfo_ReturnMoreInfo() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        String string = "";
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "moreInfo", string);

        String actual = studentProfile.getMoreInfo();

        assertEquals(string, actual);
    }
    ///endregion

    ///region Errors report for getMoreInfo

    public void testGetMoreInfo_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.setMoreInfo

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMoreInfo(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#setMoreInfo(String)}
     */
    @Test
    @DisplayName("setMoreInfo: ")
    public void testSetMoreInfo() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        String string = "";
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "moreInfo", string);

        studentProfile.setMoreInfo(null);
    }
    ///endregion

    ///region Errors report for setMoreInfo

    public void testSetMoreInfo_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.getModifiedDate

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getModifiedDate()

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#getModifiedDate()}
     * @utbot.returnsFrom {@code return this.modifiedDate;}
     */
    @Test
    @DisplayName("getModifiedDate: -> return this.modifiedDate")
    public void testGetModifiedDate_ReturnThisModifiedDate() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        Instant instantMock = mock(Instant.class);
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "modifiedDate", instantMock);

        Instant actual = studentProfile.getModifiedDate();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///region Errors report for getModifiedDate

    public void testGetModifiedDate_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.StudentProfile.setModifiedDate

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setModifiedDate(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link StudentProfile}
     * @utbot.methodUnderTest {@link StudentProfile#setModifiedDate(Instant)}
     */
    @Test
    @DisplayName("setModifiedDate: ")
    public void testSetModifiedDate() throws Exception {
        StudentProfile studentProfile = ((StudentProfile) createInstance("teammates.storage.entity.StudentProfile"));
        Instant instantMock = mock(Instant.class);
        setField(studentProfile, "teammates.storage.entity.StudentProfile", "modifiedDate", instantMock);

        studentProfile.setModifiedDate(null);

        Instant finalStudentProfileModifiedDate = ((Instant) getFieldValue(studentProfile, "teammates.storage.entity.StudentProfile", "modifiedDate"));

        assertNull(finalStudentProfileModifiedDate);
    }
    ///endregion

    ///endregion
}
