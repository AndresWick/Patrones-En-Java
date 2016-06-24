package cadenaresposabilidad;

/**
 * Clase encargada de clasificar los cursos de maestria
 *
 * @author Daniel
 */
public class Maestria extends NivelEstudio {

    /**
     * Metodo que se usa para determinar que clase es la siguiente en la cadena
     *
     * @param nivelestudio
     */
    public void setSiguiente(NivelEstudio nivelestudio) {
        siguiente = nivelestudio;
    }

    /**
     * Metodo que retorna el siguiente
     *
     * @return
     */

    public NivelEstudio getSiguiente() {
        return siguiente;
    }

    /**
     * Metodo que clasifica los cursos
     *
     * @param clasificador
     */
    public void Clasificar(String clasificador) {
        if ("Maestria".equals(clasificador)) {
            System.out.println("Es una Maestria");
        } else {
            siguiente.Clasificar(clasificador);
        }
    }

}
