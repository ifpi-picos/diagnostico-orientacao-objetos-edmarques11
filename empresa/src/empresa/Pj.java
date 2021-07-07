package empresa;

public class Pj extends Funcionario {
	private String cnpj;

	public Pj(String nome, String cnpj) {
		super.setNome(nome);
		String[] beneficios = {"Plano de saúde", "Vale refeição", "Ferias"};
		super.setBeneficios(beneficios);
		this.cnpj = cnpj;
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() - (super.getSalario() * 0.1);
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
