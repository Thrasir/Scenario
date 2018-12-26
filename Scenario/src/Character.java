import javax.swing.*;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Character {
        private String name;
        private int age;
        private String [] dialogue;

        // Constructor
    public Character(){
    }
        public Character(String name, int age){
            this.name = name;
            this.age = age;
        }

    public String[] getDialogue() {
        return dialogue;
    }
    public void setDialogue(int stageNum){
            DialogueLoader loader = new DialogueLoader(name,stageNum);

}

}
