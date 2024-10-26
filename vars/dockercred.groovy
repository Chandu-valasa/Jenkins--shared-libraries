/* groovylint-disable LineLength */
/* groovylint-disable-next-line NglParseError */
def call(Docker, dockerpass, dockeruser){
    withCredentials([usernamePassword(credentialsId:"Docker",passwordVariable:"dockerpass",usernameVariable:"dockeruser")]) {
                sh 'docker login -u ${dockeruser} -p ${dockerpass}'
                sh 'docker tag shekar:latest ${dockeruser}/shekar:latest'
                sh 'docker push ${dockeruser}/shekar:latest'
               }
}
