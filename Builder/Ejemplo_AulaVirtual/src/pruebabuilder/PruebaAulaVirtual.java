package pruebabuilder;
import patronbuilder.BuilderAulaVirtual;
import patronbuilder.BuilderUdin;
import patronbuilder.Dise�ador;
/**
 * Clase prueba del patr�n Builder.
 * @author Carlos Aguirre, Daniel Garcia.
 */
public class PruebaAulaVirtual {
    public static void main(String[] args){
    Dise�ador dise�ador = new Dise�ador();
    BuilderAulaVirtual udin = new BuilderUdin();
    dise�ador.setBuilderAulaVirtual(udin);
    dise�ador.SubirAula();
    System.out.println(dise�ador.getAulaVirtual().getNombre());
    System.out.println(dise�ador.getAulaVirtual().getAlto());
    System.out.println(dise�ador.getAulaVirtual().getAncho());
    }
}

