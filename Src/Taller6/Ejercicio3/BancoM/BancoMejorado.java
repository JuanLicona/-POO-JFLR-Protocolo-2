package Taller6.Ejercicio3.BancoM;

public class BancoMejorado {

        private double saldo;

        public BancoMejorado(double saldoInicial) {
            if (saldoInicial >= 0) {
                this.saldo = saldoInicial;
            } else {
                this.saldo = 0;
            }
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double monto) {
            if (monto > 0) {
                saldo = saldo + monto;
                System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
            } else {
                System.out.println("Error: El monto que se deposito debe ser mayor a 0.");
            }
        }

        public void retirar(double monto) {
            if (monto > 0 && monto <= saldo) {
                saldo = saldo - monto;
                System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
            } else {
                System.out.println("Error: Fondos insuficientes o monto inválido.");
            }
        }
}
