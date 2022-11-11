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
	            slackSend message: 'Finish !!!!'
	        }
	        success {
	            echo 'Successfully!'
	           	slackSend message: 'Success'
	            
	        }
	        failure {
	            echo 'Failed!'
	            slackSend message: 'Fail execution'
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