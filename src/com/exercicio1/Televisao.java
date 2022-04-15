package com.exercicio1;

public class Televisao {

    private int volume;
    private int canal;

    public Televisao() {
        this.canal = 10;
        this.volume = 16;
    }

    public int getVolume() {
        return volume;
    }
    public void aumentaVolume() {
        this.volume ++;
    }
    public void diminuiVolume() {
        this.volume --;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public void aumentaCanal() {
        this.canal ++;
    }
    public void diminuiCanal() {
        this.canal --;
    }
}