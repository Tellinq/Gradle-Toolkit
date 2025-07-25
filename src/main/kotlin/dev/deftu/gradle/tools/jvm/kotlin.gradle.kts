package dev.deftu.gradle.tools.jvm

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import dev.deftu.gradle.utils.getMajorJavaVersion
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

val version = getMajorJavaVersion()
if (version != 0) {
    val javaVersion = JavaVersion.toVersion(version)
    tasks.withType<KotlinCompile> {
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(javaVersion.toString()))
        }
    }
}
