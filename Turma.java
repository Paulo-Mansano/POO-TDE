import java.util.ArrayList;
import java.util.Arrays;

public class Turma extends Disciplina{
    private final Integer MAX_VAGAS = 60;

    private Integer id;
    private Integer vagas = MAX_VAGAS;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Boolean lotada;
    private Sala[] labs;

    public Turma(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Professor[] professoresMinistrantes, Sala[] salas, Sala[] labs) {
        super(titulo, codigo, cargaHoraria, descricao, aulasSemana, professoresMinistrantes, salas, labs);
        
        this.vagas = vagas;
        this.lotada = false;

        if (this.alunos.size() == this.vagas) {
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

    public Sala[] getLabs() {
        return labs;
    }

    public void setLabs(Sala[] labs) {
        this.labs = labs;
    }
 
    public void setVagas() {
        this.vagas -= 1;
    }

    public Integer getVagasRestantes() {
        return this.vagas - this.MAX_VAGAS;
    }

    public Integer getId() {
        return this.id;
    }

    public void adicionaAluno(Aluno aluno) {
        if (aluno != null) {
            alunos.add(aluno);
        }
    }


    @Override
    public String toString() {
        return "Turma [vagas=" + vagas + ", lotada=" + lotada + ", labs=" + Arrays.toString(labs) + "]";
    }  

    

    
}
