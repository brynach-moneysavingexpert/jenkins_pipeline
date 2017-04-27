#!groovy

node ('master'){
    stage('checkout') {
        checkout scm
    }
    stage('build') {
        git url: "https://github.com/brynach-moneysavingexpert/jenkins_pipeline"
        sh "echo performing a clean build and unit test run of the Spring Boot App with gradle wrapper"
        sh "./gradlew clean build"
    }
}