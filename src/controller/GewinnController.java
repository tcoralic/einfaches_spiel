package controller;

import model.GewinnModel;
import view.GewinnView;

public class GewinnController {

    // das model enthält die spielelogik
    private GewinnModel model;

    // view ist unser fenster
    private GewinnView view;

    public GewinnController() {

        // model erstellen
        model = new GewinnModel();

        // view erstellen
        view = new GewinnView();

        // wenn im eingabefeld enter gedrückt wird
        view.getTxtSpielerZahl().addActionListener(e -> spieleRunde());

        // wenn auf noch einmal gedrückt wird
        view.getBtnNochEinmal().addActionListener(e -> neueRunde());
    }

    private void spieleRunde() {

        try {

            // text aus dem eingabefeld holen
            String eingabe = view.getSpielerZahl();

            // text in eine zahl umwandeln
            int spielerZahl = Integer.parseInt(eingabe);

            // nur zahlen von 1 bis 9 sind erlaubt
            if (spielerZahl < 1 || spielerZahl > 9) {

                // fehlermeldung anzeigen
                view.setRundenErgebnis("Bitte Zahl von 1 bis 9!");

                // methode hier beenden
                return;
            }

            // runde im model berechnen
            model.berechneRunde(spielerZahl);

            // computerzahl anzeigen
            view.setComputerZahl(model.getComputerZahl());

            // gesamtpunkte anzeigen
            view.setGesamtPunkte(model.getGesamtPunkte());


            if (model.hatGewonnen()) {

                // spiel gewonnen
                view.setRundenErgebnis("Gewonnen!");

                // grün anzeigen
                view.setzeFarbeGewonnen();
            }

            else if (model.hatVerloren()) {
                // spiel verloren
                view.setRundenErgebnis("Verloren!");

                // rot anzeigen
                view.setzeFarbeVerloren();
            }

            // normales rundenergebnis anzeigen
            else {

                int ergebnis = model.getRundenErgebnis();

                // bei positiven punkten ein + anzeigen
                if (ergebnis > 0) {
                    view.setRundenErgebnis("+" + ergebnis);

                    // grün, weil punkte gewonnen wurden
                    view.setzeFarbeGewonnen();
                }

                // bei -10 ist das minus schon vorhanden
                else {
                    // negative punkte anzeigen
                    view.setRundenErgebnis(String.valueOf(ergebnis));

                    // rot, weil punkte verloren wurden
                    view.setzeFarbeVerloren();
                }
            }

        } catch (NumberFormatException e) {

            // falls z.B. buchstaben eingegeben wurden
            view.setRundenErgebnis("Bitte eine gültige Zahl eingeben!");
        }
        // nach der runde eingabe sperren
        view.sperreEingabe();
    }

    private void neueRunde() {

        // alte werte löschen
        view.leeresFeld();

        // eingabe wieder freigeben
        view.entsperreEingabe();

        view.setzeFarbeNormal();
    }

    public static void main(String[] args) {

        // Spiel starten
        new GewinnController();
    }
}