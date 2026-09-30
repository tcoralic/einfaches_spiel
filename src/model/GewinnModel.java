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

    public void berechneRunde(int spielerZahl)  {
        // die eingegebene zahl des spielers speichern
        this.spielerZahl = spielerZahl;
        //computer erstellt eine zufällige zahl
        berechneComputerZahl();

        // spieler und computer haben dieselbe zahl
        if (spielerZahl == computerZahl) {
            rundenErgebnis = 20;
        }

        // die zahlen unterscheiden sich genau um 1
        else if(Math.abs(spielerZahl - computerZahl) == 1) {
            rundenErgebnis = 5;
        }
        // bei allen anderen ergebnissen verliert man 10 punkte
        else {
            rundenErgebnis = -10;
        }
        // das rundenergebnis zu den gesamtpunkten addieren
        gesamtPunkte = gesamtPunkte + rundenErgebnis;
    }

    public boolean hatGewonnen(){
        // ab 100 punkte hat der spieler gewonnen
        return gesamtPunkte >= 100;
    }

    public boolean hatVerloren() {
        // bei 0 oder weniger punkten ist das spiel verloren
        return gesamtPunkte <= 0;
    }

}
