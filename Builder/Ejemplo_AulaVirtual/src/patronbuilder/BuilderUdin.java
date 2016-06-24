package patronbuilder;
/**
 *  Clase que implementa los metodos constructores
 *  de BuildAulaVirtual para crear las aulas de
 *  UDIN.
 * @author Carlos Aguirre, Daniel Garcia.
 *
 */
public class BuilderUdin extends BuilderAulaVirtual {
  @Override
  public void buildNombre(){
     aulavirtual.setNombre("udin");
  }
  @Override
  public void buildAltura(){
     aulavirtual.setAlto(120);
   }
   @Override
   public void buildAncho(){
      aulavirtual.setAncho(120);
    }
    @Override
	public void buildPaginaInicio() {
		PaginaInicio pagina=new PaginaInicio();
                pagina.setNombre("inicio");
                pagina.setAlto(120);
                pagina.setAncho(120);
	}
	@Override
	public void BuildPaginaLogin() {
		PaginaLogin pagina=new PaginaLogin();
                pagina.setNombre("Login");
                pagina.setAlto(120);
                pagina.setAncho(120);
	}
	@Override
	public void BuildPaginaUsuario() {
		PaginaUsuario pagina=new PaginaUsuario();
                pagina.setNombre("Usuario");
                pagina.setAlto(120);
                pagina.setAncho(120);
	}
	@Override
	public void BuildPaginaCursos() {
		PaginaCursos pagina=new PaginaCursos();
                pagina.setNombre("Cursos");
                pagina.setAlto(120);
                pagina.setAncho(120);
	}
}