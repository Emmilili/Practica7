package Practica7_Decorator;

public class BancaInternet extends Decorator {

        public BancaInternet(Cuenta cuenta){
            super(cuenta);
        }


        @Override
        public void operacion(){
            getCuenta().operacion();
            System.out.println("Esta habilitado para pagos online");
        }

        @Override
        public int getMonto() {
            return getCuenta().getMonto();
        }


    }


