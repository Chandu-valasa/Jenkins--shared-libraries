/* groovylint-disable LineLength */
/* groovylint-disable-next-line NglParseError */
def call(String dockeruser, String image,String tag){
    withCredentials([usernamePassword(credentialsId:"Docker",passwordVariable:"dockerpass",usernameVariable:"dockeruser")]) {
                sh 'docker login -u ${dockeruser} -p ${dockerpass}'
    }
                sh 'docker push ${dockeruser}/${image}:${tag}'
               
}
