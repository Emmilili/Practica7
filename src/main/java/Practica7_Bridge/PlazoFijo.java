package Practica7_Bridge;

public class PlazoFijo implements Cuenta {
    private int monto;
    private Moneda moneda;

    public PlazoFijo(Moneda monedas) {
        this.moneda = monedas;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public int Interes() {
        int interes5 = (5 * monto) / 100;
        int bolivianos = moneda.Bolivianos(getMonto());
        return bolivianos + interes5;
    }
}
