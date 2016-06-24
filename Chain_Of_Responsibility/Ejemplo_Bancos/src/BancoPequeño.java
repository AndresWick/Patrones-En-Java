
public class BancoPeque�o extends Banco{
	private Banco bancoMediano;

	@Override
	public boolean realiarPrestamo(int valorPrestamo) {
		if(valorPrestamo <= rangoPrestamo){
			return true;
		}else{
			return bancoMediano.realiarPrestamo(valorPrestamo);
		}	
	}
	
	public BancoPeque�o(Banco bancoMediano){
		rangoPrestamo = 1000000;
		this.bancoMediano = bancoMediano;
	}

}
