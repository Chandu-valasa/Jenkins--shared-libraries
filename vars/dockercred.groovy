/* groovylint-disable LineLength */
/* groovylint-disable-next-line NglParseError */
def call(Docker, dockerpass, dockeruser, imagename, version){
    withCredentials([usernamePassword(credentialsId:"Docker",passwordVariable:"dockerpass",usernameVariable:"dockeruser")]) {
                sh 'docker login -u ${dockeruser} -p ${dockerpass}'
                sh 'docker tag ${imagename} ${dockeruser}/${version}'
                sh 'docker push ${dockeruser}/${version}'
               }
}
