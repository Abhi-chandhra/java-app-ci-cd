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
                        sh 'mvn clean compile'
                        echo 'Build Done'
                    }
                }
            }
        }

        stage('Test with Java 17') {
            steps {
                script {
                    docker.image('maven:3.8.6-eclipse-temurin-17').inside('--network ci-cd-network') {
                        sh 'mvn test'
                        echo 'Test Done'
                    }
                }
            }
        }

        stage('Static Analysis with Java 17') {
            steps {
                script {
                    docker.image('maven:3.8.6-eclipse-temurin-17').inside('--network ci-cd-network') {
                        sh 'mvn verify sonar:sonar'
                        echo 'Static Analysis Done'
                    }
                }
            }
        }
    }
}
