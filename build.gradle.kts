// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
//    id ("org.jetbrains.kotlin.android") version "2.1.20" apply false
//    alias(libs.plugins.kotlin.kapt) apply false
    id("androidx.room") version "2.7.1" apply false
    id("com.google.dagger.hilt.android") version "2.56.2" apply false
}