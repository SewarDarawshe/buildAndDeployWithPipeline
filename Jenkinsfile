pipeline {
    agent { label 'slave' } 
   tools {
    maven 'maven-3'
  }
    stages{
        
        stage('Clone code'){
            steps{
                git branch: 'master', credentialsId: 'ea80b490-f30e-4f61-b8b3-426d8202c73e', url: 'https://github.com/jleetutorial/maven-project.git'

            }
            
        }
        stage('Build'){
            steps{
         sh 'mvn package'

            }
        }
        stage('Archive'){
            steps{
            archiveArtifacts artifacts: '**/*.war', followSymlinks: false
            }
        }
        stage('Deploy'){
            steps{
deploy adapters: [tomcat9(credentialsId: 'c3a4901d-7c6b-472a-ac7e-027fa3bc222c', path: '', url: 'http://172.31.12.23:8888/')], contextPath: null, war: '**/*.war'            }
            
        }
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
