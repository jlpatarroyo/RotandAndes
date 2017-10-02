package modelo.entidades;

import java.util.Date;
import java.util.List;

public class Pedido extends BaseEntity{
	
	/**
	 * Atributo que modela el restaurante del pedido
	 */
	private Restaurante restaurante;
	
	/**
	 * Atributo que modela el usuario que realizó el pedido
	 */
	private UsuarioEntity usuario;
	
	/**
	 * Atributo que modela los productos del pedido
	 */
	private List<Producto> productos;
	
	/**
	 * Atributo que modela los menús del pedido
	 */
	private List<Menu> menus;
	
	/**
	 * Atributo que modela la fecha del pedido
	 */
	private Date fecha;

	/**
	 * Getter del atributo restaurante
	 * @return restaurante del pedido
	 */
	public Restaurante getRestaurante() {
		return restaurante;
	}

	/**
	 * Setter del restaurante del pedido
	 * @param restaurante restaurante del pedido
	 */
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	/**
	 * Getter del atributo usuario
	 * @return usuario del pedido
	 */
	public UsuarioEntity getUsuario() {
		return usuario;
	}

	/**
	 * Setter del atributo usuario
	 * @param usuario usuario del pedido
	 */
	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

	/**
	 * Getter del atributo productos
	 * @return productos del pedido
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * Setter del atributo productos
	 * @param productos productos del pedido
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	/**
	 * Getter del atributo menus
	 * @return menus del pedido
	 */
	public List<Menu> getMenus() {
		return menus;
	}

	/**
	 * Setter del atributo menus
	 * @param menus menus del pedido
	 */
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	/**
	 * Getter del atributo fecha
	 * @return fecha del pedido
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * Setter del atributo fecha
	 * @param fecha fecha del pedido
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
