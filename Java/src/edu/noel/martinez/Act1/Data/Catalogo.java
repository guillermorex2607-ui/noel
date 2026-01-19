package edu.noel.martinez.Act1.Data;

import edu.noel.martinez.Act1.Process.Auto;

public class Catalogo {
    public static Auto[] obtenerAutos() {
        return new Auto[] {
                new Auto("BYD Sealion 7 EV", "Eléctrico", 5, "Azul oscuro", 650000),
                new Auto("BYD Dolphin Mini EV", "Eléctrico", 5, "Azul claro", 350000),
                new Auto("BYD Yuan Pro EV", "Eléctrico", 5, "Gris oscuro", 420000),
                new Auto("BYD Seal EV", "Eléctrico", 4, "Azul claro", 580000)
        };
    }
}