package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorID(1l);
		System.out.print(cliente.getAssento().getNome());
		
		daoCliente.fechar();
		
		DAO<Cliente> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorID(1L);
		
		
		System.out.print(assento.getCliente().getNome());
		
		daoAssento.fechar();
	}

}
