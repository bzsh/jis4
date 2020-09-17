package by.jrr.task.tv.service;

import by.jrr.task.tv.bean.Tv;

public class TvService implements TvServiceInterface {
    private Tv tv;

    public TvService(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void nextChannel() {
        tv.setCurrentChannel(tv.getCurrentChannel() + 1);
    }

    @Override
    public void prevChannel() {
        tv.setCurrentChannel(tv.getCurrentChannel() - 1);
    }

    @Override
    public void volumeUp() {
        tv.setCurrentVolume(tv.getCurrentVolume() + 1);
    }

    @Override
    public void volumeDown() {
        tv.setCurrentVolume(tv.getCurrentVolume() - 1);
    }

    @Override
    public void turnOn() {
        tv.setTurnedOn(true);
    }

    @Override
    public void turnOff() {
        tv.setTurnedOn(false);
    }
}
