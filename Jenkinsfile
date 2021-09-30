def gv
pipeline {
    //running on slave
    agent { label 'slave' } 
   tools {
       //defining the maven package
    maven 'maven-3'
  }
    stages{
        stage("init") {
            steps {
                script {
                   gv = load "script.groovy" 
                }
            }
        }
        //cloning the code from github repo
        stage('Clone code'){
            steps{
                script{
                   gv.clone() 
                    
                }

            }
            
        }
        //building the maven package
        stage('Build'){
            steps{
          script{
                   gv.build() 
                    
                }

            }
        }
        //archiving the war file into jinkins
        stage('Archive'){
            steps{
            script{
                   gv.arc() 
                    
                }
            }
        }
        //deploing the war file on tomcat9
        stage('Deploy'){
            steps{
                 script{
                   gv.dep() 
                    
                }            
        }
        
        
        
        
        
    }
  
    
}
}
