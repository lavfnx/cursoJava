package logicaDeProgamacao;

public class EstruturaDeDecisao {

	public static void main(String[] args) {
		String nome = "João Roberto";
		int idade = 22;
		char sexo = 'M';
		
		if ( sexo == 'M' && idade < 18 ) {
			System.out.println("Alistamento militar obrigatório!");
		}
		
		else {
			System.out.println("Não está dentro das normas do alistamento.");
		}
		
		System.out.println("___________________________________");
		
		if (sexo == 'M') {
			if (idade >= 18) {
				System.out.println("Alistamento obrigatório!");
			}
			
			else {
				System.out.println("Voc~e não tem a idade necesária.");
			}
		}
		
		else {
			System.out.println("É preciso ser do sexo masculino para se alistar com obrigatóiriedade!");
		}
		// TODO Auto-generated method stub

	}

}
