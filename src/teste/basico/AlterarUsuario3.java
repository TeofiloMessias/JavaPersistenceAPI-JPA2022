package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction();
			
			Usuario usuario = em.find(Usuario.class, 1L);
			//objeto não gerenciado
			em.detach(usuario);
			usuario.setNome("Teofilo");
			
			//so será atualizado o banco se eu fizer um merge
						
			//em.merge(usuario);
			
			em.getTransaction().commit();
			
			em.close();
			emf.close();
	}
}
