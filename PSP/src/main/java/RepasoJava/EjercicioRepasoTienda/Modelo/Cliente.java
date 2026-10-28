package RepasoJava.EjercicioRepasoTienda.Modelo;

import java.util.Objects;

public class Cliente {

	private String nombre;
	private String CorreoElectronico;
	private String numTelefono;
	
	
	public Cliente(String nombre, String correoElectronico, String numTelefono) {
		super();
		this.nombre = nombre;
		CorreoElectronico = correoElectronico;
		this.numTelefono = numTelefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreoElectronico() {
		return CorreoElectronico;
	}


	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}


	public String getNumTelefono() {
		return numTelefono;
	}


	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}


	@Override
	public int hashCode() {
		return Objects.hash(CorreoElectronico);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(CorreoElectronico, other.CorreoElectronico);
	}


	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", CorreoElectronico=" + CorreoElectronico + ", numTelefono=" + numTelefono
				+ "]";
	}
	
	
	
	
	
}
