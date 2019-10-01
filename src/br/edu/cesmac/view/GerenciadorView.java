package br.edu.cesmac.view;

import java.io.IOException;
import java.util.Scanner;

public class GerenciadorView {
	Scanner opcao = new Scanner(System.in);

	public int montarMenuPrincipal() throws IOException {
		System.out.println("==== MENU PRINCIPAL ====");
		System.out.println("Escolha a sua opção");
		System.out.println("1 - Editorias");
		System.out.println("2 - Jornalistas");
		System.out.println("3 - Notícias");
		System.out.println("4 - Sair");
		System.out.println("Informe a sua opção: ");

		return opcao.nextInt();
	}

	public int montarMenuEditoria() throws IOException {
		System.out.println("==== EDITORIAS ====");
		System.out.println("Escolha a sua opção");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Alterar");
		System.out.println("3 - Excluir");
		System.out.println("4 - Listar");
		System.out.println("5 - Sair");
		System.out.println("Informe a sua opção: ");

		return opcao.nextInt();
	}

}
