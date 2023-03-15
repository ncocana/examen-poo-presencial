package edu.craptocraft.examenpoopresencial;

import edu.craptocraft.examenpoopresencial.barcos.BarcoCrucero;
import edu.craptocraft.examenpoopresencial.barcos.BarcoPesquero;
import edu.craptocraft.examenpoopresencial.barcos.BarcoPortaaviones;
import edu.craptocraft.examenpoopresencial.barcos.Barcos;

public class App 
{
    public static void main( String[] args )
    {
        Barcos barcoCrucero = new BarcoCrucero(13);
        System.out.println(barcoCrucero.mensajeSocorro("SOS"));
        System.out.println(barcoCrucero.toString());

        System.out.println("------------------------------");
        Barcos barcoPesquero = new BarcoPesquero(13, 50, 8);
        System.out.println(barcoPesquero.mensajeSocorro("SOS"));
        System.out.println(barcoPesquero.toString());
        
        System.out.println("------------------------------");
        Barcos barcoPortaaviones = new BarcoPortaaviones(13, 30);
        System.out.println(barcoPortaaviones.mensajeSocorro("SOS"));
        System.out.println(barcoPortaaviones.toString());
    }
}
