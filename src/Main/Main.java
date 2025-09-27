package Main;
import Devices.*;
import Commands.*;
import Hub.SmartHomeHub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize devices
        Light livingRoomLight = new Light();
        Thermostat homeThermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();
        
        // Initialize smart home hub
        SmartHomeHub hub = new SmartHomeHub();
        
        System.out.println("=== SMART HOME CONTROL SYSTEM ===");
        System.out.println("Welcome to your Smart Home Hub!");
        
        boolean running = true;
        while (running) {
            displayMainMenu();
            int choice = getIntInput(scanner, "Choose a device: ");
            
            switch (choice) {
                case 1 -> controlLight(scanner, hub, livingRoomLight);
                case 2 -> controlThermostat(scanner, hub, homeThermostat);
                case 3 -> controlMusicPlayer(scanner, hub, musicPlayer);
                case 0 -> {
                    running = false;
                    System.out.println("Shutting down Smart Home System. Goodbye!");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
    
    private static void displayMainMenu() {
        System.out.println("\n=== MAIN MENU ===");
        System.out.println("1. Control Lights");
        System.out.println("2. Control Thermostat");
        System.out.println("3. Control Music Player");
        System.out.println("0. Exit System");
    }
    
    private static void controlLight(Scanner scanner, SmartHomeHub hub, Light light) {
        System.out.println("\n--- LIGHT CONTROL ---");
        System.out.println("1. Turn ON Light");
        System.out.println("2. Turn OFF Light");
        
        int choice = getIntInput(scanner, "Choose action: ");
        switch (choice) {
            case 1 -> {
                hub.sendCommand(new LightOnCommand(light));
                System.out.println("Light command sent!");
            }
            case 2 -> {
                hub.sendCommand(new LightOffCommand(light));
                System.out.println("Light command sent!");
            }
            default -> System.out.println("Invalid light control option.");
        }
    }
    
    private static void controlThermostat(Scanner scanner, SmartHomeHub hub, Thermostat thermostat) {
        System.out.println("\n--- THERMOSTAT CONTROL ---");
        System.out.println("1. Increase Temperature");
        System.out.println("2. Decrease Temperature");
        
        int choice = getIntInput(scanner, "Choose action: ");
        switch (choice) {
            case 1 -> {
                hub.sendCommand(new IncreaseTempCommand(thermostat));
                System.out.println("Thermostat command sent!");
            }
            case 2 -> {
                hub.sendCommand(new DecreaseTempCommand(thermostat));
                System.out.println("Thermostat command sent!");
            }
            default -> System.out.println("Invalid thermostat control option.");
        }
    }
    
    private static void controlMusicPlayer(Scanner scanner, SmartHomeHub hub, MusicPlayer player) {
        System.out.println("\n--- MUSIC PLAYER CONTROL ---");
        System.out.println("1. Play Music");
        System.out.println("2. Stop Music");
        System.out.println("3. Increase Volume");
        System.out.println("4. Decrease Volume");
        
        int choice = getIntInput(scanner, "Choose action: ");
        switch (choice) {
            case 1 -> {
                hub.sendCommand(new PlayMusicCommand(player));
                System.out.println("Music command sent!");
            }
            case 2 -> {
                hub.sendCommand(new StopMusicCommand(player));
                System.out.println("Music command sent!");
            }
            case 3 -> {
                hub.sendCommand(new IncreaseVolumeCommand(player));
                System.out.println("Volume command sent!");
            }
            case 4 -> {
                hub.sendCommand(new DecreaseVolumeCommand(player));
                System.out.println("Volume command sent!");
            }
            default -> System.out.println("Invalid music player control option.");
        }
    }
    
    private static int getIntInput(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
}