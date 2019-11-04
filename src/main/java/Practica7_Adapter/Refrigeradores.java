package Practica7_Adapter;

public class Refrigeradores implements OtrosArtefactos {
    public Refrigeradores() {
    }

    public void costo() {
        System.out.println("Costo de 200 bs un refrigerador");
    }

    public void tiempoGarantia() {
        System.out.println("Garantia de refrigerador: 5 años");
    }
}
