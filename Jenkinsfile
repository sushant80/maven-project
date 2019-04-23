pipeline {
    agent any
    stages{
        stage('Build'){
            steps {
                #sh 'mvn clean package'
                echo sushant
            }
            post {
                success {
                    echo 'Now Archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
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
