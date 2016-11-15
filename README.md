# NetBeans, Maven und Spring Boot …mehr Spaß zusammen

**Important:** _The commits and commit messages have been written very carefully to guide you through reading this project and understanding the talk. Please take your time to study them if you don't understand something_.

## Slides

The slides are inside this repository and also on Speakerdeck:

[NetBeans, Maven und Spring Boot …mehr Spaß zusammen](https://speakerdeck.com/michaelsimons/netbeans-maven-und-spring-boot-dot-dot-dot-mehr-spass-zusammen)

## Talk für den NetBeans Evening Cologne, September 2016

_Note: [Faktor Zehn](https://www.faktorzehn.de/de/ueber-faktor-zehn/veranstaltungen/veranstaltungen-detailseite/netbeans-evening-in-koeln.html?cHash=9e9355b5b02d89a2cfa4f0998ebe0547) hosted a [NetBeans](https://netbeans.org) event in Cologne in September 2016. The event was in German, so is this talk. By reading through the project and the commit message, you should get at pretty good idea, what's going on._

Der Vortag _NetBeans, Maven und Spring Boot_ zeigt am Beispiel einer HTTP/JSON Schnittstelle, wie einfach es mit NetBeans ist, Maven zu nutzen, um in kürzester Zeit eine komplette Spring Boot Anwendung inklusive Unit- und Integrationstests zu erstellen. 

Als Abschluss und Ausblick wird die Anwendung in zwei Docker Containern deployed, die innerhalb der zur Zeit aktuellen NetBeans Developer Ausgabe gesteuert und monitored werden können.

Danke an [Geertjan Wielenga](https://twitter.com/GeertjanW), [Michael Müller](https://twitter.com/muellermi) und [Stephan Knitelius](https://twitter.com/sknitelius) sowie der [Java UG Cologne](https://twitter.com/jugcologne) und der [Faktor Zehn AG](https://twitter.com/FaktorZehnAG) für die Organisation und das Hosting des Events.

## Kompilieren und Ausführen der Anwendung

_Hinweis: Für die Integrationsstest muss auf dem lokalen Arbeitsplatz eine korrekte Docker Installation vorliegen._

Die Demo kann mit 

```
mvn clean install

```

kompiliert und getestet werden.

Wird sie mit 

```
mvn spring-boot:run
```

ausgeführt, so startet die Anwendung auf dem lokalen Rechner und nutzt eine In-Memory Datenbank.

Der Install Task erzeugt ein Docker Image, dass mit 

```
mvn docker:run
```

ausgeführt wird. Dabei wird ein PostgreSQL Container gestartet, in dem die Daten der Anwendung persistiert werden.

## Zusammenfassung der Veranstaltung und Screencast

* [NetBeans, Maven and Spring Boot… more fun together](http://info.michael-simons.eu/2016/09/10/netbeans-maven-and-spring-boot-more-fun-together/)
* [NetBeans 8.1 support for Project Lombok and JaCoCo](https://youtu.be/zmMtmpavL4I)

## Ressourcen

* [Zur automatischen Konfiguration von Spring](https://github.com/michael-simons/springio2016)
* [Spring Initializr](http://start.spring.io)
* [NB-SpringBoot](https://github.com/AlexFalappa/nb-springboot)
* [Flyway by Boxfuse](https://flywaydb.org)
* [Spring Data JPA](http://projects.spring.io/spring-data-jpa/)
* [Repository Pattern](http://martinfowler.com/eaaCatalog/repository.html)
* [Spring Common Application Properties](http://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)
* [Project Lombok](http://www.eclemma.org/jacoco/)
* [JaCoCo](http://www.eclemma.org/jacoco/)
* [Docker](https://www.docker.com)
* [fabric8io/docker-maven-plugin](https://github.com/fabric8io/docker-maven-plugin)
* [Redirect Docker Traffic from TCP to Socket](https://gist.github.com/michael-simons/4bb090aa77802f1732c2d5200f9880a4)
* [PostgreSQL Docker image](https://hub.docker.com/_/postgres/)

## Lizenz

<a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Creative Commons Lizenzvertrag" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" property="dct:title">"NetBeans, Maven und Spring Boot …mehr Spaß zusammen"</span> von <a xmlns:cc="http://creativecommons.org/ns#" href="https://github.com/michael-simons/springio2016" property="cc:attributionName" rel="cc:attributionURL">Michael J. Simons</a> ist lizenziert unter einer <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Namensnennung - Nicht-kommerziell - Weitergabe unter gleichen Bedingungen 4.0 International Lizenz</a>.

## Bildrechte der Präsentation

* "Gehen Sie die Treppe stone city": ©iStockphoto.com/[robertiez](http://www.istockphoto.com/de/portfolio/robertiez)
* "High Voltage Towers Stockfoto": ©iStockphoto.com/[querbeet](http://www.istockphoto.com/de/portfolio/querbeet)
* "Magnet und Blanko-Kühlschrank": ©iStockphoto.com/[andy0man](http://www.istockphoto.com/de/portfolio/andy0man)
* "Kuta Lombok View from hill near Pantai Seger": [Public Domain](https://commons.wikimedia.org/wiki/File:Kuta_Lombok_View_from_hill_near_Pantai_Seger.JPG)
* "ShippingContainerSFBay": [Public Domain](https://commons.wikimedia.org/wiki/File:ShippingContainerSFBay.jpg)
* "Beste Freunde": ©iStockphoto.com/[Milan Marjanovic](http://www.istockphoto.com/de/portfolio/supersizer)