package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		File arquivo = new File("c:\\temp\\deluca.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(arquivo);
			// enquanto houver uma quedra de linha, vai lendo o que tem na próxima linha e
			// imprimindo
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

		}

		catch (IOException erro) {
			System.out.println("Erro" + erro.getMessage());

		}

		finally {
			if (sc != null) {
				sc.close();
			}

		}

	}
}
