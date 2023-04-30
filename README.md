# wiremock-testing jdk17 is required

##Wiremock: will be helpful to see how apis behave when dependent,
API response is delayed
API response time is fluctuating
API response size is huge
API hans many positive and negative scenarios, all of these of dependent system API can be simulated



To test a system, all dependent systems can’t be set up or handled if there are many dependent systems with different use cases. Easyway is to mock them for integration testing. 

## Insomnia Setup:
There are systems are there, 

1, System to be tested and 2, Dependent system of System to be tested


Install Insomnia and import Insomnia_2023-04-29-dependent-system.json file which will give all the apis to be tested. Application > Preferences > Data will have an option for import.

## Wiremock setup:

1, Download  wiremock from here https://repo1.maven.org/maven2/com/github/tomakehurst/wiremock-jre8-standalone/2.35.0/wiremock-jre8-standalone-2.35.0.jar

2, create folder mappings in the location where downloaded wire mock jar is there and place this mappings.json file inside

3, Execute below command from the location where downloaded wire mock jar is there

C:\Users\Joseph Kingston Leo\Downloads\wiremock\wiremock1>java -jar wiremock-jre8-standalone-2.35.0.jar --port 1111

 port:                         1111\
 enable-browser-proxying:      false\
 disable-banner:               false\
 no-request-journal:           false\
 verbose:                      false




## System to be tested:

1, Create a jar(system_to_be_test.jar) file from current project and place the system_to_be_test.jar in a folder
2, Execute this command java -jar system_to_be_tested.jar
 from that folder 

C:\Users\Joseph Kingston Leo\Desktop\wiremock-for-testers>java -jar system_to_be_tested.jar

 
 :: Spring Boot ::                (v3.0.6)

2023-04-29T17:29:39.719+05:30  INFO 15808 --- [           main] com.wiremock.Application                 : Starting Application v0.0.1-SNAPSHOT using Java 17.0.7 with PID 15808 (C:\Users\Joseph Kingston Leo\Desktop\wiremock-for-testers\system_to_be_tested.jar started by Joseph Kingston Leo in C:\Users\Joseph Kingston Leo\Desktop\wiremock-for-testers)
2023-04-29T17:29:39.723+05:30  INFO 15808 --- [           main] com.wiremock.Application                 : No active profile set, falling back to 1 default profile: "default"\
2023-04-29T17:29:40.487+05:30  INFO 15808 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)\
2023-04-29T17:29:40.494+05:30  INFO 15808 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]\
2023-04-29T17:29:40.494+05:30  INFO 15808 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.8]\
2023-04-29T17:29:40.569+05:30  INFO 15808 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext\
2023-04-29T17:29:40.571+05:30  INFO 15808 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 795 ms\
2023-04-29T17:29:40.895+05:30  INFO 15808 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''\
2023-04-29T17:29:40.911+05:30  INFO 15808 --- [           main] com.wiremock.Application                 : Started Application in 1.538 seconds (process running for 1.866)\




3, you will see below output
