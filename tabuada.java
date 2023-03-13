package curso_progamacao;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite a tabuada que deseja saber: ");
		int N=sc.nextInt();
		
		for (int i=0; i<=N*10; i=i+N) {
			System.out.println("Tabuada: " + i);
			}
		sc.close();
}
}