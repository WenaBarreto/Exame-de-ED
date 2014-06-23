package br.com.facto.ED;

import javax.swing.JOptionPane;

public class Start {
	static int menu;

	public void menu01() {
		Arvore a = new Arvore();
		a.insere("ranieu", "(63)8110-7595");

		menu = Integer.parseInt(JOptionPane.showInputDialog("1-Arvore \n"
				+ "2-Lista"));
		if (menu == 1) {

			switch (menu) {
			case 1:
				

				break;
			case 2:
				a.imprimir(a.raiz);

				break;

			default:
				break;
			}
		}
		if (menu == 2) {

			menu = Integer.parseInt(JOptionPane
					.showInputDialog(" Excolha uma das opcões \n"
							+ " 1-Inserir \n" + " 2- Pesquisar \n"
							+ " 3-Pemover \n" + " 4 Imprimir \n" + " 5 Sair"));

			switch (menu) {
			case 1:

				break;
			case 2:
				Start s = new Start();
				s.menu02();

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				System.exit(0);
				break;

			default:
				break;
			}

		}

	}

	public void menu02() {

	}

	public static void main(String[] args) {
		Start S = new Start();
		S.menu01();
	}

}
