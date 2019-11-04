package Practica7_Visitor;

public class Perro implements Animal {
    private String enfermedad = "Colesterol Alto";

    public Perro() {
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
