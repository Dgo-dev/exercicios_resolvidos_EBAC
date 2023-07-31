package br.com.diego;

public class Exercicio {

    public static void main(String args[]) {
        String nome = "Diego";
        int idade = 21;
        System.out.println(idade);
        double altura = 1.72;
        System.out.println(altura);

        Integer idadeWrapper = (Integer) idade;
        System.out.println(idadeWrapper);


        Double alturaWrapper = (Double) altura;
        System.out.println(alturaWrapper);

        // Execução de um método do wrapper Double
        System.out.println(alturaWrapper.byteValue());
        // Execução de um método no wrapper Integer
        System.out.println(idadeWrapper.byteValue());


    }

}
