def call(){
    post {
        success {
            emailext attachLog: true, 
            body: '''success''', 
            subject: 'build report', 
            to: 'manish.soni@techifysolutions.com'
        }
        failure {
            emailext attachLog: true, body: '''test failed and rollback initiated''', subject: 'jenkins build', to: 'manish.soni8403@gmail.com'
        }
    }
}
return this.&call()