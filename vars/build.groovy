def call(IMAGE){
    sh "sudo docker build -t ${IMAGE} ."
}
return this.&call()