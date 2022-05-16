package data;

import java.io.Serializable;

public class Megami  implements Serializable, Comparable<Megami> {
    private int megamiId;
    private String name;
    private String effect;
    private Card[] cards;

    public Megami() {
        super();
    }
    public Megami(int megamiId, String name, String effect, Card[] cards) {
        this.megamiId = megamiId;
        this.name = name;
        this.effect = effect;
        this.cards = cards;
    }

    //getter
    public int getMegamiId() {
        return megamiId;
    }
    public String getName() {
        return name;
    }
    public String getEffect() {
        return effect;
    }
    public Card[] getCards() {
        return cards;
    }

    //setter
    public void setMegamiId(int megamiId) {
        this.megamiId = megamiId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEffect(String effect) {
        this.effect = effect;
    }
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return this.name + ", 키워드 : " + this.effect;
    }

    @Override
    public int compareTo(Megami megami) {
        return this.megamiId - megami.megamiId;
    }
}
