import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Para consultar a sua Media digite (S): ");
        String resposta = s.next();

        while (resposta.equalsIgnoreCase("S")) {
            System.out.println("Digite a sua primeira nota: ");
            Double nota1 = s.nextDouble();
            System.out.println("Digite a sua segundas nota: ");
            Double nota2 = s.nextDouble();
            System.out.println("Digite a sua terceira nota: ");
            Double nota3 = s.nextDouble();
            System.out.println("Digite a sua quarta nota: ");
            Double nota4 = s.nextDouble();

            Double media = (nota1 + nota2 + nota3 + nota4) / 4;

            if(media >= 7) {
                System.out.println("Sua média foi: " + media + "   Você foi APROVADO");
            } else if(media >= 5) {
                System.out.println("Sua média foi: " + media + " Você está de RECUPERAÇÃO");
            } else {
                System.out.println("Sua média foi: " + media + " Você foi REPROVADO");
            }

            System.out.println("Gostaria de consultar uma nova média? ");
            resposta = s.next();
        }

    }
}