package teammates.logic.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.storage.api.ProfilesDb;
import teammates.common.datatransfer.attributes.StudentProfileAttributes.UpdateOptions;
import teammates.common.datatransfer.attributes.StudentProfileAttributes;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;

public final class ProfilesLogicTest {
    ///region Test suites for executable teammates.logic.core.ProfilesLogic.updateOrCreateStudentProfile

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateOrCreateStudentProfile(teammates.common.datatransfer.attributes.StudentProfileAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link ProfilesLogic}
     * @utbot.methodUnderTest {@link ProfilesLogic#updateOrCreateStudentProfile(UpdateOptions)}
     * @utbot.invokes {@link ProfilesDb#updateOrCreateStudentProfile(UpdateOptions)}
     * @utbot.throwsException {@link NullPointerException} in: return profilesDb.updateOrCreateStudentProfile(updateOptions);
     */
    @Test
    @DisplayName("updateOrCreateStudentProfile: return profilesDb.updateOrCreateStudentProfile(updateOptions) : True -> ThrowNullPointerException")
    public void testUpdateOrCreateStudentProfile_ProfilesDbUpdateOrCreateStudentProfile() throws Exception {
        ProfilesLogic profilesLogic = ((ProfilesLogic) createInstance("teammates.logic.core.ProfilesLogic"));
        setField(profilesLogic, "teammates.logic.core.ProfilesLogic", "profilesDb", null);
        
        /* This test fails because method [teammates.logic.core.ProfilesLogic.updateOrCreateStudentProfile] produces [java.lang.NullPointerException]
            teammates.logic.core.ProfilesLogic.updateOrCreateStudentProfile(ProfilesLogic.java:45) */
        profilesLogic.updateOrCreateStudentProfile(null);
    }
    ///endregion

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateOrCreateStudentProfile(teammates.common.datatransfer.attributes.StudentProfileAttributes.UpdateOptions)

    /**
     * @utbot.classUnderTest {@link ProfilesLogic}
     * @utbot.methodUnderTest {@link ProfilesLogic#updateOrCreateStudentProfile(UpdateOptions)}
     * @utbot.invokes {@link ProfilesDb#updateOrCreateStudentProfile(UpdateOptions)}
     * @utbot.throwsException {@link AssertionError} in: return profilesDb.updateOrCreateStudentProfile(updateOptions);
     */
    @Test
    @DisplayName("updateOrCreateStudentProfile: return profilesDb.updateOrCreateStudentProfile(updateOptions) : True -> ThrowAssertionError")
    public void testUpdateOrCreateStudentProfile_ProfilesDbUpdateOrCreateStudentProfile_1() throws Exception {
        ProfilesLogic profilesLogic = ((ProfilesLogic) createInstance("teammates.logic.core.ProfilesLogic"));
        ProfilesDb profilesDb = ((ProfilesDb) createInstance("teammates.storage.api.ProfilesDb"));
        setField(profilesLogic, "teammates.logic.core.ProfilesLogic", "profilesDb", profilesDb);
        
        /* This test fails because method [teammates.logic.core.ProfilesLogic.updateOrCreateStudentProfile] produces [java.lang.AssertionError]
            teammates.storage.api.ProfilesDb.updateOrCreateStudentProfile(ProfilesDb.java:50)
            teammates.logic.core.ProfilesLogic.updateOrCreateStudentProfile(ProfilesLogic.java:45) */
        profilesLogic.updateOrCreateStudentProfile(null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method updateOrCreateStudentProfile(teammates.common.datatransfer.attributes.StudentProfileAttributes.UpdateOptions)

    @Test
    public void testUpdateOrCreateStudentProfile1() throws Exception {
        ProfilesLogic profilesLogic = ((ProfilesLogic) createInstance("teammates.logic.core.ProfilesLogic"));
        ProfilesDb profilesDb = ((ProfilesDb) createInstance("teammates.storage.api.ProfilesDb"));
        setField(profilesLogic, "teammates.logic.core.ProfilesLogic", "profilesDb", profilesDb);
        UpdateOptions updateOptions = ((UpdateOptions) createInstance("teammates.common.datatransfer.attributes.StudentProfileAttributes$UpdateOptions"));
        setField(updateOptions, "teammates.common.datatransfer.attributes.StudentProfileAttributes$UpdateOptions", "googleId", null);
        
        /* This test fails because method [teammates.logic.core.ProfilesLogic.updateOrCreateStudentProfile] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.Key.newKeyFactory(Key.java:157)
            com.googlecode.objectify.Key.<init>(Key.java:143)
            com.googlecode.objectify.Key.<init>(Key.java:100)
            com.googlecode.objectify.Key.create(Key.java:40)
            teammates.storage.api.ProfilesDb.getStudentProfileEntityFromDb(ProfilesDb.java:113)
            teammates.storage.api.ProfilesDb.updateOrCreateStudentProfile(ProfilesDb.java:52)
            teammates.logic.core.ProfilesLogic.updateOrCreateStudentProfile(ProfilesLogic.java:45) */
        profilesLogic.updateOrCreateStudentProfile(updateOptions);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.ProfilesLogic.inst

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inst()

    /**
     * @utbot.classUnderTest {@link ProfilesLogic}
     * @utbot.methodUnderTest {@link ProfilesLogic#inst()}
     * @utbot.returnsFrom {@code return instance;}
     */
    @Test
    @DisplayName("inst: -> return instance")
    public void testInst_ReturnInstance() throws Exception {
        Class profilesDbClazz = Class.forName("teammates.storage.api.ProfilesDb");
        ProfilesDb prevInstance = ((ProfilesDb) getStaticFieldValue(profilesDbClazz, "instance"));
        Class profilesLogicClazz = Class.forName("teammates.logic.core.ProfilesLogic");
        ProfilesLogic prevInstance1 = ((ProfilesLogic) getStaticFieldValue(profilesLogicClazz, "instance"));
        try {
            ProfilesDb instance = ((ProfilesDb) createInstance("teammates.storage.api.ProfilesDb"));
            setStaticField(profilesDbClazz, "instance", instance);
            ProfilesLogic instance1 = ((ProfilesLogic) createInstance("teammates.logic.core.ProfilesLogic"));
            setField(instance1, "teammates.logic.core.ProfilesLogic", "profilesDb", instance);
            setStaticField(profilesLogicClazz, "instance", instance1);

            ProfilesLogic actual = ProfilesLogic.inst();

            ProfilesDb instance1ProfilesDb = ((ProfilesDb) getFieldValue(instance1, "teammates.logic.core.ProfilesLogic", "profilesDb"));
            ProfilesDb actualProfilesDb = ((ProfilesDb) getFieldValue(actual, "teammates.logic.core.ProfilesLogic", "profilesDb"));

        } finally {
            setStaticField(ProfilesDb.class, "instance", prevInstance);
            setStaticField(ProfilesLogic.class, "instance", prevInstance1);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.ProfilesLogic.initLogicDependencies

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initLogicDependencies()

    /**
     * @utbot.classUnderTest {@link ProfilesLogic}
     * @utbot.methodUnderTest {@link ProfilesLogic#initLogicDependencies()}
     */
    @Test
    @DisplayName("initLogicDependencies: ")
    public void testInitLogicDependencies() throws Exception {
        ProfilesLogic profilesLogic = ((ProfilesLogic) createInstance("teammates.logic.core.ProfilesLogic"));

        profilesLogic.initLogicDependencies();
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.ProfilesLogic.getStudentProfile

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getStudentProfile(java.lang.String)

    /**
     * @utbot.classUnderTest {@link ProfilesLogic}
     * @utbot.methodUnderTest {@link ProfilesLogic#getStudentProfile(String)}
     */
    @Test
    @DisplayName("getStudentProfile: googleId = blank string -> throw NullPointerException")
    public void testGetStudentProfileThrowsNPEWithBlankString() throws Exception {
        ProfilesLogic profilesLogic = ((ProfilesLogic) createInstance("teammates.logic.core.ProfilesLogic"));
        
        /* This test fails because method [teammates.logic.core.ProfilesLogic.getStudentProfile] produces [java.lang.NullPointerException]
            teammates.logic.core.ProfilesLogic.getStudentProfile(ProfilesLogic.java:34) */
        profilesLogic.getStudentProfile("   ");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method getStudentProfile(java.lang.String)

    @Test
    public void testGetStudentProfile1() throws Exception {
        ProfilesLogic profilesLogic = ((ProfilesLogic) createInstance("teammates.logic.core.ProfilesLogic"));
        ProfilesDb profilesDb = ((ProfilesDb) createInstance("teammates.storage.api.ProfilesDb"));
        setField(profilesLogic, "teammates.logic.core.ProfilesLogic", "profilesDb", profilesDb);
        
        /* This test fails because method [teammates.logic.core.ProfilesLogic.getStudentProfile] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.Key.newKeyFactory(Key.java:157)
            com.googlecode.objectify.Key.<init>(Key.java:143)
            com.googlecode.objectify.Key.<init>(Key.java:100)
            com.googlecode.objectify.Key.create(Key.java:40)
            teammates.storage.api.ProfilesDb.getStudentProfileEntityFromDb(ProfilesDb.java:113)
            teammates.storage.api.ProfilesDb.getStudentProfile(ProfilesDb.java:39)
            teammates.logic.core.ProfilesLogic.getStudentProfile(ProfilesLogic.java:34) */
        profilesLogic.getStudentProfile(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.ProfilesLogic.deleteStudentProfile

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteStudentProfile(java.lang.String)

    /**
     * @utbot.classUnderTest {@link ProfilesLogic}
     * @utbot.methodUnderTest {@link ProfilesLogic#deleteStudentProfile(String)}
     */
    @Test
    @DisplayName("deleteStudentProfile: googleId = blank string -> throw NullPointerException")
    public void testDeleteStudentProfileThrowsNPEWithBlankString() throws Exception {
        ProfilesLogic profilesLogic = ((ProfilesLogic) createInstance("teammates.logic.core.ProfilesLogic"));
        
        /* This test fails because method [teammates.logic.core.ProfilesLogic.deleteStudentProfile] produces [java.lang.NullPointerException]
            teammates.logic.core.ProfilesLogic.deleteStudentProfile(ProfilesLogic.java:54) */
        profilesLogic.deleteStudentProfile("   ");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method deleteStudentProfile(java.lang.String)

    @Test
    public void testDeleteStudentProfile1() throws Exception {
        ProfilesLogic profilesLogic = ((ProfilesLogic) createInstance("teammates.logic.core.ProfilesLogic"));
        ProfilesDb profilesDb = ((ProfilesDb) createInstance("teammates.storage.api.ProfilesDb"));
        setField(profilesLogic, "teammates.logic.core.ProfilesLogic", "profilesDb", profilesDb);
        
        /* This test fails because method [teammates.logic.core.ProfilesLogic.deleteStudentProfile] produces [java.lang.IllegalStateException: You must call ObjectifyService.init() before using Objectify]
            com.google.common.base.Preconditions.checkState(Preconditions.java:502)
            com.googlecode.objectify.ObjectifyService.factory(ObjectifyService.java:34)
            com.googlecode.objectify.Key.newKeyFactory(Key.java:157)
            com.googlecode.objectify.Key.<init>(Key.java:143)
            com.googlecode.objectify.Key.<init>(Key.java:100)
            com.googlecode.objectify.Key.create(Key.java:40)
            teammates.storage.api.ProfilesDb.getStudentProfileEntityFromDb(ProfilesDb.java:113)
            teammates.storage.api.ProfilesDb.deleteStudentProfile(ProfilesDb.java:98)
            teammates.logic.core.ProfilesLogic.deleteStudentProfile(ProfilesLogic.java:54) */
        profilesLogic.deleteStudentProfile(null);
    }
    ///endregion

    ///endregion
}
