package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		

        // Fluxo de entrada com arquivo
        FileInputStream fis = new FileInputStream("lorem.txt");
        // Convertendo para caracteres
        InputStreamReader isr = new InputStreamReader(fis);

        // Faz a leitura da linha
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();

        System.out.println(linha);

        // Fecha a entrada
        br.close();
		
	}

}
