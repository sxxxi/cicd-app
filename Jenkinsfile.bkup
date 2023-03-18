pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile'
                sh 'mvn clean'
            }
        }
        stage('Deploy') {
            steps {
                sh './scripts/check-container-exist.sh spring-img spring-img-deploy'
            }
        }
    }
}
