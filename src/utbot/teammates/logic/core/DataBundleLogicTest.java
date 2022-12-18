package teammates.logic.core;

import org.junit.jupiter.api.Test;
import teammates.common.exception.InvalidParametersException;
import teammates.storage.api.AccountsDb;
import teammates.storage.api.AccountRequestsDb;
import teammates.storage.api.ProfilesDb;
import teammates.storage.api.CoursesDb;
import teammates.storage.api.DeadlineExtensionsDb;
import teammates.storage.api.StudentsDb;
import teammates.storage.api.InstructorsDb;
import teammates.storage.api.FeedbackSessionsDb;
import teammates.storage.api.FeedbackQuestionsDb;
import teammates.storage.api.FeedbackResponsesDb;
import teammates.storage.api.FeedbackResponseCommentsDb;
import teammates.storage.api.NotificationsDb;
import teammates.common.datatransfer.DataBundle;

import java.util.Map;

import static org.utbot.runtime.utils.UtUtils.getStaticFieldValue;
import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setStaticField;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static java.util.Collections.emptyMap;
import static org.junit.jupiter.api.Assertions.assertThrows;

public final class DataBundleLogicTest {
    ///region Test suites for executable teammates.logic.core.DataBundleLogic.inst

    ///region OTHER: SUCCESSFUL EXECUTIONS for method inst()

    @Test
    public void testInst1() throws Exception {
        Class accountsDbClazz = Class.forName("teammates.storage.api.AccountsDb");
        AccountsDb prevInstance = ((AccountsDb) getStaticFieldValue(accountsDbClazz, "instance"));
        Class accountRequestsDbClazz = Class.forName("teammates.storage.api.AccountRequestsDb");
        AccountRequestsDb prevInstance1 = ((AccountRequestsDb) getStaticFieldValue(accountRequestsDbClazz, "instance"));
        Class profilesDbClazz = Class.forName("teammates.storage.api.ProfilesDb");
        ProfilesDb prevInstance2 = ((ProfilesDb) getStaticFieldValue(profilesDbClazz, "instance"));
        Class coursesDbClazz = Class.forName("teammates.storage.api.CoursesDb");
        CoursesDb prevInstance3 = ((CoursesDb) getStaticFieldValue(coursesDbClazz, "instance"));
        Class deadlineExtensionsDbClazz = Class.forName("teammates.storage.api.DeadlineExtensionsDb");
        DeadlineExtensionsDb prevInstance4 = ((DeadlineExtensionsDb) getStaticFieldValue(deadlineExtensionsDbClazz, "instance"));
        try {
            AccountsDb instance = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
            setStaticField(accountsDbClazz, "instance", instance);
            AccountRequestsDb instance1 = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
            setStaticField(accountRequestsDbClazz, "instance", instance1);
            ProfilesDb instance2 = ((ProfilesDb) createInstance("teammates.storage.api.ProfilesDb"));
            setStaticField(profilesDbClazz, "instance", instance2);
            CoursesDb instance3 = ((CoursesDb) createInstance("teammates.storage.api.CoursesDb"));
            setStaticField(coursesDbClazz, "instance", instance3);
            DeadlineExtensionsDb instance4 = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setStaticField(deadlineExtensionsDbClazz, "instance", instance4);

            DataBundleLogic actual = DataBundleLogic.inst();

            DataBundleLogic expected = ((DataBundleLogic) createInstance("teammates.logic.core.DataBundleLogic"));
            AccountsDb accountsDb = ((AccountsDb) createInstance("teammates.storage.api.AccountsDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "accountsDb", accountsDb);
            AccountRequestsDb accountRequestsDb = ((AccountRequestsDb) createInstance("teammates.storage.api.AccountRequestsDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "accountRequestsDb", accountRequestsDb);
            ProfilesDb profilesDb = ((ProfilesDb) createInstance("teammates.storage.api.ProfilesDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "profilesDb", profilesDb);
            CoursesDb coursesDb = ((CoursesDb) createInstance("teammates.storage.api.CoursesDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "coursesDb", coursesDb);
            DeadlineExtensionsDb deadlineExtensionsDb = ((DeadlineExtensionsDb) createInstance("teammates.storage.api.DeadlineExtensionsDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "deadlineExtensionsDb", deadlineExtensionsDb);
            StudentsDb studentsDb = ((StudentsDb) createInstance("teammates.storage.api.StudentsDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "studentsDb", studentsDb);
            InstructorsDb instructorsDb = ((InstructorsDb) createInstance("teammates.storage.api.InstructorsDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "instructorsDb", instructorsDb);
            FeedbackSessionsDb feedbackSessionsDb = ((FeedbackSessionsDb) createInstance("teammates.storage.api.FeedbackSessionsDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "fbDb", feedbackSessionsDb);
            FeedbackQuestionsDb feedbackQuestionsDb = ((FeedbackQuestionsDb) createInstance("teammates.storage.api.FeedbackQuestionsDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "fqDb", feedbackQuestionsDb);
            FeedbackResponsesDb feedbackResponsesDb = ((FeedbackResponsesDb) createInstance("teammates.storage.api.FeedbackResponsesDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "frDb", feedbackResponsesDb);
            FeedbackResponseCommentsDb feedbackResponseCommentsDb = ((FeedbackResponseCommentsDb) createInstance("teammates.storage.api.FeedbackResponseCommentsDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "fcDb", feedbackResponseCommentsDb);
            NotificationsDb notificationsDb = ((NotificationsDb) createInstance("teammates.storage.api.NotificationsDb"));
            setField(expected, "teammates.logic.core.DataBundleLogic", "nfDb", notificationsDb);
            AccountsDb expectedAccountsDb = ((AccountsDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "accountsDb"));
            AccountsDb actualAccountsDb = ((AccountsDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "accountsDb"));

            AccountRequestsDb expectedAccountRequestsDb = ((AccountRequestsDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "accountRequestsDb"));
            AccountRequestsDb actualAccountRequestsDb = ((AccountRequestsDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "accountRequestsDb"));

            ProfilesDb expectedProfilesDb = ((ProfilesDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "profilesDb"));
            ProfilesDb actualProfilesDb = ((ProfilesDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "profilesDb"));

            CoursesDb expectedCoursesDb = ((CoursesDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "coursesDb"));
            CoursesDb actualCoursesDb = ((CoursesDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "coursesDb"));

            DeadlineExtensionsDb expectedDeadlineExtensionsDb = ((DeadlineExtensionsDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "deadlineExtensionsDb"));
            DeadlineExtensionsDb actualDeadlineExtensionsDb = ((DeadlineExtensionsDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "deadlineExtensionsDb"));

            StudentsDb expectedStudentsDb = ((StudentsDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "studentsDb"));
            StudentsDb actualStudentsDb = ((StudentsDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "studentsDb"));

            InstructorsDb expectedInstructorsDb = ((InstructorsDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "instructorsDb"));
            InstructorsDb actualInstructorsDb = ((InstructorsDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "instructorsDb"));

            FeedbackSessionsDb expectedFbDb = ((FeedbackSessionsDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "fbDb"));
            FeedbackSessionsDb actualFbDb = ((FeedbackSessionsDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "fbDb"));

            FeedbackQuestionsDb expectedFqDb = ((FeedbackQuestionsDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "fqDb"));
            FeedbackQuestionsDb actualFqDb = ((FeedbackQuestionsDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "fqDb"));

            FeedbackResponsesDb expectedFrDb = ((FeedbackResponsesDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "frDb"));
            FeedbackResponsesDb actualFrDb = ((FeedbackResponsesDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "frDb"));

            FeedbackResponseCommentsDb expectedFcDb = ((FeedbackResponseCommentsDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "fcDb"));
            FeedbackResponseCommentsDb actualFcDb = ((FeedbackResponseCommentsDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "fcDb"));

            NotificationsDb expectedNfDb = ((NotificationsDb) getFieldValue(expected, "teammates.logic.core.DataBundleLogic", "nfDb"));
            NotificationsDb actualNfDb = ((NotificationsDb) getFieldValue(actual, "teammates.logic.core.DataBundleLogic", "nfDb"));

        } finally {
            setStaticField(AccountsDb.class, "instance", prevInstance);
            setStaticField(AccountRequestsDb.class, "instance", prevInstance1);
            setStaticField(ProfilesDb.class, "instance", prevInstance2);
            setStaticField(CoursesDb.class, "instance", prevInstance3);
            setStaticField(DeadlineExtensionsDb.class, "instance", prevInstance4);
        }
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DataBundleLogic.persistDataBundle

    ///region

    @Test
    public void testPersistDataBundle1() throws Exception {
        DataBundleLogic dataBundleLogic = ((DataBundleLogic) createInstance("teammates.logic.core.DataBundleLogic"));
        DataBundle dataBundle = new DataBundle();
        Map map = emptyMap();
        dataBundle.accounts = map;
        dataBundle.accountRequests = map;
        dataBundle.courses = map;
        dataBundle.deadlineExtensions = map;
        dataBundle.instructors = map;
        dataBundle.students = map;
        dataBundle.feedbackSessions = map;
        dataBundle.feedbackQuestions = map;
        dataBundle.feedbackResponses = map;
        dataBundle.feedbackResponseComments = map;
        dataBundle.profiles = map;
        dataBundle.notifications = map;
        
        /* This test fails because method [teammates.logic.core.DataBundleLogic.persistDataBundle] produces [java.lang.NullPointerException]
            teammates.logic.core.DataBundleLogic.persistDataBundle(DataBundleLogic.java:113) */
        dataBundleLogic.persistDataBundle(dataBundle);
    }

    @Test
    public void testPersistDataBundle2() throws Exception {
        DataBundleLogic dataBundleLogic = ((DataBundleLogic) createInstance("teammates.logic.core.DataBundleLogic"));
        DataBundle dataBundle = new DataBundle();
        dataBundle.accounts = null;
        
        /* This test fails because method [teammates.logic.core.DataBundleLogic.persistDataBundle] produces [java.lang.NullPointerException]
            teammates.logic.core.DataBundleLogic.persistDataBundle(DataBundleLogic.java:90) */
        dataBundleLogic.persistDataBundle(dataBundle);
    }

    @Test
    public void testPersistDataBundle3() throws Exception {
        DataBundleLogic dataBundleLogic = ((DataBundleLogic) createInstance("teammates.logic.core.DataBundleLogic"));

        assertThrows(InvalidParametersException.class, () -> dataBundleLogic.persistDataBundle(null));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DataBundleLogic.putDocuments

    ///region

    @Test
    public void testPutDocuments1() throws Exception {
        DataBundleLogic dataBundleLogic = ((DataBundleLogic) createInstance("teammates.logic.core.DataBundleLogic"));
        DataBundle dataBundle = new DataBundle();
        Map map = emptyMap();
        dataBundle.accounts = map;
        dataBundle.accountRequests = map;
        dataBundle.courses = map;
        dataBundle.deadlineExtensions = map;
        dataBundle.instructors = map;
        dataBundle.students = map;
        dataBundle.feedbackSessions = map;
        dataBundle.feedbackQuestions = map;
        dataBundle.feedbackResponses = map;
        dataBundle.feedbackResponseComments = map;
        dataBundle.profiles = map;
        dataBundle.notifications = map;

        dataBundleLogic.putDocuments(dataBundle);
    }

    @Test
    public void testPutDocuments2() throws Exception {
        DataBundleLogic dataBundleLogic = ((DataBundleLogic) createInstance("teammates.logic.core.DataBundleLogic"));
        
        /* This test fails because method [teammates.logic.core.DataBundleLogic.putDocuments] produces [java.lang.NullPointerException]
            teammates.logic.core.DataBundleLogic.putDocuments(DataBundleLogic.java:175) */
        dataBundleLogic.putDocuments(null);
    }

    @Test
    public void testPutDocuments3() throws Exception {
        DataBundleLogic dataBundleLogic = ((DataBundleLogic) createInstance("teammates.logic.core.DataBundleLogic"));
        DataBundle dataBundle = new DataBundle();
        dataBundle.students = null;
        
        /* This test fails because method [teammates.logic.core.DataBundleLogic.putDocuments] produces [java.lang.NullPointerException]
            teammates.logic.core.DataBundleLogic.putDocuments(DataBundleLogic.java:176) */
        dataBundleLogic.putDocuments(dataBundle);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.logic.core.DataBundleLogic.removeDataBundle

    ///region

    @Test
    public void testRemoveDataBundle1() throws Exception {
        DataBundleLogic dataBundleLogic = ((DataBundleLogic) createInstance("teammates.logic.core.DataBundleLogic"));
        DataBundle dataBundle = new DataBundle();
        Map map = emptyMap();
        dataBundle.accounts = map;
        dataBundle.accountRequests = map;
        dataBundle.courses = map;
        dataBundle.deadlineExtensions = map;
        dataBundle.instructors = map;
        dataBundle.students = map;
        dataBundle.feedbackSessions = map;
        dataBundle.feedbackQuestions = map;
        dataBundle.feedbackResponses = map;
        dataBundle.feedbackResponseComments = map;
        dataBundle.profiles = map;
        dataBundle.notifications = map;

        dataBundleLogic.removeDataBundle(dataBundle);
    }

    @Test
    public void testRemoveDataBundle2() throws Exception {
        DataBundleLogic dataBundleLogic = ((DataBundleLogic) createInstance("teammates.logic.core.DataBundleLogic"));
        
        /* This test fails because method [teammates.logic.core.DataBundleLogic.removeDataBundle] produces [java.lang.NullPointerException]
            teammates.logic.core.DataBundleLogic.removeDataBundle(DataBundleLogic.java:380) */
        dataBundleLogic.removeDataBundle(null);
    }

    @Test
    public void testRemoveDataBundle3() throws Exception {
        DataBundleLogic dataBundleLogic = ((DataBundleLogic) createInstance("teammates.logic.core.DataBundleLogic"));
        DataBundle dataBundle = new DataBundle();
        dataBundle.courses = null;
        
        /* This test fails because method [teammates.logic.core.DataBundleLogic.removeDataBundle] produces [java.lang.NullPointerException]
            teammates.logic.core.DataBundleLogic.removeDataBundle(DataBundleLogic.java:380) */
        dataBundleLogic.removeDataBundle(dataBundle);
    }
    ///endregion

    ///endregion
}
