package aula_17;
import java.util.Scanner;

public class aTIVIDADE5 {
	
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n ,soma=0;
        for(int i=1; i<=5 ; i++) {
        	System.out.print("Informe nota" +i + ":");
        	n = ler.nextInt();
        	soma=soma+n;
        	
        }	
        
        double media=soma/5;
        System.out.println("A media é: " + media);
	}
	
}
