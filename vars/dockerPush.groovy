def call(String credId, String imageName){
     withCredentials([usernamePassword(credentialsId:"${credId}",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                    sh "docker tag ${imageName} ${env.dockerHubUser}/${imageName}:latest"
                    sh "docker push ${env.dockerHubUser}/${imageName}:latest" 
                }
}