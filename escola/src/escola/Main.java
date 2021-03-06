package escola;

public class Main {
	public static void main(String args[]) {
		Professor jesiel = new Professor("Jesiel");
		Disciplina topicosEscpeciais = new Disciplina("Tópicos Especiais", 68, jesiel);
		Disciplina[] adsDisciplinas = {topicosEscpeciais};
		Curso ads = new Curso("ADS", adsDisciplinas);
		
		System.out.println("Disciplina: " + ads.getDisciplinas()[0].getNome() +
				"\nProfessor: " + ads.getDisciplinas()[0].getProfessor().getNome() + "\n");
		
		Disciplina algoritmo = new Disciplina("Algoritmo", 68, jesiel);
		Disciplina bancoDados = new Disciplina("Banco de Dados", 68, jesiel);
		ads.adicionaDisciplina(algoritmo);
		ads.adicionaDisciplina(bancoDados);
		
		for (Disciplina d : ads.getDisciplinas()) {
			System.out.println(d.getNome());
		}
		
		ads.removeDisciplina(algoritmo);
		System.out.println("");
		for (Disciplina d : ads.getDisciplinas()) {
			System.out.println(d.getNome());
		}
	}
}
