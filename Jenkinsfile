#!groovy

node {
    stage 'Checkout'
    checkout scm

    stage 'Build and test'
    env.PATH = "${tool 'maven3.3.9'}/bin:${env.PATH}"
    sh 'mvn clean test'
}
