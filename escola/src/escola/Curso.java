package escola;

public class Curso {
	private String nome;
	private Disciplina[] disciplinas = new Disciplina[1];
	
	public Curso(String nome, Disciplina[] disciplinas) {
		super();
		this.nome = nome;
		this.disciplinas = disciplinas;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void removeDisciplina(Disciplina disciplina) {
		Disciplina[] novasDisciplinas = new Disciplina[this.disciplinas.length - 1];
		int contNo = 0;
		for (int i = 0; i < this.disciplinas.length; i++) {
			if (this.disciplinas[i] != disciplina) {
				novasDisciplinas[contNo] = this.disciplinas[i];
				contNo++;
			}
		}
		this.disciplinas = novasDisciplinas;
	}
	
	public void adicionaDisciplina(Disciplina disciplina) {
		if (this.disciplinas[this.disciplinas.length - 1] == null) {
			this.disciplinas[this.disciplinas.length - 1] = disciplina;
		} else {
			Disciplina[] novasDisciplinas = new Disciplina[this.disciplinas.length + 1];
			for (int i = 0; i < this.disciplinas.length; i++) {
				novasDisciplinas[i] = this.disciplinas[i];
			}
			novasDisciplinas[novasDisciplinas.length - 1] = disciplina;
			this.disciplinas = novasDisciplinas;
		}
	}
}
