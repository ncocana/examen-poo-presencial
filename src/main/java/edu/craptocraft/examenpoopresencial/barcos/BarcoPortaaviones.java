package edu.craptocraft.examenpoopresencial.barcos;

public class BarcoPortaaviones implements Barcos {
    
    private int numAviones = 0;
    private int numMarineros = 0;

    public BarcoPortaaviones(int numAviones, int marineros) {
        this.numAviones = numAviones;
        this.numMarineros = numMarineros;
    }

    public int getNumAviones(){
        return this.numAviones;
    }

    public int getNumMarineros() {
        return this.numMarineros;
    }

    private void setNumAviones(int newNumber) {
        this.numAviones = newNumber;
    }

    private void setNumMarineros(int newNumber) {
        this.numMarineros = newNumber;
    }

    @Override
    public void alarma() {
        System.out.println("\nBarco portaaviones");
    }

    @Override
    public String mensajeSocorro(String mensaje) {
        alarma();
        return mensaje;
    }

    @Override
    public String toString() {
        return "\nNúmero de aviones: " + this.getNumAviones() + "\nNumero de marineros: " + this.getNumMarineros();
    }

}
