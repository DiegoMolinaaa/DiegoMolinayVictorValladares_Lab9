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
public class Clase {
    private String nombre;
    private int idClase;
    private int idMaestro;
    private int idEx1;
    private int idEx2;

    public Clase(String nombre, int idClase, int idMaestro, int idEx1, int idEx2) {
        this.nombre = nombre;
        this.idClase = idClase;
        this.idMaestro = idMaestro;
        this.idEx1 = idEx1;
        this.idEx2 = idEx2;
    }

    public Clase(String nombre, int idClase) {
        this.nombre = nombre;
        this.idClase = idClase;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }

    public int getIdEx1() {
        return idEx1;
    }

    public void setIdEx1(int idEx1) {
        this.idEx1 = idEx1;
    }

    public int getIdEx2() {
        return idEx2;
    }

    public void setIdEx2(int idEx2) {
        this.idEx2 = idEx2;
    }

    @Override
    public String toString() {
        return nombre;
    }            
    
}
