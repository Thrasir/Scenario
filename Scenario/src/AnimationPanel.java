import javafx.animation.Animation;

import javax.swing.*;
import java.awt.*;

public class AnimationPanel extends JPanel {

    public AnimationPanel(Font font){
        JTextArea test = new JTextArea();
        JLabel label = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("ScenarioTitle.jpg"))));
        test.setFont(font);
        this.add(label);
        this.add(test);
    }
}
