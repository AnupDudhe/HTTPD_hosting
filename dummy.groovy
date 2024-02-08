pipeline {
    agent { 
        label 'simple'

    }
    stages {
        stage('Build') {
            steps {
                
                echo "Testing ..."
            }
        }
    }
}