package desafio_composicao;


import java.util.List;

import java.util.ArrayList;

public class Compra {
	// Instanciando um lista 
	List<Items> listaItems= new ArrayList<>();
	
	
	// Construtor  para adicionar o item inicial
	Compra(Items item){
		this.listaItems.add(item);
				
	}
	
	void AdicionarItem(Items item) {
		this.listaItems.add(item);
	}
	
	// Funcao para obter o valor da compra 
	double ObterValor(){
		double soma = 0;
		
		for(Items item:listaItems) {
		
			 soma += (item.produto.preco * item.qntd);
			
		}
		return soma;
	}
	
	
	void removerTudo() {
		this.listaItems.clear();
	}
	
	
}
