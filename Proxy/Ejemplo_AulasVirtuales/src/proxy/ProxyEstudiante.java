package proxy;
import javax.swing.JOptionPane;
/**
 * Clase que representa como tal el patrón Proxy,
 * permite el ingreso de un estudiante a UDIN atravez
 * de esta clase.
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class ProxyEstudiante extends Usuario{
	/**
	 * Usario al que accederán.
	 */
   private UsuarioEstudiante estudiante;
   /**
    *  Constructor parametrico.
    * @param nombre
    * @param contraseña
    */
   public ProxyEstudiante(String nombre, String contraseña){
	   estudiante = new UsuarioEstudiante(nombre, contraseña);
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
      *  Metodo para verificar la contraseña de ingreso.
      * @param contraseña
      * @return
      */
     public void solicitudIngreso(String contraseña){
    	 if(estudiante.getContraseña()==contraseña){
 		      ingresar();
 		    	}else{
 		    		JOptionPane.showMessageDialog(null,
 			    			"DATOS ERRONEOS.");	
 		    	}
     }
}
