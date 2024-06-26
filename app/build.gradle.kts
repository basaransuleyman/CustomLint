plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.bsrn.customlint"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.bsrn.customlint"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    lint {
        htmlReport = true
        htmlOutput = file("lint-report.html")
        textReport = true
        absolutePaths = false
        ignoreTestSources = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.2")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.android.tools.lint:lint-api:31.2.0")
    implementation("com.android.tools.lint:lint-checks:31.2.0")
    lintChecks(project(":customlint"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")

    compileOnly("com.android.tools.lint:lint-api:31.2.0")
}