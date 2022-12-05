package teammates.common.datatransfer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import teammates.common.datatransfer.attributes.FeedbackResponseAttributes;
import teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes;
import org.junit.jupiter.api.DisplayName;

import java.util.Map;
import java.util.List;
import java.util.LinkedHashMap;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static java.util.Collections.emptyMap;
import static java.util.Collections.emptyList;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;

public final class SessionResultsBundleTest {
    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.isResponseGiverVisible

    ///region

    @Test
    public void testIsResponseGiverVisible1() throws Exception {
        SessionResultsBundle sessionResultsBundle = ((SessionResultsBundle) createInstance("teammates.common.datatransfer.SessionResultsBundle"));
        setField(sessionResultsBundle, "teammates.common.datatransfer.SessionResultsBundle", "questionsMap", null);
        
        /* This test fails because method [teammates.common.datatransfer.SessionResultsBundle.isResponseGiverVisible] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.SessionResultsBundle.isResponseParticipantVisible(SessionResultsBundle.java:83)
            teammates.common.datatransfer.SessionResultsBundle.isResponseGiverVisible(SessionResultsBundle.java:68) */
        sessionResultsBundle.isResponseGiverVisible(null);
    }

    @Test
    public void testIsResponseGiverVisible2() throws Exception {
        SessionResultsBundle sessionResultsBundle = ((SessionResultsBundle) createInstance("teammates.common.datatransfer.SessionResultsBundle"));
        setField(sessionResultsBundle, "teammates.common.datatransfer.SessionResultsBundle", "questionsMap", null);
        FeedbackResponseAttributes response = ((FeedbackResponseAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseAttributes"));
        setField(response, "teammates.common.datatransfer.attributes.FeedbackResponseAttributes", "feedbackQuestionId", null);
        
        /* This test fails because method [teammates.common.datatransfer.SessionResultsBundle.isResponseGiverVisible] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.SessionResultsBundle.isResponseParticipantVisible(SessionResultsBundle.java:83)
            teammates.common.datatransfer.SessionResultsBundle.isResponseGiverVisible(SessionResultsBundle.java:68) */
        sessionResultsBundle.isResponseGiverVisible(response);
    }
    ///endregion

    ///region Errors report for isResponseGiverVisible

    public void testIsResponseGiverVisible_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.isResponseRecipientVisible

    ///region

    @Test
    public void testIsResponseRecipientVisible1() throws Exception {
        SessionResultsBundle sessionResultsBundle = ((SessionResultsBundle) createInstance("teammates.common.datatransfer.SessionResultsBundle"));
        setField(sessionResultsBundle, "teammates.common.datatransfer.SessionResultsBundle", "questionsMap", null);
        FeedbackResponseAttributes response = ((FeedbackResponseAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseAttributes"));
        setField(response, "teammates.common.datatransfer.attributes.FeedbackResponseAttributes", "feedbackQuestionId", null);
        
        /* This test fails because method [teammates.common.datatransfer.SessionResultsBundle.isResponseRecipientVisible] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.SessionResultsBundle.isResponseParticipantVisible(SessionResultsBundle.java:83)
            teammates.common.datatransfer.SessionResultsBundle.isResponseRecipientVisible(SessionResultsBundle.java:76) */
        sessionResultsBundle.isResponseRecipientVisible(response);
    }

    @Test
    public void testIsResponseRecipientVisible2() throws Exception {
        SessionResultsBundle sessionResultsBundle = ((SessionResultsBundle) createInstance("teammates.common.datatransfer.SessionResultsBundle"));
        setField(sessionResultsBundle, "teammates.common.datatransfer.SessionResultsBundle", "questionsMap", null);
        
        /* This test fails because method [teammates.common.datatransfer.SessionResultsBundle.isResponseRecipientVisible] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.SessionResultsBundle.isResponseParticipantVisible(SessionResultsBundle.java:83)
            teammates.common.datatransfer.SessionResultsBundle.isResponseRecipientVisible(SessionResultsBundle.java:76) */
        sessionResultsBundle.isResponseRecipientVisible(null);
    }
    ///endregion

    ///region Errors report for isResponseRecipientVisible

    public void testIsResponseRecipientVisible_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.isCommentGiverVisible

    ///region

    @Test
    public void testIsCommentGiverVisible1() throws Exception {
        SessionResultsBundle sessionResultsBundle = ((SessionResultsBundle) createInstance("teammates.common.datatransfer.SessionResultsBundle"));
        setField(sessionResultsBundle, "teammates.common.datatransfer.SessionResultsBundle", "commentGiverVisibilityTable", null);
        
        /* This test fails because method [teammates.common.datatransfer.SessionResultsBundle.isCommentGiverVisible] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.SessionResultsBundle.isCommentGiverVisible(SessionResultsBundle.java:105) */
        sessionResultsBundle.isCommentGiverVisible(null);
    }

    @Test
    public void testIsCommentGiverVisible2() throws Exception {
        SessionResultsBundle sessionResultsBundle = ((SessionResultsBundle) createInstance("teammates.common.datatransfer.SessionResultsBundle"));
        setField(sessionResultsBundle, "teammates.common.datatransfer.SessionResultsBundle", "commentGiverVisibilityTable", null);
        FeedbackResponseCommentAttributes comment = ((FeedbackResponseCommentAttributes) createInstance("teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes"));
        setField(comment, "teammates.common.datatransfer.attributes.FeedbackResponseCommentAttributes", "feedbackResponseCommentId", null);
        
        /* This test fails because method [teammates.common.datatransfer.SessionResultsBundle.isCommentGiverVisible] produces [java.lang.NullPointerException]
            teammates.common.datatransfer.SessionResultsBundle.isCommentGiverVisible(SessionResultsBundle.java:105) */
        sessionResultsBundle.isCommentGiverVisible(comment);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.getAnonName

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getAnonName(teammates.common.datatransfer.FeedbackParticipantType, java.lang.String)

    /**
     * @utbot.classUnderTest {@link SessionResultsBundle}
     * @utbot.methodUnderTest {@link SessionResultsBundle#getAnonName(FeedbackParticipantType, String)}
     */
    @Test
    @DisplayName("getAnonName: arg_0 = OWN_TEAM_MEMBERS_INCLUDING_SELF, name has special characters")
    @Disabled(value = "Disabled due to sandbox")
    public void testGetAnonNameWithBlankString() {
        FeedbackParticipantType type = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;

        assertThrows(ExceptionInInitializerError.class, () -> SessionResultsBundle.getAnonName(type, "\n\t\r"));
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getAnonName(teammates.common.datatransfer.FeedbackParticipantType, java.lang.String)

    @Test
    public void testGetAnonName1() {
        assertThrows(NoClassDefFoundError.class, () -> SessionResultsBundle.getAnonName(null, null));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.getQuestionResponseMap

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getQuestionResponseMap()

    /**
     * @utbot.classUnderTest {@link SessionResultsBundle}
     * @utbot.methodUnderTest {@link SessionResultsBundle#getQuestionResponseMap()}
     */
    @Test
    @DisplayName("getQuestionResponseMap: arg_0 = SessionResultsBundle(Map, List, List, Map, Map, Map, Map, CourseRoster)")
    public void testGetQuestionResponseMap() {
        Map map = emptyMap();
        List list = emptyList();
        List list1 = emptyList();
        CourseRoster courseRoster = new CourseRoster(list1, list1);
        SessionResultsBundle sessionResultsBundle = new SessionResultsBundle(map, list, list, map, map, map, map, courseRoster);

        LinkedHashMap actual = ((LinkedHashMap) sessionResultsBundle.getQuestionResponseMap());

        LinkedHashMap expected = new LinkedHashMap();
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.getQuestionMissingResponseMap

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getQuestionMissingResponseMap()

    /**
     * @utbot.classUnderTest {@link SessionResultsBundle}
     * @utbot.methodUnderTest {@link SessionResultsBundle#getQuestionMissingResponseMap()}
     */
    @Test
    @DisplayName("getQuestionMissingResponseMap: arg_0 = SessionResultsBundle(Map, List, List, Map, Map, Map, Map, CourseRoster)")
    public void testGetQuestionMissingResponseMap() {
        Map map = emptyMap();
        List list = emptyList();
        List list1 = emptyList();
        CourseRoster courseRoster = new CourseRoster(list1, list1);
        SessionResultsBundle sessionResultsBundle = new SessionResultsBundle(map, list, list, map, map, map, map, courseRoster);

        LinkedHashMap actual = ((LinkedHashMap) sessionResultsBundle.getQuestionMissingResponseMap());

        LinkedHashMap expected = new LinkedHashMap();
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.getQuestionsMap

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getQuestionsMap()

    /**
     * @utbot.classUnderTest {@link SessionResultsBundle}
     * @utbot.methodUnderTest {@link SessionResultsBundle#getQuestionsMap()}
     */
    @Test
    @DisplayName("getQuestionsMap: arg_0 = SessionResultsBundle(Map, List, List, Map, Map, Map, Map, CourseRoster)")
    public void testGetQuestionsMap() {
        Map map = emptyMap();
        List list = emptyList();
        List list1 = emptyList();
        CourseRoster courseRoster = new CourseRoster(list1, list1);
        SessionResultsBundle sessionResultsBundle = new SessionResultsBundle(map, list, list, map, map, map, map, courseRoster);

        Object actual = sessionResultsBundle.getQuestionsMap();

        // java.util.Map is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(map, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.getResponseCommentsMap

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getResponseCommentsMap()

    /**
     * @utbot.classUnderTest {@link SessionResultsBundle}
     * @utbot.methodUnderTest {@link SessionResultsBundle#getResponseCommentsMap()}
     */
    @Test
    @DisplayName("getResponseCommentsMap: arg_0 = SessionResultsBundle(Map, List, List, Map, Map, Map, Map, CourseRoster)")
    public void testGetResponseCommentsMap() {
        Map map = emptyMap();
        List list = emptyList();
        List list1 = emptyList();
        CourseRoster courseRoster = new CourseRoster(list1, list1);
        SessionResultsBundle sessionResultsBundle = new SessionResultsBundle(map, list, list, map, map, map, map, courseRoster);

        Object actual = sessionResultsBundle.getResponseCommentsMap();

        // java.util.Map is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(map, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.getRoster

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getRoster()

    /**
     * @utbot.classUnderTest {@link SessionResultsBundle}
     * @utbot.methodUnderTest {@link SessionResultsBundle#getRoster()}
     */
    @Test
    @DisplayName("getRoster: arg_0 = SessionResultsBundle(Map, List, List, Map, Map, Map, Map, CourseRoster)")
    public void testGetRoster() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Map map = emptyMap();
        List list = emptyList();
        List list1 = emptyList();
        CourseRoster courseRoster = new CourseRoster(list1, list1);
        SessionResultsBundle sessionResultsBundle = new SessionResultsBundle(map, list, list, map, map, map, map, courseRoster);

        CourseRoster actual = sessionResultsBundle.getRoster();

        Map courseRosterStudentListByEmail = ((Map) getFieldValue(courseRoster, "teammates.common.datatransfer.CourseRoster", "studentListByEmail"));
        Map actualStudentListByEmail = ((Map) getFieldValue(actual, "teammates.common.datatransfer.CourseRoster", "studentListByEmail"));
        assertTrue(deepEquals(courseRosterStudentListByEmail, actualStudentListByEmail));

        Map courseRosterInstructorListByEmail = ((Map) getFieldValue(courseRoster, "teammates.common.datatransfer.CourseRoster", "instructorListByEmail"));
        Map actualInstructorListByEmail = ((Map) getFieldValue(actual, "teammates.common.datatransfer.CourseRoster", "instructorListByEmail"));
        assertTrue(deepEquals(courseRosterInstructorListByEmail, actualInstructorListByEmail));

        Map courseRosterTeamToMembersTable = ((Map) getFieldValue(courseRoster, "teammates.common.datatransfer.CourseRoster", "teamToMembersTable"));
        Map actualTeamToMembersTable = ((Map) getFieldValue(actual, "teammates.common.datatransfer.CourseRoster", "teamToMembersTable"));
        assertTrue(deepEquals(courseRosterTeamToMembersTable, actualTeamToMembersTable));

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.getResponseGiverVisibilityTable

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getResponseGiverVisibilityTable()

    /**
     * @utbot.classUnderTest {@link SessionResultsBundle}
     * @utbot.methodUnderTest {@link SessionResultsBundle#getResponseGiverVisibilityTable()}
     */
    @Test
    @DisplayName("getResponseGiverVisibilityTable: arg_0 = SessionResultsBundle(Map, List, List, Map, Map, Map, Map, CourseRoster)")
    public void testGetResponseGiverVisibilityTable() {
        Map map = emptyMap();
        List list = emptyList();
        List list1 = emptyList();
        CourseRoster courseRoster = new CourseRoster(list1, list1);
        SessionResultsBundle sessionResultsBundle = new SessionResultsBundle(map, list, list, map, map, map, map, courseRoster);

        Object actual = sessionResultsBundle.getResponseGiverVisibilityTable();

        // java.util.Map is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(map, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.getResponseRecipientVisibilityTable

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getResponseRecipientVisibilityTable()

    /**
     * @utbot.classUnderTest {@link SessionResultsBundle}
     * @utbot.methodUnderTest {@link SessionResultsBundle#getResponseRecipientVisibilityTable()}
     */
    @Test
    @DisplayName("getResponseRecipientVisibilityTable: arg_0 = SessionResultsBundle(Map, List, List, Map, Map, Map, Map, CourseRoster)")
    public void testGetResponseRecipientVisibilityTable() {
        Map map = emptyMap();
        List list = emptyList();
        List list1 = emptyList();
        CourseRoster courseRoster = new CourseRoster(list1, list1);
        SessionResultsBundle sessionResultsBundle = new SessionResultsBundle(map, list, list, map, map, map, map, courseRoster);

        Object actual = sessionResultsBundle.getResponseRecipientVisibilityTable();

        // java.util.Map is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(map, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.SessionResultsBundle.getCommentGiverVisibilityTable

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCommentGiverVisibilityTable()

    /**
     * @utbot.classUnderTest {@link SessionResultsBundle}
     * @utbot.methodUnderTest {@link SessionResultsBundle#getCommentGiverVisibilityTable()}
     */
    @Test
    @DisplayName("getCommentGiverVisibilityTable: arg_0 = SessionResultsBundle(Map, List, List, Map, Map, Map, Map, CourseRoster)")
    public void testGetCommentGiverVisibilityTable() {
        Map map = emptyMap();
        List list = emptyList();
        List list1 = emptyList();
        CourseRoster courseRoster = new CourseRoster(list1, list1);
        SessionResultsBundle sessionResultsBundle = new SessionResultsBundle(map, list, list, map, map, map, map, courseRoster);

        Object actual = sessionResultsBundle.getCommentGiverVisibilityTable();

        // java.util.Map is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(map, actual));
    }
    ///endregion

    ///endregion
}
