package com.diego.model;

import java.time.LocalDateTime;

public class Carro extends Vehiculo {
    
    public Carro(String placa, String modelo, LocalDateTime horaIngreso) {
        super(placa, modelo, horaIngreso, TipoVehiculo.SEDAN);
    }
    
}
