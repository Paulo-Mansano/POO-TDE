import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import javax.print.DocFlavor.STRING;

public class App {
    private static int idMapProf = 0;
    private static int idMapAluno = 0;
    private static int idMapTurma = 0;
    private static int idMapDisciplina = 0;

    private static final int GESTAO_ALUNOS = 1;
    private static final int GESTAO_PROFESSORES = 2;
    private static final int GESTAO_TURMAS = 3;
    private static final int GESTAO_DISCIPLINAS = 4;

    public static int getIdMapProf() {
        return idMapProf;
    }

    public static void setIdMapProf() {
        idMapProf += 1;
    }

    public static int getIdMapAluno() {
        return idMapAluno;
    }

    public static void setIdMapAluno() {
        idMapAluno += 1;
    }

    public static int getIdMapTurma() {
        return idMapTurma;
    }

    public static void setIdMapTurma() {
        idMapTurma += 1;
    }

    static Map<Integer, Professor> professores = new HashMap<>();
    static Map<Integer, Aluno> alunos = new HashMap<>();
    static Map<Integer, Turma> turmas = new HashMap<>();
    static Map<Integer, Disciplina> disciplinas = new HashMap<>();
    static Map<Integer, Sala> salas = new HashMap<>();

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int etapa = 0;
        int selectOut = 0;
        int selectIn = 0;

        try {
            do {
                System.out.println("SELECIONE A OPÇÃO DESEJADA: ");
                System.out.println(GESTAO_ALUNOS + " - GESTÃO DE ALUNOS");
                System.out.println(GESTAO_PROFESSORES + " - GESTÃO DE PROFESSORES");
                System.out.println(GESTAO_TURMAS + " - GESTÃO DE TURMAS");
                System.out.println(GESTAO_DISCIPLINAS + " - GESTÃO DE DISCIPLINAS");

                selectOut = input.nextInt();
                etapa += 1;

                switch (selectOut) {
                    case GESTAO_ALUNOS:
                        menuGestaoAlunos(input);
                        break;

                    case GESTAO_PROFESSORES:
                        // menuGestaoProfessores(input);
                        break;

                    case GESTAO_TURMAS:
                        // Implemente a gestão de turmas
                        break;

                    case GESTAO_DISCIPLINAS:
                        // Implemente a gestão de disciplinas
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } while (selectOut != 0);
        } catch (InputMismatchException e) {
            System.err.println("O tipo de entrada apresentado é inválido : " + e);
            System.err.println("O erro " + e + " foi detectado na etapa " + etapa + " do processo.");
        }
    }

    public static void menuGestaoAlunos(Scanner input) {
        int selectIn = 0;

        System.out.println("\n1 - CADASTRO DE ALUNOS");
        System.out.println("2 - MATRICULA DE ALUNOS");
        // ... outros casos

        selectIn = input.nextInt();

        switch (selectIn) {
            case 1:
                cadastroAluno(input);
                break;

            case 2:
                // Implemente a matrícula de alunos
                break;

            // ... outros casos

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    public static void cadastroAluno(Scanner input) {
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.printf("INICIANDO CADASTRO DE ALUNO...\n\n");
        System.out.printf("\nNOME: ");
        String nomeCompleto = input.nextLine();

        System.out.printf("\nCPF: ");
        Long cpf = input.nextLong();
        input.nextLine(); // Consumir a quebra de linha após a leitura de long

        System.out.printf("\nMATRICULA (3 DÍGITOS):");
        Integer matricula = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha após a leitura de int

        System.out.printf("\nEMAIL: ");
        String email = input.nextLine();

        System.out.printf("\nEMAIL ACADÊMICO: ");
        String emailAcad = input.nextLine();

        Aluno aluno = new Aluno(nomeCompleto, cpf, matricula, email, emailAcad, null, null, null);
        
        if (turmas != null) {
        
            System.out.println("\nTURMA DISPONÍVEIS: ");
            for (Entry<Integer, Turma> entry : turmas.entrySet()) {
                Integer chave = entry.getKey();
                Turma valor = entry.getValue();
                System.out.println("ID" + chave + ", Valor: " + valor.toString());
            }
        
            System.out.println("SELECIONE O ID PARA A TURMA QUE O USUÁRIO SERÁ VINCULADO: ");
            Integer idSelect = input.nextInt();
        
            // Verifica se a turma existe antes de vincular o aluno
            if (turmas.containsKey(idSelect)) {
                aluno.addTurma(turmas.get(idSelect));
                System.out.println("Aluno vinculado à turma com sucesso!");
            } else {
                System.out.println("ID de turma inválido. Não foi possível vincular o aluno.");
            }
        }

        if (disciplinas != null) {
            System.out.println("\nDISCIPLINAS DISPONÍVEIS: ");
            for (Entry<Integer, Disciplina> entry : disciplinas.entrySet()) {
                Integer chave = entry.getKey();
                Disciplina valor = entry.getValue();
                System.out.println("ID" + chave + ", Valor: " + valor.toString());
            }
        
            System.out.println("SELECIONE O ID PARA A DISCIPLINA QUE O USUÁRIO SERÁ VINCULADO: ");
            Integer idSelect = input.nextInt();
        
            // Verifica se a turma existe antes de vincular o aluno
            if (disciplinas.containsKey(idSelect)) {
                aluno.addDisciplina(disciplinas.get(idSelect));
                System.out.println("Aluno vinculado à disciplina com sucesso!");
            } else {
                System.out.println("ID de disciplina inválido. Não foi possível vincular o aluno.");
            }
            
        }

         if (salas != null) {
            System.out.println("\nSALAS DISPONÍVEIS: ");
            for (Entry<Integer, Sala> entry : salas.entrySet()) {
                Integer chave = entry.getKey();
                Sala valor = entry.getValue();
                System.out.println("ID" + chave + ", Valor: " + valor.toString());
            }
        
            System.out.println("SELECIONE O ID PARA A SALA QUE O USUÁRIO SERÁ VINCULADO: ");
            Integer idSelect = input.nextInt();
        
            // Verifica se a turma existe antes de vincular o aluno
            if (salas.containsKey(idSelect)) {
                aluno.addDisciplina(salas.get(idSelect));
                System.out.println("Aluno vinculado à sala com sucesso!");
            } else {
                System.out.println("ID de sala inválido. Não foi possível vincular o aluno.");
            }
            
        }

    }

    public static void matriculaAluno(Aluno aluno, Scanner input) {
        if (aluno != null && aluno.getCurso() == null) {
            System.out.printf("CURSO QUE O ALUNO SERÁ VINCULADO: ");
            String curso = input.nextLine();
            aluno.setCurso(curso);
        }
    }

    public static void alocacaoAluno(Aluno a, Scanner input) {

    }

    public static void realocacaoAluno(Aluno a, Scanner input) {

    }

    public static void visualizarAluno(Aluno a, Scanner input) {

    }

    public static void listarAlunos() {

    }

    public static void dadosAluno(Aluno a) {

    }

    public static void editarAluno(Aluno a, Scanner input) {

    }

    public static void cadastroProfessor(Scanner input) {

    }

    public static void alocacaoProfessor(Professor f, Scanner input) {

    }

    public static void realocacaoProfessor(Professor f, Scanner input) {

    }

    public static void visualizarProfessores() {

    }

    public static void listarProfessores() {

    }

    public static void dadosProfessor(Professor f) {

    }

    public static void editarProfessor(Professor f, Scanner input) {

    }
}
