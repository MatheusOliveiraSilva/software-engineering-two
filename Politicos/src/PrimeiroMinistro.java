
public class PrimeiroMinistro extends Politico implements GovernaPais{
	

	
	public void governarPais() {
		super.setNome("Tony Blair");
		super.setPartido("PT");
		super.setNro(13);
		super.setPais("Inglaterra");
		System.out.println("Primeiro ministro: " + super.getNome()
						  + "\n Partido: " + super.getPartido()
						  + "\nNumero: " + super.getNro()
						  + "\nPais: " + super.getPais());

		System.out.println();
		
	}
	

}
