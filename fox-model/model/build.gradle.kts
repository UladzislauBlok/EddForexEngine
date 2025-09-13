plugins {
    java
    `maven-publish`
    id("com.google.protobuf") version "0.9.4"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.protobuf:protobuf-java:4.32.0")
}

protobuf {
  protoc {
    artifact = "com.google.protobuf:protoc:4.32.0"
  }
}

tasks.jar {
    archiveBaseName.set("fox-model")
    exclude("v1/")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "org.bloku.fox"
            artifactId = "fox-model"
            version = "0.0.1"

            from(components["java"])
        }
    }    
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/UladzislauBlok/EddForexEngine")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
