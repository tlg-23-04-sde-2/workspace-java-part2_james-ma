package com.entertainment;

public class Television {
    private String brand;
    private int volume;

    private Tuner tuner = new Tuner();

    // ctor
    public Television(){
    }

    public Television(String brand, int volume) {
        setBrand(brand);
        setVolume(volume);
    }

    // business methods
    public int getCurrentChannel() {
        return tuner.getChannel(); // delegate to contained Tuner object
    }
    public void changeChannel(int channel) {
        tuner.setChannel(channel); // delegate to contained Tuner object
    }

    // accessor methods

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        // only proceed if "obj" is a reference to another Television object
        if (obj instanceof Television) {
            // downcast 'obj' to more specific type Television, so we can call methods of Television
            Television other = (Television) obj;
            // do the checks: business equality is defined as same brand and volume
            result = this.getBrand().equals(other.getBrand()) && this.getVolume() == other.getVolume();
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("Television [brand=%s, volume=%s, currentChannel=%s]",
                getBrand(), getVolume(), getCurrentChannel());
    }
}