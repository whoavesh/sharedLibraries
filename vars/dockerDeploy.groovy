def call(String imageName){
    sh "docker compose up -d --build "${imageName}""
}