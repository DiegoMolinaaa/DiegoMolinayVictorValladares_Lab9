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
public class Maestro extends Usuario {
    private int rrhh;

    public Maestro() {
    }

    public Maestro(int rrhh, String nombre, String user, String pass) {
        super(nombre, user, pass);
        this.rrhh = rrhh;
    }

    public int getRrhh() {
        return rrhh;
    }

    public void setRrhh(int rrhh) {
        this.rrhh = rrhh;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
}
