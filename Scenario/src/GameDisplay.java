import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GameDisplay extends JFrame {
    private TitlePanel titlePanel;
    private AnimationPanel animationPanel;
    private Game game;
    private JPanel contentPane;
    public Font gamefont;
    public Font titleFont;

    public GameDisplay(Game game) {
        super("Scenario");

        try {
            InputStream myStream = new BufferedInputStream(new FileInputStream("Omologo.ttf"));
            gamefont = Font.createFont(Font.TRUETYPE_FONT, myStream).deriveFont(14f);
            titleFont = gamefont.deriveFont(16f);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        this.game = game;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel(null);
        this.setContentPane(contentPane);
        addContentsToPane(this);
        this.setSize(1024, 720);
        this.setVisible(true);

    }

    private void addContentsToPane(GameDisplay display) {
        titlePanel = new TitlePanel(titleFont);
        animationPanel = new AnimationPanel(gamefont);

    }

    public Game getGame() {
        return game;
    }

    public TitlePanel getTitlePanel() {
        return titlePanel;
    }

    public AnimationPanel getAnimationPanel() {
        return animationPanel;
    }
}
