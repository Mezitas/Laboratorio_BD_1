/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author juand
 */
public class Menu {

    private int opcion;
    private Tabla tabla;
    private Scanner sc;

    Menu(Tabla tabla) {
        this.opcion = 1;
        sc = new Scanner(System.in);
        this.tabla = tabla;
    }

    public int menuVisual() {
        int salir = 1;
        System.out.println("Menu");
        System.out.println("1. Agregar");
        System.out.println("2. Eliminar");
        System.out.println("3. Buscar por cédula");
        System.out.println("4. Listar registros");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        String op = sc.nextLine();
        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1 ->
                Option_1();
            case 2 ->
                Option_2();
            case 5 ->{
                salir = -1;
                tabla.guardar();
            }
            default ->{
                System.out.println("Ingresa un valor valido");
            }
        }
        return salir;
    }

    private void Option_1() {
        //Validacion continuar
        if (!VContinuar()) {
            System.out.println("Saliendo...");
        } else {
            //Validaciones de los datos
            String cedula = VCedula();
            String nombre = VNombre();
            String fecha = VFecha();
            String celular = VCelular();
            String correo = VCorreo();
            Double salario = VSalario();
            String facultad = VFacultad();

            //Inicializacion del Registro
            Registro r = new Registro(cedula, nombre, fecha, celular, correo, salario, facultad);
            tabla.agregarRegistro(r);
            System.out.println("Registrado agregado");
        }
    }

    private void Option_2() {
        if (!VContinuar()) {
            System.out.println("Saliendo...");
        } else {
            String cedula = VCedula();
            if (tabla.eliminarRegistro(cedula)) {
                System.out.println("Registro eliminado");
            } else {
                System.out.println("Registro no encontrado");
            }
        }
    }

    //Validaciones
    private boolean VContinuar() {
        int validacion = 0;
        System.out.println("Continuar con el registro");
        System.out.println("1) si");
        System.out.println("2) no");
        String v = sc.nextLine();
        validacion = Integer.parseInt(v);
        return validacion == 1;
    }

    private String VCedula() {
        String cedula = "";
        do {

            System.out.print("Escribe la cedula: ");
            cedula = sc.nextLine();
            if (cedula.isEmpty()) {
                System.out.println("Error: El texto no puede estar vacío");
            }
        } while (cedula.isEmpty());
        return cedula;
    }

    private String VNombre() {
        String nombre = "";
        do {
            System.out.print("Escribe el nombre: ");
            nombre = sc.nextLine();
            if (nombre.isEmpty()) {
                System.out.println("Error: El texto no puede estar vacío");
            }
        } while (nombre.isEmpty());
        return nombre;
    }

    private String VFecha() {
        String fecha = "";
        do {
            System.out.print("Escribe la fecha de nacimiento (dd/mm/yyyy): ");
            fecha = sc.nextLine();
            if (fecha.isEmpty()) {
                System.out.println("Error: El texto no puede estar vacío");
            }
        } while (fecha.isEmpty());
        return fecha;
    }

    private String VCelular() {
        String celular = "";
        do {
            System.out.print("Escribe el celular: ");
            celular = sc.nextLine();
            if (celular.isEmpty()) {
                System.out.println("Error: El texto no puede estar vacío");
            }
        } while (celular.isEmpty());
        return celular;
    }

    private String VCorreo() {
        String correo = "";
        do {
            System.out.print("Escribe el correo: ");
            correo = sc.nextLine();
            if (correo.isEmpty()) {
                System.out.println("Error: El texto no puede estar vacío");
            }
        } while (correo.isEmpty());
        return correo;
    }

    private double VSalario() {
        Double salario = 0.0;
        while (salario <= 0) {
            System.out.print("Escribe el salario: ");
            String s = sc.nextLine();
            if (s.isEmpty()) {
                System.out.println("Error: El texto no puede estar vacío");
                continue;
            }
            try {
                salario = Double.valueOf(s);
            } catch (NumberFormatException e) {
                System.out.println("Error: Se debe ingresar un numero valido");
            }
            if (salario <= 0) {
                System.out.println("Error: Se debe ingresar un numero valido");
            }
        }
        return salario;
    }

    private String VFacultad() {
        String facultad = "";
        do {
            System.out.print("Escribe la facultad: ");
            facultad = sc.nextLine();
            if (facultad.isEmpty()) {
                System.out.println("Error: El texto no puede estar vacío");
            }
        } while (facultad.isEmpty());
        return facultad;
    }
}
