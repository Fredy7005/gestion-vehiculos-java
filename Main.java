/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject10;

import java.util.ArrayList;

// Clase principal para lanzar la aplicacion y probar que todo va
public class Main {
    public static void main(String[] args) {
        // Lista dinamica para meter todos los vehiculos juntos sin importar el tipo
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        // Creamos los objetos con datos aleatorios para cumplir el cupo de 2 y 2
        Coche coche1 = new Coche("Toyota", "Corolla", 2022, 45.0, 5);
        Coche coche2 = new Coche("Ford", "Mustang", 2020, 90.0, 3);

        Motocicleta moto1 = new Motocicleta("Yamaha", "MT-07", 2021, 30.0, true);
        Motocicleta moto2 = new Motocicleta("Ducati", "Panigale", 2023, 120.0, false);

        // Metemos todo al ArrayList
        listaVehiculos.add(coche1);
        listaVehiculos.add(coche2);
        listaVehiculos.add(moto1);
        listaVehiculos.add(moto2);

        System.out.println("=== SISTEMA DE GESTION DE VEHICULOS ===\n");
        
        // Bucle for clasico para recorrer la lista y aplicar polimorfismo puro
        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo v = listaVehiculos.get(i);
            v.mostrarInformacion(); // Cada objeto sabe que metodo usar automaticamente
            
            // Un separador para que la consola no sea un caos, menos en el ultimo
            if (i < listaVehiculos.size() - 1) {
                System.out.println("\n-------------------\n");
            }
        }
    }
}