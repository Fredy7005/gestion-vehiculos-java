/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject10;


// Hereda de Vehiculo, asi nos ahorramos escribir las variables otra vez
public class Coche extends Vehiculo {
    // El unico atributo propio de esta clase
    private int numeroPuertas;

    // Constructor que aprovecha el del padre usando super()
    public Coche(String marca, String modelo, int anio, double precioDia, int numeroPuertas) {
        super(marca, modelo, anio, precioDia); 
        this.numeroPuertas = numeroPuertas;
    }

    // Getter y Setter por si hacen falta
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    // Sobreescribimos el metodo del padre para añadir las puertas sin borrar lo anterior
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Reutiliza los prints del padre
        System.out.println("Puertas: " + numeroPuertas);
    }
}