pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }

    stages {
        stage('Clean') {
            steps {
                bat './gradlew clean'
            }
        }

        stage('Build') {
            steps {
                bat './gradlew assemble'
            }
        }

        stage('Test') {
            steps {
                bat './gradlew test'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                bat './gradlew sonar'
            }
        }

        // Build Docker image
        // Push Docker image
    }
}