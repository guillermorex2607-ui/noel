package Correccion.process;

import Correccion.model.Empleado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaEmpleado {

    public static Empleado mayorSalario(List<Empleado> empleados) {

        if (empleados.size() == 0) return null;

        Empleado mayor = empleados.get(0);

        for (int i = 1; i < empleados.size(); i++) {
            if (empleados.get(i).getSalario() > mayor.getSalario()) {
                mayor = empleados.get(i);
            }
        }

        return mayor;
    }

    public static int edadMasComun(List<Empleado> empleados) {

        Map<Integer, Integer> contador = new HashMap<>();

        for (int i = 0; i < empleados.size(); i++) {
            int edad = empleados.get(i).getEdad();

            if (contador.containsKey(edad)) {
                contador.put(edad, contador.get(edad) + 1);
            } else {
                contador.put(edad, 1);
            }
        }

        int edadMasComun = 0;
        int mayor = 0;

        for (Integer edad : contador.keySet()) {
            if (contador.get(edad) > mayor) {
                mayor = contador.get(edad);
                edadMasComun = edad;
            }
        }

        return edadMasComun;
    }

    public static double promedioEdad(List<Empleado> empleados) {

        if (empleados.size() == 0) return 0;

        int suma = 0;

        for (int i = 0; i < empleados.size(); i++) {
            suma += empleados.get(i).getEdad();
        }

        return (double) suma / empleados.size();
    }

    public static double promedioSalario(List<Empleado> empleados) {

        if (empleados.size() == 0) return 0;

        double suma = 0;

        for (int i = 0; i < empleados.size(); i++) {
            suma += empleados.get(i).getSalario();
        }

        return suma / empleados.size();
    }

    public static double promedioEdadMas25K(List<Empleado> empleados) {

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getSalario() > 25000) {
                suma += empleados.get(i).getEdad();
                contador++;
            }
        }

        if (contador == 0) return 0;

        return (double) suma / contador;
    }

    public static List<Empleado> menoresDe25(List<Empleado> empleados) {

        List<Empleado> lista = new ArrayList<>();

        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getEdad() < 25) {
                lista.add(empleados.get(i));
            }
        }

        return lista;
    }

    public static long contarSistemas(List<Empleado> empleados) {

        long contador = 0;

        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getDepartamento().equalsIgnoreCase("sistemas")) {
                contador++;
            }
        }

        return contador;
    }

    public static Empleado mayorSalarioMas30(List<Empleado> empleados) {

        Empleado mayor = null;

        for (int i = 0; i < empleados.size(); i++) {

            if (empleados.get(i).getEdad() > 30) {

                if (mayor == null || empleados.get(i).getSalario() > mayor.getSalario()) {
                    mayor = empleados.get(i);
                }
            }
        }

        return mayor;
    }

    public static Empleado menorSalarioEdadMenosComun(List<Empleado> empleados) {

        int edadMenosComun = edadMenosComunInterna(empleados);
        Empleado menor = null;

        for (int i = 0; i < empleados.size(); i++) {

            if (empleados.get(i).getEdad() == edadMenosComun) {

                if (menor == null || empleados.get(i).getSalario() < menor.getSalario()) {
                    menor = empleados.get(i);
                }
            }
        }

        return menor;
    }

    private static int edadMenosComunInterna(List<Empleado> empleados) {

        Map<Integer, Integer> contador = new HashMap<>();

        for (int i = 0; i < empleados.size(); i++) {
            int edad = empleados.get(i).getEdad();

            if (contador.containsKey(edad)) {
                contador.put(edad, contador.get(edad) + 1);
            } else {
                contador.put(edad, 1);
            }
        }

        int edadMenosComun = 0;
        int menor = Integer.MAX_VALUE;

        for (Integer edad : contador.keySet()) {
            if (contador.get(edad) < menor) {
                menor = contador.get(edad);
                edadMenosComun = edad;
            }
        }

        return edadMenosComun;
    }
}