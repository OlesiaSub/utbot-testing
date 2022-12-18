package teammates.logic.core;

import com.googlecode.objectify.ObjectifyService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.common.datatransfer.attributes.UsageStatisticsAttributes;
import teammates.storage.api.UsageStatisticsDb;
import teammates.storage.api.AccountRequestsDb;
import com.googlecode.objectify.ObjectifyFactory;

import java.time.Instant;

import teammates.storage.api.FeedbackResponsesDb;

import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;

public final class UsageStatisticsLogicTest {
    ///region Test suites for executable teammates.logic.core.UsageStatisticsLogic.inst

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inst()

    /**
     * @utbot.classUnderTest {@link UsageStatisticsLogic}
     * @utbot.methodUnderTest {@link UsageStatisticsLogic#inst()}
     * @utbot.returnsFrom {@code return instance;}
     */
    @Test
    @DisplayName("inst: -> return instance")
    public void testInst_ReturnInstance() throws Exception {
        Class usageStatisticsDbClazz = Class.forName("teammates.storage.api.UsageStatisticsDb");
        UsageStatisticsDb prevInstance = ((UsageStatisticsDb) getStaticFieldValue(usageStatisticsDbClazz, "instance"));
        Class usageStatisticsLogicClazz = Class.forName("teammates.logic.core.UsageStatisticsLogic");
        UsageStatisticsLogic prevInstance1 = ((UsageStatisticsLogic) getStaticFieldValue(usageStatisticsLogicClazz, "instance"));
        try {
            UsageStatisticsDb instance = ((UsageStatisticsDb) createInstance("teammates.storage.api.UsageStatisticsDb"));
            setStaticField(usageStatisticsDbClazz, "instance", instance);
            UsageStatisticsLogic instance1 = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
            setField(instance1, "teammates.logic.core.UsageStatisticsLogic", "usageStatisticsDb", instance);
            setStaticField(usageStatisticsLogicClazz, "instance", instance1);

            UsageStatisticsLogic actual = UsageStatisticsLogic.inst();

            UsageStatisticsDb instance1UsageStatisticsDb = ((UsageStatisticsDb) getFieldValue(instance1, "teammates.logic.core.UsageStatisticsLogic", "usageStatisticsDb"));
            UsageStatisticsDb actualUsageStatisticsDb = ((UsageStatisticsDb) getFieldValue(actual, "teammates.logic.core.UsageStatisticsLogic", "usageStatisticsDb"));

            AccountRequestsLogic actualAccountRequestsLogic = ((AccountRequestsLogic) getFieldValue(actual, "teammates.logic.core.UsageStatisticsLogic", "accountRequestsLogic"));
            assertNull(actualAccountRequestsLogic);

            CoursesLogic actualCoursesLogic = ((CoursesLogic) getFieldValue(actual, "teammates.logic.core.UsageStatisticsLogic", "coursesLogic"));
            assertNull(actualCoursesLogic);

            FeedbackResponsesLogic actualFeedbackResponsesLogic = ((FeedbackResponsesLogic) getFieldValue(actual, "teammates.logic.core.UsageStatisticsLogic", "feedbackResponsesLogic"));
            assertNull(actualFeedbackResponsesLogic);

            InstructorsLogic actualInstructorsLogic = ((InstructorsLogic) getFieldValue(actual, "teammates.logic.core.UsageStatisticsLogic", "instructorsLogic"));
            assertNull(actualInstructorsLogic);

            StudentsLogic actualStudentsLogic = ((StudentsLogic) getFieldValue(actual, "teammates.logic.core.UsageStatisticsLogic", "studentsLogic"));
            assertNull(actualStudentsLogic);

        } finally {
            setStaticField(UsageStatisticsDb.class, "instance", prevInstance);
            setStaticField(UsageStatisticsLogic.class, "instance", prevInstance1);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.UsageStatisticsLogic.initLogicDependencies

    ///region OTHER: SECURITY for method initLogicDependencies()

    @Test
    @Disabled(value = "Disabled due to sandbox")
    public void testInitLogicDependencies1() throws Exception {
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
            UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
            setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "accountRequestsLogic", null);

            AccountRequestsLogic initialUsageStatisticsLogicAccountRequestsLogic = ((AccountRequestsLogic) getFieldValue(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "accountRequestsLogic"));

            assertThrows(ExceptionInInitializerError.class, () -> usageStatisticsLogic.initLogicDependencies());

            AccountRequestsLogic finalUsageStatisticsLogicAccountRequestsLogic = ((AccountRequestsLogic) getFieldValue(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "accountRequestsLogic"));

            assertFalse(initialUsageStatisticsLogicAccountRequestsLogic == finalUsageStatisticsLogicAccountRequestsLogic);
        } finally {
            setStaticField(AccountRequestsDb.class, "instance", prevInstance);
            setStaticField(AccountRequestsLogic.class, "instance", prevInstance1);
        }
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method initLogicDependencies()

    @Test
    public void testInitLogicDependencies2() throws Exception {
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
            UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
            setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "accountRequestsLogic", null);

            AccountRequestsLogic initialUsageStatisticsLogicAccountRequestsLogic = ((AccountRequestsLogic) getFieldValue(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "accountRequestsLogic"));

            assertThrows(NoClassDefFoundError.class, () -> usageStatisticsLogic.initLogicDependencies());

            AccountRequestsLogic finalUsageStatisticsLogicAccountRequestsLogic = ((AccountRequestsLogic) getFieldValue(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "accountRequestsLogic"));

            assertFalse(initialUsageStatisticsLogicAccountRequestsLogic == finalUsageStatisticsLogicAccountRequestsLogic);
        } finally {
            setStaticField(AccountRequestsDb.class, "instance", prevInstance);
            setStaticField(AccountRequestsLogic.class, "instance", prevInstance1);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.UsageStatisticsLogic.getUsageStatisticsForTimeRange

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getUsageStatisticsForTimeRange(java.time.Instant, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link UsageStatisticsLogic}
     * @utbot.methodUnderTest {@link UsageStatisticsLogic#getUsageStatisticsForTimeRange(Instant, Instant)}
     * @utbot.invokes {@link UsageStatisticsDb#getUsageStatisticsForTimeRange(Instant, Instant)}
     * @utbot.throwsException {@link NullPointerException} in: return usageStatisticsDb.getUsageStatisticsForTimeRange(startTime, endTime);
     */
    @Test
    @DisplayName("getUsageStatisticsForTimeRange: return usageStatisticsDb.getUsageStatisticsForTimeRange(startTime, endTime) : True -> ThrowNullPointerException")
    public void testGetUsageStatisticsForTimeRange_UsageStatisticsDbGetUsageStatisticsForTimeRange() throws Exception {
        UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
        setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "usageStatisticsDb", null);
        
        /* This test fails because method [teammates.logic.core.UsageStatisticsLogic.getUsageStatisticsForTimeRange] produces [java.lang.NullPointerException]
            teammates.logic.core.UsageStatisticsLogic.getUsageStatisticsForTimeRange(UsageStatisticsLogic.java:49) */
        usageStatisticsLogic.getUsageStatisticsForTimeRange(null, null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getUsageStatisticsForTimeRange(java.time.Instant, java.time.Instant)

    @Test
    public void testGetUsageStatisticsForTimeRange1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            InheritableThreadLocal inheritableThreadLocal = ((InheritableThreadLocal) createInstance("java.lang.InheritableThreadLocal"));
            setField(factory, "com.googlecode.objectify.ObjectifyFactory", "stacks", inheritableThreadLocal);
            setStaticField(objectifyServiceClazz, "factory", factory);
            UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
            UsageStatisticsDb usageStatisticsDb = ((UsageStatisticsDb) createInstance("teammates.storage.api.UsageStatisticsDb"));
            setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "usageStatisticsDb", usageStatisticsDb);
            Instant startTime = ((Instant) createInstance("java.time.Instant"));
            
            /* This test fails because method [teammates.logic.core.UsageStatisticsLogic.getUsageStatisticsForTimeRange] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:409)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.UsageStatisticsDb.load(UsageStatisticsDb.java:45)
                teammates.storage.api.UsageStatisticsDb.getUsageStatisticsForTimeRange(UsageStatisticsDb.java:36)
                teammates.logic.core.UsageStatisticsLogic.getUsageStatisticsForTimeRange(UsageStatisticsLogic.java:49) */
            usageStatisticsLogic.getUsageStatisticsForTimeRange(startTime, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testGetUsageStatisticsForTimeRange2() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            ThreadLocal anonymousThreadLocal = ((ThreadLocal) createInstance("java.math.BigDecimal$1"));
            setField(anonymousThreadLocal, "java.lang.ThreadLocal", "threadLocalHashCode", -1);
            setField(factory, "com.googlecode.objectify.ObjectifyFactory", "stacks", anonymousThreadLocal);
            setStaticField(objectifyServiceClazz, "factory", factory);
            UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
            UsageStatisticsDb usageStatisticsDb = ((UsageStatisticsDb) createInstance("teammates.storage.api.UsageStatisticsDb"));
            setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "usageStatisticsDb", usageStatisticsDb);
            
            /* This test fails because method [teammates.logic.core.UsageStatisticsLogic.getUsageStatisticsForTimeRange] produces [java.lang.ClassCastException: class java.math.BigDecimal$StringBuilderHelper cannot be cast to class java.util.Deque (java.math.BigDecimal$StringBuilderHelper and java.util.Deque are in module java.base of loader 'bootstrap')]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.UsageStatisticsDb.load(UsageStatisticsDb.java:45)
                teammates.storage.api.UsageStatisticsDb.getUsageStatisticsForTimeRange(UsageStatisticsDb.java:36)
                teammates.logic.core.UsageStatisticsLogic.getUsageStatisticsForTimeRange(UsageStatisticsLogic.java:49) */
            usageStatisticsLogic.getUsageStatisticsForTimeRange(null, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testGetUsageStatisticsForTimeRange3() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            setStaticField(objectifyServiceClazz, "factory", null);
            UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
            UsageStatisticsDb usageStatisticsDb = ((UsageStatisticsDb) createInstance("teammates.storage.api.UsageStatisticsDb"));
            setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "usageStatisticsDb", usageStatisticsDb);
            
            /* This test fails because method [teammates.logic.core.UsageStatisticsLogic.getUsageStatisticsForTimeRange] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.UsageStatisticsDb.load(UsageStatisticsDb.java:45)
                teammates.storage.api.UsageStatisticsDb.getUsageStatisticsForTimeRange(UsageStatisticsDb.java:36)
                teammates.logic.core.UsageStatisticsLogic.getUsageStatisticsForTimeRange(UsageStatisticsLogic.java:49) */
            usageStatisticsLogic.getUsageStatisticsForTimeRange(null, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.UsageStatisticsLogic.calculateEntitiesStatisticsForTimeRange

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method calculateEntitiesStatisticsForTimeRange(java.time.Instant, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link UsageStatisticsLogic}
     * @utbot.methodUnderTest {@link UsageStatisticsLogic#calculateEntitiesStatisticsForTimeRange(Instant, Instant)}
     * @utbot.invokes {@link FeedbackResponsesLogic#getNumFeedbackResponsesByTimeRange(Instant, Instant)}
     * @utbot.throwsException {@link NullPointerException} in: int numResponses = feedbackResponsesLogic.getNumFeedbackResponsesByTimeRange(startTime, endTime);
     */
    @Test
    @DisplayName("calculateEntitiesStatisticsForTimeRange: numResponses = feedbackResponsesLogic.getNumFeedbackResponsesByTimeRange(startTime, endTime) : True -> ThrowNullPointerException")
    public void testCalculateEntitiesStatisticsForTimeRange_FeedbackResponsesLogicGetNumFeedbackResponsesByTimeRange() throws Exception {
        UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
        setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "feedbackResponsesLogic", null);
        
        /* This test fails because method [teammates.logic.core.UsageStatisticsLogic.calculateEntitiesStatisticsForTimeRange] produces [java.lang.NullPointerException]
            teammates.logic.core.UsageStatisticsLogic.calculateEntitiesStatisticsForTimeRange(UsageStatisticsLogic.java:56) */
        usageStatisticsLogic.calculateEntitiesStatisticsForTimeRange(null, null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method calculateEntitiesStatisticsForTimeRange(java.time.Instant, java.time.Instant)

    @Test
    public void testCalculateEntitiesStatisticsForTimeRange1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            Object classLoaderThreadLocal = createInstance("org.eclipse.jetty.util.ClassLoadingObjectInputStream$ClassLoaderThreadLocal");
            setField(classLoaderThreadLocal, "java.lang.ThreadLocal", "threadLocalHashCode", 58);
            setField(factory, "com.googlecode.objectify.ObjectifyFactory", "stacks", classLoaderThreadLocal);
            setStaticField(objectifyServiceClazz, "factory", factory);
            UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
            FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
            FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
            setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
            setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "feedbackResponsesLogic", feedbackResponsesLogic);
            
            /* This test fails because method [teammates.logic.core.UsageStatisticsLogic.calculateEntitiesStatisticsForTimeRange] produces [java.lang.ClassCastException: class org.eclipse.jetty.util.ClassLoadingObjectInputStream$ClassLoaderThreadLocal$1 cannot be cast to class java.util.Deque (org.eclipse.jetty.util.ClassLoadingObjectInputStream$ClassLoaderThreadLocal$1 is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20353a4a; java.util.Deque is in module java.base of loader 'bootstrap')]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.FeedbackResponsesDb.load(FeedbackResponsesDb.java:414)
                teammates.storage.api.FeedbackResponsesDb.getNumFeedbackResponsesByTimeRange(FeedbackResponsesDb.java:439)
                teammates.logic.core.FeedbackResponsesLogic.getNumFeedbackResponsesByTimeRange(FeedbackResponsesLogic.java:1011)
                teammates.logic.core.UsageStatisticsLogic.calculateEntitiesStatisticsForTimeRange(UsageStatisticsLogic.java:56) */
            usageStatisticsLogic.calculateEntitiesStatisticsForTimeRange(null, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testCalculateEntitiesStatisticsForTimeRange2() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            setStaticField(objectifyServiceClazz, "factory", null);
            UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
            FeedbackResponsesLogic feedbackResponsesLogic = ((FeedbackResponsesLogic) createInstance("teammates.logic.core.FeedbackResponsesLogic"));
            FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
            setField(feedbackResponsesLogic, "teammates.logic.core.FeedbackResponsesLogic", "frDb", feedbackResponsesDb);
            setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "feedbackResponsesLogic", feedbackResponsesLogic);
            
            /* This test fails because method [teammates.logic.core.UsageStatisticsLogic.calculateEntitiesStatisticsForTimeRange] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.FeedbackResponsesDb.load(FeedbackResponsesDb.java:414)
                teammates.storage.api.FeedbackResponsesDb.getNumFeedbackResponsesByTimeRange(FeedbackResponsesDb.java:439)
                teammates.logic.core.FeedbackResponsesLogic.getNumFeedbackResponsesByTimeRange(FeedbackResponsesLogic.java:1011)
                teammates.logic.core.UsageStatisticsLogic.calculateEntitiesStatisticsForTimeRange(UsageStatisticsLogic.java:56) */
            usageStatisticsLogic.calculateEntitiesStatisticsForTimeRange(null, null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.UsageStatisticsLogic.createUsageStatistics

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createUsageStatistics(teammates.common.datatransfer.attributes.UsageStatisticsAttributes)

    /**
     * @utbot.classUnderTest {@link UsageStatisticsLogic}
     * @utbot.methodUnderTest {@link UsageStatisticsLogic#createUsageStatistics(UsageStatisticsAttributes)}
     * @utbot.invokes {@link UsageStatisticsDb#createEntity(EntityAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: return usageStatisticsDb.createEntity(attributes);
     */
    @Test
    @DisplayName("createUsageStatistics: return usageStatisticsDb.createEntity(attributes) : True -> ThrowNullPointerException")
    public void testCreateUsageStatistics_UsageStatisticsDbCreateEntity() throws Exception {
        UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
        setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "usageStatisticsDb", null);
        
        /* This test fails because method [teammates.logic.core.UsageStatisticsLogic.createUsageStatistics] produces [java.lang.NullPointerException]
            teammates.logic.core.UsageStatisticsLogic.createUsageStatistics(UsageStatisticsLogic.java:80) */
        usageStatisticsLogic.createUsageStatistics(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createUsageStatistics(teammates.common.datatransfer.attributes.UsageStatisticsAttributes)

    @Test
    public void testCreateUsageStatistics1() throws Exception {
        UsageStatisticsLogic usageStatisticsLogic = ((UsageStatisticsLogic) createInstance("teammates.logic.core.UsageStatisticsLogic"));
        UsageStatisticsDb usageStatisticsDb = ((UsageStatisticsDb) createInstance("teammates.storage.api.UsageStatisticsDb"));
        setField(usageStatisticsLogic, "teammates.logic.core.UsageStatisticsLogic", "usageStatisticsDb", usageStatisticsDb);
        
        /* This test fails because method [teammates.logic.core.UsageStatisticsLogic.createUsageStatistics] produces [java.lang.AssertionError]
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:62)
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:57)
            teammates.storage.api.UsageStatisticsDb.createEntity(UsageStatisticsDb.java:20)
            teammates.logic.core.UsageStatisticsLogic.createUsageStatistics(UsageStatisticsLogic.java:80) */
        usageStatisticsLogic.createUsageStatistics(null);
    }
    ///endregion

    ///endregion
}
