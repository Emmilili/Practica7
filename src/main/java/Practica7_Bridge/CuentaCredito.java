package Practica7_Bridge;

public class CuentaCredito implements Cuenta {
    private int monto;
    private Moneda moneda;

    public CuentaCredito(Moneda moneda) {
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
        return getMonto();
    }
}
