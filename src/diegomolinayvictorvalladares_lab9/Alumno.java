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
public class Alumno extends Usuario {
    private int numCuenta;
    private String carrera;
    private ArrayList<Clase> clases = new ArrayList();

    public Alumno() {
    }

    public Alumno(int numCuenta, String nombre, String user, String pass) {
        super(nombre, user, pass);
        this.numCuenta = numCuenta;
    }

    public Alumno(int numCuenta, String carrera, String nombre, String user, String pass) {
        super(nombre, user, pass);
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }
<<<<<<< HEAD
=======
    
>>>>>>> f42cf2e1fc01733e9e02803c54d45b18f554d5dd

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
