package escuelaing.arsw.damasyfijas.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
/**
 * Clase que implementa los métodos de la clase ServiceTablero, realiza el cálculo de picas, famas y si es ganador o no
 * @author Jose María Castro Ortega
 *
 */
public class IServiceTablero implements ServiceTablero {
	
	public int famasTotal = 0;
	public String valor = random();
	public boolean ganador = false;
	
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	/**
	 * Calcula el número de picas
	 * @param numero de tipo entero
	 * @return picas que es el número de picas
	 */
	public int calculatePicas(int numero) {
		// TODO Auto-generated method stub
		
		int picas = 0;
		int famas = 0;
		String nuevaCadena = "";
		String nuevaCadena2 = "";
		
		
		String numCadena= Integer.toString(numero);
		for (int x=0;x<numCadena.length();x++) {
			if(numCadena.charAt(x) == valor.charAt(x)  ) {
				picas  = picas+1;
				nuevaCadena = nuevaCadena + '-';
				nuevaCadena2 = nuevaCadena2 + '*';
			}else {
				nuevaCadena = nuevaCadena + valor.charAt(x);
				nuevaCadena2 = nuevaCadena2 + numCadena.charAt(x);
			}
		}
		
		for(int x=0;x<nuevaCadena.length();x++) {
			
			int posicion = nuevaCadena2.indexOf(nuevaCadena.charAt(x));
			
			if(posicion != -1 ) {
				famas++;
			}
		}
		
		
		
		
		
		famasTotal = famas;
		
		if(picas==4) {
			ganador = true;
		}
		return picas;
			  
	}

	/**
	 * Muestra si es ganador o no
	 * @return ganador que es de tipo boolean
	 */
	public boolean isGanador() {
		return ganador;
	}

	/**
	 * Cambia el valor del atributo ganador
	 * @param ganador de tipo boolean
	 */
	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}

	
	/**
	 * Muestra el número de famas
	 * @return famasTotal de tipo entero
	 */
	public int getFamas() {
		return famasTotal;
	}

	/**
	 * Cambia el valor del atributo famas
	 * @param famas de tipo entero
	 */
	public void setFamas(int famas) {
		this.famasTotal = famas;
	}
	
	
	public String random() {
		int index = 0;
		String cadena = "";
		while(index!=4) {
			int random = (int) (Math.random()*8+1);
			cadena = cadena + Integer.toString(random);
			index++;
		}
		return cadena;
	}
	
	
	

	
	

	

}
