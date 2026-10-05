package EldenRingMapas.modelo;

import java.util.LinkedHashMap;
import java.util.Map;

public class SinLuz {
    private static int siguienteId = 1;
    private int identificador;
    private String nombre;
    private Map<String, Encuentro> encuentros;

    public SinLuz(String nombre) {
        this.identificador = siguienteId;
        siguienteId++;
        this.nombre = nombre;
        encuentros = new LinkedHashMap<>();
    }

    public int getIdentificador() {return identificador;}
    public String getNombre() { return nombre; }

    public void agregarEncuentro(Encuentro encuentro) {
        encuentros.put(encuentro.getNombre(), encuentro);
    }

    public boolean tieneEncuentroDificil() {
        boolean encontrado = false;
        for (Encuentro encuentro : encuentros.values()) {
            if (encuentro.getDificultad() > 6) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    @Override
    public boolean equals(Object objeto) {
        boolean iguales = false;
        if (objeto instanceof SinLuz) {
            SinLuz otro = (SinLuz) objeto;
            if (identificador == otro.identificador) {
                iguales = true;
            }
        }
        return iguales;
    }

    @Override
    public int hashCode() { return Integer.hashCode(identificador); }

    @Override
    public String toString() {
        return identificador + " - " + nombre + " - Encuentros: " + encuentros.values();
    }
}
