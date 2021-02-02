A simple Github template that lets you create an **Android/Kotlin** project and be up and running in a **few seconds**.

This template is focused on delivering a project with **static analysis** and **continuous integration** already in place.

## Features 🎨

- **100% Kotlin-only template**.
- Sample Espresso, Instrumentation & JUnit tests.
- 100% Gradle Kotlin DSL setup.
- Dependency versions managed via `buildSrc`.
- CI Setup with GitHub Actions.
- Kotlin Static Analysis via `detekt`.
- Publishing Ready.
- Issues Template (bug report + feature request).
- Pull Request Template.

## Gradle Setup 🐘

This template is using [**Gradle Kotlin DSL**](https://docs.gradle.org/current/userguide/kotlin_dsl.html) as well as the [Plugin DSL](https://docs.gradle.org/current/userguide/plugins.html#sec:plugins_block) to setup the build.

Dependencies are centralized inside the [Dependencies.kt](buildSrc/src/main/java/Dependencies.kt) file in the `buildSrc` folder. This provides convenient auto-completion when writing your gradle files.

## Static Analysis 🔍

This template uses [**detekt**](https://github.com/detekt/detekt) to analyze the source code, with the configuration that is stored in the [detekt.yml](config/detekt/detekt.yml) file (the file has been generated with the `detektGenerateConfig` task).

## CI ⚙️

This template is using [**GitHub Actions**](https://github.com/mbobiosio/KotlinDSLSetup/actions) as CI. You don't need to setup any external service and you should have a running CI once you start using this template.

There are currently the following workflows available:
- [Validate Gradle Wrapper](.github/workflows/gradle-wrapper-validation.yml) - Will check that the gradle wrapper has a valid checksum
- [Pre Merge Checks](.github/workflows/pre-merge.yaml) - Will run the `build`, `check` and `publishToMavenLocal` tasks.
- [Pull request](.github/workflows/pull_request.yml) - Will run the `build` for pull requests.

## Publishing 🚀

The template is setup to be **ready to publish** a library/artifact on a Maven Repository. If you're using JitPack, you don't need any further configuration and you can just configure the repo on JitPack. If you're using another repository (MavenCentral/JCenter/etc.), you need to specify the publishing coordinates.

## Contributing 🤝

Feel free to open a issue or submit a pull request for any bugs/improvements.