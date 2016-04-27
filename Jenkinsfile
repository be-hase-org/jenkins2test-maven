node {
    git branch: 'refs/heads/master', url: 'https://github.com/be-hase/jenkins2test-maven'
    def mvnHome = tool 'M3'
    sh "${mvnHome}/bin/mvn clean test"
}
