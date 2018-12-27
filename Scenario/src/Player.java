public class Player extends Character {

    private String name;
    private int age;

    public Player (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean playerExists (){
        if(name.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
