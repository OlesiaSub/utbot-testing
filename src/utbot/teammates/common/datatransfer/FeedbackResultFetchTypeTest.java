package teammates.common.datatransfer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class FeedbackResultFetchTypeTest {
    ///region Test suites for executable teammates.common.datatransfer.FeedbackResultFetchType.parseFetchType

    ///region

    @Test
    public void testParseFetchType1() {
        FeedbackResultFetchType actual = FeedbackResultFetchType.parseFetchType("giver");

        FeedbackResultFetchType expected = FeedbackResultFetchType.GIVER;
        assertEquals(expected, actual);
    }

    @Test
    public void testParseFetchType2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        FeedbackResultFetchType prevBOTH = FeedbackResultFetchType.BOTH;
        try {
            FeedbackResultFetchType both = FeedbackResultFetchType.BOTH;
            Class feedbackResultFetchTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackResultFetchType");
            setStaticField(feedbackResultFetchTypeClazz, "BOTH", both);

            FeedbackResultFetchType actual = FeedbackResultFetchType.parseFetchType(null);

            assertEquals(both, actual);
        } finally {
            setStaticField(FeedbackResultFetchType.class, "BOTH", prevBOTH);
        }
    }

    @Test
    public void testParseFetchType3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        FeedbackResultFetchType prevBOTH = FeedbackResultFetchType.BOTH;
        try {
            FeedbackResultFetchType both = FeedbackResultFetchType.BOTH;
            Class feedbackResultFetchTypeClazz = Class.forName("teammates.common.datatransfer.FeedbackResultFetchType");
            setStaticField(feedbackResultFetchTypeClazz, "BOTH", both);
            String typeString = "";

            FeedbackResultFetchType actual = FeedbackResultFetchType.parseFetchType(typeString);

            assertEquals(both, actual);
        } finally {
            setStaticField(FeedbackResultFetchType.class, "BOTH", prevBOTH);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.FeedbackResultFetchType.shouldFetchByGiver

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldFetchByGiver()

    /**
     * @utbot.classUnderTest {@link FeedbackResultFetchType}
     * @utbot.methodUnderTest {@link FeedbackResultFetchType#shouldFetchByGiver()}
     * @utbot.returnsFrom {@code return isByGiver;}
     */
    @Test
    @DisplayName("shouldFetchByGiver: -> return isByGiver")
    public void testShouldFetchByGiver_ReturnIsByGiver() {
        FeedbackResultFetchType feedbackResultFetchType = FeedbackResultFetchType.BOTH;

        boolean actual = feedbackResultFetchType.shouldFetchByGiver();

        assertTrue(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.FeedbackResultFetchType.shouldFetchByReceiver

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldFetchByReceiver()

    /**
     * @utbot.classUnderTest {@link FeedbackResultFetchType}
     * @utbot.methodUnderTest {@link FeedbackResultFetchType#shouldFetchByReceiver()}
     * @utbot.returnsFrom {@code return isByReceiver;}
     */
    @Test
    @DisplayName("shouldFetchByReceiver: -> return isByReceiver")
    public void testShouldFetchByReceiver_ReturnIsByReceiver() {
        FeedbackResultFetchType feedbackResultFetchType = FeedbackResultFetchType.BOTH;

        boolean actual = feedbackResultFetchType.shouldFetchByReceiver();

        assertTrue(actual);
    }
    ///endregion

    ///endregion
}
