package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario novousuario = new Usuario("Djalma", "djalma@lanche.com.br");
		
		em.getTransaction().begin();
		em.persist(novousuario);
		em.getTransaction().commit();
		
		System.out.println("O Id gerado foi: " + novousuario.getId());
		em.close();
		emf.close();
		
	}

}
