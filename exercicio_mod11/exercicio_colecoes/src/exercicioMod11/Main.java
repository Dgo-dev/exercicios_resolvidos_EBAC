package exercicioMod11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        List<String> sexoMasculino = new ArrayList<>();
        List<String> sexoFeminino = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Gostaria de adicionar uma nova pessoa? ");
        String resposta = teclado.next();

        while (resposta.equalsIgnoreCase("S")) {
            System.out.println("Digite o seu nome: ");
            String nome = teclado.next();
            System.out.println("Digite o seu sexo: (M) para masculino | (F) para feminino ");
            String sexo = teclado.next();


            if(sexo.equalsIgnoreCase("M")) {
                System.out.println("Lista de homens");
                sexoMasculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                System.out.println("Lista de mulheres");
                sexoFeminino.add(nome);
            } else {
                System.out.println("O valor digitado é inválido");
            }
            System.out.println(sexoMasculino);
            System.out.println(sexoFeminino);

            System.out.println("Gostaria de adicionar mais pessoas? ");
            resposta = teclado.next();

        }






    }
}
