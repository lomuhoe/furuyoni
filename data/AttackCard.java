package data;

public class AttackCard extends Card {
    private int minRange;
    private int maxRange;
    private int auraDamage;
    private int heartDamage;

    public AttackCard() {
        super();
    }
    public AttackCard(int cardId, String name, String effect, int cost, int subType, int minRange, int maxRange, int auraDamage, int heartDamage) {
        super(cardId, name, effect, cost, subType);
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.auraDamage = auraDamage;
        this.heartDamage = heartDamage;
    }

    //getter
    public int getMinRange() {
        return minRange;
    }
    public int getMaxRange() {
        return maxRange;
    }
    public int getAuraDamage() {
        return auraDamage;
    }
    public int getHeartDamage() {
        return heartDamage;
    }

    //setter
    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }
    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }
    public void setAuraDamage(int auraDamage) {
        this.auraDamage = auraDamage;
    }
    public void setHeartDamage(int heartDamage) {
        this.heartDamage = heartDamage;
    }

    @Override
    public String toString() {
        if(super.getCost()==-1)
            return String.format("%s, 효과 : %s, 사거리 : %d-%d, 데미지 : %d-%d", super.getName(), getEffect(), minRange, maxRange, auraDamage, heartDamage);
        else
            return String.format("%s, 코스트 : %d, 효과 : %s, 사거리 : %d-%d, 데미지 : %d-%d", super.getName(), super.getCost(), super.getEffect(), minRange, maxRange, auraDamage, heartDamage);
    }
}
