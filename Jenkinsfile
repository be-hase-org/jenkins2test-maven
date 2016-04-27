#!groovy

node {
    step([$class: 'GitHubSetCommitStatusBuilder'])

    stage 'Checkout'
    checkout scm

    stage 'Build and test'
    env.PATH = "${tool 'maven3.3.9'}/bin:${env.PATH}"

    try {
        sh 'mvn clean test'
        currentBuild.result = 'SUCCESS'
    } catch (err) {
        currentBuild.result = 'FAILURE'
    }

    stage 'Notify'
    step([$class: 'GitHubCommitNotifier', resultOnFailure: 'FAILURE'])
}
