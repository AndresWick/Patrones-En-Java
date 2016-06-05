package Implementaciones;
public abstract class FormaContacto {

	protected String tipoContacto;
	
	public FormaContacto(){
		tipoContacto = null;
	}
	
	public abstract void contactar();

	public String getTipoContacto() {
		return tipoContacto;
	}

	
}