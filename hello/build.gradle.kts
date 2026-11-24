plugins {
    id("org.jetbrains.kotlin.jvm") version "2.4.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.4.20"
    application
}

dependencies {
    //if you want that one module/project in your project communicates with another module/project
    //add that module/project in dependency by below example
    //Here I want hello module to use some function present in rick module so I need to add rick module here
    implementation(project(":rick"))
    //this dependency is used to convert object into json
    //different ways to write that

    //implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")

    //implementation(group = "org.jetbrains.kotlin", name = "kotlinx-serialization", version ="1.9.0")

    //recommended way
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.coroutines.core)

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

application {
    mainClass.set("au.com.wool.unicorn_factory.HelloKt")
}
