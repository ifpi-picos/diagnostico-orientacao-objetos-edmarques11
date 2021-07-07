package empresa;

public class Pf extends Funcionario {
	private String cpf;
	
	public Pf(String nome, String cpf) {
		super.setNome(nome);
		String[] beneficios = {"Plano de saúde"};
		super.setBeneficios(beneficios);
		this.cpf = cpf;
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() - (super.getSalario() * 0.05);
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
