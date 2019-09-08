pipeline {
	agent any
	
	stages {
	
		stage('Check out') {
			scm checkout
		}
		
		stage('Compile') {
			bat 'gradlew clean build'
		}
	}
}