# codingguild-quarkus

https://quarkus.io/
https://angular.io/

Als je nog geen werkend project hebt:

git checkout step4
npm install (vanuit src/main/webapp)

In stap 4 gaan we de frontend koppelen aan de Quarkus backend.

 - maak een proxy.conf.json in webapp (https://medium.com/better-programming/setup-a-proxy-for-api-calls-for-your-angular-cli-app-6566c02a8c4d)
 - configureer deze zo dat alle calls van /rest naar http:/localhost:8080 gaan
 - pas de package.json aan zodat in npm start van de proxy.conf gebruik wordt maakt
 - pas je url aan, zodat de person.json niet meer gebruikt wordt
 - pas iets aan de data in je quarkus app aan zodat je kan zien dat je van de achterkant gebruikt maakt.
  

Testen
- npm start
- localhost:4200



