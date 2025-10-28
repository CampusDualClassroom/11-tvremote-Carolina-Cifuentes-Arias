package com.campusdual.classroom;

public class TVRemote {

    int channel;
    int volume;
    boolean on;
    String color;

    public TVRemote(String color) {
        this.channel = 0;
        this.volume = 20;
        this.color = color;
        this.on = false;
    }

    public boolean turnOn() {
        this.on = true;
        System.out.println("TV encendida");
        return this.on;

    }

    public boolean turnOff() {
        this.on = false;
        System.out.println("TV apagada");
        return this.on;
    }

    public void channelUp() {
            this.channel++;
            System.out.println("Canal subido a " + this.channel);
    }


    public void channelDown() {
            if (checkMinValue(this.channel)){
                this.channel--;
                System.out.println("Canal bajado a " + this.channel);
            }else{
                System.out.println("Canal en 0, no es posible bajar canal");
            }
        }

    public void volumeUp() {
            this.volume++;
            System.out.println("Volumen subido a " + this.volume);
        }

    public void volumeDown() {
            if (checkMinValue(this.volume)){
                this.volume--;
                System.out.println("Volumen bajado a " + this.volume);
            }else{
                System.out.println("Volumen en 0, no es posible bajar volumen");
            }
    }

    public String getColor() {
        return this.color;

    }

    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;
        }
    }

}
