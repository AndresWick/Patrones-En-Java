
public class Prueba_Patron {

	public static void main(String[] args) {

		Banco bancoNacional = new BancoGrande();
		Banco bancoMunicipal = new BancoMediano(bancoNacional);
		Banco bancoLocal = new BancoPequeño(bancoMunicipal);
		
		
		//Supongamos que queremos un prestamo por $45.000.000.00
		bancoLocal.realiarPrestamo(450000000);
		
		String resultado = "El prestamo se ha diligenciado y la respuesta es: ";
		
		if(bancoLocal.realiarPrestamo(450000000)==true){
			resultado+="\nPrestamo Aprobado.";
		}else{
			resultado+="\nPrestamo Denegado.";
		}
		
		
	 System.out.println(resultado);
		
	}

}
