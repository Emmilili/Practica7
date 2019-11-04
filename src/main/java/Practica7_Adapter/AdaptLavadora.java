package Practica7_Adapter;

public class AdaptLavadora implements Artefactos {
    private Lavadores lavadores = new Lavadores();

    public AdaptLavadora(Lavadores lavadores) {
        this.lavadores = lavadores;
    }

    public void precio() {
        System.out.println("Precio de lavadora: 500$us");
    }

    public void tiempoDeVida() {
        System.out.println("Tiempo de Garantia: 2 años");
    }
}
