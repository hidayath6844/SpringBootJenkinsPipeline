pipeline {
	agent any
	
	stages {
		stage('Compile') {
			steps {
				bat 'gradlew clean build'
		    }
		}
		
		stage('Deploy') {
			steps {
				bat 'start java -jar SpringBootJenkinsPipeline-0.0.1-SNAPSHOT.jar'
			}
		}
	}
}
