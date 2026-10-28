package RepasoJava.EjercicioRepasoExcepciones.Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import RepasoJava.EjercicioRepasoExcepciones.Exception.CrafterException;

public class Concierto extends Evento {
	
	private String artistaPrincipal;
	private int numArtistasInvitados = 0;
	private String [] artistasInvitados;
	
	@Override
	public int calcularCosteBase() {
		
		int coste = 5000 + 2000 + (500 * numArtistasInvitados);
		
		return coste;
	}
	
	public Concierto(String nombre, LocalDate fecha, int numEntradasVnedidas, int aforoMaximo,
			Estado estado) throws CrafterException {
		super(nombre, fecha, numEntradasVnedidas, aforoMaximo, estado);
	}

	public Concierto(int idUnico, String nombre, LocalDate fecha, int numEntradasVnedidas, int aforoMaximo,
			Estado estado, String artistaPrincipal, int numArtistasInvitados, String[] artistasInvitados)
			throws CrafterException {
		super(nombre, fecha, numEntradasVnedidas, aforoMaximo, estado);
		this.artistaPrincipal = artistaPrincipal;
		this.numArtistasInvitados = numArtistasInvitados;
		this.artistasInvitados = new String[10];
	}

	public String getArtistaPrincipal() {
		return artistaPrincipal;
	}

	public void setArtistaPrincipal(String artistaPrincipal) {
		this.artistaPrincipal = artistaPrincipal;
	}

	public int getNumArtistasInvitados() {
		return numArtistasInvitados;
	}

	public void setNumArtistasInvitados(int numArtistasInvitados) {
		this.numArtistasInvitados = numArtistasInvitados;
	}

	public String[] getArtistasInvitados() {
		return artistasInvitados;
	}

	public void setArtistasInvitados(String[] artistasInvitados) {
		this.artistasInvitados = artistasInvitados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(artistasInvitados);
		result = prime * result + Objects.hash(artistaPrincipal, numArtistasInvitados);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Concierto other = (Concierto) obj;
		return Objects.equals(artistaPrincipal, other.artistaPrincipal)
				&& Arrays.equals(artistasInvitados, other.artistasInvitados)
				&& numArtistasInvitados == other.numArtistasInvitados;
	}

	@Override
	public String toString() {
		return "Concierto [artistaPrincipal=" + artistaPrincipal + ", numArtistasInvitados=" + numArtistasInvitados
				+ ", artistasInvitados=" + Arrays.toString(artistasInvitados) + "]";
	}
	
	
	
	
}
