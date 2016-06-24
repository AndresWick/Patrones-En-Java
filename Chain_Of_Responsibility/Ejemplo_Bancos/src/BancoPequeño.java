
public class BancoPequeño extends Banco{
	private Banco bancoMediano;

	@Override
	public boolean realiarPrestamo(int valorPrestamo) {
		if(valorPrestamo <= rangoPrestamo){
			return true;
		}else{
			return bancoMediano.realiarPrestamo(valorPrestamo);
		}	
	}
	
	public BancoPequeño(Banco bancoMediano){
		rangoPrestamo = 1000000;
		this.bancoMediano = bancoMediano;
	}

}
