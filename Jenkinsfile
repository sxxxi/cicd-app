pipeline {
    agent {
        docker { image 'node:19-alpine' }
    }
    
    stages {
        stage('Test') {
            steps {
            sh 'node --version'
            }
        }
    }
}
