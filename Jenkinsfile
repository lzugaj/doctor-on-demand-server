pipeline {
    agent any
    tools {
        gradle 'Gradle 6.5.1'
    }

    triggers {
        pollSCM '* * * * *'
    }

    stages {
        stage('Clean') {
            steps {
                sh 'gradlew clean'
            }
        }

        stage('Build') {
            steps {
                sh 'gradlew assemble'
            }
        }

        stage('Test') {
            steps {
                sh 'gradlew test'
            }
        }

        stage('Deploy') {
            steps {
                sh 'gradlew build -x test'
            }
        }
    }
}