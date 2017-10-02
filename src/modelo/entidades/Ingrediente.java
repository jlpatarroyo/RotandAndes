package modelo.entidades;

public class Ingrediente extends BaseEntity{
	
	/**
	 * Atributo que modela el nombre del ingrediente
	 */
	private String nombre;
	
	/**
	 * Atributo que modela la descripción del ingrediente
	 */
	private String descripcion;
	
	/**
	 * Atributo que modela la traducción de la descripción
	 */
	private String traduccion;

	/**
	 * Getter del atributo nombre
	 * @return nombre del ingrediente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del atributo nombre
	 * @param nombre nombre del ingrediente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del atributo descripcion
	 * @return descripción del ingrediente
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Setter del atributo descripcion
	 * @param descripcion descripción del ingrediente
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Getter del atributo traduccion
	 * @return traducción de la descripción
	 */
	public String getTraduccion() {
		return traduccion;
	}

	/**
	 * Setter del atributo traduccion
	 * @param traduccion traducción de la descripción
	 */
	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}
	
	
}
