node {
    git branch: 'refs/heads/master', url: 'https://github.com/be-hase/jenkins2test-maven.git'
    def mvnHome = tool 'M3'
    sh "${mvnHome}/bin/mvn clean test"
}
