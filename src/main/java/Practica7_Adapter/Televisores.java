package Practica7_Adapter;

public class Televisores implements OtrosArtefactos {
    public Televisores() {
    }

    public void costo() {
        System.out.println("Costo de telvisores: 200 dolares");
    }

    public void tiempoGarantia() {
        System.out.println("Garantia: 10 años");
    }
}
