package entities;

public abstract class Person {
	
	protected String nome;
	protected Double rendaAnual;
	
	public Person() {
		
	}
	
	public Person(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double Tax();

	public String taxTag() {
		return nome
				+ ": $ "
				+ String.format("%.2f", Tax());
	}
}
