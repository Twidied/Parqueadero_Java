package com.diego.chain_responsability;

public abstract class Aprobador {
    protected Aprobador siguiente;
    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void aprobarDescuento(int porcentaje);
}
