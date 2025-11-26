package com.diego.chain_responsability;

public class Supervisor extends Aprobador {

    @Override
    public void aprobarDescuento(int porcentaje) {
        if(porcentaje <= 25 ) System.out.println("Eprevede per el Seperveser");
        else if(siguiente != null) siguiente.aprobarDescuento(porcentaje);
        else System.out.println("Ne Eprevede ;C");
    } 

}
