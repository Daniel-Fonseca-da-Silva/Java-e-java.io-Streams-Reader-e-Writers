package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		

        // Fluxo de entrada com arquivo
        InputStream fis = new FileInputStream("lorem.txt");
        // Convertendo para caracteres
        Reader isr = new InputStreamReader(fis);
        // Faz a leitura da linha
        BufferedReader br = new BufferedReader(isr);
        
        String linha = br.readLine();
        
        while(linha != null) {
        	System.out.println(linha);
        	linha = br.readLine();
        }

        // Fecha a entrada
        br.close();
		
	}

}
