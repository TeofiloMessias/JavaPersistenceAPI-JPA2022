package modelo.umpraum;

@entity
@table(name = "assentos")

public class Assento {
	
	@id
	@generatedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@OneToOne
	private Assento assento;
	public Assento() {
		
	}

	public Assento(String nome) {
		super();
		this.nome = nome;
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


	

}
