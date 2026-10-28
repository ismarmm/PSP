package RepasoJava.EjercicioRepasoEldenRing.Repositorio;


import RepasoJava.EjercicioRepasoEldenRing.Exception.EldenException;
import RepasoJava.EjercicioRepasoEldenRing.Modelo.Encuentro;
import RepasoJava.EjercicioRepasoEldenRing.Modelo.SinLuz;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
 
public class RepoSinLuz {
 
    /*
     * JUSTIFICACIÓN: TreeSet<SinLuz> ordenado con el compareTo de SinLuz (por nombre).
     *  - El enunciado exige mantener los SinLuz ordenados alfabéticamente por nombre: TreeSet
     *    mantiene el orden en cada inserción, sin tener que ordenar manualmente.
     *  - Un HashSet/HashMap no garantiza orden; una List habría que reordenarla tras cada alta
     *    y permitiría duplicados.
     *  - Como dos SinLuz pueden llamarse igual, compareTo desempata por identificador; si no,
     *    el TreeSet (que usa compareTo, no equals) descartaría al segundo por "duplicado".
     *  - Contrapartida: buscar por id es O(n), aceptable para un registro de este tamaño.
     */
    private final Set<SinLuz> sinLuces = new TreeSet<>(); // usa SinLuz.compareTo
 
    public void agregaSinLuz(SinLuz sinLuz) {
        sinLuces.add(sinLuz);
    }
 
    public SinLuz getSinLuz(int identificador) throws EldenException {
        for (SinLuz s : sinLuces) {
            if (s.getIdentificador() == identificador) {
                return s;
            }
        }
        throw new EldenException("No existe el SinLuz con el id:" + identificador);
    }
 
    public void agregaEncuentro(Encuentro encuentro, int identificadorSinLuz) throws EldenException {
        getSinLuz(identificadorSinLuz).agregaEncuentro(encuentro);
    }
 
    public List<SinLuz> getSinLuzConDificultadMayorQue(int dificultad) {
        List<SinLuz> resultado = new ArrayList<>();
        for (SinLuz s : sinLuces) { 
            if (s.tieneEncuentroMasDificilQue(dificultad)) {
                resultado.add(s);
            }
        }
        return resultado;
    }
 
    public Set<SinLuz> getSinLuces() {
        return java.util.Collections.unmodifiableSet(sinLuces);
    }
}