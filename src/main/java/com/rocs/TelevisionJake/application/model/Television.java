// Problem 3: Construct a Television class that can change channels, change volume and be turned on or off.
// Jake Viado
package com.rocs.TelevisionJake.application.model;

public class Television {
    private int channel;
    private int volume;
    private boolean powerOn;

    public Television() {
        channel= 2;
        volume = 20;
        powerOn = false;
    }

    public void setChannel(int c) {
        channel = c;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        volume+=1;
    }

    public void decreaseVolume() {
        volume-=1;
    }

    public void setpower() {
        powerOn = !powerOn;
    }

    public boolean isPowered() {
        return powerOn;
    }
}
