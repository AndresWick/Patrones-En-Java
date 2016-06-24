package cadenaresposabilidad;

/**
 * Clase abstracta utilizada para clasificar
 *
 * @author Daniel
 */
public abstract class NivelEstudio {

    protected NivelEstudio siguiente;

    /**
     * Metodo que se usa para determinar que clase es la siguiente en la cadena
     *
     * @param nivelestudio
     */
    public abstract void setSiguiente(NivelEstudio nivelestudio);

    /**
     * Metodo que retorna el siguiente
     *
     * @return
     */

    public abstract NivelEstudio getSiguiente();

    /**
     * Metodo que clasifica los cursos
     *
     * @param clasificador
     */
    public abstract void Clasificar(String clasificador);

}
