package elden_ring_proyecto.src.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Encuentro {
    private String nombre;
    private LocalDate fecha;
    private int dificultad;
    private ArrayList<String> enemigos;

    public Encuentro(String nombre, LocalDate fecha, int dificultad, List<String> enemigos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.dificultad = dificultad;
        this.enemigos = new ArrayList<String>(enemigos);
    }

    public String getNombre() {
        return nombre;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public int getDificultad() {
        return dificultad;
    }
    public ArrayList<String> getEnemigos() {
        return enemigos;
    }

    @Override
    public boolean equals(Object objeto) {
        boolean iguales = false;
        if (objeto instanceof Encuentro) {
            Encuentro otroEncuentro = (Encuentro) objeto;
            if (nombre.equalsIgnoreCase(otroEncuentro.nombre)) {
                iguales = true;
            }
        }
        return iguales;
    }

    @Override
    public String toString() {
        return nombre + " - " + fecha + " - dificultad: " + dificultad + " - " + enemigos;
    }
}
