package br.com.facto.ED;

/**
 * Classe que manipula a agenda.
 * 
 */
public class ListaEDC {
	No prim;

//Criacao da lista
	public void criar() {
		prim = null;

	}

//Metodo que insere na agenda
	public void inserir(String nome, String fone, int v) {
		No novo = new No();
		novo.valor = v;
		novo.prox = null;
		novo.ant = null;
		
		//Se a lista estiver vazia
		if (prim == null) {
			prim = novo;
		}
		
		//anterior
		if (nome == prim.nome) { // Se menor que o 15.
			novo.prox = prim;
			prim.ant = novo;
			prim = novo;
		}
		
		// Meio
		else {
			No aux = new No();
			aux = prim;
			boolean achou = false;

			while (aux.prox != null && !achou) {
				if (v < aux.prox.valor) { // 9 � menor que 7?
					novo.prox = aux.prox; // O 9 aponta p/ onde o 7 apontava.
					novo.ant = aux; // O ant aponta p/ o 7.
					aux.prox.ant = novo; // o 10 aponta voltando p/ o 9.
					aux.prox = novo; // O 7 aponta p/ 9.
					achou = true; // Acha, para sair.
				} else {
					aux = aux.prox; // Compara com o pr�ximo. '7'
				}
			}
			
			// Maior
			if (!achou) {
				aux.prox = novo; // 15 aponta p/ 30.
				novo.ant = aux; // 30 aponta p/15.
			}
		}
	}

//Metodo que pesquisa por nome
	public void pesquisarNome(String nome) {

		No aux = new No();
		aux = prim;

		if (prim == null) {
			System.out.println("Lista vazia!");
		} else {
			while (aux != null) {
				if (aux.nome == nome) {
					System.out.println("Valor encontrado.");
				}
				aux = aux.prox;
			}
		}
	}

//metodo que pesquisa por telefone
	public void pesquisatelefone() {

	}

//Metodo que imprime os contatos da agenda
	public void imprimir() {

		No aux = new No();
		aux = prim.ant;

		if (prim == null) {
			System.out.println("Lista vazia!");
		}

		while (aux != prim) {
			System.out.println("nome: " + aux.nome + " Telefone:  "
					+ aux.telefone);
			aux = aux.ant;
		}
	}
	
//Metodo de remover da agenda
	public void renomear() {

	}

//Metodo principal
	public static void main(String[] args) {
		ListaEDC L = new ListaEDC();

		L.criar();
		L.inserir("ranieu", "6381107595", 1);
		L.imprimir();

	}

}
