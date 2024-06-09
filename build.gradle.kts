plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-core:5.3.13")
    implementation("org.springframework:spring-context:5.3.13")
    implementation("org.springframework:spring-boot-starter")
    implementation("jakarta.annotation:jakarta.annotation-api:1.3.5")
    implementation("javax.inject:javax.inject:1")
    compileOnly("org.projectlombok:lombok:1.18.24")
    implementation("org.springframework.boot:spring-boot-starter:3.3.0")


    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}