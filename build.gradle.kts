import org.jetbrains.intellij.platform.gradle.TestFrameworkType

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.changelog")
    id("org.jetbrains.intellij.platform")
}

intellijPlatform {
    instrumentCode = false
}

dependencies {
    testImplementation(libs.junit)

    intellijPlatform {
        local("C:/Program Files/JetBrains/IntelliJ IDEA 2026.1.3")
        testFramework(TestFrameworkType.Platform)
        bundledPlugin("com.intellij.java")
    }
}