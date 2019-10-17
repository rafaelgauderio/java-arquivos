package application;

import java.io.File;

import java.util.Scanner;
import java.io.IOException;

public class ManipularPastas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho da pasta: ");
		String caminhoPasta = sc.nextLine();

		File caminho = new File(caminhoPasta);
		File[] pastas = caminho.listFiles(File::isDirectory);

		System.out.println("\nPASTAS:\n");

		for (File apelido : pastas) {
			System.out.println(apelido);
		}
		
		
		File [ ] arquivos = caminho.listFiles(File::isFile);
		System.out.println("\nARQUIVOS:\n");
		for(File apelido : arquivos) {
			System.out.println(apelido);
			System.out.println("Nome do arquivo: " +apelido.getName());
			System.out.println("Caminho do arquivo: " + apelido.getParent());
			System.out.println("Caminho completo: " + apelido.getPath());
		}
		
		//criar um subpasta
		boolean sucesso = new File(caminhoPasta + "\\subdiretório").mkdir();
		boolean sucesso2 = new File(caminhoPasta + "\\subdiretório\\novosub").mkdir();
		System.out.println("\nDiretório criado com sucesso: "+sucesso);
		sc.close();

	}

}
