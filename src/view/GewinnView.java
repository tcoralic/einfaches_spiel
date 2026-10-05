package view;

import javax.swing.*;

public class GewinnView extends JFrame {

    public GewinnView() {

        // titel des fensters
        setTitle("Zahlen-Gewinnspiel");

        // größe des fensters
        setSize(600, 350);

        // programm beendet sich beim schließen des fensters
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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