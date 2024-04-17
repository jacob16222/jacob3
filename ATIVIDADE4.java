package aula_17;
import java.util.Scanner;

public class ATIVIDADE4 {

	public class atividade2 {
		
		public static void main(String[] args) {
			Scanner ler = new Scanner ( System.in);
            int n, resultado;

			System.out.print(" informe um numero para tabuada: ");
            n = ler.nextInt();

			for (int i=0; i <= 10 ; i++){
				int resultado = n*i;

			System.out.println(n + "x" + i + "-" + resultado);

			ler.close();
			}
		}
	   
	}
}
