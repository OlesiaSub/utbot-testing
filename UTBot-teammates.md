UTbot was launched on the [TEAMMATES](https://github.com/TEAMMATES/teammates) project.  
Generated tests can be found in the `src/utbot/teammates-test` directory.  
The tool was only launched on the `src/main/java` directory, some packages were skipped. The detailed description can be found below.

#### TEAMMATES overview
TEAMMATES is a free online tool for managing peer evaluations and other feedback paths of your students. 
It is provided as a cloud-based service for educators/students.    
* Language: Java
* Stars: 1.3k 
* Forks: 2.6k
* Is currently being maintained
* Is currently used by hundreds of universities across the world

#### Tests generation details
The tool was only launched on the `src/main/java` directory.  
`ui` package was skipped entirely.
The following packages were partially or entirely skipped:
* `common.datatransfer.attributes`
* `common.datatransfer.logs`
* `common.datatransfer.questions`
* `common.storage.api`
* `common.storage.search`

The reason is, classes in these packages partially or entirely extend abstract classes located
in these packages, which leads to the silent and unexplained UTBot failure.