package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.UK);
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			Integer valor2 = linhaScanner.nextInt();
			Integer valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			Double valor5 = linhaScanner.nextDouble();
			
			System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			linhaScanner.close();
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
		}
		
		scanner.close();
	}
	
}
