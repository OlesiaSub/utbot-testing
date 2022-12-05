package teammates.common.util;

import org.junit.jupiter.api.Test;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.http.MetaData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.jetty.server.ServletRequestHttpWrapper;

import javax.servlet.ServletRequestWrapper;

import org.eclipse.jetty.util.MultiMap;

import java.util.HashMap;

import org.eclipse.jetty.http.HttpURI;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.http.HttpField;
import org.eclipse.jetty.server.CookieCutter;

import javax.servlet.http.Cookie;

import static org.utbot.runtime.utils.UtUtils.createInstance;
import static org.utbot.runtime.utils.UtUtils.setField;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.utbot.runtime.utils.UtUtils.deepEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.utbot.runtime.utils.UtUtils.getFieldValue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

public final class HttpRequestHelperTest {
    ///region Test suites for executable teammates.common.util.HttpRequestHelper.getRequestParameters

    ///region

    @Test
    public void testGetRequestParameters1() {
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getRequestParameters] produces [java.lang.NullPointerException]
            teammates.common.util.HttpRequestHelper.getRequestParameters(HttpRequestHelper.java:29) */
        HttpRequestHelper.getRequestParameters(null);
    }

    @Test
    public void testGetRequestParameters2() throws Throwable {
        Object req = createInstance("org.eclipse.jetty.security.authentication.FormAuthenticator$FormRequest");
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        MetaData.Request request1 = ((MetaData.Request) createInstance("org.eclipse.jetty.http.MetaData$Request"));
        setField(request1, "org.eclipse.jetty.http.MetaData", "_fields", null);
        setField(request, "org.eclipse.jetty.server.Request", "_metaData", request1);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", false);
        setField(request, "org.eclipse.jetty.server.Request", "_contentType", null);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParameters", null);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);
        
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getRequestParameters] produces [java.lang.NullPointerException]
            org.eclipse.jetty.server.Request.getContentType(Request.java:784)
            org.eclipse.jetty.server.Request.extractContentParameters(Request.java:526)
            org.eclipse.jetty.server.Request.getParameters(Request.java:447)
            org.eclipse.jetty.server.Request.getParameterMap(Request.java:1078)
            javax.servlet.ServletRequestWrapper.getParameterMap(ServletRequestWrapper.java:203)
            teammates.common.util.HttpRequestHelper.getRequestParameters(HttpRequestHelper.java:29) */
        Class httpRequestHelperClazz = Class.forName("teammates.common.util.HttpRequestHelper");
        Class reqType = Class.forName("javax.servlet.http.HttpServletRequest");
        Method getRequestParametersMethod = httpRequestHelperClazz.getDeclaredMethod("getRequestParameters", reqType);
        getRequestParametersMethod.setAccessible(true);
        Object[] getRequestParametersMethodArguments = new Object[1];
        getRequestParametersMethodArguments[0] = req;
        try {
            getRequestParametersMethod.invoke(null, getRequestParametersMethodArguments);
        } catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }

    @Test
    public void testGetRequestParameters3() throws Exception {
        ServletRequestHttpWrapper req = ((ServletRequestHttpWrapper) createInstance("org.eclipse.jetty.server.ServletRequestHttpWrapper"));
        ServletRequestWrapper servletRequestWrapper = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
        setField(servletRequestWrapper, "javax.servlet.ServletRequestWrapper", "request", servletRequestWrapper);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", servletRequestWrapper);

        assertThrows(StackOverflowError.class, () -> HttpRequestHelper.getRequestParameters(req));
    }

    @Test
    public void testGetRequestParameters4() throws Exception {
        Object req = createInstance("org.eclipse.jetty.security.authentication.FormAuthenticator$FormRequest");
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", true);
        MultiMap multiMap = ((MultiMap) createInstance("org.eclipse.jetty.util.MultiMap"));
        setField(request, "org.eclipse.jetty.server.Request", "_queryParameters", multiMap);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        Class httpRequestHelperClazz = Class.forName("teammates.common.util.HttpRequestHelper");
        Class reqType = Class.forName("javax.servlet.http.HttpServletRequest");
        Method getRequestParametersMethod = httpRequestHelperClazz.getDeclaredMethod("getRequestParameters", reqType);
        getRequestParametersMethod.setAccessible(true);
        Object[] getRequestParametersMethodArguments = new Object[1];
        getRequestParametersMethodArguments[0] = req;
        HashMap actual = ((HashMap) getRequestParametersMethod.invoke(null, getRequestParametersMethodArguments));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));
    }

    @Test
    public void testGetRequestParameters5() throws Exception {
        ServletRequestHttpWrapper req = ((ServletRequestHttpWrapper) createInstance("org.eclipse.jetty.server.ServletRequestHttpWrapper"));
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        MetaData.Request request1 = ((MetaData.Request) createInstance("org.eclipse.jetty.http.MetaData$Request"));
        HttpURI httpURI = ((HttpURI) createInstance("org.eclipse.jetty.http.HttpURI"));
        setField(request1, "org.eclipse.jetty.http.MetaData$Request", "_uri", httpURI);
        setField(request, "org.eclipse.jetty.server.Request", "_metaData", request1);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", true);
        setField(request, "org.eclipse.jetty.server.Request", "_queryParameters", null);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        ServletRequest reqRequest = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap initialReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest, "org.eclipse.jetty.server.Request", "_queryParameters"));

        HashMap actual = ((HashMap) HttpRequestHelper.getRequestParameters(req));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));

        ServletRequest reqRequest1 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap finalReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest1, "org.eclipse.jetty.server.Request", "_queryParameters"));

        assertFalse(initialReqRequest_queryParameters == finalReqRequest_queryParameters);
    }

    @Test
    public void testGetRequestParameters6() throws Exception {
        Object req = createInstance("org.eclipse.jetty.security.authentication.FormAuthenticator$FormRequest");
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        MetaData.Request request1 = ((MetaData.Request) createInstance("org.eclipse.jetty.http.MetaData$Request"));
        setField(request1, "org.eclipse.jetty.http.MetaData$Request", "_uri", null);
        setField(request, "org.eclipse.jetty.server.Request", "_metaData", request1);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", true);
        setField(request, "org.eclipse.jetty.server.Request", "_queryParameters", null);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        ServletRequest reqRequest = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap initialReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest, "org.eclipse.jetty.server.Request", "_queryParameters"));

        Class httpRequestHelperClazz = Class.forName("teammates.common.util.HttpRequestHelper");
        Class reqType = Class.forName("javax.servlet.http.HttpServletRequest");
        Method getRequestParametersMethod = httpRequestHelperClazz.getDeclaredMethod("getRequestParameters", reqType);
        getRequestParametersMethod.setAccessible(true);
        Object[] getRequestParametersMethodArguments = new Object[1];
        getRequestParametersMethodArguments[0] = req;
        HashMap actual = ((HashMap) getRequestParametersMethod.invoke(null, getRequestParametersMethodArguments));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));

        ServletRequest reqRequest1 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap finalReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest1, "org.eclipse.jetty.server.Request", "_queryParameters"));

        assertFalse(initialReqRequest_queryParameters == finalReqRequest_queryParameters);
    }

    @Test
    public void testGetRequestParameters7() throws Exception {
        Object req = createInstance("org.eclipse.jetty.security.authentication.FormAuthenticator$FormRequest");
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        setField(request, "org.eclipse.jetty.server.Request", "_metaData", null);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", true);
        setField(request, "org.eclipse.jetty.server.Request", "_queryParameters", null);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        ServletRequest reqRequest = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap initialReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest, "org.eclipse.jetty.server.Request", "_queryParameters"));

        Class httpRequestHelperClazz = Class.forName("teammates.common.util.HttpRequestHelper");
        Class reqType = Class.forName("javax.servlet.http.HttpServletRequest");
        Method getRequestParametersMethod = httpRequestHelperClazz.getDeclaredMethod("getRequestParameters", reqType);
        getRequestParametersMethod.setAccessible(true);
        Object[] getRequestParametersMethodArguments = new Object[1];
        getRequestParametersMethodArguments[0] = req;
        HashMap actual = ((HashMap) getRequestParametersMethod.invoke(null, getRequestParametersMethodArguments));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));

        ServletRequest reqRequest1 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap finalReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest1, "org.eclipse.jetty.server.Request", "_queryParameters"));

        assertFalse(initialReqRequest_queryParameters == finalReqRequest_queryParameters);
    }

    @Test
    public void testGetRequestParameters8() throws Exception {
        Object req = createInstance("org.eclipse.jetty.security.authentication.FormAuthenticator$FormRequest");
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", false);
        MultiMap multiMap = ((MultiMap) createInstance("org.eclipse.jetty.util.MultiMap"));
        setField(request, "org.eclipse.jetty.server.Request", "_queryParameters", multiMap);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParameters", multiMap);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        Class httpRequestHelperClazz = Class.forName("teammates.common.util.HttpRequestHelper");
        Class reqType = Class.forName("javax.servlet.http.HttpServletRequest");
        Method getRequestParametersMethod = httpRequestHelperClazz.getDeclaredMethod("getRequestParameters", reqType);
        getRequestParametersMethod.setAccessible(true);
        Object[] getRequestParametersMethodArguments = new Object[1];
        getRequestParametersMethodArguments[0] = req;
        HashMap actual = ((HashMap) getRequestParametersMethod.invoke(null, getRequestParametersMethodArguments));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));

        ServletRequest reqRequest = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        boolean finalReqRequest_contentParamsExtracted = ((Boolean) getFieldValue(reqRequest, "org.eclipse.jetty.server.Request", "_contentParamsExtracted"));

        assertTrue(finalReqRequest_contentParamsExtracted);
    }

    @Test
    public void testGetRequestParameters9() throws Exception {
        ServletRequestHttpWrapper req = ((ServletRequestHttpWrapper) createInstance("org.eclipse.jetty.server.ServletRequestHttpWrapper"));
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        setField(request, "org.eclipse.jetty.server.Request", "_metaData", null);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", false);
        setField(request, "org.eclipse.jetty.server.Request", "_queryParameters", null);
        MultiMap multiMap = ((MultiMap) createInstance("org.eclipse.jetty.util.MultiMap"));
        setField(request, "org.eclipse.jetty.server.Request", "_contentParameters", multiMap);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        ServletRequest reqRequest = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap initialReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest, "org.eclipse.jetty.server.Request", "_queryParameters"));

        HashMap actual = ((HashMap) HttpRequestHelper.getRequestParameters(req));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));

        ServletRequest reqRequest1 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        boolean finalReqRequest_contentParamsExtracted = ((Boolean) getFieldValue(reqRequest1, "org.eclipse.jetty.server.Request", "_contentParamsExtracted"));
        ServletRequest reqRequest2 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap finalReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest2, "org.eclipse.jetty.server.Request", "_queryParameters"));

        assertFalse(initialReqRequest_queryParameters == finalReqRequest_queryParameters);

        assertTrue(finalReqRequest_contentParamsExtracted);
    }

    @Test
    public void testGetRequestParameters10() throws Exception {
        ServletRequestHttpWrapper req = ((ServletRequestHttpWrapper) createInstance("org.eclipse.jetty.server.ServletRequestHttpWrapper"));
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        MetaData.Request request1 = ((MetaData.Request) createInstance("org.eclipse.jetty.http.MetaData$Request"));
        setField(request1, "org.eclipse.jetty.http.MetaData$Request", "_uri", null);
        setField(request, "org.eclipse.jetty.server.Request", "_metaData", request1);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", false);
        setField(request, "org.eclipse.jetty.server.Request", "_queryParameters", null);
        MultiMap multiMap = ((MultiMap) createInstance("org.eclipse.jetty.util.MultiMap"));
        setField(request, "org.eclipse.jetty.server.Request", "_contentParameters", multiMap);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        ServletRequest reqRequest = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap initialReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest, "org.eclipse.jetty.server.Request", "_queryParameters"));

        HashMap actual = ((HashMap) HttpRequestHelper.getRequestParameters(req));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));

        ServletRequest reqRequest1 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        boolean finalReqRequest_contentParamsExtracted = ((Boolean) getFieldValue(reqRequest1, "org.eclipse.jetty.server.Request", "_contentParamsExtracted"));
        ServletRequest reqRequest2 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap finalReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest2, "org.eclipse.jetty.server.Request", "_queryParameters"));

        assertFalse(initialReqRequest_queryParameters == finalReqRequest_queryParameters);

        assertTrue(finalReqRequest_contentParamsExtracted);
    }

    @Test
    public void testGetRequestParameters11() throws Exception {
        HttpServletRequestWrapper req = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        MetaData.Request request1 = ((MetaData.Request) createInstance("org.eclipse.jetty.http.MetaData$Request"));
        HttpURI httpURI = ((HttpURI) createInstance("org.eclipse.jetty.http.HttpURI"));
        setField(request1, "org.eclipse.jetty.http.MetaData$Request", "_uri", httpURI);
        setField(request, "org.eclipse.jetty.server.Request", "_metaData", request1);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", false);
        setField(request, "org.eclipse.jetty.server.Request", "_queryParameters", null);
        MultiMap multiMap = ((MultiMap) createInstance("org.eclipse.jetty.util.MultiMap"));
        setField(request, "org.eclipse.jetty.server.Request", "_contentParameters", multiMap);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        ServletRequest reqRequest = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap initialReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest, "org.eclipse.jetty.server.Request", "_queryParameters"));

        HashMap actual = ((HashMap) HttpRequestHelper.getRequestParameters(req));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));

        ServletRequest reqRequest1 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        boolean finalReqRequest_contentParamsExtracted = ((Boolean) getFieldValue(reqRequest1, "org.eclipse.jetty.server.Request", "_contentParamsExtracted"));
        ServletRequest reqRequest2 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap finalReqRequest_queryParameters = ((MultiMap) getFieldValue(reqRequest2, "org.eclipse.jetty.server.Request", "_queryParameters"));

        assertFalse(initialReqRequest_queryParameters == finalReqRequest_queryParameters);

        assertTrue(finalReqRequest_contentParamsExtracted);
    }

    @Test
    public void testGetRequestParameters12() throws Exception {
        Object req = createInstance("org.eclipse.jetty.security.authentication.FormAuthenticator$FormRequest");
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        setField(request, "org.eclipse.jetty.server.Request", "_metaData", null);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", false);
        setField(request, "org.eclipse.jetty.server.Request", "_contentType", null);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParameters", null);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        Class httpRequestHelperClazz = Class.forName("teammates.common.util.HttpRequestHelper");
        Class reqType = Class.forName("javax.servlet.http.HttpServletRequest");
        Method getRequestParametersMethod = httpRequestHelperClazz.getDeclaredMethod("getRequestParameters", reqType);
        getRequestParametersMethod.setAccessible(true);
        Object[] getRequestParametersMethodArguments = new Object[1];
        getRequestParametersMethodArguments[0] = req;
        HashMap actual = ((HashMap) getRequestParametersMethod.invoke(null, getRequestParametersMethodArguments));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));

        ServletRequest reqRequest = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        boolean finalReqRequest_contentParamsExtracted = ((Boolean) getFieldValue(reqRequest, "org.eclipse.jetty.server.Request", "_contentParamsExtracted"));

        assertTrue(finalReqRequest_contentParamsExtracted);
    }

    @Test
    public void testGetRequestParameters13() throws Exception {
        Object req = createInstance("org.eclipse.jetty.security.authentication.FormAuthenticator$FormRequest");
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", false);
        String string = "";
        setField(request, "org.eclipse.jetty.server.Request", "_contentType", string);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParameters", null);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        Class httpRequestHelperClazz = Class.forName("teammates.common.util.HttpRequestHelper");
        Class reqType = Class.forName("javax.servlet.http.HttpServletRequest");
        Method getRequestParametersMethod = httpRequestHelperClazz.getDeclaredMethod("getRequestParameters", reqType);
        getRequestParametersMethod.setAccessible(true);
        Object[] getRequestParametersMethodArguments = new Object[1];
        getRequestParametersMethodArguments[0] = req;
        HashMap actual = ((HashMap) getRequestParametersMethod.invoke(null, getRequestParametersMethodArguments));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));

        ServletRequest reqRequest = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        boolean finalReqRequest_contentParamsExtracted = ((Boolean) getFieldValue(reqRequest, "org.eclipse.jetty.server.Request", "_contentParamsExtracted"));

        assertTrue(finalReqRequest_contentParamsExtracted);
    }

    @Test
    public void testGetRequestParameters14() throws Exception {
        Object req = createInstance("org.eclipse.jetty.security.authentication.FormAuthenticator$FormRequest");
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        setField(request, "org.eclipse.jetty.server.Request", "_contentParamsExtracted", false);
        String string = "\u0000";
        setField(request, "org.eclipse.jetty.server.Request", "_contentType", string);
        setField(request, "org.eclipse.jetty.server.Request", "_contentParameters", null);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);

        ServletRequest reqRequest = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap initialReqRequest_contentParameters = ((MultiMap) getFieldValue(reqRequest, "org.eclipse.jetty.server.Request", "_contentParameters"));

        Class httpRequestHelperClazz = Class.forName("teammates.common.util.HttpRequestHelper");
        Class reqType = Class.forName("javax.servlet.http.HttpServletRequest");
        Method getRequestParametersMethod = httpRequestHelperClazz.getDeclaredMethod("getRequestParameters", reqType);
        getRequestParametersMethod.setAccessible(true);
        Object[] getRequestParametersMethodArguments = new Object[1];
        getRequestParametersMethodArguments[0] = req;
        HashMap actual = ((HashMap) getRequestParametersMethod.invoke(null, getRequestParametersMethodArguments));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));

        ServletRequest reqRequest1 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        boolean finalReqRequest_contentParamsExtracted = ((Boolean) getFieldValue(reqRequest1, "org.eclipse.jetty.server.Request", "_contentParamsExtracted"));
        ServletRequest reqRequest2 = ((ServletRequest) getFieldValue(req, "javax.servlet.ServletRequestWrapper", "request"));
        MultiMap finalReqRequest_contentParameters = ((MultiMap) getFieldValue(reqRequest2, "org.eclipse.jetty.server.Request", "_contentParameters"));

        assertFalse(initialReqRequest_contentParameters == finalReqRequest_contentParameters);

        assertTrue(finalReqRequest_contentParamsExtracted);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.HttpRequestHelper.getRequestHeaders

    ///region

    @Test
    public void testGetRequestHeaders1() {
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getRequestHeaders] produces [java.lang.NullPointerException]
            teammates.common.util.HttpRequestHelper.getRequestHeaders(HttpRequestHelper.java:44) */
        HttpRequestHelper.getRequestHeaders(null);
    }

    @Test
    public void testGetRequestHeaders2() throws Exception {
        HttpServletRequestWrapper req = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
        ServletRequestWrapper servletRequestWrapper = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
        setField(req, "javax.servlet.ServletRequestWrapper", "request", servletRequestWrapper);
        
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getRequestHeaders] produces [java.lang.ClassCastException: class javax.servlet.ServletRequestWrapper cannot be cast to class javax.servlet.http.HttpServletRequest (javax.servlet.ServletRequestWrapper and javax.servlet.http.HttpServletRequest are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3949bc8a)]
            javax.servlet.http.HttpServletRequestWrapper._getHttpServletRequest(HttpServletRequestWrapper.java:90)
            javax.servlet.http.HttpServletRequestWrapper.getHeaderNames(HttpServletRequestWrapper.java:144)
            teammates.common.util.HttpRequestHelper.getRequestHeaders(HttpRequestHelper.java:44) */
        HttpRequestHelper.getRequestHeaders(req);
    }

    @Test
    public void testGetRequestHeaders3() throws Exception {
        HttpServletRequestWrapper req = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
        HttpServletRequestWrapper httpServletRequestWrapper = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
        ServletRequestWrapper servletRequestWrapper = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
        setField(httpServletRequestWrapper, "javax.servlet.ServletRequestWrapper", "request", servletRequestWrapper);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", httpServletRequestWrapper);
        
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getRequestHeaders] produces [java.lang.ClassCastException: class javax.servlet.ServletRequestWrapper cannot be cast to class javax.servlet.http.HttpServletRequest (javax.servlet.ServletRequestWrapper and javax.servlet.http.HttpServletRequest are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3949bc8a)]
            javax.servlet.http.HttpServletRequestWrapper._getHttpServletRequest(HttpServletRequestWrapper.java:90)
            javax.servlet.http.HttpServletRequestWrapper.getHeaderNames(HttpServletRequestWrapper.java:144)
            javax.servlet.http.HttpServletRequestWrapper.getHeaderNames(HttpServletRequestWrapper.java:144)
            teammates.common.util.HttpRequestHelper.getRequestHeaders(HttpRequestHelper.java:44) */
        HttpRequestHelper.getRequestHeaders(req);
    }

    @Test
    public void testGetRequestHeaders4() throws Exception {
        Request req = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        MetaData.Request request = ((MetaData.Request) createInstance("org.eclipse.jetty.http.MetaData$Request"));
        HttpFields httpFields = ((HttpFields) createInstance("org.eclipse.jetty.http.HttpFields"));
        HttpField[] httpFieldArray = {};
        setField(httpFields, "org.eclipse.jetty.http.HttpFields", "_fields", httpFieldArray);
        setField(httpFields, "org.eclipse.jetty.http.HttpFields", "_size", 1);
        setField(request, "org.eclipse.jetty.http.MetaData", "_fields", httpFields);
        setField(req, "org.eclipse.jetty.server.Request", "_metaData", request);
        
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getRequestHeaders] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.eclipse.jetty.http.HttpFields.getFieldNamesCollection(HttpFields.java:269)
            org.eclipse.jetty.http.HttpFields.getFieldNames(HttpFields.java:285)
            org.eclipse.jetty.server.Request.getHeaderNames(Request.java:889)
            teammates.common.util.HttpRequestHelper.getRequestHeaders(HttpRequestHelper.java:44) */
        HttpRequestHelper.getRequestHeaders(req);
    }

    @Test
    public void testGetRequestHeaders5() throws Exception {
        HttpServletRequestWrapper req = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        MetaData.Request request1 = ((MetaData.Request) createInstance("org.eclipse.jetty.http.MetaData$Request"));
        HttpFields anonymousHttpFields = ((HttpFields) createInstance("org.eclipse.jetty.http.HttpGenerator$1"));
        HttpField[] httpFieldArray = {null, null, null, null, null, null, null, null, null};
        setField(anonymousHttpFields, "org.eclipse.jetty.http.HttpFields", "_fields", httpFieldArray);
        setField(anonymousHttpFields, "org.eclipse.jetty.http.HttpFields", "_size", 1);
        setField(request1, "org.eclipse.jetty.http.MetaData", "_fields", anonymousHttpFields);
        setField(request, "org.eclipse.jetty.server.Request", "_metaData", request1);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);
        
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getRequestHeaders] produces [java.lang.NullPointerException]
            org.eclipse.jetty.http.HttpFields.getFieldNamesCollection(HttpFields.java:272)
            org.eclipse.jetty.http.HttpFields.getFieldNames(HttpFields.java:285)
            org.eclipse.jetty.server.Request.getHeaderNames(Request.java:889)
            javax.servlet.http.HttpServletRequestWrapper.getHeaderNames(HttpServletRequestWrapper.java:144)
            teammates.common.util.HttpRequestHelper.getRequestHeaders(HttpRequestHelper.java:44) */
        HttpRequestHelper.getRequestHeaders(req);
    }

    @Test
    public void testGetRequestHeaders6() throws Exception {
        HttpServletRequestWrapper req = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
        Request request = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        MetaData.Request request1 = ((MetaData.Request) createInstance("org.eclipse.jetty.http.MetaData$Request"));
        HttpFields anonymousHttpFields = ((HttpFields) createInstance("org.eclipse.jetty.http.HttpGenerator$1"));
        HttpField[] httpFieldArray = {};
        setField(anonymousHttpFields, "org.eclipse.jetty.http.HttpFields", "_fields", httpFieldArray);
        setField(anonymousHttpFields, "org.eclipse.jetty.http.HttpFields", "_size", 1);
        setField(request1, "org.eclipse.jetty.http.MetaData", "_fields", anonymousHttpFields);
        setField(request, "org.eclipse.jetty.server.Request", "_metaData", request1);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", request);
        
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getRequestHeaders] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.eclipse.jetty.http.HttpFields.getFieldNamesCollection(HttpFields.java:269)
            org.eclipse.jetty.http.HttpFields.getFieldNames(HttpFields.java:285)
            org.eclipse.jetty.server.Request.getHeaderNames(Request.java:889)
            javax.servlet.http.HttpServletRequestWrapper.getHeaderNames(HttpServletRequestWrapper.java:144)
            teammates.common.util.HttpRequestHelper.getRequestHeaders(HttpRequestHelper.java:44) */
        HttpRequestHelper.getRequestHeaders(req);
    }

    @Test
    public void testGetRequestHeaders7() {
        Request req = new Request(null, null);

        HashMap actual = ((HashMap) HttpRequestHelper.getRequestHeaders(req));

        HashMap expected = new HashMap();
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.HttpRequestHelper.getCookieValueFromRequest

    ///region

    @Test
    public void testGetCookieValueFromRequest1() {
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getCookieValueFromRequest] produces [java.lang.NullPointerException]
            teammates.common.util.HttpRequestHelper.getCookieValueFromRequest(HttpRequestHelper.java:65) */
        HttpRequestHelper.getCookieValueFromRequest(null, null);
    }

    @Test
    public void testGetCookieValueFromRequest2() throws Exception {
        HttpServletRequestWrapper req = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
        HttpServletRequestWrapper httpServletRequestWrapper = ((HttpServletRequestWrapper) createInstance("javax.servlet.http.HttpServletRequestWrapper"));
        ServletRequestWrapper servletRequestWrapper = ((ServletRequestWrapper) createInstance("javax.servlet.ServletRequestWrapper"));
        setField(httpServletRequestWrapper, "javax.servlet.ServletRequestWrapper", "request", servletRequestWrapper);
        setField(req, "javax.servlet.ServletRequestWrapper", "request", httpServletRequestWrapper);
        
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getCookieValueFromRequest] produces [java.lang.ClassCastException: class javax.servlet.ServletRequestWrapper cannot be cast to class javax.servlet.http.HttpServletRequest (javax.servlet.ServletRequestWrapper and javax.servlet.http.HttpServletRequest are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3949bc8a)]
            javax.servlet.http.HttpServletRequestWrapper._getHttpServletRequest(HttpServletRequestWrapper.java:90)
            javax.servlet.http.HttpServletRequestWrapper.getCookies(HttpServletRequestWrapper.java:108)
            javax.servlet.http.HttpServletRequestWrapper.getCookies(HttpServletRequestWrapper.java:108)
            teammates.common.util.HttpRequestHelper.getCookieValueFromRequest(HttpRequestHelper.java:65) */
        HttpRequestHelper.getCookieValueFromRequest(req, null);
    }

    @Test
    public void testGetCookieValueFromRequest3() throws Exception {
        Request req = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        MetaData.Request request = ((MetaData.Request) createInstance("org.eclipse.jetty.http.MetaData$Request"));
        setField(req, "org.eclipse.jetty.server.Request", "_metaData", request);
        setField(req, "org.eclipse.jetty.server.Request", "_cookiesExtracted", true);
        setField(req, "org.eclipse.jetty.server.Request", "_cookies", null);

        String actual = HttpRequestHelper.getCookieValueFromRequest(req, null);

        assertNull(actual);
    }

    @Test
    public void testGetCookieValueFromRequest4() throws Exception {
        Request req = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        MetaData.Request request = ((MetaData.Request) createInstance("org.eclipse.jetty.http.MetaData$Request"));
        setField(req, "org.eclipse.jetty.server.Request", "_metaData", request);
        setField(req, "org.eclipse.jetty.server.Request", "_cookiesExtracted", true);
        CookieCutter cookieCutter = ((CookieCutter) createInstance("org.eclipse.jetty.server.CookieCutter"));
        Cookie[] cookieArray = {};
        setField(cookieCutter, "org.eclipse.jetty.server.CookieCutter", "_cookies", cookieArray);
        setField(req, "org.eclipse.jetty.server.Request", "_cookies", cookieCutter);

        String actual = HttpRequestHelper.getCookieValueFromRequest(req, null);

        assertNull(actual);
    }
    ///endregion

    ///endregion

    ///region Test suites for executable teammates.common.util.HttpRequestHelper.getRequestBody

    ///region

    @Test
    public void testGetRequestBody1() {
        /* This test fails because method [teammates.common.util.HttpRequestHelper.getRequestBody] produces [java.lang.NullPointerException]
            teammates.common.util.HttpRequestHelper.getRequestBody(HttpRequestHelper.java:82) */
        HttpRequestHelper.getRequestBody(null);
    }

    @Test
    public void testGetRequestBody2() throws Exception {
        Request req = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        setField(req, "org.eclipse.jetty.server.Request", "_inputState", 1);

        assertThrows(IllegalStateException.class, () -> HttpRequestHelper.getRequestBody(req));
    }

    @Test
    public void testGetRequestBody3() throws Exception {
        Request req = ((Request) createInstance("org.eclipse.jetty.server.Request"));
        setField(req, "org.eclipse.jetty.server.Request", "_inputState", 2);
        setField(req, "org.eclipse.jetty.server.Request", "_reader", null);

        assertThrows(NullPointerException.class, () -> HttpRequestHelper.getRequestBody(req));
    }
    ///endregion

    ///endregion
}
