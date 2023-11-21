package br.com.lab05.ex01;

public class Main {
    public static void main(String[] args) {

        Amplificador amp = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaDePipoca maquinaDePipoca = new MaquinaDePipoca();
        Projetor projetor = new Projetor();
        PlayerDeStreaming player = new PlayerDeStreaming();
        Telao telao = new Telao();

        HomeTheaterFachada homeTheater = new HomeTheaterFachada(amp, luzes, maquinaDePipoca, projetor, player, telao);

        homeTheater.assistirFilme("Duro de Matar");
        System.out.println();
    }
}
