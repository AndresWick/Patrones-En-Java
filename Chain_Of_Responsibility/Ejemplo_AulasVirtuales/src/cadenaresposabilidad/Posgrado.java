package cadenaresposabilidad;

/**
 * Clase encargada de clasificar los cursos de posgrado
 *
 * @author Daniel
 */
public class Posgrado extends NivelEstudio {

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
        if ("Posgrado".equals(clasificador)) {
            System.out.println("Es un posgrado");
        } else {
            siguiente.Clasificar(clasificador);
        }
    }

}
