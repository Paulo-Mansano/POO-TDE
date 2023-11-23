import java.util.ArrayList;

public class Curso {
    private String titulo;
    private final Integer LIMITE_ALUNOS = 200;
    private Integer alunosVinculados;
    private Integer vagasRestantes;

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

    public Integer getAlunosVinculado() {
        return (alunos.size());
    }
    public Integer getVagasRestantes() {
        return (this.LIMITE_ALUNOS - alunos.size());
    }

    


}
