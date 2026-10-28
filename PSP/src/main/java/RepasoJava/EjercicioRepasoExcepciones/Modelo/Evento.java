package RepasoJava.EjercicioRepasoExcepciones.Modelo;

import java.time.LocalDate;
import java.util.Objects;



import RepasoJava.EjercicioRepasoExcepciones.Exception.CrafterException;

public abstract class Evento {
	
	
	private static int contador = 0;
	private int idUnico;
	private String nombre;
	private LocalDate fecha;
	private int numEntradasVnedidas;
	private int aforoMaximo;
	private Estado estado;
	
	public abstract int calcularCosteBase();
	
	public void modificarEstado(Estado estadoModificar) throws CrafterException {
		
		if(!estado.equals(estadoModificar)) {
		
		setEstado(estadoModificar);
		
		}
		
		else {
			
			throw new CrafterException("No es posible pasar al estado: " + estadoModificar);
			
		}
	}
	
	public int calcularPorcentaje() {
		
		int porcentaje = 0;
		
		if(getNumEntradasVnedidas() <= getAforoMaximo()) {
		
			porcentaje = (getNumEntradasVnedidas() / getAforoMaximo()) * 100;
		
		}
		
		return porcentaje;
	}
	
	public int calcularPorcentaje(int numeroEntradas) {
		
		int porcentaje = 0;
		
		if(numeroEntradas <= getAforoMaximo()) {
		
			porcentaje = (numeroEntradas / getAforoMaximo()) * 100;
		
		}
		
		else {
			
			System.out.println("El numero de entradas supero el aforo permitido");
		}
		
		return porcentaje;
		
	}
	
	public Evento( String nombre, LocalDate fecha, int numEntradasVnedidas, int aforoMaximo, Estado estado) throws CrafterException {
		super();
		contador++;
		this.idUnico = contador;
		this.nombre = nombre;
		this.fecha = fecha;
		this.estado = estado;
		
		if (numEntradasVnedidas <= aforoMaximo && numEntradasVnedidas > aforoMaximo) {
			
			this.numEntradasVnedidas = numEntradasVnedidas;
			this.aforoMaximo = aforoMaximo;
			
		}
		
		else {
			
			throw new CrafterException("Error al crear el evento");
			
		}
		
		this.estado = estado;
	}


	public static int getContador() {
		return contador;
	}


	public static void setContador(int contador) {
		Evento.contador = contador;
	}


	public int getIdUnico() {
		return idUnico;
	}


	public void setIdUnico(int idUnico) {
		this.idUnico = idUnico;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public int getNumEntradasVnedidas() {
		return numEntradasVnedidas;
	}


	public void setNumEntradasVnedidas(int numEntradasVnedidas) {
		this.numEntradasVnedidas = numEntradasVnedidas;
	}


	public int getAforoMaximo() {
		return aforoMaximo;
	}


	public void setAforoMaximo(int aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(idUnico));
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return idUnico == other.idUnico;
	}


	@Override
	public String toString() {
		return "Evento [idUnico=" + idUnico + ", nombre=" + nombre + ", fecha=" + fecha + ", estado=" + estado + "]";
	}
	
}
