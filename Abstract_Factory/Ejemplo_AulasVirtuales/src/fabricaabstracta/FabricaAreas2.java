package fabricaabstracta;
/**
 *  Clase Fabrica que establece el area
 *  matematica como calculo y establece el area
 *  administratica como area directiva. 
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class FabricaAreas2 extends FabricaAreas {
	@Override
    public AreaMatematica crearAreaMatematica() {
        return this.areaMatematica = new AreaCalculo();
    }
	@Override
    public AreaAdministrativa crearAreaAdministriva() {
        return this.areaAdministrativa = new AreaDirectiva();
    }
}


