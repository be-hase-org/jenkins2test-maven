node {
    stage 'Build and test'
    env.PATH = "${tool 'maven3.3.9'}/bin:${env.PATH}"

    git 'https://github.com/be-hase/jenkins2test-maven.git'
    sh 'mvn clean test'
}
