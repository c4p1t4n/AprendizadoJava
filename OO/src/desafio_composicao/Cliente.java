package desafio_composicao;

import java.util.List;
import java.util.ArrayList;


public class Cliente {
	String nome;
	List<Compra> listaCompras= new ArrayList<>();
	
	Cliente(String nome,Compra compra){
		this.nome = nome;
		listaCompras.add(compra);				
	}
	Cliente(){
		
	}
	// Funcao para adicionar compra
	void AdicionarCompra(Compra compra){
		listaCompras.add(compra);
	}
	
	// Funcao para obter o calor de todas as compras
	void ObterValorTotal(){
		double valor= 0;
		if(this.listaCompras.size()!= 0) {
			for (Compra items:this.listaCompras) {
				valor += items.ObterValor();
				
			}
			System.out.println("O valor total da compra foi de : "+valor);
			
		}
		else {
			System.out.println("Não existe uma lista de Compras portanto o valor é : ");
		}
		
		
	}
	

}
