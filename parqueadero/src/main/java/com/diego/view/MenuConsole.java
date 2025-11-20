package com.diego.view;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.diego.service.GestorIngreso;
import com.diego.repository.ParqueaderoDatos;

public class MenuConsole {
    Scanner scan;
    GestorIngreso gIngreso;
    public MenuConsole() {
        scan = new Scanner(System.in);
        gIngreso = new GestorIngreso();
    }


    public void iniciar() {
        int opcion = -1;

        do {
            mostrarMenuPrincipal();
            opcion = leerEntero("Selecciona una opcion del Menu anterior:");
        } while (opcion != 0);
    }


    private void procesarOpcion(int opcionMenu) {
        switch (opcionMenu) {
            case 1 -> opcionIngresarVehiculo();
            case 2 -> opcionRegistrarSalida();
            case 3 -> opcionConsultarVehivulo();
            case 0 -> System.out.println("Muchas gracias por preferirnos <3");
            default -> System.out.println("Opcion no valida.");
        }

    }

    private int leerEntero(String msg) {
        System.out.println(msg);
        try {
            String valoringresado = scan.nextLine();
            return Integer.parseInt(valoringresado);
        } catch (NumberFormatException e) {
            System.out.println("xfa ingrese un numero valido");
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }

    private void mostrarMenuPrincipal() {
        System.out.println("~~~~~ SISTEMA DE PARQUEADERO ~~~~~");
        System.out.println("\t1. Ingresar Vehiculo");
        System.out.println("\t2. Registrar Salida y Pagar");
        System.out.println("\t3. Consultar Vehiculo");
        System.out.println("\t0. Salir");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        

    }

    private void opcionIngresarVehiculo() {
        System.out.println("~~~~ NUEVO INGRESO ~~~~");
        String placa = leerTexto("Ingrese la placa: ");

        if(gIngreso.registrarIngreso(placa)) {
            //ParqueaderoDatos
            //
            if(pDatos.exitePlaca(placa)) {

            }
            // NO -> REGISTRO 
             else {
                Carro carrito = new Carro(placa, "x", LocalDateTime.now());
                pDatos.guardar(carrito);
                
                System.out.println("Vehiculo registrado exitosamente.");
            }

        } else {

        }

    }

    private void opcionRegistrarSalida() {

    }
    private  void opcionConsultarVehivulo() {
        
    }

    // Utilidades
    //
    private String leerTexto(String msg) {
        System.out.println(msg);
        return scan.nextLine().trim().toLowerCase();
    }
    


}
