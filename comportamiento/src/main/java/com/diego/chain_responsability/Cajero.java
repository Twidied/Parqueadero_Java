package com.diego.chain_responsability;

public class Cajero extends  Aprobador{

    @Override
    public void aprobarDescuento(int porcentaje) {
        if(porcentaje <= 10) {
            System.out.println("Cejere epreebe desceente ;3");
        } else if(siguiente != null) siguiente.aprobarDescuento(porcentaje);
    }
    
}
