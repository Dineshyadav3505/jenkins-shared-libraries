# jenkins-shared-libraries

Centralized Jenkins Shared Library repository to standardize and reuse CI/CD pipeline logic across multiple projects.[web:2]

This repo extracts common pipeline stages, utilities, and patterns into versioned, testable Groovy code - keeping Jenkinsfiles clean and focused on workflow orchestration.

---

## 🚀 Purpose

- Single source of truth for build, test, quality checks, and deployment stages[web:2]
- Reduce duplication across microservices and backend projects[web:3]
- Easier maintenance of CI/CD best practices in one place[web:6]

---

## 📁 Repository Structure

jenkins-shared-libraries/
├── vars/ # Global pipeline steps & functions
│ ├── buildApp.groovy
│ ├── deployApp.groovy
│ ├── notifySlack.groovy
│ └── loadTemplate.groovy
├── resources/ # Templates & config files
│ ├── templates/
│ │ ├── slack-notifications.json
│ │ └── email-templates/
│ │ ├── build-success.html
│ │ └── build-failed.html
│ └── config/
│ ├── environments.json
│ └── notifiers.json
├── docs/
│ └── USAGE.md
└── README.md

---

## ⚙️ Setup Instructions

### 1. Configure in Jenkins

**Manage Jenkins → Configure System → Global Pipeline Libraries**

| Field | Value |
|-------|-------|
| **Name** | `jenkins-shared-libraries` |
| **Default version** | `main` |
| **Retrieval method** | Modern SCM |
| **SCM** | Git: `https://github.com/Dineshyadav3505/jenkins-shared-libraries.git`[web:2] |

### 2. Load in Jenkinsfile

@Library('jenkins-shared-libraries') _

### 3. Example Pipeline

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                buildApp()  // Shared library function
            }
        }
        stage('Deploy') {
            steps {
                deployApp(env: 'staging')
            }
        }
    }
}


---

## 🤝 Contributing

1. Fork → Create feature branch (`feature/maven-build`)
2. Add functions to `vars/` or classes to `src/`
3. Test with Jenkins job before PR
4. Document usage in function comments

---

*Built for DevOps teams standardizing CI/CD across Java Spring Boot, Kubernetes, and microservices projects.*