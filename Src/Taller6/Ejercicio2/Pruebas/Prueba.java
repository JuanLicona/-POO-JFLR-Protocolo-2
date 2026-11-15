package Taller6.Ejercicio2.Pruebas;

import Taller6.Ejercicio2.Vehiculos.Vehiculo;
import Taller6.Ejercicio2.Vehiculos.Moto;

public class Prueba{

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Automóvil", "Mazda");
        Moto m = new Moto("Motocicleta", "Yamaha", 150);

        // Errores:
        // v.tipo = "Camión";
        // System.out.println(m.marca);
        // v.mostrarDatos();

        m.mostrarMoto();
    }
}