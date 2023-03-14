package edu.craptocraft.examenpoopresencial;

import edu.craptocraft.examenpoopresencial.barcos.BarcoCrucero;
import edu.craptocraft.examenpoopresencial.barcos.BarcoPesquero;
import edu.craptocraft.examenpoopresencial.barcos.BarcoPortaaviones;

public class App 
{
    public static void main( String[] args )
    {
        BarcoCrucero barcoCrucero = new BarcoCrucero(13);
        barcoCrucero.contarCamasOcupadas("cama1", "cama2", "cama3");
        System.out.println(barcoCrucero.mensajeSocorro("SOS"));
        System.out.println(barcoCrucero.toString());

        System.out.println("------------------------------");
        BarcoPesquero barcoPesquero = new BarcoPesquero(13, 50, 8);
        System.out.println(barcoPesquero.mensajeSocorro("SOS"));
        System.out.println(barcoPesquero.toString());
        
        System.out.println("------------------------------");
        BarcoPortaaviones barcoPortaaviones = new BarcoPortaaviones(13, 30);
        System.out.println(barcoPortaaviones.mensajeSocorro("SOS"));
        System.out.println(barcoPortaaviones.toString());
    }
}
