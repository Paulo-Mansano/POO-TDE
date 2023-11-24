import java.util.ArrayList;

public class Turma extends Disciplina {
    private Integer id;
    private Integer vagas;
    private Integer vagasLocadas;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private Boolean lotada;


    public Turma(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Professor[] professoresMinistrantes, Sala[] salas, Sala[] labs) {
        super(titulo, codigo, cargaHoraria, descricao, aulasSemana, professoresMinistrantes, salas, labs);
        this.vagas = vagas;
        this.lotada = false;

        if (this.alunos.size() >= this.vagas) {
            setLotada();
        }
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public void incVagas() {
        this.vagas += 1;

        if (this.vagas == 0) {
            this.lotada = true;
        }
    }

    public Boolean getLotada() {
        return lotada;
    }

    public void setLotada() {
        this.lotada = true;
    }

    public void setVagas() {
        this.vagas -= 1;
    }

    public Integer getVagasRestantes() {
        return this.vagas - this.vagasLocadas;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = null;
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        if (alunos != null && alunos.size() > 0) {
            return this.alunos;
        }
        return null;
    }

    public void adicionaAluno(Aluno aluno) {
        if (aluno != null) {
            alunos.add(aluno);
        }
    }


}
