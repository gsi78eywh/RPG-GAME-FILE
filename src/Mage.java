public class Mage {
    private String name;
    private int hp;
    private int attackPower;
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.mana = mana;
    }

    public void castSpell(GameCharacter target) {
        if (mana >= 20) {
            System.out.println(name + " casts a spell on " + target.getName() + " for " + attackPower + " damage!");
            target.setHp(target.getHp() - attackPower);
            mana -= 20;
        } else {
            System.out.println(name + " doesn't have enough mana to cast a spell.");
        }
    }

    public void rest() {
        hp += 10;
        mana += 30;
        System.out.println(name + " rests, restoring 10 HP and 30 Mana.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
        }
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        if (attackPower >= 0) {
            this.attackPower = attackPower;
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana >= 0) {
            this.mana = mana;
        }
    }

}
