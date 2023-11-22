package br.senac.sp.edd;

public class ArvoreBinariaBusca {

	No raiz;

	public ArvoreBinariaBusca() {
		raiz = null;
	}

	public void inserir(int valor) {
		raiz = inserir(raiz, valor);
	}

	private No inserir(No raiz, int valor) {

		// Se a �rvore ou sub�rvore estiver vazia, cria um novo n� como raiz
		if (raiz == null) {
			raiz = new No(valor);
			return raiz;
		}

		// Verifica se o valor a ser inserido � menor que o valor do n� atual
		if (valor < raiz.valor) {
			
			// Se menor, insere na sub�rvore esquerda
			raiz.esquerda = inserir(raiz.esquerda, valor);
			
		} else if (valor > raiz.valor) {
			
			// Se maior, insere na sub�rvore direita
			raiz.direita = inserir(raiz.direita, valor);
		}
		return raiz;
	}

	public void remover(int valor) {
		raiz = remover(raiz, valor);
	}

	private No remover(No raiz, int valor) {
		if (raiz == null)
			return raiz;

		if (valor < raiz.valor)
			raiz.esquerda = remover(raiz.esquerda, valor);

		else if (valor > raiz.valor)
			raiz.direita = remover(raiz.direita, valor);

		else {

			// Caso base: n� sem filhos ou com apenas um filho
			if (raiz.esquerda == null)
				return raiz.direita;
			else if (raiz.direita == null)
				return raiz.esquerda;

			// Caso do n� com dois filhos: encontrar o sucessor na sub�rvore direita
			raiz.valor = minValor(raiz.direita);
			raiz.direita = remover(raiz.direita, raiz.valor);
		}
		return raiz;
	}

	// Encontra o valor m�nimo na sub�rvore (utilizado para encontrar o sucessor)
	private int minValor(No raiz) {
		int min = raiz.valor;
		while (raiz.esquerda != null) {
			min = raiz.esquerda.valor;
			raiz = raiz.esquerda;
		}
		return min;
	}

	public void emOrdem() {
		emOrdem(raiz);
	}

	private void emOrdem(No raiz) {
		if (raiz != null) {
			emOrdem(raiz.esquerda);
			System.out.print(raiz.valor + " ");
			emOrdem(raiz.direita);
		}
	}

	public void preOrdem() {
		preOrdem(raiz);
		System.out.println();
	}

	private void preOrdem(No raiz) {
		if (raiz != null) {
			System.out.print(raiz.valor + " ");
			preOrdem(raiz.esquerda);
			preOrdem(raiz.direita);
		}
	}

	public void posOrdem() {
		posOrdem(raiz);
		System.out.println();
	}

	public void posOrdem(No raiz) {
		if (raiz != null) {
			posOrdem(raiz.esquerda);
			posOrdem(raiz.direita);
			System.out.print(raiz.valor + " ");
		}
	}
}
