import javax.swing.*;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

import java.awt.*;
import java.io.IOException;

public class Game extends JFrame {
    public boolean gamemode;
    static final public int HEIGHT = 720;
    static final public int WIDTH = 1024;
    static Font gamefont;
    static public JFrame gameWindow;

    public static void main(String[] args) {
        gameWindow = new JFrame("");
        gameWindow.setSize(WIDTH, HEIGHT);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            InputStream myStream = new BufferedInputStream(new FileInputStream("Omologo.ttf"));
            gamefont = Font.createFont(Font.TRUETYPE_FONT, myStream).deriveFont(14f);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        JPanel panel = new JPanel();
        JLabel test = new JLabel("Some stuffs");
        test.setFont(gamefont);
        panel.add(test);
        gameWindow.add(panel);
        panel.setVisible(true);
        gameWindow.setVisible(true);

    }
}
