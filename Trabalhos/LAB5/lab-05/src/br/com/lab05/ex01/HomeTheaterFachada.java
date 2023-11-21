package br.com.lab05.ex01;

public class HomeTheaterFachada {

    Amplificador amp;
    Luzes luzes;
    MaquinaDePipoca maquinaDePipoca;
    Projetor projetor;
    PlayerDeStreaming player;
    Telao telao;

    public HomeTheaterFachada(Amplificador amp, Luzes luzes, MaquinaDePipoca maquinaDePipoca, Projetor projetor, PlayerDeStreaming player, Telao telao){
        this.amp = amp;
        this.luzes = luzes;
        this.maquinaDePipoca = maquinaDePipoca;
        this.projetor = projetor;
        this.player = player;
        this.telao = telao;
    }

    public void assistirFilme(String filme){
        System.out.println("Preparando para meu filme de domingo a tarde!!");
        maquinaDePipoca.liga();
        maquinaDePipoca.arrebentaPipoca();
        luzes.liga();
        telao.abaixa();
        projetor.liga();
        amp.liga();
        amp.ajusteDeVolume();
        player.liga();
        player.play(filme);
    }

    public void fimDoDia(){
        System.out.println("Desligando meu kit home theater!!");
    }
}
