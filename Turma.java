package TDEPOO;

public class Turma extends Disciplina{
    private Integer vagas;
    private Boolean lotada;

    public Turma(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Object[] professoresMinistrantes, Object[] salas, Object[] labs, Object[] horasSemana, Integer vagas) {
        super(titulo, codigo, cargaHoraria, descricao, aulasSemana, professoresMinistrantes, salas, labs, horasSemana);
        
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

    

    
}
