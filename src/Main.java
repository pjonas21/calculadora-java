import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean sair = true;

        Scanner scan = new Scanner(System.in);

        while (sair) {
            scan = new Scanner(System.in);

            System.out.println("Informe o primeiro numero: ");
            double numberOne = scan.nextDouble();

            System.out.println("Informe a operacao \n[1] adicao // \n[2] subtracao // \n[3] multiplicacao // \n[4] divisao : ");
            int operation = scan.nextInt();
            while (operation <= 0 || operation >= 5) {
                System.out.println("Operacao invalida.");
                System.out.println("Informe a operacao novamente \n[1] adicao // \n[2] subtracao // \n[3] multiplicacao // \n[4] divisao : ");
                operation = scan.nextInt();
            }

            System.out.println("Informe o segundo numero: ");
            double numberTwo = scan.nextDouble();

            Double resultant;

            if (operation == 1) {
                resultant = numberOne + numberTwo;
                System.out.println("Resultado da adição: " + resultant);
            } else if (operation == 2) {
                resultant = numberOne - numberTwo;
                System.out.println("Resultado da subtração: " + resultant);
            } else if (operation == 3) {
                resultant = numberOne * numberTwo;
                System.out.println("Resultado da multiplicação: " + resultant);
            } else {
                resultant = numberOne / numberTwo;
                System.out.println("Resultado da divisão: " + resultant);
            }

            System.out.println("Deseja sair? [1]sim");
            int outSys = scan.nextInt();
            if (outSys == 1) {
                sair = false;
            }
        }

        scan.close();

    }
}