package Abstracciones;
import javax.swing.JOptionPane;

import Implementaciones.FormaContacto;

public class SecretariaAcademica extends Dependencia {

	public SecretariaAcademica(FormaContacto formaContacto) {
		super(formaContacto);
		nombre = "Secretaría Académica";
		facultad = "Facultad de Ingenieria";
		nomPersonaEncargada = "N/N";
		correoElectronico = "secing@udistrital.edu.co";
		telefono = "3239300 extensión 1517";
		direccion = "Torre administrativa Carrera 7 No. 40B - 53  Piso 5.  Bogotá D.C";
	
		}

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