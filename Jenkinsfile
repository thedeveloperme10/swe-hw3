pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage("Build Maven Project"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/thedeveloperme10/swe-hw3']])
                sh 'mvn clean install'
            }
        }
        stage("Build Docker Image"){
            steps{
                script{
                    sh 'docker build -t vsomasun/swe-645-cicd-hw3:${BUILD_TIMESTAMP} .'
                }
            }
        }
        stage("Push Docker Image to DockerHub"){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        sh 'docker login -u vsomasun -p ${dockerhubpwd}'
                        sh 'docker push vsomasun/swe-645-cicd-hw3:${BUILD_TIMESTAMP}'
                    }
                }
            }
        }
        stage("Deploy to kubernetes"){
            steps{
                script{
                    sh 'whoami'
                }
            }
        }
    }
}
