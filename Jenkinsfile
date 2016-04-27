#!groovy

node {
    step([$class: 'GitHubSetCommitStatusBuilder'])

    stage 'Checkout'
    checkout scm
    def pom = readMavenPom()
    def projectName = pom.name
    def projectVersion = pom.version

    stage 'Build and test'
    env.PATH = "${tool 'maven3.3.9'}/bin:${env.PATH}"

    try {
        echo "Building ${projectName} - ${projectVersion}"
        sh 'mvn clean test'
        currentBuild.result = 'SUCCESS'
    } catch (err) {
        currentBuild.result = 'FAILURE'
    }

    stage 'Notify'
    step([$class: 'GitHubCommitNotifier', resultOnFailure: 'FAILURE'])
}

@com.cloudbees.groovy.cps.NonCPS
def isOK() {
    return "SUCCESS".equals(currentBuild.result)
}
