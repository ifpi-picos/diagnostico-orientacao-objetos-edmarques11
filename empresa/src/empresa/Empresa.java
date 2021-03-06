package empresa;

public class Empresa {
	private String nome;
	private Funcionario[] funcionarios = new Funcionario[1];
	
	public Empresa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void removeFuncionario(Funcionario funcionario) {
		Funcionario[] novosFuncionarios = new Funcionario[this.funcionarios.length - 1];
		int contNo = 0;
		for (int i = 0; i < this.funcionarios.length; i++) {
			if (this.funcionarios[i] != funcionario) {
				novosFuncionarios[contNo] = this.funcionarios[i];
				contNo++;
			}
		}
		this.funcionarios = novosFuncionarios;
	}
	
	public void adicionaFuncionario(Funcionario funcionario) {
		if (this.funcionarios[this.funcionarios.length - 1] == null) {
			this.funcionarios[this.funcionarios.length - 1] = funcionario;
		} else {
			Funcionario[] novosFuncionarios = new Funcionario[this.funcionarios.length + 1];
			for (int i = 0; i < this.funcionarios.length; i++) {
				novosFuncionarios[i] = this.funcionarios[i];
			}
			novosFuncionarios[novosFuncionarios.length - 1] = funcionario;
			this.funcionarios = novosFuncionarios;
		}
	}
}
