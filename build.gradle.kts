plugins {
    kotlin("jvm") version "1.9.24"
}

group = "org.practice"
version = "1.0-SNAPSHOT"


kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks {
    test {
        useJUnitPlatform()
    }
}