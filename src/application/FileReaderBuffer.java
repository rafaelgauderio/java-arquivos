package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBuffer {

	public static void main(String[] args) {

		String caminho = "c:\\temp\\arquivo.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();

			}

		} catch (IOException erro) {
			System.out.println("Erro: " + erro.getMessage());
			
		} finally {
			try {

				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException erro) {
				erro.printStackTrace();

			}
		}

	}

}
