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
				script {
					cd './build/libs'
					
					java -jar SpringBootJenkinsPipeline-0.0.1-SNAPSHOT.jar
				}
			}
		}
	}
}
