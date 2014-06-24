package br.com.facto.ED;

import Aula05_Arvores.No;

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
			if (novo.C.nome.equals(inicio.C.nome))// ACHO QUE O "compareTO" deve
													// se
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
			System.out.println("Nome:" + " " + raiz.C.nome + "  " + "Telefone:"
					+ " " + raiz.C.telefone);
			imprimir(raiz.dir);
		}
		
		
		
		
	}
	
	public No remover(No raiz, Agenda contatos)
	{
		if(raiz != null)
		{
			if(contatos.nome.compareTo( raiz.C.nome)) 
			{
				raiz.esq = remover(raiz.esq, contatos.nome);
			}else{
				if(contatos.nome.compareTo(raiz.C.nome) )
				{
					raiz.dir = remover(raiz.dir, contados.nome);
				}else
				{
					if(raiz.esq != null && raiz.dir != null)//Interiores
					{
						raiz.C.nome = encontraMinimo(raiz.dir).contotos.nome;
						raiz.dir = removerMinimo(raiz.dir);
					}else
					{
						if(raiz.esq == null)
						{
							raiz = raiz.dir;
						}else
						{ 
							raiz = raiz.esq;
						}
					}
				}
			}
		}
		return raiz;	
	}
	
	public No encontraMinimo(No raiz)
	{
		if(raiz != null){
			while(raiz.esq != null){
				raiz = raiz.esq;
			}
		}
		return raiz;
	}
	
	public No removerMinimo(No raiz)
	{
		if(raiz == null)
		{
			return null;
		}else{
			if(raiz.esq != null){
				raiz.esq = removerMinimo(raiz.esq);
				return raiz;
			}else{
				return raiz.dir;
			}
		}
	}

	

	// METODO E PARA TESTE A CLASSE, MAS SERA REMOVIDO DEPOIS
	public static void main(String[] args) {
		Agenda C = new Agenda();
		Arvore A = new Arvore();
		
		
		

	}

}
