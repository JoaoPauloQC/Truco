package Hand;

import Cards.Card;
import Cards.CardsService;
import Cards.Four;
import User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyHand {
    Random random = new Random();
    private User user;



    public MyHand(User user){
        this.user = user;

    }


    public List<Card> hand = new ArrayList<>();

    public CardsService cardsService = new CardsService();

    public void addcards(){
        for(int i = 0 ; i < 3 ; i++) {
            hand.add(cardsService.cards.get(random.nextInt(6)));
            hand.get(i).setUser(user);
        }
    }

    public void printHand(){
        System.out.println(hand);
    }

}
