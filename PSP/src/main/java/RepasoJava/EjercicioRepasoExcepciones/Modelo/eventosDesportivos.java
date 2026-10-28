package RepasoJava.EjercicioRepasoExcepciones.Modelo;

import java.time.LocalDate;
import java.util.Objects;

import RepasoJava.EjercicioRepasoExcepciones.Exception.CrafterException;

public class eventosDesportivos extends Evento {
	
	private boolean esTelevisado;

	public int calcularCosteBase() {
		
		int precio = 0;
		int PrecioEstadio = 0;
		
		if(getAforoMaximo() >= 3000) {
			
			PrecioEstadio = 150000;
		
		}
		
		else {
			
			PrecioEstadio = 75000;
		}
		
		 
		if (esTelevisado) {
			
			precio = PrecioEstadio - 10000;
		}
		
		else {
			 precio = PrecioEstadio;
		}
			
		
		
	return precio;
	
	}
		
	public eventosDesportivos(String nombre, LocalDate fecha, int numEntradasVnedidas, int aforoMaximo,
			Estado estado) throws CrafterException {
		super(nombre, fecha, numEntradasVnedidas, aforoMaximo, estado);
	}

	public eventosDesportivos(String nombre, LocalDate fecha, int numEntradasVnedidas, int aforoMaximo,
			Estado estado, boolean esTelevisado, int capacidadEstadio) throws CrafterException {
		super(nombre, fecha, numEntradasVnedidas, aforoMaximo, estado);
		this.esTelevisado = esTelevisado;
	}

	public boolean getEsTelevisado() {
		return esTelevisado;
	}

	public void setEsTelevisado(boolean esTelevisado) {
		this.esTelevisado = esTelevisado;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(esTelevisado);
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
		eventosDesportivos other = (eventosDesportivos) obj;
		return esTelevisado == other.esTelevisado;
	}

	@Override
	public String toString() {
		return "eventosDesportivos [esTelevisado=" + esTelevisado + ", capacidadEstadio=" + "]";
	}
	
}
