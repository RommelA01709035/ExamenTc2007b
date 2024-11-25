plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.secondrecycleview"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.secondrecycleview"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    viewBinding{
        enable = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    implementation ("jp.wasabeef:glide-transformations:4.3.0")

    //Corrutinas
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1")

    //Fragment
    implementation ("androidx.fragment:fragment-ktx:1.5.0")
//Activity
    implementation ("androidx.activity:activity-ktx:1.5.0")
//Data binding
    implementation ("androidx.databinding:databinding-runtime:7.1.2")
// ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
// LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")

    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.3")

    implementation ("androidx.navigation:navigation-ui-ktx:2.5.3")


}