package cadenaresposabilidad;

/**
 * Clase que establece la sucesion dentro del programa
 *
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class Grado extends NivelEstudio {

    /**
     *Metodo que se usa para determinar que clase es la siguiente en la cadena
     * @param nivelestudio
     */
    public void setSiguiente(NivelEstudio nivelestudio) {
        siguiente = nivelestudio;
    }
/**
 * Metodo que retorna el siguiente
 * @return 
 */
    public NivelEstudio getSiguiente() {
        return siguiente;
    }

    /**
     *Metodo que clasifica los cursos
     * @param clasificador
     */
    public void Clasificar(String clasificador) {
        NivelEstudio pregrado = new Pregrado();
        this.setSiguiente(pregrado);
        NivelEstudio posgrado = new Posgrado();
        pregrado.setSiguiente(posgrado);
        NivelEstudio maestria = new Maestria();
        posgrado.setSiguiente(maestria);
        NivelEstudio doctorado = new Doctorado();
        maestria.setSiguiente(doctorado);
        siguiente.Clasificar(clasificador);
    }

}
