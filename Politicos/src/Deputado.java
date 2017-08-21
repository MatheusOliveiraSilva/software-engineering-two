
public class Deputado extends Politico implements VotaLeis {

	@Override
	public void votaLeis() {
		
		super.setNome("Jair Messias Mito Bolsonaro");
		super.setPartido("PSC");
		super.setNro(20);
		super.setPais("Brasil");
		System.out.println("Deputado: " + super.getNome()
						  + "\n Partido: " + super.getPartido()
						  + "\nNumero: " + super.getNro()
						  + "\nPaís " + super.getPais());	

		System.out.println();
		
	}

}
