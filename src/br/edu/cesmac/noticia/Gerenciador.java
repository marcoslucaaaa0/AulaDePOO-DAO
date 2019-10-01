package br.edu.cesmac.noticia;

import java.io.IOException;
import java.util.ArrayList;

import br.edu.cesmac.manipulador.ManipuladorEditoria;
import br.edu.cesmac.model.Editoria;
import br.edu.cesmac.view.EditoriaView;
import br.edu.cesmac.view.GerenciadorView;

public class Gerenciador {

	public static void main(String[] args) throws IOException {
		GerenciadorView gerenciadorView = new GerenciadorView();
		EditoriaView editoriaView = new EditoriaView();

		ManipuladorEditoria manipuladorEditoria = new ManipuladorEditoria();

		int opcaoMenuPrincipal = 0;
		int opcaoSubmenu = 0;

		while (opcaoMenuPrincipal != 4) {
			opcaoMenuPrincipal = gerenciadorView.montarMenuPrincipal();

			if (opcaoMenuPrincipal == 1) {

				while (opcaoSubmenu != 5) {
					opcaoSubmenu = gerenciadorView.montarMenuEditoria();

					if (opcaoSubmenu == 1) {
						manipuladorEditoria.cadastrar(editoriaView.ler());
					} else if (opcaoSubmenu == 2) {
						manipuladorEditoria.alterar(editoriaView.ler());
					} else if (opcaoSubmenu == 4) {
						manipuladorEditoria.listar();
					}
				}
			}
		}

		System.out.println("Fim");
	}

}
