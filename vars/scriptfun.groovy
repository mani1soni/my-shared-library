def call(NAME){
    sh "name.sh '${NAME}'"  
}
return this.&call(NAME)