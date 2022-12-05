package teammates.storage.entity;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Instant;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;

public final class AccountRequestTest {
    ///region Test suites for executable teammates.storage.entity.AccountRequest.getId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getId()

    /**
     * @utbot.classUnderTest {@link AccountRequest}
     * @utbot.methodUnderTest {@link AccountRequest#getId()}
     * @utbot.returnsFrom {@code return id;}
     */
    @Test
    @DisplayName("getId: -> return id")
    public void testGetId_ReturnId() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        String string = "";
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "id", string);

        String actual = accountRequest.getId();

        assertEquals(string, actual);
    }
    ///endregion

    ///region Errors report for getId

    public void testGetId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 17 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.setId

    ///region

    @Test
    public void testSetId1() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        
        /* This test fails because method [teammates.storage.entity.AccountRequest.setId] produces [java.lang.NullPointerException]
            teammates.storage.entity.AccountRequest.setId(AccountRequest.java:57) */
        accountRequest.setId(null);
    }

    @Test
    public void testSetId2() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        String string = "";
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "id", string);
        String id = "!";

        accountRequest.setId(id);
    }
    ///endregion

    ///region Errors report for setId

    public void testSetId_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.getRegistrationKey

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRegistrationKey()

    /**
     * @utbot.classUnderTest {@link AccountRequest}
     * @utbot.methodUnderTest {@link AccountRequest#getRegistrationKey()}
     * @utbot.returnsFrom {@code return registrationKey;}
     */
    @Test
    @DisplayName("getRegistrationKey: -> return registrationKey")
    public void testGetRegistrationKey_ReturnRegistrationKey() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "registrationKey", null);

        String actual = accountRequest.getRegistrationKey();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getRegistrationKey

    public void testGetRegistrationKey_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 21 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.setRegistrationKey

    ///region

    @Test
    public void testSetRegistrationKey1() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        
        /* This test fails because method [teammates.storage.entity.AccountRequest.setRegistrationKey] produces [java.lang.NullPointerException]
            teammates.storage.entity.AccountRequest.setRegistrationKey(AccountRequest.java:65) */
        accountRequest.setRegistrationKey(null);
    }

    @Test
    public void testSetRegistrationKey2() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "registrationKey", null);
        String registrationKey = "!";

        accountRequest.setRegistrationKey(registrationKey);
    }
    ///endregion

    ///region Errors report for setRegistrationKey

    public void testSetRegistrationKey_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.getName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()

    /**
     * @utbot.classUnderTest {@link AccountRequest}
     * @utbot.methodUnderTest {@link AccountRequest#getName()}
     * @utbot.returnsFrom {@code return name;}
     */
    @Test
    @DisplayName("getName: -> return name")
    public void testGetName_ReturnName() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "name", null);

        String actual = accountRequest.getName();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getName

    public void testGetName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 17 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.setName

    ///region

    @Test
    public void testSetName1() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        
        /* This test fails because method [teammates.storage.entity.AccountRequest.setName] produces [java.lang.NullPointerException]
            teammates.storage.entity.AccountRequest.setName(AccountRequest.java:73) */
        accountRequest.setName(null);
    }

    @Test
    public void testSetName2() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "name", null);
        String name = "!";

        accountRequest.setName(name);
    }
    ///endregion

    ///region Errors report for setName

    public void testSetName_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.getEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEmail()

    /**
     * @utbot.classUnderTest {@link AccountRequest}
     * @utbot.methodUnderTest {@link AccountRequest#getEmail()}
     * @utbot.returnsFrom {@code return email;}
     */
    @Test
    @DisplayName("getEmail: -> return email")
    public void testGetEmail_ReturnEmail() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "email", null);

        String actual = accountRequest.getEmail();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getEmail

    public void testGetEmail_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.setEmail

    ///region

    @Test
    public void testSetEmail1() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        
        /* This test fails because method [teammates.storage.entity.AccountRequest.setEmail] produces [java.lang.NullPointerException]
            teammates.storage.entity.AccountRequest.setEmail(AccountRequest.java:81) */
        accountRequest.setEmail(null);
    }

    @Test
    public void testSetEmail2() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "email", null);
        String email = "!";

        accountRequest.setEmail(email);
    }
    ///endregion

    ///region Errors report for setEmail

    public void testSetEmail_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.getInstitute

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInstitute()

    /**
     * @utbot.classUnderTest {@link AccountRequest}
     * @utbot.methodUnderTest {@link AccountRequest#getInstitute()}
     * @utbot.returnsFrom {@code return institute;}
     */
    @Test
    @DisplayName("getInstitute: -> return institute")
    public void testGetInstitute_ReturnInstitute() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "institute", null);

        String actual = accountRequest.getInstitute();

        assertNull(actual);
    }
    ///endregion

    ///region Errors report for getInstitute

    public void testGetInstitute_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.setInstitute

    ///region

    @Test
    public void testSetInstitute1() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        
        /* This test fails because method [teammates.storage.entity.AccountRequest.setInstitute] produces [java.lang.NullPointerException]
            teammates.storage.entity.AccountRequest.setInstitute(AccountRequest.java:89) */
        accountRequest.setInstitute(null);
    }

    @Test
    public void testSetInstitute2() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "institute", null);
        String institute = "!";

        accountRequest.setInstitute(institute);
    }
    ///endregion

    ///region Errors report for setInstitute

    public void testSetInstitute_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.getRegisteredAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRegisteredAt()

    /**
     * @utbot.classUnderTest {@link AccountRequest}
     * @utbot.methodUnderTest {@link AccountRequest#getRegisteredAt()}
     * @utbot.returnsFrom {@code return registeredAt;}
     */
    @Test
    @DisplayName("getRegisteredAt: -> return registeredAt")
    public void testGetRegisteredAt_ReturnRegisteredAt() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        Instant instantMock = mock(Instant.class);
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "registeredAt", instantMock);

        Instant actual = accountRequest.getRegisteredAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///region Errors report for getRegisteredAt

    public void testGetRegisteredAt_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.setRegisteredAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRegisteredAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link AccountRequest}
     * @utbot.methodUnderTest {@link AccountRequest#setRegisteredAt(Instant)}
     */
    @Test
    @DisplayName("setRegisteredAt: ")
    public void testSetRegisteredAt() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        Instant instantMock = mock(Instant.class);
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "registeredAt", instantMock);

        accountRequest.setRegisteredAt(null);

        Instant finalAccountRequestRegisteredAt = ((Instant) getFieldValue(accountRequest, "teammates.storage.entity.AccountRequest", "registeredAt"));

        assertNull(finalAccountRequestRegisteredAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.getCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCreatedAt()

    /**
     * @utbot.classUnderTest {@link AccountRequest}
     * @utbot.methodUnderTest {@link AccountRequest#getCreatedAt()}
     * @utbot.returnsFrom {@code return createdAt;}
     */
    @Test
    @DisplayName("getCreatedAt: -> return createdAt")
    public void testGetCreatedAt_ReturnCreatedAt() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        Instant instantMock = mock(Instant.class);
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "createdAt", instantMock);

        Instant actual = accountRequest.getCreatedAt();

        // java.time.Instant has overridden equals method
        assertEquals(instantMock, actual);
    }
    ///endregion

    ///region Errors report for getCreatedAt

    public void testGetCreatedAt_errors() {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        // Default concrete execution failed

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.setCreatedAt

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCreatedAt(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link AccountRequest}
     * @utbot.methodUnderTest {@link AccountRequest#setCreatedAt(Instant)}
     */
    @Test
    @DisplayName("setCreatedAt: ")
    public void testSetCreatedAt() throws Exception {
        AccountRequest accountRequest = ((AccountRequest) createInstance("teammates.storage.entity.AccountRequest"));
        Instant instantMock = mock(Instant.class);
        setField(accountRequest, "teammates.storage.entity.AccountRequest", "createdAt", instantMock);

        accountRequest.setCreatedAt(null);

        Instant finalAccountRequestCreatedAt = ((Instant) getFieldValue(accountRequest, "teammates.storage.entity.AccountRequest", "createdAt"));

        assertNull(finalAccountRequestCreatedAt);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.storage.entity.AccountRequest.generateId

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method generateId(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountRequest}
     * @utbot.methodUnderTest {@link AccountRequest#generateId(String, String)}
     */
    @Test
    @DisplayName("generateId: arg_0 has special characters, institute = blank string")
    public void testGenerateIdWithBlankStrings() {
        String actual = AccountRequest.generateId("\n\t\r", "   ");

        String expected = "\n\t\r%   ";
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion
}
