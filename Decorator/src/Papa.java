
public class Papa extends Adicion{
	
	public String getDescripcion() {
		return super.getDescripcion()+"Papa\n";
	}

	public int getPrecio() {
		return super.getPrecio()+ 1200;
	}

	/**
	 * 
	 * @param comida
	 */
	public Papa(Comida comida) {
		super(comida);
	}
}
