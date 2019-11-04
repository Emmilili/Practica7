package Practica7_Composite;

public class Client {
    public static void main(String[] args) {

            Composite laboratorio = new Composite("Laboratorio");
            laboratorio.add(new Computadora("PC 1..."));

            laboratorio.add(new Computadora("PC 2..."));

            laboratorio.add(new Computadora("PC 3..."));

            Composite laboratorio2 = new Composite("Laboratorio 2");
            laboratorio2.add(new Computadora("PC 1..."));

            laboratorio2.add(new Computadora("PC 2..."));



            Composite cont1 = new Composite("Contenedor 1");

            cont1.add(laboratorio);
            cont1.add(laboratorio2);

            cont1.operation();

        }
}
