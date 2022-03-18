/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegomolinayvictorvalladares_lab9;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class administrarExamenes {
    private ArrayList<Examen> listaExamenes = new ArrayList();
    private File archivo = null;

    public administrarExamenes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Examen> getListaCarros() {
        return listaExamenes;
    }

    public void setListaCarros(ArrayList<Examen> listaCarros) {
        this.listaExamenes = listaCarros;
    }
    
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaCarros=" + listaExamenes;
    }

    //extra mutador
    public void setExamen(Examen e) {
        this.listaExamenes.add(e);
    }

    public void cargarArchivo() {
        try {            
            listaExamenes = new ArrayList();
            Examen temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Examen) objeto.readObject()) != null) {
                        listaExamenes.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Examen c : listaExamenes) {
                bw.writeObject(c);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
