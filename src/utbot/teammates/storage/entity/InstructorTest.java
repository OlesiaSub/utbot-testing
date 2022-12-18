package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;

public final class InstructorTest {
    ///region Test suites for executable teammates.storage.entity.Instructor.generateId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method generateId(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#generateId(String, String)}
     */
    @Test
    @DisplayName("generateId: arg_0 has special characters, courseId = blank string")
    public void testGenerateIdWithBlankStrings() {
        String actual = Instructor.generateId("\n\t\r", "   ");

        String expected = "\n\t\r%   ";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.getUniqueId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUniqueId()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getUniqueId()}
     * @utbot.returnsFrom {@code return id;}
     */
    @Test
    @DisplayName("getUniqueId: -> return id")
    public void testGetUniqueId_ReturnId() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        String string = "";
        setField(instructor, "teammates.storage.entity.Instructor", "id", string);

        String actual = instructor.getUniqueId();

        assertEquals(string, actual);
    }
    ///endregion

    ///region Errors report for getUniqueId

    public void testGetUniqueId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setUniqueId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setUniqueId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setUniqueId(String)}
     */
    @Test
    @DisplayName("setUniqueId: ")
    public void testSetUniqueId() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        String string = "";
        setField(instructor, "teammates.storage.entity.Instructor", "id", string);

        instructor.setUniqueId(null);
    }
    ///endregion

    ///region Errors report for setUniqueId

    public void testSetUniqueId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.getGoogleId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGoogleId()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getGoogleId()}
     * @utbot.returnsFrom {@code return googleId;}
     */
    @Test
    @DisplayName("getGoogleId: -> return googleId")
    public void testGetGoogleId_ReturnGoogleId() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "googleId", null);

        String actual = instructor.getGoogleId();

        assertNull(actual);
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

    ///region Test suites for executable teammates.storage.entity.Instructor.setGoogleId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setGoogleId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setGoogleId(String)}
     */
    @Test
    @DisplayName("setGoogleId: ")
    public void testSetGoogleId() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "googleId", null);

        instructor.setGoogleId(null);
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

    ///region Test suites for executable teammates.storage.entity.Instructor.getCourseId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCourseId()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getCourseId()}
     * @utbot.returnsFrom {@code return courseId;}
     */
    @Test
    @DisplayName("getCourseId: -> return courseId")
    public void testGetCourseId_ReturnCourseId() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "courseId", null);

        String actual = instructor.getCourseId();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getCourseId

    public void testGetCourseId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setCourseId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCourseId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setCourseId(String)}
     */
    @Test
    @DisplayName("setCourseId: ")
    public void testSetCourseId() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "courseId", null);

        instructor.setCourseId(null);
    }
    ///endregion

    ///region Errors report for setCourseId

    public void testSetCourseId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.getIsArchived

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIsArchived()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getIsArchived()}
     * @utbot.returnsFrom {@code return isArchived;}
     */
    @Test
    @DisplayName("getIsArchived: -> return isArchived")
    public void testGetIsArchived_ReturnIsArchived() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "isArchived", false);

        boolean actual = instructor.getIsArchived();

        assertFalse(actual);
    }
    ///endregion

    ///region Errors report for getIsArchived

    public void testGetIsArchived_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setIsArchived

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setIsArchived(boolean)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setIsArchived(boolean)}
     */
    @Test
    @DisplayName("setIsArchived: ")
    public void testSetIsArchived() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "isArchived", false);

        instructor.setIsArchived(false);
    }
    ///endregion

    ///region Errors report for setIsArchived

    public void testSetIsArchived_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.getName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getName()}
     * @utbot.returnsFrom {@code return name;}
     */
    @Test
    @DisplayName("getName: -> return name")
    public void testGetName_ReturnName() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "name", null);

        String actual = instructor.getName();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getName

    public void testGetName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setName(String)}
     */
    @Test
    @DisplayName("setName: ")
    public void testSetName() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "name", null);

        instructor.setName(null);
    }
    ///endregion

    ///region Errors report for setName

    public void testSetName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.getEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEmail()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getEmail()}
     * @utbot.returnsFrom {@code return email;}
     */
    @Test
    @DisplayName("getEmail: -> return email")
    public void testGetEmail_ReturnEmail() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "email", null);

        String actual = instructor.getEmail();

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

    ///region Test suites for executable teammates.storage.entity.Instructor.setEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setEmail(String)}
     */
    @Test
    @DisplayName("setEmail: ")
    public void testSetEmail() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "email", null);

        instructor.setEmail(null);
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

    ///region Test suites for executable teammates.storage.entity.Instructor.getRegistrationKey

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRegistrationKey()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getRegistrationKey()}
     * @utbot.returnsFrom {@code return registrationKey;}
     */
    @Test
    @DisplayName("getRegistrationKey: -> return registrationKey")
    public void testGetRegistrationKey_ReturnRegistrationKey() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "registrationKey", null);

        String actual = instructor.getRegistrationKey();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getRegistrationKey

    public void testGetRegistrationKey_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setRegistrationKey

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRegistrationKey(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setRegistrationKey(String)}
     */
    @Test
    @DisplayName("setRegistrationKey: ")
    public void testSetRegistrationKey() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "registrationKey", null);

        instructor.setRegistrationKey(null);
    }
    ///endregion

    ///region Errors report for setRegistrationKey

    public void testSetRegistrationKey_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.getRole

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRole()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getRole()}
     * @utbot.returnsFrom {@code return role;}
     */
    @Test
    @DisplayName("getRole: -> return role")
    public void testGetRole_ReturnRole() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        String string = "";
        setField(instructor, "teammates.storage.entity.Instructor", "role", string);

        String actual = instructor.getRole();

        assertEquals(string, actual);
    }
    ///endregion

    ///region Errors report for getRole

    public void testGetRole_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setRole

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRole(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setRole(String)}
     */
    @Test
    @DisplayName("setRole: ")
    public void testSetRole() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        String string = "";
        setField(instructor, "teammates.storage.entity.Instructor", "role", string);

        instructor.setRole(null);
    }
    ///endregion

    ///region Errors report for setRole

    public void testSetRole_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.isDisplayedToStudents

    ///region

    @Test
    public void testIsDisplayedToStudents1() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "isDisplayedToStudents", null);

        boolean actual = instructor.isDisplayedToStudents();

        assertTrue(actual);
    }

    @Test
    public void testIsDisplayedToStudents2() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        Boolean boolean1 = false;
        setField(instructor, "teammates.storage.entity.Instructor", "isDisplayedToStudents", boolean1);

        boolean actual = instructor.isDisplayedToStudents();

        assertFalse(actual);
    }
    ///endregion

    ///region Errors report for isDisplayedToStudents

    public void testIsDisplayedToStudents_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setIsDisplayedToStudents

    ///region

    @Test
    public void testSetIsDisplayedToStudents1() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        setField(instructor, "teammates.storage.entity.Instructor", "isDisplayedToStudents", null);

        instructor.setIsDisplayedToStudents(false);
    }
    ///endregion

    ///region Errors report for setIsDisplayedToStudents

    public void testSetIsDisplayedToStudents_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.getDisplayedName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDisplayedName()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getDisplayedName()}
     * @utbot.returnsFrom {@code return displayedName;}
     */
    @Test
    @DisplayName("getDisplayedName: -> return displayedName")
    public void testGetDisplayedName_ReturnDisplayedName() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        String string = "";
        setField(instructor, "teammates.storage.entity.Instructor", "displayedName", string);

        String actual = instructor.getDisplayedName();

        assertEquals(string, actual);
    }
    ///endregion

    ///region Errors report for getDisplayedName

    public void testGetDisplayedName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setDisplayedName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDisplayedName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setDisplayedName(String)}
     */
    @Test
    @DisplayName("setDisplayedName: ")
    public void testSetDisplayedName() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        String string = "";
        setField(instructor, "teammates.storage.entity.Instructor", "displayedName", string);

        instructor.setDisplayedName(null);
    }
    ///endregion

    ///region Errors report for setDisplayedName

    public void testSetDisplayedName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.getInstructorPrivilegesAsText

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstructorPrivilegesAsText()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getInstructorPrivilegesAsText()}
     * @utbot.returnsFrom {@code return instructorPrivilegesAsText;}
     */
    @Test
    @DisplayName("getInstructorPrivilegesAsText: -> return instructorPrivilegesAsText")
    public void testGetInstructorPrivilegesAsText_ReturnInstructorPrivilegesAsText() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        String string = "";
        setField(instructor, "teammates.storage.entity.Instructor", "instructorPrivilegesAsText", string);

        String actual = instructor.getInstructorPrivilegesAsText();

        assertEquals(string, actual);
    }
    ///endregion

    ///region Errors report for getInstructorPrivilegesAsText

    public void testGetInstructorPrivilegesAsText_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setInstructorPrivilegeAsText

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setInstructorPrivilegeAsText(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setInstructorPrivilegeAsText(String)}
     */
    @Test
    @DisplayName("setInstructorPrivilegeAsText: ")
    public void testSetInstructorPrivilegeAsText() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        String string = "";
        setField(instructor, "teammates.storage.entity.Instructor", "instructorPrivilegesAsText", string);

        instructor.setInstructorPrivilegeAsText(null);
    }
    ///endregion

    ///region Errors report for setInstructorPrivilegeAsText

    public void testSetInstructorPrivilegeAsText_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.getCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatedAt()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getCreatedAt()}
     * @utbot.returnsFrom {@code return createdAt;}
     */
    @Test
    @DisplayName("getCreatedAt: -> return createdAt")
    public void testGetCreatedAt_ReturnCreatedAt() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        Instant instantMock = mock(Instant.class);
        setField(instructor, "teammates.storage.entity.Instructor", "createdAt", instantMock);

        Instant actual = instructor.getCreatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///region Errors report for getCreatedAt

    public void testGetCreatedAt_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setCreatedAt(Instant)}
     * @utbot.invokes {@link Instructor#setLastUpdate(Instant)}
     */
    @Test
    @DisplayName("setCreatedAt: -> InstructorSetLastUpdate")
    public void testSetCreatedAt_InstructorSetLastUpdate() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        Instant instantMock = mock(Instant.class);
        setField(instructor, "teammates.storage.entity.Instructor", "createdAt", instantMock);
        setField(instructor, "teammates.storage.entity.Instructor", "updatedAt", instantMock);

        instructor.setCreatedAt(null);

        Instant finalInstructorCreatedAt = ((Instant) getFieldValue(instructor, "teammates.storage.entity.Instructor", "createdAt"));

        assertNull(finalInstructorCreatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.getUpdatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUpdatedAt()

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#getUpdatedAt()}
     * @utbot.returnsFrom {@code return updatedAt;}
     */
    @Test
    @DisplayName("getUpdatedAt: -> return updatedAt")
    public void testGetUpdatedAt_ReturnUpdatedAt() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        Instant instantMock = mock(Instant.class);
        setField(instructor, "teammates.storage.entity.Instructor", "updatedAt", instantMock);

        Instant actual = instructor.getUpdatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///region Errors report for getUpdatedAt

    public void testGetUpdatedAt_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Instructor.setLastUpdate

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLastUpdate(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link Instructor}
     * @utbot.methodUnderTest {@link Instructor#setLastUpdate(Instant)}
     */
    @Test
    @DisplayName("setLastUpdate: ")
    public void testSetLastUpdate() throws Exception {
        Instructor instructor = ((Instructor) createInstance("teammates.storage.entity.Instructor"));
        Instant instantMock = mock(Instant.class);
        setField(instructor, "teammates.storage.entity.Instructor", "updatedAt", instantMock);

        instructor.setLastUpdate(null);

        Instant finalInstructorUpdatedAt = ((Instant) getFieldValue(instructor, "teammates.storage.entity.Instructor", "updatedAt"));

        assertNull(finalInstructorUpdatedAt);
    }
    ///endregion

    ///endregion
}
