package com.diego.command;

public class ComandoIngreso implements Comando{
    private Talanquera talanquera;

    public ComandoIngreso(Talanquera talanquera){
        this.talanquera = talanquera;
    }

    @Override
    public void ejecutar() {
        talanquera.subir();
        talanquera.esperar();
    }
    
}
