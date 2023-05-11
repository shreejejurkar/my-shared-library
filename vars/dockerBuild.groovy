def call(String project, String ImageTag, String DockerHubUser){
    
    sh """
     docker image build -t ${DockerHubUser}/${project} . 
     docker image tag ${DockerHubUser}/${project} ${DockerHubUser}/${project}:${ImageTag}
     docker image tag ${DockerHubUser}/${project} ${DockerHubUser}/${project}:latest
    """
}

// def call(String aws_account_id, String region, String ecr_repoName){
    
//     sh """
//      docker build -t ${ecr_repoName} .
//      docker tag ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//     """
// }