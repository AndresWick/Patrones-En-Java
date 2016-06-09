import javax.swing.JOptionPane;

/**
 * Clase que permite el envio, consulta y eliminacion de mensajes en general.
 * Representa el Adaptado del patrón Adapter.
 * @author Carlos
 *
 */
public class Mensaje{
	
	/**
	 * Texto del mensaje.
	 */
	private String texto;
	/**
	 *  Fecha en la que se realizó el mensaje.
	 */
	private String fecha;
	/**
	 *  Hora en la que se realizó el mensaje.
	 */
	private String hora;
	
	
	/**
	 *  Constructor parametrico.
	 */
	public Mensaje(String texto){
		this.texto = texto;
	}
	
	
	/***
	 * Metodo que permite el envio de un mensaje.
	 * @param texto
	 */
	public void enviar(String fecha, String hora){
		JOptionPane.showMessageDialog(null, "Mensaje: "+texto+"\n"+"Fecha: "+fecha+"\n"+"Hora: "+hora+"\n");
	}
	/**
	 *  Metodo que permite consultar el texto del mensaje.
	 * @return
	 */
	public String consultar(){
		return texto;
	}
	/**
	 * Metodo que permite eliminar los datos del mensaje.
	 */
	public void eliminar(){
      this.texto = null;
      this.fecha = null;
      this.hora = null;
	}

}
