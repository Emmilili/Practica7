package Practica7_Adapter;

public class Lavadores implements OtrosArtefactos {
    public Lavadores() {
    }

    public void costo() {
        System.out.println("Costo de lavadora: 1000 dolares");
    }

    public void tiempoGarantia() {
        System.out.println("Tiempo de garantia: 20 años");
    }
}
