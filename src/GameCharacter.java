public class GameCharacter {
    private String name;
    private int hp;
    private int attackPower;


    public GameCharacter(String name, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void rest(){
 hp+= 10;
 System.out.println("rest & restores 10hp");   
 
    }
public abstract void attack();
public abstract String describeClass();

public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public int getHp(){
    return hp;
}
public void setHp(int hp ){
    if(hp>=0){
        this.hp = hp;
    }    
public int getAttackPower(){
    return attackPower;
}
public void setAttackPower(int attackPower){
    if(attackPower>=0){
        this.attackPower = attackPower;
    }

    
}
}


}

