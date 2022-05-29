import view.ChessGameFrame;
import view.Music;
import view.Music17;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        SwingUtilities.invokeLater(() -> {
            ChessGameFrame mainFrame = new ChessGameFrame(1000, 760);
            mainFrame.setVisible(true);
        });
        Music17 music=new Music17();
        music.playOpen();
       music.playStart();
    }
}
