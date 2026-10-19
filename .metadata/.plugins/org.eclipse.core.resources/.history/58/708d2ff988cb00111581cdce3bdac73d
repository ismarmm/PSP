package elden_ring_proyecto.src.controlador;
import elden_ring_proyecto.src.exceptions.EldenException;
import elden_ring_proyecto.src.modelo.Encuentro;
import elden_ring_proyecto.src.modelo.RegistroEncuentros;
import elden_ring_proyecto.src.modelo.SinLuz;

import java.time.LocalDate;
import java.util.List;

public class GestionaEncuentrosSinLuz {
    public static void main(String[] args) {
        RegistroEncuentros registro = new RegistroEncuentros();

        SinLuz ardyn = new SinLuz("Ardyn");
        SinLuz selene = new SinLuz("Selene");
        SinLuz kael = new SinLuz("Kael");

        registro.agregarSinLuz(ardyn);
        registro.agregarSinLuz(selene);
        registro.agregarSinLuz(kael);

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
            registro.agregaEncuentro(e3, selene.getIdentificador());
            registro.agregaEncuentro(e4, selene.getIdentificador());
            registro.agregaEncuentro(e5, kael.getIdentificador());
            registro.agregaEncuentro(e6, kael.getIdentificador());
            registro.agregaEncuentro(e7, kael.getIdentificador());
        } catch (EldenException error) {
            System.out.println(error.getMessage());
        }

        System.out.println("--- REGISTRO COMPLETO ---");
        registro.mostrarRegistro();

        try {
            registro.agregaEncuentro(e1, 50);
        } catch (EldenException error) {
            System.out.println("\n" + error.getMessage());
        }

        Encuentro encuentroActualizado = new Encuentro("Asalto al Bastión Carmesí", LocalDate.of(2025, 4, 2), 10, List.of("Caballero Carmesí", "Dragón de Ceniza"));

        System.out.println("\n--- ANTES DE ACTUALIZAR ---");
        System.out.println(ardyn);

        try {
            registro.agregaEncuentro(encuentroActualizado, ardyn.getIdentificador());
        } catch (EldenException error) {
            System.out.println(error.getMessage());
        }

        System.out.println("--- DESPUES DE ACTUALIZAR ---");
        System.out.println(ardyn);

        System.out.println("\n--- SINLUZ CON ENCUENTROS DE DIFICULTAD MAYOR QUE 6 ---");
        for (SinLuz sinLuz : registro.getSinLuzDificultadMayor6()) {
            System.out.println(sinLuz);
        }
    }
}
