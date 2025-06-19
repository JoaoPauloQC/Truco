package Table;

import Cards.Card;

import java.util.ArrayList;
import java.util.List;

public class Table {





    List<Card> tablecards = new ArrayList<>();

    public void addCardOnTable(Card card){
        tablecards.add(card);
    }

    public void showTable(){
        System.out.println(tablecards);
    }

    public List<Card> getTablecards() {
        return tablecards;
    }
}
