package teammates.common.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class EmailTypeTest {
    ///region Test suites for executable teammates.common.util.EmailType.getSubject

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSubject()

    /**
     * @utbot.classUnderTest {@link EmailType}
     * @utbot.methodUnderTest {@link EmailType#getSubject()}
     * @utbot.returnsFrom {@code return subject;}
     */
    @Test
    @DisplayName("getSubject: -> return subject")
    public void testGetSubject_ReturnSubject() {
        EmailType emailType = EmailType.INSTRUCTOR_COURSE_JOIN;

        String actual = emailType.getSubject();

        String expected = "TEAMMATES: Invitation to join course as an instructor [%s][Course ID: %s]";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
