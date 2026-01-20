package edu.noel.martinez.act1.process;

public class Auto {
    private String modelo;
    private String tipoMotor; // Electrico, Combustión, Híbrido
    private int puertas;
    private String color;
    private double precio;

    public Auto(String modelo, String tipoMotor, int puertas, String color, double precio) {
        this.modelo = modelo;
        this.tipoMotor = tipoMotor;
        this.puertas = puertas;
        this.color = color;
        this.precio = precio;
    }

    public String getModelo() { return modelo; }
    public String getTipoMotor() { return tipoMotor; }
    public int getPuertas() { return puertas; }
    public String getColor() { return color; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return modelo + " | Motor: " + tipoMotor + " | Puertas: " + puertas +
                " | Color: " + color + " | Precio: $" + precio;
    }
}