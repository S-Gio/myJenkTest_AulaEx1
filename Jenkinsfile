pipeline {
	agent any
	
	stages {
		stage('Compile Stage'){
			
			steps{
				withMaven(maven : 'maven_3_5_0'){
					sh 'mvn clean compile'
				}
			}
		}
		
		stage('Testing Stage'){
			steps{
				withMaven(maven : 'maven_3_5_0'){
					sh 'mvn test'
				}
			}
		}
		
		post {
            success {
                slackSend "Build deployed successfully - ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
            }
        }
	}
}