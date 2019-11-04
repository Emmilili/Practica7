package Practica7_Visitor;

public class Caballo implements Animal {
    private String enfermedad = "Garrapatas";

    public Caballo() {
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
