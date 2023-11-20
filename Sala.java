import java.util.Arrays;

public class Sala extends Turma {
    private Integer numSala;
    private Professor profMinistrante;
    private String[] horarios;
    private Boolean possuiProfessor;
    
    public Sala(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Professor[] professoresMinistrantes, Sala[] salas, Sala[] labs, Integer vagas) {
        super(titulo, codigo, cargaHoraria, descricao, aulasSemana, professoresMinistrantes, salas, labs, vagas);
        //TODO Auto-generated constructor stub
    }
    
    
}
