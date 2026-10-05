package EldenRingMapas.modelo;

import EldenRingMapas.exceptions.EldenException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RegistroEncuentros {
    private Map<String, SinLuz> sinLuces = new TreeMap<>();

    public void agregarSinLuz(SinLuz sinLuz) {
        sinLuces.put(sinLuz.getNombre(), sinLuz);
    }

    public SinLuz getSinLuz(int identificador) throws EldenException {
        SinLuz encontrado = null;
        for (SinLuz sinLuz : sinLuces.values()) {
            if (sinLuz.getIdentificador() == identificador) {
                encontrado = sinLuz;
            }
        }
        if (encontrado == null) {
            throw new EldenException("No existe el SinLuz con el id: " + identificador);
        }
        return encontrado;
    }

    public void agregaEncuentro(Encuentro encuentro, int identificador) throws EldenException {
        SinLuz sinLuz = getSinLuz(identificador);
        sinLuz.agregarEncuentro(encuentro);
    }

    public List<SinLuz> getSinLuzDificultadMayorQue6() {
        List<SinLuz> resultado = new ArrayList<>();
        for (SinLuz sinLuz : sinLuces.values()) {
            if (sinLuz.tieneEncuentroDificil()) {
                resultado.add(sinLuz);
            }
        }
        return resultado;
    }

    public void mostrarRegistro() {
        for (SinLuz sinLuz : sinLuces.values()) {
            System.out.println(sinLuz);
        }
    }
}
