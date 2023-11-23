import java.util.ArrayList;

public class Curso {
    private String titulo;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String titulo) {
        this.titulo = titulo;
        this.alunos = null;
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
        if (aluno != null) {
            alunos.add(aluno);
        }
    }

    


}
