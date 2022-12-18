package teammates.common.util;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Duration;

import teammates.common.datatransfer.FeedbackParticipantType;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class FieldValidatorTest {
    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInvalidityInfoForEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForEmail(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForEmail: arg_0 = string -> throw NoClassDefFoundError")
    public void testGetInvalidityInfoForEmailThrowsNCDFEWithNonEmptyString() {
        assertThrows(NoClassDefFoundError.class, () -> FieldValidator.getInvalidityInfoForEmail("The provided ${fieldName} is not acceptable to TEAMMATES as it contains only whitespace or contains extra spaces at the beginning or at the end of the text."));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForGracePeriod

    ///region

    @Test
    public void testGetInvalidityInfoForGracePeriod1() {
        /* This test fails because method [teammates.common.util.FieldValidator.getInvalidityInfoForGracePeriod] produces [java.lang.NullPointerException]
            teammates.common.util.FieldValidator.getInvalidityInfoForGracePeriod(FieldValidator.java:315) */
        FieldValidator.getInvalidityInfoForGracePeriod(null);
    }

    @Test
    public void testGetInvalidityInfoForGracePeriod2() throws Exception {
        Duration gracePeriod = ((Duration) createInstance("java.time.Duration"));
        setField(gracePeriod, "java.time.Duration", "seconds", -255L);

        String actual = FieldValidator.getInvalidityInfoForGracePeriod(gracePeriod);

        String expected = "Grace period should not be negative. The value must be one of the options in the grace period dropdown selector.";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetInvalidityInfoForGracePeriod3() throws Exception {
        Duration gracePeriod = ((Duration) createInstance("java.time.Duration"));
        setField(gracePeriod, "java.time.Duration", "seconds", 0L);

        String actual = FieldValidator.getInvalidityInfoForGracePeriod(gracePeriod);

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForGoogleId

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInvalidityInfoForGoogleId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForGoogleId(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForGoogleId: arg_0 = string -> throw NoClassDefFoundError")
    public void testGetInvalidityInfoForGoogleIdThrowsNCDFEWithNonEmptyString() {
        assertThrows(NoClassDefFoundError.class, () -> FieldValidator.getInvalidityInfoForGoogleId("The provided ${fieldName} is not acceptable to TEAMMATES as it contains only whitespace or contains extra spaces at the beginning or at the end of the text."));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForCourseId

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInvalidityInfoForCourseId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForCourseId(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForCourseId: arg_0 = string -> throw NoClassDefFoundError")
    public void testGetInvalidityInfoForCourseIdThrowsNCDFEWithNonEmptyString() {
        assertThrows(NoClassDefFoundError.class, () -> FieldValidator.getInvalidityInfoForCourseId("${fieldName}"));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForSectionName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForSectionName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForSectionName(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForSectionName: arg_0 = empty string")
    public void testGetInvalidityInfoForSectionNameWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForSectionName("");

        String expected = "The field 'section name' is empty. The value of a/an section name should be no longer than 60 characters. It should not be empty.";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForTeamName

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInvalidityInfoForTeamName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForTeamName(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForTeamName: arg_0 = empty string")
    @Disabled(value = "Disabled due to sandbox")
    public void testGetInvalidityInfoForTeamNameWithEmptyString() {
        assertThrows(ExceptionInInitializerError.class, () -> FieldValidator.getInvalidityInfoForTeamName(""));
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getInvalidityInfoForTeamName(java.lang.String)

    @Test
    public void testGetInvalidityInfoForTeamName1() {
        assertThrows(NoClassDefFoundError.class, () -> FieldValidator.getInvalidityInfoForTeamName(null));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForStudentRoleComments

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForStudentRoleComments(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForStudentRoleComments(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForStudentRoleComments: arg_0 = empty string")
    public void testGetInvalidityInfoForStudentRoleCommentsWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForStudentRoleComments("");

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForFeedbackSessionName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForFeedbackSessionName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForFeedbackSessionName(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForFeedbackSessionName: arg_0 = empty string")
    public void testGetInvalidityInfoForFeedbackSessionNameWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForFeedbackSessionName("");

        String expected = "The field 'feedback session name' should not be empty. The value of 'feedback session name' field should be no longer than 64 characters.";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForCourseName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForCourseName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForCourseName(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForCourseName: arg_0 = empty string")
    public void testGetInvalidityInfoForCourseNameWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForCourseName("");

        String expected = "The field 'course name' is empty. The value of a/an course name should be no longer than 80 characters. It should not be empty.";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForNationality

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForNationality(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForNationality(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForNationality: arg_0 = empty string")
    public void testGetInvalidityInfoForNationalityWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForNationality("");

        String expected = "\"\" is not an accepted nationality to TEAMMATES. The value must be one of the values from the nationality dropdown selector.";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForInstituteName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForInstituteName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForInstituteName(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForInstituteName: arg_0 = empty string")
    public void testGetInvalidityInfoForInstituteNameWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForInstituteName("");

        String expected = "The field 'institute name' is empty. The value of a/an institute name should be no longer than 64 characters. It should not be empty.";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForPersonName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForPersonName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForPersonName(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForPersonName: arg_0 = empty string")
    public void testGetInvalidityInfoForPersonNameWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForPersonName("");

        String expected = "The field 'person name' is empty. The value of a/an person name should be no longer than 100 characters. It should not be empty.";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForTimeZone

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForTimeZone(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForTimeZone(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForTimeZone: arg_0 = string")
    public void testGetInvalidityInfoForTimeZoneWithNonEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForTimeZone("is not available as a choice");

        String expected = "\"is not available as a choice\" is not acceptable to TEAMMATES as a/an time zone because it is not available as a choice. The value must be one of the values from the time zone dropdown selector.";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForRole

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForRole(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForRole(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForRole: arg_0 = empty string")
    public void testGetInvalidityInfoForRoleWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForRole("");

        String expected = "\"\" is not an accepted access-level to TEAMMATES. ";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getValidityInfoForAllowedName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getValidityInfoForAllowedName(java.lang.String, int, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getValidityInfoForAllowedName(String, int, String)}
     */
    @Test
    @DisplayName("getValidityInfoForAllowedName: arg_0 = string, maxLength = 0, value = string")
    public void testGetValidityInfoForAllowedNameWithNonEmptyStringsAndCornerCase() {
        String actual = FieldValidator.getValidityInfoForAllowedName("is too long", 0, "The field '${fieldName}' should not be empty. The value of '${fieldName}' field should be no longer than ${maxLength} characters.");

        String expected = "\"The field 'is too long' should not be empty. The value of 'is too long' field should be no longer than 0 characters.\" is not acceptable to TEAMMATES as a/an is too long because it is too long. The value of a/an is too long should be no longer than 0 characters. It should not be empty.";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForNotificationTitle

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForNotificationTitle(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForNotificationTitle(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForNotificationTitle: arg_0 = empty string")
    public void testGetInvalidityInfoForNotificationTitleWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForNotificationTitle("");

        String expected = "The field 'notification title' is empty.";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForNotificationBody

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForNotificationBody(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForNotificationBody(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForNotificationBody: arg_0 = string")
    public void testGetInvalidityInfoForNotificationBodyWithNonEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForNotificationBody("Non-null value expected for notification message");

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForNotificationStyle

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForNotificationStyle(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForNotificationStyle(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForNotificationStyle: arg_0 = empty string")
    public void testGetInvalidityInfoForNotificationStyleWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForNotificationStyle("");

        String expected = "\"\" is not an accepted notification style to TEAMMATES. ";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForNotificationTargetUser

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForNotificationTargetUser(java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForNotificationTargetUser(String)}
     */
    @Test
    @DisplayName("getInvalidityInfoForNotificationTargetUser: arg_0 = empty string")
    public void testGetInvalidityInfoForNotificationTargetUserWithEmptyString() {
        String actual = FieldValidator.getInvalidityInfoForNotificationTargetUser("");

        String expected = "\"\" is not an accepted notification target user to TEAMMATES. ";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getValidityInfoForSizeCappedPossiblyEmptyString

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getValidityInfoForSizeCappedPossiblyEmptyString(java.lang.String, int, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getValidityInfoForSizeCappedPossiblyEmptyString(String, int, String)}
     */
    @Test
    @DisplayName("getValidityInfoForSizeCappedPossiblyEmptyString: arg_0 = string, maxLength = Int.MAX_VALUE, value = string")
    public void testGetValidityInfoForSizeCappedPossiblyEmptyStringWithNonEmptyStringsAndCornerCase() {
        String actual = FieldValidator.getValidityInfoForSizeCappedPossiblyEmptyString("\"${userInput}\" is not acceptable to TEAMMATES as a/an ${fieldName} because it ${reason}. The value of a/an ${fieldName} should be no longer than ${maxLength} characters.", Integer.MAX_VALUE, "${fieldName}");

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForTimeForSessionEndAndExtendedDeadlines

    ///region

    @Test
    public void testGetInvalidityInfoForTimeForSessionEndAndExtendedDeadlines1() {
        /* This test fails because method [teammates.common.util.FieldValidator.getInvalidityInfoForTimeForSessionEndAndExtendedDeadlines] produces [java.lang.NullPointerException]
            teammates.common.util.FieldValidator.getInvalidityInfoForTimeForSessionEndAndExtendedDeadlines(FieldValidator.java:701) */
        FieldValidator.getInvalidityInfoForTimeForSessionEndAndExtendedDeadlines(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForTimeForNotificationStartAndEnd

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInvalidityInfoForTimeForNotificationStartAndEnd(java.time.Instant, java.time.Instant)

    @Test
    public void testGetInvalidityInfoForTimeForNotificationStartAndEnd1() {
        /* This test fails because method [teammates.common.util.FieldValidator.getInvalidityInfoForTimeForNotificationStartAndEnd] produces [java.lang.AssertionError]
            teammates.common.util.FieldValidator.getInvalidityInfoForFirstTimeComparedToSecondTime(FieldValidator.java:742)
            teammates.common.util.FieldValidator.getInvalidityInfoForFirstTimeIsBeforeSecondTime(FieldValidator.java:723)
            teammates.common.util.FieldValidator.getInvalidityInfoForTimeForNotificationStartAndEnd(FieldValidator.java:717) */
        FieldValidator.getInvalidityInfoForTimeForNotificationStartAndEnd(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getValidityInfoForFeedbackParticipantType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getValidityInfoForFeedbackParticipantType(teammates.common.datatransfer.FeedbackParticipantType, teammates.common.datatransfer.FeedbackParticipantType)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getValidityInfoForFeedbackParticipantType(FeedbackParticipantType, FeedbackParticipantType)}
     */
    @Test
    @DisplayName("getValidityInfoForFeedbackParticipantType: arg_0 = NONE, recipientType = TEAMS_EXCLUDING_SELF")
    public void testGetValidityInfoForFeedbackParticipantType() {
        FeedbackParticipantType giverType = FeedbackParticipantType.NONE;
        FeedbackParticipantType recipientType = FeedbackParticipantType.TEAMS_EXCLUDING_SELF;

        LinkedList actual = ((LinkedList) FieldValidator.getValidityInfoForFeedbackParticipantType(giverType, recipientType));

        LinkedList expected = new LinkedList();
        String string = "NONE is not a valid feedback giver.";
        expected.add(string);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForCommentGiverType

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForCommentGiverType(teammates.common.datatransfer.FeedbackParticipantType)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForCommentGiverType(FeedbackParticipantType)}
     */
    @Test
    @DisplayName("getInvalidityInfoForCommentGiverType: arg_0 = TEAMS_IN_SAME_SECTION")
    public void testGetInvalidityInfoForCommentGiverType() {
        FeedbackParticipantType commentGiverType = FeedbackParticipantType.TEAMS_IN_SAME_SECTION;

        String actual = FieldValidator.getInvalidityInfoForCommentGiverType(commentGiverType);

        String expected = "Invalid comment giver type: TEAMS_IN_SAME_SECTION";
        assertEquals(expected, actual);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInvalidityInfoForCommentGiverType(teammates.common.datatransfer.FeedbackParticipantType)

    @Test
    public void testGetInvalidityInfoForCommentGiverType1() {
        /* This test fails because method [teammates.common.util.FieldValidator.getInvalidityInfoForCommentGiverType] produces [java.lang.AssertionError]
            teammates.common.util.FieldValidator.getInvalidityInfoForCommentGiverType(FieldValidator.java:796) */
        FieldValidator.getInvalidityInfoForCommentGiverType(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getInvalidityInfoForVisibilityOfFeedbackParticipantComments

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForVisibilityOfFeedbackParticipantComments(boolean, boolean)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForVisibilityOfFeedbackParticipantComments(boolean, boolean)}
     * @utbot.executesCondition {@code (!isVisibilityFollowingFeedbackQuestion): False}
     * @utbot.returnsFrom {@code return "";}
     */
    @Test
    @DisplayName("getInvalidityInfoForVisibilityOfFeedbackParticipantComments: !isVisibilityFollowingFeedbackQuestion : False -> return \"\"")
    public void testGetInvalidityInfoForVisibilityOfFeedbackParticipantComments_IsVisibilityFollowingFeedbackQuestion() {
        String actual = FieldValidator.getInvalidityInfoForVisibilityOfFeedbackParticipantComments(true, true);

        String expected = "";
        assertEquals(expected, actual);
    }

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForVisibilityOfFeedbackParticipantComments(boolean, boolean)}
     * @utbot.executesCondition {@code (!isVisibilityFollowingFeedbackQuestion): True}
     * @utbot.returnsFrom {@code return "Comment by feedback participant not following visibility setting of the question.";}
     */
    @Test
    @DisplayName("getInvalidityInfoForVisibilityOfFeedbackParticipantComments: !isVisibilityFollowingFeedbackQuestion : True -> return \"Comment by feedback participant not following visibility setting of the question.\"")
    public void testGetInvalidityInfoForVisibilityOfFeedbackParticipantComments_NotIsVisibilityFollowingFeedbackQuestion() {
        String actual = FieldValidator.getInvalidityInfoForVisibilityOfFeedbackParticipantComments(true, false);

        String expected = "Comment by feedback participant not following visibility setting of the question.";
        assertEquals(expected, actual);
    }
    ///endregion

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInvalidityInfoForVisibilityOfFeedbackParticipantComments(boolean, boolean)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getInvalidityInfoForVisibilityOfFeedbackParticipantComments(boolean, boolean)}
     */
    @Test
    @DisplayName("getInvalidityInfoForVisibilityOfFeedbackParticipantComments: arg_0 = false, isVisibilityFollowingFeedbackQuestion = false")
    public void testGetInvalidityInfoForVisibilityOfFeedbackParticipantComments() {
        String actual = FieldValidator.getInvalidityInfoForVisibilityOfFeedbackParticipantComments(false, false);

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getValidityInfoForFeedbackResponseVisibility

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getValidityInfoForFeedbackResponseVisibility(java.util.List, java.util.List, java.util.List)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getValidityInfoForFeedbackResponseVisibility(List, List, List)}
     */
    @Test
    @DisplayName("getValidityInfoForFeedbackResponseVisibility: arg_0 = test collection, showGiverNameTo = test collection, showRecipientNameTo = test collection")
    public void testGetValidityInfoForFeedbackResponseVisibility() {
        ArrayList showResponsesTo = new ArrayList();
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.SELF;
        showResponsesTo.add(feedbackParticipantType);
        FeedbackParticipantType feedbackParticipantType1 = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;
        showResponsesTo.add(feedbackParticipantType1);
        showResponsesTo.add(feedbackParticipantType1);
        ArrayList showGiverNameTo = new ArrayList();
        showGiverNameTo.add(feedbackParticipantType1);
        ArrayList showRecipientNameTo = new ArrayList();
        showRecipientNameTo.add(feedbackParticipantType1);
        FeedbackParticipantType feedbackParticipantType2 = FeedbackParticipantType.GIVER;
        showRecipientNameTo.add(feedbackParticipantType2);
        FeedbackParticipantType feedbackParticipantType3 = FeedbackParticipantType.RECEIVER;
        showRecipientNameTo.add(feedbackParticipantType3);

        LinkedList actual = ((LinkedList) FieldValidator.getValidityInfoForFeedbackResponseVisibility(showResponsesTo, showGiverNameTo, showRecipientNameTo));

        LinkedList expected = new LinkedList();
        String string = "Trying to show recipient name to GIVER without showing response first.";
        expected.add(string);
        String string1 = "Trying to show recipient name to RECEIVER without showing response first.";
        expected.add(string1);
        String string2 = "SELF is not a valid feedback viewer.";
        expected.add(string2);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getValidityInfoForNonHtmlField

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getValidityInfoForNonHtmlField(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getValidityInfoForNonHtmlField(String, String)}
     */
    @Test
    @DisplayName("getValidityInfoForNonHtmlField: arg_0 != empty string, value != empty string")
    public void testGetValidityInfoForNonHtmlFieldWithNonEmptyStrings() {
        String actual = FieldValidator.getValidityInfoForNonHtmlField("string", "string");

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.getValidityInfoForNonNullField

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getValidityInfoForNonNullField(java.lang.String, java.lang.Object)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#getValidityInfoForNonNullField(String, Object)}
     */
    @Test
    @DisplayName("getValidityInfoForNonNullField: arg_0 = string, value = Object()")
    public void testGetValidityInfoForNonNullFieldWithNonEmptyString() {
        Object value = new Object();

        String actual = FieldValidator.getValidityInfoForNonNullField("${fieldName}", value);

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.FieldValidator.areElementsUnique

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method areElementsUnique(java.util.Collection)

    /**
     * @utbot.classUnderTest {@link FieldValidator}
     * @utbot.methodUnderTest {@link FieldValidator#areElementsUnique(Collection)}
     */
    @Test
    @DisplayName("areElementsUnique: arg_0 = test collection -> return true")
    public void testAreElementsUniqueReturnsTrue() {
        ArrayList elements = new ArrayList();

        boolean actual = FieldValidator.areElementsUnique(elements);

        assertTrue(actual);
    }
    ///endregion

    ///endregion
}
