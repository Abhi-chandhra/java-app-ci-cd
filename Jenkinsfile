pipeline {
    agent any

    tools {
        jdk 'java17'
        maven 'maven3'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Abhi-chandhra/java-app-ci-cd.git'
            }
        }

        stage('Build with Java 17') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test with Java 17') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Static Analysis with Java 17') {
            steps {
                sh 'mvn verify sonar:sonar'
            }
        }
    }
}
