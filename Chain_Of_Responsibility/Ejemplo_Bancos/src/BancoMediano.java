
public class BancoMediano extends Banco {
     private Banco bancoGrande;
	
	@Override
	public boolean realiarPrestamo(int valorPrestamo) {
		if(valorPrestamo <= rangoPrestamo){
			return true;
		}else{
			return bancoGrande.realiarPrestamo(valorPrestamo);
		}	
	}
	
	public BancoMediano(Banco bancoGrande){
		this.bancoGrande = bancoGrande;
		rangoPrestamo = 20000000;
	}

	
}
