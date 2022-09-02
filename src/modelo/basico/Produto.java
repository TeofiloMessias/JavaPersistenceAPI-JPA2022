package modelo.basico;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "produtos",schema = "curso_java")
public class Produto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "prod_nome", length = 200, nullable = false)
	private String nome;
	
	@Column(name = "produ_preco", nullable = false, precision = 11, scale = 2)
	private Double preco;
	
	public Produto() {
		
	}

	public Produto(Long id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
