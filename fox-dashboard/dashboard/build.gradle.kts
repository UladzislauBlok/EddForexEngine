plugins {
    application
}

repositories {
     mavenCentral()
}

dependencies {
    implementation(libs.spring.boot.admin)
    
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "org.bloku.fox.SpringBootAdminServerApplication"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
