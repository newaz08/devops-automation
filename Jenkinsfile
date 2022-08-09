pipeline {
    agent any
    tools {
        maven 'maven_3_8_6'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/newaz08/devops-automation']]])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    bat 'docker build -t newaz08/devops-integration .'
                }
            }
        }
        stage('Push Image to Docker Hub') {
            steps {
                script {

                    bat 'docker login -u newaz08 -p docker_newaz08'
                    bat 'docker push newaz08/devops-integration'
                }
            }
        }
    }
}