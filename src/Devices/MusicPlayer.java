package Devices;

public class MusicPlayer {
    private boolean isPlaying = false;
    private int volume = 50;
    private int trackNumber = 1;
    
    public void play() {
        isPlaying = true;
        System.out.println("▶ Playing track " + trackNumber);
    }
    
    public void stop() {
        isPlaying = false;
        System.out.println("⏹ Music player stopped");
    }
    
    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("⏸ Playback paused");
        }
    }
    
    public void nextTrack() {
        trackNumber++;
        System.out.println("⏭ Now playing track " + trackNumber);
    }
    
    public void previousTrack() {
        trackNumber = Math.max(1, trackNumber - 1);
        System.out.println("⏮ Now playing track " + trackNumber);
    }
    
    public void increaseVolume() {
        volume = Math.min(100, volume + 5);
        System.out.println("🔊 Volume: " + volume + "%");
    }
    
    public void decreaseVolume() {
        volume = Math.max(0, volume - 5);
        System.out.println("🔉 Volume: " + volume + "%");
    }
}