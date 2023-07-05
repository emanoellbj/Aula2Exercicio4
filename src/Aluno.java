
public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	
	public Aluno() {
		setNome("Aluno");
		setMatricula("Matrícula");
		setCurso("Curso");
	}
	
	public Aluno(String nome, String matricula, String curso) {
		setNome(nome);
		setMatricula(matricula);
		setCurso(curso);
	}
	
	public void exibeDadosAluno() {
		System.out.println("Dados aluno\n" + "Nome: " + getNome() + "\n" + "Matrícula: " + getMatricula() + "\n" + "Curso: " + getCurso() + "\n");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
