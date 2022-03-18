package diegomolinayvictorvalladares_lab9;

import javax.swing.JLabel;

public class Cronometro extends Thread{
    private boolean avanzar;
    private boolean vive;
    private JLabel label;
    
    public Cronometro(JLabel label) {
        this.label =label;
        avanzar = true;
        vive = true;
    }
}
