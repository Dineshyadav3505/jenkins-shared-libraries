def call(String testCommand) {
    echo "Running unit tests..."
    
    // Add your unit test commands here
    // For example:
    // sh "npm test" or "mvn test" depending on your project
    sh "${testCommand}"    
    echo "Unit tests completed successfully"
}