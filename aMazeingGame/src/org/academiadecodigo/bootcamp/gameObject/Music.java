package org.academiadecodigo.bootcamp.gameObject;

import org.academiadecodigo.bootcamp.game.Game;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by codecadet on 12/02/17.
 */
public class Music {
    public void startMusic() {
        String pathStr = "/Resources/Music/Retro1 140.wav";
        URL soundURL = Game.class.getResource(pathStr);
        AudioInputStream audioInputStream = null;
        try {
            if (soundURL == null) {
                // to load when running from intellij
                pathStr = pathStr.substring(1);
                File file = new File(pathStr);
                soundURL = file.toURI().toURL();
            }
            audioInputStream = AudioSystem.getAudioInputStream(soundURL);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(clip.LOOP_CONTINUOUSLY);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}