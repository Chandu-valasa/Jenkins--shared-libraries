/* groovylint-disable LineLength */
/* groovylint-disable-next-line NglParseError */
def call(Docker, dockerpass, dockeruser, imagename){
    withCredentials([usernamePassword(credentialsId:"Docker",passwordVariable:"dockerpass",usernameVariable:"dockeruser")]) {
                sh 'docker login -u ${dockeruser} -p ${dockerpass}'
                sh 'docker tag ${imagename} ${dockeruser}/${imagename}'
                sh 'docker push ${dockeruser}/${version}'
               }
}
