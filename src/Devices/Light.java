package Devices;

public class Light {
    private boolean isOn = false;
    private int brightness = 100;
    
    public void turnOn() {
        isOn = true;
        System.out.println("Light is ON at " + brightness + "% brightness");
    }
    
    public void turnOff() {
        isOn = false;
        System.out.println("Light is OFF");
    }
    
    public void setBrightness(int level) {
        if (level < 0) level = 0;
        if (level > 100) level = 100;
        this.brightness = level;
        if (isOn) {
            System.out.println("Brightness set to " + level + "%");
        }
    }
    
    public boolean isOn() {
        return isOn;
    }
    
    public int getBrightness() {
        return brightness;
    }
}