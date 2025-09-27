package Commands;

import Devices.Thermostat;

public class IncreaseTempCommand implements Command {
    private Thermostat thermostat;
    
    public IncreaseTempCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }
    
    public void execute() {
        thermostat.increaseTemperature();
    }
}