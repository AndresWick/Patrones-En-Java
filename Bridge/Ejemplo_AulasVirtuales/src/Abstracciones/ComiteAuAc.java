package Abstracciones;
import javax.swing.JOptionPane;
import Implementaciones.FormaContacto;
/**
 *  Clase que representa el comite de autoevaluacion 
 *  y acreditacion de la facultad de ingenieria.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class ComiteAuAc extends Dependencia {
/**
 *  COnstructor parametrico.
 * @param formaContacto
 */
	public ComiteAuAc(FormaContacto formaContacto) {
		super(formaContacto);
		nombre = "Comit� de Autoevaluaci�n y Acreditaci�n";
		facultad = "Facultad de Ingenieria";
		nomPersonaEncargada = "Coordinadora Alexandra Abuchar Porras";
		correoElectronico = "cafi@udistrital.edu.co";
		telefono = "3239300. Extensi�n 1405";
		direccion = "Torre administrativa Carrera 7 No.40B-53 Piso4. Bogot� D.C";
		}
	/**
	 * Permite consultar la dependencia.
	 */
    public void consultar() {
    	formaContacto.contactar();
		if(formaContacto.getTipoContacto()=="CORREO"){
			JOptionPane.showMessageDialog(null,"EL CONTACTO ES: "
					+"\n"+getCorreoElectronico());
		}else if(formaContacto.getTipoContacto()=="TELEFONO"){
			JOptionPane.showMessageDialog(null,"EL CONTACTO ES: "
					+"\n"+getTelefono());			
		}else if(formaContacto.getTipoContacto()=="DIRECCION"){
			JOptionPane.showMessageDialog(null,"EL CONTACTO ES: "
					+"\n"+getDireccion());			
		}
	}
}