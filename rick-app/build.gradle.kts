
plugins {

    alias(libs.plugins.androidApplication)
    //id("org.jetbrains.kotlin.jvm") version "2.4.20"
//    alias(libs.plugins.composeCompiler)
}

android {

    namespace = "au.com.wool.unicorn_factory.rickapp"
    compileSdk = 32
    buildToolsVersion = "36.0.0"
}