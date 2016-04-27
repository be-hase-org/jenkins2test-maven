node {
    stage 'Build and test'
    env.PATH = "${tool 'maven3.3.9'}/bin:${env.PATH}"

    checkout scm
    sh 'mvn clean test'
}
