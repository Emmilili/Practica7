package Practica7_Decorator;

public class Seguro extends Decorator {
    public int seguro;

    public Seguro(Cuenta cuenta, int seguro) {
        super(cuenta);
        this.seguro=seguro;
    }

    @Override
    public void operacion() {
        getCuenta().operacion();
    }

    public int getMonto() {
        int descuento=getCuenta().getMonto()-seguro;

        System.out.println("El seguro tiene el monto de " + descuento);
        return descuento;
    }

}
