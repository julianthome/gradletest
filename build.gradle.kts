plugins {
    application
}

group = "com.gradletest"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    // JUnit Jupiter dependencies
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
}


application {
    mainClass.set("com.ktana.com.gradletest.Main")
}

tasks.test {
    useJUnitPlatform()
}

