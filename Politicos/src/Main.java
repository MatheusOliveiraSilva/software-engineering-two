import javax.swing.JOptionPane;
public class Main   {

	public static void main(String[] args) {
		GovernaPais gov[] = new GovernaPais[2];
		int opc = 0;
		while(opc != 3) {
			opc = Integer.parseInt(JOptionPane.showInputDialog
					("---MENU---"
					+ "\n1 - Quem vota em leis"
					+ "\n2 - Quem governa/representa países"
					+ "\n3 - Sair "));
			switch(opc) {
			case 1: 
					break;
			}
		}
		
		
		
		Presidente p = new Presidente();
	
		
	
		PrimeiroMinistro pm = new PrimeiroMinistro();
		p.governarPais();
		
		pm.governarPais();
	
		System.out.println();
		
		
	}
	
	public static void votaLei() {
		int opc = 0;
		VotaLeis vot[] = new VotaLeis[2];
		while(opc != 3) {
			opc = Integer.parseInt(JOptionPane.showInputDialog
					("---MENU Vota---"
					+ "\n1 - Senador"
					+ "\n2 - Deputado"
					+ "\n3 - Sair "));
			switch(opc) {
			case 1: 
				
					break;
			}
		}
	}


}
