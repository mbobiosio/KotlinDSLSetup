// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classPath(Dependencies.classPath)
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Gradle.KOTLIN}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

plugins {
    id(Dependencies.DETEKT_PLUGIN).version(Dependencies.DETEKT)
}

dependencies {
    detektFormatting()
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete (rootProject.buildDir)
}

tasks.register("detektAll", io.gitlab.arturbosch.detekt.Detekt::class) {
    buildUponDefaultConfig = true
    autoCorrect = true
    parallel = true
    setSource(files(projectDir))
    config.setFrom(files("$rootDir/config/detekt/detekt.yml"))
    include("**/*.kt")
    include("**/*.kts")
    exclude("**/build/**")
    exclude("**/buildSrc/**")
    exclude("**/test/**/*.kt")
    reports {
        xml.enabled = false
        html.enabled = false
        txt.enabled = false
    }
}