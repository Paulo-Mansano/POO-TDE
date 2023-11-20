import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static int idMapProf = 0;
    private static int idMapAluno = 0;

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

    public static void main(String[] args) {
        int idProf = getIdMapProf();
        int idAlun = getIdMapAluno();

        Map<Integer, Professor> professores = new HashMap<>();
        Map<Integer, Aluno> alunos = new HashMap<>();

        Scanner input = new Scanner(System.in);
        int selectOut = 0;
        int selectIn = 0;
        int etapa = 0;

        // Variáveis para cadastramento de usuários (padrão):
        String nomeCompleto;
        Long cpf;
        Integer matricula;
        String email;

        // Variaveis para o cadastramento de aluno:
        String emailAcad;

        try {
            System.out.println("SELECIONE A OPÇÃO DESEJADA: ");
            System.out.println("1 - GESTÃO DE ALUNOS");
            System.out.println("2 - GESTÃO DE PROFESSORES");
            System.out.println("3 - GESTÃO DE TURMAS");
            System.out.println("4 - GESTÃO DE DISCIPLINAS");

            selectOut = input.nextInt();
            etapa += 1;

            switch (selectOut) {
                case 1:
                    System.out.println("\n1 - CADASTRO DE ALUNOS");
                    System.out.println("2 - MATRICULA DE ALUNOS");
                    System.out.println("3 - ALOCAÇÃO DE ALUNOS");
                    System.out.println("4 - REALOCAÇÃO DE ALUNOS");
                    System.out.println("5 - VISUALIZAR ALUNOS");
                    System.out.println("6 - LISTAR ALUNOS");
                    System.out.println("7 - ACESSAR DADOS DE ALUNOS");
                    System.out.println("8 - EDITAR ALUNO");

                    selectIn = input.nextInt();
                    etapa += 1;

                    switch (selectIn) {
                        case 1:
                            System.out.printf("INICIANDO CADASTRO DE ALUN0...\n\n");
                            System.out.printf("\nNOME: ");
                            nomeCompleto = input.nextLine();
                            System.out.printf("\nCPF: ");
                            cpf = input.nextLong();
                            System.out.printf("\nMATRICULA (3 DÍGITOS)):");
                            matricula = input.nextInt();
                            System.out.printf("\nEMAIL: ");
                            email = input.nextLine();
                            System.out.printf("\nEMAIL ACADÊMICO: ");
                            emailAcad = input.nextLine();
                            // MATRICULA BÁSICA DE ALUNO
                            break;

                        case 2:

                        default:
                            break;
                    }

                    break;

                case 2:
                    System.out.println("\n1 - CADASTRO DE PROFESSORES");
                    System.out.println("3 - ALOCAR PROFESSOR À DISCIPLINA");
                    System.out.println("4 - REALOCAÇÃO DE PROFESSORES");
                    System.out.println("5 - VISUALIZAR PROFESSORES");
                    System.out.println("6 - LISTAR PROFESSORES");
                    System.out.println("7 - ACESSAR DADOS DE PROFESSORES");
                    System.out.println("8 - EDITAR PROFESSOR");


                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    break;
            }
        } catch (InputMismatchException e) {
            System.err.println("O tipo de entrada apresentado é inválido : " + e);
            System.err.println("O erro " + e + " foi detectado na etapa " + etapa + " do processo.");
        }
    }

}
