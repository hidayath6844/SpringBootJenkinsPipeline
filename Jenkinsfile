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
						xcopy ./build/libs/* D:/JenkinsDeployment/
						java -jar D:/JenkinsDeployment/SpringBootJenkinsPipeline*.jar
				}
			}
		}
	}
}

