package RepasoJava.EjercicioRepasoEldenRing.Modelo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class SinLuz implements Comparable<SinLuz> {
 
    // Contador estático para el identificador autoincremental.
    private static int contador = 0;
 
    private int identificador;
    private String nombre; // final: es la clave de ordenación del registro (TreeSet)
    private Map<String, Encuentro> encuentros = new LinkedHashMap<>();
    
    /*
     * JUSTIFICACIÓN: Map<String, Encuentro> (clave = nombre del encuentro) en lugar de List o Set.
     *  - List: permitiría duplicados y habría que recorrerla para buscar/actualizar un encuentro.
     *  - Set: Set.add() NO sustituye un elemento igual que ya existe, y el enunciado pide que
     *    al agregar un encuentro que ya contiene, éste se ACTUALICE.
     *  - Map: put() con una clave existente reemplaza el valor => actualización directa, sin
     *    duplicados y con búsqueda O(1). Se usa LinkedHashMap para conservar el orden de inserción.
     */
    
 
    public SinLuz(String nombre) {
        this.identificador = ++contador;
        this.nombre = nombre;
    }
 
    public int getIdentificador() {
        return identificador;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public Collection<Encuentro> getEncuentros() {
        return Collections.unmodifiableCollection(encuentros.values());
    }
 
    public void agregaEncuentro(Encuentro encuentro) {
        encuentros.put(encuentro.getNombre(), encuentro);
    }
 
    public boolean tieneEncuentroMasDificilQue(int umbral) {
        return encuentros.values().stream().anyMatch(e -> e.getDificultad() > umbral);
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SinLuz)) return false;
        return identificador == ((SinLuz) o).identificador;
    }
 
    @Override
    public int hashCode() {
        return Integer.hashCode(identificador);
    }
 
    
    @Override
    public int compareTo(SinLuz otro) {
        int resultado = nombre.compareToIgnoreCase(otro.nombre);
        if (resultado != 0) {
            return resultado;
        }
        return Integer.compare(identificador, otro.identificador);
    }
 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SinLuz{id=").append(identificador)
          .append(", nombre='").append(nombre).append("', encuentros=[");
        for (Encuentro e : encuentros.values()) {
            sb.append("\n    ").append(e);
        }
        if (!encuentros.isEmpty()) sb.append("\n  ");
        return sb.append("]}").toString();
    }
}