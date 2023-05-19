plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}
android{
    namespace = "com.jd.network"
    compileSdk = 33

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildTypes {
        getByName("release") {
            buildConfigField("String", "BASE_URL", "\"https://rest.coinapi.io/v1/\"")


        }
        getByName("debug") {
            buildConfigField("String", "BASE_URL", "\"https://rest.coinapi.io/v1/\"")

        }
    }


}
dependencies {

    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.okhttp.logging)
    implementation(libs.kotlin.serialization.json)
    implementation(libs.hilt.android)

}