package br.senac.sp.edd;

public class Main {

	public static void main(String[] args) {
        ArvoreBinariaBusca abb = new ArvoreBinariaBusca();

        abb.inserir(10);
        abb.inserir(5);
        abb.inserir(15);
        abb.inserir(7);
        abb.inserir(12);

        System.out.println("�rvore em ordem:");
        abb.emOrdem(); // Sa�da esperada: 5 7 10 12 15

        System.out.println("�rvore em pr�-ordem:");
        abb.preOrdem(); // Sa�da esperada: 10 5 7 15 12

        System.out.println("�rvore em p�s-ordem:");
        abb.posOrdem(); // Sa�da esperada: 7 5 12 15 
    }
	
}
