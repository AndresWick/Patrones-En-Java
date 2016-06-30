package proxy;
/**
 *  Representa un usuario de UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public abstract class Usuario{
    /**
     *  Permite el ingreso del usuario a UDIN.
     */
	public abstract void ingresar();
	/**
	 *  Permite mostrar los datos de usuario en UDIN.
	 */
	public abstract void mostrar();
	/**
	 *  Permite salir con el usuario de UDIN.
	 */
	public abstract void salir();
}
