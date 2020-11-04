pipeline {
    agent any
    tools {
        gradle "gradle-6.5.1"
    }
    triggers {
        pollSCM '* * * * *'
    }

    stages {
        stage('Clean') {
            steps {
                sh 'gradle clean'
            }
        }

        stage('Build') {
            steps {
                sh 'gradle assemble'
            }
        }

        stage('Test') {
            steps {
                sh 'gradle test'
            }
        }

        stage('Deploy') {
            steps {
                sh 'gradle build -x test'
            }
        }
    }
}