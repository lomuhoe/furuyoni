package data;

import java.io.Serializable;

public class Card implements Serializable, Comparable<Card>{
    private int cardId;
    private String name;
    private String effect;
    private int cost;
    private int subType;

    public Card() {
        super();
    }
    public Card(int cardId, String name, String effect, int cost, int subType) {
        this.cardId = cardId;
        this.name = name;
        this.effect = effect;
        this.cost = cost;
        this.subType = subType;
    }

    //getter
    public int getCardId() {
        return cardId;
    }
    public String getName() {
        return name;
    }
    public int getSubType() {
        return subType;
    }
    public int getCost() {
        return cost;
    }
    public String getEffect() {
        return effect;
    }

    //setter
    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEffect(String effect) {
        this.effect = effect;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setSubType(int subType) {
        this.subType = subType;
    }

    @Override
    public String toString() {
        return "Card.toString()";
    }

    @Override
    public int compareTo(Card card) {
        return this.cardId - card.cardId;
    }
}
