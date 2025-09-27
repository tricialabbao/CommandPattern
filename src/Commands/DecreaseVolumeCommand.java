package Commands;

import Devices.MusicPlayer;

public class DecreaseVolumeCommand implements Command {
    private MusicPlayer musicPlayer;
    
    public DecreaseVolumeCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    
    public void execute() {
        musicPlayer.decreaseVolume();
    }
}