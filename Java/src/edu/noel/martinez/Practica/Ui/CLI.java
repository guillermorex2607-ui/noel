package edu.noel.martinez.Practica.Ui;

import edu.noel.martinez.Practica.Process.Switch;

public class CLI {
    public static void start() {
        Switch switch_wifi = new Switch();
        System.out.println("Bienvenidos al programa");
        System.out.println("El switch esta " +switch_wifi.isOn());
        if (switch_wifi.isOn()) {
            System.out.println("Desea apagar el switch");
        } else {
            System.out.println("Desea prender el switch");
        }
        System.out.println("El switch esta"); switch_wifi.isOn();
}}
