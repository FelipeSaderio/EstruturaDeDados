package ProgramacaoOrientadaaObjeto;

public class ContaBancaria {
	static String nome = "Felip";
	static float saldo = 54.60f;
	
	public static void main (String[] args) {
		
		atualizarNome("Felipe");
		depositar(10);
	}
	
	static void depositar (float quantidadeDepositada) {
		
		saldo = saldo + quantidadeDepositada;
		
		System.out.println("Seu saldo agora é: " + saldo);
	}
	
	static void atualizarNome(String novoNome) {
		
		nome = novoNome;
		
		System.out.println("Seu novo nome é: " + nome);
	}
}

