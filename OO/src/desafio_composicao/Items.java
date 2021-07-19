package desafio_composicao;

public class Items {
	Integer qntd;
	Produto produto;
	//Instanciar somente o Item com o produto ja criado
	Items(int quantidade,Produto produto){
		qntd = quantidade;
		this.produto = produto;
		
	}
	// Constructor para instanciar o Item e o produto ao mesmo tempo
	Items(int quantidade,String nome,double preco){
		this.qntd=quantidade;
		this.produto = new Produto(nome,preco);
	}
	
	void adicionarQntd() {
		this.qntd+=1;
	}
	void diminuirQntd() {
		
			this.qntd-=1;
		
		
	}
	
	
}
