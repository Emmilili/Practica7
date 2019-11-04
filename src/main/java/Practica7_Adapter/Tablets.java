package Practica7_Adapter;

public class Tablets implements Artefactos {
    public Tablets() {
    }

    public void precio() {
        System.out.println("precio de tablet: 500 dolares");
    }

    public void tiempoDeVida() {
        System.out.println("Tiempo de vida 5 años");
    }
}
