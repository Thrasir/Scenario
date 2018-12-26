import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCharacter extends Character {
    private String fileName;
    private ImageIcon imageIcon;
    private BufferedImage image;

    // Constructor
    public GameCharacter(String fileName) {
        this.fileName = fileName;
        this.imageIcon = new ImageIcon(fileName);
    }

    public Image getImage() {
        return image;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}

