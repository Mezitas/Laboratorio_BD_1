/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;
import java.util.Scanner;

/**
 *
 * @author ING-SIS
 */
public class Lab1 {

    public static void main(String[] args) {
        String archivo = "..\\Lab1\\src\\main\\java\\com\\mycompany\\lab1\\personas.txt";
        Tabla tabla = new Tabla(archivo);
        tabla.agregarTxt();
        tabla.mostrar();
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Buscar por cédula");
            System.out.println("4. Listar registros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
           
            switch(opcion){
                case 1:
                       System.out.print("Cédula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Fecha de nacimiento (dd/mm/yyyy): ");
                    String fecha = sc.nextLine();
                    System.out.print("Celular: ");
                    String celular = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Salario: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Facultad: ");
                    String facultad = sc.nextLine();
                    tabla.agregarRegistro(new Registro(cedula, nombre, fecha, celular, correo, salario, facultad));
                    System.out.println("Registro agregado.");
                    break;
               
                case 2:
                    System.out.print("Ingrese cédula a eliminar: ");
                    String cedulaEliminar = sc.nextLine();
                    if (tabla.eliminarRegistro(cedulaEliminar)){
                        System.out.println("Registro eliminado.");
                    }else{
                        System.out.println("No se encontró el registro.");
                    }
                    break;
                   
                case 3:
                    System.out.print("Ingrese cédula a buscar: ");
                     String cedulaBuscar = sc.nextLine();
                    Registro r = tabla.buscarPorCedula(cedulaBuscar);
                    if (r != null)
                        System.out.println(r);
                    else
                        System.out.println("No se encontró el registro.");
                    break;
                   
                case 4:
                    tabla.listarRegistros();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                   
                   
           
            }
        }while (opcion != 5);
            sc.close();
    }
}
