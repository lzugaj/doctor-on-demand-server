pipeline {
    agent any
    triggers {
        pollSCM '* * * * *'
    }

    def branch = env.BRANCH_NAME
    if (branch == 'develop' || branch == 'master') {
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

            stage('Deploy') {
                steps {
                    bat './gradlew build'
                }
            }
        }
    }
}