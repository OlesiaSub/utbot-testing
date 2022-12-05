package teammates.logic.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.attributes.CourseAttributes.UpdateOptions;
import teammates.common.datatransfer.attributes.CourseAttributes;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.storage.api.CoursesDb;

import java.time.Instant;
import java.util.List;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static java.util.Collections.emptyList;

public final class CoursesLogicTest {
    ///region Test suites for executable teammates.logic.core.CoursesLogic.updateCourseCascade

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateCourseCascade(teammates.common.datatransfer.attributes.CourseAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#updateCourseCascade(UpdateOptions)}
     * @utbot.invokes {@link UpdateOptions#getCourseId()}
     * @utbot.throwsException {@link NullPointerException} in: CourseAttributes oldCourse = coursesDb.getCourse(updateOptions.getCourseId());
     */
    @Test
    @DisplayName("updateCourseCascade: oldCourse = coursesDb.getCourse(updateOptions.getCourseId()) : True -> ThrowNullPointerException")
    public void testUpdateCourseCascade_CourseAttributesGetCourseId() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        setField(coursesLogic, "teammates.logic.core.CoursesLogic", "coursesDb", null);
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.updateCourseCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.updateCourseCascade(CoursesLogic.java:293) */
        coursesLogic.updateCourseCascade(null);
    }

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#updateCourseCascade(UpdateOptions)}
     * @utbot.invokes {@link UpdateOptions#getCourseId()}
     * @utbot.throwsException {@link NullPointerException} in: CourseAttributes oldCourse = coursesDb.getCourse(updateOptions.getCourseId());
     */
    @Test
    @DisplayName("updateCourseCascade: oldCourse = coursesDb.getCourse(updateOptions.getCourseId()) : True -> ThrowNullPointerException")
    public void testUpdateCourseCascade_CourseAttributesGetCourseId_1() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        setField(coursesLogic, "teammates.logic.core.CoursesLogic", "coursesDb", null);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.CourseAttributes$UpdateOptions"));
        setField(updateOptions, "teammates.common.datatransfer.attributes.CourseAttributes$UpdateOptions", "courseId", null);
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.updateCourseCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.updateCourseCascade(CoursesLogic.java:293) */
        coursesLogic.updateCourseCascade(updateOptions);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.getCourseInstitute

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getCourseInstitute(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#getCourseInstitute(String)}
     */
    @Test
    @DisplayName("getCourseInstitute: courseId = blank string -> throw NullPointerException")
    public void testGetCourseInstituteThrowsNPEWithBlankString() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.getCourseInstitute] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.getCourse(CoursesLogic.java:133)
            teammates.logic.core.CoursesLogic.getCourseInstitute(CoursesLogic.java:77) */
        coursesLogic.getCourseInstitute("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.createCourse

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createCourse(teammates.common.datatransfer.attributes.CourseAttributes)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#createCourse(CourseAttributes)}
     * @utbot.invokes {@link CoursesDb#createEntity(EntityAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: return coursesDb.createEntity(courseToCreate);
     */
    @Test
    @DisplayName("createCourse: return coursesDb.createEntity(courseToCreate) : True -> ThrowNullPointerException")
    public void testCreateCourse_CoursesDbCreateEntity() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        setField(coursesLogic, "teammates.logic.core.CoursesLogic", "coursesDb", null);
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.createCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.createCourse(CoursesLogic.java:91) */
        coursesLogic.createCourse(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.createCourseAndInstructor

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createCourseAndInstructor(java.lang.String, teammates.common.datatransfer.attributes.CourseAttributes)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#createCourseAndInstructor(String, CourseAttributes)}
     * @utbot.invokes {@link AccountsLogic#getAccount(String)}
     * @utbot.throwsException {@link NullPointerException} in: AccountAttributes courseCreator = accountsLogic.getAccount(instructorGoogleId);
     */
    @Test
    @DisplayName("createCourseAndInstructor: courseCreator = accountsLogic.getAccount(instructorGoogleId) : True -> ThrowNullPointerException")
    public void testCreateCourseAndInstructor_AccountsLogicGetAccount() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        setField(coursesLogic, "teammates.logic.core.CoursesLogic", "accountsLogic", null);
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.createCourseAndInstructor] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.createCourseAndInstructor(CoursesLogic.java:103) */
        coursesLogic.createCourseAndInstructor(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.getCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#getCourse(String)}
     */
    @Test
    @DisplayName("getCourse: courseId = blank string -> throw NullPointerException")
    public void testGetCourseThrowsNPEWithBlankString() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.getCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.getCourse(CoursesLogic.java:133) */
        coursesLogic.getCourse("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.isCoursePresent

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method isCoursePresent(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#isCoursePresent(String)}
     */
    @Test
    @DisplayName("isCoursePresent: courseId = blank string -> throw NullPointerException")
    public void testIsCoursePresentThrowsNPEWithBlankString() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.isCoursePresent] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.isCoursePresent(CoursesLogic.java:140) */
        coursesLogic.isCoursePresent("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.verifyCourseIsPresent

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method verifyCourseIsPresent(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#verifyCourseIsPresent(String)}
     */
    @Test
    @DisplayName("verifyCourseIsPresent: courseId = blank string -> throw NullPointerException")
    public void testVerifyCourseIsPresentThrowsNPEWithBlankString() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.verifyCourseIsPresent] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.isCoursePresent(CoursesLogic.java:140)
            teammates.logic.core.CoursesLogic.verifyCourseIsPresent(CoursesLogic.java:147) */
        coursesLogic.verifyCourseIsPresent("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.getSectionsNameForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getSectionsNameForCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#getSectionsNameForCourse(String)}
     */
    @Test
    @DisplayName("getSectionsNameForCourse: courseId = empty string -> throw NullPointerException")
    public void testGetSectionsNameForCourseThrowsNPEWithEmptyString() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.getSectionsNameForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.isCoursePresent(CoursesLogic.java:140)
            teammates.logic.core.CoursesLogic.verifyCourseIsPresent(CoursesLogic.java:147)
            teammates.logic.core.CoursesLogic.getSectionsNameForCourse(CoursesLogic.java:158) */
        coursesLogic.getSectionsNameForCourse("");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.getTeamsForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getTeamsForCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#getTeamsForCourse(String)}
     */
    @Test
    @DisplayName("getTeamsForCourse: courseId = blank string -> throw NullPointerException")
    public void testGetTeamsForCourseThrowsNPEWithBlankString() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.getTeamsForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.getCourse(CoursesLogic.java:133)
            teammates.logic.core.CoursesLogic.getTeamsForCourse(CoursesLogic.java:183) */
        coursesLogic.getTeamsForCourse("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.getTeamsForSection

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getTeamsForSection(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#getTeamsForSection(String, String)}
     */
    @Test
    @DisplayName("getTeamsForSection: sectionName has special characters, courseId = blank string -> throw NullPointerException")
    public void testGetTeamsForSectionThrowsNPEWithBlankStrings() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.getTeamsForSection] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.getCourse(CoursesLogic.java:133)
            teammates.logic.core.CoursesLogic.getTeamsForSection(CoursesLogic.java:203) */
        coursesLogic.getTeamsForSection("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.getCoursesForStudentAccount

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getCoursesForStudentAccount(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#getCoursesForStudentAccount(String)}
     */
    @Test
    @DisplayName("getCoursesForStudentAccount: googleId = blank string -> throw NullPointerException")
    public void testGetCoursesForStudentAccountThrowsNPEWithBlankString() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.getCoursesForStudentAccount] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.getCoursesForStudentAccount(CoursesLogic.java:222) */
        coursesLogic.getCoursesForStudentAccount("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.getCoursesForInstructor

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getCoursesForInstructor(java.util.List)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#getCoursesForInstructor(List)}
     */
    @Test
    @DisplayName("getCoursesForInstructor: instructorList = empty collection -> throw NullPointerException")
    public void testGetCoursesForInstructorThrowsNPE() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        List instructorList = emptyList();
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.getCoursesForInstructor] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.getCoursesForInstructor(CoursesLogic.java:244) */
        coursesLogic.getCoursesForInstructor(instructorList);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.getSoftDeletedCoursesForInstructors

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getSoftDeletedCoursesForInstructors(java.util.List)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#getSoftDeletedCoursesForInstructors(List)}
     */
    @Test
    @DisplayName("getSoftDeletedCoursesForInstructors: instructorList = empty collection -> throw NullPointerException")
    public void testGetSoftDeletedCoursesForInstructorsThrowsNPE() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        List instructorList = emptyList();
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.getSoftDeletedCoursesForInstructors] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.getSoftDeletedCoursesForInstructors(CoursesLogic.java:269) */
        coursesLogic.getSoftDeletedCoursesForInstructors(instructorList);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.deleteCourseCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteCourseCascade(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#deleteCourseCascade(String)}
     */
    @Test
    @DisplayName("deleteCourseCascade: courseId = blank string -> throw NullPointerException")
    public void testDeleteCourseCascadeThrowsNPEWithBlankString() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.deleteCourseCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.getCourse(CoursesLogic.java:133)
            teammates.logic.core.CoursesLogic.deleteCourseCascade(CoursesLogic.java:310) */
        coursesLogic.deleteCourseCascade("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.moveCourseToRecycleBin

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method moveCourseToRecycleBin(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#moveCourseToRecycleBin(String)}
     */
    @Test
    @DisplayName("moveCourseToRecycleBin: courseId = blank string -> throw NullPointerException")
    public void testMoveCourseToRecycleBinThrowsNPEWithBlankString() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.moveCourseToRecycleBin] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.moveCourseToRecycleBin(CoursesLogic.java:334) */
        coursesLogic.moveCourseToRecycleBin("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.restoreCourseFromRecycleBin

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method restoreCourseFromRecycleBin(java.lang.String)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#restoreCourseFromRecycleBin(String)}
     */
    @Test
    @DisplayName("restoreCourseFromRecycleBin: courseId = blank string -> throw NullPointerException")
    public void testRestoreCourseFromRecycleBinThrowsNPEWithBlankString() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.restoreCourseFromRecycleBin] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.restoreCourseFromRecycleBin(CoursesLogic.java:341) */
        coursesLogic.restoreCourseFromRecycleBin("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.CoursesLogic.getNumCoursesByTimeRange

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumCoursesByTimeRange(java.time.Instant, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link CoursesLogic}
     * @utbot.methodUnderTest {@link CoursesLogic#getNumCoursesByTimeRange(Instant, Instant)}
     * @utbot.invokes {@link CoursesDb#getNumCoursesByTimeRange(Instant, Instant)}
     * @utbot.throwsException {@link NullPointerException} in: return coursesDb.getNumCoursesByTimeRange(startTime, endTime);
     */
    @Test
    @DisplayName("getNumCoursesByTimeRange: return coursesDb.getNumCoursesByTimeRange(startTime, endTime) : True -> ThrowNullPointerException")
    public void testGetNumCoursesByTimeRange_CoursesDbGetNumCoursesByTimeRange() throws Exception {
        CoursesLogic coursesLogic = ((CoursesLogic) createInstance("teammates.logic.core.CoursesLogic"));
        setField(coursesLogic, "teammates.logic.core.CoursesLogic", "coursesDb", null);
        
        /* This test fails because method [teammates.logic.core.CoursesLogic.getNumCoursesByTimeRange] produces [java.lang.NullPointerException]
            teammates.logic.core.CoursesLogic.getNumCoursesByTimeRange(CoursesLogic.java:348) */
        coursesLogic.getNumCoursesByTimeRange(null, null);
    }
    ///endregion

    ///endregion
}
