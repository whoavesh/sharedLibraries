def call(String frEmail, String toEmail){
    success{
            script{
                emailext from: ""${frEmail}"",
                subject: "Build successfull for two-tier app",
                body: "The build is successfull.....",
                to: ""${toEmail}""
            }
    }
    failure{
            script{
                emailext from: ""${frEmail}"",
                to: ""${toEmail}"",
                subject: "Build failed for two-tier app",
                body: "The build failed....."
                }
    }
}
