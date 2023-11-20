import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public abstract class Usuario {
    private String nome;
    private Long cpf;
    private Integer matricula;
    private String email;

    private Set<Integer> matriculasGeradas = new HashSet<>();


    public Usuario(String nome, Long cpf, Integer matricula, 
                   String email) 
    {
        this.nome = nome;
        this.cpf = cpf;

        if (matricula == null) {
            this.matricula = gerarMatricula();
        }
        this.matricula = matricula;
        this.email = email;
    }

    public int gerarMatricula() {
        Random random = new Random();
        int matricula;

        do {
            matricula = 100 + random.nextInt(900); // Gera um número aleatório de 3 dígitos
        } while (matriculasGeradas.contains(matricula));

        matriculasGeradas.add(matricula);
        return matricula;
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


    @Override
    public String toString() {
        return "Usuario - Visão Geral \n" + 
        "Nome: " + nome + "\nCPF: " + cpf + 
        "\nMatricula: " + matricula + "\nEmail: " + email;
    }

    
    
}
