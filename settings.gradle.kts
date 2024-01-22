pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Retrofit2"
include(":app")
include(":features:account")
include(":features:account")
include(":entitites")
include(":domain")
include(":data")
include(":network")
include(":common")
include(":flights")
include(":features:flights")
