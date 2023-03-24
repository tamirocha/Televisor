package org.example;

public class Televisor {

    public int canal = 130;
    public int volume = 20;


    public void mudarCanal(int novoCanal){
        if(canal == novoCanal){
            System.out.println("Novo canal é também o canal atual.");
        }else{
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }
    public void mudarVolume(int novoVolume){
        if(novoVolume == volume){
            System.out.println("Novo volume é também o volume atual.");
        }else{
            volume = novoVolume;
            System.out.println("Volume alterado para "+volume);
        }
    }
}
