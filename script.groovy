def clone(){
  
  git branch: 'master', credentialsId: 'ea80b490-f30e-4f61-b8b3-426d8202c73e', url: 'https://github.com/jleetutorial/maven-project.git'
}
def build(){
   sh 'mvn package'
  
}
def arc(){
   archiveArtifacts artifacts: '**/*.war', followSymlinks: false
  
}
def dep(){
  
  deploy adapters: [tomcat9(credentialsId: 'c3a4901d-7c6b-472a-ac7e-027fa3bc222c', path: '', url: 'http://172.31.12.23:8888/')], contextPath: null, war: '**/*.war'            }
}
return this
