/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author ING-SIS
 */
public class Tabla {

    private final String archivo;
    private ArrayList<Registro> registros;

    Tabla(String archivo) {
        this.archivo = archivo;
        registros = new ArrayList<>();
    }

    public void agregarTxt() {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");

                String cedula = datos[0];
                String nombre = datos[1];
                String fechaNacimiento = datos[2];
                String celular = datos[3];
                String correo = datos[4];
                String salarioS = datos[5];
                String facultad = datos[6];

                double salario = Double.parseDouble(salarioS);

                Registro r = new Registro(cedula, nombre, fechaNacimiento, celular, correo, salario, facultad);

                registros.add(r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregarRegistro(Registro r) {
        registros.add(r);
    }

    public boolean eliminarRegistro(String cedula) {
        Iterator<Registro> elemento = registros.iterator();
        while (elemento.hasNext()) {
            if (elemento.next().cedula.equals(cedula)) {
                elemento.remove();
                return true;
            }
        }
        return false;
    }

    public Registro buscarPorCedula(String cedula) {
        for (Registro r : registros) {
            if (r.cedula.equals(cedula)) {
                return r;
            }
        }
        return null;
    }

    public void listarRegistros() {
        if (registros.isEmpty()) {
            System.out.println("No hay registros cargados.");
        } else {
            for (Registro r : registros) {
                System.out.println(r.toString());
            }
        }
    }

    public void guardar() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
            for (Registro r : registros) {
                pw.println(r.toString());
            }
        } catch (IOException e) {
            System.out.println("Error al sobrescribir el archivo: " + e.getMessage());
        }
    }

    public void mostrar() {
        for (int i = 0; i < registros.size(); i++) {
            System.out.println(registros.get(i).toString());
        }
    }

}
