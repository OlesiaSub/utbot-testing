package teammates.logic.core;

import com.googlecode.objectify.ObjectifyService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import teammates.common.datatransfer.AttributesDeletionQuery;
import teammates.common.datatransfer.attributes.EntityAttributes;
import teammates.common.datatransfer.attributes.InstructorAttributes.UpdateOptionsWithGoogleId;
import teammates.common.datatransfer.attributes.InstructorAttributes;
import teammates.storage.api.InstructorsDb;
import teammates.storage.search.InstructorSearchManager;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;

import com.googlecode.objectify.ObjectifyFactory;
import teammates.storage.search.SearchManagerFactory;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.setStaticField;

public final class InstructorsLogicTest {
    ///region Test suites for executable teammates.logic.core.InstructorsLogic.updateInstructorByGoogleIdCascade

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateInstructorByGoogleIdCascade(teammates.common.datatransfer.attributes.InstructorAttributes.UpdateOptionsWithGoogleId)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#updateInstructorByGoogleIdCascade(UpdateOptionsWithGoogleId)}
     * @utbot.invokes {@link UpdateOptionsWithGoogleId#getCourseId()}
     * @utbot.throwsException {@link NullPointerException} in: instructorsDb.getInstructorForGoogleId(updateOptions.getCourseId(), updateOptions.getGoogleId())
     */
    @Test
    @DisplayName("updateInstructorByGoogleIdCascade: instructorsDb.getInstructorForGoogleId(updateOptions.getCourseId(), updateOptions.getGoogleId()) : True -> ThrowNullPointerException")
    public void testUpdateInstructorByGoogleIdCascade_InstructorAttributesGetCourseId() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", null);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.updateInstructorByGoogleIdCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.updateInstructorByGoogleIdCascade(InstructorsLogic.java:213) */
        instructorsLogic.updateInstructorByGoogleIdCascade(null);
    }

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#updateInstructorByGoogleIdCascade(UpdateOptionsWithGoogleId)}
     * @utbot.invokes {@link UpdateOptionsWithGoogleId#getCourseId()}
     * @utbot.invokes {@link UpdateOptionsWithGoogleId#getGoogleId()}
     * @utbot.throwsException {@link NullPointerException} in: instructorsDb.getInstructorForGoogleId(updateOptions.getCourseId(), updateOptions.getGoogleId())
     */
    @Test
    @DisplayName("updateInstructorByGoogleIdCascade: instructorsDb.getInstructorForGoogleId(updateOptions.getCourseId(), updateOptions.getGoogleId()) : True -> ThrowNullPointerException")
    public void testUpdateInstructorByGoogleIdCascade_InstructorAttributesGetGoogleId() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", null);
        UpdateOptionsWithGoogleId updateOptionsWithGoogleId = ((UpdateOptionsWithGoogleId) createInstance("teammates.common.datatransfer.attributes.InstructorAttributes$UpdateOptionsWithGoogleId"));
        setField(updateOptionsWithGoogleId, "teammates.common.datatransfer.attributes.InstructorAttributes$UpdateOptionsWithGoogleId", "courseId", null);
        setField(updateOptionsWithGoogleId, "teammates.common.datatransfer.attributes.InstructorAttributes$UpdateOptionsWithGoogleId", "googleId", null);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.updateInstructorByGoogleIdCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.updateInstructorByGoogleIdCascade(InstructorsLogic.java:213) */
        instructorsLogic.updateInstructorByGoogleIdCascade(updateOptionsWithGoogleId);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateInstructorByGoogleIdCascade(teammates.common.datatransfer.attributes.InstructorAttributes.UpdateOptionsWithGoogleId)

    @Test
    public void testUpdateInstructorByGoogleIdCascade1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        UpdateOptionsWithGoogleId updateOptionsWithGoogleId = ((UpdateOptionsWithGoogleId) createInstance("teammates.common.datatransfer.attributes.InstructorAttributes$UpdateOptionsWithGoogleId"));
        setField(updateOptionsWithGoogleId, "teammates.common.datatransfer.attributes.InstructorAttributes$UpdateOptionsWithGoogleId", "courseId", null);
        setField(updateOptionsWithGoogleId, "teammates.common.datatransfer.attributes.InstructorAttributes$UpdateOptionsWithGoogleId", "googleId", null);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.updateInstructorByGoogleIdCascade] produces [java.lang.AssertionError]
            teammates.storage.api.InstructorsDb.getInstructorForGoogleId(InstructorsDb.java:143)
            teammates.logic.core.InstructorsLogic.updateInstructorByGoogleIdCascade(InstructorsLogic.java:213) */
        instructorsLogic.updateInstructorByGoogleIdCascade(updateOptionsWithGoogleId);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.inst

    ///region OTHER: SUCCESSFUL EXECUTIONS for method inst()

    @Test
    public void testInst1() throws Exception {
        InstructorsLogic actual = InstructorsLogic.inst();

        InstructorsLogic expected = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(expected, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        setField(expected, "teammates.logic.core.InstructorsLogic", "frLogic", null);
        setField(expected, "teammates.logic.core.InstructorsLogic", "frcLogic", null);
        setField(expected, "teammates.logic.core.InstructorsLogic", "fqLogic", null);
        setField(expected, "teammates.logic.core.InstructorsLogic", "fsLogic", null);
        setField(expected, "teammates.logic.core.InstructorsLogic", "deLogic", null);
        InstructorsDb expectedInstructorsDb = ((InstructorsDb) getFieldValue(expected, "teammates.logic.core.InstructorsLogic", "instructorsDb"));
        InstructorsDb actualInstructorsDb = ((InstructorsDb) getFieldValue(actual, "teammates.logic.core.InstructorsLogic", "instructorsDb"));

        FeedbackResponsesLogic actualFrLogic = ((FeedbackResponsesLogic) getFieldValue(actual, "teammates.logic.core.InstructorsLogic", "frLogic"));
        assertNull(actualFrLogic);

        FeedbackResponseCommentsLogic actualFrcLogic = ((FeedbackResponseCommentsLogic) getFieldValue(actual, "teammates.logic.core.InstructorsLogic", "frcLogic"));
        assertNull(actualFrcLogic);

        FeedbackQuestionsLogic actualFqLogic = ((FeedbackQuestionsLogic) getFieldValue(actual, "teammates.logic.core.InstructorsLogic", "fqLogic"));
        assertNull(actualFqLogic);

        FeedbackSessionsLogic actualFsLogic = ((FeedbackSessionsLogic) getFieldValue(actual, "teammates.logic.core.InstructorsLogic", "fsLogic"));
        assertNull(actualFsLogic);

        DeadlineExtensionsLogic actualDeLogic = ((DeadlineExtensionsLogic) getFieldValue(actual, "teammates.logic.core.InstructorsLogic", "deLogic"));
        assertNull(actualDeLogic);

    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.initLogicDependencies

    ///region OTHER: SECURITY for method initLogicDependencies()

    @Test
    @Disabled(value = "Disabled due to sandbox")
    public void testInitLogicDependencies1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));

        assertThrows(ExceptionInInitializerError.class, () -> instructorsLogic.initLogicDependencies());
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.putDocument

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putDocument(teammates.common.datatransfer.attributes.InstructorAttributes)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#putDocument(InstructorAttributes)}
     * @utbot.invokes {@link InstructorsDb#putDocument(InstructorAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: instructorsDb.putDocument(instructor);
     */
    @Test
    @DisplayName("putDocument: instructorsDb.putDocument(instructor) : True -> ThrowNullPointerException")
    public void testPutDocument_InstructorsDbPutDocument() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", null);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.putDocument] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.putDocument(InstructorsLogic.java:65) */
        instructorsLogic.putDocument(null);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method putDocument(teammates.common.datatransfer.attributes.InstructorAttributes)

    @Test
    public void testPutDocument1() throws Exception {
        Class searchManagerFactoryClazz = Class.forName("teammates.storage.search.SearchManagerFactory");
        InstructorSearchManager prevInstructorInstance = ((InstructorSearchManager) getStaticFieldValue(searchManagerFactoryClazz, "instructorInstance"));
        try {
            setStaticField(searchManagerFactoryClazz, "instructorInstance", null);
            InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
            InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
            setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
            
            /* This test fails because method [teammates.logic.core.InstructorsLogic.putDocument] produces [java.lang.NullPointerException]
                teammates.storage.api.InstructorsDb.putDocument(InstructorsDb.java:55)
                teammates.logic.core.InstructorsLogic.putDocument(InstructorsLogic.java:65) */
            instructorsLogic.putDocument(null);
        } finally {
            setStaticField(SearchManagerFactory.class, "instructorInstance", prevInstructorInstance);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.searchInstructorsInWholeSystem

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method searchInstructorsInWholeSystem(java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#searchInstructorsInWholeSystem(String)}
     */
    @Test
    @DisplayName("searchInstructorsInWholeSystem: queryString = blank string -> throw NullPointerException")
    public void testSearchInstructorsInWholeSystemThrowsNPEWithBlankString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.searchInstructorsInWholeSystem] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.searchInstructorsInWholeSystem(InstructorsLogic.java:76) */
        instructorsLogic.searchInstructorsInWholeSystem("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.createInstructor

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createInstructor(teammates.common.datatransfer.attributes.InstructorAttributes)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#createInstructor(InstructorAttributes)}
     * @utbot.invokes {@link InstructorsDb#createEntity(EntityAttributes)}
     * @utbot.throwsException {@link NullPointerException} in: return instructorsDb.createEntity(instructorToAdd);
     */
    @Test
    @DisplayName("createInstructor: return instructorsDb.createEntity(instructorToAdd) : True -> ThrowNullPointerException")
    public void testCreateInstructor_InstructorsDbCreateEntity() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", null);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.createInstructor] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.createInstructor(InstructorsLogic.java:88) */
        instructorsLogic.createInstructor(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.setArchiveStatusOfInstructor

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method setArchiveStatusOfInstructor(java.lang.String, java.lang.String, boolean)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#setArchiveStatusOfInstructor(String, String, boolean)}
     */
    @Test
    @DisplayName("setArchiveStatusOfInstructor: googleId != empty string, courseId = empty string, archiveStatus = false -> throw NullPointerException")
    public void testSetArchiveStatusOfInstructorThrowsNPEWithNonEmptyStringAndEmptyString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.setArchiveStatusOfInstructor] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.setArchiveStatusOfInstructor(InstructorsLogic.java:97) */
        instructorsLogic.setArchiveStatusOfInstructor("string", "", false);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setArchiveStatusOfInstructor(java.lang.String, java.lang.String, boolean)

    @Test
    public void testSetArchiveStatusOfInstructor1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", null);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.setArchiveStatusOfInstructor] produces [java.lang.AssertionError]
            teammates.common.datatransfer.attributes.InstructorAttributes$UpdateOptionsWithGoogleId.<init>(InstructorAttributes.java:516)
            teammates.common.datatransfer.attributes.InstructorAttributes$UpdateOptionsWithGoogleId$Builder.<init>(InstructorAttributes.java:547)
            teammates.common.datatransfer.attributes.InstructorAttributes.updateOptionsWithGoogleIdBuilder(InstructorAttributes.java:408)
            teammates.logic.core.InstructorsLogic.setArchiveStatusOfInstructor(InstructorsLogic.java:98) */
        instructorsLogic.setArchiveStatusOfInstructor(null, null, false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.verifyAllInstructorsExistInCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method verifyAllInstructorsExistInCourse(java.lang.String, java.util.Collection)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#verifyAllInstructorsExistInCourse(String, Collection)}
     */
    @Test
    @DisplayName("verifyAllInstructorsExistInCourse: courseId has special characters, instructorEmailAddresses = test collection -> throw NullPointerException")
    public void testVerifyAllInstructorsExistInCourseThrowsNPEWithBlankString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        ArrayList instructorEmailAddresses = new ArrayList();
        instructorEmailAddresses.add("tyvjm");
        instructorEmailAddresses.add("jkmqh");
        instructorEmailAddresses.add("qylov");
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.verifyAllInstructorsExistInCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.verifyAllInstructorsExistInCourse(InstructorsLogic.java:112) */
        instructorsLogic.verifyAllInstructorsExistInCourse("\n\t\r", instructorEmailAddresses);
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method verifyAllInstructorsExistInCourse(java.lang.String, java.util.Collection)

    @Test
    public void testVerifyAllInstructorsExistInCourse1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        ArrayList instructorEmailAddresses = new ArrayList();

        instructorsLogic.verifyAllInstructorsExistInCourse(null, instructorEmailAddresses);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.getInstructorForEmail

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInstructorForEmail(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#getInstructorForEmail(String, String)}
     */
    @Test
    @DisplayName("getInstructorForEmail: courseId has special characters, email = blank string -> throw NullPointerException")
    public void testGetInstructorForEmailThrowsNPEWithBlankStrings() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorForEmail] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getInstructorForEmail(InstructorsLogic.java:122) */
        instructorsLogic.getInstructorForEmail("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstructorForEmail(java.lang.String, java.lang.String)

    @Test
    public void testGetInstructorForEmail1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorForEmail] produces [java.lang.AssertionError]
            teammates.storage.api.InstructorsDb.getInstructorForEmail(InstructorsDb.java:123)
            teammates.logic.core.InstructorsLogic.getInstructorForEmail(InstructorsLogic.java:122) */
        instructorsLogic.getInstructorForEmail(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.getInstructorById

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInstructorById(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#getInstructorById(String, String)}
     */
    @Test
    @DisplayName("getInstructorById: courseId has special characters, email = blank string -> throw NullPointerException")
    public void testGetInstructorByIdThrowsNPEWithBlankStrings() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorById] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getInstructorById(InstructorsLogic.java:129) */
        instructorsLogic.getInstructorById("\n\t\r", "   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstructorById(java.lang.String, java.lang.String)

    @Test
    public void testGetInstructorById1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorById] produces [java.lang.AssertionError]
            teammates.storage.api.InstructorsDb.getInstructorById(InstructorsDb.java:133)
            teammates.logic.core.InstructorsLogic.getInstructorById(InstructorsLogic.java:129) */
        instructorsLogic.getInstructorById(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.getInstructorForGoogleId

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInstructorForGoogleId(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#getInstructorForGoogleId(String, String)}
     */
    @Test
    @DisplayName("getInstructorForGoogleId: courseId has special characters, googleId = blank string -> throw NullPointerException")
    public void testGetInstructorForGoogleIdThrowsNPEWithBlankStrings() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorForGoogleId] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getInstructorForGoogleId(InstructorsLogic.java:136) */
        instructorsLogic.getInstructorForGoogleId("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.getInstructorForRegistrationKey

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInstructorForRegistrationKey(java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#getInstructorForRegistrationKey(String)}
     */
    @Test
    @DisplayName("getInstructorForRegistrationKey: registrationKey = blank string -> throw NullPointerException")
    public void testGetInstructorForRegistrationKeyThrowsNPEWithBlankString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorForRegistrationKey] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getInstructorForRegistrationKey(InstructorsLogic.java:143) */
        instructorsLogic.getInstructorForRegistrationKey("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstructorForRegistrationKey(java.lang.String)

    @Test
    public void testGetInstructorForRegistrationKey1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorForRegistrationKey] produces [java.lang.AssertionError]
            teammates.storage.api.InstructorsDb.getInstructorForRegistrationKey(InstructorsDb.java:153)
            teammates.logic.core.InstructorsLogic.getInstructorForRegistrationKey(InstructorsLogic.java:143) */
        instructorsLogic.getInstructorForRegistrationKey(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.getInstructorEmailsForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInstructorEmailsForCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#getInstructorEmailsForCourse(String)}
     */
    @Test
    @DisplayName("getInstructorEmailsForCourse: courseId = blank string -> throw NullPointerException")
    public void testGetInstructorEmailsForCourseThrowsNPEWithBlankString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorEmailsForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getInstructorEmailsForCourse(InstructorsLogic.java:150) */
        instructorsLogic.getInstructorEmailsForCourse("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstructorEmailsForCourse(java.lang.String)

    @Test
    public void testGetInstructorEmailsForCourse1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorEmailsForCourse] produces [java.lang.AssertionError]
            teammates.storage.api.InstructorsDb.getInstructorEmailsForCourse(InstructorsDb.java:173)
            teammates.logic.core.InstructorsLogic.getInstructorEmailsForCourse(InstructorsLogic.java:150) */
        instructorsLogic.getInstructorEmailsForCourse(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.getInstructorsForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInstructorsForCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#getInstructorsForCourse(String)}
     */
    @Test
    @DisplayName("getInstructorsForCourse: courseId = blank string -> throw NullPointerException")
    public void testGetInstructorsForCourseThrowsNPEWithBlankString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorsForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getInstructorsForCourse(InstructorsLogic.java:160) */
        instructorsLogic.getInstructorsForCourse("   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInstructorsForGoogleId(java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#getInstructorsForGoogleId(String)}
     */
    @Test
    @DisplayName("getInstructorsForGoogleId: googleId = blank string -> throw NullPointerException")
    public void testGetInstructorsForGoogleIdThrowsNPEWithBlankString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId(InstructorsLogic.java:179)
            teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId(InstructorsLogic.java:170) */
        instructorsLogic.getInstructorsForGoogleId("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstructorsForGoogleId(java.lang.String)

    @Test
    public void testGetInstructorsForGoogleId1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId] produces [java.lang.AssertionError]
            teammates.storage.api.InstructorsDb.getInstructorsForGoogleId(InstructorsDb.java:164)
            teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId(InstructorsLogic.java:179)
            teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId(InstructorsLogic.java:170) */
        instructorsLogic.getInstructorsForGoogleId(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInstructorsForGoogleId(java.lang.String, boolean)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#getInstructorsForGoogleId(String, boolean)}
     */
    @Test
    @DisplayName("getInstructorsForGoogleId: googleId = blank string, omitArchived = false -> throw NullPointerException")
    public void testGetInstructorsForGoogleIdThrowsNPEWithBlankString1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId(InstructorsLogic.java:179) */
        instructorsLogic.getInstructorsForGoogleId("   ", false);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstructorsForGoogleId(java.lang.String, boolean)

    @Test
    public void testGetInstructorsForGoogleId2() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId] produces [java.lang.AssertionError]
            teammates.storage.api.InstructorsDb.getInstructorsForGoogleId(InstructorsDb.java:164)
            teammates.logic.core.InstructorsLogic.getInstructorsForGoogleId(InstructorsLogic.java:179) */
        instructorsLogic.getInstructorsForGoogleId(null, false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.verifyAtLeastOneInstructorIsDisplayed

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method verifyAtLeastOneInstructorIsDisplayed(java.lang.String, boolean, boolean)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#verifyAtLeastOneInstructorIsDisplayed(String, boolean, boolean)}
     */
    @Test
    @DisplayName("verifyAtLeastOneInstructorIsDisplayed: courseId = empty string, isOriginalInstructorDisplayed = true, isEditedInstructorDisplayed = false -> throw NullPointerException")
    public void testVerifyAtLeastOneInstructorIsDisplayedThrowsNPEWithEmptyString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.verifyAtLeastOneInstructorIsDisplayed] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.verifyAtLeastOneInstructorIsDisplayed(InstructorsLogic.java:190) */
        instructorsLogic.verifyAtLeastOneInstructorIsDisplayed("", true, false);
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verifyAtLeastOneInstructorIsDisplayed(java.lang.String, boolean, boolean)

    @Test
    public void testVerifyAtLeastOneInstructorIsDisplayed1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.verifyAtLeastOneInstructorIsDisplayed] produces [java.lang.AssertionError]
            teammates.storage.api.InstructorsDb.getInstructorsDisplayedToStudents(InstructorsDb.java:196)
            teammates.logic.core.InstructorsLogic.verifyAtLeastOneInstructorIsDisplayed(InstructorsLogic.java:190) */
        instructorsLogic.verifyAtLeastOneInstructorIsDisplayed(null, false, false);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.deleteInstructors

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deleteInstructors(teammates.common.datatransfer.AttributesDeletionQuery)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#deleteInstructors(AttributesDeletionQuery)}
     * @utbot.invokes {@link InstructorsDb#deleteInstructors(AttributesDeletionQuery)}
     * @utbot.throwsException {@link NullPointerException} in: instructorsDb.deleteInstructors(query);
     */
    @Test
    @DisplayName("deleteInstructors: instructorsDb.deleteInstructors(query) : True -> ThrowNullPointerException")
    public void testDeleteInstructors_InstructorsDbDeleteInstructors() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", null);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.deleteInstructors] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.deleteInstructors(InstructorsLogic.java:310) */
        instructorsLogic.deleteInstructors(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.deleteInstructorCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteInstructorCascade(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#deleteInstructorCascade(String, String)}
     */
    @Test
    @DisplayName("deleteInstructorCascade: courseId has special characters, email = blank string -> throw NullPointerException")
    public void testDeleteInstructorCascadeThrowsNPEWithBlankStrings() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.deleteInstructorCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getInstructorForEmail(InstructorsLogic.java:122)
            teammates.logic.core.InstructorsLogic.deleteInstructorCascade(InstructorsLogic.java:319) */
        instructorsLogic.deleteInstructorCascade("\n\t\r", "   ");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.deleteInstructorsForGoogleIdCascade

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method deleteInstructorsForGoogleIdCascade(java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#deleteInstructorsForGoogleIdCascade(String)}
     */
    @Test
    @DisplayName("deleteInstructorsForGoogleIdCascade: googleId = blank string -> throw NullPointerException")
    public void testDeleteInstructorsForGoogleIdCascadeThrowsNPEWithBlankString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.deleteInstructorsForGoogleIdCascade] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.deleteInstructorsForGoogleIdCascade(InstructorsLogic.java:335) */
        instructorsLogic.deleteInstructorsForGoogleIdCascade("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method deleteInstructorsForGoogleIdCascade(java.lang.String)

    @Test
    public void testDeleteInstructorsForGoogleIdCascade1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.deleteInstructorsForGoogleIdCascade] produces [java.lang.AssertionError]
            teammates.storage.api.InstructorsDb.getInstructorsForGoogleId(InstructorsDb.java:164)
            teammates.logic.core.InstructorsLogic.deleteInstructorsForGoogleIdCascade(InstructorsLogic.java:335) */
        instructorsLogic.deleteInstructorsForGoogleIdCascade(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.getCoOwnersForCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getCoOwnersForCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#getCoOwnersForCourse(String)}
     */
    @Test
    @DisplayName("getCoOwnersForCourse: courseId = blank string -> throw NullPointerException")
    public void testGetCoOwnersForCourseThrowsNPEWithBlankString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getCoOwnersForCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getInstructorsForCourse(InstructorsLogic.java:160)
            teammates.logic.core.InstructorsLogic.getCoOwnersForCourse(InstructorsLogic.java:347) */
        instructorsLogic.getCoOwnersForCourse("   ");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCoOwnersForCourse(java.lang.String)

    @Test
    public void testGetCoOwnersForCourse1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getCoOwnersForCourse] produces [java.lang.AssertionError]
            teammates.storage.api.InstructorsDb.getInstructorsForCourse(InstructorsDb.java:187)
            teammates.logic.core.InstructorsLogic.getInstructorsForCourse(InstructorsLogic.java:160)
            teammates.logic.core.InstructorsLogic.getCoOwnersForCourse(InstructorsLogic.java:347) */
        instructorsLogic.getCoOwnersForCourse(null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.resetInstructorGoogleId

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method resetInstructorGoogleId(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#resetInstructorGoogleId(String, String)}
     */
    @Test
    @DisplayName("resetInstructorGoogleId: originalEmail = blank string, courseId = empty string -> throw NullPointerException")
    public void testResetInstructorGoogleIdThrowsNPEWithBlankStringAndEmptyString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.resetInstructorGoogleId] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.resetInstructorGoogleId(InstructorsLogic.java:363) */
        instructorsLogic.resetInstructorGoogleId("   ", "");
    }
    ///endregion

    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method resetInstructorGoogleId(java.lang.String, java.lang.String)

    @Test
    public void testResetInstructorGoogleId1() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", null);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.resetInstructorGoogleId] produces [java.lang.AssertionError]
            teammates.common.datatransfer.attributes.InstructorAttributes$UpdateOptionsWithEmail.<init>(InstructorAttributes.java:455)
            teammates.common.datatransfer.attributes.InstructorAttributes$UpdateOptionsWithEmail$Builder.<init>(InstructorAttributes.java:484)
            teammates.common.datatransfer.attributes.InstructorAttributes.updateOptionsWithEmailBuilder(InstructorAttributes.java:400)
            teammates.logic.core.InstructorsLogic.resetInstructorGoogleId(InstructorsLogic.java:364) */
        instructorsLogic.resetInstructorGoogleId(null, null);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.regenerateInstructorRegistrationKey

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method regenerateInstructorRegistrationKey(java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#regenerateInstructorRegistrationKey(String, String)}
     */
    @Test
    @DisplayName("regenerateInstructorRegistrationKey: courseId = blank string, email = empty string -> throw NullPointerException")
    public void testRegenerateInstructorRegistrationKeyThrowsNPEWithBlankStringAndEmptyString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.regenerateInstructorRegistrationKey] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.regenerateInstructorRegistrationKey(InstructorsLogic.java:412) */
        instructorsLogic.regenerateInstructorRegistrationKey("   ", "");
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.isInstructorInAnyCourse

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method isInstructorInAnyCourse(java.lang.String)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#isInstructorInAnyCourse(String)}
     */
    @Test
    @DisplayName("isInstructorInAnyCourse: googleId = blank string -> throw NullPointerException")
    public void testIsInstructorInAnyCourseThrowsNPEWithBlankString() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.isInstructorInAnyCourse] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.isInstructorInAnyCourse(InstructorsLogic.java:426) */
        instructorsLogic.isInstructorInAnyCourse("   ");
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method isInstructorInAnyCourse(java.lang.String)

    @Test
    public void testIsInstructorInAnyCourse1() throws Exception {
        Class objectifyServiceClazz = Class.forName("com.googlecode.objectify.ObjectifyService");
        ObjectifyFactory prevFactory = ((ObjectifyFactory) getStaticFieldValue(objectifyServiceClazz, "factory"));
        try {
            ObjectifyFactory factory = ((ObjectifyFactory) createInstance("com.googlecode.objectify.ObjectifyFactory"));
            setStaticField(objectifyServiceClazz, "factory", factory);
            InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
            InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
            setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", instructorsDb);
            
            /* This test fails because method [teammates.logic.core.InstructorsLogic.isInstructorInAnyCourse] produces [java.lang.NullPointerException]
                com.googlecode.objectify.ObjectifyFactory.ofy(ObjectifyFactory.java:407)
                com.googlecode.objectify.ObjectifyService.ofy(ObjectifyService.java:51)
                teammates.storage.api.InstructorsDb.load(InstructorsDb.java:423)
                teammates.storage.api.InstructorsDb.getInstructorsForGoogleIdQuery(InstructorsDb.java:397)
                teammates.storage.api.InstructorsDb.hasInstructorsForGoogleId(InstructorsDb.java:393)
                teammates.logic.core.InstructorsLogic.isInstructorInAnyCourse(InstructorsLogic.java:426) */
            instructorsLogic.isInstructorInAnyCourse(null);
        } finally {
            setStaticField(ObjectifyService.class, "factory", prevFactory);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.InstructorsLogic.getNumInstructorsByTimeRange

    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumInstructorsByTimeRange(java.time.Instant, java.time.Instant)

    /**
     * @utbot.classUnderTest {@link InstructorsLogic}
     * @utbot.methodUnderTest {@link InstructorsLogic#getNumInstructorsByTimeRange(Instant, Instant)}
     * @utbot.invokes {@link InstructorsDb#getNumInstructorsByTimeRange(Instant, Instant)}
     * @utbot.throwsException {@link NullPointerException} in: return instructorsDb.getNumInstructorsByTimeRange(startTime, endTime);
     */
    @Test
    @DisplayName("getNumInstructorsByTimeRange: return instructorsDb.getNumInstructorsByTimeRange(startTime, endTime) : True -> ThrowNullPointerException")
    public void testGetNumInstructorsByTimeRange_InstructorsDbGetNumInstructorsByTimeRange() throws Exception {
        InstructorsLogic instructorsLogic = ((InstructorsLogic) createInstance("teammates.logic.core.InstructorsLogic"));
        setField(instructorsLogic, "teammates.logic.core.InstructorsLogic", "instructorsDb", null);
        
        /* This test fails because method [teammates.logic.core.InstructorsLogic.getNumInstructorsByTimeRange] produces [java.lang.NullPointerException]
            teammates.logic.core.InstructorsLogic.getNumInstructorsByTimeRange(InstructorsLogic.java:433) */
        instructorsLogic.getNumInstructorsByTimeRange(null, null);
    }
    ///endregion

    ///endregion
}
