import java.util.List;

public class Disciplina {
    private final String titulo;
    private final Integer codigo;
    private final Integer cargaHoraria;
    private final String descricao;
    private final Integer aulasSemana;

    private final List<Professor> professoresMinistrantes;
    private final List<Sala> salas;
    private final List<Turma> turmas;

    // Construtor da classe Disciplina
    public Disciplina(String titulo, Integer codigo, Integer cargaHoraria, String descricao, Integer aulasSemana,
            Professor[] professoresMinistrantes, Sala[] salas2, Sala[] labs) {
        this.titulo = (titulo != null) ? titulo.toUpperCase() : null;
        this.codigo = (codigo != null && codigo > 0) ? codigo : null;
        this.cargaHoraria = (cargaHoraria != null && cargaHoraria > 0) ? cargaHoraria : null;
        this.descricao = (descricao != null) ? descricao.toUpperCase() : "Não possui descrição.";
        this.aulasSemana = (aulasSemana != null && aulasSemana > 0) ? aulasSemana : null;

        // Inicialização das listas mantendo as referências originais
        this.professoresMinistrantes = (professoresMinistrantes != null) ? List.of(professoresMinistrantes) : List.of();
        this.salas = (salas2 != null) ? List.of(salas2) : List.of();
        this.turmas = (labs != null) ? List.of(labs) : List.of();
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getAulasSemana() {
        return aulasSemana;
    }

    public List<Professor> getProfessoresMinistrantes() {
        return professoresMinistrantes;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    @Override
    public String toString() {
        return "Disciplina: \n[Titulo : " + titulo + "\nCodigo : " + codigo + "\nCarga Horaria=" + cargaHoraria +
                "\nDescrica : " + descricao + "\n Aulas por semana : " + aulasSemana +
                "\nProfessores Ministrantes " + professoresMinistrantes.toString() + "\nSalas : " + salas +
                "\nTurmas : " + turmas + "]";
    }
}
