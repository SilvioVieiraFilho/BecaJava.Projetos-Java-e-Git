package Caixa;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {

Scanner usuario = new Scanner(System.in);
   
	
	int valor = usuario.nextInt();
	
	int nota_100 = 100;
	int nota_50 = 50;
	int nota_10 = 10;
	int nota_5 = 5;
	int nota_1 = 1;	
    int Limitedocaixaeletronico;
	
	
	if(valor >= 10 && valor <= 1500) {
		if(nota_100 > 0) {
			nota_100 = valor / 100; 
			valor = valor % 100;   
			System.out.println(nota_100 + " notas de 100");
		} 
		if(nota_50 > 0) {
			nota_50 = valor / 50;
			valor = valor % 50;
			System.out.println(nota_50 + " notas de 50");
		}
		if(nota_10 > 0) {
			nota_10 = valor / 10;
			valor = valor % 10;
			System.out.println(nota_10 + " notas de 10");
		}if(nota_5 > 0) {
			nota_5 = valor / 5;
			valor = valor % 5;
			System.out.println(nota_5 + " notas de 5");
		}if(nota_1 > 0) {
			nota_1 = valor / 1;
			valor = valor % 1;
			System.out.println(nota_1 + " notas de 1");
		}
	}else {
		System.out.println("Não é possível realizar o saque");
	}	








}
}
