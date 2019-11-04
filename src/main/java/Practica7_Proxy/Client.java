package Practica7_Proxy;

public class Client {
    public static void main(String[] args) {
        IServidor proxy = new Proxy(new Servidor());

        proxy.carga("Hola",enumTipo.ZIP);
        proxy.descarga();
        proxy.carga("Hola",enumTipo.RAR);
        proxy.descarga();
        proxy.carga("Hola",null);
        proxy.descarga();
    }
}
