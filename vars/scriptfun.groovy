def call(NAME){
    sh "bash name.sh '${NAME}'"  
}
return this.&call(NAME)