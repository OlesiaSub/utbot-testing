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
 * sink: MethodSignature("java/lang/Runtime", "exec", "([Ljava/lang/String;)Ljava/lang/Process;")
 * main: doGet
 *
 * DOES NOT WORK
 */

@WebServlet(value = "/cmdi-00/BenchmarkTest00494")
public class BenchmarkTest00494 extends HttpServlet {

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
            List<String> values = Arrays.stream(map.get("BenchmarkTest00498")).collect(Collectors.toList());
            if (values != null) param = values.get(0);
        }

        // PROBLEM: addition of a tainted argument to a list does not make the list tainted
        String bar = "alsosafe";
        if (param != null) {
            List<String> valuesList = new java.util.ArrayList<String>();
            valuesList.add("safe");
            valuesList.add(param);
            valuesList.add("moresafe");

            valuesList.remove(0); // remove the 1st safe value

            bar = valuesList.get(1); // get the last 'safe' value
        }

        String cmd = "";
        String a1 = "";
        String a2 = "";
        String[] args = null;
        String osName = System.getProperty("os.name");

        if (osName == "Windows") {
            a1 = "cmd.exe";
            a2 = "/c";
            cmd = org.owasp.benchmark.helpers.Utils.getOSCommandString("echo");
            // PROBLEM: addition of a tainted arg to an array won't make an array tainted
            args = new String[] {a1, a2, cmd, bar};
        } else {
            a1 = "sh";
            a2 = "-c";
            cmd = org.owasp.benchmark.helpers.Utils.getOSCommandString("ping -c1 ");
            args = new String[] {a1, a2, cmd + bar};
        }

        Runtime r = Runtime.getRuntime();

        try {
            Process p = r.exec(args);
            org.owasp.benchmark.helpers.Utils.printOSCommandResults(p, response);
        } catch (IOException e) {
            System.out.println("Problem executing cmdi - TestCase");
            response.getWriter()
                    .println(org.owasp.esapi.ESAPI.encoder().encodeForHTML(e.getMessage()));
            return;
        }
    }
}
