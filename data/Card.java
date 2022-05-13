package data;

import java.io.Serializable;

public class Card implements Serializable, Comparable<Card>{
    private int cardId;
    private String name;
    private String effect;
    private int subType;

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
    public void setSubType(int subType) {
        this.subType = subType;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public int compareTo(Card card) {
        
        return 0;
    }
}
