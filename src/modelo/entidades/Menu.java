package modelo.entidades;

import java.util.List;

public class Menu extends BaseEntity{
	
	/**
	 * Atributo que modela el nombre del menú
	 */
	private String nombre;
	
	/**
	 * Atributo que modela el costo del menú
	 */
	private Double costo;
	
	/**
	 * Atributo que modela el precio del menú
	 */
	private Double precio;
	
	/**
	 * Atributo que modela el tiempo de preparación del menú
	 */
	private Integer tiempoPreparacion;
	
	/**
	 * Atributo que modela la descripción del menú
	 */
	private String descripcion;
	
	/**
	 * Atributo que modela la traducción de la descripción del menú
	 */
	private String traduccionDescripcion;
	
	/**
	 * Atributo que modela los productos del menú
	 */
	private List<Producto> productos;

	/**
	 * Getter del atributo nombre
	 * @return nombre del menú
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter del atributo nombre
	 * @param nombre nombre del atributo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del atributo costo
	 * @return costo del menú
	 */
	public Double getCosto() {
		return costo;
	}

	/**
	 * Setter del atributo costo
	 * @param costo costo del menú
	 */
	public void setCosto(Double costo) {
		this.costo = costo;
	}

	/**
	 * Getter del atributo precio
	 * @return precio del menú
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * Setter del atributo precio
	 * @param precio precio del menú
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * Getter del atributo tiempoPreparacion
	 * @return tiempo de preparación del menú
	 */
	public Integer getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	/**
	 * Setter del atributo tiempoPreparacion
	 * @param tiempoPreparacion tiempo de preparacion del menú
	 */
	public void setTiempoPreparacion(Integer tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	/**
	 * Getter del atributo descripcion
	 * @return descripción del menú
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Setter del atributo descripcion
	 * @param descripcion descripción del menú
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Getter del atributo traduccionDescripcion
	 * @return traducción de la descripción del menú
	 */
	public String getTraduccionDescripcion() {
		return traduccionDescripcion;
	}

	/**
	 * Setter del atributo traduccionDescripcion
	 * @param traduccionDescripcion traducción de la descripción del menú
	 */
	public void setTraduccionDescripcion(String traduccionDescripcion) {
		this.traduccionDescripcion = traduccionDescripcion;
	}

	/**
	 * Getter del atributo productos
	 * @return productos del menú
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * Setter del atributo productos
	 * @param productos productos del menú
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	

}
