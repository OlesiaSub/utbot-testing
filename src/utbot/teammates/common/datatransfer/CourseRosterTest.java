package teammates.common.datatransfer;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import teammates.common.datatransfer.CourseRoster.ParticipantInfo;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;

import java.util.HashMap;

import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertNull;
import static java.util.Collections.emptyList;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class CourseRosterTest {
    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.getStudents

    ///region

    @Test
    public void testGetStudents1() {
        List list = emptyList();
        CourseRoster courseRoster = new CourseRoster(list, list);

        ArrayList actual = ((ArrayList) courseRoster.getStudents());

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }

    @Test
    public void testGetStudents2() throws Exception {
        CourseRoster courseRoster = ((CourseRoster) createInstance("teammates.common.datatransfer.CourseRoster"));
        setField(courseRoster, "teammates.common.datatransfer.CourseRoster", "studentListByEmail", null);
        
        /* This test fails because method [teammates.common.datatransfer.CourseRoster.getStudents] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.CourseRoster.getStudents(CourseRoster.java:30) */
        courseRoster.getStudents();
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.getInstructors

    ///region

    @Test
    public void testGetInstructors1() {
        List list = emptyList();
        CourseRoster courseRoster = new CourseRoster(list, list);

        ArrayList actual = ((ArrayList) courseRoster.getInstructors());

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }

    @Test
    public void testGetInstructors2() throws Exception {
        CourseRoster courseRoster = ((CourseRoster) createInstance("teammates.common.datatransfer.CourseRoster"));
        setField(courseRoster, "teammates.common.datatransfer.CourseRoster", "instructorListByEmail", null);
        
        /* This test fails because method [teammates.common.datatransfer.CourseRoster.getInstructors] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.CourseRoster.getInstructors(CourseRoster.java:34) */
        courseRoster.getInstructors();
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.getTeamToMembersTable

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getTeamToMembersTable()

    /**
     * @utbot.classUnderTest {@link CourseRoster}
     * @utbot.methodUnderTest {@link CourseRoster#getTeamToMembersTable()}
     */
    @Test
    @DisplayName("getTeamToMembersTable: arg_0 = CourseRoster(List, List)")
    public void testGetTeamToMembersTable() {
        List list = emptyList();
        CourseRoster courseRoster = new CourseRoster(list, list);

        HashMap actual = ((HashMap) courseRoster.getTeamToMembersTable());

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.isStudentInCourse

    ///region

    @Test
    public void testIsStudentInCourse1() {
        List list = emptyList();
        CourseRoster courseRoster = new CourseRoster(list, list);

        boolean actual = courseRoster.isStudentInCourse("   ");

        assertFalse(actual);
    }

    @Test
    public void testIsStudentInCourse2() throws Exception {
        CourseRoster courseRoster = ((CourseRoster) createInstance("teammates.common.datatransfer.CourseRoster"));
        setField(courseRoster, "teammates.common.datatransfer.CourseRoster", "studentListByEmail", null);
        
        /* This test fails because method [teammates.common.datatransfer.CourseRoster.isStudentInCourse] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.CourseRoster.isStudentInCourse(CourseRoster.java:45) */
        courseRoster.isStudentInCourse(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.isTeamInCourse

    ///region

    @Test
    public void testIsTeamInCourse1() {
        List list = emptyList();
        CourseRoster courseRoster = new CourseRoster(list, list);

        boolean actual = courseRoster.isTeamInCourse("   ");

        assertFalse(actual);
    }

    @Test
    public void testIsTeamInCourse2() throws Exception {
        CourseRoster courseRoster = ((CourseRoster) createInstance("teammates.common.datatransfer.CourseRoster"));
        setField(courseRoster, "teammates.common.datatransfer.CourseRoster", "teamToMembersTable", null);
        
        /* This test fails because method [teammates.common.datatransfer.CourseRoster.isTeamInCourse] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.CourseRoster.isTeamInCourse(CourseRoster.java:52) */
        courseRoster.isTeamInCourse(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.isStudentInTeam

    ///region

    @Test
    public void testIsStudentInTeam1() {
        List list = emptyList();
        CourseRoster courseRoster = new CourseRoster(list, list);

        boolean actual = courseRoster.isStudentInTeam("\n\t\r", "   ");

        assertFalse(actual);
    }

    @Test
    public void testIsStudentInTeam2() throws Exception {
        CourseRoster courseRoster = ((CourseRoster) createInstance("teammates.common.datatransfer.CourseRoster"));
        setField(courseRoster, "teammates.common.datatransfer.CourseRoster", "studentListByEmail", null);
        
        /* This test fails because method [teammates.common.datatransfer.CourseRoster.isStudentInTeam] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.CourseRoster.isStudentInTeam(CourseRoster.java:59) */
        courseRoster.isStudentInTeam(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.isStudentsInSameTeam

    ///region

    @Test
    public void testIsStudentsInSameTeam1() {
        List list = emptyList();
        CourseRoster courseRoster = new CourseRoster(list, list);

        boolean actual = courseRoster.isStudentsInSameTeam("\n\t\r", "   ");

        assertFalse(actual);
    }

    @Test
    public void testIsStudentsInSameTeam2() throws Exception {
        CourseRoster courseRoster = ((CourseRoster) createInstance("teammates.common.datatransfer.CourseRoster"));
        setField(courseRoster, "teammates.common.datatransfer.CourseRoster", "studentListByEmail", null);
        
        /* This test fails because method [teammates.common.datatransfer.CourseRoster.isStudentsInSameTeam] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.CourseRoster.isStudentsInSameTeam(CourseRoster.java:67) */
        courseRoster.isStudentsInSameTeam(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.getStudentForEmail

    ///region

    @Test
    public void testGetStudentForEmail1() {
        List list = emptyList();
        CourseRoster courseRoster = new CourseRoster(list, list);

        StudentAttributes actual = courseRoster.getStudentForEmail("   ");

        assertNull(actual);
    }

    @Test
    public void testGetStudentForEmail2() throws Exception {
        CourseRoster courseRoster = ((CourseRoster) createInstance("teammates.common.datatransfer.CourseRoster"));
        setField(courseRoster, "teammates.common.datatransfer.CourseRoster", "studentListByEmail", null);
        
        /* This test fails because method [teammates.common.datatransfer.CourseRoster.getStudentForEmail] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.CourseRoster.getStudentForEmail(CourseRoster.java:77) */
        courseRoster.getStudentForEmail(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.getInstructorForEmail

    ///region

    @Test
    public void testGetInstructorForEmail1() {
        List list = emptyList();
        CourseRoster courseRoster = new CourseRoster(list, list);

        InstructorAttributes actual = courseRoster.getInstructorForEmail("   ");

        assertNull(actual);
    }

    @Test
    public void testGetInstructorForEmail2() throws Exception {
        CourseRoster courseRoster = ((CourseRoster) createInstance("teammates.common.datatransfer.CourseRoster"));
        setField(courseRoster, "teammates.common.datatransfer.CourseRoster", "instructorListByEmail", null);
        
        /* This test fails because method [teammates.common.datatransfer.CourseRoster.getInstructorForEmail] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.CourseRoster.getInstructorForEmail(CourseRoster.java:84) */
        courseRoster.getInstructorForEmail(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.buildTeamToMembersTable

    ///region

    @Test
    public void testBuildTeamToMembersTable1() {
        List students = emptyList();

        HashMap actual = ((HashMap) CourseRoster.buildTeamToMembersTable(students));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));
    }

    @Test
    public void testBuildTeamToMembersTable2() {
        /* This test fails because method [teammates.common.datatransfer.CourseRoster.buildTeamToMembersTable] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.CourseRoster.buildTeamToMembersTable(CourseRoster.java:115) */
        CourseRoster.buildTeamToMembersTable(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.CourseRoster.getInfoForIdentifier

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInfoForIdentifier(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CourseRoster}
     * @utbot.methodUnderTest {@link CourseRoster#getInfoForIdentifier(String)}
     */
    @Test
    @DisplayName("getInfoForIdentifier: identifier = string")
    public void testGetInfoForIdentifierWithNonEmptyString() throws Exception {
        List list = emptyList();
        CourseRoster courseRoster = new CourseRoster(list, list);

        ParticipantInfo actual = courseRoster.getInfoForIdentifier("-");

        ParticipantInfo expected = ((ParticipantInfo) createInstance("teammates.common.datatransfer.CourseRoster$ParticipantInfo"));
        String string = "-";
        setField(expected, "teammates.common.datatransfer.CourseRoster$ParticipantInfo", "name", string);
        setField(expected, "teammates.common.datatransfer.CourseRoster$ParticipantInfo", "teamName", string);
        String string1 = "None";
        setField(expected, "teammates.common.datatransfer.CourseRoster$ParticipantInfo", "sectionName", string1);
        String expectedName = ((String) getFieldValue(expected, "teammates.common.datatransfer.CourseRoster$ParticipantInfo", "name"));
        String actualName = ((String) getFieldValue(actual, "teammates.common.datatransfer.CourseRoster$ParticipantInfo", "name"));
        assertEquals(expectedName, actualName);

        assertTrue(deepEquals(expected, actual));
        String expectedSectionName = ((String) getFieldValue(expected, "teammates.common.datatransfer.CourseRoster$ParticipantInfo", "sectionName"));
        String actualSectionName = ((String) getFieldValue(actual, "teammates.common.datatransfer.CourseRoster$ParticipantInfo", "sectionName"));
        assertEquals(expectedSectionName, actualSectionName);

    }
    ///endregion

    ///endregion

    ///region Tests for ParticipantInfo

    @Nested
    public final class ParticipantInfoTest {
        ///region Test suites for executable teammates.common.datatransfer.CourseRoster$ParticipantInfo.getName

        ///region

        @Test
        public void testGetName1() throws Exception {
            ParticipantInfo participantInfo = ((ParticipantInfo) createInstance("teammates.common.datatransfer.CourseRoster$ParticipantInfo"));
            setField(participantInfo, "teammates.common.datatransfer.CourseRoster$ParticipantInfo", "name", null);

            String actual = participantInfo.getName();

            assertNull(actual);
        }
        ///endregion

        ///endregion

        ///region Test suites for executable teammates.common.datatransfer.CourseRoster$ParticipantInfo.getTeamName

        ///region

        @Test
        public void testGetTeamName1() throws Exception {
            ParticipantInfo participantInfo = ((ParticipantInfo) createInstance("teammates.common.datatransfer.CourseRoster$ParticipantInfo"));
            setField(participantInfo, "teammates.common.datatransfer.CourseRoster$ParticipantInfo", "teamName", null);

            String actual = participantInfo.getTeamName();

            assertNull(actual);
        }
        ///endregion

        ///endregion

        ///region Test suites for executable teammates.common.datatransfer.CourseRoster$ParticipantInfo.getSectionName

        ///region

        @Test
        public void testGetSectionName1() throws Exception {
            ParticipantInfo participantInfo = ((ParticipantInfo) createInstance("teammates.common.datatransfer.CourseRoster$ParticipantInfo"));
            setField(participantInfo, "teammates.common.datatransfer.CourseRoster$ParticipantInfo", "sectionName", null);

            String actual = participantInfo.getSectionName();

            assertNull(actual);
        }
        ///endregion

        ///endregion
    }
    ///endregion
}
