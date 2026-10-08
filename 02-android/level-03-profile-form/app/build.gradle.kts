plugins { id("com.android.application"); id("org.jetbrains.kotlin.plugin.compose") }
 val checkpoint=providers.gradleProperty("checkpoint").orElse("4").get().toInt().also { require(it in 1..4) }
 android {
 namespace="lab.android"; compileSdk=36
 defaultConfig { applicationId="lab.learning.profileform"; minSdk=26; targetSdk=36; versionCode=1; versionName="1.0"; testInstrumentationRunner="androidx.test.runner.AndroidJUnitRunner"; buildConfigField("int","CHECKPOINT",checkpoint.toString()) }
 buildFeatures { compose=true; buildConfig=true }
 compileOptions { sourceCompatibility=JavaVersion.VERSION_17; targetCompatibility=JavaVersion.VERSION_17 }
 sourceSets.getByName("main").kotlin.setSrcDirs(listOf(if(providers.gradleProperty("reference").isPresent) "reference" else "src/main/kotlin"))
 }
 android { if(providers.gradleProperty("reference").isPresent) sourceSets.getByName("androidTest").kotlin.srcDir("referenceTests") }
dependencies {
 implementation(platform("androidx.compose:compose-bom:2024.12.01"))
 implementation("androidx.activity:activity-compose:1.10.1")
 implementation("androidx.compose.material3:material3")
 implementation("androidx.compose.ui:ui-tooling-preview")
 debugImplementation("androidx.compose.ui:ui-tooling")
 implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.2")
 testImplementation("junit:junit:4.13.2")
 testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
 androidTestImplementation(platform("androidx.compose:compose-bom:2024.12.01"))
 androidTestImplementation("androidx.compose.ui:ui-test-junit4")
 androidTestImplementation("androidx.test.ext:junit:1.3.0")
 debugImplementation("androidx.compose.ui:ui-test-manifest")
 implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.7")
implementation("androidx.lifecycle:lifecycle-runtime-compose:2.8.7")
 }

// Explicit test versions support modern emulator input APIs.
dependencies { androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0"); androidTestImplementation("androidx.test:runner:1.7.0") }
