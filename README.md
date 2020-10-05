# codingguild-quarkus

https://quarkus.io/

Als je nog geen werkend Quarkus project hebt:

mvn io.quarkus:quarkus-maven-plugin:1.8.1.Final:create \
    -DprojectGroupId=nl.trivento.codeguild \
    -DprojectArtifactId=codeguild-quarkus \
    -DclassName="nl.trivento.codeguild.quarkus.GreetingResource" \
    -Dpath="/hello" \
    -Dextensions="resteasy-jsonb"

In stap 1 gaan we de persoon rest resource in Quarkus maken.
 - path: /rest/persoon
 - return: lijst met personen
 - persoon bevat (voornaam, achternaam, geboortedatum, email)

Testen
- http://localhost:8080/rest/persoon



