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
				bat 'cp ./build/libs/SpringBootJenkinsPipeline-0.0.1-SNAPSHOT.jar D:/JenkinsDeployment'
			}
		}
	}
}
