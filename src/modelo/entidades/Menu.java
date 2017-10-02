package modelo.entidades;

import java.util.List;

public class Menu extends BaseEntity{
	
	/**
	 * Atributo que modela el nombre del men�
	 */
	private String nombre;
	
	/**
	 * Atributo que modela el costo del men�
	 */
	private Double costo;
	
	/**
	 * Atributo que modela el precio del men�
	 */
	private Double precio;
	
	/**
	 * Atributo que modela el tiempo de preparaci�n del men�
	 */
	private Integer tiempoPreparacion;
	
	/**
	 * Atributo que modela la descripci�n del men�
	 */
	private String descripcion;
	
	/**
	 * Atributo que modela la traducci�n de la descripci�n del men�
	 */
	private String traduccionDescripcion;
	
	/**
	 * Atributo que modela los productos del men�
	 */
	private List<Producto> productos;

	/**
	 * Getter del atributo nombre
	 * @return nombre del men�
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
	 * @return costo del men�
	 */
	public Double getCosto() {
		return costo;
	}

	/**
	 * Setter del atributo costo
	 * @param costo costo del men�
	 */
	public void setCosto(Double costo) {
		this.costo = costo;
	}

	/**
	 * Getter del atributo precio
	 * @return precio del men�
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * Setter del atributo precio
	 * @param precio precio del men�
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * Getter del atributo tiempoPreparacion
	 * @return tiempo de preparaci�n del men�
	 */
	public Integer getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	/**
	 * Setter del atributo tiempoPreparacion
	 * @param tiempoPreparacion tiempo de preparacion del men�
	 */
	public void setTiempoPreparacion(Integer tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	/**
	 * Getter del atributo descripcion
	 * @return descripci�n del men�
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Setter del atributo descripcion
	 * @param descripcion descripci�n del men�
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Getter del atributo traduccionDescripcion
	 * @return traducci�n de la descripci�n del men�
	 */
	public String getTraduccionDescripcion() {
		return traduccionDescripcion;
	}

	/**
	 * Setter del atributo traduccionDescripcion
	 * @param traduccionDescripcion traducci�n de la descripci�n del men�
	 */
	public void setTraduccionDescripcion(String traduccionDescripcion) {
		this.traduccionDescripcion = traduccionDescripcion;
	}

	/**
	 * Getter del atributo productos
	 * @return productos del men�
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * Setter del atributo productos
	 * @param productos productos del men�
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	

}
