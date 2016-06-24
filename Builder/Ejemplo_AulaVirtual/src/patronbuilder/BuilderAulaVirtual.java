package patronbuilder;
/**
 *  Clase encargada de construir el aula virtual de UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public abstract class BuilderAulaVirtual {
/*** Aula virtual que se creará */
    protected AulaVirtual aulavirtual;
/**
 * Metodo para instanciar el aula virtual.
 */
    public void CrearAulaVirtual() {
        aulavirtual = new AulaVirtual();
    }
/**
 *  MEtodo para retornar el aula virtual.
 * @return
 */
    public AulaVirtual getAulaVirtual() {
        return aulavirtual;
    }
/**
 *  Constructor del nombre del aula.
 */
    public abstract void buildNombre();
    /**
     *  Constructor del alto del aula.
     */
    public abstract void buildAltura();
    /**
     *  Constructor del ancho del aula.
     */
    public abstract void buildAncho();
    /**
     *  Constructor de la pagina de inicio del aula.
     */
    public abstract void buildPaginaInicio();
    /**
     *  Constructor de la pagina de inicio del aula.
     */

    public abstract void BuildPaginaLogin();
    /**
     *  Constructor de la pagina de usuario del aula.
     */
    public abstract void BuildPaginaUsuario();
    /**
     *  Constructor de la pagina de cursos del aula.
     */
    public abstract void BuildPaginaCursos();
}

