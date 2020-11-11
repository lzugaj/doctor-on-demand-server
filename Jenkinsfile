def version = ${env.BUILD_NUMBER}
def branch = env.BRANCH_NAME

pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }

    if (branch == 'develop') {
        stages {
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

            // Push to Docker container
        }
    }
}