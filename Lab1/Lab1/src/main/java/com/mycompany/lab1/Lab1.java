/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab1;

/**
 *
 * @author ING-SIS
 */
public class Lab1 {

    public static void main(String[] args) {
        String archivo = "..\\Lab1\\src\\main\\java\\com\\mycompany\\lab1\\personas.txt";
        Tabla tabla = new Tabla(archivo);
        tabla.agregarTxt();

        Menu m = new Menu(tabla);

        int repetir = 1;
        while (repetir == 1) {
            repetir = m.menuVisual();
        }

        /*
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
            sc.close();*/
    }
}
