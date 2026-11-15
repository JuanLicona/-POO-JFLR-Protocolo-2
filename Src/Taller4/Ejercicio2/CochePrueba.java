package Taller4.Ejercicio2;

public class CochePrueba {

    public static void main(String[] args) {
        Coche coche = new Coche("Mazda", "3", 210);

        // Errores:
        // coche.marca = "Mazda";
        // coche.modelo = "Cx-5";
        // System.out.println(coche.velocidadMaxima);

        coche.acelerar(20);
        coche.acelerar(-15);
    }
}
