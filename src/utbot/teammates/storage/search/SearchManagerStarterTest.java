package teammates.storage.search;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import javax.servlet.ServletContextEvent;

import static org.junit.jupiter.api.Assertions.assertThrows;

public final class SearchManagerStarterTest {
    ///region Test suites for executable teammates.storage.search.SearchManagerStarter.contextInitialized

    ///region OTHER: SECURITY for method contextInitialized(javax.servlet.ServletContextEvent)

    @Test
    @Disabled(value = "Disabled due to sandbox")
    public void testContextInitialized1() {
        SearchManagerStarter searchManagerStarter = new SearchManagerStarter();

        assertThrows(ExceptionInInitializerError.class, () -> searchManagerStarter.contextInitialized(null));
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method contextInitialized(javax.servlet.ServletContextEvent)

    @Test
    public void testContextInitialized2() {
        SearchManagerStarter searchManagerStarter = new SearchManagerStarter();

        assertThrows(NoClassDefFoundError.class, () -> searchManagerStarter.contextInitialized(null));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.search.SearchManagerStarter.contextDestroyed

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contextDestroyed(javax.servlet.ServletContextEvent)

    /**
     * @utbot.classUnderTest {@link SearchManagerStarter}
     * @utbot.methodUnderTest {@link SearchManagerStarter#contextDestroyed(ServletContextEvent)}
     */
    @Test
    @DisplayName("contextDestroyed: ")
    public void testContextDestroyed() {
        SearchManagerStarter searchManagerStarter = new SearchManagerStarter();

        searchManagerStarter.contextDestroyed(null);
    }
    ///endregion

    ///endregion
}
