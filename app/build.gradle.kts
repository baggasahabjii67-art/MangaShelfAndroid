plugins {
    id("com.android.application")
}

android {
    namespace = "com.mangashelf.app"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.mangashelf.app"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }
}
