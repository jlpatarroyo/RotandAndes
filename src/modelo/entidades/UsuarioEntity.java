package modelo.entidades;

public class UsuarioEntity extends Persona{
	
	/**
	 * Atributo que modela el n�mero de la tarjeta de cr�dito
	 */
	private Long tarjetaCredito;
	
	/**
	 * Atributo que modela el nombre de usuario
	 */
	private String usuario;
	
	/**
	 * Atributo que modela la contrasenha del usuario
	 */
	private String contrasenia;

	/**
	 * Getter del atributo tarjetaCredito
	 * @return n�mero de tarjeta de cr�dito
	 */
	public Long getTarjetaCredito() {
		return tarjetaCredito;
	}

	/**
	 * Setter del atributo tarjetaCredito
	 * @param tarjetaCredito n�mero de tarjeta de cr�dito
	 */
	public void setTarjetaCredito(Long tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	/**
	 * Getter del atributo usuario
	 * @return nombre de usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Setter del atributo usuario
	 * @param usuario nombre de usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Getter del atributo contrasenia
	 * @return contrasenha del usuario
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * Setter del atributo contrasenia
	 * @param contrasenia constrasenia del usuario
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	

}
