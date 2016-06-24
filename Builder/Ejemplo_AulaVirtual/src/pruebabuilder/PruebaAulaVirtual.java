package pruebabuilder;
import patronbuilder.BuilderAulaVirtual;
import patronbuilder.BuilderUdin;
import patronbuilder.Diseñador;
/**
 * Clase prueba del patrón Builder.
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class PruebaAulaVirtual {
    public static void main(String[] args){
    Diseñador diseñador = new Diseñador();
    BuilderAulaVirtual udin = new BuilderUdin();
    diseñador.setBuilderAulaVirtual(udin);
    diseñador.SubirAula();
    System.out.println(diseñador.getAulaVirtual().getNombre());
    System.out.println(diseñador.getAulaVirtual().getAlto());
    System.out.println(diseñador.getAulaVirtual().getAncho());
    }
}

