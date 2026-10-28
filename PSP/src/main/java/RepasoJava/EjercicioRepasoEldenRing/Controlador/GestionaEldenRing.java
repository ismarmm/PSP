package RepasoJava.EjercicioRepasoEldenRing.Controlador;

import java.time.LocalDate;
import java.util.List;

import RepasoJava.EjercicioRepasoEldenRing.Exception.EldenException;
import RepasoJava.EjercicioRepasoEldenRing.Modelo.*;
import RepasoJava.EjercicioRepasoEldenRing.Repositorio.RepoSinLuz;

public class GestionaEldenRing {

    public static void main(String[] args) {
        RepoSinLuz registro = new RepoSinLuz();

        SinLuz ardyn = new SinLuz("Ardyn");
        SinLuz selene = new SinLuz("Selene");
        SinLuz kael = new SinLuz("Kael");
        registro.agregaSinLuz(ardyn);
        registro.agregaSinLuz(selene);
        registro.agregaSinLuz(kael);

        Encuentro e1 = new Encuentro("Asalto al Bastión Carmesí", LocalDate.of(2025, 3, 10), 8, List.of("Caballero Carmesí", "Tirano de Ceniza"));
        Encuentro e2 = new Encuentro("Emboscada en el Bosque Umbrío", LocalDate.of(2025, 3, 14), 5, List.of("Lobo Siniestro", "Bandido espectral"));
        Encuentro e3 = new Encuentro("Duelo en la Cripta Helada", LocalDate.of(2025, 3, 18), 7, List.of("Espectro del Hielo", "Mago congelado"));
        Encuentro e4 = new Encuentro("Resistencia en la Torre Abandonada", LocalDate.of(2025, 3, 20), 6, List.of("Arquero maldito", "Guardián de piedra"));
        Encuentro e5 = new Encuentro("Invasión en la Villa Marchita", LocalDate.of(2025, 3, 23), 9, List.of("Gigante marchito", "Portador del Plomo"));
        Encuentro e6 = new Encuentro("Caza en el Lago Sombrío", LocalDate.of(2025, 3, 25), 4, List.of("Serpiente negra", "Sombra anfibia"));
        Encuentro e7 = new Encuentro("Asalto final al Nexo del Caos", LocalDate.of(2025, 3, 30), 10, List.of("Señor del Caos", "Centinela oscuro", "Eco ardiente"));

        try {
            registro.agregaEncuentro(e1, ardyn.getIdentificador());
            registro.agregaEncuentro(e2, ardyn.getIdentificador());
            registro.agregaEncuentro(e3, ardyn.getIdentificador());
            registro.agregaEncuentro(e4, selene.getIdentificador());
            registro.agregaEncuentro(e5, selene.getIdentificador());
            registro.agregaEncuentro(e6, kael.getIdentificador());
            registro.agregaEncuentro(e7, kael.getIdentificador());
        } catch (EldenException e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        System.out.println("=== SinLuz del registro (orden alfabético) ===");
        registro.getSinLuces().forEach(System.out::println);

        System.out.println("=== Agregar encuentro a un SinLuz inexistente ===");
        try {
            registro.agregaEncuentro(e1, 99);
        } catch (EldenException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        System.out.println("El programa sigue ejecutándose.");

        System.out.println("=== Actualizar un encuentro existente de Ardyn ===");
        System.out.println("ANTES:\n" + ardyn);
        Encuentro e1Actualizado = new Encuentro("Asalto al Bastión Carmesí", LocalDate.of(2025, 4, 1), 3, List.of("Caballero Carmesí"));
        try {
            registro.agregaEncuentro(e1Actualizado, ardyn.getIdentificador());
        } catch (EldenException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        System.out.println("DESPUÉS:\n" + ardyn);

        System.out.println("\n=== SinLuz con algún encuentro de dificultad > 6 ===");
        registro.getSinLuzConDificultadMayorQue(6).forEach(s -> System.out.println(s.getNombre()));
    }
}
