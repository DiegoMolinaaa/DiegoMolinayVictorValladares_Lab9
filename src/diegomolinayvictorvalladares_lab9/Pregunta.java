/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegomolinayvictorvalladares_lab9;

/**
 *
 * @author diego
 */
public class Pregunta {
    private String pregunta;
    private boolean respuesta;

    public Pregunta() {
    }

    public Pregunta(String pregunta, boolean respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return pregunta;
    }
    
}
