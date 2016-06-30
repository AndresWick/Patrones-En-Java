package proxy;
import javax.swing.JOptionPane;
/**
 * Clase que representa como tal el patr�n Proxy,
 * permite el ingreso de un estudiante a UDIN atravez
 * de esta clase.
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class ProxyEstudiante extends Usuario{
	/**
	 * Usario al que acceder�n.
	 */
   private UsuarioEstudiante estudiante;
   /**
    *  Constructor parametrico.
    * @param nombre
    * @param contrase�a
    */
   public ProxyEstudiante(String nombre, String contrase�a){
	   estudiante = new UsuarioEstudiante(nombre, contrase�a);
   }
   @Override
   public void mostrar(){
		if(estudiante.isEstado() == UsuarioEstudiante.CONECTADO){
	    	estudiante.mostrar();
	    	 }else{
	    			JOptionPane.showMessageDialog(null,
	    			"EL USUARIO NO ESTA CONECTADO.");
	    			 }
   } 
   @Override
   public void salir(){
	   if(estudiante.isEstado() == UsuarioEstudiante.CONECTADO){
	    	estudiante.salir();
	    	 }else{
	    			JOptionPane.showMessageDialog(null,
	    			"EL USUARIO NO ESTA CONECTADO.");
	    			 }
   }
     @Override
     public void ingresar(){
    	estudiante.ingresar();
     }
     /**
      *  Metodo para verificar la contrase�a de ingreso.
      * @param contrase�a
      * @return
      */
     public void solicitudIngreso(String contrase�a){
    	 if(estudiante.getContrase�a()==contrase�a){
 		      ingresar();
 		    	}else{
 		    		JOptionPane.showMessageDialog(null,
 			    			"DATOS ERRONEOS.");	
 		    	}
     }
}
