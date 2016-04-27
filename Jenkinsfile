#!groovy

node {
    stage 'Checkout'
    checkout scm

    stage 'Build and test'
    env.PATH = "${tool 'maven3.3.9'}/bin:${env.PATH}"

    try {
        sh 'mvn clean test'
    } catch (err) {
        step([$class: 'GitHubCommitNotifier', resultOnFailure: "Error"])
    }
}
