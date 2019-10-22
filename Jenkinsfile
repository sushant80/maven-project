pipeline {
    agent any
    stages{
        stage('Build'){
            steps {
                echo "sushant"
		
            }
            post {
                success {
                    echo 'Now Archiving...'
                }
            }
        }
        stage ('Deploy to Staging'){
            steps {
               echo "deploy to staging"
            }
		
		
        }
      stage ('Deploy to Production'){
            steps{
                timeout(time:5, unit:'DAYS'){
                    input message:'Approve PRODUCTION Deployment?'
                }

                build job: 'Deploy-to-Prod'
            }
            post {
                success {
                    echo 'Code deployed to Production.'
                }

                failure {
                    echo ' Deployment failed.'
                }
            }
    }
}
