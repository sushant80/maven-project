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
                build job: 'Deploy-to-staging'
            }
        }
    }
}
