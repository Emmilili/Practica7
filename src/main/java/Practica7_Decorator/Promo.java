package Practica7_Decorator;

public class Promo extends Decorator {
    public int seguro;

    public Promo(Cuenta cuenta) {
        super(cuenta);
    }

    @Override
    public void operacion() {
        getCuenta().operacion();
    }

    public int getMonto() {
        int random = (int)(Math.random()*10);
        if(random%2==0){
            int ganar=getCuenta().getMonto()*2;
            System.out.println("Es acreditador de la promocion, el monto es: " + ganar);
            return ganar;
        }else {
            System.out.println("No es acreditador de la promoción, el monto es: " + getCuenta().getMonto());
            return getCuenta().getMonto();
        }
    }
}
