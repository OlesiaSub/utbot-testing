package teammates.logic.core;

import com.googlecode.objectify.ObjectifyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.attributes.DeadlineExtensionAttributes.UpdateOptions;
import teammates.common.datatransfer.attributes.DeadlineExtensionAttributes;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.storage.api.DeadlineExtensionsDb;
import teammates.common.datatransfer.AttributesDeletionQuery;
import com.googlecode.objectify.ObjectifyFactory;
import jdk.internal.misc.TerminatingThreadLocal;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;

public final class DeadlineExtensionsLogicTest {
    ///region Test suites for executable teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateDeadlineExtension(teammates.common.datatransfer.attributes.DeadlineExtensionAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link DeadlineExtensionsLogic}
     * @utbot.methodUnderTest {@link DeadlineExtensionsLogic#updateDeadlineExtension(UpdateOptions)}
     * @utbot.invokes {@link UpdateOptions#isEndTimeOptionPresent()}
     * @utbot.throwsException {@link NullPointerException} in: updateOptions.isEndTimeOptionPresent() && !updateOptions.isSentClosingEmailOptionPresent()
     */
    @Test
    @DisplayName("updateDeadlineExtension: updateOptions.isEndTimeOptionPresent() && !updateOptions.isSentClosingEmailOptionPresent() -> ThrowNullPointerException")
    public void testUpdateDeadlineExtension_DeadlineExtensionAttributesIsEndTimeOptionPresent() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension] produces [java.lang.NullPointerException]
            teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension(DeadlineExtensionsLogic.java:43) */
        deadlineExtensionsLogic.updateDeadlineExtension(null);
    }

    /**
     * @utbot.classUnderTest {@link DeadlineExtensionsLogic}
     * @utbot.methodUnderTest {@link DeadlineExtensionsLogic#updateDeadlineExtension(UpdateOptions)}
     * @utbot.executesCondition {@code (updateOptions.isEndTimeOptionPresent()): False}
     * @utbot.throwsException {@link NullPointerException} in: return deDb.updateDeadlineExtension(updateOptions);
     */
    @Test
    @DisplayName("updateDeadlineExtension: return deDb.updateDeadlineExtension(updateOptions) : True -> ThrowNullPointerException")
    public void testUpdateDeadlineExtension_NotUpdateOptionsIsEndTimeOptionPresent() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", null);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions"));
        Object updateOption = createInstance("teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption");
        setField(updateOption, "teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption", "isValuePresent", false);
        setField(updateOptions, "teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions", "endTimeOption", updateOption);
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension] produces [java.lang.NullPointerException]
            teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension(DeadlineExtensionsLogic.java:49) */
        deadlineExtensionsLogic.updateDeadlineExtension(updateOptions);
    }

    /**
     * @utbot.classUnderTest {@link DeadlineExtensionsLogic}
     * @utbot.methodUnderTest {@link DeadlineExtensionsLogic#updateDeadlineExtension(UpdateOptions)}
     * @utbot.executesCondition {@code (updateOptions.isEndTimeOptionPresent()): True}
     * @utbot.executesCondition {@code (!updateOptions.isSentClosingEmailOptionPresent()): False}
     * @utbot.invokes {@link UpdateOptions#isSentClosingEmailOptionPresent()}
     * @utbot.throwsException {@link NullPointerException} in: return deDb.updateDeadlineExtension(updateOptions);
     */
    @Test
    @DisplayName("updateDeadlineExtension: return deDb.updateDeadlineExtension(updateOptions) : True -> ThrowNullPointerException")
    public void testUpdateDeadlineExtension_UpdateOptionsIsSentClosingEmailOptionPresent() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", null);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions"));
        Object updateOption = createInstance("teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption");
        setField(updateOption, "teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption", "isValuePresent", true);
        setField(updateOptions, "teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions", "endTimeOption", updateOption);
        setField(updateOptions, "teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions", "sentClosingEmailOption", updateOption);
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension] produces [java.lang.NullPointerException]
            teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension(DeadlineExtensionsLogic.java:49) */
        deadlineExtensionsLogic.updateDeadlineExtension(updateOptions);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method updateDeadlineExtension(teammates.common.datatransfer.attributes.DeadlineExtensionAttributes.UpdateOptions)

    @Test
    public void testUpdateDeadlineExtension1() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions"));
        Object updateOption = createInstance("teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption");
        setField(updateOption, "teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption", "isValuePresent", false);
        setField(updateOptions, "teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions", "endTimeOption", updateOption);
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.DeadlineExtensionsDb.load(DeadlineExtensionsDb.java:210)
            teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtensionEntity(DeadlineExtensionsDb.java:142)
            teammates.storage.api.DeadlineExtensionsDb.updateDeadlineExtension(DeadlineExtensionsDb.java:64)
            teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension(DeadlineExtensionsLogic.java:49) */
        deadlineExtensionsLogic.updateDeadlineExtension(updateOptions);
    }

    @Test
    public void testUpdateDeadlineExtension2() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions"));
        Object updateOption = createInstance("teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption");
        setField(updateOption, "teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption", "isValuePresent", true);
        setField(updateOptions, "teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions", "endTimeOption", updateOption);
        Object updateOption1 = createInstance("teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption");
        setField(updateOption1, "teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption", "isValuePresent", true);
        setField(updateOptions, "teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions", "sentClosingEmailOption", updateOption1);
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.DeadlineExtensionsDb.load(DeadlineExtensionsDb.java:210)
            teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtensionEntity(DeadlineExtensionsDb.java:142)
            teammates.storage.api.DeadlineExtensionsDb.updateDeadlineExtension(DeadlineExtensionsDb.java:64)
            teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension(DeadlineExtensionsLogic.java:49) */
        deadlineExtensionsLogic.updateDeadlineExtension(updateOptions);
    }

    @Test
    public void testUpdateDeadlineExtension3() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", null);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions"));
        Object updateOption = createInstance("teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption");
        setField(updateOption, "teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption", "isValuePresent", true);
        setField(updateOptions, "teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions", "endTimeOption", updateOption);
        Object updateOption1 = createInstance("teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption");
        setField(updateOption1, "teammates.common.datatransfer.attributes.EntityAttributes$UpdateOption", "isValuePresent", false);
        setField(updateOptions, "teammates.common.datatransfer.attributes.DeadlineExtensionAttributes$UpdateOptions", "sentClosingEmailOption", updateOption1);
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension] produces [java.lang.NullPointerException]
            teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtension(DeadlineExtensionsLogic.java:44) */
        deadlineExtensionsLogic.updateDeadlineExtension(updateOptions);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DeadlineExtensionsLogic.inst

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inst()

    /**
     * @utbot.classUnderTest {@link DeadlineExtensionsLogic}
     * @utbot.methodUnderTest {@link DeadlineExtensionsLogic#inst()}
     * @utbot.returnsFrom {@code return instance;}
     */
    @Test
    @DisplayName("inst: -> return instance")
    public void testInst_ReturnInstance() throws Exception {
        Class deadlineExtensionsDbClazz = Class.forName("teammates.storage.api.DeadlineExtensionsDb");
        DeadlineExtensionsDb prevInstance = ((DeadlineExtensionsDb) getStaticFieldValue(deadlineExtensionsDbClazz, "instance"));
        Class deadlineExtensionsLogicClazz = Class.forName("teammates.logic.core.DeadlineExtensionsLogic");
        DeadlineExtensionsLogic prevInstance1 = ((DeadlineExtensionsLogic) getStaticFieldValue(deadlineExtensionsLogicClazz, "instance"));
        try {
            DeadlineExtensionsDb instance = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setStaticField(deadlineExtensionsDbClazz, "instance", instance);
            DeadlineExtensionsLogic instance1 = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
            setField(instance1, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", instance);
            setStaticField(deadlineExtensionsLogicClazz, "instance", instance1);

            DeadlineExtensionsLogic actual = DeadlineExtensionsLogic.inst();

            DeadlineExtensionsDb instance1DeDb = ((DeadlineExtensionsDb) getFieldValue(instance1, "teammates.logic.core.DeadlineExtensionsLogic", "deDb"));
            DeadlineExtensionsDb actualDeDb = ((DeadlineExtensionsDb) getFieldValue(actual, "teammates.logic.core.DeadlineExtensionsLogic", "deDb"));

        } finally {
            setStaticField(DeadlineExtensionsDb.class, "instance", prevInstance);
            setStaticField(DeadlineExtensionsLogic.class, "instance", prevInstance1);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtensionsWithNewEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method updateDeadlineExtensionsWithNewEmail(java.lang.String, java.lang.String, java.lang.String, boolean)

    @Test
    public void testUpdateDeadlineExtensionsWithNewEmailByFuzzer() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtensionsWithNewEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.DeadlineExtensionsLogic.updateDeadlineExtensionsWithNewEmail(DeadlineExtensionsLogic.java:57) */
        deadlineExtensionsLogic.updateDeadlineExtensionsWithNewEmail("string", "", "string", true);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DeadlineExtensionsLogic.createDeadlineExtension

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createDeadlineExtension(teammates.common.datatransfer.attributes.DeadlineExtensionAttributes)

    /**
     * @utbot.classUnderTest {@link DeadlineExtensionsLogic}
     * @utbot.methodUnderTest {@link DeadlineExtensionsLogic#createDeadlineExtension(DeadlineExtensionAttributes)}
     * @utbot.invokes {@link DeadlineExtensionsDb#createEntity(EntityAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: return deDb.createEntity(deadlineExtension);
     */
    @Test
    @DisplayName("createDeadlineExtension: return deDb.createEntity(deadlineExtension) : True -> ThrowNullPointerException")
    public void testCreateDeadlineExtension_DeadlineExtensionsDbCreateEntity() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", null);
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.createDeadlineExtension] produces [java.lang.NullPointerException]
            teammates.logic.core.DeadlineExtensionsLogic.createDeadlineExtension(DeadlineExtensionsLogic.java:69) */
        deadlineExtensionsLogic.createDeadlineExtension(null);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createDeadlineExtension(teammates.common.datatransfer.attributes.DeadlineExtensionAttributes)

    @Test
    public void testCreateDeadlineExtension1() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.createDeadlineExtension] produces [java.lang.AssertionError]
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:62)
            teammates.storage.api.EntitiesDb.createEntity(EntitiesDb.java:57)
            teammates.storage.api.DeadlineExtensionsDb.createEntity(DeadlineExtensionsDb.java:27)
            teammates.logic.core.DeadlineExtensionsLogic.createDeadlineExtension(DeadlineExtensionsLogic.java:69) */
        deadlineExtensionsLogic.createDeadlineExtension(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension

    ///region

    @Test
    public void testDeleteDeadlineExtension1() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension] produces [java.lang.NullPointerException]
            teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension(DeadlineExtensionsLogic.java:79) */
        deadlineExtensionsLogic.deleteDeadlineExtension("string", "", "string", true);
    }

    @Test
    public void testDeleteDeadlineExtension2() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        String courseId = "";
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.Key.newKeyFactory(Key.java:157)
            com.googlecode.objectify.Key.<init>(Key.java:143)
            com.googlecode.objectify.Key.<init>(Key.java:100)
            com.googlecode.objectify.Key.create(Key.java:40)
            teammates.storage.api.DeadlineExtensionsDb.deleteDeadlineExtension(DeadlineExtensionsDb.java:154)
            teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension(DeadlineExtensionsLogic.java:79) */
        deadlineExtensionsLogic.deleteDeadlineExtension(courseId, courseId, courseId, false);
    }

    @Test
    public void testDeleteDeadlineExtension3() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension] produces [java.lang.AssertionError]
            teammates.storage.api.DeadlineExtensionsDb.deleteDeadlineExtension(DeadlineExtensionsDb.java:150)
            teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension(DeadlineExtensionsLogic.java:79) */
        deadlineExtensionsLogic.deleteDeadlineExtension(null, null, null, false);
    }

    @Test
    public void testDeleteDeadlineExtension4() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        String courseId = "";
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension] produces [java.lang.AssertionError]
            teammates.storage.api.DeadlineExtensionsDb.deleteDeadlineExtension(DeadlineExtensionsDb.java:151)
            teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension(DeadlineExtensionsLogic.java:79) */
        deadlineExtensionsLogic.deleteDeadlineExtension(courseId, null, null, false);
    }

    @Test
    public void testDeleteDeadlineExtension5() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        String courseId = "";
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension] produces [java.lang.AssertionError]
            teammates.storage.api.DeadlineExtensionsDb.deleteDeadlineExtension(DeadlineExtensionsDb.java:152)
            teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtension(DeadlineExtensionsLogic.java:79) */
        deadlineExtensionsLogic.deleteDeadlineExtension(courseId, courseId, null, false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions

    ///region

    @Test
    public void testDeleteDeadlineExtensions1() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions] produces [java.lang.NullPointerException]
            teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions(DeadlineExtensionsLogic.java:97) */
        deadlineExtensionsLogic.deleteDeadlineExtensions("\n\t\r", "   ", false);
    }

    @Test
    public void testDeleteDeadlineExtensions2() throws Exception {
        Class deadlineExtensionsDbClazz = Class.forName("teammates.storage.api.DeadlineExtensionsDb");
        DeadlineExtensionsDb prevInstance = ((DeadlineExtensionsDb) getStaticFieldValue(deadlineExtensionsDbClazz, "instance"));
        try {
            DeadlineExtensionsDb instance = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setStaticField(deadlineExtensionsDbClazz, "instance", instance);
            DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
            
            /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions] produces [java.lang.AssertionError]
                teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions(DeadlineExtensionsLogic.java:88) */
            deadlineExtensionsLogic.deleteDeadlineExtensions(null, null, false);
        } finally {
            setStaticField(DeadlineExtensionsDb.class, "instance", prevInstance);
        }
    }

    @Test
    public void testDeleteDeadlineExtensions3() throws Exception {
        Class deadlineExtensionsDbClazz = Class.forName("teammates.storage.api.DeadlineExtensionsDb");
        DeadlineExtensionsDb prevInstance = ((DeadlineExtensionsDb) getStaticFieldValue(deadlineExtensionsDbClazz, "instance"));
        try {
            DeadlineExtensionsDb instance = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setStaticField(deadlineExtensionsDbClazz, "instance", instance);
            DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
            String courseId = "";
            
            /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions] produces [java.lang.AssertionError]
                teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions(DeadlineExtensionsLogic.java:89) */
            deadlineExtensionsLogic.deleteDeadlineExtensions(courseId, null, false);
        } finally {
            setStaticField(DeadlineExtensionsDb.class, "instance", prevInstance);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions

    ///region

    @Test
    public void testDeleteDeadlineExtensions4() throws Exception {
        Class deadlineExtensionsDbClazz = Class.forName("teammates.storage.api.DeadlineExtensionsDb");
        DeadlineExtensionsDb prevInstance = ((DeadlineExtensionsDb) getStaticFieldValue(deadlineExtensionsDbClazz, "instance"));
        try {
            DeadlineExtensionsDb instance = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setStaticField(deadlineExtensionsDbClazz, "instance", instance);
            DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
            setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", null);
            AttributesDeletionQuery query = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            
            /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions] produces [java.lang.NullPointerException]
                teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions(DeadlineExtensionsLogic.java:105) */
            deadlineExtensionsLogic.deleteDeadlineExtensions(query);
        } finally {
            setStaticField(DeadlineExtensionsDb.class, "instance", prevInstance);
        }
    }

    @Test
    public void testDeleteDeadlineExtensions5() throws Exception {
        Class deadlineExtensionsDbClazz = Class.forName("teammates.storage.api.DeadlineExtensionsDb");
        DeadlineExtensionsDb prevInstance = ((DeadlineExtensionsDb) getStaticFieldValue(deadlineExtensionsDbClazz, "instance"));
        try {
            DeadlineExtensionsDb instance = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setStaticField(deadlineExtensionsDbClazz, "instance", instance);
            DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
            DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
            AttributesDeletionQuery query = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(query, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", string);
            setField(query, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", null);
            
            /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.DeadlineExtensionsDb.load(DeadlineExtensionsDb.java:210)
                teammates.storage.api.DeadlineExtensionsDb.deleteDeadlineExtensions(DeadlineExtensionsDb.java:165)
                teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions(DeadlineExtensionsLogic.java:105) */
            deadlineExtensionsLogic.deleteDeadlineExtensions(query);
        } finally {
            setStaticField(DeadlineExtensionsDb.class, "instance", prevInstance);
        }
    }

    @Test
    public void testDeleteDeadlineExtensions6() throws Exception {
        Class deadlineExtensionsDbClazz = Class.forName("teammates.storage.api.DeadlineExtensionsDb");
        DeadlineExtensionsDb prevInstance = ((DeadlineExtensionsDb) getStaticFieldValue(deadlineExtensionsDbClazz, "instance"));
        try {
            DeadlineExtensionsDb instance = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setStaticField(deadlineExtensionsDbClazz, "instance", instance);
            DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
            
            /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions] produces [java.lang.AssertionError]
                teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions(DeadlineExtensionsLogic.java:104) */
            deadlineExtensionsLogic.deleteDeadlineExtensions(null);
        } finally {
            setStaticField(DeadlineExtensionsDb.class, "instance", prevInstance);
        }
    }

    @Test
    public void testDeleteDeadlineExtensions7() throws Exception {
        Class deadlineExtensionsDbClazz = Class.forName("teammates.storage.api.DeadlineExtensionsDb");
        DeadlineExtensionsDb prevInstance = ((DeadlineExtensionsDb) getStaticFieldValue(deadlineExtensionsDbClazz, "instance"));
        try {
            DeadlineExtensionsDb instance = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setStaticField(deadlineExtensionsDbClazz, "instance", instance);
            DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
            DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
            AttributesDeletionQuery query = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(query, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            
            /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions] produces [java.lang.AssertionError]
                teammates.storage.api.DeadlineExtensionsDb.deleteDeadlineExtensions(DeadlineExtensionsDb.java:163)
                teammates.logic.core.DeadlineExtensionsLogic.deleteDeadlineExtensions(DeadlineExtensionsLogic.java:105) */
            deadlineExtensionsLogic.deleteDeadlineExtensions(query);
        } finally {
            setStaticField(DeadlineExtensionsDb.class, "instance", prevInstance);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension

    ///region

    @Test
    public void testGetDeadlineExtension1() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension] produces [java.lang.NullPointerException]
            teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension(DeadlineExtensionsLogic.java:116) */
        deadlineExtensionsLogic.getDeadlineExtension("string", "", "string", true);
    }

    @Test
    public void testGetDeadlineExtension2() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        String courseId = "";
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
            teammates.storage.api.DeadlineExtensionsDb.load(DeadlineExtensionsDb.java:210)
            teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtensionEntity(DeadlineExtensionsDb.java:142)
            teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtension(DeadlineExtensionsDb.java:49)
            teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension(DeadlineExtensionsLogic.java:116) */
        deadlineExtensionsLogic.getDeadlineExtension(courseId, courseId, courseId, false);
    }

    @Test
    public void testGetDeadlineExtension3() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension] produces [java.lang.AssertionError]
            teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtension(DeadlineExtensionsDb.java:45)
            teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension(DeadlineExtensionsLogic.java:116) */
        deadlineExtensionsLogic.getDeadlineExtension(null, null, null, false);
    }

    @Test
    public void testGetDeadlineExtension4() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        String courseId = "";
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension] produces [java.lang.AssertionError]
            teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtension(DeadlineExtensionsDb.java:46)
            teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension(DeadlineExtensionsLogic.java:116) */
        deadlineExtensionsLogic.getDeadlineExtension(courseId, null, null, false);
    }

    @Test
    public void testGetDeadlineExtension5() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
        String courseId = "";
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension] produces [java.lang.AssertionError]
            teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtension(DeadlineExtensionsDb.java:47)
            teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtension(DeadlineExtensionsLogic.java:116) */
        deadlineExtensionsLogic.getDeadlineExtension(courseId, courseId, null, false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtensionsPossiblyNeedingClosingEmail

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDeadlineExtensionsPossiblyNeedingClosingEmail()

    /**
     * @utbot.classUnderTest {@link DeadlineExtensionsLogic}
     * @utbot.methodUnderTest {@link DeadlineExtensionsLogic#getDeadlineExtensionsPossiblyNeedingClosingEmail()}
     * @utbot.invokes {@link DeadlineExtensionsDb#getDeadlineExtensionsPossiblyNeedingClosingEmail()}
     * @utbot.throwsException {@link NullPointerException} in: return deDb.getDeadlineExtensionsPossiblyNeedingClosingEmail();
     */
    @Test
    @DisplayName("getDeadlineExtensionsPossiblyNeedingClosingEmail: return deDb.getDeadlineExtensionsPossiblyNeedingClosingEmail() : True -> ThrowNullPointerException")
    public void testGetDeadlineExtensionsPossiblyNeedingClosingEmail_DeadlineExtensionsDbGetDeadlineExtensionsPossiblyNeedingClosingEmail() throws Exception {
        DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
        setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", null);
        
        /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtensionsPossiblyNeedingClosingEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtensionsPossiblyNeedingClosingEmail(DeadlineExtensionsLogic.java:124) */
        deadlineExtensionsLogic.getDeadlineExtensionsPossiblyNeedingClosingEmail();
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getDeadlineExtensionsPossiblyNeedingClosingEmail()

    @Test
    public void testGetDeadlineExtensionsPossiblyNeedingClosingEmail1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            TerminatingThreadLocal terminatingThreadLocal = ((TerminatingThreadLocal) createInstance("jdk.internal.misc.TerminatingThreadLocal"));
            setField(factory, "com.googlecode.objectify.ObjectifyFactory", "stacks", terminatingThreadLocal);
            setStaticField(objectifyServiceClazz, "factory", factory);
            DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
            DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
            
            /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtensionsPossiblyNeedingClosingEmail] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:409)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.DeadlineExtensionsDb.load(DeadlineExtensionsDb.java:210)
                teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtensionEntitiesPossiblyNeedingClosingEmail(DeadlineExtensionsDb.java:201)
                teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtensionsPossiblyNeedingClosingEmail(DeadlineExtensionsDb.java:197)
                teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtensionsPossiblyNeedingClosingEmail(DeadlineExtensionsLogic.java:124) */
            deadlineExtensionsLogic.getDeadlineExtensionsPossiblyNeedingClosingEmail();
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }

    @Test
    public void testGetDeadlineExtensionsPossiblyNeedingClosingEmail2() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            setStaticField(objectifyServiceClazz, "factory", null);
            DeadlineExtensionsLogic deadlineExtensionsLogic = ((DeadlineExtensionsLogic) createInstance("teammates.logic.core.DeadlineExtensionsLogic"));
            DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setField(deadlineExtensionsLogic, "teammates.logic.core.DeadlineExtensionsLogic", "deDb", deadlineExtensionsDb);
            
            /* This test fails because method [teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtensionsPossiblyNeedingClosingEmail] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
                com.google.common.base.Preconditions.checkState(Preconditions.java:502)
                com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.DeadlineExtensionsDb.load(DeadlineExtensionsDb.java:210)
                teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtensionEntitiesPossiblyNeedingClosingEmail(DeadlineExtensionsDb.java:201)
                teammates.storage.api.DeadlineExtensionsDb.getDeadlineExtensionsPossiblyNeedingClosingEmail(DeadlineExtensionsDb.java:197)
                teammates.logic.core.DeadlineExtensionsLogic.getDeadlineExtensionsPossiblyNeedingClosingEmail(DeadlineExtensionsLogic.java:124) */
            deadlineExtensionsLogic.getDeadlineExtensionsPossiblyNeedingClosingEmail();
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion
}
