package elden_ring_proyecto.src.modelo;
import elden_ring_proyecto.src.exceptions.EldenException;
import java.util.ArrayList;
import java.util.TreeSet;


public class RegistroEncuentros {
    // TreeSet mantiene los SinLuz ordenados alfabeticamente por su nombre
    // y no necesita establecer un limite de elementos.
    private TreeSet<SinLuz> registro;

    public RegistroEncuentros() {
        registro = new TreeSet<SinLuz>();
    }

    public void agregarSinLuz(SinLuz sinLuz) {
        registro.add(sinLuz);
    }

    public SinLuz getSinLuz(int identificador) throws EldenException {
        SinLuz sinLuzEncontrado = null;

        for (SinLuz sinLuz : registro) {
            if (sinLuz.getIdentificador() == identificador) {
                sinLuzEncontrado = sinLuz;
            }
        }

        if (sinLuzEncontrado == null) {
            throw new EldenException("No existe el SinLuz con el id: " + identificador);
        }

        return sinLuzEncontrado;
    }

    public void agregaEncuentro(Encuentro encuentro, int identificador) throws EldenException {
        SinLuz sinLuz = getSinLuz(identificador);
        sinLuz.agregarEncuentro(encuentro);
    }

    public ArrayList<SinLuz> getSinLuzDificultadMayor6() {
        ArrayList<SinLuz> resultado = new ArrayList<SinLuz>();

        for (SinLuz sinLuz : registro) {
            if (sinLuz.tieneEncuentroDificil()) {
                resultado.add(sinLuz);
            }
        }
        return resultado;
    }

    public void mostrarRegistro() {
        for (SinLuz sinLuz : registro) {
            System.out.println(sinLuz);
        }
    }
}
