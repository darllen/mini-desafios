package Atividade1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao6 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int nTestes = 0, experi = 0, cont = 0, qSapo = 0, qCoelho = 0, qRato = 0;
		double porcentC, porcentR, porcentS, total =0;
		String anim;
		DecimalFormat deci = new DecimalFormat("0.00");

		System.out.print("Total de testes realizados: ");
		nTestes = read.nextInt();
		System.out.print("Tendo em vista que: \n C - Coelho \n R - Rato \n S - Sapo \n");
		
		while (cont < nTestes) {
			System.out.println("Informe o animal utilizado: ");
			anim = read.next();
			System.out.println("Quantas vezes " + anim + " foi testado: ");
			experi = read.nextInt();
			if (anim.equalsIgnoreCase("C")) {
				qCoelho = qCoelho + experi;
				//qCoelho += experi;
			} else if (anim.equalsIgnoreCase("R")) {
				qRato = qRato + experi;
			} else if (anim.equalsIgnoreCase("S")) {
				qSapo = qSapo + experi;
			}
			cont++;
		}
		total = qCoelho + qRato + qSapo;
		System.out.printf("Total: %.0f", total + " cobaias");
		System.out.println(" Coelhos: " + qCoelho + "\n Ratos:" + qRato + "\n Sapos:" + qSapo + "\n");
		porcentC = ((qCoelho * 100) / total);
		porcentR = ((qRato * 100) / total);
		porcentS = ((qSapo * 100) / total);
		System.out.println("Percentual de coelhos: " + deci.format(porcentC) + " %");
		System.out.println("Percentual de ratos: " + deci.format(porcentR) + " %");
		System.out.println("Percentual de sapos: " + deci.format(porcentS) + " %");
	}
}
