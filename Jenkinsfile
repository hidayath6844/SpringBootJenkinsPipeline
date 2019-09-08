pipeline {
	agent any
	
	stages {
	
		stage('Check out') {
			steps {
				scm checkout
			}
		}
		
		stage('Compile') {
			steps {
				bat 'gradlew clean build'
			}
		}
	}
}