plugins {
    java
    id("jacoco")
    id("org.sonarqube") version "3.3" 
}
 
group = "bhos-qa" 
version = "1.0-SNAPSHOT"
 
repositories {
    mavenCentral() 
}
 
dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.2") 
}
 

jacoco {
    toolVersion = "0.8.9" 
}
 
tasks.jacocoTestReport {
    reports {
        xml.required.set(true) 
        html.required.set(true) 
    }
}
 
tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}
 

sonarqube {
    properties {
        property("sonar.projectKey", "bhos-qa_lab-3-EsmiraFarziyeva2004")
        property("sonar.organization", "bhos-qa")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.login", "1de86552108fdc61438b1abf41e26a582494134d")
        property("sonar.sources", "src/main/java") 
        property("sonar.java.binaries", "build/classes/java/main")
        property("sonar.java.libraries", "build/libs/*.jar")
        property("sonar.coverage.jacoco.xmlReportPaths", "build/reports/jacoco/test/jacocoTestReport.xml")
    }
}
