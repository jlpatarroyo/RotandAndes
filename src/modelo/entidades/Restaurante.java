package modelo.entidades;

/**
 * Clase que modela un restaurante
 */
public class Restaurante extends BaseEntity{
	
	/**
	 * Atributo que modela el nombre del restaurante
	 */
	private String nombre;
	
	/**
	 * Atributo que modela la especialidad del restaurante
	 */
	private Especialidad especialidad;
	
	/**
	 * Atributo que modela el representante del restaurante
	 */
	private Persona representante;
	
	/**
	 * Atributo que modela la url del restaurante
	 */
	private String urlWeb;
	
	/**
	 * Getter del atributo nombre
	 * @return nombre del restaurante
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Setter del atributo nombre
	 * @param nombre nuevo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Getter del atributo especialidad
	 * @return especialidad del restaurante
	 */
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	
	/**
	 * Setter del atributo especialidad
	 * @param especialidad especialidad del restaurante
	 */
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	/**
	 * Getter del atributo representante
	 * @return representante del restaurante
	 */
	public Persona getRepresentante() {
		return representante;
	}
	
	/**
	 * Setter del atributo representante
	 * @param representante representante del restaurante
	 */
	public void setRepresentante(Persona representante) {
		this.representante = representante;
	}
	
	/**
	 * Getter del atributo urlWeb
	 * @return url del restaurante
	 */
	public String getUrlWeb() {
		return urlWeb;
	}
	
	/**
	 * Setter del atributo urlWeb
	 * @param urlWeb url del restaurante
	 */
	public void setUrlWeb(String urlWeb) {
		this.urlWeb = urlWeb;
	}
	
	

}
