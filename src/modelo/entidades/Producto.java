package modelo.entidades;

import java.util.List;

public class Producto extends BaseEntity{

	/**
	 * Atributo que modela el nombre del producto
	 */
	private String nombre;
	
	/**
	 * Atributo que modela el tiempo de preparación del producto
	 */
	private Integer tiempoPreparacion;
	
	/**
	 * Atributo que modela la descripción del producto
	 */
	private String descripcion;
	
	/**
	 * Atributo que modela la traducción de la descripción del producto
	 */
	private String traduccionDescripcion;
	
	/**
	 * Atributo que modela los ingredientes del producto
	 */
	private List<Ingrediente> ingredientes;
	
	/**
	 * Atributo que modela las equivalencias del producto
	 */
	private String equivalencias;
	
	/**
	 * Atributo que modela el restaurante del producto
	 */
	private Restaurante restaurante;
	
	/**
	 * Atributo que modela la cantidad del producto
	 */
	private Integer cantidadDisponible;
	
	/**
	 * Atributo que modela la disponibilidad del producto
	 */
	private boolean disponible;

	/**
	 * Getter del atributo nombre
	 * @return nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del atributo nombre
	 * @param nombre nombre del producto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del atributo tiempoPreparacion
	 * @return tiempo de preparación del producto
	 */
	public Integer getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	/**
	 * Setter del atributo tiempoPreparacion
	 * @param tiempoPreparacion tiempo de preparación del producto
	 */
	public void setTiempoPreparacion(Integer tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	/**
	 * Getter del atributo descripción
	 * @return descripción del producto
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Setter del atributo descripcion
	 * @param descripcion descripción del producto
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Getter del atributo traduccionDescripcion
	 * @return traducción de la descripción del producto
	 */
	public String getTraduccionDescripcion() {
		return traduccionDescripcion;
	}

	/**
	 * Setter del atributo traduccionDescripcion
	 * @param traduccionDescripcion traducción de la descripción del producto
	 */
	public void setTraduccionDescripcion(String traduccionDescripcion) {
		this.traduccionDescripcion = traduccionDescripcion;
	}

	/**
	 * Getter del atributo ingredientes
	 * @return ingredientes del producto
	 */
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	/**
	 * Setter del atributo ingredientes
	 * @param ingredientes ingredientes del producto
	 */
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	/**
	 * Getter del atributo equivalencias
	 * @return equivalencias del producto
	 */
	public String getEquivalencias() {
		return equivalencias;
	}

	/**
	 * Setter del atributo equivalencias
	 * @param equivalencias equivalencias del producto
	 */
	public void setEquivalencias(String equivalencias) {
		this.equivalencias = equivalencias;
	}

	/**
	 * Getter del atributo restaurante
	 * @return restaurante del producto
	 */
	public Restaurante getRestaurante() {
		return restaurante;
	}

	/**
	 * Setter del atributo restaurante
	 * @param restaurante restaurante del producto
	 */
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	/**
	 * Getter del atributo cantidadDisponible
	 * @return cantidad disponible del producto
	 */
	public Integer getCantidadDisponible() {
		return cantidadDisponible;
	}

	/**
	 * Setter del atributo cantidadDisponible
	 * @param cantidadDisponible cantidad disponible del producto
	 */
	public void setCantidadDisponible(Integer cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	/**
	 * Getter del atributo disponible
	 * @return nombre del producto
	 */
	public boolean isDisponible() {
		return disponible;
	}

	/**
	 * Setter del atributo disponible
	 * @param disponible true si está disponible, false de lo contrario
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	
}
