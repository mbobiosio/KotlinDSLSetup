plugins {
    id ("com.android.application")
    id ("kotlin-android")
}

android {
    compileSdkVersion(Versions.Android.COMPILE_SDK)
    buildToolsVersion(Versions.Android.BUILD_TOOLS)

    defaultConfig {
        applicationId = Versions.DefaultConfig.appId
        minSdkVersion(Versions.DefaultConfig.minSdk)
        targetSdkVersion(Versions.DefaultConfig.targetSdk)
        versionCode = Versions.DefaultConfig.versionCode
        versionName = Versions.DefaultConfig.versionName

        testInstrumentationRunner = Versions.DefaultConfig.androidTestInstrumentation
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementations(Dependencies.appDependencies)
    testImplementation(Dependencies.test)
    androidTestImplementation(Dependencies.androidTest)
}