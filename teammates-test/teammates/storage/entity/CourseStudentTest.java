package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.mockito.Mockito.mock;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;

public final class CourseStudentTest {
    ///region Test suites for executable teammates.storage.entity.CourseStudent.generateId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method generateId(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#generateId(String, String)}
     */
    @Test
    @DisplayName("generateId: arg_0 has special characters, courseId = blank string")
    public void testGenerateIdWithBlankStrings() {
        String actual = CourseStudent.generateId("\n\t\r", "   ");

        String expected = "\n\t\r%   ";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatedAt()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getCreatedAt()}
     * @utbot.returnsFrom {@code return createdAt;}
     */
    @Test
    @DisplayName("getCreatedAt: -> return createdAt")
    public void testGetCreatedAt_ReturnCreatedAt() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        Instant instantMock = mock(Instant.class);
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "createdAt", instantMock);

        Instant actual = courseStudent.getCreatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///region Errors report for getCreatedAt

    public void testGetCreatedAt_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.setCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#setCreatedAt(Instant)}
     * @utbot.invokes {@link CourseStudent#setLastUpdate(Instant)}
     */
    @Test
    @DisplayName("setCreatedAt: -> CourseStudentSetLastUpdate")
    public void testSetCreatedAt_CourseStudentSetLastUpdate() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        Instant instantMock = mock(Instant.class);
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "createdAt", instantMock);
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "updatedAt", instantMock);

        courseStudent.setCreatedAt(null);

        Instant finalCourseStudentCreatedAt = ((Instant) getFieldValue(courseStudent, "teammates.storage.entity.CourseStudent", "createdAt"));

        assertNull(finalCourseStudentCreatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getUpdatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUpdatedAt()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getUpdatedAt()}
     * @utbot.returnsFrom {@code return updatedAt;}
     */
    @Test
    @DisplayName("getUpdatedAt: -> return updatedAt")
    public void testGetUpdatedAt_ReturnUpdatedAt() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        Instant instantMock = mock(Instant.class);
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "updatedAt", instantMock);

        Instant actual = courseStudent.getUpdatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///region Errors report for getUpdatedAt

    public void testGetUpdatedAt_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.setLastUpdate

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setLastUpdate(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#setLastUpdate(Instant)}
     */
    @Test
    @DisplayName("setLastUpdate: ")
    public void testSetLastUpdate() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        Instant instantMock = mock(Instant.class);
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "updatedAt", instantMock);

        courseStudent.setLastUpdate(null);

        Instant finalCourseStudentUpdatedAt = ((Instant) getFieldValue(courseStudent, "teammates.storage.entity.CourseStudent", "updatedAt"));

        assertNull(finalCourseStudentUpdatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getUniqueId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUniqueId()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getUniqueId()}
     * @utbot.returnsFrom {@code return this.id;}
     */
    @Test
    @DisplayName("getUniqueId: -> return this.id")
    public void testGetUniqueId_ReturnThisId() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        String string = "";
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "id", string);

        String actual = courseStudent.getUniqueId();

        assertEquals(string, actual);
    }
    ///endregion

    ///region Errors report for getUniqueId

    public void testGetUniqueId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEmail()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getEmail()}
     * @utbot.returnsFrom {@code return email;}
     */
    @Test
    @DisplayName("getEmail: -> return email")
    public void testGetEmail_ReturnEmail() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "email", null);

        String actual = courseStudent.getEmail();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getEmail

    public void testGetEmail_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.setEmail

    ///region

    @Test
    public void testSetEmail1() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        
        /* This test fails because method [teammates.storage.entity.CourseStudent.setEmail] produces [java.lang.NullPointerException]
            teammates.storage.entity.CourseStudent.setEmail(CourseStudent.java:115) */
        courseStudent.setEmail(null);
    }

    @Test
    public void testSetEmail2() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "email", null);
        String email = "!";

        courseStudent.setEmail(email);
    }
    ///endregion

    ///region Errors report for setEmail

    public void testSetEmail_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getGoogleId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGoogleId()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getGoogleId()}
     * @utbot.returnsFrom {@code return googleId;}
     */
    @Test
    @DisplayName("getGoogleId: -> return googleId")
    public void testGetGoogleId_ReturnGoogleId() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "googleId", null);

        String actual = courseStudent.getGoogleId();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getGoogleId

    public void testGetGoogleId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.setGoogleId

    ///region

    @Test
    public void testSetGoogleId1() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "googleId", null);

        courseStudent.setGoogleId(null);
    }

    @Test
    public void testSetGoogleId2() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "googleId", null);
        String googleId = "!";

        courseStudent.setGoogleId(googleId);
    }
    ///endregion

    ///region Errors report for setGoogleId

    public void testSetGoogleId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getName()}
     * @utbot.returnsFrom {@code return name;}
     */
    @Test
    @DisplayName("getName: -> return name")
    public void testGetName_ReturnName() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        String string = "";
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "name", string);

        String actual = courseStudent.getName();

        assertEquals(string, actual);
    }
    ///endregion

    ///region Errors report for getName

    public void testGetName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.setName

    ///region

    @Test
    public void testSetName1() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        
        /* This test fails because method [teammates.storage.entity.CourseStudent.setName] produces [java.lang.NullPointerException]
            teammates.storage.entity.CourseStudent.setName(CourseStudent.java:134) */
        courseStudent.setName(null);
    }

    @Test
    public void testSetName2() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        String string = "";
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "name", string);
        String name = "!";

        courseStudent.setName(name);
    }
    ///endregion

    ///region Errors report for setName

    public void testSetName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getComments

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getComments()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getComments()}
     * @utbot.returnsFrom {@code return comments;}
     */
    @Test
    @DisplayName("getComments: -> return comments")
    public void testGetComments_ReturnComments() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        String string = "";
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "comments", string);

        String actual = courseStudent.getComments();

        assertEquals(string, actual);
    }
    ///endregion

    ///region Errors report for getComments

    public void testGetComments_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.setComments

    ///region

    @Test
    public void testSetComments1() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        String string = "";
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "comments", string);

        courseStudent.setComments(null);
    }

    @Test
    public void testSetComments2() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        String string = "";
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "comments", string);
        String comments = "!";

        courseStudent.setComments(comments);
    }
    ///endregion

    ///region Errors report for setComments

    public void testSetComments_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getRegistrationKey

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRegistrationKey()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getRegistrationKey()}
     * @utbot.returnsFrom {@code return registrationKey;}
     */
    @Test
    @DisplayName("getRegistrationKey: -> return registrationKey")
    public void testGetRegistrationKey_ReturnRegistrationKey() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "registrationKey", null);

        String actual = courseStudent.getRegistrationKey();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getRegistrationKey

    public void testGetRegistrationKey_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.setRegistrationKey

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRegistrationKey(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#setRegistrationKey(String)}
     */
    @Test
    @DisplayName("setRegistrationKey: ")
    public void testSetRegistrationKey() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "registrationKey", null);

        courseStudent.setRegistrationKey(null);
    }
    ///endregion

    ///region Errors report for setRegistrationKey

    public void testSetRegistrationKey_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getCourseId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCourseId()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getCourseId()}
     * @utbot.returnsFrom {@code return courseId;}
     */
    @Test
    @DisplayName("getCourseId: -> return courseId")
    public void testGetCourseId_ReturnCourseId() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "courseId", null);

        String actual = courseStudent.getCourseId();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getCourseId

    public void testGetCourseId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.setCourseId

    ///region

    @Test
    public void testSetCourseId1() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        
        /* This test fails because method [teammates.storage.entity.CourseStudent.setCourseId] produces [java.lang.NullPointerException]
            teammates.storage.entity.CourseStudent.setCourseId(CourseStudent.java:158) */
        courseStudent.setCourseId(null);
    }

    @Test
    public void testSetCourseId2() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "courseId", null);
        String courseId = "!";

        courseStudent.setCourseId(courseId);
    }
    ///endregion

    ///region Errors report for setCourseId

    public void testSetCourseId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getTeamName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTeamName()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getTeamName()}
     * @utbot.returnsFrom {@code return teamName;}
     */
    @Test
    @DisplayName("getTeamName: -> return teamName")
    public void testGetTeamName_ReturnTeamName() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "teamName", null);

        String actual = courseStudent.getTeamName();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getTeamName

    public void testGetTeamName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.setTeamName

    ///region

    @Test
    public void testSetTeamName1() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "teamName", null);

        courseStudent.setTeamName(null);
    }

    @Test
    public void testSetTeamName2() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "teamName", null);
        String teamName = "!";

        courseStudent.setTeamName(teamName);
    }
    ///endregion

    ///region Errors report for setTeamName

    public void testSetTeamName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.getSectionName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSectionName()

    /**
     * @utbot.classUnderTest {@link CourseStudent}
     * @utbot.methodUnderTest {@link CourseStudent#getSectionName()}
     * @utbot.returnsFrom {@code return sectionName;}
     */
    @Test
    @DisplayName("getSectionName: -> return sectionName")
    public void testGetSectionName_ReturnSectionName() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "sectionName", null);

        String actual = courseStudent.getSectionName();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getSectionName

    public void testGetSectionName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.CourseStudent.setSectionName

    ///region

    @Test
    public void testSetSectionName1() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "sectionName", null);

        courseStudent.setSectionName(null);
    }

    @Test
    public void testSetSectionName2() throws Exception {
        CourseStudent courseStudent = ((CourseStudent) createInstance("teammates.storage.entity.CourseStudent"));
        setField(courseStudent, "teammates.storage.entity.CourseStudent", "sectionName", null);
        String sectionName = "!";

        courseStudent.setSectionName(sectionName);
    }
    ///endregion

    ///region Errors report for setSectionName

    public void testSetSectionName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
