pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }

    stages {
        stage('Clean') {
            steps {
                sh './gradlew clean'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew assemble'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Deploy') {
            steps {
                sh './gradlew build'
            }
        }
    }
}