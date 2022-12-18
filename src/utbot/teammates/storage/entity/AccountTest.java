package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Map;
import java.time.Instant;

import static java.util.Collections.emptyMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.mockito.Mockito.mock;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;

public final class AccountTest {
    ///region Test suites for executable teammates.storage.entity.Account.getGoogleId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getGoogleId()

    /**
     * @utbot.classUnderTest {@link Account}
     * @utbot.methodUnderTest {@link Account#getGoogleId()}
     */
    @Test
    @DisplayName("getGoogleId: arg_0 = Account(String, String, String, Map)")
    public void testGetGoogleId() {
        Map map = emptyMap();
        Account account = new Account("syiug", "", "", map);

        String actual = account.getGoogleId();

        String expected = "syiug";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Account.setGoogleId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setGoogleId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Account}
     * @utbot.methodUnderTest {@link Account#setGoogleId(String)}
     */
    @Test
    @DisplayName("setGoogleId: googleId = blank string")
    public void testSetGoogleIdWithBlankString() {
        Map map = emptyMap();
        Account account = new Account("", "hlcoj", "", map);

        account.setGoogleId("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Account.getName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getName()

    /**
     * @utbot.classUnderTest {@link Account}
     * @utbot.methodUnderTest {@link Account#getName()}
     */
    @Test
    @DisplayName("getName: arg_0 = Account(String, String, String, Map)")
    public void testGetName() {
        Map map = emptyMap();
        Account account = new Account("syiug", "", "", map);

        String actual = account.getName();

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Account.setName

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setName(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Account}
     * @utbot.methodUnderTest {@link Account#setName(String)}
     */
    @Test
    @DisplayName("setName: name = blank string")
    public void testSetNameWithBlankString() {
        Map map = emptyMap();
        Account account = new Account("", "hlcoj", "", map);

        account.setName("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Account.getEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getEmail()

    /**
     * @utbot.classUnderTest {@link Account}
     * @utbot.methodUnderTest {@link Account#getEmail()}
     */
    @Test
    @DisplayName("getEmail: arg_0 = Account(String, String, String, Map)")
    public void testGetEmail() {
        Map map = emptyMap();
        Account account = new Account("syiug", "", "", map);

        String actual = account.getEmail();

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Account.setEmail

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setEmail(java.lang.String)

    /**
     * @utbot.classUnderTest {@link Account}
     * @utbot.methodUnderTest {@link Account#setEmail(String)}
     */
    @Test
    @DisplayName("setEmail: email = blank string")
    public void testSetEmailWithBlankString() {
        Map map = emptyMap();
        Account account = new Account("", "hlcoj", "", map);

        account.setEmail("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Account.getReadNotifications

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getReadNotifications()

    /**
     * @utbot.classUnderTest {@link Account}
     * @utbot.methodUnderTest {@link Account#getReadNotifications()}
     */
    @Test
    @DisplayName("getReadNotifications: arg_0 = Account(String, String, String, Map)")
    public void testGetReadNotifications() {
        Map map = emptyMap();
        Account account = new Account("syiug", "", "", map);

        Object actual = account.getReadNotifications();

        // java.util.Map is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(map, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Account.setReadNotifications

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method setReadNotifications(java.util.Map)

    /**
     * @utbot.classUnderTest {@link Account}
     * @utbot.methodUnderTest {@link Account#setReadNotifications(Map)}
     */
    @Test
    @DisplayName("setReadNotifications: readNotifications = empty collection")
    public void testSetReadNotifications() {
        Map map = emptyMap();
        Account account = new Account("", "hlcoj", "", map);
        Map readNotifications = emptyMap();

        account.setReadNotifications(readNotifications);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Account.getCreatedAt

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCreatedAt()

    /**
     * @utbot.classUnderTest {@link Account}
     * @utbot.methodUnderTest {@link Account#getCreatedAt()}
     */
    @Test
    @DisplayName("getCreatedAt: arg_0 = Account(String, String, String, Map)")
    public void testGetCreatedAt() throws Exception {
        Map map = emptyMap();
        Account account = new Account("syiug", "", "", map);

        Instant actual = account.getCreatedAt();

        Instant expected = ((Instant) createInstance("java.time.Instant"));
        // java.time.Instant has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.Account.setCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link Account}
     * @utbot.methodUnderTest {@link Account#setCreatedAt(Instant)}
     */
    @Test
    @DisplayName("setCreatedAt: ")
    public void testSetCreatedAt() throws Exception {
        Account account = ((Account) createInstance("teammates.storage.entity.Account"));
        Instant instantMock = mock(Instant.class);
        setField(account, "teammates.storage.entity.Account", "createdAt", instantMock);

        account.setCreatedAt(null);

        Instant finalAccountCreatedAt = ((Instant) getFieldValue(account, "teammates.storage.entity.Account", "createdAt"));

        assertNull(finalAccountCreatedAt);
    }
    ///endregion

    ///endregion
}
