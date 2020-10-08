plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
}

group = "mn.dulmandakh"
version = "0.0.1"

android {
    compileSdkVersion(29)
    defaultConfig {
        minSdkVersion(19)
    }

    sourceSets.getByName("main") {
        java.srcDir("src/main/kotlin")
    }
}

publishing {
    // publications {
    //     create<MavenPublication>("default") {

    //         // from(components["kotlin"])
    //     }
    // }

    repositories {
        maven {
            url = uri("$buildDir/repository") 
        }
    }
}

dependencies {
    //noinspection GradleDynamicVersion
    implementation("com.facebook.react:react-native:+")  // From node_modules
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}