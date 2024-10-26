def call(imaage,tag){
  docker build -t ${image}:${tag} .
}
