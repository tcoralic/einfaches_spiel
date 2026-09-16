package model;

public class GewinnModel {
    // hier werden die gesamt punkte gespeichert
    private int gesamtPunkte;

    // hier wird die zahl des spielers gespeichert
    private int spielerZahl;

    // hier wird die zufällige zahl des computers gespeichert
    private int computerZahl;

    // hier wird das ergebnis der aktuellen runde gespeichert
    private int rundenErgebnis;

    public GewinnModel() {
        // jeder spieler startet mit 30 punkten
        gesamtPunkte = 30;
    }

}
