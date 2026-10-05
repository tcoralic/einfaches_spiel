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

        // fenster erscheint in der mitte des bildschirms
        setLocationRelativeTo(null);

        // fenster sichtbar machen
        setVisible(true);
    }

    public static void main(String[] args) {

        // erstellt und startet das fenster
        new GewinnView();
    }
}