def version = ${env.BUILD_NUMBER}
def branch = env.BRANCH_NAME

pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }

    if (branch == 'develop') {
        stages {
            stage('Checkout') {
                steps {
                    git branch: 'develop', credentialsId: 'lzugaj', url: 'https://github.com/lzugaj/doctor-on-demand-server.git'
                }
            }

            stage('Clean') {
                steps {
                    checkout scm
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
}