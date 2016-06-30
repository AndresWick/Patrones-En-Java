package fabricaabstracta;
/**
 *  Clase fabrica de las areas.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public abstract class FabricaAreas {
/*** Area de matematicas.*/
 protected AreaMatematica areaMatematica;
 /*** Area administrativa.*/
  protected AreaAdministrativa areaAdministrativa;
/**
 *  Metodo encargado de crear el area de matematicas.
 * @return
 */
    public abstract AreaMatematica crearAreaMatematica();
 /**
  *  Metodo encargado de crear el area de administracion.
  * @return
  */
   public abstract AreaAdministrativa crearAreaAdministriva();
}


