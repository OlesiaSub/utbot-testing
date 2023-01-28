Command `semgrep --config "p/java"` used on WebGoat produces the following output:

Semgrep rule registry URL is https://semgrep.dev/registry.
Scanning 276 files with 50 java rules.
100%|██████████████████████████████████████████████████████████▊|275/276 tasks

Findings:

src/main/java/org/owasp/webgoat/lessons/challenges/challenge5/Assignment5.java
java.spring.security.injection.tainted-sql-string.tainted-sql-
string
User data flows into this manually-constructed SQL string. User
data can be safely inserted into SQL strings using prepared
statements or an object-relational mapper (ORM). Manually-
constructed SQL strings is a possible indicator of SQL injection,
which could let an attacker steal or manipulate data from the
database. Instead, use prepared statements
(`connection.PreparedStatement`) or a safe library.
Details: https://sg.run/9rzz

         61┆ "select password from challenge_users where userid = '"
         62┆     + username_login
         63┆     + "' and password = '"
         64┆     + password_login
         65┆     + "'");


src/main/java/org/owasp/webgoat/lessons/cryptography/EncodingAssignment.java
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

         54┆ request.getSession().setAttribute("basicAuth", basicAuth);


src/main/java/org/owasp/webgoat/lessons/cryptography/HashingAssignment.java
java.lang.security.audit.crypto.use-of-md5.use-of-md5
Detected MD5 hash algorithm which is considered insecure. MD5 is
not collision resistant and is therefore not suitable as a
cryptographic signature. Use HMAC instead.
Details: https://sg.run/ryJn

         ▶▶┆ Autofix ▶ "SHA-512"
         55┆ MessageDigest md = MessageDigest.getInstance("MD5");


src/main/java/org/owasp/webgoat/lessons/passwordreset/SecurityQuestionAssignment.java
java.spring.security.injection.tainted-html-string.tainted-html-
string
Detected user input flowing into a manually constructed HTML
string. You may be accidentally bypassing secure methods of
rendering HTML by manually constructing HTML and this could create
a cross-site scripting vulnerability, which could let attackers
steal sensitive user data. To be sure this is safe, check that the
HTML is rendered safely. You can use the OWASP ESAPI encoder if you
must render user data.
Details: https://sg.run/ObdR

        100┆ return success(this).output("<b>" + answer + "</b>").build();


src/main/java/org/owasp/webgoat/lessons/pathtraversal/ProfileUploadRetrieval.java
java.lang.security.httpservlet-path-traversal.httpservlet-path-
traversal
Detected a potential path traversal. A malicious actor could
control the location of this file, to include going backwards in
the directory with '../'. To address this, ensure that user-
controlled variables in file paths are sanitized. You may also
consider using a utility method such as
org.apache.commons.io.FilenameUtils.getName(...) to only retrieve
the file name from the path.
Details: https://sg.run/oxXN

         91┆ var catPicture =
         92┆     new File(catPicturesDirectory, (id == null ? RandomUtils.nextInt(1, 11) : id) + ".jpg");


src/main/java/org/owasp/webgoat/lessons/securepasswords/SecurePasswordsAssignment.java
java.spring.security.injection.tainted-html-string.tainted-html-
string
Detected user input flowing into a manually constructed HTML
string. You may be accidentally bypassing secure methods of
rendering HTML by manually constructing HTML and this could create
a cross-site scripting vulnerability, which could let attackers
steal sensitive user data. To be sure this is safe, check that the
HTML is rendered safely. You can use the OWASP ESAPI encoder if you
must render user data.
Details: https://sg.run/ObdR

         50┆ output.append("<b>Length: </b>" + password.length() + "</br>");
          ⋮┆----------------------------------------
         52┆ "<b>Estimated guesses needed to crack your password: </b>"
         53┆     + df.format(strength.getGuesses())
         54┆     + "</br>");
          ⋮┆----------------------------------------
         56┆ "<div style=\"float: left;padding-right: 10px;\"><b>Score: </b>"
         57┆     + strength.getScore()
         58┆     + "/4 </div>");
          ⋮┆----------------------------------------
         73┆ "<b>Estimated cracking time: </b>"
         74┆     + calculateTime(
         75┆         (long) strength.getCrackTimeSeconds().getOnlineNoThrottling10perSecond())
         76┆     + "</br>");
          ⋮┆----------------------------------------
         78┆ output.append("<b>Warning: </b>" + strength.getFeedback().getWarning() + "</br>");
          ⋮┆----------------------------------------
         84┆ output.append("<li>" + sug + "</li>");
          ⋮┆----------------------------------------
         87┆ output.append("<b>Score: </b>" + strength.getScore() + "/4 </br>");


src/main/java/org/owasp/webgoat/lessons/sqlinjection/advanced/SqlInjectionChallenge.java
java.lang.security.audit.formatted-sql-string.formatted-sql-string
Detected a formatted string in a SQL statement. This could lead to
SQL injection if variables in the SQL statement are not properly
sanitized. Use a prepared statements (java.sql.PreparedStatement)
instead. You can obtain a PreparedStatement using
'connection.prepareStatement'.
Details: https://sg.run/OPXp

         69┆ ResultSet resultSet = statement.executeQuery(checkUserQuery);
          ⋮┆----------------------------------------
     java.spring.security.injection.tainted-sql-string.tainted-sql-
     string
        User data flows into this manually-constructed SQL string. User
        data can be safely inserted into SQL strings using prepared
        statements or an object-relational mapper (ORM). Manually-
        constructed SQL strings is a possible indicator of SQL injection,
        which could let an attacker steal or manipulate data from the
        database. Instead, use prepared statements
        (`connection.PreparedStatement`) or a safe library.
        Details: https://sg.run/9rzz
 
         67┆ "select userid from sql_challenge_users where userid = '" + username_reg + "'";


src/main/java/org/owasp/webgoat/lessons/sqlinjection/advanced/SqlInjectionLesson6a.java
java.lang.security.audit.formatted-sql-string.formatted-sql-string
Detected a formatted string in a SQL statement. This could lead to
SQL injection if variables in the SQL statement are not properly
sanitized. Use a prepared statements (java.sql.PreparedStatement)
instead. You can obtain a PreparedStatement using
'connection.prepareStatement'.
Details: https://sg.run/OPXp

         74┆ ResultSet results = statement.executeQuery(query);


src/main/java/org/owasp/webgoat/lessons/sqlinjection/introduction/SqlInjectionLesson10.java
java.lang.security.audit.formatted-sql-string.formatted-sql-string
Detected a formatted string in a SQL statement. This could lead to
SQL injection if variables in the SQL statement are not properly
sanitized. Use a prepared statements (java.sql.PreparedStatement)
instead. You can obtain a PreparedStatement using
'connection.prepareStatement'.
Details: https://sg.run/OPXp

         71┆ ResultSet results = statement.executeQuery(query);


src/main/java/org/owasp/webgoat/lessons/sqlinjection/introduction/SqlInjectionLesson2.java
java.lang.security.audit.formatted-sql-string.formatted-sql-string
Detected a formatted string in a SQL statement. This could lead to
SQL injection if variables in the SQL statement are not properly
sanitized. Use a prepared statements (java.sql.PreparedStatement)
instead. You can obtain a PreparedStatement using
'connection.prepareStatement'.
Details: https://sg.run/OPXp

         65┆ ResultSet results = statement.executeQuery(query);


src/main/java/org/owasp/webgoat/lessons/sqlinjection/introduction/SqlInjectionLesson3.java
java.lang.security.audit.formatted-sql-string.formatted-sql-string
Detected a formatted string in a SQL statement. This could lead to
SQL injection if variables in the SQL statement are not properly
sanitized. Use a prepared statements (java.sql.PreparedStatement)
instead. You can obtain a PreparedStatement using
'connection.prepareStatement'.
Details: https://sg.run/OPXp

         63┆ statement.executeUpdate(query);


src/main/java/org/owasp/webgoat/lessons/sqlinjection/introduction/SqlInjectionLesson4.java
java.lang.security.audit.formatted-sql-string.formatted-sql-string
Detected a formatted string in a SQL statement. This could lead to
SQL injection if variables in the SQL statement are not properly
sanitized. Use a prepared statements (java.sql.PreparedStatement)
instead. You can obtain a PreparedStatement using
'connection.prepareStatement'.
Details: https://sg.run/OPXp

         62┆ statement.executeUpdate(query);


src/main/java/org/owasp/webgoat/lessons/sqlinjection/introduction/SqlInjectionLesson5.java
java.lang.security.audit.formatted-sql-string.formatted-sql-string
Detected a formatted string in a SQL statement. This could lead to
SQL injection if variables in the SQL statement are not properly
sanitized. Use a prepared statements (java.sql.PreparedStatement)
instead. You can obtain a PreparedStatement using
'connection.prepareStatement'.
Details: https://sg.run/OPXp

         80┆ statement.executeQuery(query);


src/main/java/org/owasp/webgoat/lessons/sqlinjection/introduction/SqlInjectionLesson5a.java
java.lang.security.audit.formatted-sql-string.formatted-sql-string
Detected a formatted string in a SQL statement. This could lead to
SQL injection if variables in the SQL statement are not properly
sanitized. Use a prepared statements (java.sql.PreparedStatement)
instead. You can obtain a PreparedStatement using
'connection.prepareStatement'.
Details: https://sg.run/OPXp

         67┆ ResultSet results = statement.executeQuery(query);


src/main/java/org/owasp/webgoat/lessons/sqlinjection/introduction/SqlInjectionLesson8.java
java.lang.security.audit.formatted-sql-string.formatted-sql-string
Detected a formatted string in a SQL statement. This could lead to
SQL injection if variables in the SQL statement are not properly
sanitized. Use a prepared statements (java.sql.PreparedStatement)
instead. You can obtain a PreparedStatement using
'connection.prepareStatement'.
Details: https://sg.run/OPXp

         78┆ ResultSet results = statement.executeQuery(query);
          ⋮┆----------------------------------------
        158┆ statement.executeUpdate(logQuery);


src/main/java/org/owasp/webgoat/lessons/sqlinjection/introduction/SqlInjectionLesson9.java
java.lang.security.audit.formatted-sql-string.formatted-sql-string
Detected a formatted string in a SQL statement. This could lead to
SQL injection if variables in the SQL statement are not properly
sanitized. Use a prepared statements (java.sql.PreparedStatement)
instead. You can obtain a PreparedStatement using
'connection.prepareStatement'.
Details: https://sg.run/OPXp

         76┆ ResultSet results = statement.executeQuery(query);


src/main/java/org/owasp/webgoat/lessons/sqlinjection/mitigation/Servers.java
java.spring.security.injection.tainted-sql-string.tainted-sql-
string
User data flows into this manually-constructed SQL string. User
data can be safely inserted into SQL strings using prepared
statements or an object-relational mapper (ORM). Manually-
constructed SQL strings is a possible indicator of SQL injection,
which could let an attacker steal or manipulate data from the
database. Instead, use prepared statements
(`connection.PreparedStatement`) or a safe library.
Details: https://sg.run/9rzz

         73┆ "select id, hostname, ip, mac, status, description from SERVERS where status <> 'out"
         74┆     + " of order' order by "
         75┆     + column)) {


src/main/java/org/owasp/webgoat/lessons/xss/CrossSiteScriptingLesson5a.java
java.spring.security.injection.tainted-html-string.tainted-html-
string
Detected user input flowing into a manually constructed HTML
string. You may be accidentally bypassing secure methods of
rendering HTML by manually constructing HTML and this could create
a cross-site scripting vulnerability, which could let attackers
steal sensitive user data. To be sure this is safe, check that the
HTML is rendered safely. You can use the OWASP ESAPI encoder if you
must render user data.
Details: https://sg.run/ObdR

         76┆ cart.append("<p>We have charged credit card:" + field1 + "<br />");


src/main/java/org/owasp/webgoat/webwolf/FileServer.java
java.spring.security.injection.tainted-file-path.tainted-file-path
Detected user input controlling a file path. An attacker could
control the location of this file, to include going backwards in
the directory with '../'. To address this, ensure that user-
controlled variables in file paths are sanitized. You may also
consider using a utility method such as
org.apache.commons.io.FilenameUtils.getName(...) to only retrieve
the file name from the path.
Details: https://sg.run/x9o0

         78┆ myFile.transferTo(new File(destinationDir, myFile.getOriginalFilename()));
          ⋮┆----------------------------------------
         79┆ log.debug("File saved to {}", new File(destinationDir, myFile.getOriginalFilename()));

Some files were skipped or only partially analyzed.
Scan was limited to files tracked by git.
Partially scanned: 3 files only partially analyzed due to a parsing or internal Semgrep error
Scan skipped: 71 files matching .semgrepignore patterns
For a full list of skipped files, run semgrep with the --verbose flag.

Ran 50 rules on 276 files: 28 findings.
