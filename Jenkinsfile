pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/apantham1/java-app-ci-cd.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac Main.java'
            }
        }

        stage('Test') {
            steps {
                sh 'java -jar test-runner.jar'  // Replace if using a different test framework
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t apantham1/java-app .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withDockerRegistry([credentialsId: 'docker-hub-credentials', url: '']) {
                    sh 'docker push apantham1/java-app'
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}
