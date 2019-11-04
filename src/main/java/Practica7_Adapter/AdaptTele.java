package Practica7_Adapter;

public class AdaptTele implements Artefactos {
    private Televisores televisores = new Televisores();

    public AdaptTele(Televisores televisores) {
        this.televisores = televisores;
    }

    public void precio() {
        System.out.println("Precio de Televisor: 1500 dolares");
    }

    public void tiempoDeVida() {
        System.out.println("Tiempo de garantia : 10 años");
    }
}
