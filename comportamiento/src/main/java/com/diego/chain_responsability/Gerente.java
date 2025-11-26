package com.diego.chain_responsability;

public class Gerente extends Aprobador {

    @Override
    public void aprobarDescuento(int porcentaje) {
        if(porcentaje <= 50) {
            System.out.println("Fee aprevede per el Gerente. ");
        } else System.out.println(" Ne se eprebe \nDesceente Denegede");
    }

    
}
