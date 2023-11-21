package br.com.lab04.ex02;

public class CalculadoraBinAdapter implements CalculadoraBinaria{

    private CalculadoraDecimal calculadoraDecimal;

    public CalculadoraBinAdapter() {
        this.calculadoraDecimal = new CalculadoraDecimal();
    }

    @Override
    public String somar(String a, String b) {
        int resultado = calculadoraDecimal.somar(Integer.parseInt(a, 2), Integer.parseInt(b, 2));
        return Integer.toBinaryString(resultado);
    }

    @Override
    public String subtrair(String a, String b) {
        int resultado = calculadoraDecimal.subtrair(Integer.parseInt(a, 2), Integer.parseInt(b, 2));
        return Integer.toBinaryString(resultado);
    }
}
