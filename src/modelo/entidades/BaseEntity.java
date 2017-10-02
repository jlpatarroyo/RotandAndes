package modelo.entidades;

public abstract class BaseEntity {
	
	/**
	 * Id de la entidad
	 */
	private Long id;

	/**
	 * Getter del atributo id
	 * @return id de la entidad
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter del atributo id
	 * @param id id de la entidad
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
