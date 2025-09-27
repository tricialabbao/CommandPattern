package Commands;
import Devices.MusicPlayer;

public class StopMusicCommand implements Command {
    private MusicPlayer musicPlayer;
    
    public StopMusicCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    
    public void execute() {
        musicPlayer.stop();
    }
}