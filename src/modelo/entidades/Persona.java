package modelo.entidades;

import java.util.Date;

/**
 * Clase que modela a una persona
 */
public class Persona extends BaseEntity{
	
	/**
	 * Atributo nombre de la persona
	 */
	private String nombre;
	
	/**
	 * Atributo apellido de la persona
	 */
	private String apellido;
	
	/**
	 * Atributo fecha de nacimiento de la persona
	 */
	private Date fechaNacimiento;
	
	/**
	 * Atributo genero de la persona
	 */
	private char genero;

	/**
	 * Getter del atributo nombre
	 * @return nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del atributo nombre
	 * @param nombre nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del atributo apellido
	 * @return apellido de la persona
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Setter del atributo apellido
	 * @param apellido apellido de la persona
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Getter del atributo fecha de nacimiento
	 * @return fecha de nacimiento de la persona
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Setter del atributo fecha de nacimiento
	 * @param fechaNacimiento fecha de nacimiento de la persona
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Getter del atributo genero
	 * @return género de la persona
	 */
	public char getGenero() {
		return genero;
	}

	/**
	 * Setter del atributo genero
	 * @param genero género de la persona
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	
	
}
