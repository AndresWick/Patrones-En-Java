package patronbuilder;
/**
 *  Clase que construye como tal un aula UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class Diseñador {
 /**
 * Constructor del aula virtual.
 */
 private BuilderAulaVirtual builderaulavirtual;
	/**
	 *  Constructor parametrico.
	 * @param builderaulavirtual
	 */
	public void setBuilderAulaVirtual(BuilderAulaVirtual builderaulavirtual) {
		builderaulavirtual=builderaulavirtual;
	}
/**
 * Metodo que construye la pagina parte por parte.
 */
	public void SubirAula() {
	builderaulavirtual.buildNombre();
    builderaulavirtual.buildAltura();
    builderaulavirtual.buildAncho();
    builderaulavirtual.buildPaginaInicio();
    builderaulavirtual.BuildPaginaLogin();
    builderaulavirtual.BuildPaginaUsuario();
    builderaulavirtual.BuildPaginaCursos();
	}
	/**
	 * Retorna el aula virtual.
	 * @return
	 */
     public AulaVirtual getAulaVirtual(){
         return builderaulavirtual.getAulaVirtual();
     }    
}

