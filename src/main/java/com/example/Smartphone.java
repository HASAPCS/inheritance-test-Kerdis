package com.example;

// TODO: make this class extend ElectronicDevice

public class Smartphone extends ElectronicDevice {
    // TODO: Declare the necessary attributes (brand, model, batteryLevel)
    private int batteryLevel;

    // Constructor to initialize the Smartphone object
    public Smartphone(String brand, String model, int batteryLevel) {
        super(brand, model);
        this.batteryLevel = batteryLevel;
        // TODO: Initialize the attributes with the provided parameters
    }

    // TODO: Implement a method to check the battery level and return a message
    // based on the level

    // Implement the checkBattery method to return:
    public String checkBattery() {
        if (batteryLevel < 20) {
            return ("Warning: Battery low!");
        } else
            return ("Battery level is okay: " + batteryLevel + "%");
    }
    // "Warning: Battery low!" if the battery level is 20% or lower.
    // "Battery level is okay: [batteryLevel]%." if the battery level is above 20%.

    // TODO: Implement necessary getters for the attributes
    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
    // OPTIONALLY implement the required methods to pass the BonusTest.
}
