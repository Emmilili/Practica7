package Practica7_Bridge;

public class Client {
    public static void main(String[] args) {
        Euros euros = new Euros();
        CuentaAhorro ahorro = new CuentaAhorro(euros);
        ahorro.setMonto(650);
        System.out.println("El monto de tipo Cuenta Ahorro mas su tipo de moneda en Euros es: "+ahorro.Interes()+"Bs");

        Dolares dolares = new Dolares();
        PlazoFijo plazoFijo= new PlazoFijo(dolares);
        plazoFijo.setMonto(400);
        System.out.println("El monto de tipo de Cuenta Plazo Fijo mas su tipo de moneda en Dolares es: "+plazoFijo.Interes()+"Bs");

        Bolivianos bolivianos = new Bolivianos();
        CuentaCredito credito= new CuentaCredito(bolivianos);
        credito.setMonto(100);
        System.out.println("El monto de tipo de Cuenta Credito mas su tipo de moneda en Bolivianos es: "+credito.Interes()+"Bs");
    }
    }
