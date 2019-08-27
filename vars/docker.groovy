#!/usr/bin/env groovy
def call(){
   //sh "sudo docker run -itd --name '${CONTAINER}' '${IMAGE}'"
   echo "hello"
}
return this.&call()

