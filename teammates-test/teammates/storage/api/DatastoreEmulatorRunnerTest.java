package teammates.storage.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public final class DatastoreEmulatorRunnerTest {
    ///region Test suites for executable teammates.storage.api.DatastoreEmulatorRunner.main

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method main(java.lang.String[])

    /**
     * @utbot.classUnderTest {@link DatastoreEmulatorRunner}
     * @utbot.methodUnderTest {@link DatastoreEmulatorRunner#main(String[])}
     */
    @Test
    @DisplayName("main: arg_0 = String[3]")
    @Disabled(value = "Disabled due to sandbox")
    public void testMainWithNonEmptyObjectArray() throws IOException, InterruptedException {
        String[] args = {"", "hlcoj", "datastore-dev/datastore"};

        assertThrows(ExceptionInInitializerError.class, () -> DatastoreEmulatorRunner.main(args));
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method main(java.lang.String[])

    @Test
    public void testMain1() throws IOException, InterruptedException {
        assertThrows(NoClassDefFoundError.class, () -> DatastoreEmulatorRunner.main(null));
    }
    ///endregion

    ///endregion
}
