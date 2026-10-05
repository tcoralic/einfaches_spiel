package view;

import javax.swing.*;
import java.awt.*;

public class GewinnView extends JFrame {

    // label für das ergebnis der aktuellen runde
    private JLabel lblRundenErgebnis;

    // label für die gesamtpunkte
    private JLabel lblGesamtPunkte;

    // eingabefeld für die zahl des spielers
    private JTextField txtSpielerZahl;

    // feld für die zahl des computers
    private JTextField txtComputerZahl;

    // button für eine neue runde
    private JButton btnNochEinmal;

    public GewinnView() {

        // titel des fensters
        setTitle("Zahlen-Gewinnspiel");

        // größe des fensters
        setSize(600, 350);

        // programm beendet sich beim schließen des fensters
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 4 zeilen 2 spalten
        setLayout(new GridLayout(4, 2, 10, 10));

        // anzeige für das rundenergebnis
        lblRundenErgebnis = new JLabel("Schreibe eine Zahl von 1 bis 9", SwingConstants.CENTER);

        // startpunktestand
        lblGesamtPunkte = new JLabel("Gesamtpunkte: 30", SwingConstants.CENTER);

        // überschrift für spielerzahl
        JLabel lblDeineZahl = new JLabel("Deine Zahl: ", SwingConstants.CENTER);

        // überschrift für computerzahl
        JLabel lblComputerZahl = new JLabel("Computer Zahl: ", SwingConstants.CENTER);

        // eingabefeld für spieler
        txtSpielerZahl = new JTextField();

        // feld für computer
        txtComputerZahl = new JTextField();

        // computerfeld darf nicht verändert werden
        txtComputerZahl.setEditable(false);

        // button erstellen
        btnNochEinmal = new JButton("Noch Einmal!");

        // elemente ins fenster einfügen
        add(lblRundenErgebnis);
        add(lblGesamtPunkte);

        add(lblDeineZahl);
        add(lblComputerZahl);

        add(txtSpielerZahl);
        add(txtComputerZahl);

        // leeres feld
        add(new JLabel());

        // button hinzufügen
        add(btnNochEinmal);

        // weißer hintergrund für das rundenergebnis
        lblRundenErgebnis.setOpaque(true);
        lblRundenErgebnis.setBackground(Color.WHITE);

        // weißer hintergrund für die gesamtpunkte
        lblGesamtPunkte.setOpaque(true);
        lblGesamtPunkte.setBackground(Color.WHITE);

        // fenster erscheint in der mitte des bildschirms
        setLocationRelativeTo(null);

        // fenster sichtbar machen
        setVisible(true);
    }

    public String getSpielerZahl() {
        // gibt zurück was der spieler ins textfeld geschrieben hat
        return txtSpielerZahl.getText();
    }

    public JTextField getTxtSpielerZahl() {
        // gibt das eingabefeld zurück
        // das braucht später der controller für die enter taste
        return txtSpielerZahl;
    }

    public JButton getBtnNochEinmal() {
        // gibt den button zurück
        // so kann der controller auf einen klick reagieren
        return btnNochEinmal;
    }

    public void setComputerZahl(int zahl) {
        // zeigt die zahl des computers im textfeld an
        txtComputerZahl.setText(String.valueOf(zahl));
    }

    public void setGesamtPunkte(int punkte) {
        // aktualisiert die anzeige der gesamtpunkte
        lblGesamtPunkte.setText("Gesamtpunkte: " + punkte);
    }

    public void setRundenErgebnis(String text) {
        // zeigt das ergebnis der runde an
        lblRundenErgebnis.setText(text);
    }

    public void leeresFeld() {
        // löscht die werte der letzten runde
        txtSpielerZahl.setText("");
        txtComputerZahl.setText("");
        lblRundenErgebnis.setText("Tippe eine Zahl von 1 bis 9");

        // cursor wieder ins eingabefeld setzen
        txtSpielerZahl.requestFocus();
    }

    public void setzeFarbeGewonnen() {
        // beide oberen labels werden grün
        lblRundenErgebnis.setBackground(Color.GREEN);
        lblGesamtPunkte.setBackground(Color.GREEN);
    }

    public void setzeFarbeVerloren(){
        // beide oberen labels werden rot
        lblRundenErgebnis.setBackground(Color.RED);
        lblGesamtPunkte.setBackground(Color.RED);
    }

    public void setzeFarbeNormal(){
        // standardfarbe ist wieder weiß
        lblRundenErgebnis.setBackground(Color.WHITE);
        lblGesamtPunkte.setBackground(Color.WHITE);
    }
}