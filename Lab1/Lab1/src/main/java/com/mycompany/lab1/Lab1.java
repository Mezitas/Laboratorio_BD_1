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
    }
}
