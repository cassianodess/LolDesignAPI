# LOL DESIGN PROJECT 

* Cassiano de Souza Santos - Full Stack project for LOL Design Test

## WHAT DO I NEED TO RUN THIS APPLICATION?

* Docker installed

## HOW DO I EXECUTE THIS APPLICATION?

1. Your terminal must have root permission to run these commands.

1. Serve REST API running the following command in your terminal:  `docker run -p 8080:8080 cassianodess/loldesignapi:0.0.1-SNAPSHOT`

1. Open other terminal tab to Serve front end application with the following command in your: `docker run -p 4200:4200 cassianodess/lol-design-frontend:v1`

1. Open your browser in `http://localhost:4200`

1. Press `Ctrl+C` within each terminal to cancel the current application. 


## USED TOOLS

#### FRONTEND
* Angular
* TypeScript
#### BACKEND
* Java
* Spring Boot
* Spring Boot Test

#### OTHER
* Docker

## API DOCUMENTATION
* [REQUESTS SPECIFICATIONS](http://localhost:8080/swagger-ui/index.html)