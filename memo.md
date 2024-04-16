## gradle init --type java-application
「build.gradle」を作成するコマンド


## gradle dependencies
Starting a Gradle Daemon (subsequent builds will be faster)

> Task :dependencies

------------------------------------------------------------
Root project 'myapp'
------------------------------------------------------------

annotationProcessor - Annotation processors and their dependencies for source set 'main'.
No dependencies

apiElements - API elements for main. (n)
No dependencies

archives - Configuration for archive artifacts. (n)
No dependencies

compileClasspath - Compile classpath for source set 'main'.
+--- org.springframework:spring-webmvc:5.3.13
|    +--- org.springframework:spring-aop:5.3.13
|    |    +--- org.springframework:spring-beans:5.3.13
|    |    |    \--- org.springframework:spring-core:5.3.13
|    |    |         \--- org.springframework:spring-jcl:5.3.13
|    |    \--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-beans:5.3.13 (*)
|    +--- org.springframework:spring-context:5.3.13
|    |    +--- org.springframework:spring-aop:5.3.13 (*)
|    |    +--- org.springframework:spring-beans:5.3.13 (*)
|    |    +--- org.springframework:spring-core:5.3.13 (*)
|    |    \--- org.springframework:spring-expression:5.3.13
|    |         \--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-expression:5.3.13 (*)
|    \--- org.springframework:spring-web:5.3.13
|         +--- org.springframework:spring-beans:5.3.13 (*)
|         \--- org.springframework:spring-core:5.3.13 (*)
+--- org.springframework:spring-context:5.3.13 (*)
\--- javax.servlet:javax.servlet-api:4.0.1

compileOnly - Compile only dependencies for source set 'main'. (n)
No dependencies

default - Configuration for default artifacts. (n)
No dependencies

implementation - Implementation only dependencies for source set 'main'. (n)
+--- org.springframework:spring-webmvc:5.3.13 (n)
+--- org.springframework:spring-context:5.3.13 (n)
\--- javax.servlet:javax.servlet-api:4.0.1 (n)

runtimeClasspath - Runtime classpath of source set 'main'.
+--- org.springframework:spring-webmvc:5.3.13
|    +--- org.springframework:spring-aop:5.3.13
|    |    +--- org.springframework:spring-beans:5.3.13
|    |    |    \--- org.springframework:spring-core:5.3.13
|    |    |         \--- org.springframework:spring-jcl:5.3.13
|    |    \--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-beans:5.3.13 (*)
|    +--- org.springframework:spring-context:5.3.13
|    |    +--- org.springframework:spring-aop:5.3.13 (*)
|    |    +--- org.springframework:spring-beans:5.3.13 (*)
|    |    +--- org.springframework:spring-core:5.3.13 (*)
|    |    \--- org.springframework:spring-expression:5.3.13
|    |         \--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-expression:5.3.13 (*)
|    \--- org.springframework:spring-web:5.3.13
|         +--- org.springframework:spring-beans:5.3.13 (*)
|         \--- org.springframework:spring-core:5.3.13 (*)
+--- org.springframework:spring-context:5.3.13 (*)
\--- javax.servlet:javax.servlet-api:4.0.1

runtimeElements - Elements of runtime for main. (n)
No dependencies

runtimeOnly - Runtime only dependencies for source set 'main'. (n)
No dependencies

testAnnotationProcessor - Annotation processors and their dependencies for source set 'test'.
No dependencies

testCompileClasspath - Compile classpath for source set 'test'.
+--- org.springframework:spring-webmvc:5.3.13
|    +--- org.springframework:spring-aop:5.3.13
|    |    +--- org.springframework:spring-beans:5.3.13
|    |    |    \--- org.springframework:spring-core:5.3.13
|    |    |         \--- org.springframework:spring-jcl:5.3.13
|    |    \--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-beans:5.3.13 (*)
|    +--- org.springframework:spring-context:5.3.13
|    |    +--- org.springframework:spring-aop:5.3.13 (*)
|    |    +--- org.springframework:spring-beans:5.3.13 (*)
|    |    +--- org.springframework:spring-core:5.3.13 (*)
|    |    \--- org.springframework:spring-expression:5.3.13
|    |         \--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-expression:5.3.13 (*)
|    \--- org.springframework:spring-web:5.3.13
|         +--- org.springframework:spring-beans:5.3.13 (*)
|         \--- org.springframework:spring-core:5.3.13 (*)
+--- org.springframework:spring-context:5.3.13 (*)
\--- javax.servlet:javax.servlet-api:4.0.1

testCompileOnly - Compile only dependencies for source set 'test'. (n)
No dependencies

testImplementation - Implementation only dependencies for source set 'test'. (n)
No dependencies

testRuntimeClasspath - Runtime classpath of source set 'test'.
+--- org.springframework:spring-webmvc:5.3.13
|    +--- org.springframework:spring-aop:5.3.13
|    |    +--- org.springframework:spring-beans:5.3.13
|    |    |    \--- org.springframework:spring-core:5.3.13
|    |    |         \--- org.springframework:spring-jcl:5.3.13
|    |    \--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-beans:5.3.13 (*)
|    +--- org.springframework:spring-context:5.3.13
|    |    +--- org.springframework:spring-aop:5.3.13 (*)
|    |    +--- org.springframework:spring-beans:5.3.13 (*)
|    |    +--- org.springframework:spring-core:5.3.13 (*)
|    |    \--- org.springframework:spring-expression:5.3.13
|    |         \--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-core:5.3.13 (*)
|    +--- org.springframework:spring-expression:5.3.13 (*)
|    \--- org.springframework:spring-web:5.3.13
|         +--- org.springframework:spring-beans:5.3.13 (*)
|         \--- org.springframework:spring-core:5.3.13 (*)
+--- org.springframework:spring-context:5.3.13 (*)
\--- javax.servlet:javax.servlet-api:4.0.1

testRuntimeOnly - Runtime only dependencies for source set 'test'. (n)
No dependencies

(*) - dependencies omitted (listed previously)

(n) - Not resolved (configuration is not meant to be resolved)

A web-based, searchable dependency report is available by adding the --scan option.

BUILD SUCCESSFUL in 2s
1 actionable task: 1 executed