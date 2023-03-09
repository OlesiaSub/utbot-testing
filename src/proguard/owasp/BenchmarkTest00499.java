/**
 * OWASP Benchmark Project v1.2
 *
 * <p>This file is part of the Open Web Application Security Project (OWASP) Benchmark Project. For
 * details, please see <a
 * href="https://owasp.org/www-project-benchmark/">https://owasp.org/www-project-benchmark/</a>.
 *
 * <p>The OWASP Benchmark is free software: you can redistribute it and/or modify it under the terms
 * of the GNU General Public License as published by the Free Software Foundation, version 2.
 *
 * <p>The OWASP Benchmark is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE. See the GNU General Public License for more details.
 *
 * @author Nick Sanidas
 * @created 2015
 */
package src.proguard.owasp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Command injection example
 * source: MethodSignature("javax/servlet/http/HttpServletRequest", "getParameterMap", "()Ljava/util/Map;")
 * sink: MethodSignature("java/lang/Runtime", "exec", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Process;")
 * main: doGet
 *
 * WORKS
 */

@WebServlet(value = "/cmdi-00/BenchmarkTest00499")
public class BenchmarkTest00499 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        java.util.Map<String, String[]> map = request.getParameterMap();
        String param = "";
        if (!map.isEmpty()) {
            // MODIFIED: replace String[] with List<String>, doesn't work with array values access
            List<String> values = Arrays.stream(map.get("BenchmarkTest00499")).collect(Collectors.toList());
            if (values != null) param = values.get(0);
        }

        String bar = param;

        String cmd = "...";
//        String osName = System.getProperty("os.name");
//        if (osName.indexOf("Windows") != -1) {
//            cmd = org.owasp.benchmark.helpers.Utils.getOSCommandString("echo");
//        }

        String[] argsEnv = {"Foo=bar"};
        Runtime r = Runtime.getRuntime();

        try {
            Process p = r.exec(cmd + bar, argsEnv);
            org.owasp.benchmark.helpers.Utils.printOSCommandResults(p, response);
        } catch (IOException e) {
            System.out.println("Problem executing cmdi - TestCase");
            response.getWriter()
                    .println(org.owasp.esapi.ESAPI.encoder().encodeForHTML(e.getMessage()));
            return;
        }
    }
}
