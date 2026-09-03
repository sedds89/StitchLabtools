plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "org.aide.runtimepack.core"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.aide.victor.lab"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "bones-0.1"
    }

    buildFeatures {
        aidl = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
}
