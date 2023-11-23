import java.util.Arrays;

public class Sala extends Turma {
    private Integer vagas;
    private Integer numSala;
    private Professor profMinistrante;
    private String[] horarios;
    private Boolean possuiProfessor;

    public Sala(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Professor[] professoresMinistrantes, Sala[] salas, Sala[] labs, Integer vagas, Integer numSala,
            Professor profMinistrante, String[] horarios, Boolean possuiProfessor) {
        super(titulo, codigo, cargaHoraria, descricao, aulasSemana, professoresMinistrantes, salas, labs);
        this.vagas = super.getVagas();
        this.numSala = numSala;
        this.profMinistrante = profMinistrante;
        this.horarios = horarios;
        this.possuiProfessor = possuiProfessor;
    }
    

    
    
    
}
