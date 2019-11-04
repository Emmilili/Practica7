package Practica7_Decorator;

public abstract class Decorator implements Cuenta {
    private Cuenta cuenta;
    public Decorator(Cuenta cuenta){
        setCuenta(cuenta);
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta= cuenta;
    }
}
