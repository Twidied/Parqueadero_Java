package com.diego.repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.diego.model.Vehiculo;

public class ParqueaderoDatos {
    
    private final Set<String> placas = new HashSet<>();

    private final Map<String, Vehiculo> mapaPlacas = new HashMap<>();

    public void guardar(Vehiculo vehiculo) {
        placas.add(vehiculo.getPlaca());
        mapaPlacas.put(vehiculo.getPlaca(), vehiculo);
    }

    public void registrarIngreso(String placa){
        mapaPlacas.get(placa).registrarIngreso();

    }

    public boolean existePlacas(String placa) {
        return placas.contains(placa);
    }

    public Vehiculo buscar(String placa) {
        return mapaPlacas.get(placa);
    }
}
