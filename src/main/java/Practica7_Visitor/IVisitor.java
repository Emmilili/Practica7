package Practica7_Visitor;

public interface IVisitor {
    String visit(Perro var1);

    String visit(Gato var1);

    String visit(Caballo var1);
}
