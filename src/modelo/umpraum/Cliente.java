package modelo.umpraum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.id;

import org.hibernate.annotations.CascadeType;

import javax.persistence.Table;

@Entity
@Table(name = "clientes")

public class Cliente {
	
	@id
	@generatedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	//@OneToOne(cascade = {CascadeType.PERSIST})
	@joinColumn(name = "assento_id", unique = true)
	private Assento assento;

	public Cliente() {
		
	}

	public Cliente(String nome, Assento assento) {
		super();
		this.nome = nome;
		this.assento = assento;
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

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}
	
	
	
	

}
