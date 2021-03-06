package empresa;

public class Main {
	public static void main(String args[]) {
		Funcionario fulano = new Pj("Fulano", "96.369.724/0001-86");
		Funcionario cicrano = new Pf("Sicrano", "194.826.111-10");
		Empresa nubank = new Empresa("Nubank");
		
		fulano.setSalario(5000);
		cicrano.setSalario(5000);
		
		Funcionario[] func = {fulano, cicrano};
		nubank.setFuncionarios(func);
		
		for (Funcionario f : nubank.getFuncionarios()) {
			System.out.println("Nome: " + f.getNome() + "," + " salário : " + f.getSalario());
		}
		
		System.out.println('\n');
		
		for (Funcionario f : nubank.getFuncionarios()) {
			System.out.println("Nome: " + f.getNome() + "," + " benefícios :");
			for (String beneficio : f.getBeneficios()) {
				System.out.println(beneficio);
			}
		}
	}
}
