# codingguild-quarkus

https://quarkus.io/
https://angular.io/

Als je nog geen werkend project hebt:

git checkout step6
npm install (vanuit src/main/webapp)

In stap 6 ben ik gestopt. Je zou nog verder kunnen gaan met o.a.

 - pas het outputPath in angular.json aan, zodat de output in target/generated/webapp terecht komt.
 - zorg dat maven node installeerd, npm ci en npm run build doet (https://github.com/eirslett/frontend-maven-plugin)
 - zorg dat maven de target/generated/webapp meeneemt als resource
 - Ontdek alle features van Quarkus en Angular door deze applicatie uit te breiden
  

Testen
- java -jar codeguild-quarkus-1.0-SNAPSHOT-runner.jar (vanuit de target directory)
- localhost:8080



