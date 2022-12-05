package teammates.logic.core;

import com.googlecode.objectify.ObjectifyService;
import org.junit.jupiter.api.Test;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.storage.api.AccountRequestsDb;
import teammates.common.datatransfer.attributes.AccountRequestAttributes.UpdateOptions;
import teammates.common.datatransfer.attributes.AccountRequestAttributes;
import org.junit.jupiter.api.DisplayName;
import teammates.storage.search.AccountRequestSearchManager;
import org.apache.solr.client.solrj.impl.DelegationTokenHttpSolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;

import java.util.ArrayList;

import com.googlecode.objectify.ObjectifyFactory;
import teammates.storage.search.SearchManagerFactory;

import java.time.Instant;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class AccountRequestsLogicTest {
    ///region Test suites for executable teammates.logic.core.AccountRequestsLogic.updateAccountRequest

    ///region

    @Test
    public void testUpdateAccountRequest1() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", null);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.updateAccountRequest] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountRequestsLogic.updateAccountRequest(AccountRequestsLogic.java:43) */
        accountRequestsLogic.updateAccountRequest(null);
    }

    @Test
    public void testUpdateAccountRequest2() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.AccountRequestAttributes$UpdateOptions"));
        String string = "";
        setField(updateOptions, "teammates.common.datatransfer.attributes.AccountRequestAttributes$UpdateOptions", "email", string);
        setField(updateOptions, "teammates.common.datatransfer.attributes.AccountRequestAttributes$UpdateOptions", "institute", string);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.updateAccountRequest] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.AccountRequestsDb.load(AccountRequestsDb.java:150)
            teammates.storage.api.AccountRequestsDb.getAccountRequestEntity(AccountRequestsDb.java:127)
            teammates.storage.api.AccountRequestsDb.getAccountRequest(AccountRequestsDb.java:73)
            teammates.storage.api.AccountRequestsDb.updateAccountRequest(AccountRequestsDb.java:87)
            teammates.logic.core.AccountRequestsLogic.updateAccountRequest(AccountRequestsLogic.java:43) */
        accountRequestsLogic.updateAccountRequest(updateOptions);
    }

    @Test
    public void testUpdateAccountRequest3() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.updateAccountRequest] produces [java.lang.AssertionError]
            teammates.storage.api.AccountRequestsDb.updateAccountRequest(AccountRequestsDb.java:85)
            teammates.logic.core.AccountRequestsLogic.updateAccountRequest(AccountRequestsLogic.java:43) */
        accountRequestsLogic.updateAccountRequest(null);
    }

    @Test
    public void testUpdateAccountRequest4() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.AccountRequestAttributes$UpdateOptions"));
        String string = "";
        setField(updateOptions, "teammates.common.datatransfer.attributes.AccountRequestAttributes$UpdateOptions", "email", string);
        setField(updateOptions, "teammates.common.datatransfer.attributes.AccountRequestAttributes$UpdateOptions", "institute", null);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.updateAccountRequest] produces [java.lang.AssertionError]
            teammates.storage.api.AccountRequestsDb.getAccountRequest(AccountRequestsDb.java:71)
            teammates.storage.api.AccountRequestsDb.updateAccountRequest(AccountRequestsDb.java:87)
            teammates.logic.core.AccountRequestsLogic.updateAccountRequest(AccountRequestsLogic.java:43) */
        accountRequestsLogic.updateAccountRequest(updateOptions);
    }

    @Test
    public void testUpdateAccountRequest5() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.AccountRequestAttributes$UpdateOptions"));
        setField(updateOptions, "teammates.common.datatransfer.attributes.AccountRequestAttributes$UpdateOptions", "email", null);
        setField(updateOptions, "teammates.common.datatransfer.attributes.AccountRequestAttributes$UpdateOptions", "institute", null);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.updateAccountRequest] produces [java.lang.AssertionError]
            teammates.storage.api.AccountRequestsDb.getAccountRequest(AccountRequestsDb.java:70)
            teammates.storage.api.AccountRequestsDb.updateAccountRequest(AccountRequestsDb.java:87)
            teammates.logic.core.AccountRequestsLogic.updateAccountRequest(AccountRequestsLogic.java:43) */
        accountRequestsLogic.updateAccountRequest(updateOptions);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountRequestsLogic.inst

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inst()

    /**
     * @utbot.classUnderTest {@link AccountRequestsLogic}
     * @utbot.methodUnderTest {@link AccountRequestsLogic#inst()}
     * @utbot.returnsFrom {@code return instance;}
     */
    @Test
    @DisplayName("inst: -> return instance")
    public void testInst_ReturnInstance() throws Exception {
        Class accountRequestsDbClazz = Class.forName("teammates.storage.api.AccountRequestsDb");
        AccountRequestsDb prevInstance = ((AccountRequestsDb) getStaticFieldValue(accountRequestsDbClazz, "instance"));
        Class accountRequestsLogicClazz = Class.forName("teammates.logic.core.AccountRequestsLogic");
        AccountRequestsLogic prevInstance1 = ((AccountRequestsLogic) getStaticFieldValue(accountRequestsLogicClazz, "instance"));
        try {
            AccountRequestsDb instance = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
            setStaticField(accountRequestsDbClazz, "instance", instance);
            AccountRequestsLogic instance1 = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
            setField(instance1, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", instance);
            setStaticField(accountRequestsLogicClazz, "instance", instance1);

            AccountRequestsLogic actual = AccountRequestsLogic.inst();

            AccountRequestsDb instance1AccountRequestsDb = ((AccountRequestsDb) getFieldValue(instance1, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb"));
            AccountRequestsDb actualAccountRequestsDb = ((AccountRequestsDb) getFieldValue(actual, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb"));

        } finally {
            setStaticField(AccountRequestsDb.class, "instance", prevInstance);
            setStaticField(AccountRequestsLogic.class, "instance", prevInstance1);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountRequestsLogic.initLogicDependencies

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initLogicDependencies()

    /**
     * @utbot.classUnderTest {@link AccountRequestsLogic}
     * @utbot.methodUnderTest {@link AccountRequestsLogic#initLogicDependencies()}
     */
    @Test
    @DisplayName("initLogicDependencies: ")
    public void testInitLogicDependencies() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));

        accountRequestsLogic.initLogicDependencies();
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountRequestsLogic.createAccountRequest

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createAccountRequest(teammates.common.datatransfer.attributes.AccountRequestAttributes)

    /**
     * @utbot.classUnderTest {@link AccountRequestsLogic}
     * @utbot.methodUnderTest {@link AccountRequestsLogic#createAccountRequest(AccountRequestAttributes)}
     * @utbot.invokes {@link AccountRequestsDb#createEntity(EntityAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: return accountRequestsDb.createEntity(accountRequest);
     */
    @Test
    @DisplayName("createAccountRequest: return accountRequestsDb.createEntity(accountRequest) : True -> ThrowNullPointerException")
    public void testCreateAccountRequest_AccountRequestsDbCreateEntity() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", null);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.createAccountRequest] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountRequestsLogic.createAccountRequest(AccountRequestsLogic.java:55) */
        accountRequestsLogic.createAccountRequest(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createAccountRequest(teammates.common.datatransfer.attributes.AccountRequestAttributes)

    @Test
    public void testCreateAccountRequest1() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.createAccountRequest] produces [java.lang.AssertionError]
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:62)
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:57)
            teammates.storage.api.AccountRequestsDb.createEntity(AccountRequestsDb.java:28)
            teammates.logic.core.AccountRequestsLogic.createAccountRequest(AccountRequestsLogic.java:55) */
        accountRequestsLogic.createAccountRequest(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountRequestsLogic.deleteAccountRequest

    ///region

    @Test
    public void testDeleteAccountRequest1() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.deleteAccountRequest] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountRequestsLogic.deleteAccountRequest(AccountRequestsLogic.java:64) */
        accountRequestsLogic.deleteAccountRequest("\n\t\r", "   ");
    }

    @Test
    public void testDeleteAccountRequest2() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        String email = "";
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.deleteAccountRequest] produces [java.lang.AssertionError]
            teammates.storage.api.AccountRequestsDb.deleteAccountRequest(AccountRequestsDb.java:135)
            teammates.logic.core.AccountRequestsLogic.deleteAccountRequest(AccountRequestsLogic.java:64) */
        accountRequestsLogic.deleteAccountRequest(email, null);
    }

    @Test
    public void testDeleteAccountRequest3() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.deleteAccountRequest] produces [java.lang.AssertionError]
            teammates.storage.api.AccountRequestsDb.deleteAccountRequest(AccountRequestsDb.java:134)
            teammates.logic.core.AccountRequestsLogic.deleteAccountRequest(AccountRequestsLogic.java:64) */
        accountRequestsLogic.deleteAccountRequest(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountRequestsLogic.getAccountRequest

    ///region

    @Test
    public void testGetAccountRequest1() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.getAccountRequest] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountRequestsLogic.getAccountRequest(AccountRequestsLogic.java:73) */
        accountRequestsLogic.getAccountRequest("\n\t\r", "   ");
    }

    @Test
    public void testGetAccountRequest2() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        String email = "";
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.getAccountRequest] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.AccountRequestsDb.load(AccountRequestsDb.java:150)
            teammates.storage.api.AccountRequestsDb.getAccountRequestEntity(AccountRequestsDb.java:127)
            teammates.storage.api.AccountRequestsDb.getAccountRequest(AccountRequestsDb.java:73)
            teammates.logic.core.AccountRequestsLogic.getAccountRequest(AccountRequestsLogic.java:73) */
        accountRequestsLogic.getAccountRequest(email, email);
    }

    @Test
    public void testGetAccountRequest3() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        String email = "";
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.getAccountRequest] produces [java.lang.AssertionError]
            teammates.storage.api.AccountRequestsDb.getAccountRequest(AccountRequestsDb.java:71)
            teammates.logic.core.AccountRequestsLogic.getAccountRequest(AccountRequestsLogic.java:73) */
        accountRequestsLogic.getAccountRequest(email, null);
    }

    @Test
    public void testGetAccountRequest4() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.getAccountRequest] produces [java.lang.AssertionError]
            teammates.storage.api.AccountRequestsDb.getAccountRequest(AccountRequestsDb.java:70)
            teammates.logic.core.AccountRequestsLogic.getAccountRequest(AccountRequestsLogic.java:73) */
        accountRequestsLogic.getAccountRequest(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountRequestsLogic.getAccountRequestForRegistrationKey

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getAccountRequestForRegistrationKey(java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountRequestsLogic}
     * @utbot.methodUnderTest {@link AccountRequestsLogic#getAccountRequestForRegistrationKey(String)}
     * @utbot.invokes {@link AccountRequestsDb#getAccountRequestForRegistrationKey(String)}
     * @utbot.throwsException {@link AssertionError} in: return accountRequestsDb.getAccountRequestForRegistrationKey(registrationKey);
     */
    @Test
    @DisplayName("getAccountRequestForRegistrationKey: return accountRequestsDb.getAccountRequestForRegistrationKey(registrationKey) : True -> ThrowAssertionError")
    public void testGetAccountRequestForRegistrationKey_AccountRequestsDbGetAccountRequestForRegistrationKey() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.getAccountRequestForRegistrationKey] produces [java.lang.AssertionError]
            teammates.storage.api.AccountRequestsDb.getAccountRequestForRegistrationKey(AccountRequestsDb.java:110)
            teammates.logic.core.AccountRequestsLogic.getAccountRequestForRegistrationKey(AccountRequestsLogic.java:82) */
        accountRequestsLogic.getAccountRequestForRegistrationKey(null);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getAccountRequestForRegistrationKey(java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountRequestsLogic}
     * @utbot.methodUnderTest {@link AccountRequestsLogic#getAccountRequestForRegistrationKey(String)}
     */
    @Test
    @DisplayName("getAccountRequestForRegistrationKey: registrationKey = blank string -> throw NullPointerException")
    public void testGetAccountRequestForRegistrationKeyThrowsNPEWithBlankString() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.getAccountRequestForRegistrationKey] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountRequestsLogic.getAccountRequestForRegistrationKey(AccountRequestsLogic.java:82) */
        accountRequestsLogic.getAccountRequestForRegistrationKey("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountRequestsLogic.putDocument

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putDocument(teammates.common.datatransfer.attributes.AccountRequestAttributes)

    /**
     * @utbot.classUnderTest {@link AccountRequestsLogic}
     * @utbot.methodUnderTest {@link AccountRequestsLogic#putDocument(AccountRequestAttributes)}
     * @utbot.invokes {@link AccountRequestsDb#putDocument(AccountRequestAttributes)}
     */
    @Test
    @DisplayName("putDocument: -> AccountRequestsDbPutDocument")
    public void testPutDocument_AccountRequestsDbPutDocument() throws Exception {
        Class searchManagerFactoryClazz = Class.forName("teammates.storage.search.SearchManagerFactory");
        AccountRequestSearchManager prevAccountRequestInstance = ((AccountRequestSearchManager) getStaticFieldValue(searchManagerFactoryClazz, "accountRequestInstance"));
        try {
            AccountRequestSearchManager accountRequestInstance = ((AccountRequestSearchManager) createInstance("teammates.storage.search.AccountRequestSearchManager"));
            DelegationTokenHttpSolrClient delegationTokenHttpSolrClient = ((DelegationTokenHttpSolrClient) createInstance("org.apache.solr.client.solrj.impl.DelegationTokenHttpSolrClient"));
            setField(accountRequestInstance, "teammates.storage.search.SearchManager", "client", delegationTokenHttpSolrClient);
            setStaticField(searchManagerFactoryClazz, "accountRequestInstance", accountRequestInstance);
            AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
            AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
            setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);

            accountRequestsLogic.putDocument(null);
        } finally {
            setStaticField(SearchManagerFactory.class, "accountRequestInstance", prevAccountRequestInstance);
        }
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putDocument(teammates.common.datatransfer.attributes.AccountRequestAttributes)

    /**
     * @utbot.classUnderTest {@link AccountRequestsLogic}
     * @utbot.methodUnderTest {@link AccountRequestsLogic#putDocument(AccountRequestAttributes)}
     * @utbot.invokes {@link AccountRequestsDb#putDocument(AccountRequestAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: accountRequestsDb.putDocument(accountRequest);
     */
    @Test
    @DisplayName("putDocument: accountRequestsDb.putDocument(accountRequest) : True -> ThrowNullPointerException")
    public void testPutDocument_AccountRequestsDbPutDocument_1() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", null);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.putDocument] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountRequestsLogic.putDocument(AccountRequestsLogic.java:91) */
        accountRequestsLogic.putDocument(null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method putDocument(teammates.common.datatransfer.attributes.AccountRequestAttributes)

    @Test
    public void testPutDocument1() throws Exception {
        Class searchManagerFactoryClazz = Class.forName("teammates.storage.search.SearchManagerFactory");
        AccountRequestSearchManager prevAccountRequestInstance = ((AccountRequestSearchManager) getStaticFieldValue(searchManagerFactoryClazz, "accountRequestInstance"));
        try {
            AccountRequestSearchManager accountRequestInstance = ((AccountRequestSearchManager) createInstance("teammates.storage.search.AccountRequestSearchManager"));
            HttpSolrClient httpSolrClient = ((HttpSolrClient) createInstance("org.apache.solr.client.solrj.impl.HttpSolrClient"));
            setField(accountRequestInstance, "teammates.storage.search.SearchManager", "client", httpSolrClient);
            setStaticField(searchManagerFactoryClazz, "accountRequestInstance", accountRequestInstance);
            AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
            AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
            setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
            AccountRequestAttributes accountRequest = ((AccountRequestAttributes) createInstance("teammates.common.datatransfer.attributes.AccountRequestAttributes"));
            
            /* This test fails because method [teammates.logic.core.AccountRequestsLogic.putDocument] produces [java.lang.NullPointerException]
                org.apache.solr.client.solrj.impl.HttpSolrClient.createMethod(HttpSolrClient.java:350)
                org.apache.solr.client.solrj.impl.HttpSolrClient.request(HttpSolrClient.java:257)
                org.apache.solr.client.solrj.impl.HttpSolrClient.request(HttpSolrClient.java:248)
                org.apache.solr.client.solrj.SolrRequest.process(SolrRequest.java:214)
                org.apache.solr.client.solrj.SolrClient.add(SolrClient.java:106)
                org.apache.solr.client.solrj.SolrClient.add(SolrClient.java:71)
                teammates.storage.search.SearchManager.putDocument(SearchManager.java:123)
                teammates.storage.search.AccountRequestSearchManager.putDocument(AccountRequestSearchManager.java:17)
                teammates.storage.api.AccountRequestsDb.putDocument(AccountRequestsDb.java:48)
                teammates.logic.core.AccountRequestsLogic.putDocument(AccountRequestsLogic.java:91) */
            accountRequestsLogic.putDocument(accountRequest);
        } finally {
            setStaticField(SearchManagerFactory.class, "accountRequestInstance", prevAccountRequestInstance);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountRequestsLogic.searchAccountRequestsInWholeSystem

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method searchAccountRequestsInWholeSystem(java.lang.String)

    /**
     * @utbot.classUnderTest {@link AccountRequestsLogic}
     * @utbot.methodUnderTest {@link AccountRequestsLogic#searchAccountRequestsInWholeSystem(String)}
     */
    @Test
    @DisplayName("searchAccountRequestsInWholeSystem: queryString = blank string -> throw NullPointerException")
    public void testSearchAccountRequestsInWholeSystemThrowsNPEWithBlankString() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.searchAccountRequestsInWholeSystem] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountRequestsLogic.searchAccountRequestsInWholeSystem(AccountRequestsLogic.java:101) */
        accountRequestsLogic.searchAccountRequestsInWholeSystem("   ");
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method searchAccountRequestsInWholeSystem(java.lang.String)

    @Test
    public void testSearchAccountRequestsInWholeSystem1() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        String queryString = "";

        ArrayList actual = ((ArrayList) accountRequestsLogic.searchAccountRequestsInWholeSystem(queryString));

        ArrayList expected = new ArrayList();
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method searchAccountRequestsInWholeSystem(java.lang.String)

    @Test
    public void testSearchAccountRequestsInWholeSystem2() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
        String queryString = "!";
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.searchAccountRequestsInWholeSystem] produces [java.lang.NullPointerException]
            teammates.storage.api.AccountRequestsDb.searchAccountRequestsInWholeSystem(AccountRequestsDb.java:63)
            teammates.logic.core.AccountRequestsLogic.searchAccountRequestsInWholeSystem(AccountRequestsLogic.java:101) */
        accountRequestsLogic.searchAccountRequestsInWholeSystem(queryString);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.AccountRequestsLogic.getNumAccountRequestsByTimeRange

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumAccountRequestsByTimeRange(java.time.Instant, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link AccountRequestsLogic}
     * @utbot.methodUnderTest {@link AccountRequestsLogic#getNumAccountRequestsByTimeRange(Instant, Instant)}
     * @utbot.invokes {@link AccountRequestsDb#getNumAccountRequestsByTimeRange(Instant, Instant)}
     * @utbot.throwsException {@link NullPointerException} in: return accountRequestsDb.getNumAccountRequestsByTimeRange(startTime, endTime);
     */
    @Test
    @DisplayName("getNumAccountRequestsByTimeRange: return accountRequestsDb.getNumAccountRequestsByTimeRange(startTime, endTime) : True -> ThrowNullPointerException")
    public void testGetNumAccountRequestsByTimeRange_AccountRequestsDbGetNumAccountRequestsByTimeRange() throws Exception {
        AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
        setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", null);
        
        /* This test fails because method [teammates.logic.core.AccountRequestsLogic.getNumAccountRequestsByTimeRange] produces [java.lang.NullPointerException]
            teammates.logic.core.AccountRequestsLogic.getNumAccountRequestsByTimeRange(AccountRequestsLogic.java:108) */
        accountRequestsLogic.getNumAccountRequestsByTimeRange(null, null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getNumAccountRequestsByTimeRange(java.time.Instant, java.time.Instant)

    @Test
    public void testGetNumAccountRequestsByTimeRange1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            ThreadLocal threadLocal = ((ThreadLocal) createInstance("java.lang.ThreadLocal"));
            setField(factory, "com.googlecode.objectify.ObjectifyFactory", "stacks", threadLocal);
            setStaticField(objectifyServiceClazz, "factory", factory);
            AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
            AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
            setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
            Instant startTime = ((Instant) createInstance("java.time.Instant"));
            
            /* This test fails because method [teammates.logic.core.AccountRequestsLogic.getNumAccountRequestsByTimeRange] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:409)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.AccountRequestsDb.load(AccountRequestsDb.java:150)
                teammates.storage.api.AccountRequestsDb.getNumAccountRequestsByTimeRange(AccountRequestsDb.java:171)
                teammates.logic.core.AccountRequestsLogic.getNumAccountRequestsByTimeRange(AccountRequestsLogic.java:108) */
            accountRequestsLogic.getNumAccountRequestsByTimeRange(startTime, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testGetNumAccountRequestsByTimeRange2() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            setStaticField(objectifyServiceClazz, "factory", null);
            AccountRequestsLogic accountRequestsLogic = ((AccountRequestsLogic) createInstance("teammates.logic.core.AccountRequestsLogic"));
            AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
            setField(accountRequestsLogic, "teammates.logic.core.AccountRequestsLogic", "accountRequestsDb", accountRequestsDb);
            
            /* This test fails because method [teammates.logic.core.AccountRequestsLogic.getNumAccountRequestsByTimeRange] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.AccountRequestsDb.load(AccountRequestsDb.java:150)
                teammates.storage.api.AccountRequestsDb.getNumAccountRequestsByTimeRange(AccountRequestsDb.java:171)
                teammates.logic.core.AccountRequestsLogic.getNumAccountRequestsByTimeRange(AccountRequestsLogic.java:108) */
            accountRequestsLogic.getNumAccountRequestsByTimeRange(null, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion
}
