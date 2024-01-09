pipeline {
    agent any
    
    tools {
        maven 'Maven-3.9.6'
    }
    
    stages {
        stage("Peform Test") {
            steps {
                sh '''
                    mvn --version
                    mvn clean test
                '''
            }
            post {
                success {
                    echo "All Tests are passed"
                }
                failure {
                    echo "One or more tests are failed"
                }
            }
        }
        stage("Perform Build") {
            steps {
                sh '''
                    mvn install -DskipTests
                '''
            }
            post {
                success {
                    echo "Build is successful"
                }
                failure {
                    echo "Build Failed"
                }
            }
        }
        stage("Perform Stage Deploy") {
            steps {
                echo "This is for Test Deploy"
            }
        }
        stage("Perform Prod Deploy") {
            steps {
                echo "This is for Production Deploy"
            }
        }        
    }
    
    post {
        always {
            echo "Pipeline execution has been completed....check log"
        }
        success {
            echo "All stages of Pipeline has been executed Successfully"
        }
        failure {
            echo "Pipeline has been failed"
        }
    }   
}
