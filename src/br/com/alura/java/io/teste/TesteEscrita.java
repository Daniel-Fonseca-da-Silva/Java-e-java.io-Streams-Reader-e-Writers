package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		

        // Fluxo de entrada com arquivo
        OutputStream os = new FileOutputStream("lorem2.txt");
        // Convertendo para caracteres
        Writer oswr = new OutputStreamWriter(os);
        // Faz a leitura da linha
        BufferedWriter bw = new BufferedWriter(oswr);
        
        bw.write("Algo novo vai nascer aqui!");
        bw.newLine();
        bw.newLine();
        bw.write("Agora estou recordando de input e output da faculdade!");
        bw.newLine();
        // Fecha a entrada
        bw.close();
		
	}

}
