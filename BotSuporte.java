import java.util.*;
public class BotSuporte {
    /*
     * Redirecionar atendimentos (switch-case)
     * Armazenar as entradas do usuário em um banco (matriz)
     * Informar opções pro usuário
     * Provedor de internet | Cancelamento de linha (Setor de retenção)
     *
     * BotSuporte v0.1
     */

    public static void verOpcoesEntrada() {
        try {
            String[] opcoesEntrada = {
                "Opção 1: Consultar saldo",
                "Opção 2: Falar com atendente",
                "Opção 3: Revisar plano",
                "Opção 4: Suporte técnico",
                "Opção 5: Cancelamento"
            };

            for (int o = 0; o < opcoesEntrada.length; o++) {
                System.out.println(opcoesEntrada[o]);
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }

    public static void botEntrada(int opcaoUsuario) {
        try {
            switch (opcaoUsuario) {
                case 1:
                    botSaldo();
                    break;
                case 2:
                    botFalar();
                    break;
                case 3:
                    botPlano();
                    break;
                case 4:
                    botSuporte();
                    break;
                case 5:
                    botCancelamento();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }

    public static void botSaldo() {
        System.out.println("Você está no menu de Saldo");
    }

    public static void botFalar() {
        System.out.println("Você está no menu para Falar com um atendente");
    }

    public static void botPlano() {
        System.out.println("Você está no menu de Plano");
    }

    public static void botSuporte() {
        System.out.println("Você está no menu de Suporte");
    }

    public static void botCancelamento() {
        System.out.println("Você está no menu de Cancelamento");
    }

    public static void main(String[] args) {
        try {
            Scanner scnOpcaoUsuario = new Scanner(System.in);
            verOpcoesEntrada();
            System.out.println("Digite o código da opção desejada acima e tecle Enter");
            botEntrada(scnOpcaoUsuario.nextInt());
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }
}

