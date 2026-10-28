package RepasoJava.EjercicioRepasoExcepciones.Repositorio;

import java.util.List;

import RepasoJava.EjercicioRepasoExcepciones.Modelo.*;

import java.util.ArrayList;
import RepasoJava.EjercicioRepasoExcepciones.Modelo.*;

public class RepositorioEventos {
	
	private List<Evento> repoEvento;

	public RepositorioEventos() {
		super();
		
		this.repoEvento = new ArrayList<Evento>();
	}
	
	public List<Evento> getListaEvento() {
		return repoEvento;
		
	}
	
	public void setListaEvento(List<Evento> listaEvento) {
		this.repoEvento = listaEvento;
		
	}
}



