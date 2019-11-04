package Practica7_Adapter;

public class Computadores implements Artefactos {
    public Computadores() {
    }

    public void precio() {
        System.out.println("Precio de computadora: 800 dolares");
    }

    public void tiempoDeVida() {
        System.out.println("Tiempo de garantia 4 años");
    }
}
