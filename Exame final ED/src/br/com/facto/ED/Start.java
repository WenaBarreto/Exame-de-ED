package br.com.facto.ED;
import javax.swing.JOptionPane;

//Classe principal

public class Start {
	static int menu;
	String nome, fone;

	public void menu() {
		Arvore A = new Arvore();
		Agenda C = new Agenda();

		menu = Integer.parseInt(JOptionPane
				.showInputDialog(" Excolha uma das opc�es \n" + " 1-Inserir \n"
						+ " 2- Pesquisar \n" + " 3-Pemover \n"
						+ " 4 Imprimir \n" + " 5 Sair"));

		switch (menu) {
		case 1:
			nome = JOptionPane.showInputDialog(null, "Informe o nome");
			fone = JOptionPane.showInputDialog(null, "Infome o telefone");
			
			C.nome = nome;
			C.telefone = fone;
			A.insere(C);
			

			A.imprimir(A.raiz);

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

	public void menu01() {

		menu = Integer.parseInt(JOptionPane.showInputDialog("1-Arvore \n"
				+ "2-Lista"));
		if (menu == 1) {

			switch (menu) {
			case 1:

				break;
			case 2:

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
		S.menu();
	}

}
