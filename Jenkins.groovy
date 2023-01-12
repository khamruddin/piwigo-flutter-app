pipeline{
  
  agent {label 'Slave'}
  
  stages{
    stage('Code Pull'){
      steps {
        git 'https://github.com/khamruddin/piwigo-flutter-app.git'
      
      }
    }
    stage('build '){
      steps{
        sh '''
        #!/bin/bash
        
        flutter build apk --debug --ignore-deprecation
        '''
      
      }
     }
  }
}
