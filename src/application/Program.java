package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File arquivo = new File("c:\\temp\\arquivo.txt");
		arquivo.exists();
		arquivo.canRead();
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());

			}

		} catch (IOException excecao) {
			System.out.println("Erro" + excecao.getMessage());
		}
		// Fechar o Scanner independende do que acontecer
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
