import java.util.Arrays;

public class Aluno extends Usuario {
    private String emailAcad;
    private Turma[] turma;
    private Disciplina[] disciplina;
    private Sala[] salas;

    public Aluno(String nome, Long cpf, Integer matricula, String email,   String emailAcad,
         Turma[] turma, Disciplina[] disciplina, Sala[] salas) {
        
        super(nome, cpf, matricula, email);

        if (emailAcad == null && super.getNome() != null) {
            this.emailAcad = super.getNome().toLowerCase() + "@educorp.com";
        } else {
            this.emailAcad = emailAcad;
        }

        this.turma = turma;
        this.disciplina = disciplina;
        this.salas = salas;

    }

    public String getEmailAcad() {
        return emailAcad;
    }

    public void setEmailAcad(String emailAcad) {
        this.emailAcad = emailAcad;
    }

    public Turma[] getTurma() {
        return turma;
    }

    public void setTurma(Turma[] turma) {
        this.turma = turma;
    }

    public Disciplina[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina[] disciplina) {
        this.disciplina = disciplina;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo: Aluno [emailAcad=" + emailAcad + ", turma=" + Arrays.toString(turma) + ", disciplina="
                + Arrays.toString(disciplina) + ", salas=" + Arrays.toString(salas) + "]";
    }

    
}
