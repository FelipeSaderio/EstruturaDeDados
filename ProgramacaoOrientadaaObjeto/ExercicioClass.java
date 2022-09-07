package ProgramacaoOrientadaaObjeto;

public class ExercicioClass {

	public static void main(String[] args) {
		
		somar(2, 3);
		
		subtrair(10 , 10.5f);
	
	}
	
	public static void somar(float numero0, float numero1) {
		
		float resultado;
		resultado = numero0 + numero1;
		
		System.out.println(" A soma é " + resultado);
		
	}
	
	
	public static void subtrair (float mari, float biel) {
		
		float total;
		total = mari - biel;
		
		System.out.println("A subitração é " + total);
		
	}
}