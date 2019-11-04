package Practica7_Decorator;

public class CuentaBasica implements Cuenta {
    private int monto=1000;
    private String nombrePropietario="Emmi";


    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    @Override
    public void operacion() {
        System.out.println("Cuenta Basica, Monto=" + getMonto() + ", Nombre=" + getNombrePropietario());
    }

    @Override
    public int getMonto(){
        return monto;
    }

}
