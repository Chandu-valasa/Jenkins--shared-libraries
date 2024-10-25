/* groovylint-disable-next-line NglParseError */
pipeline {
    agent {label 'node01'}

    stages {
        stage(Checkout) {
            steps {
                git url:'https://github.com/Chandu-valasa/django-notes-app.git', branch:'main'
            }
        }
        stage(build) {
            steps {
                sh'docker build -t chandu .'
            }
        }
        stage(pushimage) {
            steps {
                withCredentials([usernamePassword(credentialsId:"Docker",passwordVaraible:"dockerpass",usernameVariable:"dockeruser")]) {
                sh 'docker login -u ${env.dockeruser} -p ${env.dockerpass}'
                sh 'docker tag chandu ${dockeruser}/chandu'
                sh 'docker push ${dockeruser}/chandu'
               }
                
            }
        }
    }
}
