import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("+=+=+=+=+= Bem-vindo ao sistema de cálculo de salários! +=+=+=+=+=");

        System.out.println("Digite o salário do funcionário 01: ");
        double salario1 = sc.nextDouble();
        String resultado1 = processarSalario(salario1);

        System.out.println("Digite o salário do funcionário 02: ");
        double salario2 = sc.nextDouble();
        String resultado2 = processarSalario(salario2);

        System.out.println("Digite o salário do funcionário 03: ");
        double salario3 = sc.nextDouble();
        String resultado3 = processarSalario(salario3);

        System.out.println("Digite o salário do funcionário 04: ");
        double salario4 = sc.nextDouble();
        String resultado4 = processarSalario(salario4);

        System.out.println("Digite o salário do funcionário 05: ");
        double salario5 = sc.nextDouble();
        String resultado5 = processarSalario(salario5);

        System.out.println("\n+=+=+=+=+= Resultados Finais +=+=+=+=+= \n");
        System.out.println("Funcionáiro 01" + resultado1 + "\n");
        System.out.println("Funcionáiro 02" + resultado2 + "\n");
        System.out.println("Funcionáiro 03" + resultado3 + "\n");
        System.out.println("Funcionáiro 04" + resultado4 + "\n");
        System.out.println("Funcionáiro 05" + resultado5 + "\n");
        System.out.println("\n+=+=+=+=+= Fim do processamento +=+=+=+=+=");
    }

    public static String processarSalario(double salarioBruto) {
        double descontoINSS = calcularINSS(salarioBruto);
        double descontoIR = calcularIR(salarioBruto - descontoINSS);
        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

        return "\nSalário bruto: " + salarioBruto +
                "\nDesconto INSS: " + descontoINSS +
                "\nDesconto IR: " + descontoIR +
                "\nSalário líquido: " + salarioLiquido;
    }

    public static double calcularINSS(double salarioBruto) {
        if (salarioBruto <= 1212.00) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            return salarioBruto * 0.09;
        } else if (salarioBruto <= 3641.03) {
            return salarioBruto * 0.12;
        } else {
            return salarioBruto * 0.14;
        }
    }

    public static double calcularIR(double salarioBase) {
        if (salarioBase <= 1903.98) {
            return 0;
        } else if (salarioBase <= 2826.65) {
            return salarioBase * 0.075;
        } else if (salarioBase <= 3751.05) {
            return salarioBase * 0.15;
        } else if (salarioBase <= 4664.68) {
            return salarioBase * 0.225;
        } else {
            return salarioBase * 0.275;
        }
    }
}
