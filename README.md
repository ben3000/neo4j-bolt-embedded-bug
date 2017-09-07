# neo4j-bolt-embedded-bug

Enter your Neo4j instanceʼs password in <code>src/main/resources/application.yml</code> and then run it using <code>./gradlew bootRun</code> and an exception is thrown:

<pre>
org.neo4j.ogm.exception.ConfigurationException: Could not load driver class org.neo4j.ogm.drivers.embedded.driver.EmbeddedDriver
</pre>
