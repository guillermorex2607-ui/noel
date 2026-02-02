package edu.noel.martinez.act3.process;

import edu.noel.martinez.act3.modelos.Empleado;
import java.util.*;

public class ListaDeEmpleados {
    public static Empleado mayorSalario(List<Empleado> empleados) {
        return empleados.stream().max(Comparator.comparingDouble(Empleado::getSalario)).orElse(null);
    }

    public static int edadMasComun(List<Empleado> empleados) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (Empleado e : empleados) {
            frecuencia.put(e.getEdad(), frecuencia.getOrDefault(e.getEdad(), 0) + 1);
        }
        return Collections.max(frecuencia.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static double promedioEdad(List<Empleado> empleados) {
        return empleados.stream().mapToInt(Empleado::getEdad).average().orElse(0);
    }

    public static double promedioSalario(List<Empleado> empleados) {
        return empleados.stream().mapToDouble(Empleado::getSalario).average().orElse(0);
    }

    public static double promedioEdadMas25K(List<Empleado> empleados) {
        return empleados.stream().filter(e -> e.getSalario() > 25000)
                .mapToInt(Empleado::getEdad).average().orElse(0);
    }

    public static List<Empleado> menoresDe25(List<Empleado> empleados) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado e : empleados) {
            if (e.getEdad() < 25) resultado.add(e);
        }
        return resultado;
    }

    public static long contarSistemas(List<Empleado> empleados) {
        return empleados.stream().filter(e -> e.getDepartamento().equalsIgnoreCase("sistemas")).count();
    }

    public static Empleado mayorSalarioMas30(List<Empleado> empleados) {
        return empleados.stream().filter(e -> e.getEdad() > 30)
                .max(Comparator.comparingDouble(Empleado::getSalario)).orElse(null);
    }

    public static Empleado menorSalarioEdadMenosComun(List<Empleado> empleados) {
        int edadMenosComun = edadMenosComun(empleados);
        return empleados.stream().filter(e -> e.getEdad() == edadMenosComun)
                .min(Comparator.comparingDouble(Empleado::getSalario)).orElse(null);
    }

    private static int edadMenosComun(List<Empleado> empleados) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (Empleado e : empleados) {
            frecuencia.put(e.getEdad(), frecuencia.getOrDefault(e.getEdad(), 0) + 1);
        }
        return Collections.min(frecuencia.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}