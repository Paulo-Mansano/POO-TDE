import java.util.Arrays;

import TDEPOO.Professor;
import TDEPOO.Turma;

public class Sala extends Turma {
    private Integer numSala;
    private Professor profMinistrante;
    private String[] horarios;
    private Boolean possuiProfessor;
    
    public Sala(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Object[] professoresMinistrantes, Object[] salas, Object[] labs, Object[] horasSemana, Integer vagas,
            Integer numSala, Professor profMinistrante, String[] horarios) {
        super(titulo, codigo, cargaHoraria, descricao, aulasSemana, professoresMinistrantes, salas, labs, horasSemana,
                vagas);
        this.numSala = numSala;
        this.profMinistrante = profMinistrante;
        this.horarios = horarios;
    }

    public Integer getNumSala() {
        return numSala;
    }

    public void setNumSala(Integer numSala) {
        this.numSala = numSala;
    }

    public Professor getProfMinistrante() {
        return profMinistrante;
    }

    public void setProfMinistrante(Professor profMinistrante) {
        this.profMinistrante = profMinistrante;
    }

    public String[] getHorarios() {
        return horarios;
    }

    public void setHorarios(String[] horarios) {
        this.horarios = horarios;
    }

    @Override
    public String toString() {
        return "Sala [numSala=" + numSala + ", profMinistrante=" + profMinistrante + ", horarios="
                + Arrays.toString(horarios) + ", possuiProfessor=" + possuiProfessor + "]";
    }
    
}
