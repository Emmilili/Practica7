package Practica7_Adapter;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Televisores televisor = new Televisores();
        Refrigeradores refrigerador = new Refrigeradores();
        Tablets tablet = new Tablets();
        Lavadores lavadora = new Lavadores();
        Computadores computadora = new Computadores();
        Celulares celular = new Celulares();
        AdaptTele adaptTele = new AdaptTele(televisor);
        AdaptLavadora adaptLavadora = new AdaptLavadora(lavadora);
        AdaptRefri adaptRefri = new AdaptRefri(refrigerador);
        ArrayList<Artefactos> artefactos = new ArrayList();
        artefactos.add(adaptTele);
        artefactos.add(computadora);
        artefactos.add(tablet);
        artefactos.add(celular);
        artefactos.add(adaptLavadora);
       // artefactos.add(adaptRefri);

        for(int i = 0; i < artefactos.size(); ++i) {
            ((Artefactos)artefactos.get(i)).precio();
            ((Artefactos)artefactos.get(i)).tiempoDeVida();
        }

    }
    }

