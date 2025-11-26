package com.diego;

import com.diego.chain_responsability.Cajero;
import com.diego.chain_responsability.Gerente;
import com.diego.chain_responsability.Supervisor;

public class Main {
    public static void main(String[] args) {

        Cajero cajero = new Cajero();
        Gerente gerente = new Gerente();
        Supervisor supervisor = new Supervisor();

        cajero.setSiguiente(superv);
        superv.setSiguiente(gerente);

        cajero.aprobarDescuento(10); //Cajero
        cajero.aprobarDescuento(35); //Gerente
        cajero.aprobarDescuento(22); //Supervisor

        supervisor.aprobarDescuento(35); // ne mede :c
        
    }
}