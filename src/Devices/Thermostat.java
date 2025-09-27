package Devices;

public class Thermostat {
    private int temperature = 22;
    private String unit = "°C";
    
    public void increaseTemperature() {
        temperature += 25;
        System.out.println("Temperature increased to " + temperature + unit);
    }
    
    public void decreaseTemperature() {
        temperature -= 25;
        System.out.println("Temperature decreased to " + temperature + unit);
    }
    
    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Temperature set to " + temperature + unit);
    }
    
    public int getTemperature() {
        return temperature;
    }
}