def call(String dockeruser, String image,String tag){
  sh "docker build -t ${dockeruser}/${image}:${tag} ."
}
