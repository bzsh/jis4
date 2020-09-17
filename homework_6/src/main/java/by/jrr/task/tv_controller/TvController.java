package by.jrr.task.tv_controller;

import by.jrr.task.tv.bean.Tv;

public class TvController {
   private Tv tv;

    public void setTv(Tv tv) {
        this.tv = tv;
    }

    public Tv getTv(){
        return tv;
    }

    public void nextChannel() {
        tv.setCurrentChannel(tv.getCurrentChannel() + 1);
    }

    public void prevChannel() {
        tv.setCurrentChannel(tv.getCurrentChannel() - 1);
    }

    public void volumeUp() {
        tv.setCurrentVolume(tv.getCurrentVolume() + 1);
    }

    public void volumeDown() {
        tv.setCurrentVolume(tv.getCurrentVolume() - 1);
    }

    public void turnOn() {
        tv.setTurnedOn(true);
    }

    public void turnOff() {
        tv.setTurnedOn(false);
    }
}
