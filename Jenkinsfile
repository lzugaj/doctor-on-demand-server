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

        stage('Deploy') {
            steps {
                bat './gradlew build'
            }
        }
    }
}