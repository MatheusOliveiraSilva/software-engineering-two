
public class Senador extends Politico implements VotaLeis {

	@Override
	public void votaLeis() {
		
		super.setNome("A�cio");
		super.setPartido("PSDB");
		super.setNro(45);
		super.setPais("Brasil");
		System.out.println("Senador: " + super.getNome()
						  + "\n Partido: " + super.getPartido()
						  + "\nNumero: " + super.getNro()
						  + "\nPa�s " + super.getPais());	

		System.out.println();
		
	}

}
