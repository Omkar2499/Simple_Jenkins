pipeline {
    agent any

    stages {
        stage('Hello World') {
            steps {
                echo 'Starting Groovy Hello World...'
                // Run the Groovy script
                sh 'groovy hello.groovy'

                //Run the second groovy script
                sh 'groovy addnumbers.groovy 5 6'

                //Run the Python Script
                sh 'hello_world.py'
            }
        }
    }
}
