pipeline {
    agent any
    stages{
        stage('Build'){
            steps {
                echo "sushant"
		sh "mvn clean package"
		sh "docker build . -t tomcatwebapp:${env.BUILD_ID}"
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
