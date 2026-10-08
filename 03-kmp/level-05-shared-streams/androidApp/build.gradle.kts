plugins { id("com.android.application"); id("org.jetbrains.kotlin.plugin.compose") }
 android { namespace="lab.host"; compileSdk=36
 defaultConfig { applicationId="lab.learning.sharedstreams";minSdk=26;targetSdk=36;versionCode=1;versionName="1.0" }
 buildFeatures { compose=true }
 compileOptions { sourceCompatibility=JavaVersion.VERSION_17;targetCompatibility=JavaVersion.VERSION_17 }
 }
 dependencies { implementation(project(":shared"));implementation(platform("androidx.compose:compose-bom:2024.12.01"));implementation("androidx.activity:activity-compose:1.10.1");implementation("androidx.compose.material3:material3") }

dependencies { implementation("androidx.lifecycle:lifecycle-runtime-compose:2.8.7"); implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2") }
