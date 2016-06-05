package Abstracciones;
import javax.swing.JOptionPane;

import Implementaciones.FormaContacto;

public class ComiteAuAc extends Dependencia {

	public ComiteAuAc(FormaContacto formaContacto) {
		super(formaContacto);
		nombre = "Comité de Autoevaluación y Acreditación";
		facultad = "Facultad de Ingenieria";
		nomPersonaEncargada = "Coordinadora Alexandra Abuchar Porras";
		correoElectronico = "cafi@udistrital.edu.co";
		telefono = "3239300. Extensión 1405";
		direccion = "Torre administrativa Carrera 7 No. 40B - 53  Piso 4.  Bogotá D.C";
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