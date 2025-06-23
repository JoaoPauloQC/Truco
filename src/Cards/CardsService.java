package Cards;

import User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardsService {

    public List<Card> cards = new ArrayList<>();
    public  List<Card> allcards = new ArrayList<>();
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

    // public void generateallcards(){
        //for (Card card : cards){
          //  for (int i = 1; i < 5; i++){
            //    Card cardtobeadd = card;
              //  cardtobeadd.setNaipe(i);
                //allcards.add(cardtobeadd);
            //}


        //}
    //}

    public Card getRandomCard(){
        Random random = new Random();


        return cards.get(random.nextInt(7));
    }

}
