/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author ING-SIS
 */
public class Registro {
    public String cedula;
    public String nombre;
    public String fechaNacimiento;
    public String celular;
    public String correo;
    public double salario;
    public String facultad;
    
    Registro(String c, String n, String f, String ce, String co, double s, String fa){
        this.cedula=c;
        this.nombre=n;
        this.fechaNacimiento=f;
        this.celular=ce;
        this.correo=co;
        this.salario=s;
        this.facultad=fa;
    }
    @Override
    public String toString(){
        return "["+cedula+nombre+fechaNacimiento+celular+correo+salario+facultad+"]";
    }
}
