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
	}
	post {
	        always {
	            echo 'Test run completed'
	            slackSend message: 'Success'
	        }
	        success {
	            echo 'Successfully!'
	        }
	        failure {
	            echo 'Failed!'
	        }
	        unstable {
	            echo 'This will run only if the run was marked as unstable'
	        }
	        changed {
	            echo 'This will run only if the state of the Pipeline has changed'
	            echo 'For example, if the Pipeline was previously failing but is now successful'
	        }
	    }
}