pipeline {
    agent any
    
    tools {
        maven 'Maven-3.9.6'
    }
    
    stages {
        when {
            changelog 'Ready to Build'
        }
        stage("Peform Test") {
            steps {
                echo "Hello"
            }
        }
    }     
}
