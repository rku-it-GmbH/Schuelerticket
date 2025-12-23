# Schülerticket Schnittstelle

Dieses Repository enthält die Spezifikation und eine Beispielimplementierung für die Schülerticket-Schnittstelle.

## GitHub Pages

Diese Seite wird über [GitHub Pages](https://pages.github.com/) bereitgestellt und dient zur Anzeige der API-Dokumentation. Die Seite wird automatisch aus dem `/docs`-Ordner des `main`-Branches generiert.

Die Live-Dokumentation finden Sie hier: [https://rku-it-gmbh.github.io/Schuelerticket/](https://rku-it-gmbh.github.io/Schuelerticket/)

## Ordnerstruktur

- `docs/`: Dieser Ordner enthält alle statischen Dateien für die GitHub Pages-Website. Die API-Dokumentation wird mit Swagger UI aus der `openapi.json`-Datei generiert.
- `example/`: Enthält eine Beispiel-JSON-Datei (`Folgeantrag.json`), die eine mögliche Anfrage an die API darstellt.
- `Example Implementation/`: Eine vollständige Spring-Boot-Anwendung, die die in der `openapi.json` definierte API implementiert.
  - `src/`: Der Quellcode der Java-Anwendung.
  - `pom.xml`: Die Maven-Projektdatei, die alle Abhängigkeiten und Build-Konfigurationen enthält.

## Voraussetzungen

Um die Beispielimplementierung zu kompilieren und auszuführen, benötigen Sie:

- Java 21
- Apache Maven

## Verwendung der Beispielimplementierung

### Kompilieren

Um das Projekt zu kompilieren und die `openapi.json` zu generieren, führen Sie den folgenden Befehl im Ordner `Example Implementation` aus:

```bash
mvn verify
```

Dieser Befehl kompiliert den Code und erstellt die `openapi.json`-Spezifikationsdatei im Verzeichnis `target/openapi/`.

### Ausführen

Sie können die Anwendung auf zwei Arten starten:

1. **Über Maven:**

    ```bash
    mvn spring-boot:run
    ```

2. **Als eigenständige JAR-Datei:**

    Kompilieren Sie zuerst das Projekt mit `mvn package` und führen Sie dann die resultierende JAR-Datei aus:

    ```bash
    java -jar target/studentticketapi-0.7.0.jar
    ```

### API-Dokumentation aktualisieren

Nachdem Sie das Projekt mit `mvn verify` kompiliert haben, wird die `openapi.json` im Ordner `target/openapi/` erstellt. Um die GitHub Pages-Dokumentation zu aktualisieren, müssen Sie diese Datei in den `docs/openapi/`-Ordner kopieren und die Änderungen in den `main`-Branch pushen.

```bash
# Führen Sie diesen Befehl im Hauptverzeichnis des Projekts aus
cp "Example Implementation/target/openapi/openapi.json" "docs/openapi/openapi.json"
```

In Zukunft könnte dieser Prozess durch die Verwendung des [Springdoc-openapi Maven Plugins](https://springdoc.org/#maven-plugin) und GitHub Actions automatisiert werden.
