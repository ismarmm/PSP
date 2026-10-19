package EldenRingMapas.modelo;

import java.time.LocalDate;
import java.util.List;

public class Encuentro {
    private String nombre;
    private LocalDate fecha;
    private int dificultad;
    private List<String> enemigos;

    public Encuentro(String nombre, LocalDate fecha, int dificultad, List<String> enemigos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.dificultad = dificultad;
        this.enemigos = enemigos;
    }

    public String getNombre() { return nombre; }
    public int getDificultad() { return dificultad; }

    @Override
    public String toString() {
        return nombre + " - " + fecha + " - Dificultad: " + dificultad + " - " + enemigos;
    }
}
