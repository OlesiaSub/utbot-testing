package teammates.common.datatransfer;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import teammates.common.datatransfer.AttributesDeletionQuery.Builder;
import org.junit.jupiter.api.DisplayName;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public final class AttributesDeletionQueryTest {
    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.isCourseIdPresent

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCourseIdPresent()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isCourseIdPresent()}
     * @utbot.returnsFrom {@code return courseId != null;}
     */
    @Test
    @DisplayName("isCourseIdPresent: return courseId != null : False -> return courseId != null")
    public void testIsCourseIdPresent_CourseIdEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);

        boolean actual = attributesDeletionQuery.isCourseIdPresent();

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isCourseIdPresent()}
     * @utbot.returnsFrom {@code return courseId != null;}
     */
    @Test
    @DisplayName("isCourseIdPresent: return courseId != null : True -> return courseId != null")
    public void testIsCourseIdPresent_CourseIdNotEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        String string = "";
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", string);

        boolean actual = attributesDeletionQuery.isCourseIdPresent();

        assertTrue(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.isFeedbackSessionNamePresent

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFeedbackSessionNamePresent()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isFeedbackSessionNamePresent()}
     * @utbot.returnsFrom {@code return feedbackSessionName != null;}
     */
    @Test
    @DisplayName("isFeedbackSessionNamePresent: return feedbackSessionName != null : False -> return feedbackSessionName != null")
    public void testIsFeedbackSessionNamePresent_FeedbackSessionNameEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);

        boolean actual = attributesDeletionQuery.isFeedbackSessionNamePresent();

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isFeedbackSessionNamePresent()}
     * @utbot.returnsFrom {@code return feedbackSessionName != null;}
     */
    @Test
    @DisplayName("isFeedbackSessionNamePresent: return feedbackSessionName != null : True -> return feedbackSessionName != null")
    public void testIsFeedbackSessionNamePresent_FeedbackSessionNameNotEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        String string = "";
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", string);

        boolean actual = attributesDeletionQuery.isFeedbackSessionNamePresent();

        assertTrue(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.isQuestionIdPresent

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isQuestionIdPresent()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isQuestionIdPresent()}
     * @utbot.returnsFrom {@code return questionId != null;}
     */
    @Test
    @DisplayName("isQuestionIdPresent: return questionId != null : False -> return questionId != null")
    public void testIsQuestionIdPresent_QuestionIdEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);

        boolean actual = attributesDeletionQuery.isQuestionIdPresent();

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isQuestionIdPresent()}
     * @utbot.returnsFrom {@code return questionId != null;}
     */
    @Test
    @DisplayName("isQuestionIdPresent: return questionId != null : True -> return questionId != null")
    public void testIsQuestionIdPresent_QuestionIdNotEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        String string = "";
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", string);

        boolean actual = attributesDeletionQuery.isQuestionIdPresent();

        assertTrue(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.isResponseIdPresent

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isResponseIdPresent()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isResponseIdPresent()}
     * @utbot.returnsFrom {@code return responseId != null;}
     */
    @Test
    @DisplayName("isResponseIdPresent: return responseId != null : False -> return responseId != null")
    public void testIsResponseIdPresent_ResponseIdEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);

        boolean actual = attributesDeletionQuery.isResponseIdPresent();

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isResponseIdPresent()}
     * @utbot.returnsFrom {@code return responseId != null;}
     */
    @Test
    @DisplayName("isResponseIdPresent: return responseId != null : True -> return responseId != null")
    public void testIsResponseIdPresent_ResponseIdNotEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        String string = "";
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", string);

        boolean actual = attributesDeletionQuery.isResponseIdPresent();

        assertTrue(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.isUserEmailPresent

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUserEmailPresent()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isUserEmailPresent()}
     * @utbot.returnsFrom {@code return userEmail != null;}
     */
    @Test
    @DisplayName("isUserEmailPresent: return userEmail != null : False -> return userEmail != null")
    public void testIsUserEmailPresent_UserEmailEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);

        boolean actual = attributesDeletionQuery.isUserEmailPresent();

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isUserEmailPresent()}
     * @utbot.returnsFrom {@code return userEmail != null;}
     */
    @Test
    @DisplayName("isUserEmailPresent: return userEmail != null : True -> return userEmail != null")
    public void testIsUserEmailPresent_UserEmailNotEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        String string = "";
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", string);

        boolean actual = attributesDeletionQuery.isUserEmailPresent();

        assertTrue(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.isIsInstructorPresent

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isIsInstructorPresent()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isIsInstructorPresent()}
     * @utbot.returnsFrom {@code return isInstructor != null;}
     */
    @Test
    @DisplayName("isIsInstructorPresent: return isInstructor != null : False -> return isInstructor != null")
    public void testIsIsInstructorPresent_IsInstructorEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", null);

        boolean actual = attributesDeletionQuery.isIsInstructorPresent();

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#isIsInstructorPresent()}
     * @utbot.returnsFrom {@code return isInstructor != null;}
     */
    @Test
    @DisplayName("isIsInstructorPresent: return isInstructor != null : True -> return isInstructor != null")
    public void testIsIsInstructorPresent_IsInstructorNotEqualsNull() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        Boolean boolean1 = false;
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", boolean1);

        boolean actual = attributesDeletionQuery.isIsInstructorPresent();

        assertTrue(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.getCourseId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCourseId()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#getCourseId()}
     * @utbot.returnsFrom {@code return courseId;}
     */
    @Test
    @DisplayName("getCourseId: -> return courseId")
    public void testGetCourseId_ReturnCourseId() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);

        String actual = attributesDeletionQuery.getCourseId();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.getFeedbackSessionName

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFeedbackSessionName()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#getFeedbackSessionName()}
     * @utbot.returnsFrom {@code return feedbackSessionName;}
     */
    @Test
    @DisplayName("getFeedbackSessionName: -> return feedbackSessionName")
    public void testGetFeedbackSessionName_ReturnFeedbackSessionName() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);

        String actual = attributesDeletionQuery.getFeedbackSessionName();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.getQuestionId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getQuestionId()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#getQuestionId()}
     * @utbot.returnsFrom {@code return questionId;}
     */
    @Test
    @DisplayName("getQuestionId: -> return questionId")
    public void testGetQuestionId_ReturnQuestionId() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);

        String actual = attributesDeletionQuery.getQuestionId();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.getResponseId

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getResponseId()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#getResponseId()}
     * @utbot.returnsFrom {@code return responseId;}
     */
    @Test
    @DisplayName("getResponseId: -> return responseId")
    public void testGetResponseId_ReturnResponseId() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);

        String actual = attributesDeletionQuery.getResponseId();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.getUserEmail

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getUserEmail()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#getUserEmail()}
     * @utbot.returnsFrom {@code return userEmail;}
     */
    @Test
    @DisplayName("getUserEmail: -> return userEmail")
    public void testGetUserEmail_ReturnUserEmail() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);

        String actual = attributesDeletionQuery.getUserEmail();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.getIsInstructor

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIsInstructor()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#getIsInstructor()}
     * @utbot.returnsFrom {@code return isInstructor;}
     */
    @Test
    @DisplayName("getIsInstructor: -> return isInstructor")
    public void testGetIsInstructor_ReturnIsInstructor() throws Exception {
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", null);

        Boolean actual = attributesDeletionQuery.getIsInstructor();

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery.builder

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method builder()

    /**
     * @utbot.classUnderTest {@link AttributesDeletionQuery}
     * @utbot.methodUnderTest {@link AttributesDeletionQuery#builder()}
     * @utbot.returnsFrom {@code return new Builder();}
     */
    @Test
    @DisplayName("builder: -> return new Builder()")
    public void testBuilder_Return() throws Exception {
        Builder actual = AttributesDeletionQuery.builder();

        Builder expected = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
        AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);
        setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", null);
        setField(expected, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
        AttributesDeletionQuery expectedAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(expected, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
        AttributesDeletionQuery actualAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
        String actualAttributesDeletionQueryCourseId = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
        assertNull(actualAttributesDeletionQueryCourseId);

        assertTrue(deepEquals(expectedAttributesDeletionQuery, actualAttributesDeletionQuery));
        assertTrue(deepEquals(expectedAttributesDeletionQuery, actualAttributesDeletionQuery));
        assertTrue(deepEquals(expectedAttributesDeletionQuery, actualAttributesDeletionQuery));
        assertTrue(deepEquals(expectedAttributesDeletionQuery, actualAttributesDeletionQuery));
        Boolean actualAttributesDeletionQueryIsInstructor = ((Boolean) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
        assertNull(actualAttributesDeletionQueryIsInstructor);

    }
    ///endregion

    ///endregion

    ///region Tests for Builder

    @Nested
    public final class BuilderTest {
        ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery$Builder.withCourseId

        ///region

        @Test
        public void testWithCourseId1() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withCourseId] produces [java.lang.NullPointerException]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withCourseId(AttributesDeletionQuery.java:89) */
            builder.withCourseId("");
        }

        @Test
        public void testWithCourseId2() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withCourseId] produces [java.lang.AssertionError]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withCourseId(AttributesDeletionQuery.java:88) */
            builder.withCourseId(null);
        }

        @Test
        public void testWithCourseId3() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String courseId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withCourseId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withCourseId(AttributesDeletionQuery.java:89) */
            builder.withCourseId(courseId);
        }

        @Test
        public void testWithCourseId4() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String courseId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withCourseId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withCourseId(AttributesDeletionQuery.java:90) */
            builder.withCourseId(courseId);
        }

        @Test
        public void testWithCourseId5() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String courseId = "";

            Builder actual = builder.withCourseId(courseId);

            AttributesDeletionQuery builderAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            AttributesDeletionQuery actualAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            String builderAttributesDeletionQueryCourseId = ((String) getFieldValue(builderAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            String actualAttributesDeletionQueryCourseId = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertEquals(builderAttributesDeletionQueryCourseId, actualAttributesDeletionQueryCourseId);

            String actualAttributesDeletionQueryFeedbackSessionName = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName"));
            assertNull(actualAttributesDeletionQueryFeedbackSessionName);

            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            Boolean actualAttributesDeletionQueryIsInstructor = ((Boolean) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertNull(actualAttributesDeletionQueryIsInstructor);

        }
        ///endregion

        ///endregion

        ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName

        ///region

        @Test
        public void testWithFeedbackSessionName1() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName] produces [java.lang.NullPointerException]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName(AttributesDeletionQuery.java:98) */
            builder.withFeedbackSessionName("");
        }

        @Test
        public void testWithFeedbackSessionName2() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName] produces [java.lang.AssertionError]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName(AttributesDeletionQuery.java:97) */
            builder.withFeedbackSessionName(null);
        }

        @Test
        public void testWithFeedbackSessionName3() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", string);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String feedbackSessionName = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName(AttributesDeletionQuery.java:99) */
            builder.withFeedbackSessionName(feedbackSessionName);
        }

        @Test
        public void testWithFeedbackSessionName4() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String feedbackSessionName = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName] produces [java.lang.AssertionError: Session name must come together with course ID]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName(AttributesDeletionQuery.java:98) */
            builder.withFeedbackSessionName(feedbackSessionName);
        }

        @Test
        public void testWithFeedbackSessionName5() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", string);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String feedbackSessionName = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName(AttributesDeletionQuery.java:100) */
            builder.withFeedbackSessionName(feedbackSessionName);
        }

        @Test
        public void testWithFeedbackSessionName6() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", string);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);
            Boolean boolean1 = false;
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", boolean1);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String feedbackSessionName = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName(AttributesDeletionQuery.java:102) */
            builder.withFeedbackSessionName(feedbackSessionName);
        }

        @Test
        public void testWithFeedbackSessionName7() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", string);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String feedbackSessionName = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withFeedbackSessionName(AttributesDeletionQuery.java:101) */
            builder.withFeedbackSessionName(feedbackSessionName);
        }

        @Test
        public void testWithFeedbackSessionName8() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", string);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", null);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String feedbackSessionName = "";

            Builder actual = builder.withFeedbackSessionName(feedbackSessionName);

            AttributesDeletionQuery builderAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            AttributesDeletionQuery actualAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            String builderAttributesDeletionQueryCourseId = ((String) getFieldValue(builderAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            String actualAttributesDeletionQueryCourseId = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertEquals(builderAttributesDeletionQueryCourseId, actualAttributesDeletionQueryCourseId);

            String builderAttributesDeletionQueryFeedbackSessionName = ((String) getFieldValue(builderAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName"));
            String actualAttributesDeletionQueryFeedbackSessionName = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName"));
            assertEquals(builderAttributesDeletionQueryFeedbackSessionName, actualAttributesDeletionQueryFeedbackSessionName);

            String actualAttributesDeletionQueryQuestionId = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId"));
            assertNull(actualAttributesDeletionQueryQuestionId);

            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            Boolean actualAttributesDeletionQueryIsInstructor = ((Boolean) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertNull(actualAttributesDeletionQueryIsInstructor);

        }
        ///endregion

        ///endregion

        ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId

        ///region

        @Test
        public void testWithQuestionId1() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId] produces [java.lang.NullPointerException]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId(AttributesDeletionQuery.java:110) */
            builder.withQuestionId("");
        }

        @Test
        public void testWithQuestionId2() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId] produces [java.lang.AssertionError]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId(AttributesDeletionQuery.java:109) */
            builder.withQuestionId(null);
        }

        @Test
        public void testWithQuestionId3() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String questionId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId(AttributesDeletionQuery.java:110) */
            builder.withQuestionId(questionId);
        }

        @Test
        public void testWithQuestionId4() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String questionId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId(AttributesDeletionQuery.java:111) */
            builder.withQuestionId(questionId);
        }

        @Test
        public void testWithQuestionId5() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String questionId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId(AttributesDeletionQuery.java:112) */
            builder.withQuestionId(questionId);
        }

        @Test
        public void testWithQuestionId6() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);
            Boolean boolean1 = false;
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", boolean1);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String questionId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId(AttributesDeletionQuery.java:114) */
            builder.withQuestionId(questionId);
        }

        @Test
        public void testWithQuestionId7() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String questionId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withQuestionId(AttributesDeletionQuery.java:113) */
            builder.withQuestionId(questionId);
        }

        @Test
        public void testWithQuestionId8() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", null);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String questionId = "";

            Builder actual = builder.withQuestionId(questionId);

            AttributesDeletionQuery builderAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            AttributesDeletionQuery actualAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            String actualAttributesDeletionQueryCourseId = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertNull(actualAttributesDeletionQueryCourseId);

            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            String builderAttributesDeletionQueryQuestionId = ((String) getFieldValue(builderAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId"));
            String actualAttributesDeletionQueryQuestionId = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId"));
            assertEquals(builderAttributesDeletionQueryQuestionId, actualAttributesDeletionQueryQuestionId);

            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            Boolean actualAttributesDeletionQueryIsInstructor = ((Boolean) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertNull(actualAttributesDeletionQueryIsInstructor);

        }
        ///endregion

        ///endregion

        ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId

        ///region

        @Test
        public void testWithResponseId1() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId] produces [java.lang.NullPointerException]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId(AttributesDeletionQuery.java:122) */
            builder.withResponseId("");
        }

        @Test
        public void testWithResponseId2() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId] produces [java.lang.AssertionError]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId(AttributesDeletionQuery.java:121) */
            builder.withResponseId(null);
        }

        @Test
        public void testWithResponseId3() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String responseId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId(AttributesDeletionQuery.java:122) */
            builder.withResponseId(responseId);
        }

        @Test
        public void testWithResponseId4() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String responseId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId(AttributesDeletionQuery.java:123) */
            builder.withResponseId(responseId);
        }

        @Test
        public void testWithResponseId5() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String responseId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId(AttributesDeletionQuery.java:124) */
            builder.withResponseId(responseId);
        }

        @Test
        public void testWithResponseId6() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);
            Boolean boolean1 = false;
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", boolean1);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String responseId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId(AttributesDeletionQuery.java:126) */
            builder.withResponseId(responseId);
        }

        @Test
        public void testWithResponseId7() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String responseId = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withResponseId(AttributesDeletionQuery.java:125) */
            builder.withResponseId(responseId);
        }

        @Test
        public void testWithResponseId8() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", null);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String responseId = "";

            Builder actual = builder.withResponseId(responseId);

            AttributesDeletionQuery builderAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            AttributesDeletionQuery actualAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            String actualAttributesDeletionQueryCourseId = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertNull(actualAttributesDeletionQueryCourseId);

            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            String builderAttributesDeletionQueryResponseId = ((String) getFieldValue(builderAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId"));
            String actualAttributesDeletionQueryResponseId = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId"));
            assertEquals(builderAttributesDeletionQueryResponseId, actualAttributesDeletionQueryResponseId);

            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            Boolean actualAttributesDeletionQueryIsInstructor = ((Boolean) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertNull(actualAttributesDeletionQueryIsInstructor);

        }
        ///endregion

        ///endregion

        ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail

        ///region

        @Test
        public void testWithUserEmail1() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail] produces [java.lang.NullPointerException]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail(AttributesDeletionQuery.java:134) */
            builder.withUserEmail("");
        }

        @Test
        public void testWithUserEmail2() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail] produces [java.lang.AssertionError]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail(AttributesDeletionQuery.java:133) */
            builder.withUserEmail(null);
        }

        @Test
        public void testWithUserEmail3() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String userEmail = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail(AttributesDeletionQuery.java:134) */
            builder.withUserEmail(userEmail);
        }

        @Test
        public void testWithUserEmail4() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String userEmail = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail(AttributesDeletionQuery.java:135) */
            builder.withUserEmail(userEmail);
        }

        @Test
        public void testWithUserEmail5() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", string);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String userEmail = "";
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withUserEmail(AttributesDeletionQuery.java:136) */
            builder.withUserEmail(userEmail);
        }

        @Test
        public void testWithUserEmail6() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            String userEmail = "";

            Builder actual = builder.withUserEmail(userEmail);

            AttributesDeletionQuery builderAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            AttributesDeletionQuery actualAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            String actualAttributesDeletionQueryCourseId = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertNull(actualAttributesDeletionQueryCourseId);

            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            String builderAttributesDeletionQueryUserEmail = ((String) getFieldValue(builderAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail"));
            String actualAttributesDeletionQueryUserEmail = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail"));
            assertEquals(builderAttributesDeletionQueryUserEmail, actualAttributesDeletionQueryUserEmail);

            Boolean actualAttributesDeletionQueryIsInstructor = ((Boolean) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertNull(actualAttributesDeletionQueryIsInstructor);

        }
        ///endregion

        ///endregion

        ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery$Builder.withIsInstructor

        ///region

        @Test
        public void testWithIsInstructor1() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withIsInstructor] produces [java.lang.NullPointerException]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withIsInstructor(AttributesDeletionQuery.java:143) */
            builder.withIsInstructor(false);
        }

        @Test
        public void testWithIsInstructor2() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withIsInstructor] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withIsInstructor(AttributesDeletionQuery.java:144) */
            builder.withIsInstructor(false);
        }

        @Test
        public void testWithIsInstructor3() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withIsInstructor] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withIsInstructor(AttributesDeletionQuery.java:143) */
            builder.withIsInstructor(false);
        }

        @Test
        public void testWithIsInstructor4() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", string);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.withIsInstructor] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.withIsInstructor(AttributesDeletionQuery.java:145) */
            builder.withIsInstructor(false);
        }

        @Test
        public void testWithIsInstructor5() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", null);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);

            Builder actual = builder.withIsInstructor(false);

            AttributesDeletionQuery builderAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            AttributesDeletionQuery actualAttributesDeletionQuery = ((AttributesDeletionQuery) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery"));
            String actualAttributesDeletionQueryCourseId = ((String) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertNull(actualAttributesDeletionQueryCourseId);

            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            assertTrue(deepEquals(builderAttributesDeletionQuery, actualAttributesDeletionQuery));
            Boolean builderAttributesDeletionQueryIsInstructor = ((Boolean) getFieldValue(builderAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            Boolean actualAttributesDeletionQueryIsInstructor = ((Boolean) getFieldValue(actualAttributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertEquals(builderAttributesDeletionQueryIsInstructor, actualAttributesDeletionQueryIsInstructor);

        }
        ///endregion

        ///endregion

        ///region Test suites for executable teammates.common.datatransfer.AttributesDeletionQuery$Builder.build

        ///region

        @Test
        public void testBuild1() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", null);
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.build] produces [java.lang.NullPointerException]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.build(AttributesDeletionQuery.java:152) */
            builder.build();
        }

        @Test
        public void testBuild2() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);

            AttributesDeletionQuery actual = builder.build();

            String attributesDeletionQueryCourseId = ((String) getFieldValue(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            String actualCourseId = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertEquals(attributesDeletionQueryCourseId, actualCourseId);

            String actualFeedbackSessionName = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName"));
            assertNull(actualFeedbackSessionName);

            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            Boolean actualIsInstructor = ((Boolean) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertNull(actualIsInstructor);

        }

        @Test
        public void testBuild3() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);

            AttributesDeletionQuery actual = builder.build();

            String actualCourseId = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertNull(actualCourseId);

            assertTrue(deepEquals(attributesDeletionQuery, actual));
            String attributesDeletionQueryQuestionId = ((String) getFieldValue(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId"));
            String actualQuestionId = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId"));
            assertEquals(attributesDeletionQueryQuestionId, actualQuestionId);

            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            Boolean actualIsInstructor = ((Boolean) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertNull(actualIsInstructor);

        }

        @Test
        public void testBuild4() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);

            AttributesDeletionQuery actual = builder.build();

            String actualCourseId = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertNull(actualCourseId);

            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            String attributesDeletionQueryResponseId = ((String) getFieldValue(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId"));
            String actualResponseId = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId"));
            assertEquals(attributesDeletionQueryResponseId, actualResponseId);

            assertTrue(deepEquals(attributesDeletionQuery, actual));
            Boolean actualIsInstructor = ((Boolean) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertNull(actualIsInstructor);

        }

        @Test
        public void testBuild5() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);

            AttributesDeletionQuery actual = builder.build();

            String actualCourseId = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertNull(actualCourseId);

            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            String attributesDeletionQueryUserEmail = ((String) getFieldValue(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail"));
            String actualUserEmail = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail"));
            assertEquals(attributesDeletionQueryUserEmail, actualUserEmail);

            Boolean actualIsInstructor = ((Boolean) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertNull(actualIsInstructor);

        }

        @Test
        public void testBuild6() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);
            Boolean boolean1 = false;
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", boolean1);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);

            AttributesDeletionQuery actual = builder.build();

            String actualCourseId = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertNull(actualCourseId);

            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            Boolean attributesDeletionQueryIsInstructor = ((Boolean) getFieldValue(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            Boolean actualIsInstructor = ((Boolean) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertEquals(attributesDeletionQueryIsInstructor, actualIsInstructor);

        }

        @Test
        public void testBuild7() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            String string = "";
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", string);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);

            AttributesDeletionQuery actual = builder.build();

            String actualCourseId = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId"));
            assertNull(actualCourseId);

            String attributesDeletionQueryFeedbackSessionName = ((String) getFieldValue(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName"));
            String actualFeedbackSessionName = ((String) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName"));
            assertEquals(attributesDeletionQueryFeedbackSessionName, actualFeedbackSessionName);

            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            assertTrue(deepEquals(attributesDeletionQuery, actual));
            Boolean actualIsInstructor = ((Boolean) getFieldValue(actual, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor"));
            assertNull(actualIsInstructor);

        }

        @Test
        public void testBuild8() throws Exception {
            Builder builder = ((Builder) createInstance("teammates.common.datatransfer.AttributesDeletionQuery$Builder"));
            AttributesDeletionQuery attributesDeletionQuery = ((AttributesDeletionQuery) createInstance("teammates.common.datatransfer.AttributesDeletionQuery"));
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "courseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "feedbackSessionName", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "questionId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "responseId", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "userEmail", null);
            setField(attributesDeletionQuery, "teammates.common.datatransfer.AttributesDeletionQuery", "isInstructor", null);
            setField(builder, "teammates.common.datatransfer.AttributesDeletionQuery$Builder", "attributesDeletionQuery", attributesDeletionQuery);
            
            /* This test fails because method [teammates.common.datatransfer.AttributesDeletionQuery$Builder.build] produces [java.lang.AssertionError: Invalid combination]
                teammates.common.datatransfer.AttributesDeletionQuery$Builder.build(AttributesDeletionQuery.java:152) */
            builder.build();
        }
        ///endregion

        ///endregion
    }
    ///endregion
}
