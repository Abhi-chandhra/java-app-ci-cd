pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Abhi-chandhra/java-app-ci-cd.git'
            }
        }

        stage('Build with Java 17') {
            steps {
                script {
                    docker.image('maven:3.8.6-eclipse-temurin-17').inside('--network ci-cd-network') {
                        sh 'mvn clean package'
                    }
                }
            }
        }

        stage('Test with Java 11') {
            steps {
                script {
                    docker.image('maven:3.8.6-eclipse-temurin-11').inside('--network ci-cd-network') {
                        sh 'mvn test'
                    }
                }
            }
        }

        stage('Static Analysis with Java 8') {
            steps {
                script {
                    docker.image('maven:3.8.6-eclipse-temurin-8').inside('--network ci-cd-network') {
                        sh 'mvn sonar:sonar'
                    }
                }
            }
        }
    }
}
