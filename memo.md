## gradle init --type java-application
「build.gradle」を作成するコマンド

## gradle build
プロジェクト全体のビルドを実行する
「Javaソースコードのコンパイル」「テストの実行」「必要なリソースのコピー」「アプリケーションのパッケージング」
- build/が作成される
- build/libs/myapp.jarが作成される
- build/tmp/jar/MANIFEST.MFが作成される

## gradle compileJava
Javaソースコードのコンパイルだけを行う

## gradle bootRun
GradleプロジェクトでSpring Bootアプリケーションを実行するためのGradleタスク
このコマンドを実行すると、Spring Bootアプリケーションがビルドされ、埋め込みのTomcatサーバーで起動します

1. Gradleプロジェクト内の依存関係を解決し、プロジェクトをビルドします。
2. Spring Bootアプリケーションを起動します。これにより、組み込みのTomcatサーバーが起動し、アプリケーションが実行されます。

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

41:18
20:27
21:34
19:32
25

3月: 1140 / 11598 = 0.098 => 91
2月: 600 / 7467 = 0.08 => 92
1月: 780 / 9934 = 0.07 => 93
12月: 870 / 10292 = 0.08 => 92