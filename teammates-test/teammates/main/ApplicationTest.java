package teammates.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNull;

public final class ApplicationTest {
    ///region Test suites for executable teammates.main.Application.main

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method main(java.lang.String[])

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray() throws Exception {
        String[] args = {"org.eclipse.jetty.util.log.class", "/devServerLogin", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray1() throws Exception {
        String[] args = {"", "DevServerLoginServlet", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[1] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray2() throws Exception {
        String[] args = {"/devServerLogin"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray3() throws Exception {
        String[] args = {"org.eclipse.jetty.util.log.class", "syiug", "/devServerLogin"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray4() throws Exception {
        String[] args = {"org.eclipse.jetty.util.log.class", "oesjb", "/"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray5() throws Exception {
        String[] args = {"hlcoj", "/", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray6() throws Exception {
        String[] args = {"oxhrh", "noimn", ""};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray7() throws Exception {
        String[] args = {"hlcoj", "", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray8() throws Exception {
        String[] args = {"INFO", "INFO", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray9() throws Exception {
        String[] args = {"oesjb", "oxhrh", "org.eclipse.jetty.util.log.class"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray10() throws Exception {
        String[] args = {"org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.class", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray11() throws Exception {
        String[] args = {"oesjb", "hlcoj", "DevServerLoginServlet"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray12() throws Exception {
        String[] args = {"/", "INFO", "/"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray13() throws Exception {
        String[] args = {"oxhrh", "/", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray14() throws Exception {
        String[] args = {"org.eclipse.jetty.util.log.class", "DevServerLoginServlet", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray15() throws Exception {
        String[] args = {"oesjb", "", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray16() throws Exception {
        String[] args = {"/devServerLogin", "oesjb", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray17() throws Exception {
        String[] args = {"oxhrh", "syiug", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray18() throws Exception {
        String[] args = {"syiug", "oesjb", "/devServerLogin"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray19() throws Exception {
        String[] args = {"DevServerLoginServlet", "", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray20() throws Exception {
        String[] args = {"oesjb", "/", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[1] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray21() throws Exception {
        String[] args = {""};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray22() throws Exception {
        String[] args = {"noimn", "DevServerLoginServlet", "/devServerLogin"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray23() throws Exception {
        String[] args = {"noimn", "syiug", "/"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray24() throws Exception {
        String[] args = {"", "hlcoj", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray25() throws Exception {
        String[] args = {"org.eclipse.jetty.util.log.class", "org.eclipse.jetty.LEVEL", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray26() throws Exception {
        String[] args = {"DevServerLoginServlet", "/devServerLogin", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray27() throws Exception {
        String[] args = {"oesjb", "oxhrh", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray28() throws Exception {
        String[] args = {"hlcoj", "org.eclipse.jetty.LEVEL", ""};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray29() throws Exception {
        String[] args = {"syiug", "org.eclipse.jetty.LEVEL", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray30() throws Exception {
        String[] args = {"hlcoj", "INFO", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray31() throws Exception {
        String[] args = {"DevServerLoginServlet", "/", "org.eclipse.jetty.util.log.class"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray32() throws Exception {
        String[] args = {"hlcoj", "/devServerLogin", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray33() throws Exception {
        String[] args = {"oxhrh", "/devServerLogin", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray34() throws Exception {
        String[] args = {"/", "oxhrh", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray35() throws Exception {
        String[] args = {"syiug", "INFO", "/"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[1] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray36() throws Exception {
        String[] args = {"uhauh"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray37() throws Exception {
        String[] args = {"oxhrh", "INFO", "/devServerLogin"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray38() throws Exception {
        String[] args = {"DevServerLoginServlet", "org.eclipse.jetty.LEVEL", "DevServerLoginServlet"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray39() throws Exception {
        String[] args = {"oxhrh", "noimn", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[1] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray40() throws Exception {
        String[] args = {"tyvjm"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray41() throws Exception {
        String[] args = {"INFO", "org.eclipse.jetty.LEVEL", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray42() throws Exception {
        String[] args = {"/devServerLogin", "/devServerLogin", "/"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray43() throws Exception {
        String[] args = {"", "org.eclipse.jetty.LEVEL", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray44() throws Exception {
        String[] args = {"syiug", "", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray45() throws Exception {
        String[] args = {"", "", ""};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray46() throws Exception {
        String[] args = {"org.eclipse.jetty.LEVEL", "/", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray47() throws Exception {
        String[] args = {"DevServerLoginServlet", "org.eclipse.jetty.util.log.class", ""};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray48() throws Exception {
        String[] args = {"oxhrh", "hlcoj", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray49() throws Exception {
        String[] args = {"DevServerLoginServlet", "oxhrh", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray50() throws Exception {
        String[] args = {"org.eclipse.jetty.LEVEL", "syiug", ""};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray51() throws Exception {
        String[] args = {"noimn", "/", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray52() throws Exception {
        String[] args = {"/devServerLogin", "syiug", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray53() throws Exception {
        String[] args = {"noimn", "hlcoj", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray54() throws Exception {
        String[] args = {"hlcoj", "hlcoj", "/"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[1] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray55() throws Exception {
        String[] args = {"DevServerLoginServlet"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray56() throws Exception {
        String[] args = {"/", "org.eclipse.jetty.LEVEL", "/devServerLogin"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray57() throws Exception {
        String[] args = {"org.eclipse.jetty.LEVEL", "oesjb", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray58() throws Exception {
        String[] args = {"", "noimn", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[1] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray59() throws Exception {
        String[] args = {"org.eclipse.jetty.LEVEL"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray60() throws Exception {
        String[] args = {"hlcoj", "oxhrh", "/devServerLogin"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray61() throws Exception {
        String[] args = {"INFO", "DevServerLoginServlet", "/"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray62() throws Exception {
        String[] args = {"", "oesjb", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray63() throws Exception {
        String[] args = {"org.eclipse.jetty.LEVEL", "oxhrh", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray64() throws Exception {
        String[] args = {"/devServerLogin", "INFO", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray65() throws Exception {
        String[] args = {"syiug", "INFO", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray66() throws Exception {
        String[] args = {"INFO", "noimn", "org.eclipse.jetty.util.log.class"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray67() throws Exception {
        String[] args = {"org.eclipse.jetty.LEVEL", "org.eclipse.jetty.util.log.class", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray68() throws Exception {
        String[] args = {"INFO", "syiug", "DevServerLoginServlet"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray69() throws Exception {
        String[] args = {"/", "hlcoj", ""};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray70() throws Exception {
        String[] args = {"/", "", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray71() throws Exception {
        String[] args = {"syiug", "/", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray72() throws Exception {
        String[] args = {"", "oxhrh", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray73() throws Exception {
        String[] args = {"/", "/devServerLogin", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[1] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray74() throws Exception {
        String[] args = {"jkmqh"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray75() throws Exception {
        String[] args = {"DevServerLoginServlet", "INFO", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray76() throws Exception {
        String[] args = {"/", "noimn", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray77() throws Exception {
        String[] args = {"noimn", "syiug", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray78() throws Exception {
        String[] args = {"DevServerLoginServlet", "noimn", "/devServerLogin"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray79() throws Exception {
        String[] args = {"oesjb", "syiug", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray80() throws Exception {
        String[] args = {"noimn", "DevServerLoginServlet", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray81() throws Exception {
        String[] args = {"syiug", "noimn", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray82() throws Exception {
        String[] args = {"DevServerLoginServlet", "syiug", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray83() throws Exception {
        String[] args = {"hlcoj", "hlcoj", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray84() throws Exception {
        String[] args = {"oesjb", "/", ""};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray85() throws Exception {
        String[] args = {"oxhrh", "INFO", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray86() throws Exception {
        String[] args = {"oesjb", "org.eclipse.jetty.LEVEL", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray87() throws Exception {
        String[] args = {"INFO", "INFO", ""};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray88() throws Exception {
        String[] args = {"org.eclipse.jetty.util.log.class", "hlcoj", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray89() throws Exception {
        String[] args = {"oxhrh", "hlcoj", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray90() throws Exception {
        String[] args = {"", "org.eclipse.jetty.LEVEL", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray91() throws Exception {
        String[] args = {"INFO", "", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[1] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray92() throws Exception {
        String[] args = {"/"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray93() throws Exception {
        String[] args = {"INFO", "/devServerLogin", "/devServerLogin"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray94() throws Exception {
        String[] args = {"INFO", "org.eclipse.jetty.util.log.class", "hlcoj"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray95() throws Exception {
        String[] args = {"/devServerLogin", "/devServerLogin", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray96() throws Exception {
        String[] args = {"oesjb", "noimn", "oxhrh"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray97() throws Exception {
        String[] args = {"syiug", "/devServerLogin", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray98() throws Exception {
        String[] args = {"org.eclipse.jetty.LEVEL", "DevServerLoginServlet", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray99() throws Exception {
        String[] args = {"noimn", "syiug", "org.eclipse.jetty.util.log.class"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray100() throws Exception {
        String[] args = {"hlcoj", "INFO", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray101() throws Exception {
        String[] args = {"/devServerLogin", "oesjb", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray102() throws Exception {
        String[] args = {"syiug", "INFO", "org.eclipse.jetty.util.log.class"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray103() throws Exception {
        String[] args = {"org.eclipse.jetty.LEVEL", "noimn", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray104() throws Exception {
        String[] args = {"syiug", "org.eclipse.jetty.util.log.class", "DevServerLoginServlet"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray105() throws Exception {
        String[] args = {"", "INFO", "noimn"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray106() throws Exception {
        String[] args = {"DevServerLoginServlet", "/", "oesjb"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray107() throws Exception {
        String[] args = {"org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.class", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray108() throws Exception {
        String[] args = {"hlcoj", "/", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }

    /**
     * @utbot.classUnderTest {@link Application}
     * @utbot.methodUnderTest {@link Application#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3] -> throw NoClassDefFoundError")
    public void testMainThrowsNCDFEWithNonEmptyObjectArray109() throws Exception {
        String[] args = {"/devServerLogin", "oxhrh", "INFO"};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method main(java.lang.String[])

    @Test
    public void testMain1() throws Exception {
        assertThrows(NoClassDefFoundError.class, () -> Application.main(null));
    }

    @Test
    public void testMain2() throws Exception {
        String[] args = {null, null, null, null, null, null, null, null, null, null};

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));

        String finalArgs0 = args[0];
        String finalArgs1 = args[1];
        String finalArgs2 = args[2];
        String finalArgs3 = args[3];
        String finalArgs4 = args[4];
        String finalArgs5 = args[5];
        String finalArgs6 = args[6];
        String finalArgs7 = args[7];
        String finalArgs8 = args[8];
        String finalArgs9 = args[9];

        assertNull(finalArgs0);

        assertNull(finalArgs1);

        assertNull(finalArgs2);

        assertNull(finalArgs3);

        assertNull(finalArgs4);

        assertNull(finalArgs5);

        assertNull(finalArgs6);

        assertNull(finalArgs7);

        assertNull(finalArgs8);

        assertNull(finalArgs9);
    }

    @Test
    public void testMain3() throws Exception {
        assertThrows(NoClassDefFoundError.class, () -> Application.main(null));
    }

    @Test
    public void testMain4() throws Exception {
        assertThrows(NoClassDefFoundError.class, () -> Application.main(null));
    }

    @Test
    public void testMain5() throws Exception {
        assertThrows(NoClassDefFoundError.class, () -> Application.main(null));
    }

    @Test
    public void testMain6() throws Exception {
        assertThrows(NoClassDefFoundError.class, () -> Application.main(null));
    }

    @Test
    public void testMain7() throws Exception {
        assertThrows(NoClassDefFoundError.class, () -> Application.main(null));
    }

    @Test
    public void testMain8() throws Exception {
        assertThrows(NoClassDefFoundError.class, () -> Application.main(null));
    }

    @Test
    public void testMain9() throws Exception {
        String[] args = new String[12];

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));

        String finalArgs0 = args[0];
        String finalArgs1 = args[1];
        String finalArgs2 = args[2];
        String finalArgs3 = args[3];
        String finalArgs4 = args[4];
        String finalArgs5 = args[5];
        String finalArgs6 = args[6];
        String finalArgs7 = args[7];
        String finalArgs8 = args[8];
        String finalArgs9 = args[9];
        String finalArgs10 = args[10];
        String finalArgs11 = args[11];

        assertNull(finalArgs0);

        assertNull(finalArgs1);

        assertNull(finalArgs2);

        assertNull(finalArgs3);

        assertNull(finalArgs4);

        assertNull(finalArgs5);

        assertNull(finalArgs6);

        assertNull(finalArgs7);

        assertNull(finalArgs8);

        assertNull(finalArgs9);

        assertNull(finalArgs10);

        assertNull(finalArgs11);
    }

    @Test
    public void testMain10() throws Exception {
        assertThrows(NoClassDefFoundError.class, () -> Application.main(null));
    }

    @Test
    public void testMain11() throws Exception {
        assertThrows(NoClassDefFoundError.class, () -> Application.main(null));
    }

    @Test
    public void testMain12() throws Exception {
        String[] args = new String[17];

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));

        String finalArgs0 = args[0];
        String finalArgs1 = args[1];
        String finalArgs2 = args[2];
        String finalArgs3 = args[3];
        String finalArgs4 = args[4];
        String finalArgs5 = args[5];
        String finalArgs6 = args[6];
        String finalArgs7 = args[7];
        String finalArgs8 = args[8];
        String finalArgs9 = args[9];
        String finalArgs10 = args[10];
        String finalArgs11 = args[11];
        String finalArgs12 = args[12];
        String finalArgs13 = args[13];
        String finalArgs14 = args[14];
        String finalArgs15 = args[15];
        String finalArgs16 = args[16];

        assertNull(finalArgs0);

        assertNull(finalArgs1);

        assertNull(finalArgs2);

        assertNull(finalArgs3);

        assertNull(finalArgs4);

        assertNull(finalArgs5);

        assertNull(finalArgs6);

        assertNull(finalArgs7);

        assertNull(finalArgs8);

        assertNull(finalArgs9);

        assertNull(finalArgs10);

        assertNull(finalArgs11);

        assertNull(finalArgs12);

        assertNull(finalArgs13);

        assertNull(finalArgs14);

        assertNull(finalArgs15);

        assertNull(finalArgs16);
    }

    @Test
    public void testMain13() throws Exception {
        String[] args = new String[17];

        assertThrows(NoClassDefFoundError.class, () -> Application.main(args));

        String finalArgs0 = args[0];
        String finalArgs1 = args[1];
        String finalArgs2 = args[2];
        String finalArgs3 = args[3];
        String finalArgs4 = args[4];
        String finalArgs5 = args[5];
        String finalArgs6 = args[6];
        String finalArgs7 = args[7];
        String finalArgs8 = args[8];
        String finalArgs9 = args[9];
        String finalArgs10 = args[10];
        String finalArgs11 = args[11];
        String finalArgs12 = args[12];
        String finalArgs13 = args[13];
        String finalArgs14 = args[14];
        String finalArgs15 = args[15];
        String finalArgs16 = args[16];

        assertNull(finalArgs0);

        assertNull(finalArgs1);

        assertNull(finalArgs2);

        assertNull(finalArgs3);

        assertNull(finalArgs4);

        assertNull(finalArgs5);

        assertNull(finalArgs6);

        assertNull(finalArgs7);

        assertNull(finalArgs8);

        assertNull(finalArgs9);

        assertNull(finalArgs10);

        assertNull(finalArgs11);

        assertNull(finalArgs12);

        assertNull(finalArgs13);

        assertNull(finalArgs14);

        assertNull(finalArgs15);

        assertNull(finalArgs16);
    }
    ///endregion

    ///region Errors report for main

    public void testMain_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion
}
