package TDEPOO;

import java.util.Arrays;

public abstract class Usuario {
    private String nome;
    private Long cpf;
    private Integer matricula;
    private String email;

    private Object[] disciplinas;

    public Usuario(String nome, Long cpf, Integer matricula, 
                   String email, Object[] disciplinas) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.email = email;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Object[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + Arrays.deepHashCode(disciplinas);
        return result;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (!Arrays.deepEquals(disciplinas, other.disciplinas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Dados do Usuário: \nUsuario [nome: " + nome + ", cpf: " + cpf + ", matricula: " 
        + matricula + ", email:" + email + ", disciplinas: " + disciplinas + "]";
    }

       

    
}
