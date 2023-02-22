pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/fowobiy2k/javaweblogic', branch: 'master')
      }
    }

    stage('Package') {
      steps {
        sh 'sh \'echo "hello world"\''
      }
    }

  }
}