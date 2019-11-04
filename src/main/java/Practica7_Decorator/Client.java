package Practica7_Decorator;

public class Client {
    public static void main(String[] args) {

            Cuenta cuentaBancaria = new CuentaBasica();
            cuentaBancaria = new BancaInternet(cuentaBancaria);
            cuentaBancaria = new Seguro(cuentaBancaria, 100);
            cuentaBancaria = new Promo(cuentaBancaria);
            cuentaBancaria.operacion();
            cuentaBancaria.getMonto();
        }
    }

