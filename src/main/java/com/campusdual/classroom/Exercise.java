package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        System.out.println(redRemote.getColor());

        redRemote.turnOn();

        redRemote.channelUp();
        redRemote.channelDown();

        redRemote.channelDown();

        redRemote.volumeUp();
        redRemote.volumeDown();

        redRemote.volume = 0;
        redRemote.volumeDown();

        redRemote.turnOff();


        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(blackRemote.getColor());

        blackRemote.turnOn();

        blackRemote.channelUp();
        blackRemote.channelDown();

        blackRemote.channelDown();

        blackRemote.volumeUp();
        blackRemote.volumeDown();

        blackRemote.volume = 0;
        blackRemote.volumeDown();

        blackRemote.turnOff();


    }
}