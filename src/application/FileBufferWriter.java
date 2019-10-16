package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferWriter {

	public static void main(String[] args) {

		String[] linhas = new String[] { "Bom dia", "Boa tarde", "Boa noite","Fim do teste","\n\n" };
		

		String caminho = "c:\\temp\\imprime.txt";
		String caminho2 = "c:\\temp\\imprimewhile.txt";
		//argumento true faz não destruir o arquivo, só insere mais dados
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))) {
			for (String line : linhas) {
				bw.write(line);
				bw.newLine();
				
			}
		}			

		catch (IOException erro) {
			System.out.println("Erro: " + erro.getMessage());
		}

	}

}
