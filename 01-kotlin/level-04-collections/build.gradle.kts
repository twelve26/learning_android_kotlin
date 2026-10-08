plugins { kotlin("jvm") }
 kotlin { compilerOptions { jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17) } }
 java { sourceCompatibility=JavaVersion.VERSION_17; targetCompatibility=JavaVersion.VERSION_17 }
 sourceSets {
     main { kotlin.setSrcDirs(listOf(if (providers.gradleProperty("reference").isPresent) "reference" else "exercises")) }
     test { kotlin.setSrcDirs(listOf("tests")) }
 }
 dependencies {
     implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.2")
     testImplementation(kotlin("test-junit5"))
     testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.10.2")
     testRuntimeOnly("org.junit.platform:junit-platform-launcher")
 }
 tasks.test { useJUnitPlatform(); testLogging { events("failed", "skipped"); exceptionFormat=org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL } }
