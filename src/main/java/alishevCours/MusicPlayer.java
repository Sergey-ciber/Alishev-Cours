package alishevCours;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music music, List<Music> musicList){
        this.music = music;
        this.musicList = musicList;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) {
       this.music = music;
    }

    public void playMusic(){
        System.out.println(music.getSong());
    }

    public void playMusicList() {
        for(Music m : musicList) {
            System.out.println(m.getSong());
        }
    }
}
