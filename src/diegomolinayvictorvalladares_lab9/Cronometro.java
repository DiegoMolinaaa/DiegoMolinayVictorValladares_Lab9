package diegomolinayvictorvalladares_lab9;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cronometro extends Thread{
    private boolean avanzar;
    private boolean vive;
    private JLabel segundos;
    private int i;
    private int f;
    
    public Cronometro(JLabel segundos) {
        this.segundos =segundos;
        avanzar = true;
        vive = true;
        i = 0;
        f = 0;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    
    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run() {
        int total = 0;
        while (vive) {
            if (avanzar) {
                segundos.setText(f +":"+ i + "minutos");
                i++;
                if(i==60){
                    i=00;
                    f++;
                    JOptionPane.showMessageDialog(null, "Lleva "+f+" minutos");
                }
            }
            try {
                Thread.sleep(100);
                
            } catch (InterruptedException ex) {

            }
        }
    }
}
