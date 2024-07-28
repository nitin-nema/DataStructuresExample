package training;

//Target Interface
interface MediaPlayer {
 void play(String audioType, String fileName);
}

//Advanced Media Player Interface
interface AdvancedMediaPlayer {
 void playVlc(String fileName);
 void playMp4(String fileName);
}

//Concrete implementation of AdvancedMediaPlayer for VLC files
class VlcPlayer implements AdvancedMediaPlayer {
 @Override
 public void playVlc(String fileName) {
     System.out.println("Playing vlc file. Name: " + fileName);
 }

 @Override
 public void playMp4(String fileName) {
     // Do nothing
 }
}

//Concrete implementation of AdvancedMediaPlayer for MP4 files
class Mp4Player implements AdvancedMediaPlayer {
 @Override
 public void playVlc(String fileName) {
     // Do nothing
 }

 @Override
 public void playMp4(String fileName) {
     System.out.println("Playing mp4 file. Name: " + fileName);
 }
}

//Adapter class implementing the MediaPlayer interface
class MediaAdapter implements MediaPlayer {
 AdvancedMediaPlayer advancedMediaPlayer;

 public MediaAdapter(String audioType) {
     if (audioType.equalsIgnoreCase("vlc")) {
         advancedMediaPlayer = new VlcPlayer();
     } else if (audioType.equalsIgnoreCase("mp4")) {
         advancedMediaPlayer = new Mp4Player();
     }
 }

 @Override
 public void play(String audioType, String fileName) {
     if (audioType.equalsIgnoreCase("vlc")) {
         advancedMediaPlayer.playVlc(fileName);
     } else if (audioType.equalsIgnoreCase("mp4")) {
         advancedMediaPlayer.playMp4(fileName);
     }
 }
}

//Client class
public class AdapterExample {
 public static void main(String[] args) {
     AudioPlayer audioPlayer = new AudioPlayer();

     audioPlayer.play("mp3", "beyond_the_horizon.mp3");
     audioPlayer.play("mp4", "alone.mp4");
     audioPlayer.play("vlc", "far_far_away.vlc");
     audioPlayer.play("avi", "mind_me.avi");
 }
}

//AudioPlayer class implementing MediaPlayer interface
class AudioPlayer implements MediaPlayer {
 MediaAdapter mediaAdapter;

 @Override
 public void play(String audioType, String fileName) {
     // Inbuilt support for mp3
     if (audioType.equalsIgnoreCase("mp3")) {
         System.out.println("Playing mp3 file. Name: " + fileName);
     }
     // MediaAdapter provides support for other formats
     else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
     } else {
         System.out.println("Invalid media. " + audioType + " format not supported");
     }
 }
}