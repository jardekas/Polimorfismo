package entities;

public class Empresa extends Person{

	private Integer nFuncionario;

	public Empresa() {
		super();
	}
	
	public Empresa(String nome, Double rendaAnual, Integer nFuncionario) {
		super(nome, rendaAnual);
		this.nFuncionario = nFuncionario;
	}

	public Integer getnFuncionario() {
		return nFuncionario;
	}

	public void setnFuncionario(Integer nFuncionario) {
		this.nFuncionario = nFuncionario;
	}

	@Override
	public Double Tax() {
		if (nFuncionario <= 10) {
			return rendaAnual * 0.16;
		}
		else {
			return rendaAnual * 0.14;
		}
	}
	
	@Override
	public String taxTag() {
		return nome
				+ ": $ "
				+ String.format("%.2f", Tax());
	}
	
}
