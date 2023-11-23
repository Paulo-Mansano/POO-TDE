import java.util.ArrayList;

public class Curso {
    private String titulo;
    private final int LIMITE_ALUNOS = 200;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlunos() {
        return alunos.toString();
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionaAluno(Aluno aluno) {
        if (aluno != null && alunos.size() < LIMITE_ALUNOS) {
            alunos.add(aluno);
        } else {
            System.out.println("Limite de alunos atingido. Não foi possível adicionar o aluno.");
        }
    }

    public int getAlunosVinculados() {
        return alunos.size();
    }

    public int getVagasRestantes() {
        return LIMITE_ALUNOS - alunos.size();
    }
    


}
