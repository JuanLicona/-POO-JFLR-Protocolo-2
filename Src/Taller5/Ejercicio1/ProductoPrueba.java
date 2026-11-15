package Taller5.Ejercicio1;

public class ProductoPrueba {

    public static void main(String[] args) {
        Producto pr = new Producto("Creatina Monohidratada", 120000, 15);

        pr.precio = 115000;
        pr.stock = 29;

        pr.mostrarInfo();
    }
}