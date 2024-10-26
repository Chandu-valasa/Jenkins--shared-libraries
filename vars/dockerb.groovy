def call(image,tag){
  docker build -t ${image}:${tag} .
}
