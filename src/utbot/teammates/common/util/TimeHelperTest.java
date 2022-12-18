package teammates.common.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.Instant;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class TimeHelperTest {
    ///region Test suites for executable teammates.common.util.TimeHelper.getInstantNearestHourBefore

    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getInstantNearestHourBefore(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#getInstantNearestHourBefore(Instant)}
     * @utbot.invokes {@link TimeHelper#formatInstant(Instant, String, String)}
     * @utbot.invokes {@link TimeHelper#parseInstant(String)}
     * @utbot.throwsException {@link AssertionError} in: return parseInstant(nearestHourString);
     */
    @Test
    @DisplayName("getInstantNearestHourBefore: return parseInstant(nearestHourString) : True -> ThrowAssertionError")
    public void testGetInstantNearestHourBefore_TimeHelperParseInstant() {
        /* This test fails because method [teammates.common.util.TimeHelper.getInstantNearestHourBefore] produces [java.lang.AssertionError: Date in String is in wrong format.]
            teammates.common.util.TimeHelper.parseInstant(TimeHelper.java:124)
            teammates.common.util.TimeHelper.getInstantNearestHourBefore(TimeHelper.java:29) */
        TimeHelper.getInstantNearestHourBefore(null);
    }
    ///endregion

    ///region OTHER: SUCCESSFUL EXECUTIONS for method getInstantNearestHourBefore(java.time.Instant)

    @Test
    public void testGetInstantNearestHourBefore1() throws Exception {
        Instant instant = ((Instant) createInstance("java.time.Instant"));

        Instant actual = TimeHelper.getInstantNearestHourBefore(instant);

        Instant expected = ((Instant) createInstance("java.time.Instant"));
        // java.time.Instant has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.TimeHelper.getInstantDaysOffsetFromNow

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstantDaysOffsetFromNow(long)

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#getInstantDaysOffsetFromNow(long)}
     */
    @Test
    @DisplayName("getInstantDaysOffsetFromNow: arg_0 > 0L")
    public void testGetInstantDaysOffsetFromNow() throws Exception {
        Instant actual = TimeHelper.getInstantDaysOffsetFromNow(1L);

        Instant expected = ((Instant) createInstance("java.time.Instant"));
        // java.time.Instant has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInstantDaysOffsetFromNow(long)

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#getInstantDaysOffsetFromNow(long)}
     */
    @Test
    @DisplayName("getInstantDaysOffsetFromNow: arg_0 = 18014398509481985 (mutated from 1) -> throw ArithmeticException")
    public void testGetInstantDaysOffsetFromNowThrowsAE() {
        /* This test fails because method [teammates.common.util.TimeHelper.getInstantDaysOffsetFromNow] produces [java.lang.ArithmeticException: long overflow]
            java.base/java.lang.Math.multiplyExact(Math.java:949)
            java.base/java.lang.Math.multiplyExact(Math.java:925)
            java.base/java.time.Duration.ofDays(Duration.java:181)
            teammates.common.util.TimeHelper.getInstantDaysOffsetFromNow(TimeHelper.java:39) */
        TimeHelper.getInstantDaysOffsetFromNow(18014398509481985L);
    }

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#getInstantDaysOffsetFromNow(long)}
     */
    @Test
    @DisplayName("getInstantDaysOffsetFromNow: arg_0 = 549756872713 (mutated from 1058825) -> throw DateTimeException")
    public void testGetInstantDaysOffsetFromNowThrowsDTE() {
        /* This test fails because method [teammates.common.util.TimeHelper.getInstantDaysOffsetFromNow] produces [java.time.DateTimeException: Instant exceeds minimum or maximum instant]
            java.base/java.time.Instant.create(Instant.java:411)
            java.base/java.time.Instant.ofEpochSecond(Instant.java:330)
            java.base/java.time.Instant.plus(Instant.java:928)
            java.base/java.time.Instant.plusSeconds(Instant.java:878)
            java.base/java.time.Instant.plus(Instant.java:855)
            java.base/java.time.Instant.plus(Instant.java:207)
            java.base/java.time.Duration.addTo(Duration.java:1102)
            java.base/java.time.Instant.plus(Instant.java:787)
            teammates.common.util.TimeHelper.getInstantDaysOffsetFromNow(TimeHelper.java:39) */
        TimeHelper.getInstantDaysOffsetFromNow(549756872713L);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.TimeHelper.getInstantDaysOffsetBeforeNow

    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getInstantDaysOffsetBeforeNow(long)

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#getInstantDaysOffsetBeforeNow(long)}
     */
    @Test
    @DisplayName("getInstantDaysOffsetBeforeNow: arg_0 > 0L")
    public void testGetInstantDaysOffsetBeforeNow() throws Exception {
        Instant actual = TimeHelper.getInstantDaysOffsetBeforeNow(1L);

        Instant expected = ((Instant) createInstance("java.time.Instant"));
        // java.time.Instant has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion

    ///region FUZZER: EXPLICITLY_THROWN_UNCHECKED_EXCEPTIONS for method getInstantDaysOffsetBeforeNow(long)

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#getInstantDaysOffsetBeforeNow(long)}
     */
    @Test
    @DisplayName("getInstantDaysOffsetBeforeNow: arg_0 = 18014398509481985 (mutated from 1) -> throw ArithmeticException")
    public void testGetInstantDaysOffsetBeforeNowThrowsAE() {
        /* This test fails because method [teammates.common.util.TimeHelper.getInstantDaysOffsetBeforeNow] produces [java.lang.ArithmeticException: long overflow]
            java.base/java.lang.Math.multiplyExact(Math.java:949)
            java.base/java.lang.Math.multiplyExact(Math.java:925)
            java.base/java.time.Duration.ofDays(Duration.java:181)
            teammates.common.util.TimeHelper.getInstantDaysOffsetBeforeNow(TimeHelper.java:49) */
        TimeHelper.getInstantDaysOffsetBeforeNow(18014398509481985L);
    }

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#getInstantDaysOffsetBeforeNow(long)}
     */
    @Test
    @DisplayName("getInstantDaysOffsetBeforeNow: arg_0 = 549756872713 (mutated from 1058825) -> throw DateTimeException")
    public void testGetInstantDaysOffsetBeforeNowThrowsDTE() {
        /* This test fails because method [teammates.common.util.TimeHelper.getInstantDaysOffsetBeforeNow] produces [java.time.DateTimeException: Instant exceeds minimum or maximum instant]
            java.base/java.time.Instant.create(Instant.java:411)
            java.base/java.time.Instant.ofEpochSecond(Instant.java:330)
            java.base/java.time.Instant.plus(Instant.java:928)
            java.base/java.time.Instant.plusSeconds(Instant.java:878)
            java.base/java.time.Instant.plus(Instant.java:855)
            java.base/java.time.Instant.minus(Instant.java:978)
            java.base/java.time.Instant.minus(Instant.java:207)
            java.base/java.time.Duration.subtractFrom(Duration.java:1137)
            java.base/java.time.Instant.minus(Instant.java:954)
            teammates.common.util.TimeHelper.getInstantDaysOffsetBeforeNow(TimeHelper.java:49) */
        TimeHelper.getInstantDaysOffsetBeforeNow(549756872713L);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.TimeHelper.formatInstant

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method formatInstant(java.time.Instant, java.lang.String, java.lang.String)

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#formatInstant(Instant, String, String)}
     * @utbot.executesCondition {@code (instant == null): False}
     * @utbot.executesCondition {@code (timeZone == null): True}
     * @utbot.returnsFrom {@code return "";}
     */
    @Test
    @DisplayName("formatInstant: timeZone == null : False -> return \"\"")
    public void testFormatInstant_TimeZoneEqualsNull() throws Exception {
        Instant instant = ((Instant) createInstance("java.time.Instant"));

        String actual = TimeHelper.formatInstant(instant, null, null);

        String expected = "";
        assertEquals(expected, actual);
    }

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#formatInstant(Instant, String, String)}
     * @utbot.executesCondition {@code (instant == null): True}
     * @utbot.returnsFrom {@code return "";}
     */
    @Test
    @DisplayName("formatInstant: instant == null : False -> return \"\"")
    public void testFormatInstant_InstantEqualsNull() {
        String actual = TimeHelper.formatInstant(null, null, null);

        String expected = "";
        assertEquals(expected, actual);
    }

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#formatInstant(Instant, String, String)}
     * @utbot.executesCondition {@code (instant == null): False}
     * @utbot.executesCondition {@code (timeZone == null): False}
     * @utbot.executesCondition {@code (pattern == null): True}
     * @utbot.returnsFrom {@code return "";}
     */
    @Test
    @DisplayName("formatInstant: timeZone == null : True -> return \"\"")
    public void testFormatInstant_PatternEqualsNull() throws Exception {
        Instant instant = ((Instant) createInstance("java.time.Instant"));
        String timeZone = "";

        String actual = TimeHelper.formatInstant(instant, timeZone, null);

        String expected = "";
        assertEquals(expected, actual);
    }
    ///endregion

    ///region OTHER: ERROR SUITE for method formatInstant(java.time.Instant, java.lang.String, java.lang.String)

    @Test
    public void testFormatInstant1() throws Exception {
        Instant instant = ((Instant) createInstance("java.time.Instant"));
        String timeZone = "+\u0000";
        String pattern = "\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [teammates.common.util.TimeHelper.formatInstant] produces [java.time.DateTimeException: Invalid ID for ZoneOffset, non numeric characters found: +0 ]
            java.base/java.time.ZoneOffset.parseNumber(ZoneOffset.java:269)
            java.base/java.time.ZoneOffset.of(ZoneOffset.java:216)
            java.base/java.time.ZoneId.of(ZoneId.java:402)
            java.base/java.time.ZoneId.of(ZoneId.java:356)
            teammates.common.util.TimeHelper.formatInstant(TimeHelper.java:67) */
        TimeHelper.formatInstant(instant, timeZone, pattern);
    }

    @Test
    public void testFormatInstant2() throws Exception {
        Instant instant = ((Instant) createInstance("java.time.Instant"));
        String timeZone = "\u0000\u0000";
        String pattern = "";
        
        /* This test fails because method [teammates.common.util.TimeHelper.formatInstant] produces [java.time.DateTimeException: Invalid ID for region-based ZoneId, invalid format:   ]
            java.base/java.time.ZoneRegion.checkName(ZoneRegion.java:151)
            java.base/java.time.ZoneRegion.ofId(ZoneRegion.java:116)
            java.base/java.time.ZoneId.of(ZoneId.java:408)
            java.base/java.time.ZoneId.of(ZoneId.java:356)
            teammates.common.util.TimeHelper.formatInstant(TimeHelper.java:67) */
        TimeHelper.formatInstant(instant, timeZone, pattern);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.TimeHelper.getMidnightAdjustedInstantBasedOnZone

    ///region

    @Test
    public void testGetMidnightAdjustedInstantBasedOnZone1() {
        /* This test fails because method [teammates.common.util.TimeHelper.getMidnightAdjustedInstantBasedOnZone] produces [java.lang.NullPointerException: zoneId]
            java.base/java.util.Objects.requireNonNull(Objects.java:246)
            java.base/java.time.ZoneId.of(ZoneId.java:400)
            java.base/java.time.ZoneId.of(ZoneId.java:356)
            teammates.common.util.TimeHelper.getMidnightAdjustedInstantBasedOnZone(TimeHelper.java:84) */
        TimeHelper.getMidnightAdjustedInstantBasedOnZone(null, null, false);
    }

    @Test
    public void testGetMidnightAdjustedInstantBasedOnZone2() {
        String timeZone = "+\u0000";
        
        /* This test fails because method [teammates.common.util.TimeHelper.getMidnightAdjustedInstantBasedOnZone] produces [java.time.DateTimeException: Invalid ID for ZoneOffset, non numeric characters found: +0 ]
            java.base/java.time.ZoneOffset.parseNumber(ZoneOffset.java:269)
            java.base/java.time.ZoneOffset.of(ZoneOffset.java:216)
            java.base/java.time.ZoneId.of(ZoneId.java:402)
            java.base/java.time.ZoneId.of(ZoneId.java:356)
            teammates.common.util.TimeHelper.getMidnightAdjustedInstantBasedOnZone(TimeHelper.java:84) */
        TimeHelper.getMidnightAdjustedInstantBasedOnZone(null, timeZone, false);
    }

    @Test
    public void testGetMidnightAdjustedInstantBasedOnZone3() {
        String timeZone = "\u0000\u0000";
        
        /* This test fails because method [teammates.common.util.TimeHelper.getMidnightAdjustedInstantBasedOnZone] produces [java.time.DateTimeException: Invalid ID for region-based ZoneId, invalid format:   ]
            java.base/java.time.ZoneRegion.checkName(ZoneRegion.java:151)
            java.base/java.time.ZoneRegion.ofId(ZoneRegion.java:116)
            java.base/java.time.ZoneId.of(ZoneId.java:408)
            java.base/java.time.ZoneId.of(ZoneId.java:356)
            teammates.common.util.TimeHelper.getMidnightAdjustedInstantBasedOnZone(TimeHelper.java:84) */
        TimeHelper.getMidnightAdjustedInstantBasedOnZone(null, timeZone, false);
    }

    @Test
    public void testGetMidnightAdjustedInstantBasedOnZone4() throws Exception {
        Instant instant = ((Instant) createInstance("java.time.Instant"));

        Instant actual = TimeHelper.getMidnightAdjustedInstantBasedOnZone(instant, null, false);

        // java.time.Instant has overridden equals method
        assertEquals(instant, actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.TimeHelper.isSpecialTime

    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSpecialTime(java.time.Instant)

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#isSpecialTime(Instant)}
     * @utbot.executesCondition {@code (instant == null): True}
     * @utbot.returnsFrom {@code return false;}
     */
    @Test
    @DisplayName("isSpecialTime: instant == null : True -> return false")
    public void testIsSpecialTime_InstantEqualsNull() {
        boolean actual = TimeHelper.isSpecialTime(null);

        assertFalse(actual);
    }

    /**
     * @utbot.classUnderTest {@link TimeHelper}
     * @utbot.methodUnderTest {@link TimeHelper#isSpecialTime(Instant)}
     * @utbot.executesCondition {@code (instant == null): False}
     */
    @Test
    @DisplayName("isSpecialTime: -> instant == null : False")
    public void testIsSpecialTime_InstantNotEqualsNull() throws Exception {
        Instant instant = ((Instant) createInstance("java.time.Instant"));

        boolean actual = TimeHelper.isSpecialTime(instant);

        assertTrue(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.TimeHelper.parseInstant

    ///region

    @Test
    public void testParseInstant1() {
        /* This test fails because method [teammates.common.util.TimeHelper.parseInstant] produces [java.lang.AssertionError: Date in String is in wrong format.]
            teammates.common.util.TimeHelper.parseInstant(TimeHelper.java:124) */
        TimeHelper.parseInstant("");
    }

    @Test
    public void testParseInstant2() {
        /* This test fails because method [teammates.common.util.TimeHelper.parseInstant] produces [java.lang.NullPointerException: text]
            java.base/java.util.Objects.requireNonNull(Objects.java:246)
            java.base/java.time.format.DateTimeFormatter.parse(DateTimeFormatter.java:1945)
            java.base/java.time.OffsetDateTime.parse(OffsetDateTime.java:402)
            java.base/java.time.OffsetDateTime.parse(OffsetDateTime.java:387)
            teammates.common.util.TimeHelper.parseInstant(TimeHelper.java:122) */
        TimeHelper.parseInstant(null);
    }
    ///endregion

    ///endregion
}
