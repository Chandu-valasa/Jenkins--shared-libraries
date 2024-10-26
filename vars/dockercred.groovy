/* groovylint-disable LineLength */
/* groovylint-disable-next-line NglParseError */
def call(Docker, dockerpass, dockeruser, imagename,tag){
    withCredentials([usernamePassword(credentialsId:"Docker",passwordVariable:"dockerpass",usernameVariable:"dockeruser")]) {
                sh 'docker login -u ${dockeruser} -p ${dockerpass}'
                sh 'docker tag ${imagename}:${tag} ${dockeruser}/${imagename}:${tag}'
                sh 'docker push ${dockeruser}/${version}'
               }
}
