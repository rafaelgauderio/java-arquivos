package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {

		String caminho = "c:\\temp\\arquivo.txt";
		/*try with resources garante que os recursos serão finalizados ao final do bloco, não
		*precisa usar o .close();
		*/
		try (BufferedReader br= new BufferedReader(new FileReader(caminho))){
			
			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();

			}

		} catch (IOException erro) {
			System.out.println("Erro: " + erro.getMessage());
			
		} 

	}

}
