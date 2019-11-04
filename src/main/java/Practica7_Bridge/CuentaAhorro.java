package Practica7_Bridge;

public class CuentaAhorro implements Cuenta {
    private Moneda moneda;
    private int monto;

    public CuentaAhorro(Moneda moneda) {
        this.moneda = moneda;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public int Interes() {
        int interes = (2 * monto) / 100;
        int bolivianos = moneda.Bolivianos(getMonto());
        return bolivianos + interes;
    }
}
