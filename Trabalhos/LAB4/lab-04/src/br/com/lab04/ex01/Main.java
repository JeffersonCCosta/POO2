package br.com.lab04.ex01;

public class Main {
    public static void main(String[] args) {

        Pato pato = new PatoDomestico();
        Ave patoAve = new PatoAveAdapter(pato);

        Main main = new Main();

        main.habilidadesDaAve(patoAve);

        System.out.println("\n");

        Pavao pavao = new PavaoAzul();
        Ave pavaoAve = new PavaoAveAdapter(pavao);

        main.habilidadesDaAve(pavaoAve);

    }

    public void habilidadesDaAve(Ave ave) {
        ave.voar();
        ave.emitirSom();
    }
}
