import java.util.ArrayList;

public class Turma extends Disciplina {
    private final Integer MAX_VAGAS = 60;

    private Integer id;
    private Integer vagas;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Boolean lotada;


    public Turma(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Professor[] professoresMinistrantes, Sala[] salas, Sala[] labs) {
        super(titulo, codigo, cargaHoraria, descricao, aulasSemana, professoresMinistrantes, salas, labs);
        this.vagas = MAX_VAGAS;
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

    public void decVagas() {
        this.vagas = vagas - 1;

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
        return this.MAX_VAGAS - this.vagas;
    }

    public Integer getId() {
        return this.id;
    }

    public void adicionaAluno(Aluno aluno) {
        if (aluno != null) {
            alunos.add(aluno);
        }
    }


}
