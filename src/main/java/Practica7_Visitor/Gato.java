package Practica7_Visitor;

public class Gato implements Animal {
    private String enfermedad = "Higado graso";

    public Gato() {
    }

    public String getEnfermedad() {
        return this.enfermedad;
    }

    public String accept(IVisitor visitor) {
        return visitor.visit(this);
    }

    public String enfermedad() {
        return this.getEnfermedad();
    }
}
