import org.gradle.api.invocation.Gradle

object Versions {

    object Android {
        const val BUILD_TOOLS = "30.0.3"
        const val COMPILE_SDK = 30
    }

    object DefaultConfig {
        const val appId = "com.mbobiosio.kotlindslsetup"
        const val minSdk = 21
        const val targetSdk = 30
        const val versionCode = 1
        const val versionName = "1.0.0"
        const val androidTestInstrumentation = "androidx.test.runner.AndroidJUnitRunner"
    }

    object Gradle {
        const val KOTLIN = "1.4.21"
        const val GRADLE_VERSION = "4.1.2"
    }

    object Kotlin {
        const val KOTLIN_JDK = Gradle.KOTLIN
    }

    object Google {
        object AndroidX {
            const val CORE_KTX = "1.3.2"
            const val APP_COMPAT = "1.2.0"
            const val CONSTRAINT_LAYOUT = "2.0.0"
            const val DESIGN = "1.2.1"
            const val NAV_KTX = "2.3.2"
            const val LIFECYCLE = "2.2.0"
        }
    }

    object Test {
        const val JUNIT = "4.13.1"
        const val EXT_J_UNIT = "1.1.1"
        const val ESPRESSO = "3.2.0"
    }
}