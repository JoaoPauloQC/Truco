package Cards;

import User.User;

public class Card {

    private int value;
    private String name;
    private int naipe;
    public User user;

    public void setUser(User user) {
        this.user = user;
    }

    public int getNaipe() {
        return naipe;
    }

    public void setNaipe(int naipe) {
        this.naipe = naipe;
    }

    public Card(int value, String name ){
        this.value = value;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
