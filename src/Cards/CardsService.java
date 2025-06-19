package Cards;

import User.User;

import java.util.ArrayList;
import java.util.List;

public class CardsService {

    public List<Card> cards = new ArrayList<>();

    public CardsService (){
        cards.add(new Four());
        cards.add(new Five());
        cards.add(new Six());
        cards.add(new Seven());
        cards.add(new Queen());
        cards.add(new Jay());
        cards.add(new King());
        cards.add(new Ace());
        cards.add(new Two());
        cards.add(new Three());
    }

}
