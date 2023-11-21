package br.com.lab05.ex02;

import org.w3c.dom.ls.LSOutput;

public class CarroFachada {

    private Motor motor;
    private CintoDeSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFachada() {
        motor = new Motor();
        cinto = new CintoDeSeguranca();
        porta = new Porta();
        farol = new Farol();
        radio = new Radio();
    }

    public void iniciarCorrida() {
        System.out.println("Iniciando corrida!!");
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar("Minha Estação Preferida");
    }

    public void finalizarCorrida() {
        System.out.println("Finalizando corrida!!");
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }

}
