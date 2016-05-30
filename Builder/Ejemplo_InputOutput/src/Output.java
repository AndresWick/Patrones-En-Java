import javax.swing.JOptionPane;

/**
 *  Clase que representa la salida del programa.
 * @author Carlos
 *
 */
public class Output {
	
	/**
	 *  Categoria de tipo de salida por consola.
	 */
	static final int CONSOLA=0;
	/**
	 *  Categoria de tipo de salida por ventana emergente.
	 */
    static final int GRAFICA=1;
    /**
	 *  Categoria de tipo de salida por red.
	 */
    static final int RED=2;
    /**
	 *  Categoria de tipo de salida por un archivo.
	 */
    static final int EQUIPO=3;
    /**
     *  Donde se almacena el tipo de salida.
     */
	private int typeOutput;
	/**
	 *  Donde se almacena el texto de salida.
	 */
	private int textOutput;

	/**
	 *  Metodo que retorna el tipo de salida.
	 * @return : typeOutput.
	 */
	public int getTypeOutput() {
		return this.typeOutput;
	}

	/**
	 * 
	 * @param tipoDeSalida : tipo de salida, ya sea GRAFICA, CONSOLA, ETC.
	 */
	public void setTypeOutput(int tipoDeSalida) {
		this.typeOutput = tipoDeSalida;
	}

	/**
	 *  Metodo que retorna el texto de salida.
	 * @return : textOutput.
	 */
	public int getTextOutput() {
		return this.textOutput;
	}

	/**
	 * 
	 * @param textOutput : texto que mostrará la salida.
	 */
	public void setTextOutput(int textoDeSalida) {
		this.textOutput = textoDeSalida;
	}
	
	/**
	 *  Metodo encargado de arrojar la salida definida al cliente ya sea
	 *  en pantalla o en consola.
	 */
	public void viewOutput(){
		if(typeOutput==CONSOLA){
		System.out.println(textOutput);
		}else if(typeOutput==GRAFICA){
			JOptionPane.showMessageDialog(null,textOutput);
		}else if(typeOutput==RED){
		}else if(typeOutput==EQUIPO){
		}
	}

}
