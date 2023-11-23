import java.util.Arrays;

public class Turma extends Disciplina{
    private Integer id;
    private Integer vagas;
    private Boolean lotada;
    private Sala[] labs;

    public Turma(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Professor[] professoresMinistrantes, Sala[] salas, Sala[] labs, Integer vagas) {
        super(titulo, codigo, cargaHoraria, descricao, aulasSemana, professoresMinistrantes, salas, labs);
        
        this.vagas = vagas;
        this.lotada = false;

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

    public void setLotada(Boolean lotada) {
        this.lotada = lotada;
    }

    public Sala[] getLabs() {
        return labs;
    }

    public void setLabs(Sala[] labs) {
        this.labs = labs;
    }

    @Override
    public String toString() {
        return "Turma [vagas=" + vagas + ", lotada=" + lotada + ", labs=" + Arrays.toString(labs) + "]";
    }  

    

    
}
