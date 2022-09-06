package modelo.basico;

import java.util.List;

public class ObterProdutos {
	
	Produto dao = new Produto();
	List<Produto> produtos = dao.obterTodos();
	
	for(Produto produto: produtos) {
		System.out.println("ID: " + produto.getId() + "Nome: " + produto.getNome());
		
		}
	double precoTotal = produtos
			.stream()
			.map(p -> p.getPreco())
			.reduce(0.0, (t,p) -> t + p)
			.doubleValue();
	System.out.println("O valor total é R$" + precoTotal);
	
	dao.fechar();
	}

}
