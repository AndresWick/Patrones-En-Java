import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *  Clase que representa la entrada del sistema.
 * @author Carlos
 *
 */
public class Input {
	
	/**
	 *  Tipo de entrada por consola.
	 */
	static final int CONSOLA=0;
	/**
	 *  Tipo de entrada por ventana emergente.
	 */
	static final int GRAFICA=1;
	/**
	 *  Tipo de entrada por red.
	 */
	static final int RED=2;
	/**
	 *  Tipo de entrada por un archivo.
	 */
    static final int EQUIPO=3;
    /**
     *  Guarda el tipo de entrada.
     */
	private int typeInput;
	/**
	 * Guarda el texto de la entrada.
	 */
	private String textInput;

	
	
	
	/**
	 *  Metodo que retorna el tipo de entrada.
	 * @return : typeInput.
	 */
	public int getTypeInput() {
		return this.typeInput;
	}

	/**
	 *  Metodo encargado de redefinir el tipo de entrada.
	 * @param tipoDeEntrada : nuevo tipo de entrada.
	 */
	public void setTypeInput(int tipoDeEntrada) {
		this.typeInput = tipoDeEntrada;
	}

	/**
	 * Metodo encargado de retornar el texto de salida.
	 * @return : textInput.
	 */
	public String getTextInput() {
		return this.textInput;
	}

	/**
	 *  Metodo encargado de redefinir el texto de la entrada.
	 * @param textoDeEntrada : nuevo texto de entrada.
	 */
	public void setTextInput(String textoDeEntrada) {
		this.textInput = textoDeEntrada;
	}
	
	/**
	 *  Metodo encargado de capturar el texto de entrada, independientemente
	 *  del tipo de entrada qwue sea.
	 */
	public void capture(){
		if(typeInput==CONSOLA){
			System.out.println ("Por favor introduzca una valor por teclado: ");
		      String entradaTeclado = "";
		        Scanner entradaEscaner = new Scanner (System.in); 
		        entradaTeclado = entradaEscaner.nextLine (); 
		        setTextInput(entradaTeclado);
		}else if(typeInput==GRAFICA){
			String texto=JOptionPane.showInputDialog("Por favor introduzca una valor por ventana: ");
			setTextInput(texto);
		}
		
	}

}
