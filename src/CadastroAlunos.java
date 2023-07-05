
public class CadastroAlunos {
	public static void main(String[] args) {
		Aluno a = new Aluno();
		Aluno b = new Aluno("Maria", "123456", "Java");
		
		a.exibeDadosAluno();
		b.exibeDadosAluno();
	}
}
