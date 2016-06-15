package Abstracciones;
import javax.swing.JOptionPane;
import Implementaciones.FormaContacto;
/**
 *  Clase que representa la unidad de extension
 *  de la facultad de ingenieria.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class UnidadExtensionFI extends Dependencia {
/**
 * Constructor parametrico. 
 * @param formaContacto
 */
public UnidadExtensionFI(FormaContacto formaContacto) {
	super(formaContacto);
	nombre = "Unidad de Extensión - UEFI";
	facultad = "Facultad de Ingenieria";
	nomPersonaEncargada = "Paola Arias Zulma Betancourt";
	correoElectronico = "vmedina@udistrital.edu.co -" 
	+"unidad-extension-ing@udistrital.edu.co";
	telefono = "323 93 00 Ext. 1711 -1709";
	direccion = "Cra 8 No. 40 - 78 Sede Central Piso 3";
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