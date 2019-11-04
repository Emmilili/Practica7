package Practica7_Adapter;

public class AdaptRefri {
    private Refrigeradores refrigeradores = new Refrigeradores();

    public AdaptRefri(Refrigeradores refrigeradores) {
        this.refrigeradores = refrigeradores;
    }

    public void precio() {
        System.out.println("Precio de lavadora: 2100Bs");
    }

    public void tiempoDeVida() {
        System.out.println("Tiempo de garantia: 5 años");
    }
}
