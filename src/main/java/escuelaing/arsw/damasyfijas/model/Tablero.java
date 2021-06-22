package escuelaing.arsw.damasyfijas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 * Entidad que genera mi tabla tablero 
 * @author Jose María Castro Ortega
 *
 */
public class Tablero {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTablero;
	
	private int numero;
	
	private int picas;
	
	private int famas;
	
	/**
	 * Muestra el número de famas
	 * @return famas
	 */
	public int getFamas() {
		return famas;
	}

	/**
	 * Cambia el valor de famas
	 * @param famas que es el número de famas a editar
	 */
	public void setFamas(int famas) {
		this.famas = famas;
	}

	/**
	 * Muestra el número a jugar
	 * @return numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Cambia el valor de numero
	 * @param numero que es el número a editar
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Muestra el número id de cada fila
	 * @return idTablero
	 */
	public Integer getIdTablero() {
		return idTablero;
	}

	/**
	 * Cambia el valor del id del tablero
	 * @param idTablero que es valor a cambiar
	 */
	public void setIdTablero(int idTablero) {
		this.idTablero = idTablero;
	}

	

	/**
	 * Muestra la cantidad de picas 
	 * @return picas 
	 */
	public int getPicas() {
		return picas;
	}

	/**
	 * Cambia el valor de picas 
	 * @param picas
	 */
	public void setPicas(int picas) {
		this.picas = picas;
	}

	
	
	

}
