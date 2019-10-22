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
    }
}
