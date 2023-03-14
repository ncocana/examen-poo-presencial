package edu.craptocraft.examenpoopresencial.barcos;

public class BarcoCrucero implements Barcos {

    private int metrosEslora = 0;
    private int contadorCamasOcupadas = 0;

    public BarcoCrucero(int metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public int getContador() {
        return this.contadorCamasOcupadas;
    }

    public int getMetrosEslora() {
        return this.metrosEslora;
    }

    public void contarCamasOcupadas(String... numCamas) {
        for(String cama:numCamas) {
            if (!cama.equals("")) {
                this.contadorCamasOcupadas += 1;
            }
        }
    }

    @Override
    public void alarma() {
        System.out.println("\nBarco crucero");
    }

    @Override
    public String mensajeSocorro(String mensaje) {
        alarma();
        return mensaje;
    }

    @Override
    public String toString() {
        return "\nMetros eslora: " + this.getMetrosEslora() + "\nNúmero de camas ocupadas: " + this.getContador();
    }
    
}
