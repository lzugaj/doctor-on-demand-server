pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }

    stages {
        stage('Clean') {
            steps {
                gradlew('clean')
            }
        }

        stage('Build') {
            steps {
                gradlew('assemble')
            }
        }

        stage('Test') {
            steps {
                gradlew('test')
            }
        }

        stage('Deploy') {
            steps {
                gradlew('build')
            }
        }
    }
}