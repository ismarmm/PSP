package elden_ring_proyecto.src.modelo;

import java.util.ArrayList;

public class SinLuz implements Comparable<SinLuz> {
    private static int siguienteId = 1;
    private int identificador;
    private String nombre;
    private ArrayList<Encuentro> encuentros;

    public SinLuz(String nombre) {
        this.identificador = siguienteId;
        siguienteId++;
        this.nombre = nombre;
        this.encuentros = new ArrayList<Encuentro>();
    }

    public int getIdentificador() {
        return identificador;
    }
    public String getNombre() {
        return nombre;
    }
    public ArrayList<Encuentro> getEncuentros() {
        return encuentros;
    }

    public void agregarEncuentro(Encuentro encuentro) {
        if (encuentros.contains(encuentro)) {
            encuentros.remove(encuentro);
        }
        encuentros.add(encuentro);
    }

    public boolean tieneEncuentroDificil() {
        boolean encontrado = false;
        for (Encuentro encuentro : encuentros) {
            if (encuentro.getDificultad() > 6) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    @Override
    public int compareTo(SinLuz otroSinLuz) {
        return nombre.compareToIgnoreCase(otroSinLuz.nombre);
    }

    @Override
    public boolean equals(Object objeto) {
        boolean iguales = false;
        if (objeto instanceof SinLuz) {
            SinLuz otroSinLuz = (SinLuz) objeto;
            if (identificador == otroSinLuz.identificador) {
                iguales = true;
            }
        }
        return iguales;
    }

    @Override
    public String toString() {
        return "SinLuz " + identificador + " - " + nombre + " - encuentros: " + encuentros;
    }
}
