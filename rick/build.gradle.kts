plugins {
    id("org.jetbrains.kotlin.jvm") version "2.4.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.4.20"
    id("com.apollographql.apollo") version "5.2.0"

}

dependencies {
    //this dependency is used to convert object into json
    //different ways to write that

    //implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")

    //implementation(group = "org.jetbrains.kotlin", name = "kotlinx-serialization", version ="1.9.0")

    //recommended way
    implementation(libs.kotlinx.serialization.json)

    testImplementation("org.jetbrains.kotlin:kotlin-test")

   // implementation("com.apollographql.apollo:apollo-runtime:5.1.0")
    implementation(libs.apollo.graphql)

}

apollo {
    service("rickandmorty") {
        packageName.set("au.com.wool.unicorn_factory.rickandmorty")
        introspection {
            endpointUrl.set("https://rickandmortyapi.com/graphql")
            schemaFile.set(file("src/graphql/rickandmorty/schema.graphqls"))
        }
    }
}