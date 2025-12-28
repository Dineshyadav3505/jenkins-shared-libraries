def call(String OWASPAPI){
  dependencyCheck additionalArguments: '--scan ./', odcInstallation: "${OWASPAPI}"
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}