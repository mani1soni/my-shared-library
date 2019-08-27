def call(NAME){
    bash "name.sh '${NAME}'"  
}
return this.&call(NAME)