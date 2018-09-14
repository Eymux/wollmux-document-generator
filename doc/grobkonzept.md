# Grobkonzept

* REST-API zur Kommunikation mit WollMux und Fachanwendungen
    * Zunächst nur eine Funktion zum Generieren von WollMux-Dokumenten aus Vorlagen
    * Weitere Funktionen (z.B. Reportgenerator) in der Zukunft
* Für jedes Dateiformat (ODF, DOCX, PDF etc.) gibt es einen Microservice, der die Dokumente aufbaut
    * die Microservices werden von der REST-API aufgerufen
    * Fachverfahren können die Microservices auch direkt verwenden
* Konfigurationsservice
    * REST-API die Vorlagen und Fragmente zur Verfügung stellt
    * Konfigurationseinstellungen für den WollMux
* Vorlagen und Fragmente liegen auf einem Fileserver