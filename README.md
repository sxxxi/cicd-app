# Spring Boot project CI/CD practice (first iteration)

## [DEMO](https://youtu.be/K9qiKCWMfcI)

Extending the knowledge obtained from Software Process Management course, I learned:
- How pipelines work
- How to write pipelines using declarative pipeline syntax
- Building and deploying docker projects
- Utilize shell scripts for deploying docker images 

Goals for upcoming projects:
- Make Jenkins not prompt for password every build
- Refine the overall content of the application and make the pipeline more robust
- Learn repository management
- Use Jennkins CLI
- Build pipeline when main branch is updated
- Instead of deploying on the local machine, use google compute engine (preferably) or even GKE
- Dig deeper on Docker networking and Docker compose
- Learn Logging 

stay tuned :|

# How to use
## Development Environment
- OS: OSX Ventura 13.2
- Homebrew: 4.0.6

## Dependencies
- JDK: 17.0.6
- Maven: 3.9.0
- Docker: 20.10.23
- Jenkins: 2.394

## Commands
> My repository is protected so please clone or fork this repository. (I will try to figure out how to share pipelines. Sorry)
1. Start the Jenkins server and create a Jenkins pipeline hooked directly to the Github repository.
`$ jenkins`

2. Go to the pipeline dashboard > 'Build now'
3. Done

# Progress logs
## Mar. 16
- Got started with Python. Just testing the waters
- Dockerfile layers and caching
- Multi-stage build
- Container networking 
    - Drivers: (host, bridge)
    - create and manage networks
    - intro to swarms
### TODO
- PEM file format
- Continue compose


  // Default language.
  "spring.initializr.defaultLanguage": "Java",

  // Default Java version.
  "spring.initializr.defaultJavaVersion": "11",

  // Default value for Artifact Id.
  "spring.initializr.defaultArtifactId": "demo",

  // Default value for Group Id.
  "spring.initializr.defaultGroupId": "com.example",

  // Spring Initializr Service URL(s). If more than one url is specified, it requires you to select one every time you create a project.
  "spring.initializr.serviceUrl": [ "https://start.spring.io" ],

  // Default value for Packaging. Supported values are "JAR" and "WAR".
  "spring.initializr.defaultPackaging": "JAR",

  // Default value for the method of openining the newly generated project. Supported values are "", "Open" and "Add to Workspace".
  "spring.initializr.defaultOpenProjectMethod": "Add to Workspace",



