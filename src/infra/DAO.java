package infra;

import java.util.List;

public class DAO <E>{
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	static {
		try {
			emf = Persistence
					.createEntityManagerFactory("exercicios-jpa");
		}catch{(Execption e){
			//logar -> log4j
		}
		}
			
		public DAO() {
			this(null);
		}
		public DAO(Class<E> classe) {
			this.classe = classe;
			em = emf.createEntityManager();
		}
		
		public DAO<E> abrirTransacao(){
			em.getTransaction().begin();
		}
		public DAO<E> fecharTransacao(){
			em.getTransaction().commit();
		}			
		public DAO<E> incluirTransacao(){
			em.persist(entidade);
			return this;
		}
		public DAO<E> incluirAtomico(){
			return this.abrirTransacao().incluirTransacao().fecharTransacao();
		}
		
		public E obterPorID(Object id) {
			return em.find(classe, id);
		}
		
		public List<E> obterTodos(){
			return this.obterTodos(10,0);
		}
		public List<E> obterTodos(int qtde, int deslocamento){
			if(class == null) {
				throw new UnsupportedOperationException("Classe nula.");
			}
			String jpql = "select e from " + classe.getName() + "e";
			TypedQuery<E> query = em.createQuery(jpql, classe);
			query.setMaxResults(qtde);
			query.setFirstResult(deslocamento);
			return query.getResultList();
		}
		public void fechar() {
			em.close();
		}
	}

}
