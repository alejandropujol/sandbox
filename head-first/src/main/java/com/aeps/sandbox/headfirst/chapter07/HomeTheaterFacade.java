package com.aeps.sandbox.headfirst.chapter07;

/**
 * Created by Alejandro on 10/17/2016.
 */
public class HomeTheaterFacade {

    private Amplifier amplifier;

    private BlurayPlayer blurayPlayer;

    public HomeTheaterFacade(Amplifier amplifier, BlurayPlayer blurayPlayer) {
        this.amplifier = amplifier;
        this.blurayPlayer = blurayPlayer;
    }

    public void watchMovie() {
        amplifier.powerOn();
        amplifier.setVolumeLevel(10);
        blurayPlayer.powerOn();
        blurayPlayer.playMovie();
    }

    public void endMovie() {
        blurayPlayer.stopMovie();
        blurayPlayer.powerOff();
        amplifier.powerOff();
    }

}