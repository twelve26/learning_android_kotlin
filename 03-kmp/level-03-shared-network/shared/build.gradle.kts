plugins {
 kotlin("multiplatform"); kotlin("plugin.serialization"); id("com.android.kotlin.multiplatform.library")
 }
 kotlin {
 android {
 namespace="lab.shared"; compileSdk=36; minSdk=26
 withHostTestBuilder {}.configure {}
 compilerOptions { jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17) }
 }
 iosArm64(); iosSimulatorArm64()
 targets.withType<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget>().configureEach {
 binaries.framework { baseName="Shared"; isStatic=true }
 }
 sourceSets {
 commonMain {
 kotlin.setSrcDirs(listOf(if(providers.gradleProperty("reference").isPresent) "reference/commonMain" else "src/commonMain/kotlin"))
 dependencies {
 implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
 implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.1")
 implementation("io.ktor:ktor-client-core:3.1.3")
} }
 commonTest.dependencies { implementation(kotlin("test")); implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
 implementation("io.ktor:ktor-client-mock:3.1.3")
}
 androidMain.dependencies {
 implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.2")
 implementation("io.ktor:ktor-client-okhttp:3.1.3")
}
 iosMain.dependencies {
 implementation("io.ktor:ktor-client-darwin:3.1.3")
}
 }
 }
