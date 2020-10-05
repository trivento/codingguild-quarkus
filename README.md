# codingguild-quarkus

https://quarkus.io/
https://angular.io/

Als je nog geen werkend project hebt:

git checkout step2
npm install (vanuit src/main/webapp)

In stap 3 gaan we een frontend maken met mockdata.

 - maak een persoon-lijst component
 - gooi de content van de app.component.html weg en vervang die door de selector van het persoon-lijst component (even testen)
 - sla de response van de persoon resource op als persoon.json in assets/mocks
 - maak een service met een functie getPersonen, die een http GET doet naar de person.json (https://angular.io/tutorial/toh-pt6)
 - subscribe op de service in de ngOnInit van het persoonlijst component en toon een lijst van personen


Testen
- npm start
- localhost:4200



