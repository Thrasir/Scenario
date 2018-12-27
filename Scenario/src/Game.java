import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;


import java.awt.*;
import java.io.IOException;

public class Game extends JFrame {
    boolean gamemode;
    final public int HEIGHT = 720;
    final public int WIDTH = 1024;
    public Font titleFont;
    JFrame gameWindow;
    TitlePanel titleScreen;
    GameDisplay display;
    AnimationPanel animationPanel;
    public String playerName;
    public static void main(String[] args) {
        new Game();
    }
    public Game (){
        this.display = new GameDisplay(this);
        gameWindow = new JFrame("");
        gameWindow.setSize(WIDTH, HEIGHT);
        gameWindow.setResizable(false);
        gameWindow.setUndecorated(false);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // gameWindow.setLayout(null);

        titleScreen = new TitlePanel(titleFont);
        gameWindow.add(titleScreen);
        gameWindow.setVisible(true);
        while(playerName==null){
            System.out.println(playerName);
            titleScreen.getPlayerName();
        }
        gameWindow.remove(titleScreen);
    }
    public void setPlayerName(String name){
        this.playerName = name;
    }
    }

