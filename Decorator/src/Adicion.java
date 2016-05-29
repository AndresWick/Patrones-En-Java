
public class Adicion extends Comida{
	
    protected Comida comida;

	
	public Adicion(Comida comida){
		this.comida = comida;
	}
	
	
	public String getDescripcion(){
		return comida.getDescripcion();
	}

	public int getPrecio(){
		return comida.getPrecio();
	}
}
