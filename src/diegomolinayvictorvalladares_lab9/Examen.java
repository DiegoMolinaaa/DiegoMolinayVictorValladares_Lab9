/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegomolinayvictorvalladares_lab9;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Examen {
    private int idClase;
    private ArrayList<Pregunta> preguntas = new ArrayList();

    public Examen() {
    }

    public Examen(int idClase) {
        this.idClase = idClase;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return idClase+"";
    }    
    
}
