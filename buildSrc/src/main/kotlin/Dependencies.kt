import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {

    /*Build Tools*/
    private const val ANDROID_TOOLS = "com.android.tools.build:gradle:${Versions.Gradle.GRADLE_VERSION}"

    private const val coreKTX = "androidx.core:core-ktx:${Versions.Google.AndroidX.CORE_KTX}"
    private const val KOTLIN_JDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Kotlin.KOTLIN_JDK}"

    /*AndroidX*/
    private const val appCompat = "androidx.appcompat:appcompat:${Versions.Google.AndroidX.APP_COMPAT}"
    private const val materialDesign = "com.google.android.material:material:${Versions.Google.AndroidX.DESIGN}"
    private const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.Google.AndroidX.CONSTRAINT_LAYOUT}"
    private const val fragmentKTX = "androidx.navigation:navigation-fragment-ktx:${Versions.Google.AndroidX.NAV_KTX}"
    private const val navKTX = "androidx.navigation:navigation-ui-ktx:${Versions.Google.AndroidX.NAV_KTX}"
    private const val lifecycleExtensions = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Google.AndroidX.LIFECYCLE}"
    private const val lifeDataKTX = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Google.AndroidX.LIFECYCLE}"

    /*Test*/
    private const val jUnit = "junit:junit:${Versions.Test.JUNIT}"
    private const val androidXTestRules = "androidx.test:rules:${Versions.Test.ANDROIDX_TEST}"
    private const val androidXTestRunner = "androidx.test:runner:${Versions.Test.ANDROIDX_TEST}"
    private const val testJUnitKTX = "androidx.test.ext:junit-ktx:${Versions.Test.EXT_J_UNIT}"
    private const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.Test.ESPRESSO}"

    /*DETEKT*/
    const val DETEKT = Versions.Detekt.DETEKT_LIB
    const val DETEKT_PLUGIN = "io.gitlab.arturbosch.detekt"
    internal const val DETEKT_FORMATTING = "io.gitlab.arturbosch.detekt:detekt-formatting:${Versions.Detekt.DETEKT_FORMATTING}"

    val appDependencies = arrayListOf<String>().apply {
        add(KOTLIN_JDK)
        add(coreKTX)
        add(appCompat)
        add(materialDesign)
        add(constraintLayout)
        add(fragmentKTX)
        add(navKTX)
        add(lifecycleExtensions)
        add(lifeDataKTX)
    }

    val test = arrayListOf<String>().apply {
        add(jUnit)
    }

    val androidTest = arrayListOf<String>().apply {
        add(espressoCore)
        add(androidXTestRules)
        add(androidXTestRunner)
        add(testJUnitKTX)
    }

    val classPath = arrayListOf<String>().apply {
        add(ANDROID_TOOLS)
    }
}

fun DependencyHandler.classPath(list: List<String>) {
    list.forEach { dependency ->
        add("classpath", dependency)
    }
}

fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementations(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}

fun DependencyHandler.detektFormatting() {
    add("detektPlugins", Dependencies.DETEKT_FORMATTING)
}