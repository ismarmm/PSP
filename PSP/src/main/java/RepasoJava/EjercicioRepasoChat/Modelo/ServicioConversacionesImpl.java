package RepasoJava.EjercicioRepasoChat.Modelo;

import java.time.LocalDate;
import java.util.List;

import RepasoJava.EjercicioRepasoChat.Excepciones.ConversacionException;
import RepasoJava.EjercicioRepasoChat.Repositorio.RepositorioConversaciones;

public class ServicioConversacionesImpl {

    private RepositorioConversaciones repositorioConversaciones;

    public ServicioConversacionesImpl() {
        this.repositorioConversaciones = new RepositorioConversaciones();
    }

    public boolean registraNuevaConveracion(TipoAgente tipo, String pregunta, String respuesta) {
        if (tipo == null || pregunta == null || pregunta.isBlank() || respuesta == null || respuesta.isBlank()) {
            return false;
        }
        repositorioConversaciones.agregaConversacion(tipo, pregunta, respuesta);
        return true;
    }

    public Conversacion getRecuperaConversacion(TipoAgente tipo, String pregunta, LocalDate fecha) {
        try {
            return repositorioConversaciones.getConversacion(fecha, tipo, pregunta);
        } catch (ConversacionException e) {
            return null;
        }
    }

   
    public boolean eliminaConversacion(LocalDate fecha, TipoAgente tipo, String pregunta) {
        try {
            repositorioConversaciones.eliminaConversacion(fecha, tipo, pregunta);
            return true;
        } catch (ConversacionException e) {
            return false;
        }
    }

    public boolean incrementaNumeroValoraciones(LocalDate fecha, TipoAgente tipo, String pregunta) {
        try {
            repositorioConversaciones.incrementaNumeroValoraciones(fecha, tipo, pregunta, 1);
            return true;
        } catch (ConversacionException e) {
            return false;
        }
    }

    public double getValoracionMediaParaHumanos() {
        return calculaValoracionMedia(TipoAgente.HUMANO);
    }

    public double getValoracionMedidaParaBots() {
        return calculaValoracionMedia(TipoAgente.IA);
    }

    private double calculaValoracionMedia(TipoAgente tipo) {
        List<Conversacion> todas = repositorioConversaciones.getConversaciones();
        double suma = 0;
        int contador = 0;
        for (Conversacion c : todas) {
            if (c.getTipo() == tipo) {
                suma += c.getNumValoracionesPositivas();
                contador++;
            }
        }
        return contador == 0 ? 0.0 : suma / contador;
    }
}