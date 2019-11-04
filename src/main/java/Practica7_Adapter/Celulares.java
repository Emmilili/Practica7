package Practica7_Adapter;

public class Celulares implements Artefactos {
    public Celulares() {
    }

    public void precio() {
        System.out.println("Precio de celular: 1000 dolares");
    }

    public void tiempoDeVida() {
        System.out.println("Tiempo de garantia del celular: 2 años");
    }

}
