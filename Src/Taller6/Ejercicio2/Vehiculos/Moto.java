package Taller6.Ejercicio2.Vehiculos;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarMoto() {
        System.out.println("Vehículo: " + tipo + "Marca: " + marca + "Cilindrada: " + cilindrada + " cc");
    }
}