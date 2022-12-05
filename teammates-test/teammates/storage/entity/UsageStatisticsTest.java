package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Instant;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class UsageStatisticsTest {
    ///region Test suites for executable teammates.storage.entity.UsageStatistics.getId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getId()

    /**
     * @utbot.classUnderTest {@link UsageStatistics}
     * @utbot.methodUnderTest {@link UsageStatistics#getId()}
     * @utbot.returnsFrom {@code return id;}
     */
    @Test
    @DisplayName("getId: -> return id")
    public void testGetId_ReturnId() throws Exception {
        UsageStatistics usageStatistics = ((UsageStatistics) createInstance("teammates.storage.entity.UsageStatistics"));
        String string = "";
        setField(usageStatistics, "teammates.storage.entity.UsageStatistics", "id", string);

        String actual = usageStatistics.getId();

        assertEquals(string, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.UsageStatistics.getStartTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStartTime()

    /**
     * @utbot.classUnderTest {@link UsageStatistics}
     * @utbot.methodUnderTest {@link UsageStatistics#getStartTime()}
     * @utbot.returnsFrom {@code return startTime;}
     */
    @Test
    @DisplayName("getStartTime: -> return startTime")
    public void testGetStartTime_ReturnStartTime() throws Exception {
        UsageStatistics usageStatistics = ((UsageStatistics) createInstance("teammates.storage.entity.UsageStatistics"));
        Instant instantMock = mock(Instant.class);
        setField(usageStatistics, "teammates.storage.entity.UsageStatistics", "startTime", instantMock);

        Instant actual = usageStatistics.getStartTime();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.UsageStatistics.getTimePeriod

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTimePeriod()

    /**
     * @utbot.classUnderTest {@link UsageStatistics}
     * @utbot.methodUnderTest {@link UsageStatistics#getTimePeriod()}
     * @utbot.returnsFrom {@code return timePeriod;}
     */
    @Test
    @DisplayName("getTimePeriod: -> return timePeriod")
    public void testGetTimePeriod_ReturnTimePeriod() throws Exception {
        UsageStatistics usageStatistics = ((UsageStatistics) createInstance("teammates.storage.entity.UsageStatistics"));
        setField(usageStatistics, "teammates.storage.entity.UsageStatistics", "timePeriod", -255);

        int actual = usageStatistics.getTimePeriod();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.UsageStatistics.getNumResponses

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumResponses()

    /**
     * @utbot.classUnderTest {@link UsageStatistics}
     * @utbot.methodUnderTest {@link UsageStatistics#getNumResponses()}
     * @utbot.returnsFrom {@code return numResponses;}
     */
    @Test
    @DisplayName("getNumResponses: -> return numResponses")
    public void testGetNumResponses_ReturnNumResponses() throws Exception {
        UsageStatistics usageStatistics = ((UsageStatistics) createInstance("teammates.storage.entity.UsageStatistics"));
        setField(usageStatistics, "teammates.storage.entity.UsageStatistics", "numResponses", -255);

        int actual = usageStatistics.getNumResponses();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.UsageStatistics.getNumCourses

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumCourses()

    /**
     * @utbot.classUnderTest {@link UsageStatistics}
     * @utbot.methodUnderTest {@link UsageStatistics#getNumCourses()}
     * @utbot.returnsFrom {@code return numCourses;}
     */
    @Test
    @DisplayName("getNumCourses: -> return numCourses")
    public void testGetNumCourses_ReturnNumCourses() throws Exception {
        UsageStatistics usageStatistics = ((UsageStatistics) createInstance("teammates.storage.entity.UsageStatistics"));
        setField(usageStatistics, "teammates.storage.entity.UsageStatistics", "numCourses", -255);

        int actual = usageStatistics.getNumCourses();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.UsageStatistics.getNumStudents

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumStudents()

    /**
     * @utbot.classUnderTest {@link UsageStatistics}
     * @utbot.methodUnderTest {@link UsageStatistics#getNumStudents()}
     * @utbot.returnsFrom {@code return numStudents;}
     */
    @Test
    @DisplayName("getNumStudents: -> return numStudents")
    public void testGetNumStudents_ReturnNumStudents() throws Exception {
        UsageStatistics usageStatistics = ((UsageStatistics) createInstance("teammates.storage.entity.UsageStatistics"));
        setField(usageStatistics, "teammates.storage.entity.UsageStatistics", "numStudents", -255);

        int actual = usageStatistics.getNumStudents();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.UsageStatistics.getNumInstructors

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumInstructors()

    /**
     * @utbot.classUnderTest {@link UsageStatistics}
     * @utbot.methodUnderTest {@link UsageStatistics#getNumInstructors()}
     * @utbot.returnsFrom {@code return numInstructors;}
     */
    @Test
    @DisplayName("getNumInstructors: -> return numInstructors")
    public void testGetNumInstructors_ReturnNumInstructors() throws Exception {
        UsageStatistics usageStatistics = ((UsageStatistics) createInstance("teammates.storage.entity.UsageStatistics"));
        setField(usageStatistics, "teammates.storage.entity.UsageStatistics", "numInstructors", -255);

        int actual = usageStatistics.getNumInstructors();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.UsageStatistics.getNumAccountRequests

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumAccountRequests()

    /**
     * @utbot.classUnderTest {@link UsageStatistics}
     * @utbot.methodUnderTest {@link UsageStatistics#getNumAccountRequests()}
     * @utbot.returnsFrom {@code return numAccountRequests;}
     */
    @Test
    @DisplayName("getNumAccountRequests: -> return numAccountRequests")
    public void testGetNumAccountRequests_ReturnNumAccountRequests() throws Exception {
        UsageStatistics usageStatistics = ((UsageStatistics) createInstance("teammates.storage.entity.UsageStatistics"));
        setField(usageStatistics, "teammates.storage.entity.UsageStatistics", "numAccountRequests", -255);

        int actual = usageStatistics.getNumAccountRequests();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.UsageStatistics.getNumEmails

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumEmails()

    /**
     * @utbot.classUnderTest {@link UsageStatistics}
     * @utbot.methodUnderTest {@link UsageStatistics#getNumEmails()}
     * @utbot.returnsFrom {@code return numEmails;}
     */
    @Test
    @DisplayName("getNumEmails: -> return numEmails")
    public void testGetNumEmails_ReturnNumEmails() throws Exception {
        UsageStatistics usageStatistics = ((UsageStatistics) createInstance("teammates.storage.entity.UsageStatistics"));
        setField(usageStatistics, "teammates.storage.entity.UsageStatistics", "numEmails", -255);

        int actual = usageStatistics.getNumEmails();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.UsageStatistics.getNumSubmissions

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumSubmissions()

    /**
     * @utbot.classUnderTest {@link UsageStatistics}
     * @utbot.methodUnderTest {@link UsageStatistics#getNumSubmissions()}
     * @utbot.returnsFrom {@code return numSubmissions;}
     */
    @Test
    @DisplayName("getNumSubmissions: -> return numSubmissions")
    public void testGetNumSubmissions_ReturnNumSubmissions() throws Exception {
        UsageStatistics usageStatistics = ((UsageStatistics) createInstance("teammates.storage.entity.UsageStatistics"));
        setField(usageStatistics, "teammates.storage.entity.UsageStatistics", "numSubmissions", -255);

        int actual = usageStatistics.getNumSubmissions();

        assertEquals(-255, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.UsageStatistics.generateId

    ///region

    @Test
    public void testGenerateId1() {
        /* This test fails because method [teammates.storage.entity.UsageStatistics.generateId] produces [java.lang.NullPointerException]
            teammates.storage.entity.UsageStatistics.generateId(UsageStatistics.java:98) */
        UsageStatistics.generateId(null, -255);
    }

    @Test
    public void testGenerateId2() {
        Instant startTimeMock = mock(Instant.class);
        (when(startTimeMock.toEpochMilli())).thenReturn(0L);

        String actual = UsageStatistics.generateId(startTimeMock, 1);

        String expected = "0%1";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
