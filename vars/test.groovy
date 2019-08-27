#!/usr/bin/env groovy
def call(CONTAINER,IMAGE){
   sh "sudo docker run -itd --name '${CONTAINER}' '${IMAGE}'"
}
return this.&call(CONTAINE,IMAGE)

