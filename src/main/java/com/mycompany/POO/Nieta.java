/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.POO;

/**
 *
 * @author aitor
 */
public class Nieta extends Hija{
    protected String musica;

    public Nieta(String musica, String carrera, String nombre, int edad) {
        super(carrera, nombre, edad);
        this.musica = musica;
    }

    public Nieta(String musica, String carrera, String nombre, int edad, double sueldo) {
        super(carrera, nombre, edad, sueldo);
        this.musica = musica;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
    
}
