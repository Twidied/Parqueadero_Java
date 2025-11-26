package com.diego;

import java.util.ArrayList;
import java.util.List;

import com.diego.command.Comando;
import com.diego.command.ComandoIngreso;
import com.diego.command.ComandoSalida;
import com.diego.command.Talanquera;

public class Main {

    public static void main(String[] args) {
        Talanquera talanquera = new Talanquera();

        List<Comando> steps = new ArrayList<>();
        steps.add(new ComandoIngreso(talanquera));
        steps.add(new ComandoSalida(talanquera));

        for (Comando comando : steps) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
            comando.ejecutar();
        }
    }
}