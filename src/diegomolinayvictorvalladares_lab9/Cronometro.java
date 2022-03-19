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
            while (avanzar) {
                if(avanzar != false){
                    if (i == 59){
                        i = 0;
                        f++;
                        total += f;
                    }
                    i++;
                    segundos.setText(total+" minutos");
                }
                else{
                    System.out.println("Terminooo");
                }
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {

            }
        }
    }
}
