#Springboot2Template-

This application is a template for production ready application, it included properties configuration as per environment.
Devtools for runtime changes
Actuatator for application health ,info,metrics,endpoints and other details to view at run time.
Lombok library

#How To -

To run application on local machine -
cmd-> mvn clean install
cmd-> cd target -> java -jar Springboot2Demo-0.0.1-SNAPSHOT

While running application in higher endvironments e.g. dev/prod
java -jar Springboot2Demo-0.0.1-SNAPSHOT -Dspring.profiles.active=dev

