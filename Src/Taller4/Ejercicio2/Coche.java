package Taller4.Ejercicio2;

public class Coche {

    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            this.velocidadMaxima = 0;
        }
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima = velocidadMaxima + incremento;
            System.out.println(" Coche acelerado, su nueva velocidad máxima es: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("Error en el incremento");
        }
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}

