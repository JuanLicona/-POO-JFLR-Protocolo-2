package Taller6.Ejercicio3.BancoM;

public class Prueba{

    public static void main(String[] args) {
        BancoMejorado cuenta = new BancoMejorado(100000);

        cuenta.depositar(50000);  // Saldo: 150000
        cuenta.retirar(200000);   // Bloqueado por los fondos
        cuenta.retirar(30000);    // Saldo: 120000
        System.out.println("Saldo final consultado: $" + cuenta.getSaldo());
    }
}
