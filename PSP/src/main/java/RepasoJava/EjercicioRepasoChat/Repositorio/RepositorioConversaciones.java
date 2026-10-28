package RepasoJava.EjercicioRepasoChat.Repositorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import RepasoJava.EjercicioRepasoChat.Excepciones.ConversacionException;
import RepasoJava.EjercicioRepasoChat.Modelo.*;

public class RepositorioConversaciones {

    private List<Conversacion> conversaciones;

    public RepositorioConversaciones() {
        this.conversaciones = new ArrayList<>();
    }

    public boolean contieneConversacionConversacion(Conversacion conversacion) {
        return conversaciones.contains(conversacion);
    }

    public void agregaConversacion(TipoAgente tipo, String pregunta, String respuesta) {
        conversaciones.add(new Conversacion(tipo, pregunta, respuesta));
    }

    public Conversacion getConversacion(LocalDate fecha, TipoAgente tipo, String pregunta) throws ConversacionException {
        for (Conversacion c : conversaciones) {
            if (c.getFechaConversacion().equals(fecha)&& c.getTipo() == tipo && c.getPregunta().equals(pregunta)) {
                return c;
            }
        }
        throw new ConversacionException("No se ha encontrado ninguna conversación con esos datos");
    }

    public void eliminaConversacion(LocalDate fecha, TipoAgente tipo, String pregunta) throws ConversacionException {
        Conversacion aEliminar = getConversacion(fecha, tipo, pregunta);
        conversaciones.remove(aEliminar);
    }

    
    public void incrementaNumeroValoraciones(LocalDate fecha, TipoAgente tipo, String pregunta, double valoracion) throws ConversacionException {
        Conversacion c = getConversacion(fecha, tipo, pregunta);
        c.incrementaValoracion();
    }

    public List<Conversacion> getConversaciones() {
        return conversaciones;
    }
}
