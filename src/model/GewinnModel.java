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

    public int getGesamtPunkte() {
        // gibt die aktuellen gesamtpunkte zurück
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        // gibt die zahl des computers zurück
        return computerZahl;
    }

    public int getRundenErgebnis() {
        // gibt das ergebnis der letzten runde zurück
        return rundenErgebnis;
    }

    public void berechneComputerZahl() {
        // erstellt eine zufällige zahl zwischen 1 und 9
        computerZahl = (int) (Math.random() + 9) + 1;
    }

}
