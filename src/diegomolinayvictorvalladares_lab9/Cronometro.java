package diegomolinayvictorvalladares_lab9;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cronometro extends Thread{
    private boolean avanzar;
    private boolean vive;
    private JLabel segundos;
    private JLabel minutos;
    
    public Cronometro(JLabel segundos, JLabel minutos) {
        this.segundos =segundos;
        this.minutos = minutos;
        avanzar = true;
        vive = true;
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
                int i = 0; 
                int f = 0;
                while (i < 60){
                    segundos.setText(i+"");
                    if (i == 59){
                        f++;
                        total += f;
                        minutos.setText(f+"");
                        JOptionPane.showMessageDialog(null, "Han pasado " + total + " minutos");
                    }
                }
                
                
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }
}