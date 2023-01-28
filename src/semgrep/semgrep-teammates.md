Command `semgrep --config "p/java"` launched on WebGoat project produced the following output:

Semgrep rule registry URL is https://semgrep.dev/registry.
Scanning 593 files with 50 java rules.
100%|███████████████████████████████████████████████████████████|593/593 tasks

Findings:

src/client/java/teammates/client/scripts/statistics/FileStore.java
java.lang.security.audit.crypto.ecb-cipher.ecb-cipher
Cipher in ECB mode is detected. ECB mode produces the same output
for the same input each time which allows an attacker to intercept
and replay the data. Further, ECB mode does not provide any
integrity checking. See https://find-sec-
bugs.github.io/bugs.htm#CIPHER_INTEGRITY.
Details: https://sg.run/Ro9K

        102┆ Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
          ⋮┆----------------------------------------
        116┆ Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");


src/main/java/teammates/common/util/StringHelper.java
java.lang.security.audit.crypto.ecb-cipher.ecb-cipher
Cipher in ECB mode is detected. ECB mode produces the same output
for the same input each time which allows an attacker to intercept
and replay the data. Further, ECB mode does not provide any
integrity checking. See https://find-sec-
bugs.github.io/bugs.htm#CIPHER_INTEGRITY.
Details: https://sg.run/Ro9K

        124┆ Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
          ⋮┆----------------------------------------
        145┆ Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");


src/main/java/teammates/ui/servlets/DevServerLoginServlet.java
java.lang.security.audit.unvalidated-redirect.unvalidated-redirect
Application redirects to a destination URL specified by a user-
supplied parameter that is not validated. This could direct users
to malicious locations. Consider using an allowlist to validate
URLs.
Details: https://sg.run/Q51P

         23┆ @Override
         24┆ public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
         25┆     String nextUrl = req.getParameter("nextUrl");
         26┆     if (nextUrl == null) {
         27┆         nextUrl = "/";
         28┆     }
         29┆     // Prevent HTTP response splitting
         30┆     nextUrl = resp.encodeRedirectURL(nextUrl.replace("\r\n", ""));
         31┆     if (!Config.isDevServerLoginEnabled()) {
         32┆         resp.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
           [hid 17 additional lines, adjust with --max-lines-per-finding] 
         51┆ @Override
         52┆ public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
         53┆     if (!Config.isDevServerLoginEnabled()) {
         54┆         resp.setStatus(HttpStatus.SC_FORBIDDEN);
         55┆         return;
         56┆     }
         57┆ 
         58┆     String email = req.getParameter("email");
         59┆     if (email == null) {
         60┆         return;
           [hid 14 additional lines, adjust with --max-lines-per-finding] 


src/main/java/teammates/ui/servlets/LoginServlet.java
java.lang.security.audit.tainted-session-from-http-request.tainted-
session-from-http-request
Detected input from a HTTPServletRequest going into a session
command, like `setAttribute`. User input into such a command could
lead to an attacker inputting malicious code into your session
parameters,  blurring the line between what's trusted and
untrusted,  and therefore leading to a trust boundary violation.
This could lead to programmers trusting unvalidated data. Instead,
thoroughly sanitize user input before passing it into such function
calls.
Details: https://sg.run/QbDZ

         51┆ AuthState state = new AuthState(nextUrl, req.getSession().getId());
          ⋮┆----------------------------------------
     java.lang.security.audit.unvalidated-redirect.unvalidated-redirect
        Application redirects to a destination URL specified by a user-
        supplied parameter that is not validated. This could direct users
        to malicious locations. Consider using an allowlist to validate
        URLs.
        Details: https://sg.run/Q51P
 
         27┆ @Override
         28┆ public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
         29┆     String nextUrl = req.getParameter("nextUrl");
         30┆     if (nextUrl == null) {
         31┆         nextUrl = "/";
         32┆     }
         33┆     // Prevent HTTP response splitting
         34┆     nextUrl = resp.encodeRedirectURL(nextUrl.replace("\r\n", ""));
         35┆     if (Config.isDevServerLoginEnabled()) {
         36┆         resp.setStatus(HttpStatus.SC_MOVED_PERMANENTLY);
           [hid 23 additional lines, adjust with --max-lines-per-finding] 


src/main/java/teammates/ui/servlets/OAuth2CallbackServlet.java
java.lang.security.audit.tainted-session-from-http-request.tainted-
session-from-http-request
Detected input from a HTTPServletRequest going into a session
command, like `setAttribute`. User input into such a command could
lead to an attacker inputting malicious code into your session
parameters,  blurring the line between what's trusted and
untrusted,  and therefore leading to a trust boundary violation.
This could lead to programmers trusting unvalidated data. Instead,
thoroughly sanitize user input before passing it into such function
calls.
Details: https://sg.run/QbDZ

         62┆ log.warning(String.format("Different session ID: expected %s, got %s",
         63┆         sessionId, req.getSession().getId()));


src/main/java/teammates/ui/servlets/OriginCheckFilter.java
java.lang.security.audit.tainted-session-from-http-request.tainted-
session-from-http-request
Detected input from a HTTPServletRequest going into a session
command, like `setAttribute`. User input into such a command could
lead to an attacker inputting malicious code into your session
parameters,  blurring the line between what's trusted and
untrusted,  and therefore leading to a trust boundary violation.
This could lead to programmers trusting unvalidated data. Instead,
thoroughly sanitize user input before passing it into such function
calls.
Details: https://sg.run/QbDZ

        166┆ sessionId = request.getSession().getId();

Some files were skipped or only partially analyzed.
Scan was limited to files tracked by git.
Scan skipped: 234 files matching .semgrepignore patterns
For a full list of skipped files, run semgrep with the --verbose flag.

Ran 50 rules on 593 files: 10 findings.
