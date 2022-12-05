package teammates.common.datatransfer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class FeedbackParticipantTypeTest {
    ///region Test suites for executable teammates.common.datatransfer.FeedbackParticipantType.isValidGiver

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isValidGiver()

    /**
     * @utbot.classUnderTest {@link FeedbackParticipantType}
     * @utbot.methodUnderTest {@link FeedbackParticipantType#isValidGiver()}
     * @utbot.returnsFrom {@code return validGiver;}
     */
    @Test
    @DisplayName("isValidGiver: -> return validGiver")
    public void testIsValidGiver_ReturnValidGiver() {
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.GIVER;

        boolean actual = feedbackParticipantType.isValidGiver();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.FeedbackParticipantType.isValidRecipient

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isValidRecipient()

    /**
     * @utbot.classUnderTest {@link FeedbackParticipantType}
     * @utbot.methodUnderTest {@link FeedbackParticipantType#isValidRecipient()}
     * @utbot.returnsFrom {@code return validRecipient;}
     */
    @Test
    @DisplayName("isValidRecipient: -> return validRecipient")
    public void testIsValidRecipient_ReturnValidRecipient() {
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.GIVER;

        boolean actual = feedbackParticipantType.isValidRecipient();

        assertFalse(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.FeedbackParticipantType.isValidViewer

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isValidViewer()

    /**
     * @utbot.classUnderTest {@link FeedbackParticipantType}
     * @utbot.methodUnderTest {@link FeedbackParticipantType#isValidViewer()}
     * @utbot.returnsFrom {@code return validViewer;}
     */
    @Test
    @DisplayName("isValidViewer: -> return validViewer")
    public void testIsValidViewer_ReturnValidViewer() {
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.GIVER;

        boolean actual = feedbackParticipantType.isValidViewer();

        assertTrue(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.FeedbackParticipantType.isTeam

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTeam()

    /**
     * @utbot.classUnderTest {@link FeedbackParticipantType}
     * @utbot.methodUnderTest {@link FeedbackParticipantType#isTeam()}
     * @utbot.returnsFrom {@code return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION;}
     */
    @Test
    @DisplayName("isTeam: return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION : False -> return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION")
    public void testIsTeam_EqualsTEAMSOrEqualsTEAMS_EXCLUDING_SELFOrEqualsOWN_TEAMOrEqualsTEAMS_IN_SAME_SECTION() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        FeedbackParticipantType prevTEAMS = FeedbackParticipantType.TEAMS;
        try {
            FeedbackParticipantType teams = FeedbackParticipantType.TEAMS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "TEAMS", teams);

            boolean actual = teams.isTeam();

            assertTrue(actual);
        } finally {
            setStaticField(FeedbackParticipantType.class, "TEAMS", prevTEAMS);
        }
    }

    /**
     * @utbot.classUnderTest {@link FeedbackParticipantType}
     * @utbot.methodUnderTest {@link FeedbackParticipantType#isTeam()}
     * @utbot.returnsFrom {@code return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION;}
     */
    @Test
    @DisplayName("isTeam: return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION : False -> return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION")
    public void testIsTeam_EqualsTEAMSOrEqualsTEAMS_EXCLUDING_SELFOrEqualsOWN_TEAMOrEqualsTEAMS_IN_SAME_SECTION_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        FeedbackParticipantType prevTEAMS = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType prevTEAMS_EXCLUDING_SELF = FeedbackParticipantType.TEAMS_EXCLUDING_SELF;
        FeedbackParticipantType prevOWN_TEAM = FeedbackParticipantType.OWN_TEAM;
        try {
            FeedbackParticipantType teams = FeedbackParticipantType.TEAMS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "TEAMS", teams);
            FeedbackParticipantType teamsExcludingSelf = FeedbackParticipantType.TEAMS_EXCLUDING_SELF;
            setStaticField(feedbackParticipantTypeClazz, "TEAMS_EXCLUDING_SELF", teamsExcludingSelf);
            FeedbackParticipantType ownTeam = FeedbackParticipantType.OWN_TEAM;
            setStaticField(feedbackParticipantTypeClazz, "OWN_TEAM", ownTeam);

            boolean actual = ownTeam.isTeam();

            assertTrue(actual);
        } finally {
            setStaticField(FeedbackParticipantType.class, "TEAMS", prevTEAMS);
            setStaticField(FeedbackParticipantType.class, "TEAMS_EXCLUDING_SELF", prevTEAMS_EXCLUDING_SELF);
            setStaticField(FeedbackParticipantType.class, "OWN_TEAM", prevOWN_TEAM);
        }
    }

    /**
     * @utbot.classUnderTest {@link FeedbackParticipantType}
     * @utbot.methodUnderTest {@link FeedbackParticipantType#isTeam()}
     * @utbot.returnsFrom {@code return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION;}
     */
    @Test
    @DisplayName("isTeam: return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION : False -> return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION")
    public void testIsTeam_EqualsTEAMSOrEqualsTEAMS_EXCLUDING_SELFOrEqualsOWN_TEAMOrEqualsTEAMS_IN_SAME_SECTION_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        FeedbackParticipantType prevTEAMS = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType prevTEAMS_EXCLUDING_SELF = FeedbackParticipantType.TEAMS_EXCLUDING_SELF;
        try {
            FeedbackParticipantType teams = FeedbackParticipantType.TEAMS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "TEAMS", teams);
            FeedbackParticipantType teamsExcludingSelf = FeedbackParticipantType.TEAMS_EXCLUDING_SELF;
            setStaticField(feedbackParticipantTypeClazz, "TEAMS_EXCLUDING_SELF", teamsExcludingSelf);

            boolean actual = teamsExcludingSelf.isTeam();

            assertTrue(actual);
        } finally {
            setStaticField(FeedbackParticipantType.class, "TEAMS", prevTEAMS);
            setStaticField(FeedbackParticipantType.class, "TEAMS_EXCLUDING_SELF", prevTEAMS_EXCLUDING_SELF);
        }
    }

    /**
     * @utbot.classUnderTest {@link FeedbackParticipantType}
     * @utbot.methodUnderTest {@link FeedbackParticipantType#isTeam()}
     * @utbot.returnsFrom {@code return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION;}
     */
    @Test
    @DisplayName("isTeam: return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION : False -> return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION")
    public void testIsTeam_NotEqualsTEAMSOrNotEqualsTEAMS_EXCLUDING_SELFOrNotEqualsOWN_TEAMOrNotEqualsTEAMS_IN_SAME_SECTION() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        FeedbackParticipantType prevTEAMS = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType prevTEAMS_EXCLUDING_SELF = FeedbackParticipantType.TEAMS_EXCLUDING_SELF;
        FeedbackParticipantType prevOWN_TEAM = FeedbackParticipantType.OWN_TEAM;
        FeedbackParticipantType prevTEAMS_IN_SAME_SECTION = FeedbackParticipantType.TEAMS_IN_SAME_SECTION;
        try {
            FeedbackParticipantType teams = FeedbackParticipantType.TEAMS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "TEAMS", teams);
            FeedbackParticipantType teamsExcludingSelf = FeedbackParticipantType.TEAMS_EXCLUDING_SELF;
            setStaticField(feedbackParticipantTypeClazz, "TEAMS_EXCLUDING_SELF", teamsExcludingSelf);
            FeedbackParticipantType ownTeam = FeedbackParticipantType.OWN_TEAM;
            setStaticField(feedbackParticipantTypeClazz, "OWN_TEAM", ownTeam);
            FeedbackParticipantType teamsInSameSection = FeedbackParticipantType.TEAMS_IN_SAME_SECTION;
            setStaticField(feedbackParticipantTypeClazz, "TEAMS_IN_SAME_SECTION", teamsInSameSection);
            FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.SELF;

            boolean actual = feedbackParticipantType.isTeam();

            assertFalse(actual);
        } finally {
            setStaticField(FeedbackParticipantType.class, "TEAMS", prevTEAMS);
            setStaticField(FeedbackParticipantType.class, "TEAMS_EXCLUDING_SELF", prevTEAMS_EXCLUDING_SELF);
            setStaticField(FeedbackParticipantType.class, "OWN_TEAM", prevOWN_TEAM);
            setStaticField(FeedbackParticipantType.class, "TEAMS_IN_SAME_SECTION", prevTEAMS_IN_SAME_SECTION);
        }
    }

    /**
     * @utbot.classUnderTest {@link FeedbackParticipantType}
     * @utbot.methodUnderTest {@link FeedbackParticipantType#isTeam()}
     * @utbot.returnsFrom {@code return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION;}
     */
    @Test
    @DisplayName("isTeam: return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION : True -> return this == TEAMS || this == TEAMS_EXCLUDING_SELF || this == OWN_TEAM || this == TEAMS_IN_SAME_SECTION")
    public void testIsTeam_EqualsTEAMSOrEqualsTEAMS_EXCLUDING_SELFOrEqualsOWN_TEAMOrEqualsTEAMS_IN_SAME_SECTION_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        FeedbackParticipantType prevTEAMS = FeedbackParticipantType.TEAMS;
        FeedbackParticipantType prevTEAMS_EXCLUDING_SELF = FeedbackParticipantType.TEAMS_EXCLUDING_SELF;
        FeedbackParticipantType prevOWN_TEAM = FeedbackParticipantType.OWN_TEAM;
        FeedbackParticipantType prevTEAMS_IN_SAME_SECTION = FeedbackParticipantType.TEAMS_IN_SAME_SECTION;
        try {
            FeedbackParticipantType teams = FeedbackParticipantType.TEAMS;
            Class feedbackParticipantTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackParticipantType");
            setStaticField(feedbackParticipantTypeClazz, "TEAMS", teams);
            FeedbackParticipantType teamsExcludingSelf = FeedbackParticipantType.TEAMS_EXCLUDING_SELF;
            setStaticField(feedbackParticipantTypeClazz, "TEAMS_EXCLUDING_SELF", teamsExcludingSelf);
            FeedbackParticipantType ownTeam = FeedbackParticipantType.OWN_TEAM;
            setStaticField(feedbackParticipantTypeClazz, "OWN_TEAM", ownTeam);
            FeedbackParticipantType teamsInSameSection = FeedbackParticipantType.TEAMS_IN_SAME_SECTION;
            setStaticField(feedbackParticipantTypeClazz, "TEAMS_IN_SAME_SECTION", teamsInSameSection);

            boolean actual = teamsInSameSection.isTeam();

            assertTrue(actual);
        } finally {
            setStaticField(FeedbackParticipantType.class, "TEAMS", prevTEAMS);
            setStaticField(FeedbackParticipantType.class, "TEAMS_EXCLUDING_SELF", prevTEAMS_EXCLUDING_SELF);
            setStaticField(FeedbackParticipantType.class, "OWN_TEAM", prevOWN_TEAM);
            setStaticField(FeedbackParticipantType.class, "TEAMS_IN_SAME_SECTION", prevTEAMS_IN_SAME_SECTION);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.FeedbackParticipantType.toSingularFormString

    ///region

    @Test
    public void testToSingularFormString1() {
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.TEAMS_IN_SAME_SECTION;

        String actual = feedbackParticipantType.toSingularFormString();

        String expected = "team";
        assertEquals(expected, actual);
    }

    @Test
    public void testToSingularFormString2() {
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.OWN_TEAM;

        String actual = feedbackParticipantType.toSingularFormString();

        String expected = "team";
        assertEquals(expected, actual);
    }

    @Test
    public void testToSingularFormString3() {
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.OWN_TEAM_MEMBERS_INCLUDING_SELF;

        String actual = feedbackParticipantType.toSingularFormString();

        String expected = "student";
        assertEquals(expected, actual);
    }

    @Test
    public void testToSingularFormString4() {
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.INSTRUCTORS;

        String actual = feedbackParticipantType.toSingularFormString();

        String expected = "instructor";
        assertEquals(expected, actual);
    }

    @Test
    public void testToSingularFormString5() {
        FeedbackParticipantType feedbackParticipantType = FeedbackParticipantType.GIVER;

        String actual = feedbackParticipantType.toSingularFormString();

        String expected = "GIVER";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
