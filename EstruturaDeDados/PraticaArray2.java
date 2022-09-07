package EstruturaDeDados;

public class PraticaArray2 {
	/* Criar array com 3 variaveis de números inteiros
	 * A primeira deve ser o número 3
	 * A segundo deve ser o número 5
	 * A terceira deve ser a soma da primeira e da segunda
	 * No final o programa deve printar na tela uma mensagem com a terceira variável do array
	 */

	
	public static void main (String[]args) {
		int [] numeros = new int [3];
		numeros[0] = 3;
		numeros[1] = 5;
		numeros[2] = numeros[0] + numeros[1];
		
		System.out.println(" a soma da variavel é " + numeros[2]) ;
		
				
		
		
	}
	
}
