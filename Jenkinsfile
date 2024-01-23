pipeline {
    agent any
    
    tools {
        maven 'Maven-3.9.6'
    }
    
    stages {
        stage("Peform Test") {
            when {
                changelog 'Ready to Build'
            }
            steps {
                echo "Hello"
            }
        }
    }     
}
