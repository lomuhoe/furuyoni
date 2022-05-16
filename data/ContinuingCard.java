package data;

public class ContinuingCard extends Card {
    private int holdTime;

    public ContinuingCard() {
        super();
    }
    public ContinuingCard(int cardId, String name, String effect, int cost, int subType, int holdTime) {
        super(cardId, name, effect, cost, subType);
        this.holdTime = holdTime;
    }

    //getter
    public int getHoldTime() {
        return holdTime;
    }

    //setter
    public void setHoldTime(int holdTime) {
        this.holdTime = holdTime;
    }

    @Override
    public String toString() {
        if(super.getCost()==-1)
            return String.format("%s, 효과 : %s, 납 : %d", super.getName(), super.getEffect(), holdTime);
        else
            return String.format("%s, 코스트 : %d, 효과 : %s, 납 : %d", super.getName(), super.getCost(), super.getEffect(), holdTime);
    }
}
