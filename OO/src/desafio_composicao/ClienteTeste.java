package desafio_composicao;

public class ClienteTeste {

	public static void main(String[] args) {
			// Cricao do produto
			Produto shampoo = new Produto("Shampoo",10.0);
			// Criacao do item associado ao produto
			Items item1 = new Items(3,shampoo);
			// Criacao do item e do produto ao mesmo tempo
			Items item2 = new Items(5,"Nescau",5.50);
			Items item3 = new Items(5,"Trakinas",2.50 );
			
			Compra compraPaulo = new Compra(item1);			
			compraPaulo.AdicionarItem(item2);
			compraPaulo.AdicionarItem(item3);
			Cliente paulo = new Cliente("Paulo",compraPaulo);
			
			paulo.ObterValorTotal();
			
			item1.diminuirQntd();
			item1.diminuirQntd();
			item1.diminuirQntd();
			Compra compraLuiz = new Compra(item1);		
			item2.adicionarQntd();
			compraLuiz.AdicionarItem(item2);
			compraLuiz.AdicionarItem(item3);
			Cliente luiz = new Cliente();
			luiz.nome = "luiz";
			luiz.AdicionarCompra(compraLuiz);
			
			
			luiz.ObterValorTotal();
			compraLuiz.removerTudo();
			luiz.ObterValorTotal();
			
	}

}

