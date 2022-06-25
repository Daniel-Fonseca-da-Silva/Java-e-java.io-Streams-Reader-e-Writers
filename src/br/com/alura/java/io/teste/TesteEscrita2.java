package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		

//        OutputStream os = new FileOutputStream("lorem2.txt");
//        Writer oswr = new OutputStreamWriter(os);
//        BufferedWriter bw = new BufferedWriter(oswr);
        
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Muito mais fácil e prático assim!");
		
        bw.write("Algo novo vai nascer aqui!");
//        bw.write(System.lineSeparator());
        bw.newLine();
        bw.newLine();
        bw.write("E continua aqui escrevedo de boa, sextou!");
        // Fecha a entrada
        bw.close();
	}

}
