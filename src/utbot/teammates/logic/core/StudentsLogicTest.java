package teammates.logic.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.storage.api.StudentsDb;
import teammates.common.datatransfer.attributes.StudentAttributes.UpdateOptions;
import teammates.common.datatransfer.attributes.StudentAttributes;
import teammates.common.datatransfer.AttributesDeletionQuery;

import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static java.util.Collections.emptyList;

public final class StudentsLogicTest {
    ///region Test suites for executable teammates.logic.core.StudentsLogic.updateStudentCascade

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateStudentCascade(teammates.common.datatransfer.attributes.StudentAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#updateStudentCascade(UpdateOptions)}
     * @utbot.invokes {@link UpdateOptions#getCourseId()}
     * @utbot.throwsException {@link NullPointerException} in: StudentAttributes originalStudent = getStudentForEmail(updateOptions.getCourseId(), updateOptions.getEmail());
     */
    @Test
    @DisplayName("updateStudentCascade: originalStudent = getStudentForEmail(updateOptions.getCourseId(), updateOptions.getEmail()) : True -> ThrowNullPointerException")
    public void testUpdateStudentCascade_StudentAttributesGetCourseId() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.updateStudentCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.updateStudentCascade(StudentsLogic.java:238) */
        studentsLogic.updateStudentCascade(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateStudentCascade(teammates.common.datatransfer.attributes.StudentAttributes.UpdateOptions)

    @Test
    public void testUpdateStudentCascade1() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        StudentsDb studentsDb = ((StudentsDb) createInstance("teammates.storage.api.StudentsDb"));
        setField(studentsLogic, "teammates.logic.core.StudentsLogic", "studentsDb", studentsDb);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.StudentAttributes$UpdateOptions"));
        setField(updateOptions, "teammates.common.datatransfer.attributes.StudentAttributes$UpdateOptions", "courseId", null);
        setField(updateOptions, "teammates.common.datatransfer.attributes.StudentAttributes$UpdateOptions", "email", null);
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.updateStudentCascade] produces [java.lang.AssertionError]
            teammates.storage.api.StudentsDb.getStudentForEmail(StudentsDb.java:139)
            teammates.logic.core.StudentsLogic.getStudentForEmail(StudentsLogic.java:76)
            teammates.logic.core.StudentsLogic.updateStudentCascade(StudentsLogic.java:238) */
        studentsLogic.updateStudentCascade(updateOptions);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.createStudent

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createStudent(teammates.common.datatransfer.attributes.StudentAttributes)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#createStudent(StudentAttributes)}
     * @utbot.invokes {@link StudentsDb#createEntity(EntityAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: return studentsDb.createEntity(studentData);
     */
    @Test
    @DisplayName("createStudent: return studentsDb.createEntity(studentData) : True -> ThrowNullPointerException")
    public void testCreateStudent_StudentsDbCreateEntity() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        setField(studentsLogic, "teammates.logic.core.StudentsLogic", "studentsDb", null);
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.createStudent] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.createStudent(StudentsLogic.java:69) */
        studentsLogic.createStudent(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createStudent(teammates.common.datatransfer.attributes.StudentAttributes)

    @Test
    public void testCreateStudent1() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        StudentsDb studentsDb = ((StudentsDb) createInstance("teammates.storage.api.StudentsDb"));
        setField(studentsLogic, "teammates.logic.core.StudentsLogic", "studentsDb", studentsDb);
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.createStudent] produces [java.lang.AssertionError]
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:62)
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:57)
            teammates.storage.api.StudentsDb.createEntity(StudentsDb.java:35)
            teammates.logic.core.StudentsLogic.createStudent(StudentsLogic.java:69) */
        studentsLogic.createStudent(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.deleteStudentCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteStudentCascade(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#deleteStudentCascade(String, String)}
     */
    @Test
    @DisplayName("deleteStudentCascade: courseId has special characters, studentEmail = blank string -> throw NullPointerException")
    public void testDeleteStudentCascadeThrowsNPEWithBlankStrings() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.deleteStudentCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentForEmail(StudentsLogic.java:76)
            teammates.logic.core.StudentsLogic.deleteStudentCascade(StudentsLogic.java:437) */
        studentsLogic.deleteStudentCascade("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.deleteStudents

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method deleteStudents(teammates.common.datatransfer.AttributesDeletionQuery)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#deleteStudents(AttributesDeletionQuery)}
     * @utbot.invokes {@link StudentsDb#deleteStudents(AttributesDeletionQuery)}
     */
    @Test
    @DisplayName("deleteStudents: -> StudentsDbDeleteStudents")
    public void testDeleteStudents_StudentsDbDeleteStudents() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        StudentsDb studentsDb = ((StudentsDb) createInstance("teammates.storage.api.StudentsDb"));
        setField(studentsLogic, "teammates.logic.core.StudentsLogic", "studentsDb", studentsDb);
        AttributesDeletionQuery query = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(query, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);

        studentsLogic.deleteStudents(query);
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteStudents(teammates.common.datatransfer.AttributesDeletionQuery)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#deleteStudents(AttributesDeletionQuery)}
     * @utbot.invokes {@link StudentsDb#deleteStudents(AttributesDeletionQuery)}
     * @utbot.throwsException {@link NullPointerException} in: studentsDb.deleteStudents(query);
     */
    @Test
    @DisplayName("deleteStudents: studentsDb.deleteStudents(query) : True -> ThrowNullPointerException")
    public void testDeleteStudents_StudentsDbDeleteStudents_1() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        setField(studentsLogic, "teammates.logic.core.StudentsLogic", "studentsDb", null);
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.deleteStudents] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.deleteStudents(StudentsLogic.java:469) */
        studentsLogic.deleteStudents(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.deleteStudentsForGoogleIdCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteStudentsForGoogleIdCascade(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#deleteStudentsForGoogleIdCascade(String)}
     */
    @Test
    @DisplayName("deleteStudentsForGoogleIdCascade: googleId = blank string -> throw NullPointerException")
    public void testDeleteStudentsForGoogleIdCascadeThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.deleteStudentsForGoogleIdCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentsForGoogleId(StudentsLogic.java:104)
            teammates.logic.core.StudentsLogic.deleteStudentsForGoogleIdCascade(StudentsLogic.java:457) */
        studentsLogic.deleteStudentsForGoogleIdCascade("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteStudentsForGoogleIdCascade(java.lang.String)

    @Test
    public void testDeleteStudentsForGoogleIdCascade1() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        StudentsDb studentsDb = ((StudentsDb) createInstance("teammates.storage.api.StudentsDb"));
        setField(studentsLogic, "teammates.logic.core.StudentsLogic", "studentsDb", studentsDb);
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.deleteStudentsForGoogleIdCascade] produces [java.lang.AssertionError]
            teammates.storage.api.StudentsDb.getStudentsForGoogleId(StudentsDb.java:183)
            teammates.logic.core.StudentsLogic.getStudentsForGoogleId(StudentsLogic.java:104)
            teammates.logic.core.StudentsLogic.deleteStudentsForGoogleIdCascade(StudentsLogic.java:457) */
        studentsLogic.deleteStudentsForGoogleIdCascade(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.deleteStudentsInCourseCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteStudentsInCourseCascade(java.lang.String, int)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#deleteStudentsInCourseCascade(String, int)}
     */
    @Test
    @DisplayName("deleteStudentsInCourseCascade: courseId has special characters, batchSize > 0 -> throw NullPointerException")
    public void testDeleteStudentsInCourseCascadeThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.deleteStudentsInCourseCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentsForCourse(StudentsLogic.java:125)
            teammates.logic.core.StudentsLogic.deleteStudentsInCourseCascade(StudentsLogic.java:424) */
        studentsLogic.deleteStudentsInCourseCascade("\n\t\r", 1);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getAllStudentsForEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getAllStudentsForEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getAllStudentsForEmail(String)}
     */
    @Test
    @DisplayName("getAllStudentsForEmail: email = blank string -> throw NullPointerException")
    public void testGetAllStudentsForEmailThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getAllStudentsForEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getAllStudentsForEmail(StudentsLogic.java:83) */
        studentsLogic.getAllStudentsForEmail("   ");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getAllStudentsForEmail(java.lang.String)

    @Test
    public void testGetAllStudentsForEmail1() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        StudentsDb studentsDb = ((StudentsDb) createInstance("teammates.storage.api.StudentsDb"));
        setField(studentsLogic, "teammates.logic.core.StudentsLogic", "studentsDb", studentsDb);
        String email = "";
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getAllStudentsForEmail] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.StudentsDb.load(StudentsDb.java:434)
            teammates.storage.api.StudentsDb.getAllCourseStudentEntitiesForEmail(StudentsDb.java:359)
            teammates.storage.api.StudentsDb.getAllStudentsForEmail(StudentsDb.java:151)
            teammates.logic.core.StudentsLogic.getAllStudentsForEmail(StudentsLogic.java:83) */
        studentsLogic.getAllStudentsForEmail(email);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getNumberOfStudentsForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getNumberOfStudentsForCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getNumberOfStudentsForCourse(String)}
     */
    @Test
    @DisplayName("getNumberOfStudentsForCourse: courseId = blank string -> throw NullPointerException")
    public void testGetNumberOfStudentsForCourseThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getNumberOfStudentsForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getNumberOfStudentsForCourse(StudentsLogic.java:111) */
        studentsLogic.getNumberOfStudentsForCourse("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getNumStudentsByTimeRange

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumStudentsByTimeRange(java.time.Instant, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getNumStudentsByTimeRange(Instant, Instant)}
     * @utbot.invokes {@link StudentsDb#getNumStudentsByTimeRange(Instant, Instant)}
     * @utbot.throwsException {@link NullPointerException} in: return studentsDb.getNumStudentsByTimeRange(startTime, endTime);
     */
    @Test
    @DisplayName("getNumStudentsByTimeRange: return studentsDb.getNumStudentsByTimeRange(startTime, endTime) : True -> ThrowNullPointerException")
    public void testGetNumStudentsByTimeRange_StudentsDbGetNumStudentsByTimeRange() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        setField(studentsLogic, "teammates.logic.core.StudentsLogic", "studentsDb", null);
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getNumStudentsByTimeRange] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getNumStudentsByTimeRange(StudentsLogic.java:505) */
        studentsLogic.getNumStudentsByTimeRange(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getSectionForTeam

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getSectionForTeam(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getSectionForTeam(String, String)}
     */
    @Test
    @DisplayName("getSectionForTeam: courseId has special characters, teamName = blank string -> throw NullPointerException")
    public void testGetSectionForTeamThrowsNPEWithBlankStrings() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getSectionForTeam] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentsForTeam(StudentsLogic.java:139)
            teammates.logic.core.StudentsLogic.getSectionForTeam(StudentsLogic.java:345) */
        studentsLogic.getSectionForTeam("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getStudentForCourseIdAndGoogleId

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getStudentForCourseIdAndGoogleId(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getStudentForCourseIdAndGoogleId(String, String)}
     */
    @Test
    @DisplayName("getStudentForCourseIdAndGoogleId: courseId has special characters, googleId = blank string -> throw NullPointerException")
    public void testGetStudentForCourseIdAndGoogleIdThrowsNPEWithBlankStrings() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getStudentForCourseIdAndGoogleId] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentForCourseIdAndGoogleId(StudentsLogic.java:90) */
        studentsLogic.getStudentForCourseIdAndGoogleId("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getStudentForEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getStudentForEmail(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getStudentForEmail(String, String)}
     */
    @Test
    @DisplayName("getStudentForEmail: courseId has special characters, email = blank string -> throw NullPointerException")
    public void testGetStudentForEmailThrowsNPEWithBlankStrings() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getStudentForEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentForEmail(StudentsLogic.java:76) */
        studentsLogic.getStudentForEmail("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getStudentForRegistrationKey

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getStudentForRegistrationKey(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getStudentForRegistrationKey(String)}
     */
    @Test
    @DisplayName("getStudentForRegistrationKey: registrationKey = blank string -> throw NullPointerException")
    public void testGetStudentForRegistrationKeyThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getStudentForRegistrationKey] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentForRegistrationKey(StudentsLogic.java:97) */
        studentsLogic.getStudentForRegistrationKey("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getStudentsForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getStudentsForCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getStudentsForCourse(String)}
     */
    @Test
    @DisplayName("getStudentsForCourse: courseId = blank string -> throw NullPointerException")
    public void testGetStudentsForCourseThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getStudentsForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentsForCourse(StudentsLogic.java:118) */
        studentsLogic.getStudentsForCourse("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getStudentsForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getStudentsForCourse(java.lang.String, int)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getStudentsForCourse(String, int)}
     */
    @Test
    @DisplayName("getStudentsForCourse: courseId has special characters, batchSize > 0 -> throw NullPointerException")
    public void testGetStudentsForCourseThrowsNPEWithBlankString1() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getStudentsForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentsForCourse(StudentsLogic.java:125) */
        studentsLogic.getStudentsForCourse("\n\t\r", 1);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getStudentsForGoogleId

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getStudentsForGoogleId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getStudentsForGoogleId(String)}
     */
    @Test
    @DisplayName("getStudentsForGoogleId: googleId = blank string -> throw NullPointerException")
    public void testGetStudentsForGoogleIdThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getStudentsForGoogleId] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentsForGoogleId(StudentsLogic.java:104) */
        studentsLogic.getStudentsForGoogleId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getStudentsForSection

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getStudentsForSection(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getStudentsForSection(String, String)}
     */
    @Test
    @DisplayName("getStudentsForSection: sectionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testGetStudentsForSectionThrowsNPEWithBlankStrings() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getStudentsForSection] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentsForSection(StudentsLogic.java:132) */
        studentsLogic.getStudentsForSection("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getStudentsForTeam

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getStudentsForTeam(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getStudentsForTeam(String, String)}
     */
    @Test
    @DisplayName("getStudentsForTeam: teamName has special characters, courseId = blank string -> throw NullPointerException")
    public void testGetStudentsForTeamThrowsNPEWithBlankStrings() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getStudentsForTeam] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentsForTeam(StudentsLogic.java:139) */
        studentsLogic.getStudentsForTeam("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.getUnregisteredStudentsForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getUnregisteredStudentsForCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#getUnregisteredStudentsForCourse(String)}
     */
    @Test
    @DisplayName("getUnregisteredStudentsForCourse: courseId = blank string -> throw NullPointerException")
    public void testGetUnregisteredStudentsForCourseThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.getUnregisteredStudentsForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getUnregisteredStudentsForCourse(StudentsLogic.java:146) */
        studentsLogic.getUnregisteredStudentsForCourse("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.isStudentInAnyCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method isStudentInAnyCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#isStudentInAnyCourse(String)}
     */
    @Test
    @DisplayName("isStudentInAnyCourse: googleId = blank string -> throw NullPointerException")
    public void testIsStudentInAnyCourseThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.isStudentInAnyCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.isStudentInAnyCourse(StudentsLogic.java:187) */
        studentsLogic.isStudentInAnyCourse("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.isStudentInTeam

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method isStudentInTeam(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#isStudentInTeam(String, String, String)}
     */
    @Test
    @DisplayName("isStudentInTeam: courseId has special characters, teamName = blank string, studentEmail != empty string -> throw NullPointerException")
    public void testIsStudentInTeamThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.isStudentInTeam] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentForEmail(StudentsLogic.java:76)
            teammates.logic.core.StudentsLogic.isStudentInTeam(StudentsLogic.java:195) */
        studentsLogic.isStudentInTeam("\n\t\r", "   ", "string");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.isStudentsInSameTeam

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method isStudentsInSameTeam(java.lang.String, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#isStudentsInSameTeam(String, String, String)}
     */
    @Test
    @DisplayName("isStudentsInSameTeam: courseId has special characters, student1Email = blank string, student2Email != empty string -> throw NullPointerException")
    public void testIsStudentsInSameTeamThrowsNPEWithBlankStringsAndNonEmptyString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.isStudentsInSameTeam] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentForEmail(StudentsLogic.java:76)
            teammates.logic.core.StudentsLogic.isStudentsInSameTeam(StudentsLogic.java:213) */
        studentsLogic.isStudentsInSameTeam("\n\t\r", "   ", "string");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.putDocument

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putDocument(teammates.common.datatransfer.attributes.StudentAttributes)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#putDocument(StudentAttributes)}
     * @utbot.invokes {@link StudentsDb#putDocument(StudentAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: studentsDb.putDocument(student);
     */
    @Test
    @DisplayName("putDocument: studentsDb.putDocument(student) : True -> ThrowNullPointerException")
    public void testPutDocument_StudentsDbPutDocument() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        setField(studentsLogic, "teammates.logic.core.StudentsLogic", "studentsDb", null);
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.putDocument] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.putDocument(StudentsLogic.java:478) */
        studentsLogic.putDocument(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.regenerateStudentRegistrationKey

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method regenerateStudentRegistrationKey(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#regenerateStudentRegistrationKey(String, String)}
     */
    @Test
    @DisplayName("regenerateStudentRegistrationKey: courseId = blank string, email = empty string -> throw NullPointerException")
    public void testRegenerateStudentRegistrationKeyThrowsNPEWithBlankStringAndEmptyString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.regenerateStudentRegistrationKey] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.regenerateStudentRegistrationKey(StudentsLogic.java:294) */
        studentsLogic.regenerateStudentRegistrationKey("   ", "");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.resetStudentGoogleId

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method resetStudentGoogleId(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#resetStudentGoogleId(String, String)}
     */
    @Test
    @DisplayName("resetStudentGoogleId: originalEmail has special characters, courseId = blank string -> throw NullPointerException")
    public void testResetStudentGoogleIdThrowsNPEWithBlankStrings() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.resetStudentGoogleId] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentForEmail(StudentsLogic.java:76)
            teammates.logic.core.StudentsLogic.updateStudentCascade(StudentsLogic.java:238)
            teammates.logic.core.StudentsLogic.resetStudentGoogleId(StudentsLogic.java:274) */
        studentsLogic.resetStudentGoogleId("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.searchStudents

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method searchStudents(java.lang.String, java.util.List)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#searchStudents(String, List)}
     */
    @Test
    @DisplayName("searchStudents: queryString = blank string, instructors = empty collection -> throw NullPointerException")
    public void testSearchStudentsThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        List instructors = emptyList();
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.searchStudents] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.searchStudents(StudentsLogic.java:156) */
        studentsLogic.searchStudents("   ", instructors);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.searchStudentsInWholeSystem

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method searchStudentsInWholeSystem(java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#searchStudentsInWholeSystem(String)}
     */
    @Test
    @DisplayName("searchStudentsInWholeSystem: queryString = blank string -> throw NullPointerException")
    public void testSearchStudentsInWholeSystemThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.searchStudentsInWholeSystem] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.searchStudentsInWholeSystem(StudentsLogic.java:167) */
        studentsLogic.searchStudentsInWholeSystem("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.validateSectionsAndTeams

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method validateSectionsAndTeams(java.util.List, java.lang.String)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#validateSectionsAndTeams(List, String)}
     */
    @Test
    @DisplayName("validateSectionsAndTeams: studentList = empty collection, courseId != empty string -> throw NullPointerException")
    public void testValidateSectionsAndTeamsThrowsNPEWithNonEmptyString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        List studentList = emptyList();
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.validateSectionsAndTeams] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.getStudentsForCourse(StudentsLogic.java:118)
            teammates.logic.core.StudentsLogic.getMergedList(StudentsLogic.java:326)
            teammates.logic.core.StudentsLogic.validateSectionsAndTeams(StudentsLogic.java:309) */
        studentsLogic.validateSectionsAndTeams(studentList, "string");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.StudentsLogic.verifyAllStudentsExistInCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method verifyAllStudentsExistInCourse(java.lang.String, java.util.Collection)

    /**
     * @utbot.classUnderTest {@link StudentsLogic}
     * @utbot.methodUnderTest {@link StudentsLogic#verifyAllStudentsExistInCourse(String, Collection)}
     */
    @Test
    @DisplayName("verifyAllStudentsExistInCourse: courseId has special characters, studentEmailAddresses = test collection -> throw NullPointerException")
    public void testVerifyAllStudentsExistInCourseThrowsNPEWithBlankString() throws Exception {
        StudentsLogic studentsLogic = ((StudentsLogic) createInstance("teammates.logic.core.StudentsLogic"));
        ArrayList studentEmailAddresses = new ArrayList();
        studentEmailAddresses.add("tyvjm");
        studentEmailAddresses.add("jkmqh");
        studentEmailAddresses.add("qylov");
        
        /* This test fails because method [teammates.logic.core.StudentsLogic.verifyAllStudentsExistInCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.StudentsLogic.verifyAllStudentsExistInCourse(StudentsLogic.java:177) */
        studentsLogic.verifyAllStudentsExistInCourse("\n\t\r", studentEmailAddresses);
    }
    ///endregion

    ///endregion
}
