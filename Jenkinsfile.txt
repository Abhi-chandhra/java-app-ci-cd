pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Abhi-chandhra/java-app-ci-cd.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    docker.image('maven:3.8.6-eclipse-temurin-17').inside {
                        sh 'mvn clean package'
                        echo 'Build Done'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    docker.image('maven:3.8.6-eclipse-temurin-11').inside {
                        sh 'mvn test'
                        echo 'Test Done'
                    }
                }
            }
        }
    }
}
