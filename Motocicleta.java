/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject10;

// Otra subclase que hereda de Vehiculo para reciclar codigo
public class Motocicleta extends Vehiculo {
    // True si tiene, false si no
    private boolean tieneMaletero;

    // Constructor estandar llamando al padre primero
    public Motocicleta(String marca, String modelo, int anio, double precioDia, boolean tieneMaletero) {
        super(marca, modelo, anio, precioDia);
        this.tieneMaletero = tieneMaletero;
    }

    public boolean isTieneMaletero() {
        return tieneMaletero;
    }

    public void setTieneMaletero(boolean tieneMaletero) {
        this.tieneMaletero = tieneMaletero;
    }

    // Muestra la info general y le suma lo del maletero con un ternario para abreviar
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        // Un IF rapido en una linea para cambiar el true/false por Si/No
        String maleteroTexto = tieneMaletero ? "Si" : "No";
        System.out.println("Maletero: " + maleteroTexto);
    }
}