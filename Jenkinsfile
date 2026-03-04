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

                //Run Groovy GUI script
    
          
            }
        }
        stage('Run Python'){
            steps{

                agent {docker {image 'python:3.10-slim'}}
                echo "Entered in this"

                //Run python script
                sh 'python3 hello_world.py'

                
            }
        }

        stage("1/8 Run Groovy"){
            steps{
                sh 'groovy groovy_scripting/web_scraping.groovy'


                sh 'groovy groovy_scripting/hello.groovy'
            }
        }
    }
}
