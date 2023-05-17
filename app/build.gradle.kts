plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
}

android {
    compileSdk = 33
    namespace = project.name

    defaultConfig {
        applicationId = "com.jd.cointracker"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        applicationId = "com.jd.cointracker"

        testInstrumentationRunner = "com.jd.CoinTracker.HiltTestRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }


    buildFeatures {
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.5"
    }

}

dependencies {

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.compose.runtime.tracing)
    implementation(libs.androidx.hilt.navigation.compose)
    implementation(libs.androidx.navigation.compose)
}