def call(Map config = [:]) {
    def template = readJSON file: "${libraryResource 'templates/slack-notifications.json'}"
    // Use template.success or template.failure based on build status
}
