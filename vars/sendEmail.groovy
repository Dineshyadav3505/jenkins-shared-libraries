def call(String status) {
    def templatePath = status == 'SUCCESS' ? 
        'templates/email-templates/build-success.html' : 
        'templates/email-templates/build-failed.html'
    
    def template = libraryResource templatePath
    emailext body: template, subject: "Build ${status}"
}
