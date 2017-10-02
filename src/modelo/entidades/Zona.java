package modelo.entidades;

public class Zona extends BaseEntity{
	
	/**
	 * Atributo que modela la capacidad de personas de la zona
	 */
	private Integer capacidadPersonas;
	
	/**
	 * Atributo que modela si la zona cuenta con condiciones especiales
	 */
	private boolean condicionesEspeciales;
	
	/**
	 * Atributo que modela las condiciones técnicas de la zona
	 */
	private String condicionesTecnicas;

	/**
	 * Getter del atributo capacidadPersonas
	 * @return capacidad de personas de la zona
	 */
	public Integer getCapacidadPersonas() {
		return capacidadPersonas;
	}

	/**
	 * Setter del atributo capacidadPersonas
	 * @param capacidadPersonas capacidad de personas de la zona
	 */
	public void setCapacidadPersonas(Integer capacidadPersonas) {
		this.capacidadPersonas = capacidadPersonas;
	}

	/**
	 * Getter del atributo condicionesEspeciales
	 * @return true si es condicionado, false de lo contrario
	 */
	public boolean isCondicionesEspeciales() {
		return condicionesEspeciales;
	}

	/**
	 * Setter del atributo condicionesEspeciales
	 * @param condicionesEspeciales true si es condicionado, false de lo contrario
	 */
	public void setCondicionesEspeciales(boolean condicionesEspeciales) {
		this.condicionesEspeciales = condicionesEspeciales;
	}

	/**
	 * Getter del atributo condicionesTecnicas
	 * @return condiciones técnicas de la zona
	 */
	public String getCondicionesTecnicas() {
		return condicionesTecnicas;
	}

	/**
	 * Setter del atributo condicionesTecnicas
	 * @param condicionesTecnicas condiciones técnicas de la zona
	 */
	public void setCondicionesTecnicas(String condicionesTecnicas) {
		this.condicionesTecnicas = condicionesTecnicas;
	}
	
	
	
	
}
