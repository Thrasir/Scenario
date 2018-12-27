import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TitlePanel extends JPanel {
    private Font titleFont;
    private String playerName;

    public TitlePanel(Font font) {
        this.titleFont = font;
        this.setPreferredSize(new Dimension(1024,720));
        JLabel background = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("ScenarioTitle.jpg"))));
        background.setLayout(null);
        JButton startButton = new JButton("New Game");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(font);
        startButton.setSize(new Dimension(200,40));
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popUp();
            }
        });
        startButton.setFocusPainted(false);
        background.add(startButton);
        startButton.setLocation(412,510);
        this.add(background);
        if(getPlayerName()!=null){
            this.removeAll();
        }

    }

    private void popUp(){
        JFrame enterName = new JFrame();
        enterName.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Enter your name (max 10 characters):");
        label.setFont(titleFont);
        enterName.setLocationRelativeTo(null);
        try {
            enterName.setFont(titleFont);
            String name = JOptionPane.showInputDialog(enterName, label, "Introduce yourself", JOptionPane.PLAIN_MESSAGE);
            while (name.isEmpty()) {
                JLabel anotherLabel = new JLabel("Please Enter your name:");
                anotherLabel.setFont(titleFont);
                name = JOptionPane.showInputDialog(enterName, anotherLabel, "Introduce yourself", JOptionPane.PLAIN_MESSAGE);
            }
            if(!(name.isEmpty())) {
                setPlayerName(name);
                System.out.println("a name yaaay: "+ name);
            }
            this.validate();
            this.repaint();
        }catch (Exception e){
            System.out.println("stupid ass problem");
        }

    }
    public void setPlayerName(String player){
        this.playerName = player;
    }
    public String getPlayerName(){
        return this.playerName;
    }


}
