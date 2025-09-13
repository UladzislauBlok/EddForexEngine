plugins {
    java
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
