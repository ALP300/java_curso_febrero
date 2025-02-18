/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.POO;

/**
 *
 * @author aitor
 */
public class Hija extends Padre {
    protected String carrera;

    public Hija(String carrera, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public Hija(String carrera, String nombre, int edad, double sueldo) {
        super(nombre, edad, sueldo);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
   
    
}
    
