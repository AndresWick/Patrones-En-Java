package cadenaresposabilidad;
/**
 * Clase encargada de clasificar los cursos de doctorado
 *
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class Doctorado extends NivelEstudio{
    /**
     * Metodo que se usa para determinar que clase es la siguiente en la cadena
     *
     * @param nivelestudio
     */
    public void setSiguiente(NivelEstudio nivelestudio){
        siguiente = nivelestudio;
    }
    /**
     * Metodo que retorna el siguiente
     *
     * @return
     */
    public NivelEstudio getSiguiente(){
        return siguiente;
    }
    /**
     * Metodo que clasifica los cursos
     *
     * @param clasificador
     */
    public void Clasificar(String clasificador){
        if ("Doctorado".equals(clasificador)){
            System.out.println("Es un Doctorado");
        } else {
            System.out.println("No se encuentra entre los criterios escogidos para clasificar");
        }
    }
}
