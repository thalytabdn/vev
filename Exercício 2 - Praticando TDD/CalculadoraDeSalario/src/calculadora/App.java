package calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        while (true) {

            System.out.println("(A)dicionar Funcionario(a)");
            System.out.println("(C)alcular Salário");
            System.out.println("(S)air");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.print("Opção >> ");
            String opcao = sc.nextLine().toLowerCase();

            if (opcao.equals("a")) {
                addFuncionario(calculadora);
            } else if (opcao.equals("c")) {
                calculaSalario(calculadora);
            } else if (opcao.equals("s")) {
                break;
            } else {
                System.out.println("OPÇÃO INVALIDA!");
            }
        }

    }

    private static void calculaSalario(Calculadora calculadora) {
        Scanner sc = new Scanner(System.in);
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        if (!calculadora.funcionarioExiste(cpf)) {
            System.out.println("");
            System.out.println("FUNCIONÁRIO NÃO CADASTRADO !");
            System.out.println("");


        } else {
            Double salario = calculadora.calculaSalario(cpf);
            System.out.println("");
            System.out.println("SALÁRIO LÍQUIDO: " + salario.toString());
            System.out.println("");
        }
    }

    private static void addFuncionario(Calculadora calculadora) {
        Scanner sc = new Scanner(System.in);

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Salário: ");
        String salario = sc.nextLine();

        System.out.print("Cargo: ");
        String cargo = sc.nextLine();

        try {
            if (calculadora.funcionarioExiste(cpf)) {
                System.out.println("FUNCIONÁRIO(A) JÁ ESTÁ CADASTRADO !");
                System.out.println("");
            } else {
                calculadora.addFuncionario(cpf, nome, email, Double.parseDouble(salario), Cargo.valueOf(cargo.toUpperCase()));
                System.out.println("");
                System.out.println("FUNCIONÁRIO(A) CADASTRADO COM SUCESSO !");

            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("");
    }
}
