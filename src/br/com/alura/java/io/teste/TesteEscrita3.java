package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {

		PrintWriter ps = new PrintWriter("lorem2.txt");
		
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		ps.println("Já estou cansado de escrever textos!");
        ps.println();
        ps.println("Jogar videogame não compensa mas estudar sim!");
        
        // Fecha a entrada
        ps.close();
		
	}

}
