package by.jrr.task.tv.bean;

import java.util.Objects;

public class Tv {
    private int currentChannel;
    private int currentVolume;
    private String manufacture;
    private boolean isTurnedOn;

    public Tv(int currentChannel, int currentVolume, String manufacture, boolean isTurnedOn) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.manufacture = manufacture;
        this.isTurnedOn = isTurnedOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    @Override
    public boolean equals(Object o) {
        
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                isTurnedOn == tv.isTurnedOn &&
                Objects.equals(manufacture, tv.manufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, manufacture, isTurnedOn);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", getCurrentVolume=" + currentVolume +
                ", manufacture='" + manufacture + '\'' +
                ", isTunedOn=" + isTurnedOn +
                '}';
    }
}
