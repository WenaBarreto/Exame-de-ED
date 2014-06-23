package br.com.facto.ED;

/**
 * @author Raniel Sousa classe Arvore 
 * */
public class Arvore {
	No raiz;

	public void insere(Agenda contato) {
		No novo = new No();

		novo.C = new Agenda();
		novo.C.nome = contato.nome;
		novo.C.telefone = contato.telefone;
		novo.dir = null;
		novo.esq = null;

		/*
		 * novo.nome = contato.nome; novo.telefone = contato.telefone; novo.dir
		 * = null; novo.esq = null;
		 */
		raiz = inserir(novo, raiz);
	}

	// NÃO ESTA INSERINDO NA ORDEM AFALBETICA NÃO
	public No inserir(No novo, No inicio) {

		if (inicio != null) {
			if (novo.C.nome.equals(inicio.C.nome))// ACHO QUE O "compareTO" deve se
											// ussado aqui para inserir em ondem
			 								// afabeitica
				{
				inicio.esq = inserir(novo, inicio.esq);
			} else {
				inicio.dir = inserir(novo, inicio.dir);
			}
			return inicio;
		} else {
			return novo;
		}

	}

	// NÃO ESTÁ IMPRIMINDO NA ONDEM ALFABETICA
	public void imprimir(No raiz) {

		if (raiz != null) {
			imprimir(raiz.esq);
			System.out.println("Nome:" + " " + raiz.nome + "  " + "Telefone:"
					+ " " + raiz.telefone);
			imprimir(raiz.dir);
		}
	}

	// METODO E PARA TESTE A CLASSE, MAS SERA REMOVIDO DEPOIS
	public static void main(String[] args) {
		No contato;
		Arvore A = new Arvore();
		A.imprimir(A.raiz);

	}
	

}
