import javax.swing.JOptionPane;

import Abstracciones.SecretariaAcademica;
import Abstracciones.ComiteAuAc;
import Abstracciones.Dependencia;
import Abstracciones.UnidadExtensionFI;
import Implementaciones.ContactoCorreo;
import Implementaciones.ContactoTelefono;
import Implementaciones.ContactoDireccion;

public class Prueba_Patron_Bridge {

	public static int preguntarFormaContacto(){
		int i=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la forma de contacto que desee: "
				+"\n"+"0-Contactar por correo"
				+"\n"+"1-Contactar por direccion"
				+"\n"+"2-Contactar por Telefono"
						));
		
		return i;
	}

	public static void mostrarInformeDeContacto(Dependencia dependencia){
		JOptionPane.showMessageDialog(null, "HA SELECCIONADO LA DEPENDENCIA: "
				+"\n"+dependencia.getNombre()
				+"\n"+"Y EL MODO DE CONTACTO: "
				+"\n"+dependencia.getFormaContacto().getTipoContacto());
	}

	
	
	
	
	
	public static void main(String[] args) {
		Dependencia dependencia;
		int opcionDependencia;
		int opcionContacto;
		
		
		opcionDependencia=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la dependencia que desea consultar: "
				+"\n"+"0-Comité de Autoevaluación y Acreditación"
				+"\n"+"1-Secretaría Académica"
				+"\n"+"2-Unidad de Extensión - UEFI"
						));

		switch(opcionDependencia){
		
		case 0: 
			opcionContacto = preguntarFormaContacto();
			    switch(opcionContacto){
			    case 0:
			    	dependencia = new ComiteAuAc(new ContactoCorreo());
			    	 dependencia.consultar();
			   	 mostrarInformeDeContacto(dependencia);
			    	break;
			    case 1:
			    	dependencia = new ComiteAuAc(new ContactoDireccion());
			    	 dependencia.consultar();
			   	 mostrarInformeDeContacto(dependencia);
			    	break;
			    case 2:	
                    dependencia = new ComiteAuAc(new ContactoTelefono());
                    dependencia.consultar();
               	 mostrarInformeDeContacto(dependencia);
			    	break;
			    }
		
		    break;
		case 1:
			opcionContacto = preguntarFormaContacto();
			   switch(opcionContacto){
			    case 0:
			    	dependencia = new SecretariaAcademica(new ContactoCorreo());
			    	 dependencia.consultar();
			    	 mostrarInformeDeContacto(dependencia);
			    	break;
			    case 1:
			    	dependencia = new SecretariaAcademica(new ContactoDireccion());
			    	 dependencia.consultar();
			   	 mostrarInformeDeContacto(dependencia);
			    	break;
			    case 2:	
			    	dependencia = new SecretariaAcademica(new ContactoTelefono());
			    	 dependencia.consultar();
			   	 mostrarInformeDeContacto(dependencia);
			    	break;
			    }
			break;
		case 2:	
			opcionContacto = preguntarFormaContacto();
			   switch(opcionContacto){
			    case 0:
			    	 dependencia = new UnidadExtensionFI(new ContactoCorreo());
			    	 dependencia.consultar();
			    	 mostrarInformeDeContacto(dependencia);
			    	break;
			    case 1:
			    	 dependencia = new UnidadExtensionFI(new ContactoDireccion());
			    	 dependencia.consultar();
			    	 mostrarInformeDeContacto(dependencia);
			    	break;
			    case 2:	
                  dependencia = new UnidadExtensionFI(new ContactoTelefono());
                  dependencia.consultar();
             	 mostrarInformeDeContacto(dependencia);
			    	break;
			    }
			break;
		
		}
		
			
	}

}
