package RepasoJava.EjercicioRepasoChat.Controlador;

import java.time.LocalDate;

import RepasoJava.EjercicioRepasoChat.Modelo.Conversacion;
import RepasoJava.EjercicioRepasoChat.Modelo.ServicioConversacionesImpl;
import RepasoJava.EjercicioRepasoChat.Modelo.TipoAgente;

public class GestionaPeticionesAChat {

    public static void main(String[] args) {
        ServicioConversacionesImpl servicio = new ServicioConversacionesImpl();

        boolean registrada = servicio.registraNuevaConveracion(
                TipoAgente.HUMANO,
                "¿Cómo cambio mi contraseña?",
                "Ve a Ajustes > Seguridad > Cambiar contraseña");
        System.out.println("¿Conversación registrada? " + registrada);

        LocalDate hoy = LocalDate.now();

        Conversacion recuperada = servicio.getRecuperaConversacion(
                TipoAgente.HUMANO, "¿Cómo cambio mi contraseña?", hoy);
        System.out.println("Conversación recuperada: " + recuperada);

        boolean valorada = servicio.incrementaNumeroValoraciones(
                hoy, TipoAgente.HUMANO, "¿Cómo cambio mi contraseña?");
        System.out.println("¿Valoración incrementada? " + valorada);

        System.out.println("Valoración media humanos: " + servicio.getValoracionMediaParaHumanos());
        System.out.println("Valoración media bots: " + servicio.getValoracionMedidaParaBots());

        boolean eliminada = servicio.eliminaConversacion(
                hoy, TipoAgente.HUMANO, "¿Cómo cambio mi contraseña?");
        System.out.println("¿Conversación eliminada? " + eliminada);

        boolean noEncontrada = servicio.eliminaConversacion(hoy, TipoAgente.IA, "pregunta inventada");
        System.out.println("¿Eliminación de algo inexistente? " + noEncontrada);
    }
}
