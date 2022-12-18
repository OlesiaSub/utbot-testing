package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Instant;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;

public final class CourseTest {
    ///region Test suites for executable teammates.storage.entity.Course.getUniqueId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUniqueId()

    /**
     * @utbot.classUnderTest {@link Course}
     * @utbot.methodUnderTest {@link Course#getUniqueId()}
     * @utbot.returnsFrom {@code return id;}
     */
    @Test
    @DisplayName("getUniqueId: -> return id")
    public void testGetUniqueId_ReturnId() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));
        String string = "";
        setField(course, "teammates.storage.entity.Course", "id", string);

        String actual = course.getUniqueId();

        assertEquals(string, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.setUniqueId

    ///region

    @Test
    public void testSetUniqueId1() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));

        course.setUniqueId("   ");
    }

    @Test
    public void testSetUniqueId2() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));
        
        /* This test fails because method [teammates.storage.entity.Course.setUniqueId] produces [java.lang.NullPointerException]
            teammates.storage.entity.Course.setUniqueId(Course.java:62) */
        course.setUniqueId(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.getName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()

    /**
     * @utbot.classUnderTest {@link Course}
     * @utbot.methodUnderTest {@link Course#getName()}
     * @utbot.returnsFrom {@code return name;}
     */
    @Test
    @DisplayName("getName: -> return name")
    public void testGetName_ReturnName() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));
        setField(course, "teammates.storage.entity.Course", "name", null);

        String actual = course.getName();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.setName

    ///region

    @Test
    public void testSetName1() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));

        course.setName("   ");
    }

    @Test
    public void testSetName2() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));
        
        /* This test fails because method [teammates.storage.entity.Course.setName] produces [java.lang.NullPointerException]
            teammates.storage.entity.Course.setName(Course.java:70) */
        course.setName(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.getCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatedAt()

    /**
     * @utbot.classUnderTest {@link Course}
     * @utbot.methodUnderTest {@link Course#getCreatedAt()}
     * @utbot.returnsFrom {@code return createdAt;}
     */
    @Test
    @DisplayName("getCreatedAt: -> return createdAt")
    public void testGetCreatedAt_ReturnCreatedAt() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));
        Instant instantMock = mock(Instant.class);
        setField(course, "teammates.storage.entity.Course", "createdAt", instantMock);

        Instant actual = course.getCreatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.setCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link Course}
     * @utbot.methodUnderTest {@link Course#setCreatedAt(Instant)}
     */
    @Test
    @DisplayName("setCreatedAt: ")
    public void testSetCreatedAt() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));
        Instant instantMock = mock(Instant.class);
        setField(course, "teammates.storage.entity.Course", "createdAt", instantMock);

        course.setCreatedAt(null);

        Instant finalCourseCreatedAt = ((Instant) getFieldValue(course, "teammates.storage.entity.Course", "createdAt"));

        assertNull(finalCourseCreatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.getDeletedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeletedAt()

    /**
     * @utbot.classUnderTest {@link Course}
     * @utbot.methodUnderTest {@link Course#getDeletedAt()}
     * @utbot.returnsFrom {@code return deletedAt;}
     */
    @Test
    @DisplayName("getDeletedAt: -> return deletedAt")
    public void testGetDeletedAt_ReturnDeletedAt() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));
        Instant instantMock = mock(Instant.class);
        setField(course, "teammates.storage.entity.Course", "deletedAt", instantMock);

        Instant actual = course.getDeletedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.setDeletedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDeletedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link Course}
     * @utbot.methodUnderTest {@link Course#setDeletedAt(Instant)}
     */
    @Test
    @DisplayName("setDeletedAt: ")
    public void testSetDeletedAt() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));
        Instant instantMock = mock(Instant.class);
        setField(course, "teammates.storage.entity.Course", "deletedAt", instantMock);

        course.setDeletedAt(null);

        Instant finalCourseDeletedAt = ((Instant) getFieldValue(course, "teammates.storage.entity.Course", "deletedAt"));

        assertNull(finalCourseDeletedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.getTimeZone

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimeZone()

    /**
     * @utbot.classUnderTest {@link Course}
     * @utbot.methodUnderTest {@link Course#getTimeZone()}
     * @utbot.returnsFrom {@code return timeZone;}
     */
    @Test
    @DisplayName("getTimeZone: -> return timeZone")
    public void testGetTimeZone_ReturnTimeZone() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));
        setField(course, "teammates.storage.entity.Course", "timeZone", null);

        String actual = course.getTimeZone();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.setTimeZone

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setTimeZone(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Course}
     * @utbot.methodUnderTest {@link Course#setTimeZone(String)}
     */
    @Test
    @DisplayName("setTimeZone: timeZone = blank string")
    public void testSetTimeZoneWithBlankString() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));

        course.setTimeZone("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.getInstitute

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstitute()

    /**
     * @utbot.classUnderTest {@link Course}
     * @utbot.methodUnderTest {@link Course#getInstitute()}
     * @utbot.returnsFrom {@code return institute;}
     */
    @Test
    @DisplayName("getInstitute: -> return institute")
    public void testGetInstitute_ReturnInstitute() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));
        setField(course, "teammates.storage.entity.Course", "institute", null);

        String actual = course.getInstitute();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Course.setInstitute

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setInstitute(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Course}
     * @utbot.methodUnderTest {@link Course#setInstitute(String)}
     */
    @Test
    @DisplayName("setInstitute: institute = blank string")
    public void testSetInstituteWithBlankString() throws Exception {
        Course course = ((Course) createInstance("teammates.storage.entity.Course"));

        course.setInstitute("   ");
    }
    ///endregion

    ///endregion
}
