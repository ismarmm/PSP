package RepasoJava.EjercicioRepasoEldenRing.Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Encuentro {
 
    private  String nombre;
    private  LocalDate fecha;
    private  int dificultad;
 
    // List: los enemigos tienen un orden de aparición y puede repetirse alguno
    // (p. ej. dos "Lobo Siniestro"), cosa que un Set no permitiría.
    
    private final List<String> enemigos;
 
    public Encuentro(String nombre, LocalDate fecha, int dificultad, List<String> enemigos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.dificultad = dificultad;
        this.enemigos = new ArrayList<>(enemigos);
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
 
    public List<String> getEnemigos() {
        return Collections.unmodifiableList(enemigos);
    }
 
    @Override
    public String toString() {
        return "Encuentro{nombre='" + nombre + "', fecha=" + fecha
                + ", dificultad=" + dificultad + ", enemigos=" + enemigos + "}";
    }
}