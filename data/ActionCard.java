package data;

public class ActionCard extends Card {
    public ActionCard() {
        super();
    }
    public ActionCard(int cardId, String name, String effect, int cost, int subType) {
        super(cardId, name, effect, cost, subType);
    }

    @Override
    public String toString() {
        if(super.getCost() == -1)
            return String.format("%s, 효과 : %s", super.getName(), super.getEffect());
        else
            return String.format("%s, 코스트 : %d, 효과 : %s", super.getName(), super.getCost(), super.getEffect());
    }
}
