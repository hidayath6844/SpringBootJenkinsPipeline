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
				bat "java -jar ./build/libs/SpringBootJenkinsPipeline-0.0.1-SNAPSHOT.jar"
			}
		}
	}
}
