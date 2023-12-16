package entities;

public class PersonF extends Person{

	private Double gastoSaude;
	
	public PersonF() {
		super();
	}

	public PersonF(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	
	@Override
	public Double Tax() {
		if( rendaAnual < 2000) {
			return rendaAnual * 0.15 - gastoSaude*0.5;
		}
		else {
			return rendaAnual * 0.25 - gastoSaude*0.5;
		}
	}
	
	@Override
	public String taxTag() {
		return nome
				+ ": $ "
				+ String.format("%.2f", Tax());
	}
}
