package teammates.storage.api;

import com.googlecode.objectify.ObjectifyService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextEvent;

import com.googlecode.objectify.ObjectifyFactory;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.setStaticField;

public final class OfyHelperTest {
    ///region Test suites for executable teammates.storage.api.OfyHelper.contextDestroyed

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method contextDestroyed(javax.servlet.ServletContextEvent)

    /**
     * @utbot.classUnderTest {@link OfyHelper}
     * @utbot.methodUnderTest {@link OfyHelper#contextDestroyed(ServletContextEvent)}
     */
    @Test
    @DisplayName("contextDestroyed: ")
    public void testContextDestroyed() {
        OfyHelper ofyHelper = new OfyHelper();

        ofyHelper.contextDestroyed(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.api.OfyHelper.contextInitialized

    ///region OTHER: SECURITY for method contextInitialized(javax.servlet.ServletContextEvent)

    @Test
    @Disabled(value = "Disabled due to sandbox")
    public void testContextInitialized1() throws Exception {
        OfyHelper ofyHelper = new OfyHelper();
        ServletContextAttributeEvent event = ((ServletContextAttributeEvent) createInstance("javax.servlet.ServletContextAttributeEvent"));

        assertThrows(ExceptionInInitializerError.class, () -> ofyHelper.contextInitialized(event));
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method contextInitialized(javax.servlet.ServletContextEvent)

    @Test
    public void testContextInitialized2() {
        OfyHelper ofyHelper = new OfyHelper();

        assertThrows(NoClassDefFoundError.class, () -> ofyHelper.contextInitialized(null));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.api.OfyHelper.registerEntityClasses

    ///region

    @Test
    public void testRegisterEntityClasses1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            setStaticField(objectifyServiceClazz, "factory", null);
            
            /* This test fails because method [teammates.storage.api.OfyHelper.registerEntityClasses] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.register(ObjectifyService.java:44)
                teammates.storage.api.OfyHelper.registerEntityClasses(OfyHelper.java:43) */
            OfyHelper.registerEntityClasses();
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion
}
