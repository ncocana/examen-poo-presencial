package edu.craptocraft.examenpoopresencial.barcos;

public class BarcoPesquero implements Barcos {

    private int metrosEslora = 0;
    private int potencia = 0;
    private int numPescadores = 0;

    public BarcoPesquero(int metrosEslora, int potencia, int numPescadores) {
        this.metrosEslora = metrosEslora;
        this.potencia = potencia;
        this.numPescadores = numPescadores;
    }

    public int getMetrosEslora() {
        return this.metrosEslora;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public int getNumPescadores() {
        return this.numPescadores;
    }

    @Override
    public void alarma() {
        System.out.println("\nBarco pesquero");
    }

    @Override
    public String mensajeSocorro(String mensaje) {
        alarma();
        return mensaje;
    }

    @Override
    public String toString() {
        return "\nMetros eslora: " + this.getMetrosEslora() + "\nPotencia: " + this.getPotencia() + "\nNúmero de pescadores: " + this.getNumPescadores();
    }
    
}
