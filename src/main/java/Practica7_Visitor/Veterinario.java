package Practica7_Visitor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Veterinario implements IVisitor {
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    Date date = new Date();
    Calendar fecha = new GregorianCalendar();
    int anio;
    int mes;
    int dia;

    public Veterinario() {
        this.anio = this.fecha.get(1);
        this.mes = this.fecha.get(2);
        this.dia = this.fecha.get(5);
    }

    public String visit(Perro perro) {
        System.out.println("Se receta antibiotico para el perro " + perro.getEnfermedad() + " a las: " + this.dateFormat.format(this.date) + " el dia: " + this.dia + "/" + (this.mes + 1) + "/" + this.anio);
        return "";
    }

    public String visit(Gato gato) {
        System.out.println("Se receta antibiotico para el gato" + gato.getEnfermedad() + " a las: " + this.dateFormat.format(this.date) + " el dia: " + this.dia + "/" + (this.mes + 1) + "/" + this.anio);
        return "";
    }

    public String visit(Caballo caballo) {
        System.out.println("Se receta unguento para el caballo " + caballo.getEnfermedad() + " a las: " + this.dateFormat.format(this.date) + " el dia: " + this.dia + "/" + (this.mes + 1) + "/" + this.anio);
        return "";
    }
}
