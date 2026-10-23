plugins {
    id("org.jetbrains.kotlin.jvm") version "2.4.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.4.20"
    application
}

dependencies {
    //this dependency is used to convert object into json
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

application {
    mainClass.set("au.com.wool.unicorn_factory.HelloKt")
}
