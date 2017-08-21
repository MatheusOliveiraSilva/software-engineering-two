
public class Presidente extends Politico implements GovernaPais{
	

	
	public void governarPais() {
		super.setNome("Dilma");
		super.setPartido("PT");
		super.setNro(13);
		super.setPais("Brasil");
		System.out.println("Presidente: " + super.getNome()
						  + "\n Partido: " + super.getPartido()
						  + "\nNumero: " + super.getNro()
						  + "\nPais: " + super.getPais());

		System.out.println();
		
	}
	

}
