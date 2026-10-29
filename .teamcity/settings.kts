import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2026.1"

project {

    vcsRoot(HttpsGithubComOllvenVsFus1refsHeadsMain)

    buildType(Build)
}

object Build : BuildType({
    name = "Build"

    vcs {
        root(HttpsGithubComOllvenVsFus1refsHeadsMain)
    }
})

object HttpsGithubComOllvenVsFus1refsHeadsMain : GitVcsRoot({
    name = "https://github.com/ollven/vs-fus1#refs/heads/main"
    url = "https://github.com/ollven/vs-fus1"
    branch = "refs/heads/main"
    branchSpec = "+:refs/heads/*"
    authMethod = token {
        userName = "oauth2"
        tokenId = "tc_token_id:CID_5e204115b712c04bfc3716b326a60cc9:-1:2beb358d-163d-433c-a081-f59ea9312103"
    }
})
