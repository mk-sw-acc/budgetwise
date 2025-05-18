rootProject.name = "BudgetWise"

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

include(":app")

include(":core:ui")
include(":core:network")
include(":core:database")
include(":core:model")

include(":feature:addexpense:data")
include(":feature:addexpense:domain")
include(":feature:addexpense:presentation")

include(":feature:history:data")
include(":feature:history:domain")
include(":feature:history:presentation")
