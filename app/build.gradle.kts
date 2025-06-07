import java.util.Properties
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.subhash.movieplus"
    compileSdk = 35
    buildFeatures.buildConfig = true
    defaultConfig {
        applicationId = "com.subhash.movieplus"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        val localPropertiesFile = rootProject.file("local.properties")
        val localProperties = Properties().apply {
            localPropertiesFile.inputStream().use { load(it) }
        }

        fun getLocalProperty(key: String): String {
            return localProperties.getProperty(key)?.takeIf { it.isNotBlank() }
                ?: throw GradleException("Missing property '$key' in local.properties")
        }

        buildConfigField("String", "API_KEY", "\"${getLocalProperty("API_KEY")}\"")
        buildConfigField("String", "TOKEN", "\"${getLocalProperty("TOKEN")}\"")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    val roomVersion = "2.7.1"

    implementation(libs.androidx.core.ktx.v180)
    implementation(libs.androidx.appcompat.v161)
    implementation(libs.material.v150)
    implementation(libs.androidx.constraintlayout.v214)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v115)
    androidTestImplementation(libs.androidx.espresso.core.v351)

    // navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    // retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.logging.interceptor)

    //gson
    implementation(libs.gson)

    // hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)

    //coroutine
    implementation(libs.kotlinx.coroutines.android)

    // glide
    implementation(libs.glide)

    //room
    implementation("androidx.room:room-runtime:$roomVersion")
    implementation(libs.androidx.room.ktx)
    annotationProcessor("androidx.room:room-compiler:$roomVersion")
    ksp("androidx.room:room-compiler:$roomVersion")

    //paging
    implementation(libs.androidx.paging.runtime.ktx)
}
