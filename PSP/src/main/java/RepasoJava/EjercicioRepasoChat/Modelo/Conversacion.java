package RepasoJava.EjercicioRepasoChat.Modelo;

import java.time.LocalDate;


import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Conversacion {

    private String identificador;
    private String pregunta;
    private String respuesta;
    private LocalDate fechaConversacion;
    private int numValoracionesPositivas;
    private TipoAgente tipo;

    public Conversacion(TipoAgente tipo, String pregunta, String respuesta) {
        this.tipo = tipo;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.fechaConversacion = LocalDate.now();
        this.numValoracionesPositivas = 0;
        this.identificador = calculaIdentificador();
    }

    public Conversacion(TipoAgente tipo, String peticion, String respuesta, LocalDate fechaConversacion, int valoracion) {
        this.tipo = tipo;
        this.pregunta = peticion;
        this.respuesta = respuesta;
        this.fechaConversacion = fechaConversacion;
        this.numValoracionesPositivas = valoracion;
        this.identificador = calculaIdentificador();
    }

    public String calculaIdentificador() {
        int numeroAleatorio = new Random().nextInt(100_000);
        return fechaConversacion.toString() + "-" + numeroAleatorio;
    }

    public void incrementaValoracion() {
        this.numValoracionesPositivas++;
    }

    // --- Getters ---

    public String getIdentificador() {
        return identificador;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public LocalDate getFechaConversacion() {
        return fechaConversacion;
    }

    public int getNumValoracionesPositivas() {
        return numValoracionesPositivas;
    }

    public TipoAgente getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Conversacion{" +
                "identificador='" + identificador + '\'' +
                ", tipo=" + tipo +
                ", pregunta='" + pregunta + '\'' +
                ", respuesta='" + respuesta + '\'' +
                ", fechaConversacion=" + fechaConversacion +
                ", numValoracionesPositivas=" + numValoracionesPositivas +
                '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Conversacion other = (Conversacion) obj;
        return Objects.equals(fechaConversacion, other.fechaConversacion) &&
                tipo == other.tipo &&
                Objects.equals(pregunta, other.pregunta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaConversacion, tipo, pregunta);
    }
}


