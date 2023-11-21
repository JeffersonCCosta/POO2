package br.com.lab04.ex02;

public class Main {

    public static void main(String[] args) {

        // Criar uma instância da calculadora binária usando o adaptador
        CalculadoraBinaria calculadoraBinaria = new CalculadoraBinAdapter();

        // Executar operações binárias
        String binarioA = "101";
        String binarioB = "110";
        String resultadoSomaBinaria = calculadoraBinaria.somar(binarioA, binarioB);
        String resultadoSubtracaoBinaria = calculadoraBinaria.subtrair(binarioA, binarioB);

        System.out.println("Resultado da soma binária: " + resultadoSomaBinaria);
        System.out.println("Resultado da subtração binária: " + resultadoSubtracaoBinaria);

        // Executar operações decimais
        CalculadoraDecimal calculadoraDecimal = new CalculadoraDecimal();
        int decimalA = 5;
        int decimalB = 3;
        int resultadoSomaDecimal = calculadoraDecimal.somar(decimalA, decimalB);
        int resultadoSubtracaoDecimal = calculadoraDecimal.subtrair(decimalA, decimalB);
        int resultadoMultiplicacaoDecimal = calculadoraDecimal.multiplicar(decimalA, decimalB);

        System.out.println("Resultado da soma decimal: " + resultadoSomaDecimal);
        System.out.println("Resultado da subtração decimal: " + resultadoSubtracaoDecimal);
        System.out.println("Resultado da multiplicação decimal: " + resultadoMultiplicacaoDecimal);
    }
}
