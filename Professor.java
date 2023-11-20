import java.util.Arrays;

public class Professor extends Usuario{
    private String emailAcad;
    private String escola;
    private Boolean alocado = false;
    private Disciplina[] disciplinas;

    public Professor(String nome, Long cpf, Integer matricula, String email, Disciplina[] disciplinas, 
                     String escola, Boolean alocado) {

        super(nome, cpf, matricula, email);

        if (emailAcad == null && super.getNome() != null) {
            this.emailAcad = super.getNome() + "@educacorp.com";
        } else {
            this.emailAcad = emailAcad;
        }

        this.escola = escola;
        if (disciplinas != null) {
            this.alocado = true;
        }
        this.alocado = alocado;
        this.disciplinas = disciplinas;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public boolean isAlocado() {
        return alocado;
    }

    public void setAlocado(boolean alocado) {
        this.alocado = alocado;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Professor" + 
        "\nEmailAcad: " + emailAcad + "\nEscola: " + escola +
        "\nAlocado: " + alocado + "\nDisciplinas: " + Arrays.toString(disciplinas);
    }

    
  
    
}
